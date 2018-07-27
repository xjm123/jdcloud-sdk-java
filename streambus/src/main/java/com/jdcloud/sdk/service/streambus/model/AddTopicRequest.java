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
 * TOPIC相关 API
 * 流数据总线topic相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streambus.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.streambus.model.AddTopic;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建topic
 */
public class AddTopicRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * topicModel
     * Required:true
     */
    @Required
    private AddTopic topicModel;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get topicModel
     *
     * @return
     */
    public AddTopic getTopicModel() {
        return topicModel;
    }

    /**
     * set topicModel
     *
     * @param topicModel
     */
    public void setTopicModel(AddTopic topicModel) {
        this.topicModel = topicModel;
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
     * set topicModel
     *
     * @param topicModel
     */
    public AddTopicRequest topicModel(AddTopic topicModel) {
        this.topicModel = topicModel;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public AddTopicRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}