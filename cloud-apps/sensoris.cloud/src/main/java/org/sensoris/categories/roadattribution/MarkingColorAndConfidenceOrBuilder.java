// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

package org.sensoris.categories.roadattribution;

public interface MarkingColorAndConfidenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.MarkingColorAndConfidence.Type type = 1;</code>
   */
  org.sensoris.categories.roadattribution.MarkingColorAndConfidence.Type getType();

  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  boolean hasConfidence();
  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  org.sensoris.types.base.Confidence getConfidence();
  /**
   * <pre>
   * Confidence of type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Confidence confidence = 2;</code>
   */
  org.sensoris.types.base.ConfidenceOrBuilder getConfidenceOrBuilder();
}
