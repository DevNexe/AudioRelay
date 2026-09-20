package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class ke1 {
    public final int a;
    public final xd1 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque<nc1> g;
    public boolean h;
    public final CQf i;
    public final QnHx j;
    public final F1 k;
    public final F1 l;
    public rt0 m;
    public IOException n;

    public final class CQf implements nq4 {
        public boolean A;
        public final long w;
        public boolean x;
        public final gg y = new gg();
        public final gg z = new gg();

        public CQf(long j, boolean z) {
            this.w = j;
            this.x = z;
        }

        public final void b(long j) {
            byte[] bArr = qf5.a;
            ke1.this.b.h(j);
        }

        @Override // defpackage.nq4, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() {
            long j;
            ke1 ke1Var = ke1.this;
            synchronized (ke1Var) {
                this.A = true;
                gg ggVar = this.z;
                j = ggVar.x;
                ggVar.skip(j);
                ke1Var.notifyAll();
                sd5 sd5Var = sd5.a;
            }
            if (j > 0) {
                b(j);
            }
            ke1.this.a();
        }

        @Override // defpackage.nq4
        public final z75 d() {
            return ke1.this.k;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0089 A[LOOP:0: B:7:0x000f->B:48:0x0089, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:51:0x0092  */
        /* JADX WARN: Code duplicated, block: B:53:0x0096 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:54:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:55:0x0099  */
        /* JADX WARN: Code duplicated, block: B:76:0x008c A[SYNTHETIC] */
        @Override // defpackage.nq4
        public final long p(gg ggVar, long j) throws Throwable {
            rt0 rt0Var;
            Throwable streamResetException;
            boolean z;
            long jP;
            long j2 = 0;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(ur1.d(Long.valueOf(j), "byteCount < 0: ").toString());
            }
            while (true) {
                ke1 ke1Var = ke1.this;
                synchronized (ke1Var) {
                    ke1Var.k.i();
                    try {
                        synchronized (ke1Var) {
                            rt0Var = ke1Var.m;
                        }
                        if (z) {
                            if (jP != -1) {
                                b(jP);
                                return jP;
                            }
                            if (streamResetException == null) {
                                return -1L;
                            }
                            throw streamResetException;
                        }
                        j2 = 0;
                    } catch (Throwable th) {
                        ke1Var.k.m();
                        throw th;
                    }
                }
                if (rt0Var != null) {
                    streamResetException = ke1Var.n;
                    if (streamResetException == null) {
                        synchronized (ke1Var) {
                            streamResetException = new StreamResetException(ke1Var.m);
                        }
                    }
                } else {
                    streamResetException = null;
                }
                if (this.A) {
                    throw new IOException("stream closed");
                }
                gg ggVar2 = this.z;
                long j3 = ggVar2.x;
                if (j3 > j2) {
                    jP = ggVar2.p(ggVar, Math.min(j, j3));
                    long j4 = ke1Var.c + jP;
                    ke1Var.c = j4;
                    long j5 = j4 - ke1Var.d;
                    if (streamResetException == null && j5 >= ke1Var.b.N.a() / 2) {
                        ke1Var.b.m(ke1Var.a, j5);
                        ke1Var.d = ke1Var.c;
                    }
                    z = false;
                } else {
                    if (this.x || streamResetException != null) {
                        z = false;
                    } else {
                        ke1Var.j();
                        z = true;
                    }
                    jP = -1;
                }
                ke1Var.k.m();
                sd5 sd5Var = sd5.a;
                if (z) {
                    if (jP != -1) {
                        b(jP);
                        return jP;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j2 = 0;
            }
        }
    }

    public final class F1 extends oj.w {
        public F1() {
        }

        @Override // oj.w
        public final IOException k(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // oj.w
        public final void l() {
            ke1.this.e(rt0.CANCEL);
            xd1 xd1Var = ke1.this.b;
            synchronized (xd1Var) {
                long j = xd1Var.L;
                long j2 = xd1Var.K;
                if (j < j2) {
                    return;
                }
                xd1Var.K = j2 + 1;
                xd1Var.M = System.nanoTime() + ((long) 1000000000);
                sd5 sd5Var = sd5.a;
                xd1Var.E.c(new ge1(ur1.d(" ping", xd1Var.z), xd1Var), 0L);
            }
        }

        public final void m() throws IOException {
            if (j()) {
                throw k(null);
            }
        }
    }

    public final class QnHx implements bm4 {
        public final boolean w;
        public final gg x = new gg();
        public boolean y;

        public QnHx(boolean z) {
            this.w = z;
        }

        @Override // defpackage.bm4
        public final void V(gg ggVar, long j) throws IOException {
            byte[] bArr = qf5.a;
            gg ggVar2 = this.x;
            ggVar2.V(ggVar, j);
            while (ggVar2.x >= 16384) {
                b(false);
            }
        }

        public final void b(boolean z) throws IOException {
            long jMin;
            boolean z2;
            ke1 ke1Var = ke1.this;
            synchronized (ke1Var) {
                ke1Var.l.i();
                while (ke1Var.e >= ke1Var.f && !this.w && !this.y) {
                    try {
                        synchronized (ke1Var) {
                            rt0 rt0Var = ke1Var.m;
                            if (rt0Var != null) {
                                break;
                            } else {
                                ke1Var.j();
                            }
                        }
                    } catch (Throwable th) {
                        ke1Var.l.m();
                        throw th;
                    }
                }
                ke1Var.l.m();
                ke1Var.b();
                jMin = Math.min(ke1Var.f - ke1Var.e, this.x.x);
                ke1Var.e += jMin;
                z2 = z && jMin == this.x.x;
                sd5 sd5Var = sd5.a;
            }
            ke1.this.l.i();
            try {
                ke1 ke1Var2 = ke1.this;
                ke1Var2.b.i(ke1Var2.a, z2, this.x, jMin);
            } finally {
                ke1.this.l.m();
            }
        }

        @Override // defpackage.bm4, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean z;
            ke1 ke1Var = ke1.this;
            byte[] bArr = qf5.a;
            synchronized (ke1Var) {
                if (this.y) {
                    return;
                }
                synchronized (ke1Var) {
                    z = ke1Var.m == null;
                    sd5 sd5Var = sd5.a;
                }
                ke1 ke1Var2 = ke1.this;
                if (!ke1Var2.j.w) {
                    if (this.x.x > 0) {
                        while (this.x.x > 0) {
                            b(true);
                        }
                    } else if (z) {
                        ke1Var2.b.i(ke1Var2.a, true, null, 0L);
                    }
                }
                synchronized (ke1.this) {
                    this.y = true;
                    sd5 sd5Var2 = sd5.a;
                }
                ke1.this.b.flush();
                ke1.this.a();
            }
        }

        @Override // defpackage.bm4
        public final z75 d() {
            return ke1.this.l;
        }

        @Override // defpackage.bm4, java.io.Flushable
        public final void flush() throws IOException {
            ke1 ke1Var = ke1.this;
            byte[] bArr = qf5.a;
            synchronized (ke1Var) {
                ke1Var.b();
                sd5 sd5Var = sd5.a;
            }
            while (this.x.x > 0) {
                b(false);
                ke1.this.b.flush();
            }
        }
    }

    public ke1(int i, xd1 xd1Var, boolean z, boolean z2, nc1 nc1Var) {
        this.a = i;
        this.b = xd1Var;
        this.f = xd1Var.O.a();
        ArrayDeque<nc1> arrayDeque = new ArrayDeque<>();
        this.g = arrayDeque;
        this.i = new CQf(xd1Var.N.a(), z2);
        this.j = new QnHx(z);
        this.k = new F1();
        this.l = new F1();
        if (nc1Var == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!g())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(nc1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void a() {
        boolean z;
        boolean zH;
        byte[] bArr = qf5.a;
        synchronized (this) {
            CQf cQf = this.i;
            if (cQf.x || !cQf.A) {
                z = false;
            } else {
                QnHx qnHx = this.j;
                if (qnHx.w || qnHx.y) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zH = h();
            sd5 sd5Var = sd5.a;
        }
        if (z) {
            c(rt0.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.b.f(this.a);
        }
    }

    public final void b() throws IOException {
        QnHx qnHx = this.j;
        if (qnHx.y) {
            throw new IOException("stream closed");
        }
        if (qnHx.w) {
            throw new IOException("stream finished");
        }
        if (this.m != null) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            throw new StreamResetException(this.m);
        }
    }

    public final void c(rt0 rt0Var, IOException iOException) {
        if (d(rt0Var, iOException)) {
            this.b.U.h(this.a, rt0Var);
        }
    }

    public final boolean d(rt0 rt0Var, IOException iOException) {
        rt0 rt0Var2;
        byte[] bArr = qf5.a;
        synchronized (this) {
            synchronized (this) {
                rt0Var2 = this.m;
            }
        }
        if (rt0Var2 != null) {
            return false;
        }
        if (this.i.x && this.j.w) {
            return false;
        }
        this.m = rt0Var;
        this.n = iOException;
        notifyAll();
        sd5 sd5Var = sd5.a;
        this.b.f(this.a);
        return true;
    }

    public final void e(rt0 rt0Var) {
        if (d(rt0Var, null)) {
            this.b.j(this.a, rt0Var);
        }
    }

    public final QnHx f() {
        synchronized (this) {
            if (!(this.h || g())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            sd5 sd5Var = sd5.a;
        }
        return this.j;
    }

    public final boolean g() {
        return this.b.w == ((this.a & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.m != null) {
            return false;
        }
        CQf cQf = this.i;
        if (cQf.x || cQf.A) {
            QnHx qnHx = this.j;
            if ((qnHx.w || qnHx.y) && this.h) {
                return false;
            }
        }
        return true;
    }

    public final void i(nc1 nc1Var, boolean z) {
        boolean zH;
        byte[] bArr = qf5.a;
        synchronized (this) {
            if (this.h && z) {
                this.i.getClass();
            } else {
                this.h = true;
                this.g.add(nc1Var);
            }
            if (z) {
                this.i.x = true;
            }
            zH = h();
            notifyAll();
            sd5 sd5Var = sd5.a;
        }
        if (zH) {
            return;
        }
        this.b.f(this.a);
    }

    public final void j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
