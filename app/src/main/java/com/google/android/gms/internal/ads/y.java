package com.google.android.gms.internal.ads;

import defpackage.uo6;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends zzfva {
    public final transient Object y;

    public y(Object obj) {
        this.y = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int a(int i, Object[] objArr) {
        objArr[i] = this.y;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.y.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfva, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.y.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new uo6(this.y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.y.toString() + ']';
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq
    public final zzfuv zzd() {
        return zzfuv.zzp(this.y);
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq
    /* JADX INFO: renamed from: zze */
    public final zzfwu iterator() {
        return new uo6(this.y);
    }
}
