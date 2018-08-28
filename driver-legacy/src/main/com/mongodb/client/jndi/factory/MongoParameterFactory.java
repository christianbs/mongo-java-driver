package com.mongodb.client.jndi.factory;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.MongoClientOptionParameter;
import com.mongodb.client.jndi.parameter.MongoParameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class MongoParameterFactory {

    private MongoParameterFactory() {

    }

    public static MongoParameter getInstance(MongoClientOptions.Builder mongoClientOptions, Map.Entry entry) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        MongoClientOptionParameter mongoClient = MongoClientOptionParameter.getMongoClientOptionParameter(entry.getKey().toString());
        return (MongoParameter) mongoClient.getImplementation().getConstructor(MongoClientOptions.Builder.class, Map.Entry.class).newInstance(mongoClientOptions, entry);
    }
}
