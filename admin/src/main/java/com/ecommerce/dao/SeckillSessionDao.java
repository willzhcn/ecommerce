package com.ecommerce.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecommerce.entity.SeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
