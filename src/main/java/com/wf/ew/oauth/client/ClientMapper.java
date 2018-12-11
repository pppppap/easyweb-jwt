package com.wf.ew.oauth.client;

import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.List;

/**
 * Created by wangfan on 2018-12-11 下午 3:11.
 */
public interface ClientMapper {
    Client save(ClientDetails t);

    Client findByClientId(String clientId);

    Client update(ClientDetails t);

    List<Client> findAll();

    // List<T> findAll(int pageNo, int pageSize);

    void delete(String clientId);
}
