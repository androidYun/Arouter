package com.guiyunli.pjt;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Author Li Gui Yun
 * @date 2019年03月05日14:08
 * @email guiyun.li@aihuishou.com
 **/
public class SchameFilterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri uri = getIntent().getData();
        ARouter.getInstance().build(uri).navigation();
        finish();
    }
}
