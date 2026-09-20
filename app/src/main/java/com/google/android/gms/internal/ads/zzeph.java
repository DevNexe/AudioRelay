package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeph implements zzeum {
    public final com.google.android.gms.ads.internal.client.zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeph(com.google.android.gms.ads.internal.client.zzq zzqVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        if (zzqVar == null) {
            throw new NullPointerException("the adSize must not be null");
        }
        this.zza = zzqVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfdy.zzg(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfdy.zzg(bundle, "smart_h", "auto", this.zza.zzb == -2);
        Boolean bool = Boolean.TRUE;
        zzfdy.zze(bundle, "ene", bool, this.zza.zzj);
        zzfdy.zzg(bundle, "rafmt", "102", this.zza.zzm);
        zzfdy.zzg(bundle, "rafmt", "103", this.zza.zzn);
        zzfdy.zzg(bundle, "rafmt", "105", this.zza.zzo);
        zzfdy.zze(bundle, "inline_adaptive_slot", bool, this.zzi);
        zzfdy.zze(bundle, "interscroller_slot", bool, this.zza.zzo);
        zzfdy.zzc(bundle, "format", this.zzb);
        zzfdy.zzg(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzfdy.zzg(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzfdy.zzg(bundle, "sc", str2, !TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
