package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class ie1 implements bv0 {
    public static final List<String> g = qf5.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List<String> h = qf5.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final ej3 a;
    public final kj3 b;
    public final xd1 c;
    public volatile ke1 d;
    public final kg3 e;
    public volatile boolean f;

    public ie1(rt2 rt2Var, ej3 ej3Var, kj3 kj3Var, xd1 xd1Var) {
        this.a = ej3Var;
        this.b = kj3Var;
        this.c = xd1Var;
        kg3 kg3Var = kg3.H2_PRIOR_KNOWLEDGE;
        this.e = rt2Var.O.contains(kg3Var) ? kg3Var : kg3.HTTP_2;
    }

    @Override // defpackage.bv0
    public final nq4 a(xp3 xp3Var) {
        return this.d.i;
    }

    @Override // defpackage.bv0
    public final void b() throws IOException {
        this.d.f().close();
    }

    @Override // defpackage.bv0
    public final bm4 c(cp3 cp3Var, long j) {
        return this.d.f();
    }

    @Override // defpackage.bv0
    public final void cancel() {
        this.f = true;
        ke1 ke1Var = this.d;
        if (ke1Var == null) {
            return;
        }
        ke1Var.e(rt0.CANCEL);
    }

    @Override // defpackage.bv0
    public final long d(xp3 xp3Var) {
        if (qf1.a(xp3Var)) {
            return qf5.k(xp3Var);
        }
        return 0L;
    }

    @Override // defpackage.bv0
    public final xp3.QnHx e(boolean z) throws IOException {
        nc1 nc1VarRemoveFirst;
        ke1 ke1Var = this.d;
        synchronized (ke1Var) {
            ke1Var.k.i();
            while (ke1Var.g.isEmpty() && ke1Var.m == null) {
                try {
                    ke1Var.j();
                } catch (Throwable th) {
                    ke1Var.k.m();
                    throw th;
                }
            }
            ke1Var.k.m();
            if (!(!ke1Var.g.isEmpty())) {
                IOException iOException = ke1Var.n;
                if (iOException == null) {
                    throw new StreamResetException(ke1Var.m);
                }
                throw iOException;
            }
            nc1VarRemoveFirst = ke1Var.g.removeFirst();
        }
        kg3 kg3Var = this.e;
        nc1.QnHx qnHx = new nc1.QnHx();
        int length = nc1VarRemoveFirst.w.length / 2;
        int i = 0;
        wt4 wt4VarA = null;
        while (i < length) {
            int i2 = i + 1;
            String strB = nc1VarRemoveFirst.b(i);
            String strE = nc1VarRemoveFirst.e(i);
            if (ur1.a(strB, ":status")) {
                wt4VarA = wt4.QnHx.a(ur1.d(strE, "HTTP/1.1 "));
            } else if (!h.contains(strB)) {
                qnHx.a(strB, strE);
            }
            i = i2;
        }
        if (wt4VarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        xp3.QnHx qnHx2 = new xp3.QnHx();
        qnHx2.b = kg3Var;
        qnHx2.c = wt4VarA.b;
        qnHx2.d = wt4VarA.c;
        qnHx2.f = qnHx.b().c();
        if (z && qnHx2.c == 100) {
            return null;
        }
        return qnHx2;
    }

    @Override // defpackage.bv0
    public final ej3 f() {
        return this.a;
    }

    @Override // defpackage.bv0
    public final void g(cp3 cp3Var) throws IOException {
        int i;
        ke1 ke1Var;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = cp3Var.d != null;
        nc1 nc1Var = cp3Var.c;
        ArrayList arrayList = new ArrayList((nc1Var.w.length / 2) + 4);
        arrayList.add(new cc1(cc1.f, cp3Var.b));
        mk mkVar = cc1.g;
        ch1 ch1Var = cp3Var.a;
        String strB = ch1Var.b();
        String strD = ch1Var.d();
        if (strD != null) {
            strB = strB + '?' + ((Object) strD);
        }
        arrayList.add(new cc1(mkVar, strB));
        String strA = cp3Var.a("Host");
        if (strA != null) {
            arrayList.add(new cc1(cc1.i, strA));
        }
        arrayList.add(new cc1(cc1.h, ch1Var.a));
        int length = nc1Var.w.length / 2;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String lowerCase = nc1Var.b(i2).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (ur1.a(lowerCase, "te") && ur1.a(nc1Var.e(i2), "trailers"))) {
                arrayList.add(new cc1(lowerCase, nc1Var.e(i2)));
            }
            i2 = i3;
        }
        xd1 xd1Var = this.c;
        boolean z3 = !z2;
        synchronized (xd1Var.U) {
            synchronized (xd1Var) {
                if (xd1Var.B > 1073741823) {
                    xd1Var.g(rt0.REFUSED_STREAM);
                }
                if (xd1Var.C) {
                    throw new ConnectionShutdownException();
                }
                i = xd1Var.B;
                xd1Var.B = i + 2;
                ke1Var = new ke1(i, xd1Var, z3, false, null);
                z = !z2 || xd1Var.R >= xd1Var.S || ke1Var.e >= ke1Var.f;
                if (ke1Var.h()) {
                    xd1Var.y.put(Integer.valueOf(i), ke1Var);
                }
                sd5 sd5Var = sd5.a;
            }
            le1 le1Var = xd1Var.U;
            synchronized (le1Var) {
                if (le1Var.A) {
                    throw new IOException("closed");
                }
                le1Var.B.d(arrayList);
                long j = le1Var.y.x;
                long jMin = Math.min(le1Var.z, j);
                int i4 = j == jMin ? 4 : 0;
                if (z3) {
                    i4 |= 1;
                }
                le1Var.e(i, (int) jMin, 1, i4);
                le1Var.w.V(le1Var.y, jMin);
                if (j > jMin) {
                    le1Var.j(i, j - jMin);
                }
            }
        }
        if (z) {
            le1 le1Var2 = xd1Var.U;
            synchronized (le1Var2) {
                if (le1Var2.A) {
                    throw new IOException("closed");
                }
                le1Var2.w.flush();
            }
        }
        this.d = ke1Var;
        if (this.f) {
            this.d.e(rt0.CANCEL);
            throw new IOException("Canceled");
        }
        ke1.F1 f1 = this.d.k;
        long j2 = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f1.g(j2, timeUnit);
        this.d.l.g(this.b.h, timeUnit);
    }

    @Override // defpackage.bv0
    public final void h() {
        this.c.flush();
    }
}
