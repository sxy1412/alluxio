// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_worker.proto

package alluxio.grpc;

/**
 * <pre>
 * next available id: 3
 * </pre>
 *
 * Protobuf type {@code alluxio.grpc.block.OpenLocalBlockRequest}
 */
public  final class OpenLocalBlockRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.block.OpenLocalBlockRequest)
    OpenLocalBlockRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenLocalBlockRequest.newBuilder() to construct.
  private OpenLocalBlockRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenLocalBlockRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenLocalBlockRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpenLocalBlockRequest(
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
          case 8: {
            bitField0_ |= 0x00000001;
            blockId_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            promote_ = input.readBool();
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
    return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_OpenLocalBlockRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_OpenLocalBlockRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.OpenLocalBlockRequest.class, alluxio.grpc.OpenLocalBlockRequest.Builder.class);
  }

  private int bitField0_;
  public static final int BLOCK_ID_FIELD_NUMBER = 1;
  private long blockId_;
  /**
   * <code>optional int64 block_id = 1;</code>
   * @return Whether the blockId field is set.
   */
  public boolean hasBlockId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 block_id = 1;</code>
   * @return The blockId.
   */
  public long getBlockId() {
    return blockId_;
  }

  public static final int PROMOTE_FIELD_NUMBER = 2;
  private boolean promote_;
  /**
   * <code>optional bool promote = 2;</code>
   * @return Whether the promote field is set.
   */
  public boolean hasPromote() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bool promote = 2;</code>
   * @return The promote.
   */
  public boolean getPromote() {
    return promote_;
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
      output.writeInt64(1, blockId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, promote_);
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
        .computeInt64Size(1, blockId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, promote_);
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
    if (!(obj instanceof alluxio.grpc.OpenLocalBlockRequest)) {
      return super.equals(obj);
    }
    alluxio.grpc.OpenLocalBlockRequest other = (alluxio.grpc.OpenLocalBlockRequest) obj;

    if (hasBlockId() != other.hasBlockId()) return false;
    if (hasBlockId()) {
      if (getBlockId()
          != other.getBlockId()) return false;
    }
    if (hasPromote() != other.hasPromote()) return false;
    if (hasPromote()) {
      if (getPromote()
          != other.getPromote()) return false;
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
    if (hasBlockId()) {
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBlockId());
    }
    if (hasPromote()) {
      hash = (37 * hash) + PROMOTE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPromote());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.OpenLocalBlockRequest parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.OpenLocalBlockRequest prototype) {
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
   * <pre>
   * next available id: 3
   * </pre>
   *
   * Protobuf type {@code alluxio.grpc.block.OpenLocalBlockRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.block.OpenLocalBlockRequest)
      alluxio.grpc.OpenLocalBlockRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_OpenLocalBlockRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_OpenLocalBlockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.OpenLocalBlockRequest.class, alluxio.grpc.OpenLocalBlockRequest.Builder.class);
    }

    // Construct using alluxio.grpc.OpenLocalBlockRequest.newBuilder()
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
      blockId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      promote_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.BlockWorkerProto.internal_static_alluxio_grpc_block_OpenLocalBlockRequest_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.OpenLocalBlockRequest getDefaultInstanceForType() {
      return alluxio.grpc.OpenLocalBlockRequest.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.OpenLocalBlockRequest build() {
      alluxio.grpc.OpenLocalBlockRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.OpenLocalBlockRequest buildPartial() {
      alluxio.grpc.OpenLocalBlockRequest result = new alluxio.grpc.OpenLocalBlockRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blockId_ = blockId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.promote_ = promote_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof alluxio.grpc.OpenLocalBlockRequest) {
        return mergeFrom((alluxio.grpc.OpenLocalBlockRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.OpenLocalBlockRequest other) {
      if (other == alluxio.grpc.OpenLocalBlockRequest.getDefaultInstance()) return this;
      if (other.hasBlockId()) {
        setBlockId(other.getBlockId());
      }
      if (other.hasPromote()) {
        setPromote(other.getPromote());
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
      alluxio.grpc.OpenLocalBlockRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.OpenLocalBlockRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long blockId_ ;
    /**
     * <code>optional int64 block_id = 1;</code>
     * @return Whether the blockId field is set.
     */
    public boolean hasBlockId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 block_id = 1;</code>
     * @return The blockId.
     */
    public long getBlockId() {
      return blockId_;
    }
    /**
     * <code>optional int64 block_id = 1;</code>
     * @param value The blockId to set.
     * @return This builder for chaining.
     */
    public Builder setBlockId(long value) {
      bitField0_ |= 0x00000001;
      blockId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 block_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blockId_ = 0L;
      onChanged();
      return this;
    }

    private boolean promote_ ;
    /**
     * <code>optional bool promote = 2;</code>
     * @return Whether the promote field is set.
     */
    public boolean hasPromote() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool promote = 2;</code>
     * @return The promote.
     */
    public boolean getPromote() {
      return promote_;
    }
    /**
     * <code>optional bool promote = 2;</code>
     * @param value The promote to set.
     * @return This builder for chaining.
     */
    public Builder setPromote(boolean value) {
      bitField0_ |= 0x00000002;
      promote_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool promote = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPromote() {
      bitField0_ = (bitField0_ & ~0x00000002);
      promote_ = false;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.block.OpenLocalBlockRequest)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.block.OpenLocalBlockRequest)
  private static final alluxio.grpc.OpenLocalBlockRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.OpenLocalBlockRequest();
  }

  public static alluxio.grpc.OpenLocalBlockRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<OpenLocalBlockRequest>
      PARSER = new com.google.protobuf.AbstractParser<OpenLocalBlockRequest>() {
    @java.lang.Override
    public OpenLocalBlockRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpenLocalBlockRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpenLocalBlockRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenLocalBlockRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.OpenLocalBlockRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

