package com.mongodb.client.jndi.parameter;

import com.mongodb.MongoClientOptions;

import java.util.Map;

public abstract class MongoParameter {

    protected Map.Entry option;
    protected MongoClientOptions.Builder mongoClientOptions;

    public MongoParameter(MongoClientOptions.Builder mongoClientOptions, Map.Entry option) {
        this.mongoClientOptions = mongoClientOptions;
        this.option = option;
    }

    public abstract void execute();

}
