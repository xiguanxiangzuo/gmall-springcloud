package com.xgxz.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.pms.entity.SpuCommentEntity;


/**
 * 商品评价
 *
 * @author fengge
 * @email 1436676183@qq.com
 * @date 2020-01-03 12:07:15
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

