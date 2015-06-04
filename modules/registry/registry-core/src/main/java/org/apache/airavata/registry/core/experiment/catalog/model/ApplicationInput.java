/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.registry.core.experiment.catalog.model;

import org.apache.airavata.registry.core.experiment.catalog.model.ApplicationInput_PK;
import org.apache.airavata.registry.core.experiment.catalog.model.TaskDetail;
import org.apache.openjpa.persistence.DataCache;

import javax.persistence.*;
import java.io.Serializable;

@DataCache
@Entity
@Table(name = "APPLICATION_INPUT")
@IdClass(ApplicationInput_PK.class)
public class ApplicationInput implements Serializable {
    @Id
    @Column(name = "TASK_ID")
    private String taskId;
    @Id
    @Column(name = "INPUT_KEY")
    private String inputKey;
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "METADATA")
    private String metadata;
    @Lob
    @Column(name = "VALUE")
    private char[] value;
    @Column(name = "APP_ARGUMENT")
    private String appArgument;

    @Column(name = "INPUT_ORDER")
    private int inputOrder;

    @Column(name = "STANDARD_INPUT")
    private boolean standardInput;

    @Column(name = "USER_FRIENDLY_DESC")
    private String userFriendlyDesc;

    @Column(name="IS_REQUIRED")
    private boolean isRequired;
    @Column(name="REQUIRED_TO_COMMANDLINE")
    private boolean requiredToCMD;
    @Column(name = "DATA_STAGED")
    private boolean dataStaged;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name = "TASK_ID")
    private TaskDetail task;

    public int getInputOrder() {
        return inputOrder;
    }

    public void setInputOrder(int inputOrder) {
        this.inputOrder = inputOrder;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getInputKey() {
        return inputKey;
    }

    public void setInputKey(String inputKey) {
        this.inputKey = inputKey;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public char[] getValue() {
        return value;
    }

    public void setValue(char[] value) {
        this.value = value;
    }

    public String getAppArgument() {
        return appArgument;
    }

    public void setAppArgument(String appArgument) {
        this.appArgument = appArgument;
    }

    public boolean isStandardInput() {
        return standardInput;
    }

    public void setStandardInput(boolean standardInput) {
        this.standardInput = standardInput;
    }

    public String getUserFriendlyDesc() {
        return userFriendlyDesc;
    }

    public void setUserFriendlyDesc(String userFriendlyDesc) {
        this.userFriendlyDesc = userFriendlyDesc;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public boolean isRequiredToCMD() {
        return requiredToCMD;
    }

    public void setRequiredToCMD(boolean requiredToCMD) {
        this.requiredToCMD = requiredToCMD;
    }

    public boolean isDataStaged() {
        return dataStaged;
    }

    public void setDataStaged(boolean dataStaged) {
        this.dataStaged = dataStaged;
    }
}
