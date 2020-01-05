package com.xgxz.gmall.pms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xgxz.gmall.pms.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author fengge
 * @email 1436676183@qq.com
 * @date 2020-01-03 12:07:15
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
