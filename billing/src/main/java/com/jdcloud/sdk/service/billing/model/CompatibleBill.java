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

package com.jdcloud.sdk.service.billing.model;


/**
 * compatibleBill
 */
public class CompatibleBill  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账单ID
     */
    private Number billId;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 站点
     */
    private Integer site;

    /**
     * 区域
     */
    private String region;

    /**
     * appCode
     */
    private String appCode;

    /**
     * appCodeName
     */
    private String appCodeName;

    /**
     * serviceCode
     */
    private String serviceCode;

    /**
     * serviceCodeName
     */
    private String serviceCodeName;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 计费类型
     */
    private Integer billingType;

    /**
     * 计费类型描述
     */
    private String billingTypeName;

    /**
     * 规格
     */
    private String formula;

    /**
     * 规格
     */
    private String formulaStr;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 账单金额
     */
    private Number billFee;

    /**
     * 账单金额（保留小数点后2位）
     */
    private Number billFee2;

    /**
     * 折扣金额
     */
    private Number discountFee;

    /**
     * 代金券id
     */
    private String couponId;

    /**
     * 优惠券金额
     */
    private Number couponFee;

    /**
     * 优惠后金额
     */
    private Number actualFee;

    /**
     * 代金券金额
     */
    private Number cashCouponFee;

    /**
     * 余额支付金额
     */
    private Number balancePayFee;

    /**
     * 现金支付金额
     */
    private Number cashPayFee;

    /**
     * 欠费金额
     */
    private Number arrearFee;

    /**
     * 支付状态
     */
    private Integer paySate;

    /**
     * 1:老计费   2：新计费
     */
    private Integer systemType;

    /**
     * 资源名称
     */
    private String resourceName;


    /**
     * get 账单ID
     *
     * @return
     */
    public Number getBillId() {
        return billId;
    }

    /**
     * set 账单ID
     *
     * @param billId
     */
    public void setBillId(Number billId) {
        this.billId = billId;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 站点
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get 区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get appCode
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * get appCodeName
     *
     * @return
     */
    public String getAppCodeName() {
        return appCodeName;
    }

    /**
     * set appCodeName
     *
     * @param appCodeName
     */
    public void setAppCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
    }

    /**
     * get serviceCode
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get serviceCodeName
     *
     * @return
     */
    public String getServiceCodeName() {
        return serviceCodeName;
    }

    /**
     * set serviceCodeName
     *
     * @param serviceCodeName
     */
    public void setServiceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }

    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 计费类型
     *
     * @return
     */
    public Integer getBillingType() {
        return billingType;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    /**
     * get 计费类型描述
     *
     * @return
     */
    public String getBillingTypeName() {
        return billingTypeName;
    }

    /**
     * set 计费类型描述
     *
     * @param billingTypeName
     */
    public void setBillingTypeName(String billingTypeName) {
        this.billingTypeName = billingTypeName;
    }

    /**
     * get 规格
     *
     * @return
     */
    public String getFormula() {
        return formula;
    }

    /**
     * set 规格
     *
     * @param formula
     */
    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * get 规格
     *
     * @return
     */
    public String getFormulaStr() {
        return formulaStr;
    }

    /**
     * set 规格
     *
     * @param formulaStr
     */
    public void setFormulaStr(String formulaStr) {
        this.formulaStr = formulaStr;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 账单金额
     *
     * @return
     */
    public Number getBillFee() {
        return billFee;
    }

    /**
     * set 账单金额
     *
     * @param billFee
     */
    public void setBillFee(Number billFee) {
        this.billFee = billFee;
    }

    /**
     * get 账单金额（保留小数点后2位）
     *
     * @return
     */
    public Number getBillFee2() {
        return billFee2;
    }

    /**
     * set 账单金额（保留小数点后2位）
     *
     * @param billFee2
     */
    public void setBillFee2(Number billFee2) {
        this.billFee2 = billFee2;
    }

    /**
     * get 折扣金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 折扣金额
     *
     * @param discountFee
     */
    public void setDiscountFee(Number discountFee) {
        this.discountFee = discountFee;
    }

    /**
     * get 代金券id
     *
     * @return
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * set 代金券id
     *
     * @param couponId
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * get 优惠券金额
     *
     * @return
     */
    public Number getCouponFee() {
        return couponFee;
    }

    /**
     * set 优惠券金额
     *
     * @param couponFee
     */
    public void setCouponFee(Number couponFee) {
        this.couponFee = couponFee;
    }

    /**
     * get 优惠后金额
     *
     * @return
     */
    public Number getActualFee() {
        return actualFee;
    }

    /**
     * set 优惠后金额
     *
     * @param actualFee
     */
    public void setActualFee(Number actualFee) {
        this.actualFee = actualFee;
    }

    /**
     * get 代金券金额
     *
     * @return
     */
    public Number getCashCouponFee() {
        return cashCouponFee;
    }

    /**
     * set 代金券金额
     *
     * @param cashCouponFee
     */
    public void setCashCouponFee(Number cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
    }

    /**
     * get 余额支付金额
     *
     * @return
     */
    public Number getBalancePayFee() {
        return balancePayFee;
    }

    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public void setBalancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
    }

    /**
     * get 现金支付金额
     *
     * @return
     */
    public Number getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
    }

    /**
     * get 欠费金额
     *
     * @return
     */
    public Number getArrearFee() {
        return arrearFee;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public void setArrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
    }

    /**
     * get 支付状态
     *
     * @return
     */
    public Integer getPaySate() {
        return paySate;
    }

    /**
     * set 支付状态
     *
     * @param paySate
     */
    public void setPaySate(Integer paySate) {
        this.paySate = paySate;
    }

    /**
     * get 1:老计费   2：新计费
     *
     * @return
     */
    public Integer getSystemType() {
        return systemType;
    }

    /**
     * set 1:老计费   2：新计费
     *
     * @param systemType
     */
    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
    }

    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * set 账单ID
     *
     * @param billId
     */
    public CompatibleBill billId(Number billId) {
        this.billId = billId;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public CompatibleBill pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 站点
     *
     * @param site
     */
    public CompatibleBill site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public CompatibleBill region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set appCode
     *
     * @param appCode
     */
    public CompatibleBill appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    /**
     * set appCodeName
     *
     * @param appCodeName
     */
    public CompatibleBill appCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
        return this;
    }

    /**
     * set serviceCode
     *
     * @param serviceCode
     */
    public CompatibleBill serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set serviceCodeName
     *
     * @param serviceCodeName
     */
    public CompatibleBill serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public CompatibleBill resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 计费类型
     *
     * @param billingType
     */
    public CompatibleBill billingType(Integer billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * set 计费类型描述
     *
     * @param billingTypeName
     */
    public CompatibleBill billingTypeName(String billingTypeName) {
        this.billingTypeName = billingTypeName;
        return this;
    }

    /**
     * set 规格
     *
     * @param formula
     */
    public CompatibleBill formula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * set 规格
     *
     * @param formulaStr
     */
    public CompatibleBill formulaStr(String formulaStr) {
        this.formulaStr = formulaStr;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public CompatibleBill startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public CompatibleBill endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public CompatibleBill createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 账单金额
     *
     * @param billFee
     */
    public CompatibleBill billFee(Number billFee) {
        this.billFee = billFee;
        return this;
    }

    /**
     * set 账单金额（保留小数点后2位）
     *
     * @param billFee2
     */
    public CompatibleBill billFee2(Number billFee2) {
        this.billFee2 = billFee2;
        return this;
    }

    /**
     * set 折扣金额
     *
     * @param discountFee
     */
    public CompatibleBill discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    /**
     * set 代金券id
     *
     * @param couponId
     */
    public CompatibleBill couponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * set 优惠券金额
     *
     * @param couponFee
     */
    public CompatibleBill couponFee(Number couponFee) {
        this.couponFee = couponFee;
        return this;
    }

    /**
     * set 优惠后金额
     *
     * @param actualFee
     */
    public CompatibleBill actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }

    /**
     * set 代金券金额
     *
     * @param cashCouponFee
     */
    public CompatibleBill cashCouponFee(Number cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
        return this;
    }

    /**
     * set 余额支付金额
     *
     * @param balancePayFee
     */
    public CompatibleBill balancePayFee(Number balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public CompatibleBill cashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public CompatibleBill arrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
        return this;
    }

    /**
     * set 支付状态
     *
     * @param paySate
     */
    public CompatibleBill paySate(Integer paySate) {
        this.paySate = paySate;
        return this;
    }

    /**
     * set 1:老计费   2：新计费
     *
     * @param systemType
     */
    public CompatibleBill systemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public CompatibleBill resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


}