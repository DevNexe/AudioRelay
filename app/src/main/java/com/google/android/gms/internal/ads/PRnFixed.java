package com.google.android.gms.internal.ads;

import defpackage.ko6;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PRnFixed extends zzfva {
    public static final Object[] D;
    public static final PRnFixed E;
    public final transient Object[] A;
    public final transient int B;
    public final transient int C;
    public final transient Object[] y;
    public final transient int z;

    static {
        Object[] objArr = new Object[0];
        D = objArr;
        E = new PRnFixed(0, 0, 0, objArr, objArr);
    }

    public PRnFixed(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.y = objArr;
        this.z = i;
        this.A = objArr2;
        this.B = i2;
        this.C = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int a(int i, Object[] objArr) {
        Object[] objArr2 = this.y;
        int i2 = this.C;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int b() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        if (obj != null) {
            Object[] objArr = this.A;
            if (objArr.length != 0) {
                int iH = ko6.h(obj);
                while (true) {
                    int i = iH & this.B;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iH = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final Object[] e() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final zzfuv g() {
        return zzfuv.f(this.C, this.y);
    }

    @Override // com.google.android.gms.internal.ads.zzfva, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfuq
    /* JADX INFO: renamed from: zze */
    public final zzfwu iterator() {
        return zzd().listIterator(0);
    }
}
