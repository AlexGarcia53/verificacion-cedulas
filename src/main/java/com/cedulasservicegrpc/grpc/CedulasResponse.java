// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cedulas.proto

package com.cedulasservicegrpc.grpc;

/**
 * Protobuf type {@code CedulasResponse}
 */
public  final class CedulasResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CedulasResponse)
    CedulasResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CedulasResponse.newBuilder() to construct.
  private CedulasResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CedulasResponse() {
    cedulas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CedulasResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              cedulas_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            cedulas_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        cedulas_ = cedulas_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cedulasservicegrpc.grpc.Cedulas.internal_static_CedulasResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cedulasservicegrpc.grpc.Cedulas.internal_static_CedulasResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cedulasservicegrpc.grpc.CedulasResponse.class, com.cedulasservicegrpc.grpc.CedulasResponse.Builder.class);
  }

  public static final int CEDULAS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList cedulas_;
  /**
   * <code>repeated string cedulas = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getCedulasList() {
    return cedulas_;
  }
  /**
   * <code>repeated string cedulas = 1;</code>
   */
  public int getCedulasCount() {
    return cedulas_.size();
  }
  /**
   * <code>repeated string cedulas = 1;</code>
   */
  public java.lang.String getCedulas(int index) {
    return cedulas_.get(index);
  }
  /**
   * <code>repeated string cedulas = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCedulasBytes(int index) {
    return cedulas_.getByteString(index);
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
    for (int i = 0; i < cedulas_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cedulas_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < cedulas_.size(); i++) {
        dataSize += computeStringSizeNoTag(cedulas_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCedulasList().size();
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
    if (!(obj instanceof com.cedulasservicegrpc.grpc.CedulasResponse)) {
      return super.equals(obj);
    }
    com.cedulasservicegrpc.grpc.CedulasResponse other = (com.cedulasservicegrpc.grpc.CedulasResponse) obj;

    boolean result = true;
    result = result && getCedulasList()
        .equals(other.getCedulasList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCedulasCount() > 0) {
      hash = (37 * hash) + CEDULAS_FIELD_NUMBER;
      hash = (53 * hash) + getCedulasList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cedulasservicegrpc.grpc.CedulasResponse parseFrom(
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
  public static Builder newBuilder(com.cedulasservicegrpc.grpc.CedulasResponse prototype) {
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
   * Protobuf type {@code CedulasResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CedulasResponse)
      com.cedulasservicegrpc.grpc.CedulasResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cedulasservicegrpc.grpc.Cedulas.internal_static_CedulasResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cedulasservicegrpc.grpc.Cedulas.internal_static_CedulasResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cedulasservicegrpc.grpc.CedulasResponse.class, com.cedulasservicegrpc.grpc.CedulasResponse.Builder.class);
    }

    // Construct using com.cedulasservicegrpc.grpc.CedulasResponse.newBuilder()
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
      cedulas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cedulasservicegrpc.grpc.Cedulas.internal_static_CedulasResponse_descriptor;
    }

    @java.lang.Override
    public com.cedulasservicegrpc.grpc.CedulasResponse getDefaultInstanceForType() {
      return com.cedulasservicegrpc.grpc.CedulasResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cedulasservicegrpc.grpc.CedulasResponse build() {
      com.cedulasservicegrpc.grpc.CedulasResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cedulasservicegrpc.grpc.CedulasResponse buildPartial() {
      com.cedulasservicegrpc.grpc.CedulasResponse result = new com.cedulasservicegrpc.grpc.CedulasResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        cedulas_ = cedulas_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.cedulas_ = cedulas_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cedulasservicegrpc.grpc.CedulasResponse) {
        return mergeFrom((com.cedulasservicegrpc.grpc.CedulasResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cedulasservicegrpc.grpc.CedulasResponse other) {
      if (other == com.cedulasservicegrpc.grpc.CedulasResponse.getDefaultInstance()) return this;
      if (!other.cedulas_.isEmpty()) {
        if (cedulas_.isEmpty()) {
          cedulas_ = other.cedulas_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCedulasIsMutable();
          cedulas_.addAll(other.cedulas_);
        }
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
      com.cedulasservicegrpc.grpc.CedulasResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cedulasservicegrpc.grpc.CedulasResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList cedulas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCedulasIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        cedulas_ = new com.google.protobuf.LazyStringArrayList(cedulas_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getCedulasList() {
      return cedulas_.getUnmodifiableView();
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public int getCedulasCount() {
      return cedulas_.size();
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public java.lang.String getCedulas(int index) {
      return cedulas_.get(index);
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCedulasBytes(int index) {
      return cedulas_.getByteString(index);
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public Builder setCedulas(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCedulasIsMutable();
      cedulas_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public Builder addCedulas(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCedulasIsMutable();
      cedulas_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public Builder addAllCedulas(
        java.lang.Iterable<java.lang.String> values) {
      ensureCedulasIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, cedulas_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public Builder clearCedulas() {
      cedulas_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string cedulas = 1;</code>
     */
    public Builder addCedulasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCedulasIsMutable();
      cedulas_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CedulasResponse)
  }

  // @@protoc_insertion_point(class_scope:CedulasResponse)
  private static final com.cedulasservicegrpc.grpc.CedulasResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cedulasservicegrpc.grpc.CedulasResponse();
  }

  public static com.cedulasservicegrpc.grpc.CedulasResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CedulasResponse>
      PARSER = new com.google.protobuf.AbstractParser<CedulasResponse>() {
    @java.lang.Override
    public CedulasResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CedulasResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CedulasResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CedulasResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cedulasservicegrpc.grpc.CedulasResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

