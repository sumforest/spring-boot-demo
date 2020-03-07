package com.sen.hello.seata.api;

import com.sen.hello.seata.domain.TbOrder;
import com.sen.hello.seata.domain.TbOrderItem;

public interface SeataProviderTransactionService {
    void createOrder(TbOrder order, TbOrderItem orderItem);
}
