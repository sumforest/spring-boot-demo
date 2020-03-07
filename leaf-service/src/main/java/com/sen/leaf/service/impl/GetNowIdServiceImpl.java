package com.sen.leaf.service.impl;

import com.sen.leaf.api.GetNowIdService;
import com.sen.leaf.utils.OkHttpUtils;
import okhttp3.Response;
import org.apache.dubbo.config.annotation.Service;

import java.io.IOException;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 18:25
 * @Description:
 */
@Service(version = "1.0.0")
public class GetNowIdServiceImpl implements GetNowIdService {

    private static final String URL ="http://192.168.161.140:8080/api/snowflake/get/id";

    @Override
    public String getNowId() {
        OkHttpUtils client = OkHttpUtils.getInstance();
        Response data = client.getData(URL);
        try {
            assert data.body() != null;
            return data.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
