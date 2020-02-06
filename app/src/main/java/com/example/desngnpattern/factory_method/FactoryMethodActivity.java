package com.example.desngnpattern.factory_method;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.example.desngnpattern.R;
import com.example.desngnpattern.factory_method.pattern.AudiCarFactory;
import com.example.desngnpattern.factory_method.pattern.Q3CarProduct;
import com.example.desngnpattern.factory_method.pattern.Q5CarProduct;
import com.example.desngnpattern.factory_method.pattern.Q7CarProduct;

/**
 * 工厂方法模式
 * Created by hust_twj
 * on 2019/2/26
 *
 */
public class FactoryMethodActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_factoty_method);

        AudiCarFactory carFactory = new AudiCarFactory();
        Q3CarProduct Q3 = carFactory.createCar(Q3CarProduct.class);
        Q3.desc();

        Q5CarProduct Q5 = carFactory.createCar(Q5CarProduct.class);
        Q5.desc();

        Q7CarProduct Q7 = carFactory.createCar(Q7CarProduct.class);
        Q7.desc();

    }


}
