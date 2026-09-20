package defpackage;

import java.net.DatagramPacket;

/* JADX INFO: loaded from: classes.dex */
public final class n33 extends cx1 implements h81<sd5> {
    public final /* synthetic */ DatagramPacket w;
    public final /* synthetic */ Throwable x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n33(DatagramPacket datagramPacket, Throwable th) {
        super(0);
        this.w = datagramPacket;
        this.x = th;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.a("Failed to send audio data to " + this.w.getAddress().getHostAddress() + ": " + this.x.getMessage());
        return sd5.a;
    }
}
