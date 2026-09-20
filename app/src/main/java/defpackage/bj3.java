package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class bj3 implements hl {
    public final fu0 A;
    public final F1 B;
    public final AtomicBoolean C;
    public Object D;
    public cv0 E;
    public ej3 F;
    public boolean G;
    public av0 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public volatile boolean L;
    public volatile av0 M;
    public volatile ej3 N;
    public final rt2 w;
    public final cp3 x;
    public final boolean y;
    public final jj3 z;

    public static final class CQf extends WeakReference<bj3> {
        public final Object a;

        public CQf(bj3 bj3Var, Object obj) {
            super(bj3Var);
            this.a = obj;
        }
    }

    public static final class F1 extends oj.w {
        public F1() {
        }

        @Override // oj.w
        public final void l() {
            bj3.this.cancel();
        }
    }

    public final class QnHx implements Runnable {
        public final yl w;
        public volatile AtomicInteger x = new AtomicInteger(0);

        public QnHx(yl ylVar) {
            this.w = ylVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            rt2 rt2Var;
            String strD = ur1.d(bj3.this.x.a.f(), "OkHttp ");
            bj3 bj3Var = bj3.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strD);
            try {
                bj3Var.B.i();
                boolean z = false;
                try {
                    try {
                        try {
                            this.w.a(bj3Var, bj3Var.j());
                            rt2Var = bj3Var.w;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                x43 x43Var = x43.a;
                                x43 x43Var2 = x43.a;
                                String strD2 = ur1.d(bj3.a(bj3Var), "Callback failure for ");
                                x43Var2.getClass();
                                x43.i(4, strD2, e);
                            } else {
                                this.w.b(e);
                            }
                            rt2Var = bj3Var.w;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            bj3Var.cancel();
                            if (!z) {
                                IOException iOException = new IOException(ur1.d(th, "canceled due to "));
                                Th.a(iOException, th);
                                this.w.b(iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    rt2Var.w.b(this);
                    threadCurrentThread.setName(name);
                } catch (Throwable th3) {
                    bj3Var.w.w.b(this);
                    throw th3;
                }
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    public bj3(rt2 rt2Var, cp3 cp3Var, boolean z) {
        this.w = rt2Var;
        this.x = cp3Var;
        this.y = z;
        this.z = (jj3) rt2Var.x.w;
        fu0 fu0Var = (fu0) ((vK0u) rt2Var.A).x;
        byte[] bArr = qf5.a;
        this.A = fu0Var;
        F1 f1 = new F1();
        f1.g(rt2Var.S, TimeUnit.MILLISECONDS);
        this.B = f1;
        this.C = new AtomicBoolean();
        this.K = true;
    }

    public static final String a(bj3 bj3Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(bj3Var.L ? "canceled " : "");
        sb.append(bj3Var.y ? "web socket" : "call");
        sb.append(" to ");
        sb.append(bj3Var.x.a.f());
        return sb.toString();
    }

    public final void c(ej3 ej3Var) {
        byte[] bArr = qf5.a;
        if (!(this.F == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.F = ej3Var;
        ej3Var.p.add(new CQf(this, this.D));
    }

    @Override // defpackage.hl
    public final void cancel() {
        Socket socket;
        if (this.L) {
            return;
        }
        this.L = true;
        av0 av0Var = this.M;
        if (av0Var != null) {
            av0Var.d.cancel();
        }
        ej3 ej3Var = this.N;
        if (ej3Var != null && (socket = ej3Var.c) != null) {
            qf5.e(socket);
        }
        this.A.getClass();
    }

    public final Object clone() {
        return new bj3(this.w, this.x, this.y);
    }

    public final <E extends IOException> E d(E e) {
        E interruptedIOException;
        Socket socketN;
        byte[] bArr = qf5.a;
        ej3 ej3Var = this.F;
        if (ej3Var != null) {
            synchronized (ej3Var) {
                socketN = n();
            }
            if (this.F == null) {
                if (socketN != null) {
                    qf5.e(socketN);
                }
                this.A.getClass();
            } else {
                if (!(socketN == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.G && this.B.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e != null) {
            this.A.getClass();
        } else {
            this.A.getClass();
        }
        return interruptedIOException;
    }

    public final void h(yl ylVar) {
        QnHx next;
        if (!this.C.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        x43 x43Var = x43.a;
        this.D = x43.a.g();
        this.A.getClass();
        ll0 ll0Var = this.w.w;
        QnHx qnHx = new QnHx(ylVar);
        synchronized (ll0Var) {
            ll0Var.b.add(qnHx);
            if (!this.y) {
                String str = this.x.a.d;
                Iterator<QnHx> it = ll0Var.c.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<QnHx> it2 = ll0Var.b.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!ur1.a(bj3.this.x.a.d, str));
                    } else {
                        next = it.next();
                    }
                } while (!ur1.a(bj3.this.x.a.d, str));
                if (next != null) {
                    qnHx.x = next.x;
                }
            }
            sd5 sd5Var = sd5.a;
        }
        ll0Var.c();
    }

    public final void i(boolean z) {
        av0 av0Var;
        synchronized (this) {
            if (!this.K) {
                throw new IllegalStateException("released".toString());
            }
            sd5 sd5Var = sd5.a;
        }
        if (z && (av0Var = this.M) != null) {
            av0Var.d.cancel();
            av0Var.a.k(av0Var, true, true, null);
        }
        this.H = null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    public final xp3 j() throws Throwable {
        boolean z;
        ArrayList arrayList = new ArrayList();
        su.x0(this.w.y, arrayList);
        arrayList.add(new vq3(this.w));
        arrayList.add(new cf(this.w.F));
        this.w.getClass();
        arrayList.add(new xk());
        arrayList.add(q50.a);
        if (!this.y) {
            su.x0(this.w.z, arrayList);
        }
        arrayList.add(new il(this.y));
        cp3 cp3Var = this.x;
        rt2 rt2Var = this.w;
        try {
            xp3 xp3VarB = new kj3(this, arrayList, 0, null, cp3Var, rt2Var.T, rt2Var.U, rt2Var.V).b(cp3Var);
            if (this.L) {
                qf5.d(xp3VarB);
                throw new IOException("Canceled");
            }
            l(null);
            return xp3VarB;
        } catch (IOException e) {
            try {
                IOException iOExceptionL = l(e);
                if (iOExceptionL == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionL;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    l(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                l(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x001d A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:34:0x003d, B:14:0x0017), top: B:55:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0021 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:34:0x003d, B:14:0x0017), top: B:55:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002d  */
    public final <E extends IOException> E k(av0 av0Var, boolean z, boolean z2, E e) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (!ur1.a(av0Var, this.M)) {
            return e;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.I) {
                        if (z) {
                            this.I = false;
                        }
                        if (z2) {
                            this.J = false;
                        }
                        z5 = this.I;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!z5) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    } else if (z2 || !this.J) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.I = false;
                        }
                        if (z2) {
                            this.J = false;
                        }
                        z5 = this.I;
                        if (z5 || this.J) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.J && !this.K) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
            sd5 sd5Var = sd5.a;
        }
        if (z3) {
            this.M = null;
            ej3 ej3Var = this.F;
            if (ej3Var != null) {
                synchronized (ej3Var) {
                    ej3Var.m++;
                }
            }
        }
        return z4 ? (E) d(e) : e;
    }

    public final IOException l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.K) {
                this.K = false;
                if (!this.I && !this.J) {
                    z = true;
                }
            }
            sd5 sd5Var = sd5.a;
        }
        return z ? d(iOException) : iOException;
    }

    public final Socket n() {
        ej3 ej3Var = this.F;
        byte[] bArr = qf5.a;
        ArrayList arrayList = ej3Var.p;
        Iterator it = arrayList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ur1.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i);
        this.F = null;
        if (arrayList.isEmpty()) {
            ej3Var.q = System.nanoTime();
            jj3 jj3Var = this.z;
            jj3Var.getClass();
            byte[] bArr2 = qf5.a;
            boolean z2 = ej3Var.j;
            g15 g15Var = jj3Var.c;
            if (z2 || jj3Var.a == 0) {
                ej3Var.j = true;
                ConcurrentLinkedQueue<ej3> concurrentLinkedQueue = jj3Var.e;
                concurrentLinkedQueue.remove(ej3Var);
                if (concurrentLinkedQueue.isEmpty()) {
                    g15Var.a();
                }
                z = true;
            } else {
                g15Var.c(jj3Var.d, 0L);
            }
            if (z) {
                return ej3Var.d;
            }
        }
        return null;
    }
}
