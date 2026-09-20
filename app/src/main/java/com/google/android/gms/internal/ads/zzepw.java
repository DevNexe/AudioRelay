package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepw implements zzeum {
    public final com.google.android.gms.ads.internal.client.zzw a;
    public final zzcgt b;
    public final boolean c;

    public zzepw(com.google.android.gms.ads.internal.client.zzw zzwVar, zzcgt zzcgtVar, boolean z) {
        this.a = zzwVar;
        this.b = zzcgtVar;
        this.c = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.b.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzen)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeo)).booleanValue()) {
            bundle.putBoolean("app_switched", this.c);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.a;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
