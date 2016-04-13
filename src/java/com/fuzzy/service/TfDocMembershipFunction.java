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
public class TfDocMembershipFunction {
    public double veryLow(double tf){
        if(tf >= 0.01)
        {
            return 0;
        }
        else if(tf > 0 && tf < 0.01){
            return (0.01 - tf)/0.01;
        }
        else{
            return 1;
        }
    }
    public double low(double tf){
        if(tf <= 0.005 || tf >= 0.02){
            return 0;
        }
        else if(tf > 0.005 && tf <= 0.0125){
            return (tf-0.005)/0.0075;
        }
        else if(tf >= 0.0125 && tf <0.02){
            return (0.2-tf)/0.0075;
        }
        else{
            return 1;
        }
    }
    public double medium(double tf){
        if(tf <= 0.015 || tf >= 0.075){
            return 0;
        }
        else if(tf > 0.015 && tf <= 0.045){
            return (tf-0.015)/0.03;
        }
        else if(tf >= 0.045 && tf < 0.075){
            return (0.075-tf)/0.03;
        }
        else{
            return 1;
        }
    }
    public double high(double tf){
        if(tf <= 0.06 || tf >= 0.12){
            return 0;
        }
        else if(tf > 0.06 && tf <= 0.09){
            return (tf-0.06)/0.03;
        }
        else if(tf >= 0.09 && tf < 0.12){
            return (1.2-tf)/0.03;
        }
        else{
            return 1;
        }
    }
    public double veryHigh(double tf){
        if(tf <= 0.1){
            return 0;
        }
        else if(tf > 0.1 && tf < 1){
            return (tf-0.1)/0.9;
        }
        else if(tf >= 1){
            return 1;
        }
        else{
            return 1;
        }
    }
}
