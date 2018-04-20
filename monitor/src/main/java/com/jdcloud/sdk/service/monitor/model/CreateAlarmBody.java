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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createAlarmBody
 */
public class CreateAlarmBody  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 幂等性校验参数，最长32位，值不变则返回值不会变
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * createAlarmSpec
     * Required:true
     */
    @Required
    private CreateAlarmSpec createAlarmSpec;


    /**
     * get 幂等性校验参数，最长32位，值不变则返回值不会变
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数，最长32位，值不变则返回值不会变
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get createAlarmSpec
     *
     * @return
     */
    public CreateAlarmSpec getCreateAlarmSpec() {
        return createAlarmSpec;
    }

    /**
     * set createAlarmSpec
     *
     * @param createAlarmSpec
     */
    public void setCreateAlarmSpec(CreateAlarmSpec createAlarmSpec) {
        this.createAlarmSpec = createAlarmSpec;
    }


    /**
     * set 幂等性校验参数，最长32位，值不变则返回值不会变
     *
     * @param clientToken
     */
    public CreateAlarmBody clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set createAlarmSpec
     *
     * @param createAlarmSpec
     */
    public CreateAlarmBody createAlarmSpec(CreateAlarmSpec createAlarmSpec) {
        this.createAlarmSpec = createAlarmSpec;
        return this;
    }


}