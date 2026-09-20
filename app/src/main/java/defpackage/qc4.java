package defpackage;

import com.google.protobuf.NUlFixed;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class qc4 implements mc4 {
    public static final byte[] f = new byte[512000];
    public final in2 a;
    public DatagramSocket b;
    public final w9<mc4.F1> c = w9.H(mc4.F1.Paused);
    public final w9<mc4.QnHx> d = new w9<>();
    public final c2 e;

    public qc4(in2 in2Var) {
        this.a = in2Var;
        gq0.QnHx qnHx = gq0.x;
        this.e = new c2(ps0.o0(1, kq0.HOURS));
    }

    public static mc4.CQf c(DatagramSocket datagramSocket) throws IOException {
        DatagramPacket datagramPacket = new DatagramPacket(f, 512000);
        try {
            datagramSocket.receive(datagramPacket);
            byte[] data = datagramPacket.getData();
            InetAddress address = datagramPacket.getAddress();
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
            int i = byteBufferOrder.getInt();
            byte[] bArr = new byte[i];
            byteBufferOrder.get(bArr, 0, i);
            cg3.QnHx qnHx = cg3.G;
            lk.YKK ykk = lk.x;
            NUlFixed.QnHx qnHxH = new lk.F1(bArr, 0, i).h();
            qnHxH.k = true;
            return new mc4.CQf(address.getHostAddress(), OW8.w((cg3) qnHx.e(qnHxH)), zs.QnHx.a.c());
        } catch (SocketTimeoutException unused) {
            return null;
        }
    }

    @Override // defpackage.mc4
    public final am a() {
        us2 us2Var = this.a.a;
        k71 k71Var = new k71(6);
        us2Var.getClass();
        return iE.b(vq2.k(new cs2(us2Var, k71Var), this.d, new nc4(this, 0)));
    }

    @Override // defpackage.mc4
    public final Object b(vd4 vd4Var) {
        Object objB = JUCk.b(new uw(new im3(this, 2)).i(j54.c), vd4Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }

    @Override // defpackage.mc4
    public final am getState() {
        return iE.b(this.c);
    }
}
