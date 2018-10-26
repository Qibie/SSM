package com.learn.ssm.chapter2.builder;

/**
 * @ClassName TicketBuilder
 * @Description a build class
 * @Author qibie
 * @Date 10/17/18 8:07 PM
 */
public class TicketBuilder {
    public static Object builder(TicketHelper helper) {
        System.out.println("build ticket info by TicketHelper");
        return null;
    }

    public static void main(String[] args) {
        TicketHelper helper = new TicketHelper();
        helper.buildAdult("adult ticket");
        helper.buildChildrenForSeat("seated child ticket");
        helper.buildChildrenNoSeat("no-seated child ticket");
        helper.buildElderly("elderly ticket");
        helper.buildSoilder("soilder ticket");
        Object ticket = TicketBuilder.builder(helper);
    }
}
