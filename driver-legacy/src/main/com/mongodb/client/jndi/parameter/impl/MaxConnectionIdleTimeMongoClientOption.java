package com.mongodb.client.jndi.parameter.impl;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.MongoParameter;

import java.util.Map;

public class MaxConnectionIdleTimeMongoClientOption extends MongoParameter {

    public MaxConnectionIdleTimeMongoClientOption(MongoClientOptions.Builder mongoClientOptions, Map.Entry option) {
        super(mongoClientOptions, option);
    }

    @Override
    public void execute() {
        Integer connectionIdleTime = Integer.parseInt(option.getValue().toString());
        mongoClientOptions.maxConnectionIdleTime(connectionIdleTime);
    }
}
