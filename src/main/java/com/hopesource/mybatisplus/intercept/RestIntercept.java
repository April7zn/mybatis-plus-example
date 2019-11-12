package com.hopesource.mybatisplus.intercept;

import org.aopalliance.intercept.Interceptor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RestIntercept implements Interceptor {
    private static final String POINT_CUT = "execution(public * com.hopesource.mybatisplus.controller.*.*(..))";
    @Pointcut(POINT_CUT)
    public void restController(){}

    @Around(POINT_CUT)
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        return null;
    }
}
