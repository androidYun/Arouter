package com.example.homemoudle.arouter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.basemoudle.arouter.HomeProvider
import com.example.homemoudle.HomeActivity
import com.example.homemoudle.HomeDetailActivity

/**
 *@Author Li Gui Yun
 *@date 2019年03月04日20:35
 *@email guiyun.li@aihuishou.com
 **/
@Route(path = HomeProvider.home)
class HomeProviderImpl : HomeProvider {

    override fun init(context: Context?) {

    }

    override fun jumpHomeActivity(context: Context) {
        context.startActivity(Intent(context, HomeActivity::class.java))
    }


    override fun jumpHomeDetailActivity(context: Context, orderNo: String) {
        context.startActivity(Intent(context, HomeDetailActivity::class.java).apply {
            putExtras(Bundle().apply {
                putString("orderNo", orderNo)
            })
        })
    }
}