package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzvp {
    public final zzcp zza;
    public final int[] zzb;

    public zzvp(zzcp zzcpVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdu.zza("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcpVar;
        this.zzb = iArr;
    }
}
