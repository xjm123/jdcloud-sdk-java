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

import java.util.List;
import java.util.ArrayList;

/**
 * alarmHistory
 */
public class AlarmHistory  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     */
    private String calculation;

    /**
     * 通知的联系组，如 [“联系组1”,”联系组2”]
     */
    private List<String> contactGroups;

    /**
     * 通知的联系人，如 [“联系人1”,”联系人2”]
     */
    private List<String> contactPersons;

    /**
     * 该规则是否已经被删除，1表示已经被删除，0表示未删除，被删除的规则，在使用查询规则的接口时，将不会被检索到
     */
    private Integer deleted;

    /**
     * 启用禁用 1启用，0禁用
     */
    private Integer enabled;

    /**
     * 规则id
     */
    private String id;

    /**
     * 监控项
     */
    private String metric;

    /**
     * 规则id监控项名称
     */
    private String metricName;

    /**
     * 通知周期 单位：小时
     */
    private Integer noticePeriod;

    /**
     * 报警的时间
     */
    private String noticeTime;

    /**
     * &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、！&#x3D;
     */
    private String operation;

    /**
     * 统计周期（单位：分钟）
     */
    private Integer period;

    /**
     * 地域信息
     */
    private String region;

    /**
     * 此规则所应用的资源id
     */
    private String resourceId;

    /**
     * 报警规则对应的产品
     */
    private String serviceCode;

    /**
     * 监控项附属信息
     */
    private String tag;

    /**
     * 阈值
     */
    private Number threshold;

    /**
     * 连续多少次后报警
     */
    private Integer times;

    /**
     * 报警值
     */
    private Number value;


    /**
     * get 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @return
     */
    public String getCalculation() {
        return calculation;
    }

    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @param calculation
     */
    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    /**
     * get 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @return
     */
    public List<String> getContactGroups() {
        return contactGroups;
    }

    /**
     * set 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @param contactGroups
     */
    public void setContactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
    }

    /**
     * get 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @return
     */
    public List<String> getContactPersons() {
        return contactPersons;
    }

    /**
     * set 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @param contactPersons
     */
    public void setContactPersons(List<String> contactPersons) {
        this.contactPersons = contactPersons;
    }

    /**
     * get 该规则是否已经被删除，1表示已经被删除，0表示未删除，被删除的规则，在使用查询规则的接口时，将不会被检索到
     *
     * @return
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * set 该规则是否已经被删除，1表示已经被删除，0表示未删除，被删除的规则，在使用查询规则的接口时，将不会被检索到
     *
     * @param deleted
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * get 启用禁用 1启用，0禁用
     *
     * @return
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * set 启用禁用 1启用，0禁用
     *
     * @param enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * get 规则id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 规则id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 监控项
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get 规则id监控项名称
     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set 规则id监控项名称
     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * get 通知周期 单位：小时
     *
     * @return
     */
    public Integer getNoticePeriod() {
        return noticePeriod;
    }

    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public void setNoticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    /**
     * get 报警的时间
     *
     * @return
     */
    public String getNoticeTime() {
        return noticeTime;
    }

    /**
     * set 报警的时间
     *
     * @param noticeTime
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * get &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、！&#x3D;
     *
     * @return
     */
    public String getOperation() {
        return operation;
    }

    /**
     * set &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、！&#x3D;
     *
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * get 统计周期（单位：分钟）
     *
     * @return
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * set 统计周期（单位：分钟）
     *
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * get 地域信息
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域信息
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 此规则所应用的资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 此规则所应用的资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 报警规则对应的产品
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 报警规则对应的产品
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 监控项附属信息
     *
     * @return
     */
    public String getTag() {
        return tag;
    }

    /**
     * set 监控项附属信息
     *
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * get 阈值
     *
     * @return
     */
    public Number getThreshold() {
        return threshold;
    }

    /**
     * set 阈值
     *
     * @param threshold
     */
    public void setThreshold(Number threshold) {
        this.threshold = threshold;
    }

    /**
     * get 连续多少次后报警
     *
     * @return
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * set 连续多少次后报警
     *
     * @param times
     */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
     * get 报警值
     *
     * @return
     */
    public Number getValue() {
        return value;
    }

    /**
     * set 报警值
     *
     * @param value
     */
    public void setValue(Number value) {
        this.value = value;
    }


    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @param calculation
     */
    public AlarmHistory calculation(String calculation) {
        this.calculation = calculation;
        return this;
    }

    /**
     * set 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @param contactGroups
     */
    public AlarmHistory contactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }

    /**
     * set 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @param contactPersons
     */
    public AlarmHistory contactPersons(List<String> contactPersons) {
        this.contactPersons = contactPersons;
        return this;
    }

    /**
     * set 该规则是否已经被删除，1表示已经被删除，0表示未删除，被删除的规则，在使用查询规则的接口时，将不会被检索到
     *
     * @param deleted
     */
    public AlarmHistory deleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * set 启用禁用 1启用，0禁用
     *
     * @param enabled
     */
    public AlarmHistory enabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 规则id
     *
     * @param id
     */
    public AlarmHistory id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 监控项
     *
     * @param metric
     */
    public AlarmHistory metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 规则id监控项名称
     *
     * @param metricName
     */
    public AlarmHistory metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public AlarmHistory noticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
        return this;
    }

    /**
     * set 报警的时间
     *
     * @param noticeTime
     */
    public AlarmHistory noticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
        return this;
    }

    /**
     * set &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;&#x3D;、！&#x3D;
     *
     * @param operation
     */
    public AlarmHistory operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * set 统计周期（单位：分钟）
     *
     * @param period
     */
    public AlarmHistory period(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * set 地域信息
     *
     * @param region
     */
    public AlarmHistory region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 此规则所应用的资源id
     *
     * @param resourceId
     */
    public AlarmHistory resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 报警规则对应的产品
     *
     * @param serviceCode
     */
    public AlarmHistory serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 监控项附属信息
     *
     * @param tag
     */
    public AlarmHistory tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * set 阈值
     *
     * @param threshold
     */
    public AlarmHistory threshold(Number threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * set 连续多少次后报警
     *
     * @param times
     */
    public AlarmHistory times(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * set 报警值
     *
     * @param value
     */
    public AlarmHistory value(Number value) {
        this.value = value;
        return this;
    }


    /**
     * add item to 通知的联系组，如 [“联系组1”,”联系组2”]
     *
     * @param contactGroup
     */
    public void addContactGroup(String contactGroup) {
        if (this.contactGroups == null) {
            this.contactGroups = new ArrayList<>();
        }
        this.contactGroups.add(contactGroup);
    }

    /**
     * add item to 通知的联系人，如 [“联系人1”,”联系人2”]
     *
     * @param contactPerson
     */
    public void addContactPerson(String contactPerson) {
        if (this.contactPersons == null) {
            this.contactPersons = new ArrayList<>();
        }
        this.contactPersons.add(contactPerson);
    }

}