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

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 删除topic
 */
public class DeleteTopicResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * status
     */
    private Boolean status;

    /**
     * 状态信息
     */
    private String message;


    /**
     * get status
     *
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * get 状态信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 状态信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set status
     *
     * @param status
     */
    public DeleteTopicResult status(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * set 状态信息
     *
     * @param message
     */
    public DeleteTopicResult message(String message) {
        this.message = message;
        return this;
    }


}