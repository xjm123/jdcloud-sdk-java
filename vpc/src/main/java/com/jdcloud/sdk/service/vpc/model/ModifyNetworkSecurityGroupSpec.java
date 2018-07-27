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

package com.jdcloud.sdk.service.vpc.model;


/**
 * modifyNetworkSecurityGroupSpec
 */
public class ModifyNetworkSecurityGroupSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     */
    private String networkSecurityGroupName;

    /**
     * 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     */
    private String description;


    /**
     * get 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getNetworkSecurityGroupName() {
        return networkSecurityGroupName;
    }

    /**
     * set 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param networkSecurityGroupName
     */
    public void setNetworkSecurityGroupName(String networkSecurityGroupName) {
        this.networkSecurityGroupName = networkSecurityGroupName;
    }

    /**
     * get 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 安全组的名字。名称取值范围：1-32个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param networkSecurityGroupName
     */
    public ModifyNetworkSecurityGroupSpec networkSecurityGroupName(String networkSecurityGroupName) {
        this.networkSecurityGroupName = networkSecurityGroupName;
        return this;
    }

    /**
     * set 安全组的描述，取值范围：0-256个UTF-8编码下的全部字符
     *
     * @param description
     */
    public ModifyNetworkSecurityGroupSpec description(String description) {
        this.description = description;
        return this;
    }


}