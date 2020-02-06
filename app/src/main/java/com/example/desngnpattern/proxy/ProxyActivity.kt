package com.example.desngnpattern.proxy

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.desngnpattern.R
import com.example.desngnpattern.proxy.dynamic_proxy.DynamicProxyActivity
import com.example.desngnpattern.proxy.static_proxy.StaticProxyActivity
import kotlinx.android.synthetic.main.activity_proxy.*

/**
 * Created by hust_twj
 * on 2020/2/5
 *
 */
class ProxyActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proxy)

        tv_static_proxy.setOnClickListener{
            startActivity(Intent(this@ProxyActivity, StaticProxyActivity::class.java))
        }

        tv_dynamic_proxy.setOnClickListener{
            startActivity(Intent(this@ProxyActivity, DynamicProxyActivity::class.java))
        }
    }
}