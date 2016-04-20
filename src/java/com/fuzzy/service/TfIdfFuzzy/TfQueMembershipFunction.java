/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service.TfIdfFuzzy;

import com.fuzzy.service.Interface.MembershipFunctionFirstLevel;

/**
 *
 * @author Marvin Zeson
 */
public class TfQueMembershipFunction implements MembershipFunctionFirstLevel{
    @Override
    public double veryLow(double tf){
        if(tf >= 0.15)
        {
            return 0;
        }
        else if(tf > 0 && tf < 0.15){
            return (0.15 - tf)/0.15;
        }
        else{
            return 1;
        }
    }
    @Override
    public double low(double tf){
        if(tf <= 0.1 || tf >= 0.3){
            return 0;
        }
        else if(tf > 0.1 && tf <= 0.2){
            return (tf-0.1)/0.1;
        }
        else if(tf >= 0.2 && tf <0.3){
            return (0.3-tf)/0.1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double medium(double tf){
        if(tf <= 0.25 || tf >= 0.45){
            return 0;
        }
        else if(tf > 0.25 && tf <= 0.35){
            return (tf-0.25)/0.1;
        }
        else if(tf >= 0.35 && tf < 0.45){
            return (0.45-tf)/0.1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double high(double tf){
        if(tf <= 0.4 || tf >= 0.6){
            return 0;
        }
        else if(tf > 0.4 && tf <= 0.5){
            return (tf-0.4)/0.1;
        }
        else if(tf >= 0.5 && tf < 0.6){
            return (0.6-tf)/0.1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double veryHigh(double tf){
        if(tf <= 0.45){
            return 0;
        }
        else if(tf > 0.45 && tf < 1){
            return (tf-0.45)/0.55;
        }
        else if(tf >= 1){
            return 1;
        }
        else{
            return 1;
        }
    }
}
