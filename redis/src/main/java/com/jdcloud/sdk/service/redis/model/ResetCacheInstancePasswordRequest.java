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
 * 缓存Redis实例接口
 * 缓存Redis实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 重置缓存Redis实例密码
 */
public class ResetCacheInstancePasswordRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符
     * Required:true
     */
    @Required
    private String password;

    /**
     * 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 缓存Redis实例ID
     * Required:true
     */
    @Required
    private String cacheInstanceId;


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
     * get 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 缓存Redis实例ID
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 缓存Redis实例ID
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }


    /**
     * set 密码，必须包含且只支持字母及数字，不少于8字符不超过16字符
     *
     * @param password
     */
    public ResetCacheInstancePasswordRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前缓存Redis有华北、华南、华东区域，对应Region ID为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public ResetCacheInstancePasswordRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 缓存Redis实例ID
     *
     * @param cacheInstanceId
     */
    public ResetCacheInstancePasswordRequest cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }


}