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

package com.jdcloud.sdk.service.oss.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * user
 */
public class User  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     * Required:true
     */
    @Required
    private String id;

    /**
     * displayName
     * Required:true
     */
    @Required
    private String displayName;


    /**
     * get id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get displayName
     *
     * @return
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * set displayName
     *
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    /**
     * set id
     *
     * @param id
     */
    public User id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set displayName
     *
     * @param displayName
     */
    public User displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }


}