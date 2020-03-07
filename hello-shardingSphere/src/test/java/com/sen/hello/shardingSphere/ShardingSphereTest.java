package com.sen.hello.shardingSphere;

import com.sen.hello.shardingSphere.domain.TbOrder;
import com.sen.hello.shardingSphere.mapper.TbOrderItemMapper;
import com.sen.hello.shardingSphere.mapper.TbOrderMapper;
import com.sen.leaf.api.GetNowIdService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 16:00
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingSphereTest {

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Reference(version = "1.0.0")
    private GetNowIdService getNowIdService;


    @Test
    public void testInsert() {
        TbOrder tbOrder = new TbOrder();
        String snowFlak = getNowIdService.getNowId();
        if (!snowFlak.isEmpty()) {
            tbOrder.setId(Long.valueOf(snowFlak));
        }
        tbOrder.setOrderId(1);
        tbOrder.setUserId(1L);

        tbOrderMapper.insert(tbOrder);
    }

    @Test
    public void testInsert2() {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(2);
        tbOrder.setUserId(2L);

        tbOrderMapper.insert(tbOrder);
    }

    @Test
    public void testSelect() {
        Optional.ofNullable(tbOrderMapper.selectAll()).ifPresent(System.out::println);
    }
}
