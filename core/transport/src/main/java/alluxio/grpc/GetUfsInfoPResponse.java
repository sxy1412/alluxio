// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.file.GetUfsInfoPResponse}
 */
public  final class GetUfsInfoPResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.file.GetUfsInfoPResponse)
    GetUfsInfoPResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUfsInfoPResponse.newBuilder() to construct.
  private GetUfsInfoPResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUfsInfoPResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUfsInfoPResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetUfsInfoPResponse(
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
            alluxio.grpc.UfsInfo.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = ufsInfo_.toBuilder();
            }
            ufsInfo_ = input.readMessage(alluxio.grpc.UfsInfo.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ufsInfo_);
              ufsInfo_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
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
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_GetUfsInfoPResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_GetUfsInfoPResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.GetUfsInfoPResponse.class, alluxio.grpc.GetUfsInfoPResponse.Builder.class);
  }

  private int bitField0_;
  public static final int UFSINFO_FIELD_NUMBER = 1;
  private alluxio.grpc.UfsInfo ufsInfo_;
  /**
   * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
   * @return Whether the ufsInfo field is set.
   */
  public boolean hasUfsInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
   * @return The ufsInfo.
   */
  public alluxio.grpc.UfsInfo getUfsInfo() {
    return ufsInfo_ == null ? alluxio.grpc.UfsInfo.getDefaultInstance() : ufsInfo_;
  }
  /**
   * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
   */
  public alluxio.grpc.UfsInfoOrBuilder getUfsInfoOrBuilder() {
    return ufsInfo_ == null ? alluxio.grpc.UfsInfo.getDefaultInstance() : ufsInfo_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUfsInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUfsInfo());
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
    if (!(obj instanceof alluxio.grpc.GetUfsInfoPResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.GetUfsInfoPResponse other = (alluxio.grpc.GetUfsInfoPResponse) obj;

    if (hasUfsInfo() != other.hasUfsInfo()) return false;
    if (hasUfsInfo()) {
      if (!getUfsInfo()
          .equals(other.getUfsInfo())) return false;
    }
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
    if (hasUfsInfo()) {
      hash = (37 * hash) + UFSINFO_FIELD_NUMBER;
      hash = (53 * hash) + getUfsInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.GetUfsInfoPResponse parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.GetUfsInfoPResponse prototype) {
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
   * Protobuf type {@code alluxio.grpc.file.GetUfsInfoPResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.file.GetUfsInfoPResponse)
      alluxio.grpc.GetUfsInfoPResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_GetUfsInfoPResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_GetUfsInfoPResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.GetUfsInfoPResponse.class, alluxio.grpc.GetUfsInfoPResponse.Builder.class);
    }

    // Construct using alluxio.grpc.GetUfsInfoPResponse.newBuilder()
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
        getUfsInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ufsInfoBuilder_ == null) {
        ufsInfo_ = null;
      } else {
        ufsInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.FileSystemMasterProto.internal_static_alluxio_grpc_file_GetUfsInfoPResponse_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.GetUfsInfoPResponse getDefaultInstanceForType() {
      return alluxio.grpc.GetUfsInfoPResponse.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.GetUfsInfoPResponse build() {
      alluxio.grpc.GetUfsInfoPResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.GetUfsInfoPResponse buildPartial() {
      alluxio.grpc.GetUfsInfoPResponse result = new alluxio.grpc.GetUfsInfoPResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (ufsInfoBuilder_ == null) {
          result.ufsInfo_ = ufsInfo_;
        } else {
          result.ufsInfo_ = ufsInfoBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof alluxio.grpc.GetUfsInfoPResponse) {
        return mergeFrom((alluxio.grpc.GetUfsInfoPResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.GetUfsInfoPResponse other) {
      if (other == alluxio.grpc.GetUfsInfoPResponse.getDefaultInstance()) return this;
      if (other.hasUfsInfo()) {
        mergeUfsInfo(other.getUfsInfo());
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
      alluxio.grpc.GetUfsInfoPResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.GetUfsInfoPResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private alluxio.grpc.UfsInfo ufsInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.UfsInfo, alluxio.grpc.UfsInfo.Builder, alluxio.grpc.UfsInfoOrBuilder> ufsInfoBuilder_;
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     * @return Whether the ufsInfo field is set.
     */
    public boolean hasUfsInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     * @return The ufsInfo.
     */
    public alluxio.grpc.UfsInfo getUfsInfo() {
      if (ufsInfoBuilder_ == null) {
        return ufsInfo_ == null ? alluxio.grpc.UfsInfo.getDefaultInstance() : ufsInfo_;
      } else {
        return ufsInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     */
    public Builder setUfsInfo(alluxio.grpc.UfsInfo value) {
      if (ufsInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ufsInfo_ = value;
        onChanged();
      } else {
        ufsInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     */
    public Builder setUfsInfo(
        alluxio.grpc.UfsInfo.Builder builderForValue) {
      if (ufsInfoBuilder_ == null) {
        ufsInfo_ = builderForValue.build();
        onChanged();
      } else {
        ufsInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     */
    public Builder mergeUfsInfo(alluxio.grpc.UfsInfo value) {
      if (ufsInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            ufsInfo_ != null &&
            ufsInfo_ != alluxio.grpc.UfsInfo.getDefaultInstance()) {
          ufsInfo_ =
            alluxio.grpc.UfsInfo.newBuilder(ufsInfo_).mergeFrom(value).buildPartial();
        } else {
          ufsInfo_ = value;
        }
        onChanged();
      } else {
        ufsInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     */
    public Builder clearUfsInfo() {
      if (ufsInfoBuilder_ == null) {
        ufsInfo_ = null;
        onChanged();
      } else {
        ufsInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     */
    public alluxio.grpc.UfsInfo.Builder getUfsInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUfsInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     */
    public alluxio.grpc.UfsInfoOrBuilder getUfsInfoOrBuilder() {
      if (ufsInfoBuilder_ != null) {
        return ufsInfoBuilder_.getMessageOrBuilder();
      } else {
        return ufsInfo_ == null ?
            alluxio.grpc.UfsInfo.getDefaultInstance() : ufsInfo_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.file.UfsInfo ufsInfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.UfsInfo, alluxio.grpc.UfsInfo.Builder, alluxio.grpc.UfsInfoOrBuilder> 
        getUfsInfoFieldBuilder() {
      if (ufsInfoBuilder_ == null) {
        ufsInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.UfsInfo, alluxio.grpc.UfsInfo.Builder, alluxio.grpc.UfsInfoOrBuilder>(
                getUfsInfo(),
                getParentForChildren(),
                isClean());
        ufsInfo_ = null;
      }
      return ufsInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.file.GetUfsInfoPResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.file.GetUfsInfoPResponse)
  private static final alluxio.grpc.GetUfsInfoPResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.GetUfsInfoPResponse();
  }

  public static alluxio.grpc.GetUfsInfoPResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetUfsInfoPResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetUfsInfoPResponse>() {
    @java.lang.Override
    public GetUfsInfoPResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetUfsInfoPResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetUfsInfoPResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUfsInfoPResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.GetUfsInfoPResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

