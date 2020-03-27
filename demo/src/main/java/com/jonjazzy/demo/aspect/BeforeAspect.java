package com.jonjazzy.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration  //Specify this is a confiration
@Aspect         //Specify this has to do with AOP
public class BeforeAspect
{
    private Logger LOGGER = LoggerFactory.getLogger(BeforeAspect.class);

    //Define what calls you want to intercept
    @Before("execution(* com.jonjazzy.demo.business.*.*(..))")
    /*
        specify this is a before method, and define the method you want to intercept.
        @Before("execution(* PACKAGE.*.*(..))") means intercept all
        Intercepts before the call has happened

        E.g., checking user access before method is run
     */
    public void before(JoinPoint joinPoint)
    {
        //when you intercept, what do you do?
        LOGGER.info("Intercepted a method call:- {}", joinPoint);
    }
}
