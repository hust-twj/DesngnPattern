package com.example.desngnpattern.abstract_factory;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.example.desngnpattern.R;

/**
 * 抽象工厂模式
 * Created by hust_twj
 * on 2019/4/18
 *
 */
public class AbstractFactoryActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_factoty_method);

    }


}
