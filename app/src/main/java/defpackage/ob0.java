package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class ob0 implements Runnable {
    public final /* synthetic */ long w;
    public final /* synthetic */ Throwable x;
    public final /* synthetic */ Thread y;
    public final /* synthetic */ rb0 z;

    public ob0(rb0 rb0Var, long j, Throwable th, Thread thread) {
        this.z = rb0Var;
        this.w = j;
        this.x = th;
        this.y = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rb0 rb0Var = this.z;
        hc0 hc0Var = rb0Var.m;
        if (hc0Var != null && hc0Var.e.get()) {
            return;
        }
        long j = this.w / 1000;
        String strF = rb0Var.f();
        if (strF == null) {
            Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        Throwable th = this.x;
        Thread thread = this.y;
        dg4 dg4Var = rb0Var.l;
        dg4Var.getClass();
        String strConcat = "Persisting non-fatal event for session ".concat(strF);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        dg4Var.d(th, thread, strF, "error", j, false);
    }
}
