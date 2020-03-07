package com.sen.hello.shardingSphere.domain;

import javax.persistence.*;
import lombok.Data;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 15:54
 * @Description: 
 */
@Data
@Table(name = "tb_order_item")
public class TbOrderItem {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_item_id")
    private Long orderItemId;
}