package defpackage;

import java.net.InterfaceAddress;

/* JADX INFO: loaded from: classes.dex */
public final class zm2 extends cx1 implements j81<InterfaceAddress, String> {
    public static final zm2 w = new zm2();

    public zm2() {
        super(1);
    }

    @Override // defpackage.j81
    public final String invoke(InterfaceAddress interfaceAddress) {
        return interfaceAddress.getBroadcast().getHostAddress();
    }
}
