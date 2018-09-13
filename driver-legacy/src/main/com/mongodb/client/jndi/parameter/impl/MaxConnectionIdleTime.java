package com.mongodb.client.jndi.parameter.impl;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.SupportedParameterSetter;

import java.util.Map;

public class MaxConnectionIdleTime extends SupportedParameterSetter {

    public MaxConnectionIdleTime(MongoClientOptions.Builder mongoClientOptions, Map.Entry option) {
        super(mongoClientOptions, option);
    }

    @Override
    public void setParameter() {
        Integer connectionIdleTime = Integer.parseInt(option.getValue().toString());
        mongoClientOptions.maxConnectionIdleTime(connectionIdleTime);
    }
}
