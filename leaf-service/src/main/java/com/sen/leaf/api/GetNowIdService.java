package com.sen.leaf.api;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 18:26
 * @Description:
 */
public interface GetNowIdService {

    /**
     * 请求Leaf节点获取雪花id
     * @return
     */
    String getNowId();
}
