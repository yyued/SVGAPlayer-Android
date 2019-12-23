// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: svga.proto
package com.opensource.svgaplayer.proto;

import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;

import java.util.List;

import okio.ByteString;

public final class FrameEntity extends AndroidMessage<FrameEntity, FrameEntity.Builder> {
  public static final ProtoAdapter<FrameEntity> ADAPTER = ProtoAdapter.newMessageAdapter(FrameEntity.class);

  public static final Creator<FrameEntity> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final Float DEFAULT_ALPHA = 0.0f;

  public static final String DEFAULT_CLIPPATH = "";

  /**
   * 透明度
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT",
      returnDefaultValue = false
  )
  public final Float alpha;

  /**
   * 初始约束大小
   */
  @WireField(
      tag = 2,
      adapter = "com.opensource.svgaplayer.proto.Layout#ADAPTER",
      returnDefaultValue = false
  )
  public final Layout layout;

  /**
   * 2D 变换矩阵
   */
  @WireField(
      tag = 3,
      adapter = "com.opensource.svgaplayer.proto.Transform#ADAPTER",
      returnDefaultValue = false
  )
  public final Transform transform;

  /**
   * 遮罩路径，使用 SVG 标准 Path 绘制图案进行 Mask 遮罩。
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      returnDefaultValue = false
  )
  public final String clipPath;

  /**
   * 矢量元素列表
   */
  @WireField(
      tag = 5,
      adapter = "com.opensource.svgaplayer.proto.ShapeEntity#ADAPTER",
      label = WireField.Label.REPEATED,
      returnDefaultValue = false
  )
  public final List<ShapeEntity> shapes;

  public FrameEntity(Float alpha, Layout layout, Transform transform, String clipPath,
      List<ShapeEntity> shapes) {
    this(alpha, layout, transform, clipPath, shapes, ByteString.EMPTY);
  }

  public FrameEntity(Float alpha, Layout layout, Transform transform, String clipPath,
      List<ShapeEntity> shapes, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.alpha = alpha;
    this.layout = layout;
    this.transform = transform;
    this.clipPath = clipPath;
    this.shapes = Internal.immutableCopyOf("shapes", shapes);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.alpha = alpha;
    builder.layout = layout;
    builder.transform = transform;
    builder.clipPath = clipPath;
    builder.shapes = Internal.copyOf(shapes);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FrameEntity)) return false;
    FrameEntity o = (FrameEntity) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(alpha, o.alpha)
        && Internal.equals(layout, o.layout)
        && Internal.equals(transform, o.transform)
        && Internal.equals(clipPath, o.clipPath)
        && shapes.equals(o.shapes);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (alpha != null ? alpha.hashCode() : 0);
      result = result * 37 + (layout != null ? layout.hashCode() : 0);
      result = result * 37 + (transform != null ? transform.hashCode() : 0);
      result = result * 37 + (clipPath != null ? clipPath.hashCode() : 0);
      result = result * 37 + shapes.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<FrameEntity, Builder> {
    public float alpha;

    public Layout layout;

    public Transform transform;

    public String clipPath;

    public List<ShapeEntity> shapes;

    public Builder() {
      shapes = Internal.newMutableList();
    }

    /**
     * 透明度
     */
    public Builder alpha(Float alpha) {
      this.alpha = alpha;
      return this;
    }

    /**
     * 初始约束大小
     */
    public Builder layout(Layout layout) {
      this.layout = layout;
      return this;
    }

    /**
     * 2D 变换矩阵
     */
    public Builder transform(Transform transform) {
      this.transform = transform;
      return this;
    }

    /**
     * 遮罩路径，使用 SVG 标准 Path 绘制图案进行 Mask 遮罩。
     */
    public Builder clipPath(String clipPath) {
      this.clipPath = clipPath;
      return this;
    }

    /**
     * 矢量元素列表
     */
    public Builder shapes(List<ShapeEntity> shapes) {
      Internal.checkElementsNotNull(shapes);
      this.shapes = shapes;
      return this;
    }

    @Override
    public FrameEntity build() {
      return new FrameEntity(alpha, layout, transform, clipPath, shapes, super.buildUnknownFields());
    }
  }
}
