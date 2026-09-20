package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import defpackage.p26;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazw {
    public final ExecutorService a = zzban.zzl("Loader:ExtractorMediaPeriod");
    public p26 b;
    public IOException c;

    public zzazw(String str) {
    }

    public final long zza(zzazu zzazuVar, zzazs zzazsVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzazy.zze(looperMyLooper != null);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new p26(this, looperMyLooper, zzazuVar, zzazsVar, i, jElapsedRealtime).b(0L);
        return jElapsedRealtime;
    }

    public final void zzf() {
        this.b.a(false);
    }

    public final void zzg(int i) throws IOException {
        IOException iOException;
        IOException iOException2 = this.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        p26 p26Var = this.b;
        if (p26Var != null && (iOException = p26Var.A) != null && p26Var.B > p26Var.y) {
            throw iOException;
        }
    }

    public final void zzh(Runnable runnable) {
        p26 p26Var = this.b;
        if (p26Var != null) {
            p26Var.a(true);
        }
        ExecutorService executorService = this.a;
        executorService.execute(runnable);
        executorService.shutdown();
    }

    public final boolean zzi() {
        return this.b != null;
    }
}
