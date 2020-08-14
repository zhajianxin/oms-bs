package com.sinoservices.bs;


import com.sinoservices.framework.core.CustomBeanNameGenerator;
import com.sinoservices.utils.application.ApplicationContextUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class}, scanBasePackageClasses = OmsServerApplication.class)
// 需要使用自定义规则扫描，不然ContextUtils使用会有问题
@ComponentScan(basePackages = "com.sinoservices.bs", nameGenerator = CustomBeanNameGenerator.class)
public class OmsServerApplication {

    public static void main(String[] args) {
        ApplicationContextUtils.inititializer();
        SpringApplication.run(OmsServerApplication.class, args);
    }

}
