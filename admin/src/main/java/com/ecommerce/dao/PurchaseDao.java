package com.ecommerce.dao;

import com.ecommerce.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:55:33
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
