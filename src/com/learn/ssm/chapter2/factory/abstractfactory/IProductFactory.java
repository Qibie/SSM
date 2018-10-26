package com.learn.ssm.chapter2.factory.abstractfactory;

import com.learn.ssm.chapter2.factory.IProduct;

/**
 * @ClassName IProductFactory
 * @Description
 * @Author qibie
 * @Date 10/17/18 7:50 PM
 */
public interface IProductFactory {
    public IProduct createProduct(String productNo);
}
