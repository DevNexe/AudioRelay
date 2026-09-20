package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvb implements zzddt {
    public final zzcmn w;

    public zzdvb(zzcmn zzcmnVar) {
        this.w = zzcmnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbq(Context context) {
        zzcmn zzcmnVar = this.w;
        if (zzcmnVar != null) {
            zzcmnVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbs(Context context) {
        zzcmn zzcmnVar = this.w;
        if (zzcmnVar != null) {
            zzcmnVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzbt(Context context) {
        zzcmn zzcmnVar = this.w;
        if (zzcmnVar != null) {
            zzcmnVar.onResume();
        }
    }
}
