package com.wf.ew.oauth.client;

import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import java.util.Set;
import java.util.UUID;

/**
 * 客户端实体，扩展{@link BaseClientDetails}，添加了name字段
 * Created by wangfan on 2018-12-11 下午 3:07.
 */
public class Client extends BaseClientDetails implements ClientDetails {
    private String name;
    @JsonProperty("raw_client_secret")
    @com.fasterxml.jackson.annotation.JsonProperty("raw_client_secret")
    private String rawClientSecret;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRawClientSecret() {
        return rawClientSecret;
    }

    public void setRawClientSecret(String rawClientSecret) {
        this.rawClientSecret = rawClientSecret;
    }

    public Client() {
        super();
    }

    public Client(ClientDetails prototype) {
        super(prototype);
    }

    public Client(String clientId, String resourceIds, String scopes, String grantTypes, String authorities) {
        super(clientId, resourceIds, scopes, grantTypes, authorities);
    }

    public Client(String clientId, String resourceIds, String scopes, String grantTypes, String authorities, String redirectUris) {
        super(clientId, resourceIds, scopes, grantTypes, authorities, redirectUris);
    }

    public Client(String clientId, String resourceIds, Set<String> scopes, Set<String> redirectUris, String name) {
        super(clientId, resourceIds, "", "password,refresh_token,client_credentials", "CLIENT", "");
        this.name = name;
        setScope(scopes);
        setRegisteredRedirectUri(redirectUris);
        setClientSecret(UUID.randomUUID().toString());
        setRawClientSecret(getClientSecret());
    }
}
