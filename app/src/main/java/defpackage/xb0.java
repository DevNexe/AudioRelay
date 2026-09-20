package defpackage;

import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 implements ut0 {
    public final FirebaseCrashlytics w;

    public xb0(FirebaseCrashlytics firebaseCrashlytics) {
        this.w = firebaseCrashlytics;
    }

    @Override // defpackage.ut0
    public final void a(Throwable th) {
        this.w.recordException(th);
    }
}
