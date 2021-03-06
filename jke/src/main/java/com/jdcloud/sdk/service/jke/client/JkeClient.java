/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jke
 * k8s 集群服务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jke.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.jke.model.DescribeQuotasRequest;
import com.jdcloud.sdk.service.jke.model.DescribeQuotasResponse;
import com.jdcloud.sdk.service.jke.client.DescribeQuotasExecutor;

/**
 * jkeClient
 */
public class JkeClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.1";
    public final static String DefaultEndpoint = "openapi.jks.jcloud.com";
    public final static String ServiceName = "jke";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private JkeClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询(k8s 集群)配额
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeQuotasResponse describeQuotas(DescribeQuotasRequest request) throws JdcloudSdkException {
        return new DescribeQuotasExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public JkeClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private JkeClient jkeClient;

        public DefaultBuilder() {
            jkeClient = new JkeClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            jkeClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            jkeClient.httpRequestConfig = config;
            return this;
        }

        public JkeClient build() throws JdcloudSdkException {

            if (jkeClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                jkeClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (jkeClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("JkeClient build error: jdcloud credentials provider not set");
                }
            }
            if (jkeClient.httpRequestConfig == null) {
                jkeClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (jkeClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("JkeClient build error: http request config not set");
                }
            }
            return jkeClient;
        }

        public Builder environment(Environment environment) {
            jkeClient.environment = environment;
            return this;
        }
    }
}
