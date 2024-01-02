package com.example.shirodemo.controller;

/**
 * @author Picker
 * @date 2022/3/15 8:25
 */
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//声明为配置类
@Configuration
public class ShiroConfig {
//创建 ShiroFilterFactoryBean
//创建 DefaultWebSecurityManager
//创建 realm 对象
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();

    }
    //创建 DefaultWebSecurityManager
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager
    getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new
                DefaultWebSecurityManager();
//关联Realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }
    //创建 ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean
    getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurity
                                      Manager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new
                ShiroFilterFactoryBean();
//设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        return shiroFilterFactoryBean;
    }
}