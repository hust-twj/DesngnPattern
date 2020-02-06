package com.example.desngnpattern.proxy.static_proxy;

import android.util.Log;

/**
 * Description ：
 * Created by Wenjing.Tang on 2020-02-06.
 */
public class RealSubject implements ISubject{

    @Override
    public void buy() {
        Log.e("twj124","我要MacBook pro");

    }

}
