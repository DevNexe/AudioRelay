package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EQ extends zzfva {
    public final transient zzfuy y;
    public final transient zzfuv z;

    public EQ(zzfuy zzfuyVar, FJCM fjcm) {
        this.y = zzfuyVar;
        this.z = fjcm;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int a(int i, Object[] objArr) {
        return this.z.a(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.y.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.z.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.y.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq
    public final zzfuv zzd() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq
    /* JADX INFO: renamed from: zze */
    public final zzfwu iterator() {
        return this.z.listIterator(0);
    }
}
