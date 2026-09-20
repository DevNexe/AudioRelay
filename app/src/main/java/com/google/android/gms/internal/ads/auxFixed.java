package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class auxFixed extends zzfuv {
    public static final auxFixed A = new auxFixed(0, new Object[0]);
    public final transient Object[] y;
    public final transient int z;

    public auxFixed(int i, Object[] objArr) {
        this.y = objArr;
        this.z = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfuv, com.google.android.gms.internal.ads.zzfuq
    public final int a(int i, Object[] objArr) {
        Object[] objArr2 = this.y;
        int i2 = this.z;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int b() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final Object[] e() {
        return this.y;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfsf.zza(i, this.z, "index");
        Object obj = this.y[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }
}
