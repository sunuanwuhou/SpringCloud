package com.eureka.eurekaconsumerfeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiumeng
 * @Package com.eureka.eurekaconsumerfeign
 * @Description:
 * @date 2018 2018/4/16 13:49
 */
//这个接口所要调用的服务名称
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
