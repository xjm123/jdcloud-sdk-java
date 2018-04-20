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
 * 备份管理
 * 备份管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.rds.model.BackupSpec;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建备份
 */
public class CreateBackupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 集群ID
     */
    private String instanceId;

    /**
     * 备份规格
     */
    private BackupSpec backupSpec;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 集群ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 集群ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 备份规格
     *
     * @return
     */
    public BackupSpec getBackupSpec() {
        return backupSpec;
    }

    /**
     * set 备份规格
     *
     * @param backupSpec
     */
    public void setBackupSpec(BackupSpec backupSpec) {
        this.backupSpec = backupSpec;
    }

    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 集群ID
     *
     * @param instanceId
     */
    public CreateBackupRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 备份规格
     *
     * @param backupSpec
     */
    public CreateBackupRequest backupSpec(BackupSpec backupSpec) {
        this.backupSpec = backupSpec;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public CreateBackupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}