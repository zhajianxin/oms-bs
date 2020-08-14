package com.sinoservices.bs.basicdata.manager;

import com.sinoservices.beans.PagingInfo;
import com.sinoservices.beans.QueryData;
import com.sinoservices.bs.basicdata.query.EsRoleListQueryCondition;
import com.sinoservices.framework.core.service.BaseManager;


public interface EsRoleManager extends BaseManager {

    QueryData query(EsRoleListQueryCondition condition, PagingInfo pagingInfo);

}
