package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public final class T23 extends zzfuv {
    public final /* synthetic */ byN y;

    public T23(byN byn) {
        this.y = byn;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final boolean d() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        byN byn = this.y;
        zzfsf.zza(i, byn.A, "index");
        int i2 = i + i;
        Object obj = byn.z[i2];
        obj.getClass();
        Object obj2 = byn.z[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.y.A;
    }
}
