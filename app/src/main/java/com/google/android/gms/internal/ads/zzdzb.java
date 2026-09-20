package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzdzb extends zzccp {
    public final /* synthetic */ zzdzd w;

    public zzdzb(zzdzd zzdzdVar) {
        this.w = zzdzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zze(int i) {
        zzdzd zzdzdVar = this.w;
        zzdzdVar.b.zzm(zzdzdVar.a, i);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdzd zzdzdVar = this.w;
        zzdzdVar.b.zzm(zzdzdVar.a, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzg() {
        zzdzd zzdzdVar = this.w;
        zzdzdVar.b.zzp(zzdzdVar.a);
    }
}
