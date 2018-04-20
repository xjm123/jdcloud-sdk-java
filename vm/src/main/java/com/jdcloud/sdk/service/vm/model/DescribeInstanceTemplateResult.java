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
 * 实例模板
 * 与实例模板相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.vm.model.InstanceTemplate;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询启动模板详情
 */
public class DescribeInstanceTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * instanceTemplate
     */
    private InstanceTemplate instanceTemplate;


    /**
     * get instanceTemplate
     *
     * @return
     */
    public InstanceTemplate getInstanceTemplate() {
        return instanceTemplate;
    }

    /**
     * set instanceTemplate
     *
     * @param instanceTemplate
     */
    public void setInstanceTemplate(InstanceTemplate instanceTemplate) {
        this.instanceTemplate = instanceTemplate;
    }


    /**
     * set instanceTemplate
     *
     * @param instanceTemplate
     */
    public DescribeInstanceTemplateResult instanceTemplate(InstanceTemplate instanceTemplate) {
        this.instanceTemplate = instanceTemplate;
        return this;
    }


}