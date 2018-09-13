package com.mongodb.client.jndi.parameter.constant;

import com.mongodb.client.jndi.parameter.impl.ConnectionPerHost;
import com.mongodb.client.jndi.parameter.impl.MaxConnectionIdleTime;
import com.mongodb.client.jndi.parameter.impl.MaxConnectionLifeTime;

public enum SupportedParameter {

    CONNECTIONS_PER_HOST("connectionsPerHost", ConnectionPerHost.class),
    MAX_CONNECTION_IDLE_TIME("maxConnectionIdleTime", MaxConnectionIdleTime.class),
    MAX_CONNECTION_LIF_ETIME("maxConnectionLifeTime", MaxConnectionLifeTime.class);

    private String attribute;
    private Class implementation;

    SupportedParameter(String attribute, Class implementation) {
        this.attribute = attribute;
        this.implementation = implementation;
    }

    public static SupportedParameter getMongoClientOptionParameter(String value) {
        for (SupportedParameter parameter : SupportedParameter.values()) {
            if (parameter.getAttribute().equals(value)) {
                return parameter;
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
