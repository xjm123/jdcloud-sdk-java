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
 * NameSpace相关 API
 * 流数据总线NameSpace相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.streamcomputer.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.streamcomputer.model.Storage;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建或者更新storage
 */
public class GetStorageListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * storageList
     */
    private List<Storage> storageList;


    /**
     * get storageList
     *
     * @return
     */
    public List<Storage> getStorageList() {
        return storageList;
    }

    /**
     * set storageList
     *
     * @param storageList
     */
    public void setStorageList(List<Storage> storageList) {
        this.storageList = storageList;
    }


    /**
     * set storageList
     *
     * @param storageList
     */
    public GetStorageListResult storageList(List<Storage> storageList) {
        this.storageList = storageList;
        return this;
    }


    /**
     * add item to storageList
     *
     * @param storageList
     */
    public void addStorageList(Storage storageList) {
        if (this.storageList == null) {
            this.storageList = new ArrayList<>();
        }
        this.storageList.add(storageList);
    }

}