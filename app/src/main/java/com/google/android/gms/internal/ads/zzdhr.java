package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdhr extends zzdih implements zzbon {
    public zzdhr(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    public final synchronized void zzbD(final String str, final String str2) {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdhq
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((zzasb) obj).zzbu(str, str2);
            }
        });
    }
}
