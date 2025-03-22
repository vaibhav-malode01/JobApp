package com.telusko.springbootrest.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

    private static  final Logger LOGGER = LoggerFactory.getLogger(LoggingAspects.class);

    @Before("execution(* com.telusko.springbootrest.service.JobService.getJob(..))")
    public void logMethodCalled(JoinPoint jp)
    {
        LOGGER.info("Method called   " + jp.getSignature().getName());
    }
}
