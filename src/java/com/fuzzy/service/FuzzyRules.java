/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marvin Zeson
 */
public class FuzzyRules {
    public List<Double> calculate(List<Double> tf, List<Double> idf, List<Double> n){
        List<Double> result = new ArrayList<>();
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(Math.max(idf.get(0), idf.get(1)), Math.max(n.get(0), n.get(1)))));//Low
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(Math.max(idf.get(0), idf.get(1)), n.get(2))));//Low
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(Math.max(idf.get(0), idf.get(1)), Math.max(n.get(3), n.get(4)))));//Low
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(idf.get(2), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(idf.get(2), n.get(2))));//Medium
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(idf.get(2), Math.max(n.get(3), n.get(4)))));//Medium
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(Math.max(idf.get(3), idf.get(4)), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(Math.max(idf.get(3), idf.get(4)), n.get(2))));//Medium
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.min(Math.max(idf.get(3), idf.get(4)), Math.max(n.get(3), n.get(4)))));//Medium
        
        result.add(Math.min(tf.get(2), Math.min(Math.max(idf.get(0), idf.get(1)), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(tf.get(2), Math.min(Math.max(idf.get(0), idf.get(1)), n.get(2))));//Medium
        result.add(Math.min(tf.get(2), Math.min(Math.max(idf.get(0), idf.get(1)), Math.max(n.get(3), n.get(4)))));//Medium
        result.add(Math.min(tf.get(2), Math.min(idf.get(2), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(tf.get(2), Math.min(idf.get(2), n.get(2))));//Medium
        result.add(Math.min(tf.get(2), Math.min(idf.get(2), Math.max(n.get(3), n.get(4)))));//Medium
        result.add(Math.min(tf.get(2), Math.min(Math.max(idf.get(3), idf.get(4)), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(tf.get(2), Math.min(Math.max(idf.get(3), idf.get(4)), n.get(2))));//Medium
        result.add(Math.min(tf.get(2), Math.min(Math.max(idf.get(3), idf.get(4)), Math.max(n.get(3), n.get(4)))));//Medium
        
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(Math.max(idf.get(0), idf.get(1)), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(Math.max(idf.get(0), idf.get(1)), n.get(2))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(Math.max(idf.get(0), idf.get(1)), Math.max(n.get(3), n.get(4)))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(idf.get(2), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(idf.get(2), n.get(2))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(idf.get(2), Math.max(n.get(3), n.get(4)))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(Math.max(idf.get(3), idf.get(4)), Math.max(n.get(0), n.get(1)))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(Math.max(idf.get(3), idf.get(4)), n.get(2))));//Medium
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.min(Math.max(idf.get(3), idf.get(4)), Math.max(n.get(3), n.get(4)))));//High
        
        return result;
    }
    
    public List<Double> zValue(List<Double> ruleResult){
        List<Double> result = new ArrayList<>();
        result.add(0.4 - 0.4 * ruleResult.get(0));
        result.add(0.4 - 0.4 * ruleResult.get(1));
        result.add(0.4 - 0.4 * ruleResult.get(2));
        result.add(0.25 + 0.25 * ruleResult.get(3));
        result.add(0.25 + 0.25 * ruleResult.get(4));
        result.add(0.25 + 0.25 * ruleResult.get(5));
        result.add(0.25 + 0.25 * ruleResult.get(6));
        result.add(0.25 + 0.25 * ruleResult.get(7));
        result.add(0.25 + 0.25 * ruleResult.get(8));
        
        result.add(0.25 + 0.25 * ruleResult.get(9));
        result.add(0.25 + 0.25 * ruleResult.get(10));
        result.add(0.25 + 0.25 * ruleResult.get(11));
        result.add(0.25 + 0.25 * ruleResult.get(12));
        result.add(0.25 + 0.25 * ruleResult.get(13));
        result.add(0.25 + 0.25 * ruleResult.get(14));
        result.add(0.25 + 0.25 * ruleResult.get(15));
        result.add(0.25 + 0.25 * ruleResult.get(16));
        result.add(0.25 + 0.25 * ruleResult.get(17));
        
        result.add(0.25 + 0.25 * ruleResult.get(18));
        result.add(0.25 + 0.25 * ruleResult.get(19));
        result.add(0.25 + 0.25 * ruleResult.get(20));
        result.add(0.25 + 0.25 * ruleResult.get(21));
        result.add(0.25 + 0.25 * ruleResult.get(22));
        result.add(0.25 + 0.25 * ruleResult.get(23));
        result.add(0.25 + 0.25 * ruleResult.get(24));
        result.add(0.25 + 0.25 * ruleResult.get(25));
        result.add(0.6 + 0.4 * ruleResult.get(26));
        
        return result;
    }
    
    public List<Double> calculateSecond(List<Double> wd, List<Double> wq){
        List<Double> result = new ArrayList<>();
        result.add(Math.min(wd.get(0), wq.get(0)));//Low
        result.add(Math.min(wd.get(0), wq.get(1)));//Low
        result.add(Math.min(wd.get(0), wq.get(2)));//Medium
        result.add(Math.min(wd.get(1), wq.get(0)));//Low
        result.add(Math.min(wd.get(1), wq.get(1)));//Medium
        result.add(Math.min(wd.get(1), wq.get(2)));//Medium
        result.add(Math.min(wd.get(2), wq.get(0)));//Medium
        result.add(Math.min(wd.get(2), wq.get(1)));//Medium
        result.add(Math.min(wd.get(2), wq.get(2)));//High
        return result;
    }
    
    public List<Double> zValueSecond(List<Double> ruleResult){
        List<Double> result = new ArrayList<>();
        result.add(0.3 - 0.3 * ruleResult.get(0));
        result.add(0.3 - 0.3 * ruleResult.get(1));
        result.add(0.2 + 0.2 * ruleResult.get(2));
        result.add(0.3 - 0.3 * ruleResult.get(3));
        result.add(0.2 + 0.2 * ruleResult.get(4));
        result.add(0.2 + 0.2 * ruleResult.get(5));
        result.add(0.2 + 0.2 * ruleResult.get(6));
        result.add(0.2 + 0.2 * ruleResult.get(7));
        result.add(0.5 + 0.5 * ruleResult.get(8));
        return result;
    }
    
    public List<Double> calculateTry(List<Double> tf, List<Double> idf){
        List<Double> result = new ArrayList<>();
        result.add(Math.min(Math.max(tf.get(0), tf.get(1)), Math.max(idf.get(0), idf.get(1))));
        result.add(Math.min(tf.get(2), idf.get(2)));
        result.add(Math.min(Math.max(tf.get(3), tf.get(4)), Math.max(idf.get(3), idf.get(4))));
        return result;
    }
}
