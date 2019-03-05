package com.example.basemoudle.arouter

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 *@Author Li Gui Yun
 *@date 2019年03月04日20:32
 *@email guiyun.li@aihuishou.com
 **/
interface HomeProvider : IProvider {


    companion object {

        const val home = "/home_module/provider"

    }

    fun jumpHomeActivity(context: Context)


    fun jumpHomeDetailActivity(context: Context, orderNo: String)



}