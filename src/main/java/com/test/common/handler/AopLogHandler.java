package com.test.common.handler;

import com.test.common.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

@Slf4j
@Aspect
public class AopLogHandler {

    @Around("within(com.test.web.contorller.*)")
    public Object logBefore(ProceedingJoinPoint point) throws Throwable {
        Object resultVal = point.proceed();

        long start = System.currentTimeMillis();
        long processTime = System.currentTimeMillis() - start;

        Object[] params = point.getArgs();

        String paramMessage = Arrays.stream(params)
                .map(JsonUtils::toJson)
                .collect(joining(", "));

        log.info("");
        log.info("---------------------------------------------------------------------------------------------------------------------------");
        log.info("Processing Time({}) : {} ms", point.getSignature().toShortString(), processTime);
        log.info("Param : {}", paramMessage);
        log.info("Result : {}", JsonUtils.toJson(resultVal));
        log.info("---------------------------------------------------------------------------------------------------------------------------");

        return resultVal;
    }


}
