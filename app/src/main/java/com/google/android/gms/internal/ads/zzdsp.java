package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsp extends zzbmq {
    public final String w;
    public final zzdoj x;
    public final zzdoo y;

    public zzdsp(String str, zzdoj zzdojVar, zzdoo zzdooVar) {
        this.w = str;
        this.x = zzdojVar;
        this.y = zzdooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final Bundle zzb() {
        return this.y.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final com.google.android.gms.ads.internal.client.zzdk zzc() {
        return this.y.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final zzbls zzd() {
        return this.y.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final zzbma zze() {
        return this.y.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final IObjectWrapper zzf() {
        return this.y.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final IObjectWrapper zzg() {
        return new ObjectWrapper(this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final String zzh() {
        return this.y.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final String zzi() {
        return this.y.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final String zzj() {
        return this.y.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final String zzk() {
        return this.y.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final String zzl() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final List zzm() {
        return this.y.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzn() {
        this.x.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzo(Bundle bundle) {
        this.x.zzz(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzp(Bundle bundle) {
        this.x.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final boolean zzq(Bundle bundle) {
        return this.x.zzQ(bundle);
    }
}
