package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class byN extends zzfva {
    public final transient int A;
    public final transient zzfuy y;
    public final transient Object[] z;

    public byN(zzfuy zzfuyVar, Object[] objArr, int i) {
        this.y = zzfuyVar;
        this.z = objArr;
        this.A = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int a(int i, Object[] objArr) {
        return zzd().a(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.y.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final zzfuv g() {
        return new T23(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq
    /* JADX INFO: renamed from: zze */
    public final zzfwu iterator() {
        return zzd().listIterator(0);
    }
}
