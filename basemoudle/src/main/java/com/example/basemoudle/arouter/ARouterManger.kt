package com.example.basemoudle.arouter

import com.alibaba.android.arouter.launcher.ARouter

/**
 *@Author Li Gui Yun
 *@date 2019年03月04日21:01
 *@email guiyun.li@aihuishou.com
 **/
object ARouterManger {

    fun getHomeProvider(): HomeProvider {

        return ARouter.getInstance().build(HomeProvider.home).navigation() as HomeProvider
    }


    fun getMineProvider(): MineProvider {

        return ARouter.getInstance().build(MineProvider.mine).navigation() as MineProvider
    }
}