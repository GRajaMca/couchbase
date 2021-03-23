package com.javabeans.io.couchbase.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories
public class CouchBaseConfig extends AbstractCouchbaseConfiguration {
    @Value("${couchbase.url}")
    private String connectionString;
    @Value("${couchbase.username}")
    private String userName;
    @Value("${couchbase.password}")
    private String password;
    @Value("${couchbase.bucket}")
    private String bucket;

    @Override
    public String getConnectionString() {
        return this.connectionString;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getBucketName() {
        return this.bucket;
    }
}
