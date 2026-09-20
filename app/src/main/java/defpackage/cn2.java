package defpackage;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public final class cn2 extends cx1 implements j81<InetAddress, String> {
    public static final cn2 w = new cn2();

    public cn2() {
        super(1);
    }

    @Override // defpackage.j81
    public final String invoke(InetAddress inetAddress) {
        return inetAddress.getHostAddress();
    }
}
