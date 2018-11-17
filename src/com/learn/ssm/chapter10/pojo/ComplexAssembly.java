package com.learn.ssm.chapter10.pojo;

import java.util.*;

public class ComplexAssembly {
    private Long id;
    private List<String> list;
    private Map<String, String> map;
    private Properties props;
    private Set<String> set;
    private String[] array;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ComplexAssembly{" +
                "id=" + id +
                ", list=" + list +
                ", map=" + map +
                ", props=" + props +
                ", set=" + set +
                ", array=" + Arrays.toString(array) +
                '}';
    }

}