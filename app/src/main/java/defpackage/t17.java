package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class t17 {
    public long a;
    public long b;
    public final yz6 c;
    public final /* synthetic */ w17 d;

    public t17(w17 w17Var) {
        this.d = w17Var;
        this.c = new yz6(this, w17Var.a, 1);
        w17Var.a.n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    public final boolean a(long j, boolean z, boolean z2) {
        w17 w17Var = this.d;
        w17Var.e();
        w17Var.f();
        ((e77) c77.x.w.zza()).zza();
        dq6 dq6Var = w17Var.a;
        if (!dq6Var.g.n(null, lg6.e0)) {
            xj6 xj6Var = dq6Var.h;
            dq6.f(xj6Var);
            dq6Var.n.getClass();
            xj6Var.n.b(System.currentTimeMillis());
        } else if (dq6Var.d()) {
            xj6 xj6Var2 = dq6Var.h;
            dq6.f(xj6Var2);
            dq6Var.n.getClass();
            xj6Var2.n.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.c(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        bi6 bi6Var2 = dq6Var.i;
        dq6.h(bi6Var2);
        bi6Var2.n.c(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean zO = dq6Var.g.o();
        dz6 dz6Var = dq6Var.o;
        dq6.g(dz6Var);
        m37.r(dz6Var.k(!zO), bundle, true);
        if (!z2) {
            dy6 dy6Var = dq6Var.p;
            dq6.g(dy6Var);
            dy6Var.l(bundle, "auto", "_e");
        }
        this.a = j;
        yz6 yz6Var = this.c;
        yz6Var.a();
        yz6Var.c(3600000L);
        return true;
    }
}
