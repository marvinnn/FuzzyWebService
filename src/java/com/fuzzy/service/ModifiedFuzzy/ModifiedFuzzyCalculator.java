/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service.ModifiedFuzzy;

/**
 *
 * @author Marvin Zeson
 */
import com.fuzzy.service.Interface.Calculator;
import java.util.ArrayList;
import java.util.List;

public class ModifiedFuzzyCalculator implements Calculator{

    public double tf(List<String> doc, String term) {
        double result = 0;
        for (String word : doc) {
            if (term.equalsIgnoreCase(word)) {
                result++;
            }
        }
        return result / doc.size();
    }
    
    public List<Double> tfDocFuzzification(double tf){
        TfDocMembershipFunction mf = new TfDocMembershipFunction();
        List<Double> fuzzyClass = new ArrayList<>();
        fuzzyClass.add(mf.veryLow(tf));
        fuzzyClass.add(mf.low(tf));
        fuzzyClass.add(mf.medium(tf));
        fuzzyClass.add(mf.high(tf));
        fuzzyClass.add(mf.veryHigh(tf));
        return fuzzyClass;
    }
    
    public List<Double> tfQueFuzzification(double tf){
        TfQueMembershipFunction mf = new TfQueMembershipFunction();
        List<Double> fuzzyClass = new ArrayList<>();
        fuzzyClass.add(mf.veryLow(tf));
        fuzzyClass.add(mf.low(tf));
        fuzzyClass.add(mf.medium(tf));
        fuzzyClass.add(mf.high(tf));
        fuzzyClass.add(mf.veryHigh(tf));
        return fuzzyClass;
    }
    
    public List<Double> idfFuzzification(double idf){
        IdfMembershipFunction mf = new IdfMembershipFunction();
        List<Double> fuzzyClass = new ArrayList<>();
        fuzzyClass.add(mf.veryLow(idf));
        fuzzyClass.add(mf.low(idf));
        fuzzyClass.add(mf.medium(idf));
        fuzzyClass.add(mf.high(idf));
        fuzzyClass.add(mf.veryHigh(idf));
        return fuzzyClass;
    }
    
    public List<Double> nQueFuzzification(double n){
        NQueMembershipFunction mf = new NQueMembershipFunction();
        List<Double> fuzzyClass = new ArrayList<>();
        fuzzyClass.add(mf.veryLow(n));
        fuzzyClass.add(mf.low(n));
        fuzzyClass.add(mf.medium(n));
        fuzzyClass.add(mf.high(n));
        fuzzyClass.add(mf.veryHigh(n));
        return fuzzyClass;
    }
    
    public List<Double> nDocFuzzification(double n){
        NDocMembershipFunction mf = new NDocMembershipFunction();
        List<Double> fuzzyClass = new ArrayList<>();
        fuzzyClass.add(mf.veryLow(n));
        fuzzyClass.add(mf.low(n));
        fuzzyClass.add(mf.medium(n));
        fuzzyClass.add(mf.high(n));
        fuzzyClass.add(mf.veryHigh(n));
        return fuzzyClass;
    }
    
    public List<Double> wFuzzification(double w){
        WMembershipFunction wf = new WMembershipFunction();
        List<Double> fuzzyClass = new ArrayList<>();
        fuzzyClass.add(wf.low(w));
        fuzzyClass.add(wf.medium(w));
        fuzzyClass.add(wf.high(w));
        return fuzzyClass;
    }

    public List<Double> fuzzyResult(List<Double> tf, List<Double> idf, List<Double> n){
        FuzzyRules fr = new FuzzyRules();
        return fr.calculate(tf, idf, n);
    }
    
    public List<Double> fuzzyResultTry(List<Double> tf, List<Double> idf){
        FuzzyRules fr = new FuzzyRules();
        return fr.calculateTry(tf, idf);
    }
    
    public List<Double> fuzzyResultSecond(List<Double> wd, List<Double> wq){
        FuzzyRules fr = new FuzzyRules();
        return fr. calculateSecond(wd, wq);
    }
    
    public List<Double> getZValueSecond(List<Double> ruleResult){
        FuzzyRules fr = new FuzzyRules();
        return fr.zValueSecond(ruleResult);
    }
    
    public List<Double> getZValue(List<Double> ruleResult){
        FuzzyRules fr = new FuzzyRules();
        return fr.zValue(ruleResult);
    }
    
    public Double defuzzification(List<Double> ruleResult, List<Double> zValue){
        Defuzzification defuze = new Defuzzification();
        return defuze.calculateFirstLevel(ruleResult, zValue);
    }
    
    public double idf(List<List<String>> docs, String term) {
        double n = 0;
        for (List<String> doc : docs) {
            for (String word : doc) {
                if (term.equalsIgnoreCase(word)) {
                    n++;
                    break;
                }
            }
        }
        if (n != 0) {
            return Math.log(docs.size() / n);
        } else {
            return 2.8;
        }
    }
    
    public double documentNorm(List<String> doc){
        return 1/Math.sqrt(doc.size());
    }

    public double calculate(List<String> doc, List<List<String>> docs, String term, List<String> que) {
        //return tf(doc, term) * idf(docs, term);
        double tfDoc = tf(doc, term);
        double tfQue = tf(que, term);
        double idf = idf(docs, term);
        if(tfDoc == 0.0){
            return 0;
        }
        double nDoc = documentNorm(doc);
        double nQue = documentNorm(que);
        List<Double> tfDocM = tfDocFuzzification(tfDoc);
        List<Double> tfQueM = tfQueFuzzification(tfQue);
        List<Double> idfM = idfFuzzification(idf);
        List<Double> nDocM = nDocFuzzification(nDoc);
        List<Double> nQueM = nQueFuzzification(nQue);
        
        List<Double> fuzzyDocRule = fuzzyResult(tfDocM, idfM, nDocM);
        //List<Double> fuzzyDocRule = fuzzyResultTry(tfDocM, idfM);
        List<Double> docZValue = getZValue(fuzzyDocRule);
        double docResult = defuzzification(fuzzyDocRule, docZValue);
        
        List<Double> fuzzyQueRule = fuzzyResult(tfQueM, idfM, nQueM);
        //List<Double> fuzzyQueRule = fuzzyResultTry(tfQueM, idfM);
        List<Double> queZValue = getZValue(fuzzyQueRule);
        double queResult = defuzzification(fuzzyQueRule, queZValue);
        
        List<Double> wDocM = wFuzzification(docResult);
        List<Double> wQueM = wFuzzification(queResult);
        
        List<Double> fuzzyScoreRule = fuzzyResultSecond(wDocM, wQueM);
        List<Double> scoreZValue = getZValueSecond(fuzzyScoreRule);
        double scoreResult = defuzzification(fuzzyScoreRule, scoreZValue);
        
        return scoreResult;
    }
}
