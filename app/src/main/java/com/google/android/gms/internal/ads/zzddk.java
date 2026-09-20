package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzddk extends zzdih implements zzddc {
    public zzddk(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzddh
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzddo) obj).zzk(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzb() {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzddi
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzddo) obj).zzk(zzfem.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzc(final zzdmm zzdmmVar) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzddj
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzddo) obj).zzk(zzfem.zzd(12, zzdmmVar.getMessage(), null));
            }
        });
    }
}
