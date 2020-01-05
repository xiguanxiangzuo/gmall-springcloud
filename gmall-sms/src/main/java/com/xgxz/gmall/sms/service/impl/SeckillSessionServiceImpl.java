package com.xgxz.gmall.sms.service.impl;

import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.Query;
import com.xgxz.gmall.bean.QueryCondition;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xgxz.gmall.sms.dao.SeckillSessionDao;
import com.xgxz.gmall.sms.entity.SeckillSessionEntity;
import com.xgxz.gmall.sms.service.SeckillSessionService;


@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionDao, SeckillSessionEntity> implements SeckillSessionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillSessionEntity> page = this.page(
                new Query<SeckillSessionEntity>().getPage(params),
                new QueryWrapper<SeckillSessionEntity>()
        );

        return new PageVo(page);
    }

}