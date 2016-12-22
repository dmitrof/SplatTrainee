// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BetReq.proto

package ru.splat.protobuf;

public final class BetReqProto {
  private BetReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BetReqOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 transaction_id = 1;
    /**
     * <code>required int64 transaction_id = 1;</code>
     */
    boolean hasTransactionId();
    /**
     * <code>required int64 transaction_id = 1;</code>
     */
    long getTransactionId();

    // required int64 local_task = 2;
    /**
     * <code>required int64 local_task = 2;</code>
     */
    boolean hasLocalTask();
    /**
     * <code>required int64 local_task = 2;</code>
     */
    long getLocalTask();

    // required string services = 3;
    /**
     * <code>required string services = 3;</code>
     */
    boolean hasServices();
    /**
     * <code>required string services = 3;</code>
     */
    java.lang.String getServices();
    /**
     * <code>required string services = 3;</code>
     */
    com.google.protobuf.ByteString
        getServicesBytes();

    // optional int64 punter_id = 4;
    /**
     * <code>optional int64 punter_id = 4;</code>
     */
    boolean hasPunterId();
    /**
     * <code>optional int64 punter_id = 4;</code>
     */
    long getPunterId();

    // optional string bet_state = 5;
    /**
     * <code>optional string bet_state = 5;</code>
     */
    boolean hasBetState();
    /**
     * <code>optional string bet_state = 5;</code>
     */
    java.lang.String getBetState();
    /**
     * <code>optional string bet_state = 5;</code>
     */
    com.google.protobuf.ByteString
        getBetStateBytes();
  }
  /**
   * Protobuf type {@code ru.splat.BetReq}
   */
  public static final class BetReq extends
      com.google.protobuf.GeneratedMessage
      implements BetReqOrBuilder {
    // Use BetReq.newBuilder() to construct.
    private BetReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BetReq(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BetReq defaultInstance;
    public static BetReq getDefaultInstance() {
      return defaultInstance;
    }

    public BetReq getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BetReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              transactionId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              localTask_ = input.readInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              services_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              punterId_ = input.readInt64();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              betState_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.splat.protobuf.BetReqProto.internal_static_ru_splat_BetReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.splat.protobuf.BetReqProto.internal_static_ru_splat_BetReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.splat.protobuf.BetReqProto.BetReq.class, ru.splat.protobuf.BetReqProto.BetReq.Builder.class);
    }

    public static com.google.protobuf.Parser<BetReq> PARSER =
        new com.google.protobuf.AbstractParser<BetReq>() {
      public BetReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BetReq(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BetReq> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 transaction_id = 1;
    public static final int TRANSACTION_ID_FIELD_NUMBER = 1;
    private long transactionId_;
    /**
     * <code>required int64 transaction_id = 1;</code>
     */
    public boolean hasTransactionId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 transaction_id = 1;</code>
     */
    public long getTransactionId() {
      return transactionId_;
    }

    // required int64 local_task = 2;
    public static final int LOCAL_TASK_FIELD_NUMBER = 2;
    private long localTask_;
    /**
     * <code>required int64 local_task = 2;</code>
     */
    public boolean hasLocalTask() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 local_task = 2;</code>
     */
    public long getLocalTask() {
      return localTask_;
    }

    // required string services = 3;
    public static final int SERVICES_FIELD_NUMBER = 3;
    private java.lang.Object services_;
    /**
     * <code>required string services = 3;</code>
     */
    public boolean hasServices() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string services = 3;</code>
     */
    public java.lang.String getServices() {
      java.lang.Object ref = services_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          services_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string services = 3;</code>
     */
    public com.google.protobuf.ByteString
        getServicesBytes() {
      java.lang.Object ref = services_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        services_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int64 punter_id = 4;
    public static final int PUNTER_ID_FIELD_NUMBER = 4;
    private long punterId_;
    /**
     * <code>optional int64 punter_id = 4;</code>
     */
    public boolean hasPunterId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 punter_id = 4;</code>
     */
    public long getPunterId() {
      return punterId_;
    }

    // optional string bet_state = 5;
    public static final int BET_STATE_FIELD_NUMBER = 5;
    private java.lang.Object betState_;
    /**
     * <code>optional string bet_state = 5;</code>
     */
    public boolean hasBetState() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string bet_state = 5;</code>
     */
    public java.lang.String getBetState() {
      java.lang.Object ref = betState_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          betState_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string bet_state = 5;</code>
     */
    public com.google.protobuf.ByteString
        getBetStateBytes() {
      java.lang.Object ref = betState_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        betState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      transactionId_ = 0L;
      localTask_ = 0L;
      services_ = "";
      punterId_ = 0L;
      betState_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTransactionId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLocalTask()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasServices()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, transactionId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, localTask_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getServicesBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, punterId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getBetStateBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, transactionId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, localTask_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getServicesBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, punterId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getBetStateBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ru.splat.protobuf.BetReqProto.BetReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ru.splat.protobuf.BetReqProto.BetReq prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ru.splat.BetReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements ru.splat.protobuf.BetReqProto.BetReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ru.splat.protobuf.BetReqProto.internal_static_ru_splat_BetReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ru.splat.protobuf.BetReqProto.internal_static_ru_splat_BetReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ru.splat.protobuf.BetReqProto.BetReq.class, ru.splat.protobuf.BetReqProto.BetReq.Builder.class);
      }

      // Construct using ru.splat.protobuf.BetReqProto.BetReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        transactionId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        localTask_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        services_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        punterId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        betState_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ru.splat.protobuf.BetReqProto.internal_static_ru_splat_BetReq_descriptor;
      }

      public ru.splat.protobuf.BetReqProto.BetReq getDefaultInstanceForType() {
        return ru.splat.protobuf.BetReqProto.BetReq.getDefaultInstance();
      }

      public ru.splat.protobuf.BetReqProto.BetReq build() {
        ru.splat.protobuf.BetReqProto.BetReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ru.splat.protobuf.BetReqProto.BetReq buildPartial() {
        ru.splat.protobuf.BetReqProto.BetReq result = new ru.splat.protobuf.BetReqProto.BetReq(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.transactionId_ = transactionId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.localTask_ = localTask_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.services_ = services_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.punterId_ = punterId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.betState_ = betState_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ru.splat.protobuf.BetReqProto.BetReq) {
          return mergeFrom((ru.splat.protobuf.BetReqProto.BetReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ru.splat.protobuf.BetReqProto.BetReq other) {
        if (other == ru.splat.protobuf.BetReqProto.BetReq.getDefaultInstance()) return this;
        if (other.hasTransactionId()) {
          setTransactionId(other.getTransactionId());
        }
        if (other.hasLocalTask()) {
          setLocalTask(other.getLocalTask());
        }
        if (other.hasServices()) {
          bitField0_ |= 0x00000004;
          services_ = other.services_;
          onChanged();
        }
        if (other.hasPunterId()) {
          setPunterId(other.getPunterId());
        }
        if (other.hasBetState()) {
          bitField0_ |= 0x00000010;
          betState_ = other.betState_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTransactionId()) {
          
          return false;
        }
        if (!hasLocalTask()) {
          
          return false;
        }
        if (!hasServices()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ru.splat.protobuf.BetReqProto.BetReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ru.splat.protobuf.BetReqProto.BetReq) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 transaction_id = 1;
      private long transactionId_ ;
      /**
       * <code>required int64 transaction_id = 1;</code>
       */
      public boolean hasTransactionId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 transaction_id = 1;</code>
       */
      public long getTransactionId() {
        return transactionId_;
      }
      /**
       * <code>required int64 transaction_id = 1;</code>
       */
      public Builder setTransactionId(long value) {
        bitField0_ |= 0x00000001;
        transactionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 transaction_id = 1;</code>
       */
      public Builder clearTransactionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        transactionId_ = 0L;
        onChanged();
        return this;
      }

      // required int64 local_task = 2;
      private long localTask_ ;
      /**
       * <code>required int64 local_task = 2;</code>
       */
      public boolean hasLocalTask() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 local_task = 2;</code>
       */
      public long getLocalTask() {
        return localTask_;
      }
      /**
       * <code>required int64 local_task = 2;</code>
       */
      public Builder setLocalTask(long value) {
        bitField0_ |= 0x00000002;
        localTask_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 local_task = 2;</code>
       */
      public Builder clearLocalTask() {
        bitField0_ = (bitField0_ & ~0x00000002);
        localTask_ = 0L;
        onChanged();
        return this;
      }

      // required string services = 3;
      private java.lang.Object services_ = "";
      /**
       * <code>required string services = 3;</code>
       */
      public boolean hasServices() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string services = 3;</code>
       */
      public java.lang.String getServices() {
        java.lang.Object ref = services_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          services_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string services = 3;</code>
       */
      public com.google.protobuf.ByteString
          getServicesBytes() {
        java.lang.Object ref = services_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          services_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string services = 3;</code>
       */
      public Builder setServices(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        services_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string services = 3;</code>
       */
      public Builder clearServices() {
        bitField0_ = (bitField0_ & ~0x00000004);
        services_ = getDefaultInstance().getServices();
        onChanged();
        return this;
      }
      /**
       * <code>required string services = 3;</code>
       */
      public Builder setServicesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        services_ = value;
        onChanged();
        return this;
      }

      // optional int64 punter_id = 4;
      private long punterId_ ;
      /**
       * <code>optional int64 punter_id = 4;</code>
       */
      public boolean hasPunterId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int64 punter_id = 4;</code>
       */
      public long getPunterId() {
        return punterId_;
      }
      /**
       * <code>optional int64 punter_id = 4;</code>
       */
      public Builder setPunterId(long value) {
        bitField0_ |= 0x00000008;
        punterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 punter_id = 4;</code>
       */
      public Builder clearPunterId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        punterId_ = 0L;
        onChanged();
        return this;
      }

      // optional string bet_state = 5;
      private java.lang.Object betState_ = "";
      /**
       * <code>optional string bet_state = 5;</code>
       */
      public boolean hasBetState() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string bet_state = 5;</code>
       */
      public java.lang.String getBetState() {
        java.lang.Object ref = betState_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          betState_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string bet_state = 5;</code>
       */
      public com.google.protobuf.ByteString
          getBetStateBytes() {
        java.lang.Object ref = betState_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          betState_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string bet_state = 5;</code>
       */
      public Builder setBetState(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        betState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string bet_state = 5;</code>
       */
      public Builder clearBetState() {
        bitField0_ = (bitField0_ & ~0x00000010);
        betState_ = getDefaultInstance().getBetState();
        onChanged();
        return this;
      }
      /**
       * <code>optional string bet_state = 5;</code>
       */
      public Builder setBetStateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        betState_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ru.splat.BetReq)
    }

    static {
      defaultInstance = new BetReq(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ru.splat.BetReq)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ru_splat_BetReq_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ru_splat_BetReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014BetReq.proto\022\010ru.splat\"l\n\006BetReq\022\026\n\016tr" +
      "ansaction_id\030\001 \002(\003\022\022\n\nlocal_task\030\002 \002(\003\022\020" +
      "\n\010services\030\003 \002(\t\022\021\n\tpunter_id\030\004 \001(\003\022\021\n\tb" +
      "et_state\030\005 \001(\tB \n\021ru.splat.protobufB\013Bet" +
      "ReqProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_ru_splat_BetReq_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_ru_splat_BetReq_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ru_splat_BetReq_descriptor,
              new java.lang.String[] { "TransactionId", "LocalTask", "Services", "PunterId", "BetState", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
