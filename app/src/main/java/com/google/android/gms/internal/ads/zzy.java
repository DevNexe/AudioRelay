package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzy {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final zzy zza(int i) {
        zzdd.zzf(!this.b);
        this.a.append(i, true);
        return this;
    }

    public final zzaa zzb() {
        zzdd.zzf(!this.b);
        this.b = true;
        return new zzaa(this.a);
    }
}
