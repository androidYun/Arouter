package com.guiyunli.pjt

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 *@Author Li Gui Yun
 *@date 2019年03月04日21:05
 *@email guiyun.li@aihuishou.com
 **/
class MainApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }

}