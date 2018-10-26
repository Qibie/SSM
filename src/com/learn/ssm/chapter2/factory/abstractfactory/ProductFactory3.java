package com.learn.ssm.chapter2.factory.abstractfactory;

import com.learn.ssm.chapter2.factory.IProduct;

/**
 * @ClassName ProductFactory1
 * @Description
 * @Author qibie
 * @Date 10/17/18 7:52 PM
 */
public class ProductFactory3 implements IProductFactory {
    @Override
    public IProduct createProduct(String productNo) {
        // rule of facotry3 generate product object
        IProduct product = null;
        return product;
    }
}
