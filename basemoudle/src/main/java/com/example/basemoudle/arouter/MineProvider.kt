package com.example.basemoudle.arouter

import android.content.Context
import com.alibaba.android.arouter.facade.template.IProvider

/**
 *@Author Li Gui Yun
 *@date 2019年03月04日20:32
 *@email guiyun.li@aihuishou.com
 **/
interface MineProvider : IProvider {


    override fun init(context: Context?) {

    }

    companion object {

        const val mine = "/mine_module/provider"

    }

    fun jumpMineActivity(context: Context, orderNo: String)


}