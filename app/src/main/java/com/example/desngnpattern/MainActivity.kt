package com.example.desngnpattern

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.desngnpattern.factory_method.FactoryMethodActivity
import com.example.desngnpattern.main.MainAdapter
import com.example.desngnpattern.main.MainEntity
import com.example.desngnpattern.proxy.ProxyActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = MainAdapter(this)
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = mAdapter

        mAdapter.setOnlClickListener(object : MainAdapter.OnClickListener{
            override fun onClick(index: Int) {
                when(index){

                    MainEntity.INDEX_PROXY -> startActivity(Intent(this@MainActivity, ProxyActivity::class.java))

                    MainEntity.INDEX_FACTORY_METHOD -> startActivity(Intent(this@MainActivity, FactoryMethodActivity::class.java))

                }

            }
        })

    }
}
