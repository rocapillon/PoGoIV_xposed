// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/github/aeonlucid/pogoprotos/networking/Platform.proto

package com.github.aeonlucid.pogoprotos.networking;

public final class Platform {
  private Platform() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.github.aeonlucid.pogoprotos.networking.platform.PlatformRequestType}
   */
  public enum PlatformRequestType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>METHOD_UNSET = 0;</code>
     */
    METHOD_UNSET(0),
    /**
     * <code>BUY_ITEM_POKECOINS = 2;</code>
     */
    BUY_ITEM_POKECOINS(2),
    /**
     * <code>BUY_ITEM_ANDROID = 3;</code>
     */
    BUY_ITEM_ANDROID(3),
    /**
     * <code>BUY_ITEM_IOS = 4;</code>
     */
    BUY_ITEM_IOS(4),
    /**
     * <code>GET_STORE_ITEMS = 5;</code>
     */
    GET_STORE_ITEMS(5),
    /**
     * <code>SEND_ENCRYPTED_SIGNATURE = 6;</code>
     */
    SEND_ENCRYPTED_SIGNATURE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>METHOD_UNSET = 0;</code>
     */
    public static final int METHOD_UNSET_VALUE = 0;
    /**
     * <code>BUY_ITEM_POKECOINS = 2;</code>
     */
    public static final int BUY_ITEM_POKECOINS_VALUE = 2;
    /**
     * <code>BUY_ITEM_ANDROID = 3;</code>
     */
    public static final int BUY_ITEM_ANDROID_VALUE = 3;
    /**
     * <code>BUY_ITEM_IOS = 4;</code>
     */
    public static final int BUY_ITEM_IOS_VALUE = 4;
    /**
     * <code>GET_STORE_ITEMS = 5;</code>
     */
    public static final int GET_STORE_ITEMS_VALUE = 5;
    /**
     * <code>SEND_ENCRYPTED_SIGNATURE = 6;</code>
     */
    public static final int SEND_ENCRYPTED_SIGNATURE_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PlatformRequestType valueOf(int value) {
      return forNumber(value);
    }

    public static PlatformRequestType forNumber(int value) {
      switch (value) {
        case 0: return METHOD_UNSET;
        case 2: return BUY_ITEM_POKECOINS;
        case 3: return BUY_ITEM_ANDROID;
        case 4: return BUY_ITEM_IOS;
        case 5: return GET_STORE_ITEMS;
        case 6: return SEND_ENCRYPTED_SIGNATURE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlatformRequestType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlatformRequestType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlatformRequestType>() {
            public PlatformRequestType findValueByNumber(int number) {
              return PlatformRequestType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.github.aeonlucid.pogoprotos.networking.Platform.getDescriptor().getEnumTypes().get(0);
    }

    private static final PlatformRequestType[] VALUES = values();

    public static PlatformRequestType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PlatformRequestType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.github.aeonlucid.pogoprotos.networking.platform.PlatformRequestType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9com/github/aeonlucid/pogoprotos/networ" +
      "king/Platform.proto\0223com.github.aeonluci" +
      "d.pogoprotos.networking.platform*\232\001\n\023Pla" +
      "tformRequestType\022\020\n\014METHOD_UNSET\020\000\022\026\n\022BU" +
      "Y_ITEM_POKECOINS\020\002\022\024\n\020BUY_ITEM_ANDROID\020\003" +
      "\022\020\n\014BUY_ITEM_IOS\020\004\022\023\n\017GET_STORE_ITEMS\020\005\022" +
      "\034\n\030SEND_ENCRYPTED_SIGNATURE\020\006B6\n*com.git" +
      "hub.aeonlucid.pogoprotos.networkingB\010Pla" +
      "tformb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
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
