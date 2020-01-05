package com.xgxz.gmall.pms.controller;

import java.util.Arrays;
import java.util.Map;


import com.xgxz.gmall.bean.PageVo;
import com.xgxz.gmall.bean.QueryCondition;
import com.xgxz.gmall.bean.Resp;
import com.xgxz.gmall.pms.entity.CommentReplayEntity;
import com.xgxz.gmall.pms.service.CommentReplayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;





/**
 * 商品评价回复关系
 *
 * @author fengge
 * @email 1436676183@qq.com
 * @date 2020-01-03 12:07:15
 */
@Api(tags = "商品评价回复关系 管理")
@RestController
@RequestMapping("pms/commentreplay")
public class CommentReplayController {
    @Autowired
    private CommentReplayService commentReplayService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:commentreplay:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = commentReplayService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:commentreplay:info')")
    public Resp<CommentReplayEntity> info(@PathVariable("id") Long id){
		CommentReplayEntity commentReplay = commentReplayService.getById(id);

        return Resp.ok(commentReplay);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:commentreplay:save')")
    public Resp<Object> save(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.save(commentReplay);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:commentreplay:update')")
    public Resp<Object> update(@RequestBody CommentReplayEntity commentReplay){
		commentReplayService.updateById(commentReplay);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:commentreplay:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		commentReplayService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
