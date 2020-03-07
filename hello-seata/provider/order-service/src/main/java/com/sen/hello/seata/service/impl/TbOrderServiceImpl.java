package com.sen.hello.seata.service.impl;

import com.sen.hello.seata.api.TbOrderService;
import com.sen.hello.seata.domain.TbOrder;
import com.sen.hello.seata.service.mapper.TbOrderMapper;
import org.apache.dubbo.config.annotation.Service;
import javax.annotation.Resource;

@Service(version = "1.0.0")
public class TbOrderServiceImpl implements TbOrderService {

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Override
    public void insert(TbOrder order) {
        tbOrderMapper.insert(order);
    }
}
