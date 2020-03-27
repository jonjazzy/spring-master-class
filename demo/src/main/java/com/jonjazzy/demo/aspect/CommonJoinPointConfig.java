package com.jonjazzy.demo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig
{
    @Pointcut("execution(* com.jonjazzy.demo.data.*.*(..))")
    public void dataLayerExecutionPointcut(){}

    @Pointcut("execution(* com.jonjazzy.demo.business.*.*(..))")
    public void businessLayerExecutionPointcut(){}
}
