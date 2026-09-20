package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class COm6Fixed {
    public final pm0 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final wn e;
    public final s1 f;
    public final Proxy g;
    public final ProxySelector h;
    public final ch1 i;
    public final List<kg3> j;
    public final List<b60> k;

    public COm6Fixed(String str, int i, pm0 pm0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, wn wnVar, s1 s1Var, Proxy proxy, List<? extends kg3> list, List<b60> list2, ProxySelector proxySelector) {
        this.a = pm0Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = wnVar;
        this.f = s1Var;
        this.g = proxy;
        this.h = proxySelector;
        ch1.QnHx qnHx = new ch1.QnHx();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (iv4.r(str2, "http")) {
            qnHx.a = "http";
        } else {
            if (!iv4.r(str2, "https")) {
                throw new IllegalArgumentException(ur1.d(str2, "unexpected scheme: "));
            }
            qnHx.a = "https";
        }
        boolean z = false;
        String strS = AY.S(ch1.CQf.c(str, 0, 0, false, 7));
        if (strS == null) {
            throw new IllegalArgumentException(ur1.d(str, "unexpected host: "));
        }
        qnHx.d = strS;
        if (1 <= i && i < 65536) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(ur1.d(Integer.valueOf(i), "unexpected port: ").toString());
        }
        qnHx.e = i;
        this.i = qnHx.a();
        this.j = qf5.v(list);
        this.k = qf5.v(list2);
    }

    public final boolean a(COm6Fixed cOm6) {
        return ur1.a(this.a, cOm6.a) && ur1.a(this.f, cOm6.f) && ur1.a(this.j, cOm6.j) && ur1.a(this.k, cOm6.k) && ur1.a(this.h, cOm6.h) && ur1.a(this.g, cOm6.g) && ur1.a(this.c, cOm6.c) && ur1.a(this.d, cOm6.d) && ur1.a(this.e, cOm6.e) && this.i.e == cOm6.i.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof COm6Fixed) {
            COm6Fixed cOm6 = (COm6Fixed) obj;
            if (ur1.a(this.i, cOm6.i) && a(cOm6)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.g) + ((this.h.hashCode() + qg5.a(this.k, qg5.a(this.j, (this.f.hashCode() + ((this.a.hashCode() + ((this.i.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ch1 ch1Var = this.i;
        sb.append(ch1Var.d);
        sb.append(':');
        sb.append(ch1Var.e);
        sb.append(", ");
        Proxy proxy = this.g;
        return bl2.c(sb, proxy != null ? ur1.d(proxy, "proxy=") : ur1.d(this.h, "proxySelector="), '}');
    }
}
