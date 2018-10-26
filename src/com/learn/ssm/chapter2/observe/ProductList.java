package com.learn.ssm.chapter2.observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ProductList
 * @Description the observed product list
 * @Author qibie
 * @Date 10/17/18 7:14 PM
 */
public class ProductList extends Observable {

    // product list
    private List<String> productList = null;

    // unique singleton
    private static ProductList instance;

    // private constructor
    private ProductList(){}

    /**
     * get unique singleton
     * @return
     */
    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<String>();
        }
        return instance;
    }

    /**
     * add observer (bussiness interface)
     * @param observer
     */
    public void addProductListObserver(Observer observer) {
        this.addObserver(observer);
    }

    /**
     * add product core method
     * @param newProduct
     */
    public void addProduct(String newProduct) {
        productList.add(newProduct);
        System.out.println("product list add product: " + newProduct);
        // set the observed object changed
        this.setChanged();
        // notify observe and delivery new product
        this.notifyObservers(newProduct);
    }
}