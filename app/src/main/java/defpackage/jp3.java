package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class jp3 {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final sf5 a;
    public long b;
    public int c;

    public jp3() {
        if (lf0.w == null) {
            Pattern pattern = sf5.c;
            lf0.w = new lf0();
        }
        lf0 lf0Var = lf0.w;
        if (sf5.d == null) {
            sf5.d = new sf5(lf0Var);
        }
        this.a = sf5.d;
    }

    public final synchronized void a(int i) {
        long jMin;
        boolean z = false;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                z = true;
            }
            try {
                if (z) {
                    double dPow = Math.pow(2.0d, this.c);
                    this.a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
                } else {
                    jMin = d;
                }
                this.a.a.getClass();
                this.b = System.currentTimeMillis() + jMin;
            } catch (Throwable th) {
                throw th;
            }
        }
        return;
        throw th;
    }
}
