package com.lhfeiyu.tech.im.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author airson
 */
@Component
@RefreshScope
//@ConfigurationProperties(prefix = "tech.config")
public class TechBlogProviderProperties {

    /*private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }*/

    @Value("${tech.im.config.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
