package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzejj extends zzbwr {
    public final zzegn w;
    public final /* synthetic */ zzejk x;

    public /* synthetic */ zzejj(zzejk zzejkVar, zzegn zzegnVar) {
        this.x = zzejkVar;
        this.w = zzegnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze(String str) {
        ((zzeig) this.w.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzeig) this.w.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg(zzbvu zzbvuVar) {
        this.x.c = zzbvuVar;
        ((zzeig) this.w.zzc).zzo();
    }
}
