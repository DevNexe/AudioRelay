package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class h15 {
    public static final CQf h = new CQf();
    public static final h15 i = new h15(new F1(new of5(ur1.d(" TaskRunner", qf5.f), true)));
    public static final Logger j = Logger.getLogger(h15.class.getName());
    public final QnHx a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final i15 g = new i15(this);

    public static final class CQf {
    }

    public static final class F1 implements QnHx {
        public final ThreadPoolExecutor a;

        public F1(of5 of5Var) {
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), of5Var);
        }

        @Override // h15.QnHx
        public final long a() {
            return System.nanoTime();
        }

        @Override // h15.QnHx
        public final void b(h15 h15Var) {
            h15Var.notify();
        }

        @Override // h15.QnHx
        public final void c(h15 h15Var, long j) throws InterruptedException {
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                h15Var.wait(j2, (int) j3);
            }
        }

        @Override // h15.QnHx
        public final void execute(Runnable runnable) {
            this.a.execute(runnable);
        }
    }

    public interface QnHx {
        long a();

        void b(h15 h15Var);

        void c(h15 h15Var, long j);

        void execute(Runnable runnable);
    }

    public h15(F1 f1) {
        this.a = f1;
    }

    public static final void a(h15 h15Var, v05 v05Var) {
        h15Var.getClass();
        byte[] bArr = qf5.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(v05Var.a);
        try {
            long jA = v05Var.a();
            synchronized (h15Var) {
                h15Var.b(v05Var, jA);
                sd5 sd5Var = sd5.a;
            }
        } finally {
            synchronized (h15Var) {
                h15Var.b(v05Var, -1L);
                sd5 sd5Var2 = sd5.a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(v05 v05Var, long j2) {
        byte[] bArr = qf5.a;
        g15 g15Var = v05Var.c;
        if (!(g15Var.d == v05Var)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = g15Var.f;
        g15Var.f = false;
        g15Var.d = null;
        this.e.remove(g15Var);
        if (j2 != -1 && !z && !g15Var.c) {
            g15Var.d(v05Var, j2, true);
        }
        if (!g15Var.e.isEmpty()) {
            this.f.add(g15Var);
        }
    }

    public final v05 c() {
        long j2;
        boolean z;
        byte[] bArr = qf5.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            QnHx qnHx = this.a;
            long jA = qnHx.a();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            v05 v05Var = null;
            while (true) {
                if (!it.hasNext()) {
                    j2 = jA;
                    z = false;
                    break;
                }
                v05 v05Var2 = (v05) ((g15) it.next()).e.get(0);
                j2 = jA;
                long jMax = Math.max(0L, v05Var2.d - jA);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (v05Var != null) {
                        z = true;
                        break;
                    }
                    v05Var = v05Var2;
                }
                jA = j2;
            }
            if (v05Var != null) {
                byte[] bArr2 = qf5.a;
                v05Var.d = -1L;
                g15 g15Var = v05Var.c;
                g15Var.e.remove(v05Var);
                arrayList.remove(g15Var);
                g15Var.d = v05Var;
                this.e.add(g15Var);
                if (z || (!this.c && (!arrayList.isEmpty()))) {
                    qnHx.execute(this.g);
                }
                return v05Var;
            }
            if (this.c) {
                if (jMin >= this.d - j2) {
                    return null;
                }
                qnHx.b(this);
                return null;
            }
            this.c = true;
            this.d = j2 + jMin;
            try {
                try {
                    qnHx.c(this, jMin);
                } catch (InterruptedException unused) {
                    d();
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                ((g15) arrayList.get(size)).b();
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        ArrayList arrayList2 = this.f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            g15 g15Var = (g15) arrayList2.get(size2);
            g15Var.b();
            if (g15Var.e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    public final void e(g15 g15Var) {
        byte[] bArr = qf5.a;
        if (g15Var.d == null) {
            boolean z = !g15Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (!z) {
                arrayList.remove(g15Var);
            } else if (!arrayList.contains(g15Var)) {
                arrayList.add(g15Var);
            }
        }
        boolean z2 = this.c;
        QnHx qnHx = this.a;
        if (z2) {
            qnHx.b(this);
        } else {
            qnHx.execute(this.g);
        }
    }

    public final g15 f() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new g15(this, ur1.d(Integer.valueOf(i2), "Q"));
    }
}
