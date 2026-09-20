package com.google.android.gms.internal.ads;

import defpackage.po6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfuv extends zzfuq implements List, RandomAccess {
    public static final po6 x = new po6(0, auxFixed.A);

    public static auxFixed f(int i, Object[] objArr) {
        return i == 0 ? auxFixed.A : new auxFixed(i, objArr);
    }

    public static zzfus zzi() {
        return new zzfus(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfuv zzl(Iterable iterable) {
        iterable.getClass();
        return zzm(iterable);
    }

    public static zzfuv zzm(Collection collection) {
        if (!(collection instanceof zzfuq)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfwc.a(length, array);
            return f(length, array);
        }
        zzfuv zzfuvVarZzd = ((zzfuq) collection).zzd();
        if (!zzfuvVarZzd.d()) {
            return zzfuvVarZzd;
        }
        Object[] array2 = zzfuvVarZzd.toArray();
        return f(array2.length, array2);
    }

    public static zzfuv zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return auxFixed.A;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfwc.a(length, objArr2);
        return f(length, objArr2);
    }

    public static zzfuv zzo() {
        return auxFixed.A;
    }

    public static zzfuv zzp(Object obj) {
        Object[] objArr = {obj};
        zzfwc.a(1, objArr);
        return f(1, objArr);
    }

    public static zzfuv zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfwc.a(2, objArr);
        return f(2, objArr);
    }

    public static zzfuv zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        zzfwc.a(3, objArr);
        return f(3, objArr);
    }

    public static zzfuv zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfwc.a(5, objArr);
        return f(5, objArr);
    }

    public static zzfuv zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfwc.a(6, objArr);
        return f(6, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public int a(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfsa.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && zzfsa.zza(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    @Deprecated
    public final zzfuv zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    /* JADX INFO: renamed from: zze */
    public final zzfwu iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfuv subList(int i, int i2) {
        zzfsf.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? auxFixed.A : new YKK(this, i, i3);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzfwv listIterator(int i) {
        zzfsf.zzb(i, size(), "index");
        return isEmpty() ? x : new po6(i, this);
    }
}
