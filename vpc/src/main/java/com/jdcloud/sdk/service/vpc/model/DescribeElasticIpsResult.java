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
import com.jdcloud.sdk.service.vpc.model.ElasticIp;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询弹性ip列表
 */
public class DescribeElasticIpsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * elasticIps
     */
    private List<ElasticIp> elasticIps;

    /**
     * 总数量
     */
    private Integer totalCount;


    /**
     * get elasticIps
     *
     * @return
     */
    public List<ElasticIp> getElasticIps() {
        return elasticIps;
    }

    /**
     * set elasticIps
     *
     * @param elasticIps
     */
    public void setElasticIps(List<ElasticIp> elasticIps) {
        this.elasticIps = elasticIps;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set elasticIps
     *
     * @param elasticIps
     */
    public DescribeElasticIpsResult elasticIps(List<ElasticIp> elasticIps) {
        this.elasticIps = elasticIps;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeElasticIpsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to elasticIps
     *
     * @param elasticIp
     */
    public void addElasticIp(ElasticIp elasticIp) {
        if (this.elasticIps == null) {
            this.elasticIps = new ArrayList<>();
        }
        this.elasticIps.add(elasticIp);
    }

}