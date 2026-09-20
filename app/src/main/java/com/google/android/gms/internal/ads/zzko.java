package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzko {
    public final zzaa a;
    public final SparseArray b;

    public zzko(zzaa zzaaVar, SparseArray sparseArray) {
        this.a = zzaaVar;
        SparseArray sparseArray2 = new SparseArray(zzaaVar.zzb());
        for (int i = 0; i < zzaaVar.zzb(); i++) {
            int iZza = zzaaVar.zza(i);
            zzkn zzknVar = (zzkn) sparseArray.get(iZza);
            zzknVar.getClass();
            sparseArray2.append(iZza, zzknVar);
        }
        this.b = sparseArray2;
    }

    public final int zza(int i) {
        return this.a.zza(i);
    }

    public final int zzb() {
        return this.a.zzb();
    }

    public final zzkn zzc(int i) {
        zzkn zzknVar = (zzkn) this.b.get(i);
        zzknVar.getClass();
        return zzknVar;
    }

    public final boolean zzd(int i) {
        return this.a.zzc(i);
    }
}
