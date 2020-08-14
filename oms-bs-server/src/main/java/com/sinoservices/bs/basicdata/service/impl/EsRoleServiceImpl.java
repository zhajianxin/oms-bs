package com.sinoservices.bs.basicdata.service.impl;

import com.sinoservices.bs.basicdata.manager.EsRoleManager;
import com.sinoservices.bs.basicdata.query.EsRoleListQueryCondition;
import com.sinoservices.bs.basicdata.service.EsRoleService;
import com.sinoservices.core.entity.paging.PagingData;
import com.sinoservices.core.service.PagingService;
import com.sinoservices.core.service.Queryable;
import com.sinoservices.framework.core.service.impl.BaseManagerImpl;
import com.sinoservices.framework.i18n.util.MessageUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Service
public class EsRoleServiceImpl extends BaseManagerImpl implements EsRoleService {

    @Autowired
    private EsRoleManager esRoleManager;

    public PagingData findRoles(Map<String, Object> param) {
        System.out.println(MessageUtils.getMessage("global.message.delete.success"));
       return PagingService.getInstance().query(param, EsRoleListQueryCondition.class,(Queryable<EsRoleListQueryCondition>)(condition, pagingInfo)->esRoleManager.query(condition, pagingInfo));
    }

}
