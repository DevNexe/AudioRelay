package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqt implements Callable {
    public final zzaqb w;
    public final zzamh x;

    public zzaqt(zzaqb zzaqbVar, zzamh zzamhVar) {
        this.w = zzaqbVar;
        this.x = zzamhVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.w.zzl() != null) {
            this.w.zzl().get();
        }
        zzamx zzamxVarZzc = this.w.zzc();
        if (zzamxVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.x) {
                try {
                    zzamh zzamhVar = this.x;
                    byte[] bArrZzaw = zzamxVarZzc.zzaw();
                    zzamhVar.zzak(bArrZzaw, 0, bArrZzaw.length, zzgnz.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzgoz | NullPointerException unused) {
            return null;
        }
    }
}
