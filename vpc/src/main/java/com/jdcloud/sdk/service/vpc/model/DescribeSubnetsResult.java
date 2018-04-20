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
 * 子网
 * 子网相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vpc.model.Subnet;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询子网列表
 */
public class DescribeSubnetsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * subnets
     */
    private List<Subnet> subnets;

    /**
     * 总数量
     */
    private Number totalCount;


    /**
     * get subnets
     *
     * @return
     */
    public List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * set subnets
     *
     * @param subnets
     */
    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set subnets
     *
     * @param subnets
     */
    public DescribeSubnetsResult subnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeSubnetsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to subnets
     *
     * @param subnet
     */
    public void addSubnet(Subnet subnet) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnet);
    }

}