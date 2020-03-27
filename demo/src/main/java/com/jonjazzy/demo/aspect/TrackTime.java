package com.jonjazzy.demo.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Only intercepts methods
@Retention(RetentionPolicy.RUNTIME) //I want to have this available at runtime
public @interface TrackTime
{

}
