package com.ecommerce.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecommerce.common.utils.PageUtils;
import com.ecommerce.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

