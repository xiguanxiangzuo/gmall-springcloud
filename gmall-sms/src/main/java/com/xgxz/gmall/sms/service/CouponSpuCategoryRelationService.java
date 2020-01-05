package com.xgxz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.sms.entity.CouponSpuCategoryRelationEntity;

/**
 * 优惠券分类关联
 *
 * @author Ï°¹ßÏò×ó
 * @email 1436676183@qq.com
 * @date 2020-01-03 15:05:43
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

