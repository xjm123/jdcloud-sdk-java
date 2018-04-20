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

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.disk.model.Disk;

/**
 * instanceDiskAttachment
 */
public class InstanceDiskAttachment  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘分类，取值范围{local, cloud}
     */
    private String diskCategory;

    /**
     * 自动删除，删除主机时自动删除此磁盘，默认为True
     */
    private Boolean autoDelete;

    /**
     * 本地磁盘
     */
    private LocalDisk localDisk;

    /**
     * 云硬盘
     */
    private Disk cloudDisk;

    /**
     * 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     */
    private String deviceName;


    /**
     * get 磁盘分类，取值范围{local, cloud}
     *
     * @return
     */
    public String getDiskCategory() {
        return diskCategory;
    }

    /**
     * set 磁盘分类，取值范围{local, cloud}
     *
     * @param diskCategory
     */
    public void setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
    }

    /**
     * get 自动删除，删除主机时自动删除此磁盘，默认为True
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 自动删除，删除主机时自动删除此磁盘，默认为True
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 本地磁盘
     *
     * @return
     */
    public LocalDisk getLocalDisk() {
        return localDisk;
    }

    /**
     * set 本地磁盘
     *
     * @param localDisk
     */
    public void setLocalDisk(LocalDisk localDisk) {
        this.localDisk = localDisk;
    }

    /**
     * get 云硬盘
     *
     * @return
     */
    public Disk getCloudDisk() {
        return cloudDisk;
    }

    /**
     * set 云硬盘
     *
     * @param cloudDisk
     */
    public void setCloudDisk(Disk cloudDisk) {
        this.cloudDisk = cloudDisk;
    }

    /**
     * get 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * set 磁盘分类，取值范围{local, cloud}
     *
     * @param diskCategory
     */
    public InstanceDiskAttachment diskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }

    /**
     * set 自动删除，删除主机时自动删除此磁盘，默认为True
     *
     * @param autoDelete
     */
    public InstanceDiskAttachment autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 本地磁盘
     *
     * @param localDisk
     */
    public InstanceDiskAttachment localDisk(LocalDisk localDisk) {
        this.localDisk = localDisk;
        return this;
    }

    /**
     * set 云硬盘
     *
     * @param cloudDisk
     */
    public InstanceDiskAttachment cloudDisk(Disk cloudDisk) {
        this.cloudDisk = cloudDisk;
        return this;
    }

    /**
     * set 数据盘逻辑挂载点vdb,vdc,vdd,vde,vdf,vdg,vdh
     *
     * @param deviceName
     */
    public InstanceDiskAttachment deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }


}