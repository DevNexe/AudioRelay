package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/* JADX INFO: loaded from: classes.dex */
public final class hd5 extends hq4 {
    public final DatagramSocket c;
    public final String d;
    public final DatagramPacket e;
    public final c2 f;

    public hd5(DatagramSocket datagramSocket, String str, n60.LPt8Fixed lPt8) {
        super(lPt8);
        this.c = datagramSocket;
        this.d = str;
        this.e = new DatagramPacket(new byte[0], 0);
        gq0.QnHx qnHx = gq0.x;
        this.f = new c2(ps0.o0(5, kq0.MINUTES));
    }
}
