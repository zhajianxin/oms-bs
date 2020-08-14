package com.sinoservices.bs.basicdata.controller;

import com.sinoservices.bs.basicdata.service.EsRoleService;
import com.sinoservices.core.entity.paging.PagingData;
import com.sinoservices.phoenix.security.context.UserContextHolder;
import com.sinoservices.phoenix.security.context.user.UserDetails;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

@Controller
@Scope(WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = "/esRoleController", produces = {"application/json;charset=UTF-8"})
public class EsRole2Controller implements InitializingBean {

    @Autowired
    private EsRoleService esRoleService;

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "hello";
    }
    /**
     * 查询角色
     *
     * @param param
     * @return
     */
    @SuppressWarnings("rawtypes")
    @ResponseBody
    @RequestMapping(value = "/findRoles")
    public PagingData findRoles(@RequestParam Map<String, Object> param) {
        UserDetails userDetails = UserContextHolder.getCurrentUser();
        param.put("esroEscoId",userDetails.getOrgId());
        return esRoleService.findRoles(param);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(1);
    }

}
