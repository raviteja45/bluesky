package com.home.bluesky;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.home.bluesky.resource.BlueSkyResource;

@Configuration
public class JerseyConfig extends ResourceConfig{

public JerseyConfig() {
        
        register(BlueSkyResource.class);
    }
}
