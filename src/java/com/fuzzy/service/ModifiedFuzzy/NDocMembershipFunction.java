/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service.ModifiedFuzzy;

import com.fuzzy.service.Interface.MembershipFunctionFirstLevel;

/**
 *
 * @author Marvin Zeson
 */
public class NDocMembershipFunction implements MembershipFunctionFirstLevel{
    @Override
    public double veryLow(double n){
        if(n >= 0.04)
        {
            return 0;
        }
        else if(n > 0 && n < 0.04){
            return (0.04 - n)/0.04;
        }
        else{
            return 1;
        }
    }
    @Override
    public double low(double n){
        if(n <= 0.03 || n >= 0.06){
            return 0;
        }
        else if(n > 0.03 && n <= 0.045){
            return (n-0.03)/0.015;
        }
        else if(n >= 0.045 && n <0.06){
            return (0.06-n)/0.015;
        }
        else{
            return 1;
        }
    }
    @Override
    public double medium(double n){
        if(n <= 0.05 || n >= 0.09){
            return 0;
        }
        else if(n > 0.05 && n <= 0.07){
            return (n-0.05)/0.02;
        }
        else if(n >= 0.07 && n < 0.09){
            return (0.09-n)/0.02;
        }
        else{
            return 1;
        }
    }
    @Override
    public double high(double n){
        if(n <= 0.08 || n >= 0.12){
            return 0;
        }
        else if(n > 0.08 && n <= 0.1){
            return (n-0.08)/0.02;
        }
        else if(n >= 0.1 && n < 0.12){
            return (0.12-n)/0.02;
        }
        else{
            return 1;
        }
    }
    @Override
    public double veryHigh(double n){
        if(n <= 0.11){
            return 0;
        }
        else if(n > 0.11 && n < 1){
            return (n-0.11)/0.89;
        }
        else if(n >= 1){
            return 1;
        }
        else{
            return 1;
        }
    }
}
