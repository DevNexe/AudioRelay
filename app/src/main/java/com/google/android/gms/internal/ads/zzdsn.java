package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsn extends zzbmo {
    public final String w;
    public final zzdoj x;
    public final zzdoo y;

    public zzdsn(String str, zzdoj zzdojVar, zzdoo zzdooVar) {
        this.w = str;
        this.x = zzdojVar;
        this.y = zzdooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final double zzb() {
        return this.y.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final Bundle zzc() {
        return this.y.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        return this.y.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final zzbls zze() {
        return this.y.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final zzbma zzf() {
        return this.y.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final IObjectWrapper zzg() {
        return this.y.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final IObjectWrapper zzh() {
        return new ObjectWrapper(this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final String zzi() {
        return this.y.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final String zzj() {
        return this.y.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final String zzk() {
        return this.y.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final String zzl() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final String zzm() {
        return this.y.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final String zzn() {
        return this.y.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final List zzo() {
        return this.y.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzp() {
        this.x.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzq(Bundle bundle) {
        this.x.zzz(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzr(Bundle bundle) {
        this.x.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final boolean zzs(Bundle bundle) {
        return this.x.zzQ(bundle);
    }
}
