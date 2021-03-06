// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface SetAclPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.SetAclPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** the path of the file or directory 
   * </pre>
   *
   * <code>optional string path = 1;</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <pre>
   ** the path of the file or directory 
   * </pre>
   *
   * <code>optional string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   ** the path of the file or directory 
   * </pre>
   *
   * <code>optional string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   ** the set action to perform 
   * </pre>
   *
   * <code>optional .alluxio.grpc.file.SetAclAction action = 2;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <pre>
   ** the set action to perform 
   * </pre>
   *
   * <code>optional .alluxio.grpc.file.SetAclAction action = 2;</code>
   * @return The action.
   */
  alluxio.grpc.SetAclAction getAction();

  /**
   * <pre>
   ** the list of ACL entries 
   * </pre>
   *
   * <code>repeated .alluxio.grpc.file.PAclEntry entries = 3;</code>
   */
  java.util.List<alluxio.grpc.PAclEntry> 
      getEntriesList();
  /**
   * <pre>
   ** the list of ACL entries 
   * </pre>
   *
   * <code>repeated .alluxio.grpc.file.PAclEntry entries = 3;</code>
   */
  alluxio.grpc.PAclEntry getEntries(int index);
  /**
   * <pre>
   ** the list of ACL entries 
   * </pre>
   *
   * <code>repeated .alluxio.grpc.file.PAclEntry entries = 3;</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   ** the list of ACL entries 
   * </pre>
   *
   * <code>repeated .alluxio.grpc.file.PAclEntry entries = 3;</code>
   */
  java.util.List<? extends alluxio.grpc.PAclEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   ** the list of ACL entries 
   * </pre>
   *
   * <code>repeated .alluxio.grpc.file.PAclEntry entries = 3;</code>
   */
  alluxio.grpc.PAclEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.file.SetAclPOptions options = 4;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.file.SetAclPOptions options = 4;</code>
   * @return The options.
   */
  alluxio.grpc.SetAclPOptions getOptions();
  /**
   * <pre>
   ** the method options 
   * </pre>
   *
   * <code>optional .alluxio.grpc.file.SetAclPOptions options = 4;</code>
   */
  alluxio.grpc.SetAclPOptionsOrBuilder getOptionsOrBuilder();
}
