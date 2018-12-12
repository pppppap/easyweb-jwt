package com.wf.ew.oauth.endpoint;

import com.wf.ew.oauth.client.Client;
import com.wf.ew.oauth.client.ClientService;
import com.wf.ew.oauth.configuration.ResourceServerConfiguration;
import com.wf.ew.oauth.endpoint.support.ClientParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by wangfan on 2018-12-11 下午 3:49.
 */
@FrameworkEndpoint
@ResponseBody
public class ClientEndpoint {
    @Autowired
    private ClientService clientService;

    // 查询所有
    @GetMapping("${ew.api.version}/oauth/client")
    public Object list() {
        return getJR(200, "query success", clientService.findAll());
    }

    // 添加
    @PostMapping("${ew.api.version}/oauth/client")
    public Object add(@RequestBody ClientParam param) {
        param.populateDefault();
        Client client = new Client(
                UUID.randomUUID().toString(),
                ResourceServerConfiguration.RESOURCE_NAME,
                param.getScope(),
                param.getRedirectUri(),
                param.getName()
        );
        clientService.addClientDetails(client);
        return getJR(200, "add success");
    }

    // 根据clientId查询
    @GetMapping("${ew.api.version}/oauth/client/{clientId}")
    public Object get(@PathVariable String clientId) {
        return getJR(200, "query success", clientService.loadClientByClientId(clientId));
    }

    // 修改
    @PutMapping("${ew.api.version}/oauth/client/{clientId}")
    public Object update(@PathVariable String clientId, @RequestBody ClientParam param) {
        Client client = clientService.findByClientId(clientId);
        if (client == null) {
            throw new NoSuchClientException("Not Found The Client.");
        }
        param.populateDefault();
        if (!StringUtils.isEmpty(param.getName())) {
            client.setName(param.getName());
        }
        if (param.getRedirectUri() != null) {
            client.setRegisteredRedirectUri(param.getRedirectUri());
        }

        if (param.getScope() != null) {
            client.setScope(param.getScope());
        }
        clientService.updateClientDetails(client);
        return getJR(200, "update success");
    }

    // 删除
    @DeleteMapping("${ew.api.version}/oauth/client/{clientId}")
    public Object delete(@PathVariable String clientId) {
        clientService.removeClientDetails(clientId);
        return getJR(200, "delete success");
    }

    private Map getJR(int code, String msg, Object data) {
        Map map = new HashMap<String, Object>();
        map.put("code", code);
        map.put("msg", msg);
        if (data != null) {
            map.put("data", data);
        }
        return map;
    }

    private Map getJR(int code, String msg) {
        return getJR(code, msg, null);
    }
}
