package com.google.android.gms.internal.ads;

import defpackage.mp6;
import defpackage.np6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfwq {
    public static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean b(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean c(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfwa) {
            collection = ((zzfwa) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfsg zzfsgVar) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof mp6) {
                mp6 mp6Var = (mp6) set;
                return new mp6(mp6Var.w, zzfsj.zza(mp6Var.x, zzfsgVar));
            }
            set.getClass();
            zzfsgVar.getClass();
            return new mp6(set, zzfsgVar);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof mp6) {
            mp6 mp6Var2 = (mp6) sortedSet;
            return new np6((SortedSet) mp6Var2.w, zzfsj.zza(mp6Var2.x, zzfsgVar));
        }
        sortedSet.getClass();
        zzfsgVar.getClass();
        return new np6(sortedSet, zzfsgVar);
    }
}
