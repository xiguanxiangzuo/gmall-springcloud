package com.xgxz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.sms.entity.CouponHistoryEntity;


/**
 * 优惠券领取历史记录
 *
 * @author Ï°¹ßÏò×ó
 * @email 1436676183@qq.com
 * @date 2020-01-03 15:05:43
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

