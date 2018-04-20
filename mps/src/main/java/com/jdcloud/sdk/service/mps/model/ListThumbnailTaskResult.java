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
 * 媒体处理相关接口
 * 媒体处理API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.mps.model.ThumbnailTask;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询截图任务
 */
public class ListThumbnailTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * status
     */
    private String status;

    /**
     * begin
     */
    private String begin;

    /**
     * end
     */
    private String end;

    /**
     * marker
     */
    private String marker;

    /**
     * limit
     */
    private Integer limit;

    /**
     * nextMarker
     */
    private String nextMarker;

    /**
     * truncated
     */
    private Boolean truncated;

    /**
     * taskList
     */
    private List<ThumbnailTask> taskList;


    /**
     * get status
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get begin
     *
     * @return
     */
    public String getBegin() {
        return begin;
    }

    /**
     * set begin
     *
     * @param begin
     */
    public void setBegin(String begin) {
        this.begin = begin;
    }

    /**
     * get end
     *
     * @return
     */
    public String getEnd() {
        return end;
    }

    /**
     * set end
     *
     * @param end
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * get marker
     *
     * @return
     */
    public String getMarker() {
        return marker;
    }

    /**
     * set marker
     *
     * @param marker
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * get limit
     *
     * @return
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * set limit
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * get nextMarker
     *
     * @return
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * set nextMarker
     *
     * @param nextMarker
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * get truncated
     *
     * @return
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * set truncated
     *
     * @param truncated
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * get taskList
     *
     * @return
     */
    public List<ThumbnailTask> getTaskList() {
        return taskList;
    }

    /**
     * set taskList
     *
     * @param taskList
     */
    public void setTaskList(List<ThumbnailTask> taskList) {
        this.taskList = taskList;
    }


    /**
     * set status
     *
     * @param status
     */
    public ListThumbnailTaskResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set begin
     *
     * @param begin
     */
    public ListThumbnailTaskResult begin(String begin) {
        this.begin = begin;
        return this;
    }

    /**
     * set end
     *
     * @param end
     */
    public ListThumbnailTaskResult end(String end) {
        this.end = end;
        return this;
    }

    /**
     * set marker
     *
     * @param marker
     */
    public ListThumbnailTaskResult marker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * set limit
     *
     * @param limit
     */
    public ListThumbnailTaskResult limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * set nextMarker
     *
     * @param nextMarker
     */
    public ListThumbnailTaskResult nextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * set truncated
     *
     * @param truncated
     */
    public ListThumbnailTaskResult truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * set taskList
     *
     * @param taskList
     */
    public ListThumbnailTaskResult taskList(List<ThumbnailTask> taskList) {
        this.taskList = taskList;
        return this;
    }


    /**
     * add item to taskList
     *
     * @param taskList
     */
    public void addTaskList(ThumbnailTask taskList) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        this.taskList.add(taskList);
    }

}