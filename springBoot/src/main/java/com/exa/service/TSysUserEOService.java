package com.exa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.adc.da.base.service.BaseService;
import com.exa.dao.TSysUserEODao;
import com.exa.entity.TSysUserEO;


/**
 *
 * <br>
 * <b>功能：</b>t_sys_user TSysUserEOService<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-09-07 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
@Service("tSysUserEOService")
@Transactional(value = "transactionManager", readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
public class TSysUserEOService extends BaseService<TSysUserEO, Integer> {

    private static final Logger logger = LoggerFactory.getLogger(TSysUserEOService.class);

    @Autowired
    private TSysUserEODao dao;

    public TSysUserEODao getDao() {
        return dao;
    }

}
