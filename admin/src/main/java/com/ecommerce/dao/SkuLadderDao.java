package com.ecommerce.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecommerce.entity.SkuLadderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
