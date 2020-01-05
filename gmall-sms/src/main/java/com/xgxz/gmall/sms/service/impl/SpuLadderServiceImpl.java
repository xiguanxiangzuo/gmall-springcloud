package com.xgxz.gmall.sms.service.impl;

import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.Query;
import com.xgxz.gmall.bean.QueryCondition;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xgxz.gmall.sms.dao.SpuLadderDao;
import com.xgxz.gmall.sms.entity.SpuLadderEntity;
import com.xgxz.gmall.sms.service.SpuLadderService;


@Service("spuLadderService")
public class SpuLadderServiceImpl extends ServiceImpl<SpuLadderDao, SpuLadderEntity> implements SpuLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuLadderEntity> page = this.page(
                new Query<SpuLadderEntity>().getPage(params),
                new QueryWrapper<SpuLadderEntity>()
        );

        return new PageVo(page);
    }

}