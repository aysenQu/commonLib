package com.aysen.lib.router;

public interface IRouterProvider {
    /**
     * 路由
     * @param router 指定的页面或者事件
     * @param params 参数数组
     */
    void router(int router, Object...params);
}