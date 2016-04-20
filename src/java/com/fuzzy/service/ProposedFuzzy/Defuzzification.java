/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service.ProposedFuzzy;

import java.util.List;

/**
 *
 * @author Marvin Zeson
 */
public class Defuzzification {
    public Double calculate(List<Double> ruleResult, List<Double> zValue){
        double enumerator = (ruleResult.get(0) * zValue.get(0)) + (ruleResult.get(1) * zValue.get(1)) + (ruleResult.get(1) * zValue.get(2)) + (ruleResult.get(2) * zValue.get(3));
        double denominator = ruleResult.get(0) + (2 * ruleResult.get(1)) + ruleResult.get(2);
        if (denominator == 0){
            return 0.0;
        }
        return enumerator/denominator;
    }
    
    public Double calculateFirstLevel(List<Double> ruleResult, List<Double> zValue){
        double enumerator = 0;
        double denominator = 0;
        for(int i = 0;i<ruleResult.size();i++){
            enumerator += ruleResult.get(i) * zValue.get(i);
            denominator += ruleResult.get(i);
        }
        if (denominator == 0){
            return 0.0;
        }
        return enumerator/denominator;
    }
}
