package com.sen.hello.seata.service.impl;

import com.sen.hello.seata.api.SeataProviderTransactionService;
import com.sen.hello.seata.api.TbOrderItemService;
import com.sen.hello.seata.api.TbOrderService;
import com.sen.hello.seata.domain.TbOrder;
import com.sen.hello.seata.domain.TbOrderItem;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 13:32
 * @Description:
 */
@Service(version = "1.0.0")
public class SeataServiceImpl implements SeataProviderTransactionService {

    @Reference(version = "1.0.0")
    private TbOrderService  tbOrderService;

    @Reference(version = "1.0.0")
    private TbOrderItemService tbOrderItemService;


    @GlobalTransactional
    @Override
    public void createOrder(TbOrder order, TbOrderItem orderItem) {
        tbOrderService.insert(order);
        if (order.getUserId()== 2L) {
            throw new RuntimeException("test seata rollback");
        }
        tbOrderItemService.insert(orderItem);
    }
}
