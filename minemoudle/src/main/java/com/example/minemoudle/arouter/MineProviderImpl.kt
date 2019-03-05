package com.example.minemoudle.arouter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.basemoudle.arouter.MineProvider
import com.example.minemoudle.FeedBookActivity

/**
 *@Author Li Gui Yun
 *@date 2019年03月05日16:06
 *@email guiyun.li@aihuishou.com
 **/
@Route(path = MineProvider.mine)
class MineProviderImpl : MineProvider {

    override fun init(context: Context?) {

    }

    override fun jumpMineActivity(context: Context, orderNo: String) {
        context.startActivity(Intent(context, FeedBookActivity::class.java).apply {
            putExtras(Bundle().apply {
                putString("orderNo", orderNo)
            })
        })
    }
}