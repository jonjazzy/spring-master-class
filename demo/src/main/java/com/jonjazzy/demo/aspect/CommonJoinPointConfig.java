package com.jonjazzy.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig
{
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
}
