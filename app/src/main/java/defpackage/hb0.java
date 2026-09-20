package defpackage;

import android.util.Log;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class hb0 implements hc0.QnHx {
    public final /* synthetic */ rb0 a;

    public hb0(rb0 rb0Var) {
        this.a = rb0Var;
    }

    public final void a(rh4 rh4Var, Thread thread, Throwable th) {
        w05<TContinuationResult> w05VarI;
        rb0 rb0Var = this.a;
        synchronized (rb0Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            db0 db0Var = rb0Var.e;
            jb0 jb0Var = new jb0(rb0Var, jCurrentTimeMillis, th, thread, rh4Var);
            synchronized (db0Var.c) {
                w05VarI = db0Var.b.i(db0Var.a, new fb0(jb0Var));
                db0Var.b = w05VarI.f(db0Var.a, new qe0());
            }
            try {
                tf5.a(w05VarI);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }
}
