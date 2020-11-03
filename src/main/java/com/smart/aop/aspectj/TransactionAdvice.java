package com.smart.aop.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
@Order(2)
public class TransactionAdvice {
//    连接池

    /**
     * 定义切入点
     */
    @Pointcut("@annotation(com.smart.aop.annotion.Transaction)")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        log.info("开启事务!");
    }

    @AfterReturning("pointCut()")
    public void retruning() {
        log.info("提交事务");
    }

    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void afterThrowing(Exception ex) {
        log.error(ex.getMessage());
        log.info("回滚事务");
    }


}
