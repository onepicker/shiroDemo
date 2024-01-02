package com.example.shirodemo.controller;

/**
 * @author Picker
 * @date 2022/3/15 8:27
 */
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
//自定义Realm
public class UserRealm extends AuthorizingRealm {
    //执行授权逻辑
    @Override
    protected AuthorizationInfo
    doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行了=>授权逻辑PrincipalCollection");
        return null;
    }
    //执行认证逻辑
    @Override
    protected AuthenticationInfo
    doGetAuthenticationInfo(AuthenticationToken token) throws
            AuthenticationException {
        System.out.println("执行了=>认证逻辑AuthenticationToken");
        return null;
    }
}