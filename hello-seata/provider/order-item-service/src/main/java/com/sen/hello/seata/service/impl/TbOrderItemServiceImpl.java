package com.sen.hello.seata.service.impl;

import com.sen.hello.seata.domain.TbOrderItem;
import com.sen.hello.seata.api.TbOrderItemService;
import com.sen.hello.seata.service.mapper.TbOrderItemMapper;
import org.apache.dubbo.config.annotation.Service;
import javax.annotation.Resource;

@Service(version = "1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService {

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem orderItem) {
        tbOrderItemMapper.insert(orderItem);
    }
}
