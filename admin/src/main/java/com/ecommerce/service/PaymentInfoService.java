package com.ecommerce.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecommerce.common.utils.PageUtils;
import com.ecommerce.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:49:53
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

