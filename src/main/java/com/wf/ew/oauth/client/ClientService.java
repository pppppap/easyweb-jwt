package com.wf.ew.oauth.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by wangfan on 2018-12-11 下午 3:15.
 */
public class ClientService implements ClientDetailsService, ClientRegistrationService {
    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        Client client = clientMapper.findByClientId(clientId);
        if (client == null) {
            throw new NoSuchClientException("No client with requested id: " + clientId);
        }
        return client;
    }

    @Override
    public void addClientDetails(ClientDetails clientDetails) throws ClientAlreadyExistsException {
        if (clientMapper.findByClientId(clientDetails.getClientId()) != null) {
            throw new ClientAlreadyExistsException("The client already exists");
        }
        clientMapper.save(clientDetails);
    }

    @Override
    public void updateClientDetails(ClientDetails clientDetails) throws NoSuchClientException {
        if (clientMapper.findByClientId(clientDetails.getClientId()) != null) {
            clientMapper.update(clientDetails);
        } else {
            throw new NoSuchClientException("Not Found The Client.");
        }
    }

    @Override
    public void updateClientSecret(String clientId, String secret) throws NoSuchClientException {
        Client client = clientMapper.findByClientId(clientId);
        if (client != null) {
            client.setClientSecret(passwordEncoder.encode(secret));
            clientMapper.update(client);
        } else {
            throw new NoSuchClientException("Not Found The Client.");
        }
    }

    @Override
    public void removeClientDetails(String clientId) throws NoSuchClientException {
        clientMapper.delete(clientId);
    }

    @Override
    public List<ClientDetails> listClientDetails() {
        List<ClientDetails> clientDetails = new ArrayList<>();
        clientMapper.findAll().forEach(new Consumer<Client>() {
            @Override
            public void accept(Client client) {
                clientDetails.add(client);
            }
        });
        return clientDetails;
    }

    public List<Client> findAll() {
        return clientMapper.findAll();
    }

    public Client findByClientId(String clientId) {
        return clientMapper.findByClientId(clientId);
    }
}
