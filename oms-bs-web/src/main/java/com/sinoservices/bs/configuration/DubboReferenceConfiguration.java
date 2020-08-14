package com.sinoservices.bs.configuration;

import com.sinoservices.bs.basicdata.service.EsRoleService;
import com.sinoservices.chainwork.upm.basicdata.service.CodeMasterService;
import com.sinoservices.chainwork.upm.organize.service.UserService;
import com.sinoservices.core.service.CodeMasterRedisService;
import com.sinoservices.core.service.LoginService;
import com.sinoservices.core.service.common.CacheRefreshService;
import com.sinoservices.framework.popwin.service.CommonQueryService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboReferenceConfiguration {

    //upm
    @Reference(id = "commonQueryService")
    private CommonQueryService commonQueryService;

    @Reference
    private LoginService loginService;

    @Reference
    private CacheRefreshService cacheRefreshService;

    @Reference
    private CodeMasterService codeMasterService;

    @Reference
    private UserService userService;

    @Reference
    private CodeMasterRedisService codeMasterRedisService;

    //oms-bs
    @Reference
    private EsRoleService esRoleService;
}
