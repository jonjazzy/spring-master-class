package com.jonjazzy.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration  //Specify this is a confiration
@Aspect         //Specify this has to do with AOP
public class AfterAOPAspect
{
    private Logger LOGGER = LoggerFactory.getLogger(AfterAOPAspect.class);

    //@AfterReturning is an advice type,
    // which ensures that an advice runs after the method executes successfully.
    @AfterReturning(
            value="execution(* com.jonjazzy.demo.business.*.*(..))",    //pointer to intercept
            returning = "result"                                        //put result into this argument
    )  //
    public void afterReturning(JoinPoint joinPoint, Object result)
    {
        //Advice
        LOGGER.info("\n\nThis joinPoint --> {}\nReturned with value --> {}", joinPoint, result);

        /*
        *   Recall that Business1 and Business2 method calculateSomething(), returns
        *   a value of dao1.retrieveSomeData();
        *
        *       public String calculateSomething()
                {
                    //Business logic to look at returned data

                    //return the data
                    return dao1.retrieveSomeData();
                }
        * */
    }

    //@AfterThrowing is an advice type which ensures that an advice runs
    // if the method throws an exception
    @AfterThrowing(
            value="execution(* com.jonjazzy.demo.business.*.*(..))",    //pointer to intercept
            throwing = "exception"                                      //put exception into this argument
    )
//    public void afterThrowingException(JoinPoint joinPoint, Object exception)
    public void afterThrowingException(JoinPoint joinPoint, Throwable exception)
    {
        //Advice
        LOGGER.info("\n\nThis joinPoint --> {}\nReturned with value --> {}", joinPoint, exception);
    }

    //@After is an advice type which ensures that an advice runs after the method execution.
    //Regardless of if a value or exception is returned
    @After(value="execution(* com.jonjazzy.demo.business.*.*(..))")
    public void after(JoinPoint joinPoint)
    {
        //Advice
        LOGGER.info("This joinPoint -->", joinPoint);
    }

}
