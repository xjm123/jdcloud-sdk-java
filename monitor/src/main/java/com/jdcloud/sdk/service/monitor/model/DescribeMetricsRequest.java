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
 * 监控项相关接口
 * 监控项相关接口，提供可用监控项列表查询和监控数据查询等功能
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据产品线查询可用监控项列表
 */
public class DescribeMetricsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源的类型，取值vm, lb, ip, database 等
     * Required:true
     */
    @Required
    private String serviceCode;


    /**
     * get 资源的类型，取值vm, lb, ip, database 等
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * set 资源的类型，取值vm, lb, ip, database 等
     *
     * @param serviceCode
     */
    public DescribeMetricsRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


}