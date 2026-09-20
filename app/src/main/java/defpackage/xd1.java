package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class xd1 implements Closeable {
    public static final rg4 X;
    public int A;
    public int B;
    public boolean C;
    public final h15 D;
    public final g15 E;
    public final g15 F;
    public final g15 G;
    public final FWT H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public final rg4 N;
    public rg4 O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public final Socket T;
    public final le1 U;
    public final F1 V;
    public final LinkedHashSet W;
    public final boolean w;
    public final CQf x;
    public final LinkedHashMap y;
    public final String z;

    public static abstract class CQf {
        public static final QnHx a = new QnHx();

        public static final class QnHx extends CQf {
            @Override // xd1.CQf
            public final void b(ke1 ke1Var) {
                ke1Var.c(rt0.REFUSED_STREAM, null);
            }
        }

        public void a(rg4 rg4Var) {
        }

        public abstract void b(ke1 ke1Var);
    }

    public final class F1 implements je1.F1, h81<sd5> {
        public final je1 w;

        public F1(je1 je1Var) {
            this.w = je1Var;
        }

        @Override // je1.F1
        public final void a(int i, List list) {
            xd1 xd1Var = xd1.this;
            synchronized (xd1Var) {
                if (xd1Var.W.contains(Integer.valueOf(i))) {
                    xd1Var.j(i, rt0.PROTOCOL_ERROR);
                    return;
                }
                xd1Var.W.add(Integer.valueOf(i));
                xd1Var.F.c(new ee1(xd1Var.z + '[' + i + "] onRequest", xd1Var, i, list), 0L);
            }
        }

        @Override // je1.F1
        public final void b() {
        }

        @Override // je1.F1
        public final void c(rg4 rg4Var) {
            xd1 xd1Var = xd1.this;
            xd1Var.E.c(new be1(ur1.d(" applyAndAckSettings", xd1Var.z), this, rg4Var), 0L);
        }

        @Override // je1.F1
        public final void d(int i, rt0 rt0Var) {
            xd1 xd1Var = xd1.this;
            xd1Var.getClass();
            if (i != 0 && (i & 1) == 0) {
                xd1Var.F.c(new fe1(xd1Var.z + '[' + i + "] onReset", xd1Var, i, rt0Var), 0L);
                return;
            }
            ke1 ke1VarF = xd1Var.f(i);
            if (ke1VarF == null) {
                return;
            }
            synchronized (ke1VarF) {
                if (ke1VarF.m == null) {
                    ke1VarF.m = rt0Var;
                    ke1VarF.notifyAll();
                }
            }
        }

        @Override // je1.F1
        public final void e(int i, long j) {
            if (i == 0) {
                xd1 xd1Var = xd1.this;
                synchronized (xd1Var) {
                    xd1Var.S += j;
                    xd1Var.notifyAll();
                    sd5 sd5Var = sd5.a;
                }
                return;
            }
            ke1 ke1VarE = xd1.this.e(i);
            if (ke1VarE != null) {
                synchronized (ke1VarE) {
                    ke1VarE.f += j;
                    if (j > 0) {
                        ke1VarE.notifyAll();
                    }
                    sd5 sd5Var2 = sd5.a;
                }
            }
        }

        @Override // je1.F1
        public final void f(int i, int i2, boolean z) {
            if (!z) {
                xd1 xd1Var = xd1.this;
                xd1Var.E.c(new ae1(ur1.d(" ping", xd1Var.z), xd1.this, i, i2), 0L);
                return;
            }
            xd1 xd1Var2 = xd1.this;
            synchronized (xd1Var2) {
                try {
                    if (i == 1) {
                        xd1Var2.J++;
                    } else if (i != 2) {
                        if (i == 3) {
                            xd1Var2.notifyAll();
                        }
                        sd5 sd5Var = sd5.a;
                    } else {
                        xd1Var2.L++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // je1.F1
        public final void g(int i, mk mkVar) {
            int i2;
            Object[] array;
            mkVar.c();
            xd1 xd1Var = xd1.this;
            synchronized (xd1Var) {
                i2 = 0;
                array = xd1Var.y.values().toArray(new ke1[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                xd1Var.C = true;
                sd5 sd5Var = sd5.a;
            }
            ke1[] ke1VarArr = (ke1[]) array;
            int length = ke1VarArr.length;
            while (i2 < length) {
                ke1 ke1Var = ke1VarArr[i2];
                i2++;
                if (ke1Var.a > i && ke1Var.g()) {
                    rt0 rt0Var = rt0.REFUSED_STREAM;
                    synchronized (ke1Var) {
                        if (ke1Var.m == null) {
                            ke1Var.m = rt0Var;
                            ke1Var.notifyAll();
                        }
                    }
                    xd1.this.f(ke1Var.a);
                }
            }
        }

        @Override // je1.F1
        public final void h(int i, int i2, yh yhVar, boolean z) throws EOFException {
            boolean z2;
            boolean z3;
            long j;
            xd1.this.getClass();
            if (i != 0 && (i & 1) == 0) {
                xd1 xd1Var = xd1.this;
                xd1Var.getClass();
                gg ggVar = new gg();
                long j2 = i2;
                yhVar.v0(j2);
                yhVar.p(ggVar, j2);
                xd1Var.F.c(new ce1(xd1Var.z + '[' + i + "] onData", xd1Var, i, ggVar, i2, z), 0L);
                return;
            }
            ke1 ke1VarE = xd1.this.e(i);
            if (ke1VarE == null) {
                xd1.this.j(i, rt0.PROTOCOL_ERROR);
                long j3 = i2;
                xd1.this.h(j3);
                yhVar.skip(j3);
                return;
            }
            byte[] bArr = qf5.a;
            ke1.CQf cQf = ke1VarE.i;
            long j4 = i2;
            cQf.getClass();
            while (j4 > 0) {
                synchronized (ke1.this) {
                    z2 = cQf.x;
                    z3 = cQf.z.x + j4 > cQf.w;
                    sd5 sd5Var = sd5.a;
                }
                if (z3) {
                    yhVar.skip(j4);
                    ke1.this.e(rt0.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    yhVar.skip(j4);
                    break;
                }
                long jP = yhVar.p(cQf.y, j4);
                if (jP == -1) {
                    throw new EOFException();
                }
                j4 -= jP;
                ke1 ke1Var = ke1.this;
                synchronized (ke1Var) {
                    if (cQf.A) {
                        gg ggVar2 = cQf.y;
                        j = ggVar2.x;
                        ggVar2.skip(j);
                    } else {
                        gg ggVar3 = cQf.z;
                        boolean z4 = ggVar3.x == 0;
                        ggVar3.K(cQf.y);
                        if (z4) {
                            ke1Var.notifyAll();
                        }
                        j = 0;
                    }
                }
                if (j > 0) {
                    cQf.b(j);
                }
            }
            if (z) {
                ke1VarE.i(qf5.b, true);
            }
        }

        @Override // je1.F1
        public final void i() {
        }

        @Override // defpackage.h81
        public final sd5 invoke() throws Throwable {
            Throwable th;
            rt0 rt0Var;
            xd1 xd1Var = xd1.this;
            je1 je1Var = this.w;
            rt0 rt0Var2 = rt0.INTERNAL_ERROR;
            IOException e = null;
            try {
                je1Var.c(this);
                while (je1Var.b(false, this)) {
                }
                rt0Var = rt0.NO_ERROR;
                try {
                    try {
                        xd1Var.b(rt0Var, rt0.CANCEL, null);
                    } catch (Throwable th2) {
                        th = th2;
                        xd1Var.b(rt0Var, rt0Var2, e);
                        qf5.d(je1Var);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    rt0 rt0Var3 = rt0.PROTOCOL_ERROR;
                    xd1Var.b(rt0Var3, rt0Var3, e);
                }
            } catch (IOException e3) {
                e = e3;
                rt0Var = rt0Var2;
            } catch (Throwable th3) {
                th = th3;
                rt0Var = rt0Var2;
                xd1Var.b(rt0Var, rt0Var2, e);
                qf5.d(je1Var);
                throw th;
            }
            qf5.d(je1Var);
            return sd5.a;
        }

        @Override // je1.F1
        public final void j(int i, List list, boolean z) {
            xd1.this.getClass();
            if (i != 0 && (i & 1) == 0) {
                xd1 xd1Var = xd1.this;
                xd1Var.F.c(new de1(xd1Var.z + '[' + i + "] onHeaders", xd1Var, i, list, z), 0L);
                return;
            }
            xd1 xd1Var2 = xd1.this;
            synchronized (xd1Var2) {
                ke1 ke1VarE = xd1Var2.e(i);
                if (ke1VarE != null) {
                    sd5 sd5Var = sd5.a;
                    ke1VarE.i(qf5.t(list), z);
                    return;
                }
                if (xd1Var2.C) {
                    return;
                }
                if (i <= xd1Var2.A) {
                    return;
                }
                if (i % 2 == xd1Var2.B % 2) {
                    return;
                }
                ke1 ke1Var = new ke1(i, xd1Var2, false, z, qf5.t(list));
                xd1Var2.A = i;
                xd1Var2.y.put(Integer.valueOf(i), ke1Var);
                xd1Var2.D.f().c(new zd1(xd1Var2.z + '[' + i + "] onStream", xd1Var2, ke1Var), 0L);
            }
        }
    }

    public static final class LPt8Fixed extends v05 {
        public final /* synthetic */ xd1 e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(String str, xd1 xd1Var, long j) {
            super(str, true);
            this.e = xd1Var;
            this.f = j;
        }

        @Override // defpackage.v05
        public final long a() {
            xd1 xd1Var;
            boolean z;
            synchronized (this.e) {
                xd1Var = this.e;
                long j = xd1Var.J;
                long j2 = xd1Var.I;
                if (j < j2) {
                    z = true;
                } else {
                    xd1Var.I = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                xd1Var.c(null);
                return -1L;
            }
            try {
                xd1Var.U.g(1, 0, false);
            } catch (IOException e) {
                xd1Var.c(e);
            }
            return this.f;
        }
    }

    public static final class NUlFixed extends v05 {
        public final /* synthetic */ xd1 e;
        public final /* synthetic */ int f;
        public final /* synthetic */ rt0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(String str, xd1 xd1Var, int i, rt0 rt0Var) {
            super(str, true);
            this.e = xd1Var;
            this.f = i;
            this.g = rt0Var;
        }

        @Override // defpackage.v05
        public final long a() {
            xd1 xd1Var = this.e;
            try {
                xd1Var.U.h(this.f, this.g);
                return -1L;
            } catch (IOException e) {
                xd1Var.c(e);
                return -1L;
            }
        }
    }

    public static final class QnHx {
        public final h15 b;
        public Socket c;
        public String d;
        public yh e;
        public xh f;
        public int i;
        public final boolean a = true;
        public CQf g = CQf.a;
        public final FWT h = ch3.n;

        public QnHx(h15 h15Var) {
            this.b = h15Var;
        }
    }

    public static final class YKK extends v05 {
        public final /* synthetic */ xd1 e;
        public final /* synthetic */ int f;
        public final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(String str, xd1 xd1Var, int i, long j) {
            super(str, true);
            this.e = xd1Var;
            this.f = i;
            this.g = j;
        }

        @Override // defpackage.v05
        public final long a() {
            xd1 xd1Var = this.e;
            try {
                xd1Var.U.i(this.f, this.g);
                return -1L;
            } catch (IOException e) {
                xd1Var.c(e);
                return -1L;
            }
        }
    }

    static {
        rg4 rg4Var = new rg4();
        rg4Var.b(7, 65535);
        rg4Var.b(5, 16384);
        X = rg4Var;
    }

    public xd1(QnHx qnHx) {
        boolean z = qnHx.a;
        this.w = z;
        this.x = qnHx.g;
        this.y = new LinkedHashMap();
        String str = qnHx.d;
        if (str == null) {
            ur1.e("connectionName");
            throw null;
        }
        this.z = str;
        this.B = z ? 3 : 2;
        h15 h15Var = qnHx.b;
        this.D = h15Var;
        g15 g15VarF = h15Var.f();
        this.E = g15VarF;
        this.F = h15Var.f();
        this.G = h15Var.f();
        this.H = qnHx.h;
        rg4 rg4Var = new rg4();
        if (z) {
            rg4Var.b(7, 16777216);
        }
        this.N = rg4Var;
        rg4 rg4Var2 = X;
        this.O = rg4Var2;
        this.S = rg4Var2.a();
        Socket socket = qnHx.c;
        if (socket == null) {
            ur1.e("socket");
            throw null;
        }
        this.T = socket;
        xh xhVar = qnHx.f;
        if (xhVar == null) {
            ur1.e("sink");
            throw null;
        }
        this.U = new le1(xhVar, z);
        yh yhVar = qnHx.e;
        if (yhVar == null) {
            ur1.e("source");
            throw null;
        }
        this.V = new F1(new je1(yhVar, z));
        this.W = new LinkedHashSet();
        int i = qnHx.i;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            g15VarF.c(new LPt8Fixed(ur1.d(" ping", str), this, nanos), nanos);
        }
    }

    public final void b(rt0 rt0Var, rt0 rt0Var2, IOException iOException) {
        int i;
        Object[] array;
        byte[] bArr = qf5.a;
        try {
            g(rt0Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.y.isEmpty()) {
                array = this.y.values().toArray(new ke1[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.y.clear();
            } else {
                array = null;
            }
            sd5 sd5Var = sd5.a;
        }
        ke1[] ke1VarArr = (ke1[]) array;
        if (ke1VarArr != null) {
            for (ke1 ke1Var : ke1VarArr) {
                try {
                    ke1Var.c(rt0Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.U.close();
        } catch (IOException unused3) {
        }
        try {
            this.T.close();
        } catch (IOException unused4) {
        }
        this.E.e();
        this.F.e();
        this.G.e();
    }

    public final void c(IOException iOException) {
        rt0 rt0Var = rt0.PROTOCOL_ERROR;
        b(rt0Var, rt0Var, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(rt0.NO_ERROR, rt0.CANCEL, null);
    }

    public final synchronized ke1 e(int i) {
        return (ke1) this.y.get(Integer.valueOf(i));
    }

    public final synchronized ke1 f(int i) {
        ke1 ke1Var;
        ke1Var = (ke1) this.y.remove(Integer.valueOf(i));
        notifyAll();
        return ke1Var;
    }

    public final void flush() {
        le1 le1Var = this.U;
        synchronized (le1Var) {
            if (le1Var.A) {
                throw new IOException("closed");
            }
            le1Var.w.flush();
        }
    }

    public final void g(rt0 rt0Var) {
        synchronized (this.U) {
            hl3 hl3Var = new hl3();
            synchronized (this) {
                if (this.C) {
                    return;
                }
                this.C = true;
                int i = this.A;
                hl3Var.w = i;
                sd5 sd5Var = sd5.a;
                this.U.f(i, rt0Var, qf5.a);
            }
        }
    }

    public final synchronized void h(long j) {
        long j2 = this.P + j;
        this.P = j2;
        long j3 = j2 - this.Q;
        if (j3 >= this.N.a() / 2) {
            m(0, j3);
            this.Q += j3;
        }
    }

    public final void i(int i, boolean z, gg ggVar, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.U.c(z, i, ggVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.R;
                        j3 = this.S;
                        if (j2 >= j3) {
                            if (!this.y.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.U.z);
                j4 = iMin;
                this.R += j4;
                sd5 sd5Var = sd5.a;
            }
            j -= j4;
            this.U.c(z && j == 0, i, ggVar, iMin);
        }
    }

    public final void j(int i, rt0 rt0Var) {
        this.E.c(new NUlFixed(this.z + '[' + i + "] writeSynReset", this, i, rt0Var), 0L);
    }

    public final void m(int i, long j) {
        this.E.c(new YKK(this.z + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
