package com.wf.ew.oauth.configuration;

import com.wf.ew.oauth.endpoint.ClientEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangfan on 2018-12-11 下午 3:53.
 */
@Configuration
public class EndpointsConfiguration {

    @Bean
    public ClientEndpoint clientEndpoint() {
        return new ClientEndpoint();
    }
}
