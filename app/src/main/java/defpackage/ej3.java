package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;

/* JADX INFO: loaded from: classes3.dex */
public final class ej3 extends xd1.CQf {
    public final pu3 b;
    public Socket c;
    public Socket d;
    public ub1 e;
    public kg3 f;
    public xd1 g;
    public aj3 h;
    public zi3 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o = 1;
    public final ArrayList p = new ArrayList();
    public long q = Long.MAX_VALUE;

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            a = iArr;
        }
    }

    public ej3(pu3 pu3Var) {
        this.b = pu3Var;
    }

    public static void d(rt2 rt2Var, pu3 pu3Var, IOException iOException) {
        if (pu3Var.b.type() != Proxy.Type.DIRECT) {
            COm6Fixed cOm6 = pu3Var.a;
            cOm6.h.connectFailed(cOm6.i.g(), pu3Var.b.address(), iOException);
        }
        ny1 ny1Var = rt2Var.Y;
        synchronized (ny1Var) {
            ((Set) ny1Var.w).add(pu3Var);
        }
    }

    @Override // xd1.CQf
    public final synchronized void a(rg4 rg4Var) {
        this.o = (rg4Var.a & 16) != 0 ? rg4Var.b[4] : Integer.MAX_VALUE;
    }

    @Override // xd1.CQf
    public final void b(ke1 ke1Var) {
        ke1Var.c(rt0.REFUSED_STREAM, null);
    }

    public final void c(int i, int i2, int i3, int i4, boolean z, bj3 bj3Var, fu0 fu0Var) throws Throwable {
        boolean z2 = false;
        if (!(this.f == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        COm6Fixed cOm6 = this.b.a;
        List<b60> list = cOm6.k;
        wh6 wh6Var = new wh6(list);
        if (cOm6.c == null) {
            if (!list.contains(b60.f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.i.d;
            x43 x43Var = x43.a;
            if (!x43.a.h(str)) {
                throw new RouteException(new UnknownServiceException(fc2.a("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (cOm6.j.contains(kg3.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                pu3 pu3Var = this.b;
                if (pu3Var.a.c != null && pu3Var.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, fu0Var);
                    if (this.c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i, i2, fu0Var);
                g(wh6Var, i4, fu0Var);
                InetSocketAddress inetSocketAddress = this.b.c;
                break;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    qf5.e(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    qf5.e(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                InetSocketAddress inetSocketAddress2 = this.b.c;
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    Th.a(routeException.w, e);
                    routeException.x = e;
                }
                if (!z) {
                    throw routeException;
                }
                wh6Var.c = true;
                if (!((!wh6Var.b || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true)) {
                    throw routeException;
                }
            }
        }
        pu3 pu3Var2 = this.b;
        if (pu3Var2.a.c != null && pu3Var2.b.type() == Proxy.Type.HTTP) {
            z2 = true;
        }
        if (z2 && this.c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, fu0 fu0Var) throws IOException {
        pu3 pu3Var = this.b;
        Proxy proxy = pu3Var.b;
        COm6Fixed cOm6 = pu3Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : QnHx.a[type.ordinal()];
        Socket socketCreateSocket = (i3 == 1 || i3 == 2) ? cOm6.b.createSocket() : new Socket(proxy);
        this.c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.b.c;
        fu0Var.getClass();
        socketCreateSocket.setSoTimeout(i2);
        try {
            x43 x43Var = x43.a;
            x43.a.e(socketCreateSocket, this.b.c, i);
            try {
                Logger logger = eu2.a;
                eq4 eq4Var = new eq4(socketCreateSocket);
                this.h = new aj3(new eiJ(eq4Var, new so1(socketCreateSocket.getInputStream(), eq4Var)));
                eq4 eq4Var2 = new eq4(socketCreateSocket);
                this.i = new zi3(new y9I(eq4Var2, new qw2(socketCreateSocket.getOutputStream(), eq4Var2)));
            } catch (NullPointerException e) {
                if (ur1.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(ur1.d(this.b.c, "Failed to connect to "));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, fu0 fu0Var) throws IOException {
        cp3.QnHx qnHx = new cp3.QnHx();
        pu3 pu3Var = this.b;
        qnHx.a = pu3Var.a.i;
        qnHx.c("CONNECT", null);
        COm6Fixed cOm6 = pu3Var.a;
        qnHx.c.d("Host", qf5.u(cOm6.i, true));
        qnHx.c.d("Proxy-Connection", "Keep-Alive");
        qnHx.c.d("User-Agent", "okhttp/4.10.0");
        cp3 cp3VarA = qnHx.a();
        xp3.QnHx qnHx2 = new xp3.QnHx();
        qnHx2.a = cp3VarA;
        qnHx2.b = kg3.HTTP_1_1;
        qnHx2.c = 407;
        qnHx2.d = "Preemptive Authenticate";
        qnHx2.g = qf5.c;
        qnHx2.k = -1L;
        qnHx2.l = -1L;
        qnHx2.f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        cOm6.f.a(pu3Var, qnHx2.a());
        e(i, i2, fu0Var);
        String str = "CONNECT " + qf5.u(cp3VarA.a, true) + " HTTP/1.1";
        aj3 aj3Var = this.h;
        zi3 zi3Var = this.i;
        vd1 vd1Var = new vd1(null, this, aj3Var, zi3Var);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aj3Var.d().g(i2, timeUnit);
        zi3Var.d().g(i3, timeUnit);
        vd1Var.j(cp3VarA.c, str);
        vd1Var.b();
        xp3.QnHx qnHxE = vd1Var.e(false);
        qnHxE.a = cp3VarA;
        xp3 xp3VarA = qnHxE.a();
        long jK = qf5.k(xp3VarA);
        if (jK != -1) {
            vd1.LPt8Fixed lPt8I = vd1Var.i(jK);
            qf5.s(lPt8I, Integer.MAX_VALUE, timeUnit);
            lPt8I.close();
        }
        int i4 = xp3VarA.z;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(ur1.d(Integer.valueOf(i4), "Unexpected response code for CONNECT: "));
            }
            cOm6.f.a(pu3Var, xp3VarA);
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!aj3Var.x.E() || !zi3Var.x.E()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(wh6 wh6Var, int i, fu0 fu0Var) throws Throwable {
        COm6Fixed cOm6 = this.b.a;
        SSLSocketFactory sSLSocketFactory = cOm6.c;
        kg3 kg3VarA = kg3.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List<kg3> list = cOm6.j;
            kg3 kg3Var = kg3.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(kg3Var)) {
                this.d = this.c;
                this.f = kg3VarA;
                return;
            } else {
                this.d = this.c;
                this.f = kg3Var;
                l(i);
                return;
            }
        }
        fu0Var.getClass();
        COm6Fixed cOm7 = this.b.a;
        SSLSocketFactory sSLSocketFactory2 = cOm7.c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            Socket socket = this.c;
            ch1 ch1Var = cOm7.i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, ch1Var.d, ch1Var.e, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                b60 b60VarA = wh6Var.a(sSLSocket2);
                if (b60VarA.b) {
                    x43 x43Var = x43.a;
                    x43.a.d(sSLSocket2, cOm7.i.d, cOm7.j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                ub1 ub1VarA = ub1.QnHx.a(session);
                if (!cOm7.d.verify(cOm7.i.d, session)) {
                    List<Certificate> listA = ub1VarA.a();
                    if (!(!listA.isEmpty())) {
                        throw new SSLPeerUnverifiedException("Hostname " + cOm7.i.d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listA.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(cOm7.i.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    wn wnVar = wn.c;
                    sb.append(wn.QnHx.a(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append((Object) x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(wu.U0(pt2.a(x509Certificate, 2), pt2.a(x509Certificate, 7)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(ev4.m(sb.toString()));
                }
                wn wnVar2 = cOm7.e;
                this.e = new ub1(ub1VarA.a, ub1VarA.b, ub1VarA.c, new fj3(wnVar2, ub1VarA, cOm7));
                wnVar2.a(cOm7.i.d, new gj3(this));
                if (b60VarA.b) {
                    x43 x43Var2 = x43.a;
                    strF = x43.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = eu2.a;
                eq4 eq4Var = new eq4(sSLSocket2);
                this.h = new aj3(new eiJ(eq4Var, new so1(sSLSocket2.getInputStream(), eq4Var)));
                eq4 eq4Var2 = new eq4(sSLSocket2);
                this.i = new zi3(new y9I(eq4Var2, new qw2(sSLSocket2.getOutputStream(), eq4Var2)));
                if (strF != null) {
                    kg3VarA = kg3.QnHx.a(strF);
                }
                this.f = kg3VarA;
                x43 x43Var3 = x43.a;
                x43.a.a(sSLSocket2);
                if (this.f == kg3.HTTP_2) {
                    l(i);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    x43 x43Var4 = x43.a;
                    x43.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    qf5.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(COm6Fixed cOm6, ArrayList arrayList) {
        boolean z;
        boolean z2;
        ub1 ub1Var;
        byte[] bArr = qf5.a;
        if (this.p.size() < this.o && !this.j) {
            pu3 pu3Var = this.b;
            if (!pu3Var.a.a(cOm6)) {
                return false;
            }
            ch1 ch1Var = cOm6.i;
            String str = ch1Var.d;
            COm6Fixed cOm7 = pu3Var.a;
            if (ur1.a(str, cOm7.i.d)) {
                return true;
            }
            if (this.g != null && arrayList != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        pu3 pu3Var2 = (pu3) it.next();
                        if (pu3Var2.b.type() == Proxy.Type.DIRECT && pu3Var.b.type() == Proxy.Type.DIRECT && ur1.a(pu3Var.c, pu3Var2.c)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    if (cOm6.d != pt2.a) {
                        return false;
                    }
                    byte[] bArr2 = qf5.a;
                    ch1 ch1Var2 = cOm7.i;
                    int i = ch1Var2.e;
                    String str2 = ch1Var.d;
                    if (ch1Var.e == i) {
                        if (!ur1.a(str2, ch1Var2.d)) {
                            if (!this.k && (ub1Var = this.e) != null) {
                                List<Certificate> listA = ub1Var.a();
                                if ((listA.isEmpty() ^ true) && pt2.c(str2, (X509Certificate) listA.get(0))) {
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                    try {
                        wn wnVar = cOm6.e;
                        wnVar.a(str2, new xn(wnVar, this.e.a(), str2));
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = qf5.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        Socket socket2 = this.d;
        aj3 aj3Var = this.h;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        xd1 xd1Var = this.g;
        if (xd1Var != null) {
            synchronized (xd1Var) {
                if (xd1Var.C) {
                    return false;
                }
                return xd1Var.L >= xd1Var.K || jNanoTime < xd1Var.M;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !aj3Var.E();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final bv0 j(rt2 rt2Var, kj3 kj3Var) throws SocketException {
        Socket socket = this.d;
        aj3 aj3Var = this.h;
        zi3 zi3Var = this.i;
        xd1 xd1Var = this.g;
        if (xd1Var != null) {
            return new ie1(rt2Var, this, kj3Var, xd1Var);
        }
        int i = kj3Var.g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aj3Var.d().g(i, timeUnit);
        zi3Var.d().g(kj3Var.h, timeUnit);
        return new vd1(rt2Var, this, aj3Var, zi3Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l(int i) throws SocketException {
        int i2;
        Socket socket = this.d;
        aj3 aj3Var = this.h;
        zi3 zi3Var = this.i;
        socket.setSoTimeout(0);
        h15 h15Var = h15.i;
        xd1.QnHx qnHx = new xd1.QnHx(h15Var);
        String str = this.b.a.i.d;
        qnHx.c = socket;
        qnHx.d = qf5.f + ' ' + str;
        qnHx.e = aj3Var;
        qnHx.f = zi3Var;
        qnHx.g = this;
        qnHx.i = i;
        xd1 xd1Var = new xd1(qnHx);
        this.g = xd1Var;
        rg4 rg4Var = xd1.X;
        this.o = (rg4Var.a & 16) != 0 ? rg4Var.b[4] : Integer.MAX_VALUE;
        le1 le1Var = xd1Var.U;
        synchronized (le1Var) {
            if (le1Var.A) {
                throw new IOException("closed");
            }
            if (le1Var.x) {
                Logger logger = le1.C;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(qf5.i(ur1.d(wd1.b.d(), ">> CONNECTION "), new Object[0]));
                }
                le1Var.w.W(wd1.b);
                le1Var.w.flush();
            }
        }
        le1 le1Var2 = xd1Var.U;
        rg4 rg4Var2 = xd1Var.N;
        synchronized (le1Var2) {
            if (le1Var2.A) {
                throw new IOException("closed");
            }
            le1Var2.e(0, Integer.bitCount(rg4Var2.a) * 6, 4, 0);
            int i3 = 0;
            while (i3 < 10) {
                int i4 = i3 + 1;
                boolean z = true;
                if (((1 << i3) & rg4Var2.a) == 0) {
                    z = false;
                }
                if (z) {
                    if (i3 != 4) {
                        i2 = i3 != 7 ? i3 : 4;
                    } else {
                        i2 = 3;
                    }
                    le1Var2.w.writeShort(i2);
                    le1Var2.w.writeInt(rg4Var2.b[i3]);
                }
                i3 = i4;
            }
            le1Var2.w.flush();
        }
        int iA = xd1Var.N.a();
        if (iA != 65535) {
            xd1Var.U.i(0, iA - 65535);
        }
        h15Var.f().c(new f15(xd1Var.z, xd1Var.V), 0L);
    }

    public final String toString() {
        pq pqVar;
        StringBuilder sb = new StringBuilder("Connection{");
        pu3 pu3Var = this.b;
        sb.append(pu3Var.a.i.d);
        sb.append(':');
        sb.append(pu3Var.a.i.e);
        sb.append(", proxy=");
        sb.append(pu3Var.b);
        sb.append(" hostAddress=");
        sb.append(pu3Var.c);
        sb.append(" cipherSuite=");
        ub1 ub1Var = this.e;
        Object obj = "none";
        if (ub1Var != null && (pqVar = ub1Var.b) != null) {
            obj = pqVar;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
