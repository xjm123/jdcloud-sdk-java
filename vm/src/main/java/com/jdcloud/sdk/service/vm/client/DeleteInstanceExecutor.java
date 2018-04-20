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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.vm.model.DeleteInstanceResponse;

/**
 * &quot;删除单个实例&quot;
&quot;主机状态必须为停止状态、同时主机没有未完成的任务才可删除&quot;
&quot;包年包月未到期的主机不能删除&quot;
&quot;如果主机中挂载了数据盘，并且设置了AutoDelete属性为True，那么数据盘会随主机一起删除&quot;

 */
class DeleteInstanceExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "DELETE";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DeleteInstanceResponse.class;
    }
}
