package com.xgxz.gmall.pms.service.impl;

import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.Query;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.xgxz.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.xgxz.gmall.pms.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new Query<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );

        return new PageVo(page);
    }

}