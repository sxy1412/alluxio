// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface TransformJobInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.TransformJobInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string db_name = 1;</code>
   * @return Whether the dbName field is set.
   */
  boolean hasDbName();
  /**
   * <code>optional string db_name = 1;</code>
   * @return The dbName.
   */
  java.lang.String getDbName();
  /**
   * <code>optional string db_name = 1;</code>
   * @return The bytes for dbName.
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string table_name = 2;</code>
   * @return Whether the tableName field is set.
   */
  boolean hasTableName();
  /**
   * <code>optional string table_name = 2;</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <code>optional string table_name = 2;</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>optional string definition = 3;</code>
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();
  /**
   * <code>optional string definition = 3;</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <code>optional string definition = 3;</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <code>optional int64 job_id = 4;</code>
   * @return Whether the jobId field is set.
   */
  boolean hasJobId();
  /**
   * <code>optional int64 job_id = 4;</code>
   * @return The jobId.
   */
  long getJobId();

  /**
   * <code>optional .alluxio.grpc.job.Status job_status = 5;</code>
   * @return Whether the jobStatus field is set.
   */
  boolean hasJobStatus();
  /**
   * <code>optional .alluxio.grpc.job.Status job_status = 5;</code>
   * @return The jobStatus.
   */
  alluxio.grpc.Status getJobStatus();

  /**
   * <code>optional string job_error = 6;</code>
   * @return Whether the jobError field is set.
   */
  boolean hasJobError();
  /**
   * <code>optional string job_error = 6;</code>
   * @return The jobError.
   */
  java.lang.String getJobError();
  /**
   * <code>optional string job_error = 6;</code>
   * @return The bytes for jobError.
   */
  com.google.protobuf.ByteString
      getJobErrorBytes();
}
