package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {
    public final SparseBooleanArray a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        int i = zzel.zza;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.equals(zzaaVar.a);
        }
        if (sparseBooleanArray.size() != zzaaVar.a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (zza(i2) != zzaaVar.zza(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = zzel.zza;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + zza(i2);
        }
        return size;
    }

    public final int zza(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        zzdd.zza(i, 0, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final int zzb() {
        return this.a.size();
    }

    public final boolean zzc(int i) {
        return this.a.get(i);
    }
}
