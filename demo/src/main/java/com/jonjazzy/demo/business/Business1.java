package com.jonjazzy.demo.business;

import com.jonjazzy.demo.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    /*
        @Bean - indicates that a method produces a bean to be managed by Spring.

        @Service - indicates that an annotated class is a service class.

        @Repository - indicates that an annotated class is a repository, which is an abstraction of data access and storage.
        @Configuration - indicates that a class is a configuration class that may contain bean definitions.
        @Controller - marks the class as web controller, capable of handling the requests.
        @RequestMapping - maps HTTP request with a path to a controller method.
        @Autowired - marks a constructor, field, or setter method to be autowired by Spring dependency injection.
        @SpringBootApplication - enables Spring Boot autoconfiguration and component scanning.
    */

@Service
public class Business1
{
    @Autowired
    Dao1 dao1;

    public String calculateSomething()
    {
        //Business logic to look at returned data

        //return the data
        return dao1.retrieveSomeData();
    }
}
