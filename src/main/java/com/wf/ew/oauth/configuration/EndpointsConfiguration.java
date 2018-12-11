package com.wf.ew.oauth.configuration;

import com.wf.ew.oauth.endpoint.ClientEndpoint;
import org.springframework.context.annotation.Bean;

/**
 * Created by wangfan on 2018-12-11 下午 3:53.
 */
public class EndpointsConfiguration {

    @Bean
    public ClientEndpoint applicationEndpoint() {
        return new ClientEndpoint();
    }
}
