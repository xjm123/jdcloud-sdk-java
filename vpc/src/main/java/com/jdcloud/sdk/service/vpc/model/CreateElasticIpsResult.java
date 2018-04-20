/*
 * Copyright 2018-2025 JDCLOUD.COM
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
 * 弹性公网ip
 * 弹性公网ip相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建一个或者多个弹性Ip
 */
public class CreateElasticIpsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性IP ID
     */
    private List<String> elasticIpIds;

    /**
     * 请求ID
     */
    private String requestId;


    /**
     * get 弹性IP ID
     *
     * @return
     */
    public List<String> getElasticIpIds() {
        return elasticIpIds;
    }

    /**
     * set 弹性IP ID
     *
     * @param elasticIpIds
     */
    public void setElasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
    }

    /**
     * get 请求ID
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * set 请求ID
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * set 弹性IP ID
     *
     * @param elasticIpIds
     */
    public CreateElasticIpsResult elasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
        return this;
    }

    /**
     * set 请求ID
     *
     * @param requestId
     */
    public CreateElasticIpsResult requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }


    /**
     * add item to 弹性IP ID
     *
     * @param elasticIpId
     */
    public void addElasticIpId(String elasticIpId) {
        if (this.elasticIpIds == null) {
            this.elasticIpIds = new ArrayList<>();
        }
        this.elasticIpIds.add(elasticIpId);
    }

}