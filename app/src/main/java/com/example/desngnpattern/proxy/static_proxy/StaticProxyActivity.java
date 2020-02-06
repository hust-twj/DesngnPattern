package com.example.desngnpattern.proxy.static_proxy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.desngnpattern.R;

/**
 * Created by hust_twj
 * on 2020/2/5
 *
 */
public class StaticProxyActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_static_proxy);

        ISubject subject = new ProxySubject(new RealSubject());
        subject.buy();

    }


}
