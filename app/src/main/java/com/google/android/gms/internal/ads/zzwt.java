package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import defpackage.nc7;
import defpackage.pz5;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwt {
    public static final zzwn zza = new zzwn(0, -9223372036854775807L);
    public static final zzwn zzb = new zzwn(1, -9223372036854775807L);
    public static final zzwn zzc = new zzwn(2, -9223372036854775807L);
    public static final zzwn zzd = new zzwn(3, -9223372036854775807L);
    public final ExecutorService a = zzel.zzQ("ExoPlayer:Loader:ProgressiveMediaPeriod");
    public nc7 b;
    public IOException c;

    public zzwt(String str) {
    }

    public static zzwn zzb(boolean z, long j) {
        return new zzwn(z ? 1 : 0, j);
    }

    public final long zza(zzwp zzwpVar, zzwl zzwlVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzdd.zzb(looperMyLooper);
        this.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new nc7(this, looperMyLooper, zzwpVar, zzwlVar, jElapsedRealtime).b(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        nc7 nc7Var = this.b;
        zzdd.zzb(nc7Var);
        nc7Var.a(false);
    }

    public final void zzh() {
        this.c = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException;
        IOException iOException2 = this.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        nc7 nc7Var = this.b;
        if (nc7Var != null && (iOException = nc7Var.z) != null && nc7Var.A > i) {
            throw iOException;
        }
    }

    public final void zzj(zzwq zzwqVar) {
        nc7 nc7Var = this.b;
        if (nc7Var != null) {
            nc7Var.a(true);
        }
        pz5 pz5Var = new pz5(zzwqVar, 7);
        ExecutorService executorService = this.a;
        executorService.execute(pz5Var);
        executorService.shutdown();
    }

    public final boolean zzk() {
        return this.c != null;
    }

    public final boolean zzl() {
        return this.b != null;
    }
}
