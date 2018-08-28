package com.mongodb.client.jndi.parameter.impl;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.MongoParameter;

import java.util.Map;

public class MaxConnectionLifeTimeMongoClientOption extends MongoParameter {

    public MaxConnectionLifeTimeMongoClientOption(MongoClientOptions.Builder mongoClientOptions, Map.Entry option) {
        super(mongoClientOptions, option);
    }

    @Override
    public void execute() {
        Integer connectionLifeTime = Integer.parseInt(option.getValue().toString());
        mongoClientOptions.maxConnectionLifeTime(connectionLifeTime);
    }
}
