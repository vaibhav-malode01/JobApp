package com.telusko.springbootrest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidatingAspects {

    private static  final Logger LOGGER = LoggerFactory.getLogger(LoggingAspects.class);

    @Around("execution(* com.telusko.springbootrest.service.JobService.getJob(..)) && args(postId)")
    public Object ValidateArgs(ProceedingJoinPoint jp ,int postId) throws Throwable {

        if(postId <0)
        {
            LOGGER.info("THe postId is negative");
            postId= -postId;
            LOGGER.info("new ID  "+ postId );
        }


        Object obj = jp.proceed(new Object[]{postId});

        return obj;
    }
}
