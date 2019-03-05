package com.example.homemoudle

import android.app.Activity
import android.os.Bundle
import com.example.basemoudle.arouter.ARouterManger
import kotlinx.android.synthetic.main.activity_home_layout.*

/**
 *@Author Li Gui Yun
 *@date 2019年03月05日10:37
 *@email guiyun.li@aihuishou.com
 **/
class HomeDetailActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_layout)
        val orderNo = intent?.extras?.getString("orderNo") ?: ""
        tvOrderNo.text = orderNo
        tvOrderNo.setOnClickListener {
            ARouterManger.getMineProvider().jumpMineActivity(this@HomeDetailActivity, orderNo = orderNo)
        }

    }

}