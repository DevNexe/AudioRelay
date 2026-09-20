package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class u17 {
    public final /* synthetic */ w17 a;

    public u17(w17 w17Var) {
        this.a = w17Var;
    }

    public final void a() {
        w17 w17Var = this.a;
        w17Var.e();
        dq6 dq6Var = w17Var.a;
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        dq6Var.n.getClass();
        if (xj6Var.o(System.currentTimeMillis())) {
            xj6 xj6Var2 = dq6Var.h;
            dq6.f(xj6Var2);
            xj6Var2.k.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.n.b("Detected application was in foreground");
                dq6Var.n.getClass();
                c(System.currentTimeMillis(), false);
            }
        }
    }

    public final void b(long j, boolean z) {
        w17 w17Var = this.a;
        w17Var.e();
        w17Var.i();
        dq6 dq6Var = w17Var.a;
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        if (xj6Var.o(j)) {
            xj6 xj6Var2 = dq6Var.h;
            dq6.f(xj6Var2);
            xj6Var2.k.a(true);
            g87.a();
            if (dq6Var.g.n(null, lg6.q0)) {
                dq6Var.m().l();
            }
        }
        xj6 xj6Var3 = dq6Var.h;
        dq6.f(xj6Var3);
        xj6Var3.n.b(j);
        xj6 xj6Var4 = dq6Var.h;
        dq6.f(xj6Var4);
        if (xj6Var4.k.b()) {
            c(j, z);
        }
    }

    public final void c(long j, boolean z) {
        w17 w17Var = this.a;
        w17Var.e();
        dq6 dq6Var = w17Var.a;
        if (dq6Var.d()) {
            xj6 xj6Var = dq6Var.h;
            dq6.f(xj6Var);
            xj6Var.n.b(j);
            dq6Var.n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            Long lValueOf = Long.valueOf(j / 1000);
            dy6 dy6Var = dq6Var.p;
            dq6.g(dy6Var);
            dy6Var.u(j, lValueOf, "auto", "_sid");
            xj6 xj6Var2 = dq6Var.h;
            dq6.f(xj6Var2);
            xj6Var2.k.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (dq6Var.g.n(null, lg6.a0) && z) {
                bundle.putLong("_aib", 1L);
            }
            dy6 dy6Var2 = dq6Var.p;
            dq6.g(dy6Var2);
            dy6Var2.m(j, bundle, "auto", "_s");
            ((l67) k67.x.w.zza()).zza();
            if (dq6Var.g.n(null, lg6.d0)) {
                xj6 xj6Var3 = dq6Var.h;
                dq6.f(xj6Var3);
                String strA = xj6Var3.s.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                dy6 dy6Var3 = dq6Var.p;
                dq6.g(dy6Var3);
                dy6Var3.m(j, bundle2, "auto", "_ssr");
            }
        }
    }
}
