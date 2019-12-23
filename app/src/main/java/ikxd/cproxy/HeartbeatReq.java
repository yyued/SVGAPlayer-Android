// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: cproxy.proto
package ikxd.cproxy;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import okio.ByteString;

public final class HeartbeatReq extends AndroidMessage<HeartbeatReq, HeartbeatReq.Builder> {
  public static final ProtoAdapter<HeartbeatReq> ADAPTER = ProtoAdapter.newMessageAdapter(HeartbeatReq.class);

  public static final Creator<HeartbeatReq> CREATOR = AndroidMessage.newCreator(ADAPTER);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_GAME_ID = "";

  public static final Boolean DEFAULT_CHANGED = false;

  public static final Boolean DEFAULT_BACK_GROUND = false;

  /**
   * 传入当前进行的游戏的gameid，如果非游戏中，不填或者填空字符串
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String game_id;

  /**
   * gameid发生变化的时候为true，其他时候为false
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean changed;

  /**
   * 是否处于后台，true表示处于后台，false表示处于前台。前后台切换马上发个心跳
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean back_ground;

  public HeartbeatReq(String game_id, Boolean changed, Boolean back_ground) {
    this(game_id, changed, back_ground, ByteString.EMPTY);
  }

  public HeartbeatReq(String game_id, Boolean changed, Boolean back_ground,
      ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.game_id = game_id;
    this.changed = changed;
    this.back_ground = back_ground;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.game_id = game_id;
    builder.changed = changed;
    builder.back_ground = back_ground;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof HeartbeatReq)) return false;
    HeartbeatReq o = (HeartbeatReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(game_id, o.game_id)
        && Internal.equals(changed, o.changed)
        && Internal.equals(back_ground, o.back_ground);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (game_id != null ? game_id.hashCode() : 0);
      result = result * 37 + (changed != null ? changed.hashCode() : 0);
      result = result * 37 + (back_ground != null ? back_ground.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<HeartbeatReq, Builder> {
    public String game_id;

    public Boolean changed;

    public Boolean back_ground;

    public Builder() {
    }

    /**
     * 传入当前进行的游戏的gameid，如果非游戏中，不填或者填空字符串
     */
    public Builder game_id(String game_id) {
      this.game_id = game_id;
      return this;
    }

    /**
     * gameid发生变化的时候为true，其他时候为false
     */
    public Builder changed(Boolean changed) {
      this.changed = changed;
      return this;
    }

    /**
     * 是否处于后台，true表示处于后台，false表示处于前台。前后台切换马上发个心跳
     */
    public Builder back_ground(Boolean back_ground) {
      this.back_ground = back_ground;
      return this;
    }

    @Override
    public HeartbeatReq build() {
      return new HeartbeatReq(game_id, changed, back_ground, super.buildUnknownFields());
    }
  }
}
