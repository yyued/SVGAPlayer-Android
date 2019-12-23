// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: svga.proto
package com.opensource.svgaplayer.proto;

import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;

import okio.ByteString;

public final class AudioEntity extends AndroidMessage<AudioEntity, AudioEntity.Builder> {
  public static final ProtoAdapter<AudioEntity> ADAPTER = ProtoAdapter.newMessageAdapter(AudioEntity.class);

  public static final Creator<AudioEntity> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_AUDIOKEY = "";

  public static final Integer DEFAULT_STARTFRAME = 0;

  public static final Integer DEFAULT_ENDFRAME = 0;

  public static final Integer DEFAULT_STARTTIME = 0;

  public static final Integer DEFAULT_TOTALTIME = 0;

  /**
   * 音频文件名
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      returnDefaultValue = false
  )
  public final String audioKey;

  /**
   * 音频播放起始帧
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      returnDefaultValue = false
  )
  public final Integer startFrame;

  /**
   * 音频播放结束帧
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      returnDefaultValue = false
  )
  public final Integer endFrame;

  /**
   * 音频播放起始时间（相对音频长度）
   */
  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      returnDefaultValue = false
  )
  public final Integer startTime;

  /**
   * 音频总长度
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      returnDefaultValue = false
  )
  public final Integer totalTime;

  public AudioEntity(String audioKey, Integer startFrame, Integer endFrame, Integer startTime,
      Integer totalTime) {
    this(audioKey, startFrame, endFrame, startTime, totalTime, ByteString.EMPTY);
  }

  public AudioEntity(String audioKey, Integer startFrame, Integer endFrame, Integer startTime,
      Integer totalTime, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.audioKey = audioKey;
    this.startFrame = startFrame;
    this.endFrame = endFrame;
    this.startTime = startTime;
    this.totalTime = totalTime;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.audioKey = audioKey;
    builder.startFrame = startFrame;
    builder.endFrame = endFrame;
    builder.startTime = startTime;
    builder.totalTime = totalTime;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AudioEntity)) return false;
    AudioEntity o = (AudioEntity) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(audioKey, o.audioKey)
        && Internal.equals(startFrame, o.startFrame)
        && Internal.equals(endFrame, o.endFrame)
        && Internal.equals(startTime, o.startTime)
        && Internal.equals(totalTime, o.totalTime);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (audioKey != null ? audioKey.hashCode() : 0);
      result = result * 37 + (startFrame != null ? startFrame.hashCode() : 0);
      result = result * 37 + (endFrame != null ? endFrame.hashCode() : 0);
      result = result * 37 + (startTime != null ? startTime.hashCode() : 0);
      result = result * 37 + (totalTime != null ? totalTime.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AudioEntity, Builder> {
    public String audioKey;

    public int startFrame;

    public int endFrame;

    public int startTime;

    public int totalTime;

    public Builder() {
    }

    /**
     * 音频文件名
     */
    public Builder audioKey(String audioKey) {
      this.audioKey = audioKey;
      return this;
    }

    /**
     * 音频播放起始帧
     */
    public Builder startFrame(Integer startFrame) {
      this.startFrame = startFrame;
      return this;
    }

    /**
     * 音频播放结束帧
     */
    public Builder endFrame(Integer endFrame) {
      this.endFrame = endFrame;
      return this;
    }

    /**
     * 音频播放起始时间（相对音频长度）
     */
    public Builder startTime(Integer startTime) {
      this.startTime = startTime;
      return this;
    }

    /**
     * 音频总长度
     */
    public Builder totalTime(Integer totalTime) {
      this.totalTime = totalTime;
      return this;
    }

    @Override
    public AudioEntity build() {
      return new AudioEntity(audioKey, startFrame, endFrame, startTime, totalTime, super.buildUnknownFields());
    }
  }
}
