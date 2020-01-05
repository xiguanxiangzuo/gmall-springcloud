package com.xgxz.gmall.pms.service.impl;

import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.Query;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.pms.dao.SpuCommentDao;
import com.xgxz.gmall.pms.entity.SpuCommentEntity;
import com.xgxz.gmall.pms.service.SpuCommentService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuCommentEntity> page = this.page(
                new Query<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

        return new PageVo(page);
    }

}