package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class bp3 {
    public final double a;
    public final double b;
    public final long c;
    public final int d;
    public final ArrayBlockingQueue e;
    public final ThreadPoolExecutor f;
    public final sa5<bc0> g;
    public final ss3 h;
    public int i;
    public long j;

    public final class QnHx implements Runnable {
        public final gc0 w;
        public final z05<gc0> x;

        public QnHx(gc0 gc0Var, z05 z05Var) {
            this.w = gc0Var;
            this.x = z05Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            bp3 bp3Var = bp3.this;
            gc0 gc0Var = this.w;
            bp3Var.b(gc0Var, this.x);
            ((AtomicInteger) bp3Var.h.y).set(0);
            double dMin = Math.min(3600000.0d, Math.pow(bp3Var.b, bp3Var.a()) * (60000.0d / bp3Var.a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + gc0Var.c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public bp3(wa5 wa5Var, qg4 qg4Var, ss3 ss3Var) {
        double d = qg4Var.d;
        long j = ((long) qg4Var.f) * 1000;
        this.a = d;
        this.b = qg4Var.e;
        this.c = j;
        this.g = wa5Var;
        this.h = ss3Var;
        int i = (int) d;
        this.d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.e = arrayBlockingQueue;
        this.f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.i = 0;
        this.j = 0L;
    }

    public final int a() {
        if (this.j == 0) {
            this.j = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.j) / this.c);
        int iMin = this.e.size() == this.d ? Math.min(100, this.i + iCurrentTimeMillis) : Math.max(0, this.i - iCurrentTimeMillis);
        if (this.i != iMin) {
            this.i = iMin;
            this.j = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(gc0 gc0Var, z05<gc0> z05Var) {
        String str = "Sending report through Google DataTransport: " + gc0Var.c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        n3 n3Var = new n3(gc0Var.a());
        Z7O z7o = new Z7O(9, z05Var, gc0Var);
        wa5 wa5Var = (wa5) this.g;
        ua5 ua5Var = wa5Var.a;
        if (ua5Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str2 = wa5Var.b;
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        n8V_ n8v_ = wa5Var.d;
        if (n8v_ == null) {
            throw new NullPointerException("Null transformer");
        }
        os0 os0Var = wa5Var.c;
        if (os0Var == null) {
            throw new NullPointerException("Null encoding");
        }
        c4 c4Var = new c4(ua5Var, str2, n3Var, n8v_, os0Var);
        ya5 ya5Var = (ya5) wa5Var.e;
        ya5Var.getClass();
        wt0<?> wt0Var = c4Var.c;
        ie3 ie3VarC = wt0Var.c();
        ua5 ua5Var2 = c4Var.a;
        ua5Var2.getClass();
        j4.QnHx qnHxA = ua5.a();
        qnHxA.b(ua5Var2.b());
        qnHxA.c(ie3VarC);
        qnHxA.b = ua5Var2.c();
        j4 j4VarA = qnHxA.a();
        o3.QnHx qnHx = new o3.QnHx();
        qnHx.f = new HashMap();
        qnHx.d = Long.valueOf(ya5Var.a.a());
        qnHx.e = Long.valueOf(ya5Var.b.a());
        qnHx.d(c4Var.b);
        qnHx.c(new ks0(c4Var.e, (byte[]) c4Var.d.apply(wt0Var.b())));
        qnHx.b = wt0Var.a();
        ya5Var.c.a(z7o, qnHx.b(), j4VarA);
    }
}
