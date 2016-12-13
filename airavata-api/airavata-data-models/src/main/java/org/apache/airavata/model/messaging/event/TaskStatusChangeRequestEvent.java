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
package org.apache.airavata.model.messaging.event;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class TaskStatusChangeRequestEvent implements org.apache.thrift.TBase<TaskStatusChangeRequestEvent, TaskStatusChangeRequestEvent._Fields>, java.io.Serializable, Cloneable, Comparable<TaskStatusChangeRequestEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskStatusChangeRequestEvent");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_IDENTITY_FIELD_DESC = new org.apache.thrift.protocol.TField("taskIdentity", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskStatusChangeRequestEventStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskStatusChangeRequestEventTupleSchemeFactory());
  }

  private org.apache.airavata.model.status.TaskState state; // required
  private TaskIdentifier taskIdentity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.airavata.model.status.TaskState
     */
    STATE((short)1, "state"),
    TASK_IDENTITY((short)2, "taskIdentity");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATE
          return STATE;
        case 2: // TASK_IDENTITY
          return TASK_IDENTITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.airavata.model.status.TaskState.class)));
    tmpMap.put(_Fields.TASK_IDENTITY, new org.apache.thrift.meta_data.FieldMetaData("taskIdentity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskIdentifier.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskStatusChangeRequestEvent.class, metaDataMap);
  }

  public TaskStatusChangeRequestEvent() {
  }

  public TaskStatusChangeRequestEvent(
    org.apache.airavata.model.status.TaskState state,
    TaskIdentifier taskIdentity)
  {
    this();
    this.state = state;
    this.taskIdentity = taskIdentity;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskStatusChangeRequestEvent(TaskStatusChangeRequestEvent other) {
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetTaskIdentity()) {
      this.taskIdentity = new TaskIdentifier(other.taskIdentity);
    }
  }

  public TaskStatusChangeRequestEvent deepCopy() {
    return new TaskStatusChangeRequestEvent(this);
  }

  @Override
  public void clear() {
    this.state = null;
    this.taskIdentity = null;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.TaskState
   */
  public org.apache.airavata.model.status.TaskState getState() {
    return this.state;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.TaskState
   */
  public void setState(org.apache.airavata.model.status.TaskState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public TaskIdentifier getTaskIdentity() {
    return this.taskIdentity;
  }

  public void setTaskIdentity(TaskIdentifier taskIdentity) {
    this.taskIdentity = taskIdentity;
  }

  public void unsetTaskIdentity() {
    this.taskIdentity = null;
  }

  /** Returns true if field taskIdentity is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskIdentity() {
    return this.taskIdentity != null;
  }

  public void setTaskIdentityIsSet(boolean value) {
    if (!value) {
      this.taskIdentity = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((org.apache.airavata.model.status.TaskState)value);
      }
      break;

    case TASK_IDENTITY:
      if (value == null) {
        unsetTaskIdentity();
      } else {
        setTaskIdentity((TaskIdentifier)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case TASK_IDENTITY:
      return getTaskIdentity();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case TASK_IDENTITY:
      return isSetTaskIdentity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskStatusChangeRequestEvent)
      return this.equals((TaskStatusChangeRequestEvent)that);
    return false;
  }

  public boolean equals(TaskStatusChangeRequestEvent that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_taskIdentity = true && this.isSetTaskIdentity();
    boolean that_present_taskIdentity = true && that.isSetTaskIdentity();
    if (this_present_taskIdentity || that_present_taskIdentity) {
      if (!(this_present_taskIdentity && that_present_taskIdentity))
        return false;
      if (!this.taskIdentity.equals(that.taskIdentity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state.getValue());

    boolean present_taskIdentity = true && (isSetTaskIdentity());
    list.add(present_taskIdentity);
    if (present_taskIdentity)
      list.add(taskIdentity);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaskStatusChangeRequestEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskIdentity()).compareTo(other.isSetTaskIdentity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskIdentity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskIdentity, other.taskIdentity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskStatusChangeRequestEvent(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskIdentity:");
    if (this.taskIdentity == null) {
      sb.append("null");
    } else {
      sb.append(this.taskIdentity);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetState()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' is unset! Struct:" + toString());
    }

    if (!isSetTaskIdentity()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskIdentity' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (taskIdentity != null) {
      taskIdentity.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TaskStatusChangeRequestEventStandardSchemeFactory implements SchemeFactory {
    public TaskStatusChangeRequestEventStandardScheme getScheme() {
      return new TaskStatusChangeRequestEventStandardScheme();
    }
  }

  private static class TaskStatusChangeRequestEventStandardScheme extends StandardScheme<TaskStatusChangeRequestEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = org.apache.airavata.model.status.TaskState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_IDENTITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskIdentity = new TaskIdentifier();
              struct.taskIdentity.read(iprot);
              struct.setTaskIdentityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.taskIdentity != null) {
        oprot.writeFieldBegin(TASK_IDENTITY_FIELD_DESC);
        struct.taskIdentity.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskStatusChangeRequestEventTupleSchemeFactory implements SchemeFactory {
    public TaskStatusChangeRequestEventTupleScheme getScheme() {
      return new TaskStatusChangeRequestEventTupleScheme();
    }
  }

  private static class TaskStatusChangeRequestEventTupleScheme extends TupleScheme<TaskStatusChangeRequestEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.state.getValue());
      struct.taskIdentity.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.state = org.apache.airavata.model.status.TaskState.findByValue(iprot.readI32());
      struct.setStateIsSet(true);
      struct.taskIdentity = new TaskIdentifier();
      struct.taskIdentity.read(iprot);
      struct.setTaskIdentityIsSet(true);
    }
  }

}
