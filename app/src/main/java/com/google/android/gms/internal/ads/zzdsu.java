package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsu extends zzbnw {
    public final String w;
    public final zzdoj x;
    public final zzdoo y;

    public zzdsu(String str, zzdoj zzdojVar, zzdoo zzdooVar) {
        this.w = str;
        this.x = zzdojVar;
        this.y = zzdooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzA() {
        this.x.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzB(Bundle bundle) {
        this.x.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzC() {
        this.x.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzD(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.x.zzH(zzcqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzE(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.x.zzI(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzF(zzbnu zzbnuVar) {
        this.x.zzJ(zzbnuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzG() {
        return this.x.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzH() {
        zzdoo zzdooVar = this.y;
        return (zzdooVar.zzF().isEmpty() || zzdooVar.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzI(Bundle bundle) {
        return this.x.zzQ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final double zze() {
        return this.y.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final Bundle zzf() {
        return this.y.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final com.google.android.gms.ads.internal.client.zzdh zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfN)).booleanValue()) {
            return this.x.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        return this.y.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbls zzi() {
        return this.y.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzblx zzj() {
        return this.x.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbma zzk() {
        return this.y.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final IObjectWrapper zzl() {
        return this.y.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final IObjectWrapper zzm() {
        return new ObjectWrapper(this.x);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzn() {
        return this.y.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzo() {
        return this.y.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzp() {
        return this.y.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzq() {
        return this.y.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzr() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzs() {
        return this.y.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzt() {
        return this.y.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final List zzu() {
        return this.y.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final List zzv() {
        return zzH() ? this.y.zzF() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzw() {
        this.x.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzx() {
        this.x.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzy(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        this.x.zzw(zzcuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzz(Bundle bundle) {
        this.x.zzz(bundle);
    }
}
