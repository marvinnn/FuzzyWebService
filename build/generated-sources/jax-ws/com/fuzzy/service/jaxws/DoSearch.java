
package com.fuzzy.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "doSearch", namespace = "http://service.fuzzy.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doSearch", namespace = "http://service.fuzzy.com/")
public class DoSearch {

    @XmlElement(name = "querry", namespace = "")
    private String querry;

    /**
     * 
     * @return
     *     returns String
     */
    public String getQuerry() {
        return this.querry;
    }

    /**
     * 
     * @param querry
     *     the value for the querry property
     */
    public void setQuerry(String querry) {
        this.querry = querry;
    }

}
