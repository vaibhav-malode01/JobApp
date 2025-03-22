package com.telusko.springbootrest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceManagingAspects {

    private static  final Logger LOGGER = LoggerFactory.getLogger(LoggingAspects.class);

    @Around("execution(* com.telusko.springbootrest.service.JobService.getJob(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
        long start = System.currentTimeMillis();

         Object obj = jp.proceed();
        long end = System.currentTimeMillis();

        LOGGER.info("TIme Taken By "+ jp.getSignature().getName()  +"  "+  (end-start) + "ms");
        return obj;
    }
}
