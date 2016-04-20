/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service.ProposedFuzzy;

import com.fuzzy.service.Interface.MembershipFunctionFirstLevel;

/**
 *
 * @author Marvin Zeson
 */
public class TfMembershipFunction implements MembershipFunctionFirstLevel{
    @Override
    public double veryLow(double tf){
        if(tf >= 0.1)
        {
            return 0;
        }
        else if(tf > 0 && tf < 0.1){
            return (0.1 - tf)/0.1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double low(double tf){
        if(tf <= 0.05 || tf >= 0.45){
            return 0;
        }
        else if(tf > 0.05 && tf <= 0.25){
            return (tf-0.05)/0.2;
        }
        else if(tf >= 0.25 && tf <0.45){
            return (0.45-tf)/0.2;
        }
        else{
            return 1;
        }
    }
    @Override
    public double medium(double tf){
        if(tf <= 0.3 || tf >= 0.7){
            return 0;
        }
        else if(tf > 0.3 && tf <= 0.5){
            return (tf-0.3)/0.2;
        }
        else if(tf >= 0.5 && tf < 0.7){
            return (0.7-tf)/0.2;
        }
        else{
            return 1;
        }
    }
    @Override
    public double high(double tf){
        if(tf <= 0.5 || tf >= 0.9){
            return 0;
        }
        else if(tf > 0.5 && tf <= 0.7){
            return (tf-0.5)/0.2;
        }
        else if(tf >= 0.7 && tf < 0.9){
            return (0.9-tf)/0.2;
        }
        else{
            return 1;
        }
    }
    @Override
    public double veryHigh(double tf){
        if(tf <= 0.8){
            return 0;
        }
        else if(tf > 0.8 && tf < 1){
            return (tf-0.8)/0.2;
        }
        else if(tf >= 1){
            return 1;
        }
        else{
            return 1;
        }
    }
}
