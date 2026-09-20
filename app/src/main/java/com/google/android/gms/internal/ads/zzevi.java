package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevi implements zzeun {
    public final Executor a;
    public final String b;

    public zzevi(zzcfn zzcfnVar, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.a = executor;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        zzfyx zzfyxVarZzi = zzfyo.zzi(this.b);
        zzevg zzevgVar = new zzfru() { // from class: com.google.android.gms.internal.ads.zzevg
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                return new zzevj((String) obj);
            }
        };
        Executor executor = this.a;
        return zzfyo.zzg(zzfyo.zzm(zzfyxVarZzi, zzevgVar, executor), Throwable.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzevh
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzi(new zzevj(this.zza.b));
            }
        }, executor);
    }
}
