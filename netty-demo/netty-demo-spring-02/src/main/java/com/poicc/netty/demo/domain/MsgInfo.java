// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Msg.proto

package com.poicc.netty.demo.domain;

public final class MsgInfo {
  private MsgInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_poicc_netty_demo_domain_MsgBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_poicc_netty_demo_domain_MsgBody_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\tMsg.proto\022\033com.poicc.netty.demo.domain" +
      "\"-\n\007MsgBody\022\021\n\tchannelId\030\001 \001(\t\022\017\n\007msgInf" +
      "o\030\002 \001(\tB(\n\033com.poicc.netty.demo.domainB\007" +
      "MsgInfoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_poicc_netty_demo_domain_MsgBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_poicc_netty_demo_domain_MsgBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_poicc_netty_demo_domain_MsgBody_descriptor,
        new String[] { "ChannelId", "MsgInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
