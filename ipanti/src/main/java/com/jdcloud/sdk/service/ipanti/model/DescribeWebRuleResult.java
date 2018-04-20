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

import com.jdcloud.sdk.service.ipanti.model.WebRule;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询某条网站类规则
 */
public class DescribeWebRuleResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * webRule
     */
    private WebRule webRule;


    /**
     * get webRule
     *
     * @return
     */
    public WebRule getWebRule() {
        return webRule;
    }

    /**
     * set webRule
     *
     * @param webRule
     */
    public void setWebRule(WebRule webRule) {
        this.webRule = webRule;
    }


    /**
     * set webRule
     *
     * @param webRule
     */
    public DescribeWebRuleResult webRule(WebRule webRule) {
        this.webRule = webRule;
        return this;
    }


}