package com.smart.aop.service.impl;

import com.smart.aop.annotion.Log;
import com.smart.aop.annotion.Transaction;
import com.smart.aop.service.ShopService;

/**
 *
 */
public class ShopServiceImpl implements ShopService {
    @Override
    @Log
    @Transaction
    public String add() {
        System.out.println("2.核心方法---->添加商品信息");
        return null;
    }
}
