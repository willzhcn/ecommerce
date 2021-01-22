package com.ecommerce.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecommerce.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
