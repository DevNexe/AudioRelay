package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdui implements zzgur {
    public final zzgve a;

    public zzdui(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbev zzbevVar = ((zzdcp) this.a).zza().zzo.zza == 3 ? zzbev.REWARDED_INTERSTITIAL : zzbev.REWARD_BASED_VIDEO_AD;
        zzguz.zzb(zzbevVar);
        return zzbevVar;
    }
}
