package com.discusit.beans;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 * @author Darshan Patel
 */
@Stateless
@LocalBean
public class HelloBean {

    public String getData(String name) {
        System.out.println("name : " + name);
        return "Hello " + name;
    }

}
