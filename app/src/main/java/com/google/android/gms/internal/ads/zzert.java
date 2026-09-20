package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzert implements zzeun {
    public final zzfyy a;
    public final zzfdn b;

    public zzert(zzfyy zzfyyVar, zzfdn zzfdnVar) {
        this.a = zzfyyVar;
        this.b = zzfdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzers
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeru("requester_type_2".equals(zzf.zzb(this.zza.b.zzd)));
            }
        });
    }
}
