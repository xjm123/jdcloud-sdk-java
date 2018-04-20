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
 * 网站转发配置相关接口
 * 网站转发配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.ipanti.model.WebRuleSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 添加网站类规则
 */
public class CreateWebRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 网站类规则参数
     * Required:true
     */
    @Required
    private WebRuleSpec webRuleSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例id
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 网站类规则参数
     *
     * @return
     */
    public WebRuleSpec getWebRuleSpec() {
        return webRuleSpec;
    }

    /**
     * set 网站类规则参数
     *
     * @param webRuleSpec
     */
    public void setWebRuleSpec(WebRuleSpec webRuleSpec) {
        this.webRuleSpec = webRuleSpec;
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
     * get 实例id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 网站类规则参数
     *
     * @param webRuleSpec
     */
    public CreateWebRuleRequest webRuleSpec(WebRuleSpec webRuleSpec) {
        this.webRuleSpec = webRuleSpec;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateWebRuleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例id
     *
     * @param instanceId
     */
    public CreateWebRuleRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}