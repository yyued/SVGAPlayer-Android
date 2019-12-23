// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: cproxy.proto
package ikxd.cproxy;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class HeartbeatRes extends AndroidMessage<HeartbeatRes, HeartbeatRes.Builder> {
  public static final ProtoAdapter<HeartbeatRes> ADAPTER = ProtoAdapter.newMessageAdapter(HeartbeatRes.class);

  public static final Creator<HeartbeatRes> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_NEXT = 0L;

  public static final Long DEFAULT_TIMESTAMP = 0L;

  /**
   * 下一次心跳间隔，单位秒
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long next;

  /**
   * 服务器的unix timestamp，单位毫秒，用于客户端校准时间
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long timestamp;

  public HeartbeatRes(Long next, Long timestamp) {
    this(next, timestamp, ByteString.EMPTY);
  }

  public HeartbeatRes(Long next, Long timestamp, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.next = next;
    this.timestamp = timestamp;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.next = next;
    builder.timestamp = timestamp;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HeartbeatRes)) return false;
    HeartbeatRes o = (HeartbeatRes) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(next, o.next)
        && Internal.equals(timestamp, o.timestamp);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (next != null ? next.hashCode() : 0);
      result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<HeartbeatRes, Builder> {
    public Long next;

    public Long timestamp;

    public Builder() {
    }

    /**
     * 下一次心跳间隔，单位秒
     */
    public Builder next(Long next) {
      this.next = next;
      return this;
    }

    /**
     * 服务器的unix timestamp，单位毫秒，用于客户端校准时间
     */
    public Builder timestamp(Long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    @Override
    public HeartbeatRes build() {
      return new HeartbeatRes(next, timestamp, super.buildUnknownFields());
    }
  }
}
