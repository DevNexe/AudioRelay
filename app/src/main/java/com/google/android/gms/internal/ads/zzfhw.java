package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfhw {
    public final Executor a;
    public final zzcgs b;

    public zzfhw(Executor executor, zzcgs zzcgsVar) {
        this.a = executor;
        this.b = zzcgsVar;
    }

    public final void zzb(final String str) {
        this.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhv
            @Override // java.lang.Runnable
            public final void run() {
                zzfhw zzfhwVar = this.zza;
                zzfhwVar.b.zza(str);
            }
        });
    }
}
