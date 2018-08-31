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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;


/**
 * availableNumData
 */
public class AvailableNumData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可用服务数
     */
    private Integer serverNum;


    /**
     * get 可用服务数
     *
     * @return
     */
    public Integer getServerNum() {
        return serverNum;
    }

    /**
     * set 可用服务数
     *
     * @param serverNum
     */
    public void setServerNum(Integer serverNum) {
        this.serverNum = serverNum;
    }


    /**
     * set 可用服务数
     *
     * @param serverNum
     */
    public AvailableNumData serverNum(Integer serverNum) {
        this.serverNum = serverNum;
        return this;
    }


}