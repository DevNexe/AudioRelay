package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class vd1 implements bv0 {
    public final rt2 a;
    public final ej3 b;
    public final yh c;
    public final xh d;
    public int e;
    public final qc1 f;

    public final class CQf implements bm4 {
        public final q51 w;
        public boolean x;

        public CQf() {
            this.w = new q51(vd1.this.d.d());
        }

        @Override // defpackage.bm4
        public final void V(gg ggVar, long j) {
            if (!(!this.x)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            vd1 vd1Var = vd1.this;
            vd1Var.d.X(j);
            xh xhVar = vd1Var.d;
            xhVar.S("\r\n");
            xhVar.V(ggVar, j);
            xhVar.S("\r\n");
        }

        @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.x) {
                return;
            }
            this.x = true;
            vd1.this.d.S("0\r\n\r\n");
            vd1 vd1Var = vd1.this;
            q51 q51Var = this.w;
            vd1Var.getClass();
            z75 z75Var = q51Var.e;
            q51Var.e = z75.d;
            z75Var.a();
            z75Var.b();
            vd1.this.e = 3;
        }

        @Override // defpackage.bm4
        public final z75 d() {
            return this.w;
        }

        @Override // defpackage.bm4, java.io.Flushable
        public final synchronized void flush() {
            if (this.x) {
                return;
            }
            vd1.this.d.flush();
        }
    }

    public final class F1 extends QnHx {
        public long A;
        public boolean B;
        public final ch1 z;

        public F1(ch1 ch1Var) {
            super();
            this.z = ch1Var;
            this.A = -1L;
            this.B = true;
        }

        @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() {
            boolean zS;
            if (this.x) {
                return;
            }
            if (this.B) {
                try {
                    zS = qf5.s(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    zS = false;
                }
                if (!zS) {
                    vd1.this.b.k();
                    b();
                }
            }
            this.x = true;
        }

        @Override // vd1.QnHx, defpackage.nq4
        public final long p(gg ggVar, long j) throws IOException {
            boolean z = true;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            if (!(!this.x)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.B) {
                return -1L;
            }
            long j2 = this.A;
            vd1 vd1Var = vd1.this;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    vd1Var.c.c0();
                }
                try {
                    this.A = vd1Var.c.w0();
                    String string = mv4.W(vd1Var.c.c0()).toString();
                    if (this.A >= 0) {
                        if (string.length() <= 0) {
                            z = false;
                        }
                        if (!z || iv4.x(string, ";", false)) {
                            if (this.A == 0) {
                                this.B = false;
                                qf1.b(vd1Var.a.F, this.z, vd1Var.f.a());
                                b();
                            }
                            if (!this.B) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.A + string + '\"');
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jP = super.p(ggVar, Math.min(j, this.A));
            if (jP != -1) {
                this.A -= jP;
                return jP;
            }
            vd1Var.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    public final class LPt8Fixed extends QnHx {
        public long z;

        public LPt8Fixed(long j) {
            super();
            this.z = j;
            if (j == 0) {
                b();
            }
        }

        @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() {
            boolean zS;
            if (this.x) {
                return;
            }
            if (this.z != 0) {
                try {
                    zS = qf5.s(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    zS = false;
                }
                if (!zS) {
                    vd1.this.b.k();
                    b();
                }
            }
            this.x = true;
        }

        @Override // vd1.QnHx, defpackage.nq4
        public final long p(gg ggVar, long j) throws IOException {
            if (!(j >= 0)) {
                throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            if (!(true ^ this.x)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.z;
            if (j2 == 0) {
                return -1L;
            }
            long jP = super.p(ggVar, Math.min(j2, j));
            if (jP == -1) {
                vd1.this.b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j3 = this.z - jP;
            this.z = j3;
            if (j3 == 0) {
                b();
            }
            return jP;
        }
    }

    public final class NUlFixed implements bm4 {
        public final q51 w;
        public boolean x;

        public NUlFixed() {
            this.w = new q51(vd1.this.d.d());
        }

        @Override // defpackage.bm4
        public final void V(gg ggVar, long j) {
            if (!(!this.x)) {
                throw new IllegalStateException("closed".toString());
            }
            qf5.c(ggVar.x, 0L, j);
            vd1.this.d.V(ggVar, j);
        }

        @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.x) {
                return;
            }
            this.x = true;
            vd1 vd1Var = vd1.this;
            vd1Var.getClass();
            q51 q51Var = this.w;
            z75 z75Var = q51Var.e;
            q51Var.e = z75.d;
            z75Var.a();
            z75Var.b();
            vd1Var.e = 3;
        }

        @Override // defpackage.bm4
        public final z75 d() {
            return this.w;
        }

        @Override // defpackage.bm4, java.io.Flushable
        public final void flush() {
            if (this.x) {
                return;
            }
            vd1.this.d.flush();
        }
    }

    public abstract class QnHx implements nq4 {
        public final q51 w;
        public boolean x;

        public QnHx() {
            this.w = new q51(vd1.this.c.d());
        }

        public final void b() {
            vd1 vd1Var = vd1.this;
            int i = vd1Var.e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException(ur1.d(Integer.valueOf(vd1Var.e), "state: "));
            }
            q51 q51Var = this.w;
            z75 z75Var = q51Var.e;
            q51Var.e = z75.d;
            z75Var.a();
            z75Var.b();
            vd1Var.e = 6;
        }

        @Override // defpackage.nq4
        public final z75 d() {
            return this.w;
        }

        @Override // defpackage.nq4
        public long p(gg ggVar, long j) throws IOException {
            vd1 vd1Var = vd1.this;
            try {
                return vd1Var.c.p(ggVar, j);
            } catch (IOException e) {
                vd1Var.b.k();
                b();
                throw e;
            }
        }
    }

    public final class YKK extends QnHx {
        public boolean z;

        public YKK(vd1 vd1Var) {
            super();
        }

        @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() {
            if (this.x) {
                return;
            }
            if (!this.z) {
                b();
            }
            this.x = true;
        }

        @Override // vd1.QnHx, defpackage.nq4
        public final long p(gg ggVar, long j) throws IOException {
            if (!(j >= 0)) {
                throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            if (!(!this.x)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.z) {
                return -1L;
            }
            long jP = super.p(ggVar, j);
            if (jP != -1) {
                return jP;
            }
            this.z = true;
            b();
            return -1L;
        }
    }

    public vd1(rt2 rt2Var, ej3 ej3Var, yh yhVar, xh xhVar) {
        this.a = rt2Var;
        this.b = ej3Var;
        this.c = yhVar;
        this.d = xhVar;
        this.f = new qc1(yhVar);
    }

    @Override // defpackage.bv0
    public final nq4 a(xp3 xp3Var) {
        if (!qf1.a(xp3Var)) {
            return i(0L);
        }
        String strA = xp3Var.B.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if (iv4.r("chunked", strA)) {
            ch1 ch1Var = xp3Var.w.a;
            int i = this.e;
            if (!(i == 4)) {
                throw new IllegalStateException(ur1.d(Integer.valueOf(i), "state: ").toString());
            }
            this.e = 5;
            return new F1(ch1Var);
        }
        long jK = qf5.k(xp3Var);
        if (jK != -1) {
            return i(jK);
        }
        int i2 = this.e;
        if (!(i2 == 4)) {
            throw new IllegalStateException(ur1.d(Integer.valueOf(i2), "state: ").toString());
        }
        this.e = 5;
        this.b.k();
        return new YKK(this);
    }

    @Override // defpackage.bv0
    public final void b() {
        this.d.flush();
    }

    @Override // defpackage.bv0
    public final bm4 c(cp3 cp3Var, long j) {
        if (iv4.r("chunked", cp3Var.a("Transfer-Encoding"))) {
            int i = this.e;
            if (!(i == 1)) {
                throw new IllegalStateException(ur1.d(Integer.valueOf(i), "state: ").toString());
            }
            this.e = 2;
            return new CQf();
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.e;
        if (!(i2 == 1)) {
            throw new IllegalStateException(ur1.d(Integer.valueOf(i2), "state: ").toString());
        }
        this.e = 2;
        return new NUlFixed();
    }

    @Override // defpackage.bv0
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket == null) {
            return;
        }
        qf5.e(socket);
    }

    @Override // defpackage.bv0
    public final long d(xp3 xp3Var) {
        if (!qf1.a(xp3Var)) {
            return 0L;
        }
        String strA = xp3Var.B.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if (iv4.r("chunked", strA)) {
            return -1L;
        }
        return qf5.k(xp3Var);
    }

    @Override // defpackage.bv0
    public final xp3.QnHx e(boolean z) {
        qc1 qc1Var = this.f;
        int i = this.e;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException(ur1.d(Integer.valueOf(i), "state: ").toString());
        }
        try {
            String strQ = qc1Var.a.Q(qc1Var.b);
            qc1Var.b -= (long) strQ.length();
            wt4 wt4VarA = wt4.QnHx.a(strQ);
            int i2 = wt4VarA.b;
            xp3.QnHx qnHx = new xp3.QnHx();
            qnHx.b = wt4VarA.a;
            qnHx.c = i2;
            qnHx.d = wt4VarA.c;
            qnHx.f = qc1Var.a().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return qnHx;
            }
            this.e = 4;
            return qnHx;
        } catch (EOFException e) {
            throw new IOException(ur1.d(this.b.b.a.i.f(), "unexpected end of stream on "), e);
        }
    }

    @Override // defpackage.bv0
    public final ej3 f() {
        return this.b;
    }

    @Override // defpackage.bv0
    public final void g(cp3 cp3Var) {
        Proxy.Type type = this.b.b.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(cp3Var.b);
        sb.append(' ');
        ch1 ch1Var = cp3Var.a;
        if (!ch1Var.j && type == Proxy.Type.HTTP) {
            sb.append(ch1Var);
        } else {
            String strB = ch1Var.b();
            String strD = ch1Var.d();
            if (strD != null) {
                strB = strB + '?' + ((Object) strD);
            }
            sb.append(strB);
        }
        sb.append(" HTTP/1.1");
        j(cp3Var.c, sb.toString());
    }

    @Override // defpackage.bv0
    public final void h() {
        this.d.flush();
    }

    public final LPt8Fixed i(long j) {
        int i = this.e;
        if (!(i == 4)) {
            throw new IllegalStateException(ur1.d(Integer.valueOf(i), "state: ").toString());
        }
        this.e = 5;
        return new LPt8Fixed(j);
    }

    public final void j(nc1 nc1Var, String str) {
        int i = this.e;
        if (!(i == 0)) {
            throw new IllegalStateException(ur1.d(Integer.valueOf(i), "state: ").toString());
        }
        xh xhVar = this.d;
        xhVar.S(str).S("\r\n");
        int length = nc1Var.w.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            xhVar.S(nc1Var.b(i2)).S(": ").S(nc1Var.e(i2)).S("\r\n");
        }
        xhVar.S("\r\n");
        this.e = 1;
    }
}
