package com.lg.springcloud.study;

public class UserClient {

    private UserProperties userProperties;

    public UserClient() {
    }

    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public String getName() {
        return this.userProperties.getName();
    }
}
