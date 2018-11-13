package com.learn.ssm.chapter9.pojo;

import com.learn.ssm.chapter9.pojo.Blender;

public class JuiceMaker {
    // 搅拌机
    private Blender blender = null;
    // 水描述
    private String water;
    // 水果
    private String fruit;
    // 糖分描述
    private String sugar;

    public Blender getBlender() {
        return blender;
    }

    public void setBlender(Blender blender) {
        this.blender = blender;
    }

    public String getWater() {
        return water;
    }


    public void setWater(String water) {
        this.water = water;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    /**
     * 果汁生成
     */
    public String makeJuice() {
        blender = new Blender();
        return blender.mix(water, fruit, sugar);
    }
}
