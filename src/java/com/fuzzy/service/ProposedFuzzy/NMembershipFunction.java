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
public class NMembershipFunction implements MembershipFunctionFirstLevel{
    @Override
    public double veryLow(double n){
        if(n >= 0.1)
        {
            return 0;
        }
        else if(n > 0 && n < 0.1){
            return (0.1 - n)/0.1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double low(double n){
        if(n <= 0.05 || n >= 0.25){
            return 0;
        }
        else if(n > 0.05 && n <= 0.15){
            return (n-0.05)/0.1;
        }
        else if(n >= 0.15 && n <0.25){
            return (0.25-n)/0.1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double medium(double n){
        if(n <= 0.2 || n >= 0.4){
            return 0;
        }
        else if(n > 0.2 && n <= 0.3){
            return (n-0.2)/0.1;
        }
        else if(n >= 0.3 && n < 0.4){
            return (0.4-n)/0.1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double high(double n){
        if(n <= 0.3 || n >= 0.7){
            return 0;
        }
        else if(n > 0.3 && n <= 0.5){
            return (n-0.3)/0.2;
        }
        else if(n >= 0.5 && n < 0.7){
            return (0.7-n)/0.2;
        }
        else{
            return 1;
        }
    }
    @Override
    public double veryHigh(double n){
        if(n <= 0.5){
            return 0;
        }
        else if(n > 0.5 && n < 1){
            return (n-0.5)/0.5;
        }
        else if(n >= 1){
            return 1;
        }
        else{
            return 1;
        }
    }
}
