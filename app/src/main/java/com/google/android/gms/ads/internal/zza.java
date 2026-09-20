package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzcid;
import com.google.android.gms.internal.ads.zzcio;
import com.google.android.gms.internal.ads.zzckl;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public final zzcid zza;
    public final zzckl zzb;

    public zza(zzckl zzcklVar, zzcid zzcidVar, byte[] bArr) {
        this.zzb = zzcklVar;
        this.zza = zzcidVar;
    }

    public static zza zza() {
        return new zza(new zzckl(), new zzcio(), null);
    }
}
