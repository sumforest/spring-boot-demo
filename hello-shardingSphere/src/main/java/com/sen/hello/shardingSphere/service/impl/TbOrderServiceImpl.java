package com.sen.hello.shardingSphere.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sen.hello.shardingSphere.mapper.TbOrderMapper;
import com.sen.hello.shardingSphere.api.TbOrderService;
/**
 * @Auther: Sen
 * @Date: 2020/3/7 15:54
 * @Description: 
 */
@Service
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

}
