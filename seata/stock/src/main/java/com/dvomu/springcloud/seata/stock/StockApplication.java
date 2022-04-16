package com.dvomu.springcloud.seata.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: dvomu
 * @create: 2022-04-17
 */
@MapperScan("com.dvomu.springcloud.seata.stock.mapper")
@SpringBootApplication
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class);
    }
}
