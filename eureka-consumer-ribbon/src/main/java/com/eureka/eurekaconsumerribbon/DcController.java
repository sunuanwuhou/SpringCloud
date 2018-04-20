package com.eureka.eurekaconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author qiumeng
 * @Package com.eureka.eurekaconsumerribbon
 * @Description:
 * @date 2018 2018/4/16 11:47
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 因为Spring Cloud Ribbon有一个拦截器，
     * 它能够在这里进行实际调用的时候，自动的去选取服务实例，
     * 并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用。
     * @return
     */
    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

}