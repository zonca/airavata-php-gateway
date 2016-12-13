/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "process_model_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace apache { namespace airavata { namespace model { namespace process {


ProcessModel::~ProcessModel() throw() {
}


void ProcessModel::__set_processId(const std::string& val) {
  this->processId = val;
}

void ProcessModel::__set_experimentId(const std::string& val) {
  this->experimentId = val;
}

void ProcessModel::__set_creationTime(const int64_t val) {
  this->creationTime = val;
__isset.creationTime = true;
}

void ProcessModel::__set_lastUpdateTime(const int64_t val) {
  this->lastUpdateTime = val;
__isset.lastUpdateTime = true;
}

void ProcessModel::__set_processStatuses(const std::vector< ::apache::airavata::model::status::ProcessStatus> & val) {
  this->processStatuses = val;
__isset.processStatuses = true;
}

void ProcessModel::__set_processDetail(const std::string& val) {
  this->processDetail = val;
__isset.processDetail = true;
}

void ProcessModel::__set_applicationInterfaceId(const std::string& val) {
  this->applicationInterfaceId = val;
__isset.applicationInterfaceId = true;
}

void ProcessModel::__set_applicationDeploymentId(const std::string& val) {
  this->applicationDeploymentId = val;
__isset.applicationDeploymentId = true;
}

void ProcessModel::__set_computeResourceId(const std::string& val) {
  this->computeResourceId = val;
__isset.computeResourceId = true;
}

void ProcessModel::__set_processInputs(const std::vector< ::apache::airavata::model::application::io::InputDataObjectType> & val) {
  this->processInputs = val;
__isset.processInputs = true;
}

void ProcessModel::__set_processOutputs(const std::vector< ::apache::airavata::model::application::io::OutputDataObjectType> & val) {
  this->processOutputs = val;
__isset.processOutputs = true;
}

void ProcessModel::__set_processResourceSchedule(const  ::apache::airavata::model::scheduling::ComputationalResourceSchedulingModel& val) {
  this->processResourceSchedule = val;
__isset.processResourceSchedule = true;
}

void ProcessModel::__set_tasks(const std::vector< ::apache::airavata::model::task::TaskModel> & val) {
  this->tasks = val;
__isset.tasks = true;
}

void ProcessModel::__set_taskDag(const std::string& val) {
  this->taskDag = val;
__isset.taskDag = true;
}

void ProcessModel::__set_processErrors(const std::vector< ::apache::airavata::model::commons::ErrorModel> & val) {
  this->processErrors = val;
__isset.processErrors = true;
}

void ProcessModel::__set_gatewayExecutionId(const std::string& val) {
  this->gatewayExecutionId = val;
__isset.gatewayExecutionId = true;
}

void ProcessModel::__set_enableEmailNotification(const bool val) {
  this->enableEmailNotification = val;
__isset.enableEmailNotification = true;
}

void ProcessModel::__set_emailAddresses(const std::vector<std::string> & val) {
  this->emailAddresses = val;
__isset.emailAddresses = true;
}

void ProcessModel::__set_storageResourceId(const std::string& val) {
  this->storageResourceId = val;
__isset.storageResourceId = true;
}

void ProcessModel::__set_userDn(const std::string& val) {
  this->userDn = val;
__isset.userDn = true;
}

void ProcessModel::__set_generateCert(const bool val) {
  this->generateCert = val;
__isset.generateCert = true;
}

void ProcessModel::__set_experimentDataDir(const std::string& val) {
  this->experimentDataDir = val;
__isset.experimentDataDir = true;
}

void ProcessModel::__set_userName(const std::string& val) {
  this->userName = val;
__isset.userName = true;
}

void ProcessModel::__set_useUserCRPref(const bool val) {
  this->useUserCRPref = val;
__isset.useUserCRPref = true;
}

uint32_t ProcessModel::read(::apache::thrift::protocol::TProtocol* iprot) {

  apache::thrift::protocol::TInputRecursionTracker tracker(*iprot);
  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_processId = false;
  bool isset_experimentId = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->processId);
          isset_processId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->experimentId);
          isset_experimentId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->creationTime);
          this->__isset.creationTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I64) {
          xfer += iprot->readI64(this->lastUpdateTime);
          this->__isset.lastUpdateTime = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->processStatuses.clear();
            uint32_t _size0;
            ::apache::thrift::protocol::TType _etype3;
            xfer += iprot->readListBegin(_etype3, _size0);
            this->processStatuses.resize(_size0);
            uint32_t _i4;
            for (_i4 = 0; _i4 < _size0; ++_i4)
            {
              xfer += this->processStatuses[_i4].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.processStatuses = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->processDetail);
          this->__isset.processDetail = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationInterfaceId);
          this->__isset.applicationInterfaceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationDeploymentId);
          this->__isset.applicationDeploymentId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 9:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->computeResourceId);
          this->__isset.computeResourceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 10:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->processInputs.clear();
            uint32_t _size5;
            ::apache::thrift::protocol::TType _etype8;
            xfer += iprot->readListBegin(_etype8, _size5);
            this->processInputs.resize(_size5);
            uint32_t _i9;
            for (_i9 = 0; _i9 < _size5; ++_i9)
            {
              xfer += this->processInputs[_i9].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.processInputs = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 11:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->processOutputs.clear();
            uint32_t _size10;
            ::apache::thrift::protocol::TType _etype13;
            xfer += iprot->readListBegin(_etype13, _size10);
            this->processOutputs.resize(_size10);
            uint32_t _i14;
            for (_i14 = 0; _i14 < _size10; ++_i14)
            {
              xfer += this->processOutputs[_i14].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.processOutputs = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 12:
        if (ftype == ::apache::thrift::protocol::T_STRUCT) {
          xfer += this->processResourceSchedule.read(iprot);
          this->__isset.processResourceSchedule = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 13:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->tasks.clear();
            uint32_t _size15;
            ::apache::thrift::protocol::TType _etype18;
            xfer += iprot->readListBegin(_etype18, _size15);
            this->tasks.resize(_size15);
            uint32_t _i19;
            for (_i19 = 0; _i19 < _size15; ++_i19)
            {
              xfer += this->tasks[_i19].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.tasks = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 14:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->taskDag);
          this->__isset.taskDag = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 15:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->processErrors.clear();
            uint32_t _size20;
            ::apache::thrift::protocol::TType _etype23;
            xfer += iprot->readListBegin(_etype23, _size20);
            this->processErrors.resize(_size20);
            uint32_t _i24;
            for (_i24 = 0; _i24 < _size20; ++_i24)
            {
              xfer += this->processErrors[_i24].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.processErrors = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 16:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->gatewayExecutionId);
          this->__isset.gatewayExecutionId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 17:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->enableEmailNotification);
          this->__isset.enableEmailNotification = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 18:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->emailAddresses.clear();
            uint32_t _size25;
            ::apache::thrift::protocol::TType _etype28;
            xfer += iprot->readListBegin(_etype28, _size25);
            this->emailAddresses.resize(_size25);
            uint32_t _i29;
            for (_i29 = 0; _i29 < _size25; ++_i29)
            {
              xfer += iprot->readString(this->emailAddresses[_i29]);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.emailAddresses = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 19:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->storageResourceId);
          this->__isset.storageResourceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 20:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->userDn);
          this->__isset.userDn = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 21:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->generateCert);
          this->__isset.generateCert = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 22:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->experimentDataDir);
          this->__isset.experimentDataDir = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 23:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->userName);
          this->__isset.userName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 24:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->useUserCRPref);
          this->__isset.useUserCRPref = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_processId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_experimentId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t ProcessModel::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  apache::thrift::protocol::TOutputRecursionTracker tracker(*oprot);
  xfer += oprot->writeStructBegin("ProcessModel");

  xfer += oprot->writeFieldBegin("processId", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->processId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("experimentId", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->experimentId);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.creationTime) {
    xfer += oprot->writeFieldBegin("creationTime", ::apache::thrift::protocol::T_I64, 3);
    xfer += oprot->writeI64(this->creationTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.lastUpdateTime) {
    xfer += oprot->writeFieldBegin("lastUpdateTime", ::apache::thrift::protocol::T_I64, 4);
    xfer += oprot->writeI64(this->lastUpdateTime);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.processStatuses) {
    xfer += oprot->writeFieldBegin("processStatuses", ::apache::thrift::protocol::T_LIST, 5);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->processStatuses.size()));
      std::vector< ::apache::airavata::model::status::ProcessStatus> ::const_iterator _iter30;
      for (_iter30 = this->processStatuses.begin(); _iter30 != this->processStatuses.end(); ++_iter30)
      {
        xfer += (*_iter30).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.processDetail) {
    xfer += oprot->writeFieldBegin("processDetail", ::apache::thrift::protocol::T_STRING, 6);
    xfer += oprot->writeString(this->processDetail);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationInterfaceId) {
    xfer += oprot->writeFieldBegin("applicationInterfaceId", ::apache::thrift::protocol::T_STRING, 7);
    xfer += oprot->writeString(this->applicationInterfaceId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationDeploymentId) {
    xfer += oprot->writeFieldBegin("applicationDeploymentId", ::apache::thrift::protocol::T_STRING, 8);
    xfer += oprot->writeString(this->applicationDeploymentId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.computeResourceId) {
    xfer += oprot->writeFieldBegin("computeResourceId", ::apache::thrift::protocol::T_STRING, 9);
    xfer += oprot->writeString(this->computeResourceId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.processInputs) {
    xfer += oprot->writeFieldBegin("processInputs", ::apache::thrift::protocol::T_LIST, 10);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->processInputs.size()));
      std::vector< ::apache::airavata::model::application::io::InputDataObjectType> ::const_iterator _iter31;
      for (_iter31 = this->processInputs.begin(); _iter31 != this->processInputs.end(); ++_iter31)
      {
        xfer += (*_iter31).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.processOutputs) {
    xfer += oprot->writeFieldBegin("processOutputs", ::apache::thrift::protocol::T_LIST, 11);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->processOutputs.size()));
      std::vector< ::apache::airavata::model::application::io::OutputDataObjectType> ::const_iterator _iter32;
      for (_iter32 = this->processOutputs.begin(); _iter32 != this->processOutputs.end(); ++_iter32)
      {
        xfer += (*_iter32).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.processResourceSchedule) {
    xfer += oprot->writeFieldBegin("processResourceSchedule", ::apache::thrift::protocol::T_STRUCT, 12);
    xfer += this->processResourceSchedule.write(oprot);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.tasks) {
    xfer += oprot->writeFieldBegin("tasks", ::apache::thrift::protocol::T_LIST, 13);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->tasks.size()));
      std::vector< ::apache::airavata::model::task::TaskModel> ::const_iterator _iter33;
      for (_iter33 = this->tasks.begin(); _iter33 != this->tasks.end(); ++_iter33)
      {
        xfer += (*_iter33).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.taskDag) {
    xfer += oprot->writeFieldBegin("taskDag", ::apache::thrift::protocol::T_STRING, 14);
    xfer += oprot->writeString(this->taskDag);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.processErrors) {
    xfer += oprot->writeFieldBegin("processErrors", ::apache::thrift::protocol::T_LIST, 15);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->processErrors.size()));
      std::vector< ::apache::airavata::model::commons::ErrorModel> ::const_iterator _iter34;
      for (_iter34 = this->processErrors.begin(); _iter34 != this->processErrors.end(); ++_iter34)
      {
        xfer += (*_iter34).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.gatewayExecutionId) {
    xfer += oprot->writeFieldBegin("gatewayExecutionId", ::apache::thrift::protocol::T_STRING, 16);
    xfer += oprot->writeString(this->gatewayExecutionId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.enableEmailNotification) {
    xfer += oprot->writeFieldBegin("enableEmailNotification", ::apache::thrift::protocol::T_BOOL, 17);
    xfer += oprot->writeBool(this->enableEmailNotification);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.emailAddresses) {
    xfer += oprot->writeFieldBegin("emailAddresses", ::apache::thrift::protocol::T_LIST, 18);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->emailAddresses.size()));
      std::vector<std::string> ::const_iterator _iter35;
      for (_iter35 = this->emailAddresses.begin(); _iter35 != this->emailAddresses.end(); ++_iter35)
      {
        xfer += oprot->writeString((*_iter35));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.storageResourceId) {
    xfer += oprot->writeFieldBegin("storageResourceId", ::apache::thrift::protocol::T_STRING, 19);
    xfer += oprot->writeString(this->storageResourceId);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.userDn) {
    xfer += oprot->writeFieldBegin("userDn", ::apache::thrift::protocol::T_STRING, 20);
    xfer += oprot->writeString(this->userDn);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.generateCert) {
    xfer += oprot->writeFieldBegin("generateCert", ::apache::thrift::protocol::T_BOOL, 21);
    xfer += oprot->writeBool(this->generateCert);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.experimentDataDir) {
    xfer += oprot->writeFieldBegin("experimentDataDir", ::apache::thrift::protocol::T_STRING, 22);
    xfer += oprot->writeString(this->experimentDataDir);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.userName) {
    xfer += oprot->writeFieldBegin("userName", ::apache::thrift::protocol::T_STRING, 23);
    xfer += oprot->writeString(this->userName);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.useUserCRPref) {
    xfer += oprot->writeFieldBegin("useUserCRPref", ::apache::thrift::protocol::T_BOOL, 24);
    xfer += oprot->writeBool(this->useUserCRPref);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(ProcessModel &a, ProcessModel &b) {
  using ::std::swap;
  swap(a.processId, b.processId);
  swap(a.experimentId, b.experimentId);
  swap(a.creationTime, b.creationTime);
  swap(a.lastUpdateTime, b.lastUpdateTime);
  swap(a.processStatuses, b.processStatuses);
  swap(a.processDetail, b.processDetail);
  swap(a.applicationInterfaceId, b.applicationInterfaceId);
  swap(a.applicationDeploymentId, b.applicationDeploymentId);
  swap(a.computeResourceId, b.computeResourceId);
  swap(a.processInputs, b.processInputs);
  swap(a.processOutputs, b.processOutputs);
  swap(a.processResourceSchedule, b.processResourceSchedule);
  swap(a.tasks, b.tasks);
  swap(a.taskDag, b.taskDag);
  swap(a.processErrors, b.processErrors);
  swap(a.gatewayExecutionId, b.gatewayExecutionId);
  swap(a.enableEmailNotification, b.enableEmailNotification);
  swap(a.emailAddresses, b.emailAddresses);
  swap(a.storageResourceId, b.storageResourceId);
  swap(a.userDn, b.userDn);
  swap(a.generateCert, b.generateCert);
  swap(a.experimentDataDir, b.experimentDataDir);
  swap(a.userName, b.userName);
  swap(a.useUserCRPref, b.useUserCRPref);
  swap(a.__isset, b.__isset);
}

ProcessModel::ProcessModel(const ProcessModel& other36) {
  processId = other36.processId;
  experimentId = other36.experimentId;
  creationTime = other36.creationTime;
  lastUpdateTime = other36.lastUpdateTime;
  processStatuses = other36.processStatuses;
  processDetail = other36.processDetail;
  applicationInterfaceId = other36.applicationInterfaceId;
  applicationDeploymentId = other36.applicationDeploymentId;
  computeResourceId = other36.computeResourceId;
  processInputs = other36.processInputs;
  processOutputs = other36.processOutputs;
  processResourceSchedule = other36.processResourceSchedule;
  tasks = other36.tasks;
  taskDag = other36.taskDag;
  processErrors = other36.processErrors;
  gatewayExecutionId = other36.gatewayExecutionId;
  enableEmailNotification = other36.enableEmailNotification;
  emailAddresses = other36.emailAddresses;
  storageResourceId = other36.storageResourceId;
  userDn = other36.userDn;
  generateCert = other36.generateCert;
  experimentDataDir = other36.experimentDataDir;
  userName = other36.userName;
  useUserCRPref = other36.useUserCRPref;
  __isset = other36.__isset;
}
ProcessModel& ProcessModel::operator=(const ProcessModel& other37) {
  processId = other37.processId;
  experimentId = other37.experimentId;
  creationTime = other37.creationTime;
  lastUpdateTime = other37.lastUpdateTime;
  processStatuses = other37.processStatuses;
  processDetail = other37.processDetail;
  applicationInterfaceId = other37.applicationInterfaceId;
  applicationDeploymentId = other37.applicationDeploymentId;
  computeResourceId = other37.computeResourceId;
  processInputs = other37.processInputs;
  processOutputs = other37.processOutputs;
  processResourceSchedule = other37.processResourceSchedule;
  tasks = other37.tasks;
  taskDag = other37.taskDag;
  processErrors = other37.processErrors;
  gatewayExecutionId = other37.gatewayExecutionId;
  enableEmailNotification = other37.enableEmailNotification;
  emailAddresses = other37.emailAddresses;
  storageResourceId = other37.storageResourceId;
  userDn = other37.userDn;
  generateCert = other37.generateCert;
  experimentDataDir = other37.experimentDataDir;
  userName = other37.userName;
  useUserCRPref = other37.useUserCRPref;
  __isset = other37.__isset;
  return *this;
}
void ProcessModel::printTo(std::ostream& out) const {
  using ::apache::thrift::to_string;
  out << "ProcessModel(";
  out << "processId=" << to_string(processId);
  out << ", " << "experimentId=" << to_string(experimentId);
  out << ", " << "creationTime="; (__isset.creationTime ? (out << to_string(creationTime)) : (out << "<null>"));
  out << ", " << "lastUpdateTime="; (__isset.lastUpdateTime ? (out << to_string(lastUpdateTime)) : (out << "<null>"));
  out << ", " << "processStatuses="; (__isset.processStatuses ? (out << to_string(processStatuses)) : (out << "<null>"));
  out << ", " << "processDetail="; (__isset.processDetail ? (out << to_string(processDetail)) : (out << "<null>"));
  out << ", " << "applicationInterfaceId="; (__isset.applicationInterfaceId ? (out << to_string(applicationInterfaceId)) : (out << "<null>"));
  out << ", " << "applicationDeploymentId="; (__isset.applicationDeploymentId ? (out << to_string(applicationDeploymentId)) : (out << "<null>"));
  out << ", " << "computeResourceId="; (__isset.computeResourceId ? (out << to_string(computeResourceId)) : (out << "<null>"));
  out << ", " << "processInputs="; (__isset.processInputs ? (out << to_string(processInputs)) : (out << "<null>"));
  out << ", " << "processOutputs="; (__isset.processOutputs ? (out << to_string(processOutputs)) : (out << "<null>"));
  out << ", " << "processResourceSchedule="; (__isset.processResourceSchedule ? (out << to_string(processResourceSchedule)) : (out << "<null>"));
  out << ", " << "tasks="; (__isset.tasks ? (out << to_string(tasks)) : (out << "<null>"));
  out << ", " << "taskDag="; (__isset.taskDag ? (out << to_string(taskDag)) : (out << "<null>"));
  out << ", " << "processErrors="; (__isset.processErrors ? (out << to_string(processErrors)) : (out << "<null>"));
  out << ", " << "gatewayExecutionId="; (__isset.gatewayExecutionId ? (out << to_string(gatewayExecutionId)) : (out << "<null>"));
  out << ", " << "enableEmailNotification="; (__isset.enableEmailNotification ? (out << to_string(enableEmailNotification)) : (out << "<null>"));
  out << ", " << "emailAddresses="; (__isset.emailAddresses ? (out << to_string(emailAddresses)) : (out << "<null>"));
  out << ", " << "storageResourceId="; (__isset.storageResourceId ? (out << to_string(storageResourceId)) : (out << "<null>"));
  out << ", " << "userDn="; (__isset.userDn ? (out << to_string(userDn)) : (out << "<null>"));
  out << ", " << "generateCert="; (__isset.generateCert ? (out << to_string(generateCert)) : (out << "<null>"));
  out << ", " << "experimentDataDir="; (__isset.experimentDataDir ? (out << to_string(experimentDataDir)) : (out << "<null>"));
  out << ", " << "userName="; (__isset.userName ? (out << to_string(userName)) : (out << "<null>"));
  out << ", " << "useUserCRPref="; (__isset.useUserCRPref ? (out << to_string(useUserCRPref)) : (out << "<null>"));
  out << ")";
}

}}}} // namespace