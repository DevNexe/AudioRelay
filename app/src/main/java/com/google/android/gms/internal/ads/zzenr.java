package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzenr implements zzdfj {
    public final AtomicReference w = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.w.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzezv.zza(this.w, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenq
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(zzsVar);
            }
        });
    }
}
