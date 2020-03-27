package com.jonjazzy.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration  //Specify this is a confiration
@Aspect         //Specify this has to do with AOP
@Component
public class MethodExecutionCalculationAspect
{
    private Logger LOGGER = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

//    @Around("execution(* com.jonjazzy.demo.data.*.*(..))")
    @Around("com.jonjazzy.demo.aspect.CommonJoinPointConfig.dataLayerExecutionPointcut()")
//    @Around("@annotation(TrackTime)")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //my startTime is x
        long startTime = System.currentTimeMillis();

        //allow execution of method
        proceedingJoinPoint.proceed();

        //get currentTime and calculate time taken
        long timeTaken = System.currentTimeMillis() - startTime;

        //Advice
        LOGGER.info("------------------------------------------------------");
        LOGGER.info("\nTime take for method {} to completely run was {} ms", proceedingJoinPoint, timeTaken);
    }
}
