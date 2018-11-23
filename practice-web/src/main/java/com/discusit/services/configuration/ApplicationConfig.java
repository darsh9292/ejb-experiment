package com.discusit.services.configuration;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author Darshan Patel
 */
@ApplicationPath("rest")
public class ApplicationConfig extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.discusit.services.CountryResource.class);
        resources.add(com.discusit.services.ExceptionResource.class);
        resources.add(com.discusit.services.HelloResource.class);
        resources.add(com.discusit.services.configuration.GlobalExceptionMapper.class);
    }
    
    
    
}
