package com.ecommerce.feign;

import com.ecommerce.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author:
 * @createTime: 2020-07-06 23:28
 **/

@FeignClient("order")
public interface OrderFeignService {

    @GetMapping(value = "/order/status/{orderSn}")
    R getOrderStatus(@PathVariable("orderSn") String orderSn);

}
