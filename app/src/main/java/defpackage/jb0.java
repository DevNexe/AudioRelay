package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class jb0 implements Callable<w05<Void>> {
    public final /* synthetic */ boolean A = false;
    public final /* synthetic */ rb0 B;
    public final /* synthetic */ long w;
    public final /* synthetic */ Throwable x;
    public final /* synthetic */ Thread y;
    public final /* synthetic */ rh4 z;

    public jb0(rb0 rb0Var, long j, Throwable th, Thread thread, rh4 rh4Var) {
        this.B = rb0Var;
        this.w = j;
        this.x = th;
        this.y = thread;
        this.z = rh4Var;
    }

    @Override // java.util.concurrent.Callable
    public final w05<Void> call() throws Throwable {
        long j = this.w;
        long j2 = j / 1000;
        rb0 rb0Var = this.B;
        String strF = rb0Var.f();
        if (strF == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return k15.e(null);
        }
        rb0Var.c.e();
        Throwable th = this.x;
        Thread thread = this.y;
        dg4 dg4Var = rb0Var.l;
        dg4Var.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strF);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        dg4Var.d(th, thread, strF, "crash", j2, true);
        rb0Var.d(j);
        rh4 rh4Var = this.z;
        rb0Var.c(false, rh4Var);
        new sk(rb0Var.f);
        rb0.a(rb0Var, sk.b);
        if (!rb0Var.b.b()) {
            return k15.e(null);
        }
        Executor executor = rb0Var.e.a;
        return ((xg4) rh4Var).i.get().a.p(executor, new ib0(this, executor, strF));
    }
}
