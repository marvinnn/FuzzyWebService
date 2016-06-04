package com.fuzzy.service.TfIdfNonFuzzy;

import com.fuzzy.service.Interface.Calculator;
import java.util.List;

/**
 *
 * @author Marvin, Andrias, Daniel
 */
public class TfIdfCalculator implements Calculator{

    public double tf(List<String> doc, String term) {
        double result = 0;
        for (String word : doc) {
            if (term.equalsIgnoreCase(word)) {
                result++;
            }
        }
        return result / doc.size();
    }

    public double idf(List<List<String>> docs, String term) {
        double n = 0;
        for (List<String> doc : docs) {
            for (String word : doc) {
                if (term.equalsIgnoreCase(word)) {
                    n++;
                    break;
                }
            }
        }
        if (n != 0) {
            return Math.log10(docs.size() / n);
        } else {
            return 2.8;
        }
    }
    

    @Override
    public double calculate(List<String> doc, List<List<String>> docs, String term, List<String> que, double idf) {
        return tf(doc, term) * idf;
    }
}
