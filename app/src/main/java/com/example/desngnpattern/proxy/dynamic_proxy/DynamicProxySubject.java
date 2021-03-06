package com.example.desngnpattern.proxy.dynamic_proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description ：动态代理的代理类
 * Created by Wenjing.Tang on 2020-02-06.
 */
public class DynamicProxySubject implements InvocationHandler {

    private Object proxySubject;

    public DynamicProxySubject(Object proxy) {
        this.proxySubject = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Log.e("twj124","invoke  代购买Mac前");

        method.invoke(proxySubject, args);

        Log.e("twj124","invoke  代购买Mac后");
        return null;
    }

}
