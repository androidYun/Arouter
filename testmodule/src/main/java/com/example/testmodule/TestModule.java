package com.example.testmodule;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @Author Li Gui Yun
 * @date 2019年03月05日14:51
 * @email guiyun.li@aihuishou.com
 **/
public class TestModule extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
}
