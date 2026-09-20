package defpackage;

import com.google.protobuf.Descriptors;
import com.google.protobuf.lPt3Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class ub5 {
    public static final Descriptors.QnHx a;
    public static final lPt3Fixed.YKK b;
    public static final Descriptors.YKK c;

    static {
        Descriptors.YKK ykkN = Descriptors.YKK.n(new String[]{"\n\u0010StreamData.proto\u0012\faudioconnect\"\u0098\u0001\n\nStreamData\u0012\f\n\u0004tick\u0018\u0001 \u0001(\u0003\u0012\u0014\n\ftimestamp_ms\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007payload\u0018\u0003 \u0001(\f\u0012\u0014\n\fpayload_size\u0018\u0004 \u0001(\u0005\u0012\u0019\n\u0011is_retransmission\u0018\u0005 \u0001(\b\u0012$\n\u001crestransmission_timestamp_ms\u0018\u0006 \u0001(\u0003BV\n&com.azefsw.audioconnect.network.streamB\tTypeProtoP\u0001 \u0001\u0001ª\u0002\u001bAudioConnect.Network.Streamb\u0006proto3"}, new Descriptors.YKK[0]);
        c = ykkN;
        Descriptors.QnHx qnHx = ykkN.l().get(0);
        a = qnHx;
        b = new lPt3Fixed.YKK(qnHx, new String[]{"Tick", "TimestampMs", "Payload", "PayloadSize", "IsRetransmission", "RestransmissionTimestampMs"});
    }
}
