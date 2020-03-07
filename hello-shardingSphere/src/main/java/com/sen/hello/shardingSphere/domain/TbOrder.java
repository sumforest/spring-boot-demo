package com.sen.hello.shardingSphere.domain;

import javax.persistence.*;
import lombok.Data;

/**
 * @Auther: Sen
 * @Date: 2020/3/7 15:54
 * @Description: 
 */
@Data
@Table(name = "tb_order")
public class TbOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_id")
    private Long userId;
}