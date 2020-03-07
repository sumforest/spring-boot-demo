package com.sen.hello.shardingSphere.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sen.hello.shardingSphere.mapper.TbOrderItemMapper;
import com.sen.hello.shardingSphere.api.TbOrderItemService;
/**
 * @Auther: Sen
 * @Date: 2020/3/7 15:54
 * @Description: 
 */
@Service
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

}
