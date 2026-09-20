package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class oV9 extends NPO {
    public static final ArrayList e0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T f0(T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final <T> int g0(T[] tArr, T t) {
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (ur1.a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> List<T> h0(T[] tArr, Comparator<? super T> comparator) {
        if (!(tArr.length == 0)) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return Arrays.asList(tArr);
    }

    public static final void i0(LinkedHashSet linkedHashSet, Object[] objArr) {
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static final <T> List<T> j0(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new hello(tArr, false)) : Collections.singletonList(tArr[0]);
        }
        return cs0.w;
    }

    public static final ArrayList k0(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
