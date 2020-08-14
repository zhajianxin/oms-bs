package com.sinoservices.bs.basicdata.service;

import com.sinoservices.core.entity.paging.PagingData;

import java.io.Serializable;
import java.util.Map;


public interface EsRoleService extends Serializable {

    PagingData findRoles(Map<String, Object> param);

}
