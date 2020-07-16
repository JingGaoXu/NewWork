package com.example.networkjing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//设置注解类型为方法
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)  //设置JVM起动就 开始
public @interface NetworkListener {
    @NetType String type() default NetType.AUTO;
}