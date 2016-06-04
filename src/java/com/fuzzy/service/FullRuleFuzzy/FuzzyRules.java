/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service.FullRuleFuzzy;

import com.fuzzy.service.ModifiedFuzzy.*;
import com.fuzzy.service.Interface.Rules;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marvin Zeson
 */
public class FuzzyRules implements Rules{
    @Override
    public List<Double> calculate(List<Double> tf, List<Double> idf, List<Double> n){
        List<Double> result = new ArrayList<>();
        result.add(Math.min(tf.get(0),Math.min(idf.get(0), n.get(0))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(0), n.get(1))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(0), n.get(2))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(0), n.get(3))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(0), n.get(4))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(1), n.get(0))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(1), n.get(1))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(1), n.get(2))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(1), n.get(3))));//low
        result.add(Math.min(tf.get(0),Math.min(idf.get(1), n.get(4))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(2), n.get(0))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(2), n.get(1))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(2), n.get(2))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(2), n.get(3))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(2), n.get(4))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(3), n.get(0))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(3), n.get(1))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(3), n.get(2))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(3), n.get(3))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(3), n.get(4))));//high
        result.add(Math.min(tf.get(0),Math.min(idf.get(4), n.get(0))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(4), n.get(1))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(4), n.get(2))));//medium
        result.add(Math.min(tf.get(0),Math.min(idf.get(4), n.get(3))));//high
        result.add(Math.min(tf.get(0),Math.min(idf.get(4), n.get(4))));//high
        
        result.add(Math.min(tf.get(1),Math.min(idf.get(0), n.get(0))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(0), n.get(1))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(0), n.get(2))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(0), n.get(3))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(0), n.get(4))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(1), n.get(0))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(1), n.get(1))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(1), n.get(2))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(1), n.get(3))));//low
        result.add(Math.min(tf.get(1),Math.min(idf.get(1), n.get(4))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(2), n.get(0))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(2), n.get(1))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(2), n.get(2))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(2), n.get(3))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(2), n.get(4))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(3), n.get(0))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(3), n.get(1))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(3), n.get(2))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(3), n.get(3))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(3), n.get(4))));//high
        result.add(Math.min(tf.get(1),Math.min(idf.get(4), n.get(0))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(4), n.get(1))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(4), n.get(2))));//medium
        result.add(Math.min(tf.get(1),Math.min(idf.get(4), n.get(3))));//high
        result.add(Math.min(tf.get(1),Math.min(idf.get(4), n.get(4))));//high
        
        result.add(Math.min(tf.get(2),Math.min(idf.get(0), n.get(0))));//low
        result.add(Math.min(tf.get(2),Math.min(idf.get(0), n.get(1))));//low
        result.add(Math.min(tf.get(2),Math.min(idf.get(0), n.get(2))));//low
        result.add(Math.min(tf.get(2),Math.min(idf.get(0), n.get(3))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(0), n.get(4))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(1), n.get(0))));//low
        result.add(Math.min(tf.get(2),Math.min(idf.get(1), n.get(1))));//low
        result.add(Math.min(tf.get(2),Math.min(idf.get(1), n.get(2))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(1), n.get(3))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(1), n.get(4))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(2), n.get(0))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(2), n.get(1))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(2), n.get(2))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(2), n.get(3))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(2), n.get(4))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(3), n.get(0))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(3), n.get(1))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(3), n.get(2))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(3), n.get(3))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(3), n.get(4))));//high
        result.add(Math.min(tf.get(2),Math.min(idf.get(4), n.get(0))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(4), n.get(1))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(4), n.get(2))));//medium
        result.add(Math.min(tf.get(2),Math.min(idf.get(4), n.get(3))));//high
        result.add(Math.min(tf.get(2),Math.min(idf.get(4), n.get(4))));//high
        
        result.add(Math.min(tf.get(3),Math.min(idf.get(0), n.get(0))));//low
        result.add(Math.min(tf.get(3),Math.min(idf.get(0), n.get(1))));//low
        result.add(Math.min(tf.get(3),Math.min(idf.get(0), n.get(2))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(0), n.get(3))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(0), n.get(4))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(1), n.get(0))));//low
        result.add(Math.min(tf.get(3),Math.min(idf.get(1), n.get(1))));//low
        result.add(Math.min(tf.get(3),Math.min(idf.get(1), n.get(2))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(1), n.get(3))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(1), n.get(4))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(2), n.get(0))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(2), n.get(1))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(2), n.get(2))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(2), n.get(3))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(2), n.get(4))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(3), n.get(0))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(3), n.get(1))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(3), n.get(2))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(3), n.get(3))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(3), n.get(4))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(4), n.get(0))));//medium
        result.add(Math.min(tf.get(3),Math.min(idf.get(4), n.get(1))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(4), n.get(2))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(4), n.get(3))));//high
        result.add(Math.min(tf.get(3),Math.min(idf.get(4), n.get(4))));//high
        
        result.add(Math.min(tf.get(4),Math.min(idf.get(0), n.get(0))));//low
        result.add(Math.min(tf.get(4),Math.min(idf.get(0), n.get(1))));//low
        result.add(Math.min(tf.get(4),Math.min(idf.get(0), n.get(2))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(0), n.get(3))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(0), n.get(4))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(1), n.get(0))));//low
        result.add(Math.min(tf.get(4),Math.min(idf.get(1), n.get(1))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(1), n.get(2))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(1), n.get(3))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(1), n.get(4))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(2), n.get(0))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(2), n.get(1))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(2), n.get(2))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(2), n.get(3))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(2), n.get(4))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(3), n.get(0))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(3), n.get(1))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(3), n.get(2))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(3), n.get(3))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(3), n.get(4))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(4), n.get(0))));//medium
        result.add(Math.min(tf.get(4),Math.min(idf.get(4), n.get(1))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(4), n.get(2))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(4), n.get(3))));//high
        result.add(Math.min(tf.get(4),Math.min(idf.get(4), n.get(4))));//high
        return result;
    }
    
    @Override
    public List<Double> zValue(List<Double> ruleResult){
        List<Double> result = new ArrayList<>();
        result.add(0.4 - 0.4 * ruleResult.get(0));
        result.add(0.4 - 0.4 * ruleResult.get(1));
        result.add(0.4 - 0.4 * ruleResult.get(2));
        result.add(0.4 - 0.4 * ruleResult.get(3));
        result.add(0.25 + 0.25 * ruleResult.get(4));
        result.add(0.4 - 0.4 * ruleResult.get(5));
        result.add(0.4 - 0.4 * ruleResult.get(6));
        result.add(0.4 - 0.4 * ruleResult.get(7));
        result.add(0.4 - 0.4 * ruleResult.get(8));
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
        result.add(0.6 + 0.4 * ruleResult.get(19));
        result.add(0.25 + 0.25 * ruleResult.get(20));
        result.add(0.25 + 0.25 * ruleResult.get(21));
        result.add(0.25 + 0.25 * ruleResult.get(22));
        result.add(0.6 + 0.4 * ruleResult.get(23));
        result.add(0.6 + 0.4 * ruleResult.get(24));
        
        result.add(0.4 - 0.4 * ruleResult.get(25));
        result.add(0.4 - 0.4 * ruleResult.get(26));
        result.add(0.4 - 0.4 * ruleResult.get(27));
        result.add(0.4 - 0.4 * ruleResult.get(28));
        result.add(0.25 + 0.25 * ruleResult.get(29));
        result.add(0.4 - 0.4 * ruleResult.get(30));
        result.add(0.4 - 0.4 * ruleResult.get(31));
        result.add(0.4 - 0.4 * ruleResult.get(32));
        result.add(0.4 - 0.4 * ruleResult.get(33));
        result.add(0.25 + 0.25 * ruleResult.get(34));
        result.add(0.25 + 0.25 * ruleResult.get(35));
        result.add(0.25 + 0.25 * ruleResult.get(36));
        result.add(0.25 + 0.25 * ruleResult.get(37));
        result.add(0.25 + 0.25 * ruleResult.get(38));
        result.add(0.25 + 0.25 * ruleResult.get(39));
        result.add(0.25 + 0.25 * ruleResult.get(40));
        result.add(0.25 + 0.25 * ruleResult.get(41));
        result.add(0.25 + 0.25 * ruleResult.get(42));
        result.add(0.25 + 0.25 * ruleResult.get(43));
        result.add(0.6 + 0.4 * ruleResult.get(44));
        result.add(0.25 + 0.25 * ruleResult.get(45));
        result.add(0.25 + 0.25 * ruleResult.get(46));
        result.add(0.25 + 0.25 * ruleResult.get(47));
        result.add(0.6 + 0.4 * ruleResult.get(48));
        result.add(0.6 + 0.4 * ruleResult.get(49));
        
        result.add(0.4 - 0.4 * ruleResult.get(50));
        result.add(0.4 - 0.4 * ruleResult.get(51));
        result.add(0.4 - 0.4 * ruleResult.get(52));
        result.add(0.25 + 0.25 * ruleResult.get(53));
        result.add(0.25 + 0.25 * ruleResult.get(54));
        result.add(0.4 - 0.4 * ruleResult.get(55));
        result.add(0.4 - 0.4 * ruleResult.get(56));
        result.add(0.25 + 0.25 * ruleResult.get(57));
        result.add(0.25 + 0.25 * ruleResult.get(58));
        result.add(0.25 + 0.25 * ruleResult.get(59));
        result.add(0.25 + 0.25 * ruleResult.get(60));
        result.add(0.25 + 0.25 * ruleResult.get(61));
        result.add(0.25 + 0.25 * ruleResult.get(62));
        result.add(0.25 + 0.25 * ruleResult.get(63));
        result.add(0.25 + 0.25 * ruleResult.get(64));
        result.add(0.25 + 0.25 * ruleResult.get(65));
        result.add(0.25 + 0.25 * ruleResult.get(66));
        result.add(0.25 + 0.25 * ruleResult.get(67));
        result.add(0.25 + 0.25 * ruleResult.get(68));
        result.add(0.6 + 0.4 * ruleResult.get(69));
        result.add(0.25 + 0.25 * ruleResult.get(70));
        result.add(0.25 + 0.25 * ruleResult.get(71));
        result.add(0.25 + 0.25 * ruleResult.get(72));
        result.add(0.6 + 0.4 * ruleResult.get(73));
        result.add(0.6 + 0.4 * ruleResult.get(74));
        
        result.add(0.4 - 0.4 * ruleResult.get(75));
        result.add(0.4 - 0.4 * ruleResult.get(76));
        result.add(0.25 + 0.25 * ruleResult.get(77));
        result.add(0.25 + 0.25 * ruleResult.get(78));
        result.add(0.25 + 0.25 * ruleResult.get(79));
        result.add(0.4 - 0.4 * ruleResult.get(80));
        result.add(0.4 - 0.4 * ruleResult.get(81));
        result.add(0.25 + 0.25 * ruleResult.get(82));
        result.add(0.25 + 0.25 * ruleResult.get(83));
        result.add(0.6 + 0.4 * ruleResult.get(84));
        result.add(0.25 + 0.25 * ruleResult.get(85));
        result.add(0.25 + 0.25 * ruleResult.get(86));
        result.add(0.25 + 0.25 * ruleResult.get(87));
        result.add(0.6 + 0.4 * ruleResult.get(88));
        result.add(0.6 + 0.4 * ruleResult.get(89));
        result.add(0.25 + 0.25 * ruleResult.get(90));
        result.add(0.25 + 0.25 * ruleResult.get(91));
        result.add(0.6 + 0.4 * ruleResult.get(92));
        result.add(0.6 + 0.4 * ruleResult.get(93));
        result.add(0.6 + 0.4 * ruleResult.get(94));
        result.add(0.25 + 0.25 * ruleResult.get(95));
        result.add(0.6 + 0.4 * ruleResult.get(96));
        result.add(0.6 + 0.4 * ruleResult.get(97));
        result.add(0.6 + 0.4 * ruleResult.get(98));
        result.add(0.6 + 0.4 * ruleResult.get(99));
        
        result.add(0.4 - 0.4 * ruleResult.get(100));
        result.add(0.4 - 0.4 * ruleResult.get(101));
        result.add(0.25 + 0.25 * ruleResult.get(102));
        result.add(0.25 + 0.25 * ruleResult.get(103));
        result.add(0.25 + 0.25 * ruleResult.get(104));
        result.add(0.4 - 0.4 * ruleResult.get(105));
        result.add(0.25 + 0.25 * ruleResult.get(106));
        result.add(0.25 + 0.25 * ruleResult.get(107));
        result.add(0.25 + 0.25 * ruleResult.get(108));
        result.add(0.6 + 0.4 * ruleResult.get(109));
        result.add(0.25 + 0.25 * ruleResult.get(110));
        result.add(0.25 + 0.25 * ruleResult.get(111));
        result.add(0.25 + 0.25 * ruleResult.get(112));
        result.add(0.6 + 0.4 * ruleResult.get(113));
        result.add(0.6 + 0.4 * ruleResult.get(114));
        result.add(0.25 + 0.25 * ruleResult.get(115));
        result.add(0.6 + 0.4 * ruleResult.get(116));
        result.add(0.6 + 0.4 * ruleResult.get(117));
        result.add(0.6 + 0.4 * ruleResult.get(118));
        result.add(0.6 + 0.4 * ruleResult.get(119));
        result.add(0.25 + 0.25 * ruleResult.get(120));
        result.add(0.6 + 0.4 * ruleResult.get(121));
        result.add(0.6 + 0.4 * ruleResult.get(122));
        result.add(0.6 + 0.4 * ruleResult.get(123));
        result.add(0.6 + 0.4 * ruleResult.get(124));
        return result;
    }
    
    @Override
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
    
    @Override
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
