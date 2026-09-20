package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepv implements zzeun {
    public final zzfyy a;
    public final zzfdn b;
    public final zzcgt c;
    public final zzcga d;

    public zzepv(zzfyy zzfyyVar, zzfdn zzfdnVar, zzcgt zzcgtVar, zzcga zzcgaVar) {
        this.a = zzfyyVar;
        this.b = zzfdnVar;
        this.c = zzcgtVar;
        this.d = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzepv zzepvVar = this.zza;
                return new zzepw(zzepvVar.b.zzj, zzepvVar.c, zzepvVar.d.zzj());
            }
        });
    }
}
