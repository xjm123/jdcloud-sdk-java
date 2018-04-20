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
 * 单库上云
 * 单库上云相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.rds.model.ImportFile;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取单库上云文件列表
 */
public class DescribeImportFilesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * importFiles
     */
    private List<ImportFile> importFiles;


    /**
     * get importFiles
     *
     * @return
     */
    public List<ImportFile> getImportFiles() {
        return importFiles;
    }

    /**
     * set importFiles
     *
     * @param importFiles
     */
    public void setImportFiles(List<ImportFile> importFiles) {
        this.importFiles = importFiles;
    }


    /**
     * set importFiles
     *
     * @param importFiles
     */
    public DescribeImportFilesResult importFiles(List<ImportFile> importFiles) {
        this.importFiles = importFiles;
        return this;
    }


    /**
     * add item to importFiles
     *
     * @param importFile
     */
    public void addImportFile(ImportFile importFile) {
        if (this.importFiles == null) {
            this.importFiles = new ArrayList<>();
        }
        this.importFiles.add(importFile);
    }

}