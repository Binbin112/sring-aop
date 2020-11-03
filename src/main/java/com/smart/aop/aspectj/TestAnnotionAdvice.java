package com.smart.aop.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * 定义切面
 * (定义代理类)
 * lombok
 */
@Component
@Aspect
@Slf4j
@Order(3)
public class TestAnnotionAdvice {
    @Pointcut(value = "@annotation(com.smart.aop.annotion.Log)")
    public void point() {
    }

    @Before(value = "point()")
    public void before() {
        log.debug("111111");
        // 记录用户访问的接口
//        log.info();
//        log.error(e.get);
    }


}
