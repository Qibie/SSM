package com.learn.ssm.chapter2.factory.abstractfactory;

import com.learn.ssm.chapter2.factory.IProduct;

/**
 * @ClassName ProductFactory
 * @Description common factory
 * @Author qibie
 * @Date 10/17/18 7:56 PM
 */
public class ProductFactory implements IProductFactory {

    @Override
    public IProduct createProduct(String productNo) {
        char ch = productNo.charAt(0);
        IProductFactory factory = null;
        if (ch == '1') {
            factory = new ProductFactory1();
        } else if (ch == '2') {
            factory = new ProductFactory2();
        } else if (ch == '3') {
            factory = new ProductFactory3();
        }
        if (factory != null) {
            return factory.createProduct(productNo);
        }
        return null;
    }
}
