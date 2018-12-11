package com.wf.ew.oauth.endpoint;

import com.wf.ew.oauth.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangfan on 2018-12-11 下午 3:49.
 */
@FrameworkEndpoint
@ResponseBody
public class ClientEndpoint {
    @Autowired
    private ClientService clientService;
}
