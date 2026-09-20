package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetc implements zzeun {
    public final zzfyy a;
    public final Bundle b;

    public zzetc(zzfyy zzfyyVar, Bundle bundle) {
        this.a = zzfyyVar;
        this.b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzetd(this.zza.b);
            }
        });
    }
}
