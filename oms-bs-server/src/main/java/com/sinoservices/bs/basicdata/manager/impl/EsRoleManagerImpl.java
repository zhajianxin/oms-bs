package com.sinoservices.bs.basicdata.manager.impl;

import com.sinoservices.beans.PagingInfo;
import com.sinoservices.beans.QueryData;
import com.sinoservices.bs.basicdata.manager.EsRoleManager;
import com.sinoservices.bs.basicdata.query.EsRoleListQueryCondition;
import com.sinoservices.framework.core.service.impl.BaseManagerImpl;
import org.springframework.stereotype.Service;

@Service
public class EsRoleManagerImpl extends BaseManagerImpl implements EsRoleManager {

    @Override
    public QueryData query(EsRoleListQueryCondition condition, PagingInfo pagingInfo) {
        QueryData queryData = new QueryData();
        queryData.setDataList(dao.query(condition, com.sinoservices.bs.basicdata.query.EsRoleListQueryItem.class, pagingInfo));
        queryData.setPagingInfo(pagingInfo);
        return queryData;
    }

}
