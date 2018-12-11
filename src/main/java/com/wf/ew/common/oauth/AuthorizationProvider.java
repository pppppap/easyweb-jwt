package com.wf.ew.common.oauth;

import com.wf.ew.oauth.provider.UrlRegistryProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

/**
 * Created by wangfan on 2018-12-11 下午 4:40.
 */
public class AuthorizationProvider implements UrlRegistryProvider {

    @Override
    public boolean configure(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
        config.antMatchers("/druid/**").permitAll();
        return true;
    }
}
