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
 * Ip高防报表相关接口
 * Ip高防报表相关接口，包括cc防护、ddos防护、转发流量
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 转发流量报表
 */
public class FwdGraphRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间，最多查最近30天，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 高防实例id，可以传0个或多个
     */
    private List<String> instanceId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 开始时间，最多查最近30天，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间，最多查最近30天，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 高防实例id，可以传0个或多个
     *
     * @return
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    /**
     * set 高防实例id，可以传0个或多个
     *
     * @param instanceId
     */
    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
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
     * set 开始时间，最多查最近30天，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public FwdGraphRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询的结束时间，UTC时间，格式：yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public FwdGraphRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 高防实例id，可以传0个或多个
     *
     * @param instanceId
     */
    public FwdGraphRequest instanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public FwdGraphRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 高防实例id，可以传0个或多个
     *
     * @param instanceId
     */
    public void addInstanceId(String instanceId) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceId);
    }

}