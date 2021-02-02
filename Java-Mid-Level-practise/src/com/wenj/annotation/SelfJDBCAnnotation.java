package com.wenj.annotation;

import java.lang.annotation.*;

/**
 * @project: IntelliJ IDEA how2jPractise
 * @author: wenj
 * @create: 2021 01 29 18:35 星期五
 * @description: 自定义注解
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SelfJDBCAnnotation {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String serverTimezone();
    String username();
    String password();

}
