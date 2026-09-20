package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxn {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final /* synthetic */ zzdxo b;

    public zzdxn(zzdxo zzdxoVar) {
        this.b = zzdxoVar;
    }

    public final zzdxn zzb(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final zzdxn zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.a.put(str, str2);
        }
        return this;
    }

    public final zzdxn zzd(zzfcs zzfcsVar) {
        this.a.put("aai", zzfcsVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzga)).booleanValue()) {
            zzc("rid", zzfcsVar.zzap);
        }
        return this;
    }

    public final zzdxn zze(zzfcv zzfcvVar) {
        this.a.put("gqi", zzfcvVar.zzb);
        return this;
    }

    public final String zzf() {
        zzdxt zzdxtVar = this.b.a;
        return zzdxtVar.e.zza(this.a);
    }

    public final void zzg() {
        this.b.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxm
            @Override // java.lang.Runnable
            public final void run() {
                zzdxn zzdxnVar = this.zza;
                zzdxnVar.b.a.zze(zzdxnVar.a);
            }
        });
    }

    public final void zzh() {
        this.b.b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxl
            @Override // java.lang.Runnable
            public final void run() {
                zzdxn zzdxnVar = this.zza;
                zzdxnVar.b.a.zzd(zzdxnVar.a);
            }
        });
    }
}
