package defpackage;

import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class rt2 implements Cloneable, ll5.QnHx {
    public static final List<kg3> Z = qf5.l(kg3.HTTP_2, kg3.HTTP_1_1);
    public static final List<b60> a0 = qf5.l(b60.e, b60.f);
    public final fu0.CQf A;
    public final boolean B;
    public final s1 C;
    public final boolean D;
    public final boolean E;
    public final f90 F;
    public final pm0 G;
    public final Proxy H;
    public final ProxySelector I;
    public final s1 J;
    public final SocketFactory K;
    public final SSLSocketFactory L;
    public final X509TrustManager M;
    public final List<b60> N;
    public final List<kg3> O;
    public final HostnameVerifier P;
    public final wn Q;
    public final B8C R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final long X;
    public final ny1 Y;
    public final ll0 w;
    public final ny1 x;
    public final List<xp1> y;
    public final List<xp1> z;

    public rt2(QnHx qnHx) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        boolean z;
        boolean z2;
        this.w = qnHx.a;
        this.x = qnHx.b;
        this.y = qf5.v(qnHx.c);
        this.z = qf5.v(qnHx.d);
        this.A = qnHx.e;
        this.B = qnHx.f;
        this.C = qnHx.g;
        this.D = qnHx.h;
        this.E = qnHx.i;
        this.F = qnHx.j;
        this.G = qnHx.k;
        Proxy proxy = qnHx.l;
        this.H = proxy;
        if (proxy != null) {
            proxySelector = iq2.a;
        } else {
            proxySelector = qnHx.m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = iq2.a;
            }
        }
        this.I = proxySelector;
        this.J = qnHx.n;
        this.K = qnHx.o;
        List<b60> list = qnHx.r;
        this.N = list;
        this.O = qnHx.s;
        this.P = qnHx.t;
        this.S = qnHx.w;
        this.T = qnHx.x;
        this.U = qnHx.y;
        this.V = qnHx.z;
        this.W = qnHx.A;
        this.X = qnHx.B;
        ny1 ny1Var = qnHx.C;
        this.Y = ny1Var == null ? new ny1(14) : ny1Var;
        List<b60> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (((b60) it.next()).a) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            this.L = null;
            this.R = null;
            this.M = null;
            this.Q = wn.c;
        } else {
            SSLSocketFactory sSLSocketFactory = qnHx.p;
            if (sSLSocketFactory != null) {
                this.L = sSLSocketFactory;
                B8C b8c = qnHx.v;
                this.R = b8c;
                this.M = qnHx.q;
                wn wnVar = qnHx.u;
                this.Q = ur1.a(wnVar.b, b8c) ? wnVar : new wn(wnVar.a, b8c);
            } else {
                x43 x43Var = x43.a;
                X509TrustManager x509TrustManagerM = x43.a.m();
                this.M = x509TrustManagerM;
                this.L = x43.a.l(x509TrustManagerM);
                B8C b8cB = x43.a.b(x509TrustManagerM);
                this.R = b8cB;
                wn wnVar2 = qnHx.u;
                this.Q = ur1.a(wnVar2.b, b8cB) ? wnVar2 : new wn(wnVar2.a, b8cB);
            }
        }
        List<xp1> list3 = this.y;
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(ur1.d(list3, "Null interceptor: ").toString());
        }
        List<xp1> list4 = this.z;
        if (!(!list4.contains(null))) {
            throw new IllegalStateException(ur1.d(list4, "Null network interceptor: ").toString());
        }
        List<b60> list5 = this.N;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator<T> it2 = list5.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                } else if (((b60) it2.next()).a) {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = true;
            break;
        }
        X509TrustManager x509TrustManager = this.M;
        B8C b8c2 = this.R;
        SSLSocketFactory sSLSocketFactory2 = this.L;
        if (!z2) {
            if (sSLSocketFactory2 == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (b8c2 == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (x509TrustManager == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(sSLSocketFactory2 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(b8c2 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(x509TrustManager == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!ur1.a(this.Q, wn.c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // ll5.QnHx
    public final jk3 a(cp3 cp3Var, rl5 rl5Var) {
        jk3 jk3Var = new jk3(h15.i, cp3Var, rl5Var, new Random(), this.W, this.X);
        if (cp3Var.a("Sec-WebSocket-Extensions") != null) {
            jk3Var.j(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            QnHx qnHx = new QnHx(this);
            qnHx.e = new vK0u(fu0.a, 8);
            ArrayList arrayList = new ArrayList(jk3.w);
            kg3 kg3Var = kg3.H2_PRIOR_KNOWLEDGE;
            if (!(arrayList.contains(kg3Var) || arrayList.contains(kg3.HTTP_1_1))) {
                throw new IllegalArgumentException(ur1.d(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ").toString());
            }
            if (!(!arrayList.contains(kg3Var) || arrayList.size() <= 1)) {
                throw new IllegalArgumentException(ur1.d(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ").toString());
            }
            if (!(!arrayList.contains(kg3.HTTP_1_0))) {
                throw new IllegalArgumentException(ur1.d(arrayList, "protocols must not contain http/1.0: ").toString());
            }
            if (!(!arrayList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            arrayList.remove(kg3.SPDY_3);
            if (!ur1.a(arrayList, qnHx.s)) {
                qnHx.C = null;
            }
            qnHx.s = Collections.unmodifiableList(arrayList);
            rt2 rt2Var = new rt2(qnHx);
            new LinkedHashMap();
            String str = cp3Var.b;
            B8C b8c = cp3Var.d;
            Map<Class<?>, Object> map = cp3Var.e;
            LinkedHashMap linkedHashMap = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
            nc1.QnHx qnHxC = cp3Var.c.c();
            qnHxC.d("Upgrade", "websocket");
            qnHxC.d("Connection", "Upgrade");
            qnHxC.d("Sec-WebSocket-Key", jk3Var.f);
            qnHxC.d("Sec-WebSocket-Version", "13");
            qnHxC.d("Sec-WebSocket-Extensions", "permessage-deflate");
            ch1 ch1Var = cp3Var.a;
            if (ch1Var == null) {
                throw new IllegalStateException("url == null".toString());
            }
            cp3 cp3Var2 = new cp3(ch1Var, str, qnHxC.b(), b8c, linkedHashMap.isEmpty() ? ds0.w : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
            bj3 bj3Var = new bj3(rt2Var, cp3Var2, true);
            jk3Var.g = bj3Var;
            bj3Var.h(new kk3(jk3Var, cp3Var2));
        }
        return jk3Var;
    }

    public final Object clone() {
        return super.clone();
    }

    public static final class QnHx {
        public final int A;
        public final long B;
        public ny1 C;
        public ll0 a;
        public final ny1 b;
        public final ArrayList c;
        public final ArrayList d;
        public fu0.CQf e;
        public boolean f;
        public final s1 g;
        public boolean h;
        public boolean i;
        public final f90 j;
        public final pm0 k;
        public Proxy l;
        public final ProxySelector m;
        public final s1 n;
        public final SocketFactory o;
        public final SSLSocketFactory p;
        public final X509TrustManager q;
        public final List<b60> r;
        public List<? extends kg3> s;
        public final HostnameVerifier t;
        public final wn u;
        public final B8C v;
        public final int w;
        public int x;
        public int y;
        public int z;

        public QnHx() {
            this.a = new ll0();
            this.b = new ny1(13);
            this.c = new ArrayList();
            this.d = new ArrayList();
            fu0.QnHx qnHx = fu0.a;
            byte[] bArr = qf5.a;
            this.e = new vK0u(qnHx, 8);
            this.f = true;
            r1 r1Var = s1.a;
            this.g = r1Var;
            this.h = true;
            this.i = true;
            this.j = f90.g;
            this.k = pm0.h;
            this.n = r1Var;
            this.o = SocketFactory.getDefault();
            this.r = rt2.a0;
            this.s = rt2.Z;
            this.t = pt2.a;
            this.u = wn.c;
            this.x = 10000;
            this.y = 10000;
            this.z = 10000;
            this.B = 1024L;
        }

        public QnHx(rt2 rt2Var) {
            this();
            this.a = rt2Var.w;
            this.b = rt2Var.x;
            su.x0(rt2Var.y, this.c);
            su.x0(rt2Var.z, this.d);
            this.e = rt2Var.A;
            this.f = rt2Var.B;
            this.g = rt2Var.C;
            this.h = rt2Var.D;
            this.i = rt2Var.E;
            this.j = rt2Var.F;
            this.k = rt2Var.G;
            this.l = rt2Var.H;
            this.m = rt2Var.I;
            this.n = rt2Var.J;
            this.o = rt2Var.K;
            this.p = rt2Var.L;
            this.q = rt2Var.M;
            this.r = rt2Var.N;
            this.s = rt2Var.O;
            this.t = rt2Var.P;
            this.u = rt2Var.Q;
            this.v = rt2Var.R;
            this.w = rt2Var.S;
            this.x = rt2Var.T;
            this.y = rt2Var.U;
            this.z = rt2Var.V;
            this.A = rt2Var.W;
            this.B = rt2Var.X;
            this.C = rt2Var.Y;
        }
    }

    public rt2() {
        this(new QnHx());
    }
}
