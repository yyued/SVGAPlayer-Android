// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: svga.proto
package com.opensource.svgaplayer.proto;

import android.os.Parcelable;

import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;

import okio.ByteString;

public final class MovieParams extends AndroidMessage<MovieParams, MovieParams.Builder> {
  public static final ProtoAdapter<MovieParams> ADAPTER = ProtoAdapter.newMessageAdapter(
          MovieParams.class);

  public static final Parcelable.Creator<MovieParams> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final Float DEFAULT_VIEWBOXWIDTH = 0.0f;

  public static final Float DEFAULT_VIEWBOXHEIGHT = 0.0f;

  public static final Integer DEFAULT_FPS = 0;

  public static final Integer DEFAULT_FRAMES = 0;

  /**
   * 画布宽
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT",
      returnDefaultValue = false
  )
  public final Float viewBoxWidth;

  /**
   * 画布高
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT",
      returnDefaultValue = false
  )
  public final Float viewBoxHeight;

  /**
   * 动画每秒播放帧数，合法值是 [1, 2, 3, 5, 6, 10, 12, 15, 20, 30, 60] 中的任意一个。
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      returnDefaultValue = false
  )
  public final Integer fps;

  /**
   * 动画总帧数
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      returnDefaultValue = false
  )
  public final Integer frames;

  public MovieParams(Float viewBoxWidth, Float viewBoxHeight, Integer fps, Integer frames) {
    this(viewBoxWidth, viewBoxHeight, fps, frames, ByteString.EMPTY);
  }

  public MovieParams(Float viewBoxWidth, Float viewBoxHeight, Integer fps, Integer frames,
                     ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.viewBoxWidth = viewBoxWidth;
    this.viewBoxHeight = viewBoxHeight;
    this.fps = fps;
    this.frames = frames;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.viewBoxWidth = viewBoxWidth;
    builder.viewBoxHeight = viewBoxHeight;
    builder.fps = fps;
    builder.frames = frames;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MovieParams)) return false;
    MovieParams o = (MovieParams) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(viewBoxWidth, o.viewBoxWidth)
        && Internal.equals(viewBoxHeight, o.viewBoxHeight)
        && Internal.equals(fps, o.fps)
        && Internal.equals(frames, o.frames);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (viewBoxWidth != null ? viewBoxWidth.hashCode() : 0);
      result = result * 37 + (viewBoxHeight != null ? viewBoxHeight.hashCode() : 0);
      result = result * 37 + (fps != null ? fps.hashCode() : 0);
      result = result * 37 + (frames != null ? frames.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<MovieParams, Builder> {
    public float viewBoxWidth;

    public float viewBoxHeight;

    public int fps;

    public int frames;

    public Builder() {
    }

    /**
     * 画布宽
     */
    public Builder viewBoxWidth(Float viewBoxWidth) {
      this.viewBoxWidth = viewBoxWidth;
      return this;
    }

    /**
     * 画布高
     */
    public Builder viewBoxHeight(Float viewBoxHeight) {
      this.viewBoxHeight = viewBoxHeight;
      return this;
    }

    /**
     * 动画每秒播放帧数，合法值是 [1, 2, 3, 5, 6, 10, 12, 15, 20, 30, 60] 中的任意一个。
     */
    public Builder fps(Integer fps) {
      this.fps = fps;
      return this;
    }

    /**
     * 动画总帧数
     */
    public Builder frames(Integer frames) {
      this.frames = frames;
      return this;
    }

    @Override
    public MovieParams build() {
      return new MovieParams(viewBoxWidth, viewBoxHeight, fps, frames, super.buildUnknownFields());
    }
  }
}
