package com.mongodb.client.jndi.parameter.factory;

import com.mongodb.MongoClientOptions;
import com.mongodb.client.jndi.parameter.SupportedParameterSetter;
import com.mongodb.client.jndi.parameter.constant.SupportedParameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class SupportedParameterSetterFactory {

    private SupportedParameterSetterFactory() {

    }

    public static SupportedParameterSetter getInstance(MongoClientOptions.Builder mongoClientOptions, Map.Entry entry) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        SupportedParameter parameter = SupportedParameter.getMongoClientOptionParameter(entry.getKey().toString());
        if (parameter != null) {
            return (SupportedParameterSetter) parameter.getImplementation().getConstructor(MongoClientOptions.Builder.class, Map.Entry.class).newInstance(mongoClientOptions, entry);
        } else {
            throw new IllegalArgumentException("Propertie " + entry.getKey().toString() + " not supported by the MongoClientFactory");
        }
    }
}
