package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemt extends com.google.android.gms.ads.internal.client.zzbk {
    public final zzenz w;

    public zzemt(Context context, zzcok zzcokVar, zzfdl zzfdlVar, zzdoz zzdozVar, com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        zzeob zzeobVar = new zzeob(zzdozVar, zzcokVar.zzx());
        zzeobVar.zze(zzbfVar);
        this.w = new zzenz(new zzeol(zzcokVar, context, zzeobVar, zzfdlVar), zzfdlVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zze() {
        return this.w.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zzf() {
        return this.w.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.w.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) {
        this.w.zzd(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized boolean zzi() {
        return this.w.zze();
    }
}
