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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ipanti.model.WebRule;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询某个实例下的网站类规则
 */
public class DescribeWebRulesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * webRules
     */
    private List<WebRule> webRules;

    /**
     * totalCount
     */
    private Integer totalCount;


    /**
     * get webRules
     *
     * @return
     */
    public List<WebRule> getWebRules() {
        return webRules;
    }

    /**
     * set webRules
     *
     * @param webRules
     */
    public void setWebRules(List<WebRule> webRules) {
        this.webRules = webRules;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set webRules
     *
     * @param webRules
     */
    public DescribeWebRulesResult webRules(List<WebRule> webRules) {
        this.webRules = webRules;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeWebRulesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to webRules
     *
     * @param webRule
     */
    public void addWebRule(WebRule webRule) {
        if (this.webRules == null) {
            this.webRules = new ArrayList<>();
        }
        this.webRules.add(webRule);
    }

}