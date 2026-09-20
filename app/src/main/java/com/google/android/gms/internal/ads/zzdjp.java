package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjp extends zzdih implements zzdjr {
    public zzdjp(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        a(new zzdig(str2) { // from class: com.google.android.gms.internal.ads.zzdjo
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzdjr) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzb(final String str, final String str2) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzdjr) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzc(final String str) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdjl
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzdjr) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzd(final String str) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdjn
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzdjr) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zze() {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzdjr) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjr
    public final void zzf() {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdjj
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzdjr) obj).zzf();
            }
        });
    }
}
