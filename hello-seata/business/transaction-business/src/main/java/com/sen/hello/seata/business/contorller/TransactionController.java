package com.sen.hello.seata.business.contorller;

import com.sen.hello.seata.api.SeataProviderTransactionService;
import com.sen.hello.seata.domain.TbOrder;
import com.sen.hello.seata.domain.TbOrderItem;
import org.apache.dubbo.config.annotation.Reference;
import org.aspectj.weaver.ast.Or;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 13:56
 * @Description:
 */
@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Reference(version = "1.0.0")
    private SeataProviderTransactionService seataProviderTransactionService;

    @GetMapping
    public String testTransaction(){
        TbOrder tbOrder = new TbOrder();
        tbOrder.setUserId(2L);
        tbOrder.setOrderId(1);

        TbOrderItem tbOrderItem = new TbOrderItem();
        tbOrderItem.setOrderId(1L);
        tbOrderItem.setUserId(2L);
        tbOrderItem.setOrderItemId(1);

        seataProviderTransactionService.createOrder(tbOrder, tbOrderItem);

        return "ok";
    }
}
