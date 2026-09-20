package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class av0 {
    public final bj3 a;
    public final fu0 b;
    public final cv0 c;
    public final bv0 d;
    public boolean e;
    public final ej3 f;

    public final class CQf extends p51 {
        public boolean A;
        public boolean B;
        public final long x;
        public long y;
        public boolean z;

        public CQf(nq4 nq4Var, long j) {
            super(nq4Var);
            this.x = j;
            this.z = true;
            if (j == 0) {
                b(null);
            }
        }

        public final <E extends IOException> E b(E e) {
            if (this.A) {
                return e;
            }
            this.A = true;
            av0 av0Var = av0.this;
            if (e == null && this.z) {
                this.z = false;
                av0Var.b.getClass();
            }
            return (E) av0Var.a(true, false, e);
        }

        @Override // defpackage.p51, defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            if (this.B) {
                return;
            }
            this.B = true;
            try {
                super.close();
                b(null);
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // defpackage.nq4
        public final long p(gg ggVar, long j) throws IOException {
            if (!(!this.B)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long jP = this.w.p(ggVar, j);
                if (this.z) {
                    this.z = false;
                    av0 av0Var = av0.this;
                    fu0 fu0Var = av0Var.b;
                    bj3 bj3Var = av0Var.a;
                    fu0Var.getClass();
                }
                if (jP == -1) {
                    b(null);
                    return -1L;
                }
                long j2 = this.y + jP;
                long j3 = this.x;
                if (j3 == -1 || j2 <= j3) {
                    this.y = j2;
                    if (j2 == j3) {
                        b(null);
                    }
                    return jP;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw b(e);
            }
        }
    }

    public final class QnHx extends o51 {
        public boolean A;
        public final long x;
        public boolean y;
        public long z;

        public QnHx(bm4 bm4Var, long j) {
            super(bm4Var);
            this.x = j;
        }

        @Override // defpackage.bm4
        public final void V(gg ggVar, long j) throws IOException {
            if (!(!this.A)) {
                throw new IllegalStateException("closed".toString());
            }
            long j2 = this.x;
            if (j2 != -1 && this.z + j > j2) {
                StringBuilder sbB = qc0.b("expected ", j2, " bytes but received ");
                sbB.append(this.z + j);
                throw new ProtocolException(sbB.toString());
            }
            try {
                this.w.V(ggVar, j);
                this.z += j;
            } catch (IOException e) {
                throw b(e);
            }
        }

        public final <E extends IOException> E b(E e) {
            if (this.y) {
                return e;
            }
            this.y = true;
            return (E) av0.this.a(false, true, e);
        }

        @Override // defpackage.o51, defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.A) {
                return;
            }
            this.A = true;
            long j = this.x;
            if (j != -1 && this.z != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e) {
                throw b(e);
            }
        }

        @Override // defpackage.o51, defpackage.bm4, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw b(e);
            }
        }
    }

    public av0(bj3 bj3Var, fu0 fu0Var, cv0 cv0Var, bv0 bv0Var) {
        this.a = bj3Var;
        this.b = fu0Var;
        this.c = cv0Var;
        this.d = bv0Var;
        this.f = bv0Var.f();
    }

    public final IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        fu0 fu0Var = this.b;
        if (z2) {
            if (iOException != null) {
                fu0Var.getClass();
            } else {
                fu0Var.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                fu0Var.getClass();
            } else {
                fu0Var.getClass();
            }
        }
        return this.a.k(this, z2, z, iOException);
    }

    public final xp3.QnHx b(boolean z) throws IOException {
        try {
            xp3.QnHx qnHxE = this.d.e(z);
            if (qnHxE != null) {
                qnHxE.m = this;
            }
            return qnHxE;
        } catch (IOException e) {
            this.b.getClass();
            c(e);
            throw e;
        }
    }

    public final void c(IOException iOException) {
        this.c.b(iOException);
        ej3 ej3VarF = this.d.f();
        bj3 bj3Var = this.a;
        synchronized (ej3VarF) {
            if (!(iOException instanceof StreamResetException)) {
                if (!(ej3VarF.g != null) || (iOException instanceof ConnectionShutdownException)) {
                    ej3VarF.j = true;
                    if (ej3VarF.m == 0) {
                        ej3.d(bj3Var.w, ej3VarF.b, iOException);
                        ej3VarF.l++;
                    }
                }
            } else if (((StreamResetException) iOException).w == rt0.REFUSED_STREAM) {
                int i = ej3VarF.n + 1;
                ej3VarF.n = i;
                if (i > 1) {
                    ej3VarF.j = true;
                    ej3VarF.l++;
                }
            } else if (((StreamResetException) iOException).w != rt0.CANCEL || !bj3Var.L) {
                ej3VarF.j = true;
                ej3VarF.l++;
            }
        }
    }
}
