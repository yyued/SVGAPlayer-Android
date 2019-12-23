// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: svga.proto
package com.opensource.svgaplayer.proto;

import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapterJvm;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;

import java.util.List;
import java.util.Map;

import okio.ByteString;

public final class MovieEntity extends AndroidMessage<MovieEntity, MovieEntity.Builder> {
  public static final ProtoAdapter<MovieEntity> ADAPTER = ProtoAdapterJvm.newMessageAdapter(MovieEntity.class);

  public static final Creator<MovieEntity> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_VERSION = "";

  /**
   * SVGA 格式版本号
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String version;

  /**
   * 动画参数
   */
  @WireField(
      tag = 2,
      adapter = "com.opensource.svgaplayer.proto.MovieParams#ADAPTER"
  )
  public final MovieParams params;

  /**
   * Key 是位图键名，Value 是位图文件名或二进制 PNG 数据。
   */
  @WireField(
      tag = 3,
      keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final Map<String, ByteString> images;

  /**
   * 元素列表
   */
  @WireField(
      tag = 4,
      adapter = "com.opensource.svgaplayer.proto.SpriteEntity#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<SpriteEntity> sprites;

  /**
   * 音频列表
   */
  @WireField(
      tag = 5,
      adapter = "com.opensource.svgaplayer.proto.AudioEntity#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<AudioEntity> audios;

  public MovieEntity(String version, MovieParams params, Map<String, ByteString> images,
                     List<SpriteEntity> sprites, List<AudioEntity> audios) {
    this(version, params, images, sprites, audios, ByteString.EMPTY);
  }

  public MovieEntity(String version, MovieParams params, Map<String, ByteString> images,
                     List<SpriteEntity> sprites, List<AudioEntity> audios, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.version = version;
    this.params = params;
    this.images = Internal.immutableCopyOf("images", images);
    this.sprites = Internal.immutableCopyOf("sprites", sprites);
    this.audios = Internal.immutableCopyOf("audios", audios);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.version = version;
    builder.params = params;
    builder.images = Internal.copyOf("images", images);
    builder.sprites = Internal.copyOf("sprites", sprites);
    builder.audios = Internal.copyOf("audios", audios);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MovieEntity)) return false;
    MovieEntity o = (MovieEntity) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(version, o.version)
        && Internal.equals(params, o.params)
        && images.equals(o.images)
        && sprites.equals(o.sprites)
        && audios.equals(o.audios);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + (params != null ? params.hashCode() : 0);
      result = result * 37 + images.hashCode();
      result = result * 37 + sprites.hashCode();
      result = result * 37 + audios.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<MovieEntity, Builder> {
    public String version;

    public MovieParams params;

    public Map<String, ByteString> images;

    public List<SpriteEntity> sprites;

    public List<AudioEntity> audios;

    public Builder() {
      images = Internal.newMutableMap();
      sprites = Internal.newMutableList();
      audios = Internal.newMutableList();
    }

    /**
     * SVGA 格式版本号
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }

    /**
     * 动画参数
     */
    public Builder params(MovieParams params) {
      this.params = params;
      return this;
    }

    /**
     * Key 是位图键名，Value 是位图文件名或二进制 PNG 数据。
     */
    public Builder images(Map<String, ByteString> images) {
      Internal.checkElementsNotNull(images);
      this.images = images;
      return this;
    }

    /**
     * 元素列表
     */
    public Builder sprites(List<SpriteEntity> sprites) {
      Internal.checkElementsNotNull(sprites);
      this.sprites = sprites;
      return this;
    }

    /**
     * 音频列表
     */
    public Builder audios(List<AudioEntity> audios) {
      Internal.checkElementsNotNull(audios);
      this.audios = audios;
      return this;
    }

    @Override
    public MovieEntity build() {
      return new MovieEntity(version, params, images, sprites, audios, super.buildUnknownFields());
    }
  }
}
