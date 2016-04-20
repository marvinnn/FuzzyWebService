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
public interface Calculator {
    public double calculate(List<String> doc, List<List<String>> docs, String term, List<String> que);
}
