package com.google.android.gms.internal.ads;

import defpackage.bl2;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgr {
    public final String zza;
    public final zzaf zzb;
    public final zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzgr(String str, zzaf zzafVar, zzaf zzafVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzdd.zzd(z);
        zzdd.zzc(str);
        this.zza = str;
        zzafVar.getClass();
        this.zzb = zzafVar;
        zzafVar2.getClass();
        this.zzc = zzafVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgr.class == obj.getClass()) {
            zzgr zzgrVar = (zzgr) obj;
            if (this.zzd == zzgrVar.zzd && this.zze == zzgrVar.zze && this.zza.equals(zzgrVar.zza) && this.zzb.equals(zzgrVar.zzb) && this.zzc.equals(zzgrVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode() + ((this.zzb.hashCode() + bl2.a(this.zza, (((this.zzd + 527) * 31) + this.zze) * 31, 31)) * 31);
    }
}
