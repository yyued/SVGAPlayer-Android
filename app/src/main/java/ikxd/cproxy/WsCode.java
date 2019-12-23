// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: cproxy.proto
package ikxd.cproxy;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.lang.Override;

/**
 * websocket 自定义code约定，代码可以不用
 */
public enum WsCode implements WireEnum {
  kWsCodeNone(0),

  /**
   * 以下4000-4100 的错误码下，客户端不要重连
   * 同样的uid在不同设备上发起新连接，则断掉旧连接
   */
  kWsCloseKickOff(4000),

  /**
   * 同样的uid在相同的设备上发起新连接，则断掉就连接
   */
  kWsCloseDisconnect(4001),

  /**
   * 账号/设备被封禁
   */
  kWsCloseBanned(4002),

  /**
   * version not supported any more
   */
  kWsCloseVersionNS(4003),

  /**
   * token非法
   */
  kWsCloseTokenInvalid(4101);

  public static final ProtoAdapter<WsCode> ADAPTER = ProtoAdapter.newEnumAdapter(WsCode.class);

  private final int value;

  WsCode(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static WsCode fromValue(int value) {
    switch (value) {
      case 0: return kWsCodeNone;
      case 4000: return kWsCloseKickOff;
      case 4001: return kWsCloseDisconnect;
      case 4002: return kWsCloseBanned;
      case 4003: return kWsCloseVersionNS;
      case 4101: return kWsCloseTokenInvalid;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }
}
