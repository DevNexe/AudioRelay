package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfvb {
    public static void a(List list, zzfsg zzfsgVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfsgVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static boolean zza(Iterable iterable, zzfsg zzfsgVar) {
        boolean z = false;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            zzfsgVar.getClass();
            while (it.hasNext()) {
                if (zzfsgVar.zza(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        List list = (List) iterable;
        zzfsgVar.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfsgVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        a(list, zzfsgVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        a(list, zzfsgVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
