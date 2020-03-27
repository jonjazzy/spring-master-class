package com.jonjazzy.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration  //Specify this is a confiration
@Aspect         //Specify this has to do with AOP
public class UserAccessAspect
{
    private Logger LOGGER = LoggerFactory.getLogger(UserAccessAspect.class);

    //Define what calls you want to intercept
    @Before("execution(* com.jonjazzy.demo.data.*.*(..))")  //
    /*
        PointCut --> Defines what kind of methods you want to intercept
        e.g. execution(* com.jonjazzy.demo.data.*.*(..))

        Advice --> What should i do after intercepting

        Aspect --> Combination of PointCut & Advice.

        JoinPoint --> A specific execution instance (that has been intercepted)

        Weaving --> Process of implementing the AOP around your method calls

        Weaver --> THe framework which implements weaving, is called a Weaver (in our case Spring AOP)

       @Before("execution(* com.jonjazzy.demo.business.*.*(..))")
       This will intercept only the business methods in com.jonjazzy.demo.business

       @Before("execution(* com.jonjazzy.demo.data.*.*(..))")
       This will intercept only the dao methods in com.jonjazzy.demo.data
     */
    public void before(JoinPoint joinPoint)
    {
        //Advice
//        LOGGER.info("Checking if user has correct access");
//        LOGGER.info("Intercepted a method call:- {}", joinPoint);
    }
}
