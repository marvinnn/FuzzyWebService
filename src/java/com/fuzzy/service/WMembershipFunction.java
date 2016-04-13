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
public class WMembershipFunction {
    public double low(double w){
        if(w >= 0.4){
            return 0;
        }
        else if(w > 0 && w < 0.4){
            return (0.4 - w)/0.4;
        }
        else{
            return 1;
        }
    }
    public double medium(double w){
        if(w<=0.25 || w>=0.75){
            return 0;
        }
        else if(w > 0.25 && w <= 0.5){
            return (w-0.25)/0.25;
        }
        else if(w >= 0.5 && w < 0.75){
            return (0.75 - w)/0.25;
        }
        else{
            return 1;
        }
    }
    public double high(double w){
        if(w <= 0.6){
            return 0;
        }
        else if(w > 0.6 && w <= 1)
        {
            return (1 - w)/0.4;
        }
        else{
            return 1;
        }
    }
}
