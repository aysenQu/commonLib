package com.aysen.lib.router;

import java.util.ArrayList;
import java.util.List;

public class RouterManager implements IRouterProvider {

    private List<IRouterProvider> mPoviders;

    private static RouterManager instance = new RouterManager();

    public static RouterManager getInstance() {
        return instance;
    }

    private RouterManager() {
        mPoviders = new ArrayList<>();
    }

    /**
     * 注册模块的路由，尽量需要在Application中执行
     * @param proviter
     */
    public void register(IRouterProvider proviter) {
        mPoviders.add(proviter);
    }

    @Override
    public void router(int router, Object... params) {
        for (IRouterProvider item : mPoviders) {
            if (item != null) {
                item.router(router, params);
            }
        }
    }

}