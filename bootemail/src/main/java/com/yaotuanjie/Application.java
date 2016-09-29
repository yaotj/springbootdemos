package com.yaotuanjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author tuanjie
 * @Description: 入口类 启用组件扫描，启用自动配置
 * @date 2016 2016年9月17日 下午8:09:23
 * @version 1.1
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
