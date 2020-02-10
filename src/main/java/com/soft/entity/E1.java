package com.soft.entity;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/2/10.
 */
public class E1 {

    private Integer[] ids;

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "E1{" +
                "ids=" + Arrays.toString(ids) +
                '}';
    }
}
