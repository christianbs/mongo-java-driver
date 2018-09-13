package com.mongodb.client.jndi.parameter.impl;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.SupportedParameterSetter;

import java.util.Map;

public class MaxConnectionLifeTime extends SupportedParameterSetter {

    public MaxConnectionLifeTime(MongoClientOptions.Builder mongoClientOptions, Map.Entry option) {
        super(mongoClientOptions, option);
    }

    @Override
    public void setParameter() {
        Integer connectionLifeTime = Integer.parseInt(option.getValue().toString());
        mongoClientOptions.maxConnectionLifeTime(connectionLifeTime);
    }
}
