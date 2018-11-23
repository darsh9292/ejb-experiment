package com.discusit.beans;

import com.discusit.entities.Country;
import com.discusit.proxy.CountryProxy;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Darshan Patel
 */
@Stateless
@LocalBean
public class CountryBean {

    @PersistenceContext
    private EntityManager em;

    public List<CountryProxy> getCountryList() {
        List<CountryProxy> countryList = em.createQuery("select new com.discusit.proxy.CountryProxy(c.id,c.name) from Country c")
                .getResultList();
        return countryList;
    }

    public boolean saveCountry(CountryProxy countryProxy) {
        try {
            Country c = new Country();
            c.setName(countryProxy.getName());
            em.persist(c);
            return true;
        } catch (Exception e) {
            System.out.println("error " + e);
            return false;
        }
    }

}
