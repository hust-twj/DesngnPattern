package com.example.desngnpattern.factory_method.pattern;

import com.example.desngnpattern.utils.LogUtils;

/**
 * description ：具体产品类
 * Created by Wenjing.Tang on 2019/4/18.
 */
public class Q7CarProduct extends AudiCar {

    @Override
    public void desc() {
        LogUtils.e("twj234", "Q7CarProduct");
    }
}
