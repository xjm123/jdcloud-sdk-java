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

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * cacheInstanceSpec
 */
public class CacheInstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 所属VPC的ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 所属子网的ID
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     * Required:true
     */
    @Required
    private String cacheInstanceName;

    /**
     * 实例规格代码，参见实例规格代码表。
     * Required:true
     */
    @Required
    private String cacheInstanceClass;

    /**
     * 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符
     * Required:true
     */
    @Required
    private String password;

    /**
     * 缓存Redis实例所在区域可用区ID信息
     * Required:true
     */
    @Required
    private AzIdSpec azId;

    /**
     * 缓存Redis实例描述
     */
    private String cacheInstanceDescription;


    /**
     * get 所属VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 所属子网的ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     *
     * @return
     */
    public String getCacheInstanceName() {
        return cacheInstanceName;
    }

    /**
     * set 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     *
     * @param cacheInstanceName
     */
    public void setCacheInstanceName(String cacheInstanceName) {
        this.cacheInstanceName = cacheInstanceName;
    }

    /**
     * get 实例规格代码，参见实例规格代码表。
     *
     * @return
     */
    public String getCacheInstanceClass() {
        return cacheInstanceClass;
    }

    /**
     * set 实例规格代码，参见实例规格代码表。
     *
     * @param cacheInstanceClass
     */
    public void setCacheInstanceClass(String cacheInstanceClass) {
        this.cacheInstanceClass = cacheInstanceClass;
    }

    /**
     * get 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 缓存Redis实例所在区域可用区ID信息
     *
     * @return
     */
    public AzIdSpec getAzId() {
        return azId;
    }

    /**
     * set 缓存Redis实例所在区域可用区ID信息
     *
     * @param azId
     */
    public void setAzId(AzIdSpec azId) {
        this.azId = azId;
    }

    /**
     * get 缓存Redis实例描述
     *
     * @return
     */
    public String getCacheInstanceDescription() {
        return cacheInstanceDescription;
    }

    /**
     * set 缓存Redis实例描述
     *
     * @param cacheInstanceDescription
     */
    public void setCacheInstanceDescription(String cacheInstanceDescription) {
        this.cacheInstanceDescription = cacheInstanceDescription;
    }


    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public CacheInstanceSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public CacheInstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 实例名称，只支持数字、字母、英文下划线、中文，且不少于2字符不超过32字符
     *
     * @param cacheInstanceName
     */
    public CacheInstanceSpec cacheInstanceName(String cacheInstanceName) {
        this.cacheInstanceName = cacheInstanceName;
        return this;
    }

    /**
     * set 实例规格代码，参见实例规格代码表。
     *
     * @param cacheInstanceClass
     */
    public CacheInstanceSpec cacheInstanceClass(String cacheInstanceClass) {
        this.cacheInstanceClass = cacheInstanceClass;
        return this;
    }

    /**
     * set 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符
     *
     * @param password
     */
    public CacheInstanceSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域可用区ID信息
     *
     * @param azId
     */
    public CacheInstanceSpec azId(AzIdSpec azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set 缓存Redis实例描述
     *
     * @param cacheInstanceDescription
     */
    public CacheInstanceSpec cacheInstanceDescription(String cacheInstanceDescription) {
        this.cacheInstanceDescription = cacheInstanceDescription;
        return this;
    }


}