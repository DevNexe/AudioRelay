package defpackage;

import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class lb0 implements Callable<w05<Void>> {
    public final /* synthetic */ Boolean w;
    public final /* synthetic */ mb0 x;

    public lb0(mb0 mb0Var, Boolean bool) {
        this.x = mb0Var;
        this.w = bool;
    }

    @Override // java.util.concurrent.Callable
    public final w05<Void> call() {
        Boolean bool = this.w;
        boolean zBooleanValue = bool.booleanValue();
        mb0 mb0Var = this.x;
        if (zBooleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue2 = bool.booleanValue();
            oe0 oe0Var = mb0Var.x.b;
            if (!zBooleanValue2) {
                oe0Var.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            oe0Var.h.c(null);
            Executor executor = mb0Var.x.e.a;
            return mb0Var.w.p(executor, new kb0(this, executor));
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        rb0 rb0Var = mb0Var.x;
        Iterator it = fx0.f(rb0Var.g.b.listFiles(rb0.r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        rb0 rb0Var2 = mb0Var.x;
        fx0 fx0Var = rb0Var2.l.b.b;
        fc0.a(fx0.f(fx0Var.d.listFiles()));
        fc0.a(fx0.f(fx0Var.e.listFiles()));
        fc0.a(fx0.f(fx0Var.f.listFiles()));
        rb0Var2.p.c(null);
        return k15.e(null);
    }
}
