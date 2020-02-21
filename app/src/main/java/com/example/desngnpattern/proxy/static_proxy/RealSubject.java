package com.example.desngnpattern.proxy.static_proxy;

import android.util.Log;

/**
 * Description ：目标对象实现类
 * Created by Wenjing.Tang on 2020-02-06.
 */
public class RealSubject implements ISubject{

    @Override
    public void buy() {
        Log.e("twj124","我是 A，我要买一台 MacBook pro，请帮忙");

    }

}
