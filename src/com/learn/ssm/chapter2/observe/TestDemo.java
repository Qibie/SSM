package com.learn.ssm.chapter2.observe;

/**
 * @ClassName TestDemo
 * @Description
 * @Author qibie
 * @Date 10/17/18 7:37 PM
 */
public class TestDemo {
    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        JingDongObserver jingDongObserver = new JingDongObserver();
        observable.addObserver(jingDongObserver);
        observable.addObserver(taoBaoObserver);
        observable.addProduct("add product 1");
    }
}
