package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FJCM extends zzfuv {
    public final transient int A;
    public final transient Object[] y;
    public final transient int z;

    public FJCM(int i, int i2, Object[] objArr) {
        this.y = objArr;
        this.z = i;
        this.A = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final boolean d() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfsf.zza(i, this.A, "index");
        Object obj = this.y[i + i + this.z];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
