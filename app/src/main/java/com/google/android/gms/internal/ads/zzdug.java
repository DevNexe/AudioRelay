package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdug implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzdug(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* synthetic */ Object zzb() {
        int i = ((zzdcp) this.c).zza().zzo.zza;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? ((zzell) this.b).zzb() : ((zzell) this.a).zzb();
        }
        throw null;
    }
}
