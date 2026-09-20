package defpackage;

import java.net.InetAddress;
import java.net.NetworkInterface;

/* JADX INFO: loaded from: classes.dex */
public final class bn2 extends cx1 implements j81<NetworkInterface, x94<? extends InetAddress>> {
    public static final bn2 w = new bn2();

    public bn2() {
        super(1);
    }

    @Override // defpackage.j81
    public final x94<? extends InetAddress> invoke(NetworkInterface networkInterface) {
        return ba4.F0(new nu(networkInterface.getInetAddresses()));
    }
}
