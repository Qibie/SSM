package com.learn.ssm.chapter2.builder;

/**
 * @ClassName TicketHelper
 * @Description a configuration class of builder pattern
 * @Author qibie
 * @Date 10/17/18 8:01 PM
 */
public class TicketHelper {

    public void buildAdult(String info) {
        System.err.println("build adult ticket logic " + info);
    }

    public void buildChildrenForSeat(String info) {
        System.err.println("build child ticket logic " + info);
    }

    public void buildChildrenNoSeat(String info) {
        System.err.println("build no-seat child ticket logic " + info);
    }

    public void buildElderly(String info) {
        System.err.println("build elderly ticket logic " + info);
    }

    public void buildSoilder(String info) {
        System.err.println("build soilder ticket logic " + info);
    }
}