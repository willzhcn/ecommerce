package com.ecommerce.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author:
 * @createTime: 2020-07-04 23:19
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}
