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
 * TOPIC相关API
 * 流数据总线topic相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streamcomputer.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 运行job
 */
public class StartJobResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功启动作业返回信息
     */
    private String message;


    /**
     * get 成功启动作业返回信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 成功启动作业返回信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set 成功启动作业返回信息
     *
     * @param message
     */
    public StartJobResult message(String message) {
        this.message = message;
        return this;
    }


}