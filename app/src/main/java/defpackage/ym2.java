package defpackage;

import java.net.InetAddress;
import java.net.InterfaceAddress;

/* JADX INFO: loaded from: classes.dex */
public final class ym2 extends cx1 implements j81<InterfaceAddress, Boolean> {
    public static final ym2 w = new ym2();

    public ym2() {
        super(1);
    }

    @Override // defpackage.j81
    public final Boolean invoke(InterfaceAddress interfaceAddress) {
        InetAddress broadcast = interfaceAddress.getBroadcast();
        return Boolean.valueOf((broadcast != null ? broadcast.getHostAddress() : null) != null);
    }
}
