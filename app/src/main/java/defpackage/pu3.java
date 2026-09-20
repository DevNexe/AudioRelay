package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class pu3 {
    public final COm6Fixed a;
    public final Proxy b;
    public final InetSocketAddress c;

    public pu3(COm6Fixed cOm6, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.a = cOm6;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pu3) {
            pu3 pu3Var = (pu3) obj;
            if (ur1.a(pu3Var.a, this.a) && ur1.a(pu3Var.b, this.b) && ur1.a(pu3Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
