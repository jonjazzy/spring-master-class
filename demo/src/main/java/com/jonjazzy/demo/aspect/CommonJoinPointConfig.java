package com.jonjazzy.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonJoinPointConfig
{
    Logger LOGGER = LoggerFactory.getLogger(CommonJoinPointConfig.class);

    @Pointcut("execution(* com.jonjazzy.demo.data.*.*(..))")
    public void dataLayerExecutionPointcut(){}

    @Pointcut("execution(* com.jonjazzy.demo.business.*.*(..))")
    public void businessLayerExecutionPointcut(){}

    //combine joinpoints
    @Pointcut("execution(* com.jonjazzy.demo.data.*.*(..)) && execution(* com.jonjazzy.demo.business.*.*(..))")
    public void allLayerExecution(){}

    //use beanNames to define pointucts. All beans with dao in name
    @Pointcut("bean(*dao*)")
    public void beansStartingWithDAO(){}

    //intercept all calls within data package
    @Pointcut("within(com.jonjazzy.demo.data..*)")
    public void allCallsWithinPackage(){}

    @Pointcut("@annotation(com.jonjazzy.demo.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
