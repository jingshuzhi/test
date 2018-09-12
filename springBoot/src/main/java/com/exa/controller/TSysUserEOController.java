package com.exa.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.adc.da.base.web.BaseController;
import com.exa.entity.TSysUserEO;
import com.exa.page.TSysUserEOPage;
import com.exa.service.TSysUserEOService;

import com.adc.da.util.http.ResponseMessage;
import com.adc.da.util.http.Result;
import com.adc.da.util.http.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;

@RestController
@RequestMapping("/tSysUser")
@Api(description = "|TSysUserEO|")
public class TSysUserEOController extends BaseController<TSysUserEO>{

    private static final Logger logger = LoggerFactory.getLogger(TSysUserEOController.class);

    @Autowired
    private TSysUserEOService tSysUserEOService;

	@ApiOperation(value = "|TSysUserEO|分页查询")
    @GetMapping("/page")
    @RequiresPermissions("exa:tSysUser:page")
    public ResponseMessage<PageInfo<TSysUserEO>> page(TSysUserEOPage page) throws Exception {
        List<TSysUserEO> rows = tSysUserEOService.queryByPage(page);
        return Result.success(getPageInfo(page.getPager(), rows));
    }

	@ApiOperation(value = "|TSysUserEO|查询")
    @GetMapping("")
    @RequiresPermissions("exa:tSysUser:list")
    public ResponseMessage<List<TSysUserEO>> list(TSysUserEOPage page) throws Exception {
        return Result.success(tSysUserEOService.queryByList(page));
	}

    @ApiOperation(value = "|TSysUserEO|详情")
    @GetMapping("/{tUserId}")
    @RequiresPermissions("exa:tSysUser:get")
    public ResponseMessage<TSysUserEO> find(@PathVariable Integer tUserId) throws Exception {
        return Result.success(tSysUserEOService.selectByPrimaryKey(tUserId));
    }

    @ApiOperation(value = "|TSysUserEO|新增")
    @PostMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("exa:tSysUser:save")
    public ResponseMessage<TSysUserEO> create(@RequestBody TSysUserEO tSysUserEO) throws Exception {
        tSysUserEOService.insertSelective(tSysUserEO);
        return Result.success(tSysUserEO);
    }

    @ApiOperation(value = "|TSysUserEO|修改")
    @PutMapping(consumes = APPLICATION_JSON_UTF8_VALUE)
    @RequiresPermissions("exa:tSysUser:update")
    public ResponseMessage<TSysUserEO> update(@RequestBody TSysUserEO tSysUserEO) throws Exception {
        tSysUserEOService.updateByPrimaryKeySelective(tSysUserEO);
        return Result.success(tSysUserEO);
    }

    @ApiOperation(value = "|TSysUserEO|删除")
    @DeleteMapping("/{tUserId}")
    @RequiresPermissions("exa:tSysUser:delete")
    public ResponseMessage delete(@PathVariable Integer tUserId) throws Exception {
        tSysUserEOService.deleteByPrimaryKey(tUserId);
        logger.info("delete from t_sys_user where tUserId = {}", tUserId);
        return Result.success();
    }

}
