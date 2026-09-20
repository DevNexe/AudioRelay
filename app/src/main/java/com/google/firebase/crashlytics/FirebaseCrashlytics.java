package com.google.firebase.crashlytics;

import android.util.Log;
import defpackage.QE;
import defpackage.db0;
import defpackage.eb0;
import defpackage.fe0;
import defpackage.gf5;
import defpackage.k15;
import defpackage.kc7;
import defpackage.nb0;
import defpackage.ob0;
import defpackage.qx0;
import defpackage.rb0;
import defpackage.sw1;
import defpackage.vb0;
import defpackage.w05;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCrashlytics {
    public final vb0 a;

    public FirebaseCrashlytics(vb0 vb0Var) {
        this.a = vb0Var;
    }

    public static FirebaseCrashlytics getInstance() {
        qx0 qx0VarB = qx0.b();
        qx0VarB.a();
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) qx0VarB.d.d(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public w05<Boolean> checkForUnsentReports() {
        rb0 rb0Var = this.a.h;
        if (rb0Var.q.compareAndSet(false, true)) {
            return rb0Var.n.a;
        }
        Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
        return k15.e(Boolean.FALSE);
    }

    public void deleteUnsentReports() {
        rb0 rb0Var = this.a.h;
        rb0Var.o.c(Boolean.FALSE);
        kc7<Void> kc7Var = rb0Var.p.a;
    }

    public boolean didCrashOnPreviousExecution() {
        return this.a.g;
    }

    public void log(String str) {
        vb0 vb0Var = this.a;
        vb0Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - vb0Var.d;
        rb0 rb0Var = vb0Var.h;
        rb0Var.getClass();
        rb0Var.e.a(new nb0(rb0Var, jCurrentTimeMillis, str));
    }

    public void recordException(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        rb0 rb0Var = this.a.h;
        Thread threadCurrentThread = Thread.currentThread();
        rb0Var.getClass();
        ob0 ob0Var = new ob0(rb0Var, System.currentTimeMillis(), th, threadCurrentThread);
        db0 db0Var = rb0Var.e;
        db0Var.getClass();
        db0Var.a(new eb0(ob0Var));
    }

    public void sendUnsentReports() {
        rb0 rb0Var = this.a.h;
        rb0Var.o.c(Boolean.TRUE);
        kc7<Void> kc7Var = rb0Var.p.a;
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.a.d(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, boolean z) {
        this.a.e(str, Boolean.toString(z));
    }

    public void setCustomKeys(fe0 fe0Var) {
        throw null;
    }

    public void setUserId(String str) {
        boolean zEquals;
        gf5 gf5Var = this.a.h.d;
        gf5Var.getClass();
        String strA = sw1.a(1024, str);
        synchronized (gf5Var.f) {
            String reference = gf5Var.f.getReference();
            if (strA == null) {
                zEquals = reference == null;
            } else {
                zEquals = strA.equals(reference);
            }
            if (zEquals) {
                return;
            }
            gf5Var.f.set(strA, true);
            gf5Var.b.a(new QE(gf5Var, 2));
        }
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.a.d(bool);
    }

    public void setCustomKey(String str, double d) {
        this.a.e(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.a.e(str, Float.toString(f));
    }

    public void setCustomKey(String str, int i) {
        this.a.e(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.a.e(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.a.e(str, str2);
    }
}
