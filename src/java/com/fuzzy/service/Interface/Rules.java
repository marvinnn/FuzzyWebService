/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service.Interface;

import java.util.List;

/**
 *
 * @author Marvin Zeson
 */
public interface Rules {
    public List<Double> calculate(List<Double> tf, List<Double> idf, List<Double> n);
    public List<Double> zValue(List<Double> ruleResult);
    public List<Double> calculateSecond(List<Double> wd, List<Double> wq);
    public List<Double> zValueSecond(List<Double> ruleResult);
}
