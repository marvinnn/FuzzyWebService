
package com.fuzzy.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.fuzzy.service.TfIdfWithArticleIndex;

@XmlRootElement(name = "doSearchResponse", namespace = "http://service.fuzzy.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doSearchResponse", namespace = "http://service.fuzzy.com/")
public class DoSearchResponse {

    @XmlElement(name = "return", namespace = "")
    private List<TfIdfWithArticleIndex> _return;

    /**
     * 
     * @return
     *     returns List<TfIdfWithArticleIndex>
     */
    public List<TfIdfWithArticleIndex> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<TfIdfWithArticleIndex> _return) {
        this._return = _return;
    }

}
