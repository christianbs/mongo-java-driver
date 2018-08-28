package com.mongodb.client.jndi.parameter;

import com.mongodb.client.jndi.parameter.impl.ConnectionPerHostMongoClientOption;
import com.mongodb.client.jndi.parameter.impl.MaxConnectionIdleTimeMongoClientOption;
import com.mongodb.client.jndi.parameter.impl.MaxConnectionLifeTimeMongoClientOption;

public enum MongoClientOptionParameter {

    CONNECTIONS_PER_HOST("connectionsPerHost", ConnectionPerHostMongoClientOption.class),
    MAX_CONNECTION_IDLE_TIME("maxConnectionIdleTime", MaxConnectionIdleTimeMongoClientOption.class),
    MAX_CONNECTION_LIF_ETIME("maxConnectionLifeTime", MaxConnectionLifeTimeMongoClientOption.class);

    private String attribute;
    private Class implementation;

    MongoClientOptionParameter(String attribute, Class implementation) {
        this.attribute = attribute;
        this.implementation = implementation;
    }

    public static MongoClientOptionParameter getMongoClientOptionParameter(String value) {
        for (MongoClientOptionParameter clientOptionParameter : MongoClientOptionParameter.values()) {
            if (clientOptionParameter.getAttribute().equals(value)) {
                return clientOptionParameter;
            }
        }
        return null;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Class getImplementation() {
        return implementation;
    }

    public void setImplementation(Class implementation) {
        this.implementation = implementation;
    }
}
