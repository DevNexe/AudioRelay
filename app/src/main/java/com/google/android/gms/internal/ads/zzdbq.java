package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdbq implements zzdft {
    public final zzdzq A;
    public final zzfje B;
    public final Context w;
    public final zzfdn x;
    public final zzcgt y;
    public final zzg z;

    public zzdbq(Context context, zzfdn zzfdnVar, zzcgt zzcgtVar, zzg zzgVar, zzdzq zzdzqVar, zzfje zzfjeVar) {
        this.w = context;
        this.x = zzfdnVar;
        this.y = zzcgtVar;
        this.z = zzgVar;
        this.A = zzdzqVar;
        this.B = zzfjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdb)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zza().zzc(this.w, this.y, this.x.zzf, this.z.zzh(), this.B);
        }
        this.A.zzr();
    }
}
