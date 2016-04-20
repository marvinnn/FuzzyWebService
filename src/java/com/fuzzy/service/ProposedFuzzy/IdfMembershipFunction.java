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
public class IdfMembershipFunction implements MembershipFunctionFirstLevel{
    @Override
    public double veryLow(double idf){
        if(idf >= 1)
        {
            return 0;
        }
        else if(idf > 0 && idf < 1){
            return (1-idf)/1;
        }
        else{
            return 1;
        }
    }
    @Override
    public double low(double idf){
        if(idf <= 0.5 || idf >= 4){
            return 0;
        }
        else if(idf > 0.5 && idf <= 2){
            return (idf-0.5)/1.5;
        }
        else if(idf >= 2 && idf <4){
            return (4-idf)/2;
        }
        else{
            return 1;
        }
    }
    @Override
    public double medium(double idf){
        if(idf <= 2.5 || idf >= 6.5){
            return 0;
        }
        else if(idf > 2.5 && idf <= 4.5){
            return (idf-2.5)/2;
        }
        else if(idf >= 4.5 && idf < 6.5){
            return (6.5-idf)/2;
        }
        else{
            return 1;
        }
    }
    @Override
    public double high(double idf){
        if(idf <= 5 || idf >= 9){
            return 0;
        }
        else if(idf > 5 && idf <= 7){
            return (idf-5)/2;
        }
        else if(idf >= 7 && idf < 9){
            return (9-idf)/2;
        }
        else{
            return 1;
        }
    }
    @Override
    public double veryHigh(double idf){
        if(idf <= 8){
            return 0;
        }
        else if(idf > 8 && idf < 10){
            return (idf-8)/2;
        }
        else if(idf >= 10){
            return 1;
        }
        else{
            return 1;
        }
    }
}
