package com.xgxz.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.pms.entity.AttrGroupEntity;


/**
 * 属性分组
 *
 * @author fengge
 * @email 1436676183@qq.com
 * @date 2020-01-03 12:07:15
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

