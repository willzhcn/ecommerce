package com.ecommerce.feign;

import com.ecommerce.common.utils.R;
import com.ecommerce.vo.MemberAddressVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author:
 * @createTime: 2020-07-03 19:14
 **/

@FeignClient("member")
public interface MemberFeignService {

    /**
     * 根据id获取用户地址信息
     * @param id
     * @return
     */
    @RequestMapping("/memberreceiveaddress/info/{id}")
    R info(@PathVariable("id") Long id);

    /**
     * 查询当前用户的全部收货地址
     * @param memberId
     * @return
     */
    @GetMapping(value = "/memberreceiveaddress/{memberId}/address")
    List<MemberAddressVo> getAddress(@PathVariable("memberId") Long memberId);
}
