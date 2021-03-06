// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/sasl_server.proto

package alluxio.grpc;

public interface SaslMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.sasl.SaslMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.sasl.SaslMessageType messageType = 1;</code>
   * @return Whether the messageType field is set.
   */
  boolean hasMessageType();
  /**
   * <code>optional .alluxio.grpc.sasl.SaslMessageType messageType = 1;</code>
   * @return The messageType.
   */
  alluxio.grpc.SaslMessageType getMessageType();

  /**
   * <code>optional bytes message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>optional bytes message = 2;</code>
   * @return The message.
   */
  com.google.protobuf.ByteString getMessage();

  /**
   * <code>optional string clientId = 3;</code>
   * @return Whether the clientId field is set.
   */
  boolean hasClientId();
  /**
   * <code>optional string clientId = 3;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>optional string clientId = 3;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>optional .alluxio.grpc.sasl.ChannelAuthenticationScheme authenticationScheme = 4;</code>
   * @return Whether the authenticationScheme field is set.
   */
  boolean hasAuthenticationScheme();
  /**
   * <code>optional .alluxio.grpc.sasl.ChannelAuthenticationScheme authenticationScheme = 4;</code>
   * @return The authenticationScheme.
   */
  alluxio.grpc.ChannelAuthenticationScheme getAuthenticationScheme();

  /**
   * <code>optional string channelRef = 5;</code>
   * @return Whether the channelRef field is set.
   */
  boolean hasChannelRef();
  /**
   * <code>optional string channelRef = 5;</code>
   * @return The channelRef.
   */
  java.lang.String getChannelRef();
  /**
   * <code>optional string channelRef = 5;</code>
   * @return The bytes for channelRef.
   */
  com.google.protobuf.ByteString
      getChannelRefBytes();
}
