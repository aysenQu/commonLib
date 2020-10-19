package com.aysen.lib.demo.router;

import com.aysen.demo.base.router.RouterTag;
import com.aysen.lib.router.IRouterProvider;

/**
 * @auther: qzp
 * @date: 2020/10/19
 * @desc:
 */
public class DemoMainRouterProvider implements IRouterProvider {

    @Override
    public void router(int router, Object... params) {
        if (router == RouterTag.ROUTER_MAIN) {
            goMain(params);
        }
    }

    /**
     * 去首页
     * @param params
     */
    private void goMain(Object... params) {
        
    }
}
