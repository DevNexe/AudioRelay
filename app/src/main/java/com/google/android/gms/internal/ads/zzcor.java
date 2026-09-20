package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcor implements zzgur {
    public final zzcon a;

    public zzcor(zzcon zzconVar) {
        this.a = zzconVar;
    }

    public final WeakReference zza() {
        WeakReference weakReference = this.a.c;
        zzguz.zzb(weakReference);
        return weakReference;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final Object zzb() {
        WeakReference weakReference = this.a.c;
        zzguz.zzb(weakReference);
        return weakReference;
    }
}
