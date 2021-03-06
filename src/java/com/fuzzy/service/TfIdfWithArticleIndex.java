package com.fuzzy.service;

import java.lang.String;
import java.lang.Math;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Marvin, Andrias, Daniel
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TfIdfWithArticleIndex")
public class TfIdfWithArticleIndex {
        @XmlElement(name = "articleIndex")
	private int articleIndex;
        @XmlElement(name = "articleTfIdf")
	private String articleTfIdf;
        @XmlElement(name = "articleTitle")
        private String articleTitle;
        @XmlElement(name = "articleContent")
        private String articleContent;
        @XmlElement(name = "articleCategory")
        private String articleCategory;
	
	public TfIdfWithArticleIndex(int articleIndex, String articleTfIdf, String articleTitle, String articleContent, String articleCategory) {
		this.articleIndex = articleIndex;
		this.articleTfIdf = articleTfIdf;
                this.articleTitle = articleTitle;
                this.articleContent = articleContent;
                this.articleCategory = articleCategory;
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
        
        public String getArticleContent(){
            return this.articleContent;
        }
        
        public String getArticleCategory(){
            return this.articleCategory;
        }

	public double convertStringToDouble(String str) {
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