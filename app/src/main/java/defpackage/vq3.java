package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes3.dex */
public final class vq3 implements xp1 {
    public final rt2 a;

    public vq3(rt2 rt2Var) {
        this.a = rt2Var;
    }

    public static int d(xp3 xp3Var, int i) {
        String strA = xp3Var.B.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strA).matches()) {
            return Integer.valueOf(strA).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.xp1
    public final xp3 a(kj3 kj3Var) throws Throwable {
        ArrayList arrayListV0;
        boolean z;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        wn wnVar;
        cp3 cp3Var = kj3Var.e;
        bj3 bj3Var = kj3Var.a;
        boolean z2 = true;
        List list = cs0.w;
        int i = 0;
        xp3 xp3Var = null;
        cp3 cp3VarB = cp3Var;
        boolean z3 = true;
        while (true) {
            if (!(bj3Var.H == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (bj3Var) {
                if (!(bj3Var.J ^ z2)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(bj3Var.I ^ z2)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                sd5 sd5Var = sd5.a;
            }
            if (z3) {
                jj3 jj3Var = bj3Var.z;
                ch1 ch1Var = cp3VarB.a;
                boolean z4 = ch1Var.j;
                rt2 rt2Var = bj3Var.w;
                if (z4) {
                    SSLSocketFactory sSLSocketFactory2 = rt2Var.L;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = rt2Var.P;
                    wnVar = rt2Var.Q;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    wnVar = null;
                }
                bj3Var.E = new cv0(jj3Var, new COm6Fixed(ch1Var.d, ch1Var.e, rt2Var.G, rt2Var.K, sSLSocketFactory, hostnameVerifier, wnVar, rt2Var.J, rt2Var.H, rt2Var.O, rt2Var.N, rt2Var.I), bj3Var, bj3Var.A);
            }
            try {
                if (bj3Var.L) {
                    throw new IOException("Canceled");
                }
                try {
                    xp3 xp3VarB = kj3Var.b(cp3VarB);
                    if (xp3Var != null) {
                        xp3.QnHx qnHx = new xp3.QnHx(xp3VarB);
                        xp3.QnHx qnHx2 = new xp3.QnHx(xp3Var);
                        qnHx2.g = null;
                        xp3 xp3VarA = qnHx2.a();
                        if (!(xp3VarA.C == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        qnHx.j = xp3VarA;
                        xp3VarB = qnHx.a();
                    }
                    xp3Var = xp3VarB;
                    av0 av0Var = bj3Var.H;
                    try {
                        cp3VarB = b(xp3Var, av0Var);
                        if (cp3VarB == null) {
                            if (av0Var != null && av0Var.e) {
                                if (!(!bj3Var.G)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                bj3Var.G = true;
                                bj3Var.B.j();
                            }
                            bj3Var.i(false);
                            return xp3Var;
                        }
                        B8C b8c = cp3VarB.d;
                        if (b8c != null && (b8c instanceof ku4)) {
                            bj3Var.i(false);
                            return xp3Var;
                        }
                        zp3 zp3Var = xp3Var.C;
                        if (zp3Var != null) {
                            qf5.d(zp3Var);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException(ur1.d(Integer.valueOf(i), "Too many follow-up requests: "));
                        }
                        bj3Var.i(true);
                        list = list;
                        z3 = true;
                        z2 = true;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    if (!c(e, bj3Var, cp3VarB, !(e instanceof ConnectionShutdownException))) {
                        qf5.y(e, list);
                        throw e;
                    }
                    arrayListV0 = wu.V0(e, list);
                    z = true;
                    bj3Var.i(z);
                    list = arrayListV0;
                    i = i;
                    z3 = false;
                } catch (RouteException e2) {
                    List list2 = list;
                    if (!c(e2.x, bj3Var, cp3VarB, false)) {
                        IOException iOException = e2.w;
                        qf5.y(iOException, list2);
                        throw iOException;
                    }
                    arrayListV0 = wu.V0(e2.w, list2);
                    z = true;
                    bj3Var.i(z);
                    list = arrayListV0;
                    i = i;
                    z3 = false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            bj3Var.i(true);
            throw th;
        }
    }

    public final cp3 b(xp3 xp3Var, av0 av0Var) throws ProtocolException {
        ch1.QnHx qnHx;
        ej3 ej3Var;
        pu3 pu3Var = (av0Var == null || (ej3Var = av0Var.f) == null) ? null : ej3Var.b;
        int i = xp3Var.z;
        cp3 cp3Var = xp3Var.w;
        String str = cp3Var.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                this.a.C.a(pu3Var, xp3Var);
                return null;
            }
            if (i == 421) {
                B8C b8c = cp3Var.d;
                if ((b8c != null && (b8c instanceof ku4)) || av0Var == null || !(!ur1.a(av0Var.c.b.i.d, av0Var.f.b.a.i.d))) {
                    return null;
                }
                ej3 ej3Var2 = av0Var.f;
                synchronized (ej3Var2) {
                    ej3Var2.k = true;
                }
                return xp3Var.w;
            }
            if (i == 503) {
                xp3 xp3Var2 = xp3Var.F;
                if ((xp3Var2 == null || xp3Var2.z != 503) && d(xp3Var, Integer.MAX_VALUE) == 0) {
                    return xp3Var.w;
                }
                return null;
            }
            if (i == 407) {
                if (pu3Var.b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                this.a.J.a(pu3Var, xp3Var);
                return null;
            }
            if (i == 408) {
                if (!this.a.B) {
                    return null;
                }
                B8C b8c2 = cp3Var.d;
                if (b8c2 != null && (b8c2 instanceof ku4)) {
                    return null;
                }
                xp3 xp3Var3 = xp3Var.F;
                if ((xp3Var3 == null || xp3Var3.z != 408) && d(xp3Var, 0) <= 0) {
                    return xp3Var.w;
                }
                return null;
            }
            switch (i) {
                case RCHTTPStatusCodes.UNSUCCESSFUL /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        rt2 rt2Var = this.a;
        if (!rt2Var.D) {
            return null;
        }
        String strA = xp3Var.B.a("Location");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return null;
        }
        cp3 cp3Var2 = xp3Var.w;
        ch1 ch1Var = cp3Var2.a;
        ch1Var.getClass();
        try {
            qnHx = new ch1.QnHx();
            qnHx.d(ch1Var, strA);
        } catch (IllegalArgumentException unused) {
            qnHx = null;
        }
        ch1 ch1VarA = qnHx == null ? null : qnHx.a();
        if (ch1VarA == null) {
            return null;
        }
        if (!ur1.a(ch1VarA.a, cp3Var2.a.a) && !rt2Var.E) {
            return null;
        }
        cp3.QnHx qnHx2 = new cp3.QnHx(cp3Var2);
        if (eu.g(str)) {
            boolean zA = ur1.a(str, "PROPFIND");
            int i2 = xp3Var.z;
            boolean z = zA || i2 == 308 || i2 == 307;
            if (!(!ur1.a(str, "PROPFIND")) || i2 == 308 || i2 == 307) {
                qnHx2.c(str, z ? cp3Var2.d : null);
            } else {
                qnHx2.c("GET", null);
            }
            if (!z) {
                qnHx2.d("Transfer-Encoding");
                qnHx2.d("Content-Length");
                qnHx2.d("Content-Type");
            }
        }
        if (!qf5.a(cp3Var2.a, ch1VarA)) {
            qnHx2.d("Authorization");
        }
        qnHx2.a = ch1VarA;
        return qnHx2.a();
    }

    public final boolean c(IOException iOException, bj3 bj3Var, cp3 cp3Var, boolean z) {
        boolean zA;
        pu3 pu3Var;
        ru3 ru3Var;
        ej3 ej3Var;
        if (!this.a.B) {
            return false;
        }
        if (z) {
            B8C b8c = cp3Var.d;
            if ((b8c != null && (b8c instanceof ku4)) || (iOException instanceof FileNotFoundException)) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)))) {
            return false;
        }
        cv0 cv0Var = bj3Var.E;
        int i = cv0Var.g;
        if (i == 0 && cv0Var.h == 0 && cv0Var.i == 0) {
            zA = false;
        } else if (cv0Var.j == null) {
            if (i <= 1 && cv0Var.h <= 1 && cv0Var.i <= 0 && (ej3Var = cv0Var.c.F) != null) {
                synchronized (ej3Var) {
                    pu3Var = (ej3Var.l == 0 && qf5.a(ej3Var.b.a.i, cv0Var.b.i)) ? ej3Var.b : null;
                }
            }
            if (pu3Var != null) {
                cv0Var.j = pu3Var;
            } else {
                ru3.QnHx qnHx = cv0Var.e;
                if (!(qnHx != null && qnHx.a()) && (ru3Var = cv0Var.f) != null) {
                    zA = ru3Var.a();
                }
            }
            zA = true;
        } else {
            zA = true;
        }
        return zA;
    }
}
