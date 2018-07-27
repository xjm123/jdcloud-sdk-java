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
 * NameSpace相关 API
 * 流数据总线NameSpace相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streamcomputer.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.streamcomputer.model.Storage;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建或者更新storage
 */
public class AddOrUpdateStorageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建或者更新storage的详情
     * Required:true
     */
    @Required
    private Storage storageStr;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 创建或者更新storage的详情
     *
     * @return
     */
    public Storage getStorageStr() {
        return storageStr;
    }

    /**
     * set 创建或者更新storage的详情
     *
     * @param storageStr
     */
    public void setStorageStr(Storage storageStr) {
        this.storageStr = storageStr;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 创建或者更新storage的详情
     *
     * @param storageStr
     */
    public AddOrUpdateStorageRequest storageStr(Storage storageStr) {
        this.storageStr = storageStr;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AddOrUpdateStorageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}