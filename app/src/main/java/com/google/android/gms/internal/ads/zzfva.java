package com.google.android.gms.internal.ads;

import defpackage.GM;
import defpackage.ko6;
import defpackage.po6;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfva extends zzfuq implements Set {

    @CheckForNull
    public transient zzfuv x;

    public static int f(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzfsf.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfva h(int i, Object... objArr) {
        if (i == 0) {
            return PRnFixed.E;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new y(obj);
        }
        int iF = f(i);
        Object[] objArr2 = new Object[iF];
        int i2 = iF - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(GM.a("at index ", i5));
            }
            int iHashCode = obj2.hashCode();
            int iG = ko6.g(iHashCode);
            while (true) {
                int i6 = iG & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iG++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new y(obj4);
        }
        if (f(i4) < iF / 2) {
            return h(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new PRnFixed(i3, i2, i4, objArr, objArr2);
    }

    public static zzfuz zzj(int i) {
        return new zzfuz(i);
    }

    public static zzfva zzl(Collection collection) {
        Object[] array = collection.toArray();
        return h(array.length, array);
    }

    @SafeVarargs
    public static zzfva zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return h(12, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfva) && (this instanceof PRnFixed)) {
            zzfva zzfvaVar = (zzfva) obj;
            zzfvaVar.getClass();
            if ((zzfvaVar instanceof PRnFixed) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return zzfwq.b(this, obj);
    }

    public zzfuv g() {
        Object[] array = toArray();
        po6 po6Var = zzfuv.x;
        return zzfuv.f(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfwq.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public zzfuv zzd() {
        zzfuv zzfuvVar = this.x;
        if (zzfuvVar != null) {
            return zzfuvVar;
        }
        zzfuv zzfuvVarG = g();
        this.x = zzfuvVarG;
        return zzfuvVarG;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zze */
    public abstract zzfwu iterator();
}
