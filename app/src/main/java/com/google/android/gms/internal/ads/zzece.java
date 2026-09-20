package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzece extends zzcav {
    public final /* synthetic */ zzecf w;

    public zzece(zzecf zzecfVar) {
        this.w = zzecfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.w.a.zze(new com.google.android.gms.ads.internal.util.zzay(zzazVar.zza, zzazVar.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.w.a.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
