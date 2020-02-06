package com.example.desngnpattern.proxy.dynamic_proxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.desngnpattern.R;
import com.example.desngnpattern.proxy.static_proxy.ISubject;
import com.example.desngnpattern.proxy.static_proxy.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by hust_twj
 * on 2020/2/5
 */
public class DynamicProxyActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dynamic_proxy);

        InvocationHandler invocationHandler = new DynamicProxySubject(new RealSubject());

        ISubject subject = (ISubject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), invocationHandler);

        subject.buy();
    }


}
