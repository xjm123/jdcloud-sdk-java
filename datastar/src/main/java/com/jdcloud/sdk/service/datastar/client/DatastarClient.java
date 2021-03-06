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
 * 知客相关API
 * 知客相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.datastar.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.datastar.model.GetPackageIdRequest;
import com.jdcloud.sdk.service.datastar.model.GetPackageIdResponse;
import com.jdcloud.sdk.service.datastar.client.GetPackageIdExecutor;
import com.jdcloud.sdk.service.datastar.model.GetLargeScreenDataRequest;
import com.jdcloud.sdk.service.datastar.model.GetLargeScreenDataResponse;
import com.jdcloud.sdk.service.datastar.client.GetLargeScreenDataExecutor;

/**
 * datastarClient
 */
public class DatastarClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.6";
    public final static String DefaultEndpoint = "datastar.cn-south-1.jdcloud-api.com";
    public final static String ServiceName = "datastar";
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

    private DatastarClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 根据设备ID查询人群包ID
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetPackageIdResponse getPackageId(GetPackageIdRequest request) throws JdcloudSdkException {
        return new GetPackageIdExecutor().client(this).execute(request);
    }

    /**
     * 根据区域、行业、一级指标、二级指标、起始时间等条件查询数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetLargeScreenDataResponse getLargeScreenData(GetLargeScreenDataRequest request) throws JdcloudSdkException {
        return new GetLargeScreenDataExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public DatastarClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private DatastarClient datastarClient;

        public DefaultBuilder() {
            datastarClient = new DatastarClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            datastarClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            datastarClient.httpRequestConfig = config;
            return this;
        }

        public DatastarClient build() throws JdcloudSdkException {

            if (datastarClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                datastarClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (datastarClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("DatastarClient build error: jdcloud credentials provider not set");
                }
            }
            if (datastarClient.httpRequestConfig == null) {
                datastarClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (datastarClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("DatastarClient build error: http request config not set");
                }
            }
            return datastarClient;
        }

        public Builder environment(Environment environment) {
            datastarClient.environment = environment;
            return this;
        }
    }
}
