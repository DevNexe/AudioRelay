package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class hc0 implements Thread.UncaughtExceptionHandler {
    public final QnHx a;
    public final rh4 b;
    public final Thread.UncaughtExceptionHandler c;
    public final yb0 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public interface QnHx {
    }

    public hc0(hb0 hb0Var, xg4 xg4Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, yb0 yb0Var) {
        this.a = hb0Var;
        this.b = xg4Var;
        this.c = uncaughtExceptionHandler;
        this.d = yb0Var;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d A[DONT_GENERATE] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        boolean z = true;
        atomicBoolean.set(true);
        try {
            if (a(thread, th)) {
                ((hb0) this.a).a(this.b, thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            }
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
        } finally {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        }
    }
}
