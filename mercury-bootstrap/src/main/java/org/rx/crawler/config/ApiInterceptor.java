package org.rx.crawler.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.rx.spring.ControllerInterceptor;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApiInterceptor extends ControllerInterceptor {
    public ApiInterceptor() {
        super.enableTrace(null);
    }

    @Around("execution(public * org.rx.crawler.controller..*.*(..))")
    @Override
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        return super.doAround(joinPoint);
    }
}
