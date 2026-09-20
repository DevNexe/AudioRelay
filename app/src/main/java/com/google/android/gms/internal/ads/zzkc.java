package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzkc {
    public final zzhi a;

    @Deprecated
    public zzkc(Context context, zzclw zzclwVar, byte[] bArr) {
        this.a = new zzhi(context, zzclwVar, null);
    }

    @Deprecated
    public final zzkc zza(final zzjf zzjfVar) {
        zzhi zzhiVar = this.a;
        zzdd.zzf(!zzhiVar.l);
        zzhiVar.f = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzha
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return zzjfVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzkc zzb(final zzvw zzvwVar) {
        zzhi zzhiVar = this.a;
        zzdd.zzf(!zzhiVar.l);
        zzhiVar.e = new zzfsv() { // from class: com.google.android.gms.internal.ads.zzhb
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return zzvwVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzkd zzc() {
        zzhi zzhiVar = this.a;
        zzdd.zzf(!zzhiVar.l);
        zzhiVar.l = true;
        return new zzkd(zzhiVar);
    }
}
