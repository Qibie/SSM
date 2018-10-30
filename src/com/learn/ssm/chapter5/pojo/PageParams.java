package com.learn.ssm.chapter5.pojo;

/**
 * @ClassName PageParams
 * @Description paging pojo
 * @Author qibie
 * @Date 10/30/18 1:29 PM
 */
public class PageParams {
    private int start;
    private int limit;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
