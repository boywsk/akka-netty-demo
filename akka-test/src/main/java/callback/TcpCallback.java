package callback;

import protobuf.ProtobufMsg;

/**
 * Created by wangshikai on 2016/6/1.
 */
public interface TcpCallback {
    public void callback(ProtobufMsg.CommonMsg msg);
}
