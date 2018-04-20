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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * networkInterfaceSpec
 */
public class NetworkInterfaceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子网ID
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 可用区，用户的默认可用区
     */
    private String az;

    /**
     * 网卡主私IP
     */
    private String primaryIpAddress;

    /**
     * SecondaryIp列表
     */
    private List<String> secondaryIpAddresses;

    /**
     * 自动分配的SecondaryIp数量
     */
    private Integer secondaryIpCount;

    /**
     * 安全组ID列表
     */
    private List<String> securityGroups;

    /**
     * 源和目标IP地址校验，取值为0或者1，默认为1
     */
    private Integer sanityCheck;

    /**
     * 描述
     */
    private String description;


    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 可用区，用户的默认可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区，用户的默认可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 网卡主私IP
     *
     * @return
     */
    public String getPrimaryIpAddress() {
        return primaryIpAddress;
    }

    /**
     * set 网卡主私IP
     *
     * @param primaryIpAddress
     */
    public void setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
    }

    /**
     * get SecondaryIp列表
     *
     * @return
     */
    public List<String> getSecondaryIpAddresses() {
        return secondaryIpAddresses;
    }

    /**
     * set SecondaryIp列表
     *
     * @param secondaryIpAddresses
     */
    public void setSecondaryIpAddresses(List<String> secondaryIpAddresses) {
        this.secondaryIpAddresses = secondaryIpAddresses;
    }

    /**
     * get 自动分配的SecondaryIp数量
     *
     * @return
     */
    public Integer getSecondaryIpCount() {
        return secondaryIpCount;
    }

    /**
     * set 自动分配的SecondaryIp数量
     *
     * @param secondaryIpCount
     */
    public void setSecondaryIpCount(Integer secondaryIpCount) {
        this.secondaryIpCount = secondaryIpCount;
    }

    /**
     * get 安全组ID列表
     *
     * @return
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * set 安全组ID列表
     *
     * @param securityGroups
     */
    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    /**
     * get 源和目标IP地址校验，取值为0或者1，默认为1
     *
     * @return
     */
    public Integer getSanityCheck() {
        return sanityCheck;
    }

    /**
     * set 源和目标IP地址校验，取值为0或者1，默认为1
     *
     * @param sanityCheck
     */
    public void setSanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
    }

    /**
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public NetworkInterfaceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 可用区，用户的默认可用区
     *
     * @param az
     */
    public NetworkInterfaceSpec az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 网卡主私IP
     *
     * @param primaryIpAddress
     */
    public NetworkInterfaceSpec primaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
        return this;
    }

    /**
     * set SecondaryIp列表
     *
     * @param secondaryIpAddresses
     */
    public NetworkInterfaceSpec secondaryIpAddresses(List<String> secondaryIpAddresses) {
        this.secondaryIpAddresses = secondaryIpAddresses;
        return this;
    }

    /**
     * set 自动分配的SecondaryIp数量
     *
     * @param secondaryIpCount
     */
    public NetworkInterfaceSpec secondaryIpCount(Integer secondaryIpCount) {
        this.secondaryIpCount = secondaryIpCount;
        return this;
    }

    /**
     * set 安全组ID列表
     *
     * @param securityGroups
     */
    public NetworkInterfaceSpec securityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * set 源和目标IP地址校验，取值为0或者1，默认为1
     *
     * @param sanityCheck
     */
    public NetworkInterfaceSpec sanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public NetworkInterfaceSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * add item to SecondaryIp列表
     *
     * @param secondaryIpAddresse
     */
    public void addSecondaryIpAddresse(String secondaryIpAddresse) {
        if (this.secondaryIpAddresses == null) {
            this.secondaryIpAddresses = new ArrayList<>();
        }
        this.secondaryIpAddresses.add(secondaryIpAddresse);
    }

    /**
     * add item to 安全组ID列表
     *
     * @param securityGroup
     */
    public void addSecurityGroup(String securityGroup) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroup);
    }

}