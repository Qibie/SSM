package com.learn.ssm.chapter2.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName TaoBaoObserver
 * @Description TaoBao interface
 * @Author qibie
 * @Date 10/17/18 7:33 PM
 */
public class TaoBaoObserver implements Observer {
    @Override
    public void update(Observable o, Object product) {
        String newProduct = (String) product;
        System.err.println("send new product [" + newProduct + "] synchronized to TB mall");
    }
}
