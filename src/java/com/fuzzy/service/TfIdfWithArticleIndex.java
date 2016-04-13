package com.fuzzy.service;

import java.lang.String;
import java.lang.Math;

/**
 *
 * @author Marvin, Andrias, Daniel
 */
public class TfIdfWithArticleIndex {
	private int articleIndex;
	private String articleTfIdf;
        private String articleTitle;
	
	public TfIdfWithArticleIndex(int articleIndex, String articleTfIdf, String articleTitle) {
		this.articleIndex = articleIndex;
		this.articleTfIdf = articleTfIdf;
                this.articleTitle = articleTitle;
	}

	public int getArticleIndex() {

        return this.articleIndex;
	}

	public String getArticleTfIdf() {

        return this.articleTfIdf;
	}
        
        public String getArticleTitle(){
            return this.articleTitle;
        }

	private double convertStringToDouble(String str) {
		int tanda = 0;
		int indexTitik = 0;
		boolean status = false;
		double hasil = 0.0;
		int hasilTemp = 0;
		int panjang = str.length();

		for (int i = 0; i < panjang; i++) {
			if (str.charAt(i) == '-') {
                tanda = 1;
            } else if (str.charAt(i) == '.') {
				status = true;
				indexTitik = i;
				hasil = (double)hasilTemp;
			} else if (status == false) {
				hasilTemp = (hasilTemp * 10) + (int)(str.charAt(i) - '0');
			} else {
				hasil = hasil + ((double)(str.charAt(i) - '0') / Math.pow(10.0,(double)(i - indexTitik)));
			}
		}

		if (tanda == 1) {
            hasil = hasil * (-1.0);
        }

		return hasil;
	}

	public int compareWith(TfIdfWithArticleIndex obj) {
		String str1 = this.articleTfIdf;
		String str2 = obj.getArticleTfIdf();
		double d1 = this.convertStringToDouble(str1);
		double d2 = this.convertStringToDouble(str2);
		if (d1 < d2) {
            return -1;
        } else if (d1 > d2) {
            return 1;
        } else {
            return 0;
        }
	}
}