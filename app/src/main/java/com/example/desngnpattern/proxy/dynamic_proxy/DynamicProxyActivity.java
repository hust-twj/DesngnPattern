package com.example.desngnpattern.proxy.dynamic_proxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.desngnpattern.R;
import com.example.desngnpattern.proxy.static_proxy.ISubject;
import com.example.desngnpattern.proxy.static_proxy.RealSubject;
import com.example.desngnpattern.proxy.static_proxy.RealSubjectB;

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

        RealSubject realSubjectA = new RealSubject();
        InvocationHandler invocationHandler = new DynamicProxySubject(realSubjectA);
        ISubject subject = (ISubject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), invocationHandler);
        subject.buy();

        RealSubjectB realSubjectB = new RealSubjectB();
        InvocationHandler invocationHandlerB = new DynamicProxySubject(realSubjectB);
        ISubject subjectB = (ISubject) Proxy.newProxyInstance(RealSubjectB.class.getClassLoader(),
                RealSubjectB.class.getInterfaces(), invocationHandlerB);
        subjectB.buy();

    }

}
