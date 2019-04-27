// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/proto/test.proto

package com.github.sisyphsu.nakedata.proto;

/**
 * Protobuf type {@code com.github.sisyphsu.nakedata.proto.MultiMsg}
 */
public  final class MultiMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.sisyphsu.nakedata.proto.MultiMsg)
    MultiMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiMsg.newBuilder() to construct.
  private MultiMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiMsg() {
    msg1_ = "";
    msg2_ = "";
    msg3_ = "";
    msg4_ = "";
    msg5_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiMsg(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            msg1_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            msg2_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            msg3_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            msg4_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            msg5_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.sisyphsu.nakedata.proto.Test.internal_static_com_github_sisyphsu_nakedata_proto_MultiMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.sisyphsu.nakedata.proto.Test.internal_static_com_github_sisyphsu_nakedata_proto_MultiMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.sisyphsu.nakedata.proto.MultiMsg.class, com.github.sisyphsu.nakedata.proto.MultiMsg.Builder.class);
  }

  public static final int MSG1_FIELD_NUMBER = 1;
  private volatile java.lang.Object msg1_;
  /**
   * <code>string msg1 = 1;</code>
   */
  public java.lang.String getMsg1() {
    java.lang.Object ref = msg1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg1_ = s;
      return s;
    }
  }
  /**
   * <code>string msg1 = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMsg1Bytes() {
    java.lang.Object ref = msg1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG2_FIELD_NUMBER = 2;
  private volatile java.lang.Object msg2_;
  /**
   * <code>string msg2 = 2;</code>
   */
  public java.lang.String getMsg2() {
    java.lang.Object ref = msg2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg2_ = s;
      return s;
    }
  }
  /**
   * <code>string msg2 = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMsg2Bytes() {
    java.lang.Object ref = msg2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG3_FIELD_NUMBER = 3;
  private volatile java.lang.Object msg3_;
  /**
   * <code>string msg3 = 3;</code>
   */
  public java.lang.String getMsg3() {
    java.lang.Object ref = msg3_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg3_ = s;
      return s;
    }
  }
  /**
   * <code>string msg3 = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMsg3Bytes() {
    java.lang.Object ref = msg3_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg3_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG4_FIELD_NUMBER = 4;
  private volatile java.lang.Object msg4_;
  /**
   * <code>string msg4 = 4;</code>
   */
  public java.lang.String getMsg4() {
    java.lang.Object ref = msg4_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg4_ = s;
      return s;
    }
  }
  /**
   * <code>string msg4 = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMsg4Bytes() {
    java.lang.Object ref = msg4_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg4_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG5_FIELD_NUMBER = 5;
  private volatile java.lang.Object msg5_;
  /**
   * <code>string msg5 = 5;</code>
   */
  public java.lang.String getMsg5() {
    java.lang.Object ref = msg5_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg5_ = s;
      return s;
    }
  }
  /**
   * <code>string msg5 = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMsg5Bytes() {
    java.lang.Object ref = msg5_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg5_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMsg1Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msg1_);
    }
    if (!getMsg2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msg2_);
    }
    if (!getMsg3Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg3_);
    }
    if (!getMsg4Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, msg4_);
    }
    if (!getMsg5Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, msg5_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMsg1Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msg1_);
    }
    if (!getMsg2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msg2_);
    }
    if (!getMsg3Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg3_);
    }
    if (!getMsg4Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, msg4_);
    }
    if (!getMsg5Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, msg5_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.sisyphsu.nakedata.proto.MultiMsg)) {
      return super.equals(obj);
    }
    com.github.sisyphsu.nakedata.proto.MultiMsg other = (com.github.sisyphsu.nakedata.proto.MultiMsg) obj;

    if (!getMsg1()
        .equals(other.getMsg1())) return false;
    if (!getMsg2()
        .equals(other.getMsg2())) return false;
    if (!getMsg3()
        .equals(other.getMsg3())) return false;
    if (!getMsg4()
        .equals(other.getMsg4())) return false;
    if (!getMsg5()
        .equals(other.getMsg5())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSG1_FIELD_NUMBER;
    hash = (53 * hash) + getMsg1().hashCode();
    hash = (37 * hash) + MSG2_FIELD_NUMBER;
    hash = (53 * hash) + getMsg2().hashCode();
    hash = (37 * hash) + MSG3_FIELD_NUMBER;
    hash = (53 * hash) + getMsg3().hashCode();
    hash = (37 * hash) + MSG4_FIELD_NUMBER;
    hash = (53 * hash) + getMsg4().hashCode();
    hash = (37 * hash) + MSG5_FIELD_NUMBER;
    hash = (53 * hash) + getMsg5().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.sisyphsu.nakedata.proto.MultiMsg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.sisyphsu.nakedata.proto.MultiMsg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.github.sisyphsu.nakedata.proto.MultiMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.sisyphsu.nakedata.proto.MultiMsg)
      com.github.sisyphsu.nakedata.proto.MultiMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.sisyphsu.nakedata.proto.Test.internal_static_com_github_sisyphsu_nakedata_proto_MultiMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.sisyphsu.nakedata.proto.Test.internal_static_com_github_sisyphsu_nakedata_proto_MultiMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.sisyphsu.nakedata.proto.MultiMsg.class, com.github.sisyphsu.nakedata.proto.MultiMsg.Builder.class);
    }

    // Construct using com.github.sisyphsu.nakedata.proto.MultiMsg.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msg1_ = "";

      msg2_ = "";

      msg3_ = "";

      msg4_ = "";

      msg5_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.sisyphsu.nakedata.proto.Test.internal_static_com_github_sisyphsu_nakedata_proto_MultiMsg_descriptor;
    }

    @java.lang.Override
    public com.github.sisyphsu.nakedata.proto.MultiMsg getDefaultInstanceForType() {
      return com.github.sisyphsu.nakedata.proto.MultiMsg.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.sisyphsu.nakedata.proto.MultiMsg build() {
      com.github.sisyphsu.nakedata.proto.MultiMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.sisyphsu.nakedata.proto.MultiMsg buildPartial() {
      com.github.sisyphsu.nakedata.proto.MultiMsg result = new com.github.sisyphsu.nakedata.proto.MultiMsg(this);
      result.msg1_ = msg1_;
      result.msg2_ = msg2_;
      result.msg3_ = msg3_;
      result.msg4_ = msg4_;
      result.msg5_ = msg5_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.sisyphsu.nakedata.proto.MultiMsg) {
        return mergeFrom((com.github.sisyphsu.nakedata.proto.MultiMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.sisyphsu.nakedata.proto.MultiMsg other) {
      if (other == com.github.sisyphsu.nakedata.proto.MultiMsg.getDefaultInstance()) return this;
      if (!other.getMsg1().isEmpty()) {
        msg1_ = other.msg1_;
        onChanged();
      }
      if (!other.getMsg2().isEmpty()) {
        msg2_ = other.msg2_;
        onChanged();
      }
      if (!other.getMsg3().isEmpty()) {
        msg3_ = other.msg3_;
        onChanged();
      }
      if (!other.getMsg4().isEmpty()) {
        msg4_ = other.msg4_;
        onChanged();
      }
      if (!other.getMsg5().isEmpty()) {
        msg5_ = other.msg5_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.sisyphsu.nakedata.proto.MultiMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.sisyphsu.nakedata.proto.MultiMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object msg1_ = "";
    /**
     * <code>string msg1 = 1;</code>
     */
    public java.lang.String getMsg1() {
      java.lang.Object ref = msg1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg1 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsg1Bytes() {
      java.lang.Object ref = msg1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg1 = 1;</code>
     */
    public Builder setMsg1(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg1 = 1;</code>
     */
    public Builder clearMsg1() {
      
      msg1_ = getDefaultInstance().getMsg1();
      onChanged();
      return this;
    }
    /**
     * <code>string msg1 = 1;</code>
     */
    public Builder setMsg1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg1_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msg2_ = "";
    /**
     * <code>string msg2 = 2;</code>
     */
    public java.lang.String getMsg2() {
      java.lang.Object ref = msg2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg2 = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMsg2Bytes() {
      java.lang.Object ref = msg2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg2 = 2;</code>
     */
    public Builder setMsg2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg2 = 2;</code>
     */
    public Builder clearMsg2() {
      
      msg2_ = getDefaultInstance().getMsg2();
      onChanged();
      return this;
    }
    /**
     * <code>string msg2 = 2;</code>
     */
    public Builder setMsg2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg2_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msg3_ = "";
    /**
     * <code>string msg3 = 3;</code>
     */
    public java.lang.String getMsg3() {
      java.lang.Object ref = msg3_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg3_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg3 = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMsg3Bytes() {
      java.lang.Object ref = msg3_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg3_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg3 = 3;</code>
     */
    public Builder setMsg3(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg3_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg3 = 3;</code>
     */
    public Builder clearMsg3() {
      
      msg3_ = getDefaultInstance().getMsg3();
      onChanged();
      return this;
    }
    /**
     * <code>string msg3 = 3;</code>
     */
    public Builder setMsg3Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg3_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msg4_ = "";
    /**
     * <code>string msg4 = 4;</code>
     */
    public java.lang.String getMsg4() {
      java.lang.Object ref = msg4_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg4_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg4 = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMsg4Bytes() {
      java.lang.Object ref = msg4_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg4_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg4 = 4;</code>
     */
    public Builder setMsg4(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg4_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg4 = 4;</code>
     */
    public Builder clearMsg4() {
      
      msg4_ = getDefaultInstance().getMsg4();
      onChanged();
      return this;
    }
    /**
     * <code>string msg4 = 4;</code>
     */
    public Builder setMsg4Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg4_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msg5_ = "";
    /**
     * <code>string msg5 = 5;</code>
     */
    public java.lang.String getMsg5() {
      java.lang.Object ref = msg5_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg5_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg5 = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMsg5Bytes() {
      java.lang.Object ref = msg5_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg5_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg5 = 5;</code>
     */
    public Builder setMsg5(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg5_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg5 = 5;</code>
     */
    public Builder clearMsg5() {
      
      msg5_ = getDefaultInstance().getMsg5();
      onChanged();
      return this;
    }
    /**
     * <code>string msg5 = 5;</code>
     */
    public Builder setMsg5Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg5_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.sisyphsu.nakedata.proto.MultiMsg)
  }

  // @@protoc_insertion_point(class_scope:com.github.sisyphsu.nakedata.proto.MultiMsg)
  private static final com.github.sisyphsu.nakedata.proto.MultiMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.sisyphsu.nakedata.proto.MultiMsg();
  }

  public static com.github.sisyphsu.nakedata.proto.MultiMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiMsg>
      PARSER = new com.google.protobuf.AbstractParser<MultiMsg>() {
    @java.lang.Override
    public MultiMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.sisyphsu.nakedata.proto.MultiMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
