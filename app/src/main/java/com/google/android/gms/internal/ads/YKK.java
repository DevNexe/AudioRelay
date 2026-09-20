package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class YKK extends zzfuv {
    public final /* synthetic */ zzfuv A;
    public final transient int y;
    public final transient int z;

    public YKK(zzfuv zzfuvVar, int i, int i2) {
        this.A = zzfuvVar;
        this.y = i;
        this.z = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int b() {
        return this.A.c() + this.y + this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int c() {
        return this.A.c() + this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    @CheckForNull
    public final Object[] e() {
        return this.A.e();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfsf.zza(i, this.z, "index");
        return this.A.get(i + this.y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuv, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzfuv subList(int i, int i2) {
        zzfsf.zzg(i, i2, this.z);
        int i3 = this.y;
        return this.A.subList(i + i3, i2 + i3);
    }
}
