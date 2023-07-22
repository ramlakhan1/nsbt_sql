package core.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// LoggingAspect.java
@Aspect
@Component
public class LoggingAspect {
    Logger logger = LogManager.getLogger();

    @Before("execution(* add(..))")
    public void afterAddAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Logging after " + methodName + " with arguments: " + Arrays.toString(args));
    }
//    @Before("args(a)")
//    public void hi(JoinPoint joinPoint){
//        System.out.println("hello args");
//    }

    @Before("execution(* subtract(..))")
    public void beforeSubtractAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Logging before " + methodName + " with arguments: " + Arrays.toString(args));
    }

    @AfterReturning(pointcut = "execution(* multiply(..))", returning = "result")
    public void afterReturningMultiplyAdvice(JoinPoint joinPoint, Object result) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Logging after returning from " + methodName + " with arguments: " + Arrays.toString(args));
       logger.info("Returned value: " + result);
    }

    @AfterThrowing(pointcut = "execution(* divide(..))", throwing = "ex")
    public void afterThrowingDivideAdvice(JoinPoint joinPoint, ArithmeticException ex) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Logging after throwing exception from " + methodName + " with arguments: " + Arrays.toString(args));
        logger.info("Error occurred: " + ex.getMessage());
    }
}

