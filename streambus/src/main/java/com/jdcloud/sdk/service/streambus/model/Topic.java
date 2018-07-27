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

package com.jdcloud.sdk.service.streambus.model;


/**
 * topic
 */
public class Topic  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否归档（0：未归档，1：已归档）
     */
    private Integer archived;

    /**
     * 数据写入后的保留时间
     */
    private Integer lifecycle;

    /**
     * 流数据总线中topic的名字
     */
    private String name;

    /**
     * 流数据总线shard的数量
     */
    private Integer shardNum;

    /**
     * 备注
     */
    private String remark;


    /**
     * get 是否归档（0：未归档，1：已归档）
     *
     * @return
     */
    public Integer getArchived() {
        return archived;
    }

    /**
     * set 是否归档（0：未归档，1：已归档）
     *
     * @param archived
     */
    public void setArchived(Integer archived) {
        this.archived = archived;
    }

    /**
     * get 数据写入后的保留时间
     *
     * @return
     */
    public Integer getLifecycle() {
        return lifecycle;
    }

    /**
     * set 数据写入后的保留时间
     *
     * @param lifecycle
     */
    public void setLifecycle(Integer lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * get 流数据总线中topic的名字
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 流数据总线中topic的名字
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 流数据总线shard的数量
     *
     * @return
     */
    public Integer getShardNum() {
        return shardNum;
    }

    /**
     * set 流数据总线shard的数量
     *
     * @param shardNum
     */
    public void setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
    }

    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * set 是否归档（0：未归档，1：已归档）
     *
     * @param archived
     */
    public Topic archived(Integer archived) {
        this.archived = archived;
        return this;
    }

    /**
     * set 数据写入后的保留时间
     *
     * @param lifecycle
     */
    public Topic lifecycle(Integer lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * set 流数据总线中topic的名字
     *
     * @param name
     */
    public Topic name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 流数据总线shard的数量
     *
     * @param shardNum
     */
    public Topic shardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public Topic remark(String remark) {
        this.remark = remark;
        return this;
    }


}