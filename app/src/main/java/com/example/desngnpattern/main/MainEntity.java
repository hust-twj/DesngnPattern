package com.example.desngnpattern.main;

import java.io.Serializable;

/**
 * Created by Wenjing.Tang
 * on 2019/1/18
 */
public class MainEntity implements Serializable {

    public int index;

    public String title;

    public static final int INDEX_PROXY = 1;//代理模式
    public static final int INDEX_FACTORY_METHOD = 5;//工厂方法模式

}
