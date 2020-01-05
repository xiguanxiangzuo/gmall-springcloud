package com.xgxz.gmall.sms.service.impl;

import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.Query;
import com.xgxz.gmall.bean.QueryCondition;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xgxz.gmall.sms.dao.SkuFullReductionDao;
import com.xgxz.gmall.sms.entity.SkuFullReductionEntity;
import com.xgxz.gmall.sms.service.SkuFullReductionService;


@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl extends ServiceImpl<SkuFullReductionDao, SkuFullReductionEntity> implements SkuFullReductionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuFullReductionEntity> page = this.page(
                new Query<SkuFullReductionEntity>().getPage(params),
                new QueryWrapper<SkuFullReductionEntity>()
        );

        return new PageVo(page);
    }

}