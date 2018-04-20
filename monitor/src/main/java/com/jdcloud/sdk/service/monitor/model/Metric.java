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


/**
 * metric
 */
public class Metric  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指标的计算单位，比如bit/s、%、k等
     */
    private String calculateUnit;

    /**
     * 监控项英文标识
     */
    private String metric;

    /**
     * 监控项名称
     */
    private String metricName;


    /**
     * get 指标的计算单位，比如bit/s、%、k等
     *
     * @return
     */
    public String getCalculateUnit() {
        return calculateUnit;
    }

    /**
     * set 指标的计算单位，比如bit/s、%、k等
     *
     * @param calculateUnit
     */
    public void setCalculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit;
    }

    /**
     * get 监控项英文标识
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项英文标识
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * get 监控项名称
     *
     * @return
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * set 监控项名称
     *
     * @param metricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }


    /**
     * set 指标的计算单位，比如bit/s、%、k等
     *
     * @param calculateUnit
     */
    public Metric calculateUnit(String calculateUnit) {
        this.calculateUnit = calculateUnit;
        return this;
    }

    /**
     * set 监控项英文标识
     *
     * @param metric
     */
    public Metric metric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * set 监控项名称
     *
     * @param metricName
     */
    public Metric metricName(String metricName) {
        this.metricName = metricName;
        return this;
    }


}