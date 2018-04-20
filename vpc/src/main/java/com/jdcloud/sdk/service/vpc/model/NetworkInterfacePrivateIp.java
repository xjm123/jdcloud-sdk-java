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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;


/**
 * networkInterfacePrivateIp
 */
public class NetworkInterfacePrivateIp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 私有IP的IPV4地址
     */
    private String privateIpAddress;

    /**
     * 弹性IP实例ID
     */
    private String elasticIpId;

    /**
     * 弹性IP实例地址
     */
    private String elasticIpAddress;


    /**
     * get 私有IP的IPV4地址
     *
     * @return
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * set 私有IP的IPV4地址
     *
     * @param privateIpAddress
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * get 弹性IP实例ID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性IP实例ID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 弹性IP实例地址
     *
     * @return
     */
    public String getElasticIpAddress() {
        return elasticIpAddress;
    }

    /**
     * set 弹性IP实例地址
     *
     * @param elasticIpAddress
     */
    public void setElasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
    }


    /**
     * set 私有IP的IPV4地址
     *
     * @param privateIpAddress
     */
    public NetworkInterfacePrivateIp privateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * set 弹性IP实例ID
     *
     * @param elasticIpId
     */
    public NetworkInterfacePrivateIp elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 弹性IP实例地址
     *
     * @param elasticIpAddress
     */
    public NetworkInterfacePrivateIp elasticIpAddress(String elasticIpAddress) {
        this.elasticIpAddress = elasticIpAddress;
        return this;
    }


}