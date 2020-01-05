package com.xgxz.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.sms.entity.SeckillSkuNoticeEntity;


/**
 * 秒杀商品通知订阅
 *
 * @author Ï°¹ßÏò×ó
 * @email 1436676183@qq.com
 * @date 2020-01-03 15:05:43
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageVo queryPage(QueryCondition params);
}

