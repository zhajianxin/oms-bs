package com.sinoservices.bs.configuration;

import com.sinoservices.framework.dataauthority.service.CustomDataAuthorityProviderService;
import com.sinoservices.framework.dataauthority.service.StationDataAuthorityProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboReferenceConfiguration {

    @Reference
    private CustomDataAuthorityProviderService customDataAuthorityProviderService;

    @Reference
    private StationDataAuthorityProviderService stationDataAuthorityProviderService;
}
