package com.aysen.lib.demo;

import android.app.Application;

import com.aysen.lib.demo.router.DemoMainRouterProvider;
import com.aysen.lib.router.RouterManager;

/**
 * @auther: qzp
 * @date: 2020/10/19
 * @desc:
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        registerRouter();
    }

    /**
     * 注册页面路由
     */
    private void registerRouter() {
        RouterManager.getInstance().register(new DemoMainRouterProvider());
    }
}
