package defpackage;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;

/* JADX INFO: loaded from: classes.dex */
public final class xm2 extends cx1 implements j81<NetworkInterface, x94<? extends InterfaceAddress>> {
    public static final xm2 w = new xm2();

    public xm2() {
        super(1);
    }

    @Override // defpackage.j81
    public final x94<? extends InterfaceAddress> invoke(NetworkInterface networkInterface) {
        return new uu(networkInterface.getInterfaceAddresses());
    }
}
