package com.discusit.proxy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonWriteNullProperties;

/**
 * @author Darshan Patel
 */
@JsonWriteNullProperties(false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryProxy implements Serializable {

    private Integer id;
    private String name;
    private List<Long> list = new ArrayList<Long>();

    public CountryProxy() {
    }

    public CountryProxy(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getList() {
        return list;
    }

    public void setList(List<Long> list) {
        this.list = list;
    }

}
