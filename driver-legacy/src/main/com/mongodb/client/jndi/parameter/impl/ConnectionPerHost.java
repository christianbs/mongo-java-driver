package com.mongodb.client.jndi.parameter.impl;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.SupportedParameterSetter;

import java.util.Map;

public class ConnectionPerHost extends SupportedParameterSetter {

    public ConnectionPerHost(MongoClientOptions.Builder mongoClientOptions, Map.Entry option) {
        super(mongoClientOptions, option);
    }

    @Override
    public void setParameter() {
        Integer connectionsPerHost = Integer.parseInt(option.getValue().toString());
        mongoClientOptions.connectionsPerHost(connectionsPerHost);
    }
}