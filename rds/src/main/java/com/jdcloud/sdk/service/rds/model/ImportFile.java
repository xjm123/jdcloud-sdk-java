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

package com.jdcloud.sdk.service.rds.model;


/**
 * importFile
 */
public class ImportFile  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 如果该文件是共享文件，则有全局ID，如不是共享文件，则为空
     */
    private String sharedFileGid;

    /**
     * 文件大小
     */
    private Integer sizeByte;

    /**
     * 文件上传完成时间
     */
    private String uploadTime;

    /**
     * 是否所属当前实例. “true”或者“false”
     */
    private String isLocal;


    /**
     * get 文件名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 文件名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 如果该文件是共享文件，则有全局ID，如不是共享文件，则为空
     *
     * @return
     */
    public String getSharedFileGid() {
        return sharedFileGid;
    }

    /**
     * set 如果该文件是共享文件，则有全局ID，如不是共享文件，则为空
     *
     * @param sharedFileGid
     */
    public void setSharedFileGid(String sharedFileGid) {
        this.sharedFileGid = sharedFileGid;
    }

    /**
     * get 文件大小
     *
     * @return
     */
    public Integer getSizeByte() {
        return sizeByte;
    }

    /**
     * set 文件大小
     *
     * @param sizeByte
     */
    public void setSizeByte(Integer sizeByte) {
        this.sizeByte = sizeByte;
    }

    /**
     * get 文件上传完成时间
     *
     * @return
     */
    public String getUploadTime() {
        return uploadTime;
    }

    /**
     * set 文件上传完成时间
     *
     * @param uploadTime
     */
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * get 是否所属当前实例. “true”或者“false”
     *
     * @return
     */
    public String getIsLocal() {
        return isLocal;
    }

    /**
     * set 是否所属当前实例. “true”或者“false”
     *
     * @param isLocal
     */
    public void setIsLocal(String isLocal) {
        this.isLocal = isLocal;
    }


    /**
     * set 文件名称
     *
     * @param name
     */
    public ImportFile name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 如果该文件是共享文件，则有全局ID，如不是共享文件，则为空
     *
     * @param sharedFileGid
     */
    public ImportFile sharedFileGid(String sharedFileGid) {
        this.sharedFileGid = sharedFileGid;
        return this;
    }

    /**
     * set 文件大小
     *
     * @param sizeByte
     */
    public ImportFile sizeByte(Integer sizeByte) {
        this.sizeByte = sizeByte;
        return this;
    }

    /**
     * set 文件上传完成时间
     *
     * @param uploadTime
     */
    public ImportFile uploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }

    /**
     * set 是否所属当前实例. “true”或者“false”
     *
     * @param isLocal
     */
    public ImportFile isLocal(String isLocal) {
        this.isLocal = isLocal;
        return this;
    }


}