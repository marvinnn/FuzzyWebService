/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fuzzy.service;

/**
 *
 * @author Marvin Zeson
 */
public class IdfMembershipFunction {
    public double veryLow(double idf){
        if(idf >= 0.7)
        {
            return 0;
        }
        else if(idf > 0 && idf < 0.7){
            return (0.7-idf)/0.7;
        }
        else{
            return 1;
        }
    }
    public double low(double idf){
        if(idf <= 0.4 || idf >= 1.1){
            return 0;
        }
        else if(idf > 0.4 && idf <= 0.75){
            return (idf-0.4)/0.35;
        }
        else if(idf >= 0.75 && idf <1.1){
            return (1.1-idf)/0.35;
        }
        else{
            return 1;
        }
    }
    public double medium(double idf){
        if(idf <= 0.9 || idf >= 1.7){
            return 0;
        }
        else if(idf > 0.9 && idf <= 1.3){
            return (idf-0.9)/0.4;
        }
        else if(idf >= 1.3 && idf < 1.7){
            return (1.7-idf)/0.4;
        }
        else{
            return 1;
        }
    }
    public double high(double idf){
        if(idf <= 1.4 || idf >= 2.4){
            return 0;
        }
        else if(idf > 1.4 && idf <= 1.9){
            return (idf-1.4)/0.5;
        }
        else if(idf >= 1.9 && idf < 2.4){
            return (2.4-idf)/0.5;
        }
        else{
            return 1;
        }
    }
    public double veryHigh(double idf){
        if(idf <= 2){
            return 0;
        }
        else if(idf > 2 && idf < 2.8){
            return (idf-2)/0.8;
        }
        else if(idf >= 2.8){
            return 1;
        }
        else{
            return 1;
        }
    }
}
