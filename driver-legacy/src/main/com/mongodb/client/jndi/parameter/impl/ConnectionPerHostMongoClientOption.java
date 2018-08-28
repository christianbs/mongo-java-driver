package com.mongodb.client.jndi.parameter.impl;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.MongoParameter;

import java.util.Map;

public class ConnectionPerHostMongoClientOption extends MongoParameter {


    public ConnectionPerHostMongoClientOption(MongoClientOptions.Builder mongoClientOptions, Map.Entry option) {
        super(mongoClientOptions, option);
    }

    @Override
    public void execute() {
        Integer connectionsPerHost = Integer.parseInt(option.getValue().toString());
        mongoClientOptions.connectionsPerHost(connectionsPerHost);
    }
}
