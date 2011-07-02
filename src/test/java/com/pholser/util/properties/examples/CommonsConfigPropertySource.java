package com.pholser.util.properties.examples;

import com.pholser.util.properties.PropertySource;
import org.apache.commons.configuration.Configuration;

class CommonsConfigPropertySource implements PropertySource {
    private final Configuration config;

    CommonsConfigPropertySource(Configuration config) {
        this.config = config;
    }

    @Override
    public Object propertyFor(String key) {
        return config.getProperty(key);
    }
}
