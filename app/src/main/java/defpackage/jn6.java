package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public class jn6 extends cp6 {
    public final transient Map y;
    public final /* synthetic */ xn6 z;

    public jn6(xn6 xn6Var, Map map) {
        this.z = xn6Var;
        this.y = map;
    }

    public final oo6 a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        hp6 hp6Var = (hp6) this.z;
        hp6Var.getClass();
        List list = (List) collection;
        return new oo6(key, list instanceof RandomAccess ? new pn6(hp6Var, key, list, null) : new wn6(hp6Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        xn6 xn6Var = this.z;
        if (this.y == xn6Var.z) {
            xn6Var.zzr();
            return;
        }
        in6 in6Var = new in6(this);
        while (in6Var.hasNext()) {
            in6Var.next();
            in6Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.y;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.y.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Map map = this.y;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        hp6 hp6Var = (hp6) this.z;
        hp6Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new pn6(hp6Var, obj, list, null) : new wn6(hp6Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.y.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        mn6 rn6Var;
        xn6 xn6Var = this.z;
        mn6 mn6Var = xn6Var.w;
        if (mn6Var == null) {
            hp6 hp6Var = (hp6) xn6Var;
            Map map = hp6Var.z;
            if (map instanceof NavigableMap) {
                rn6Var = new on6(hp6Var, (NavigableMap) map);
            } else {
                rn6Var = map instanceof SortedMap ? new rn6(hp6Var, (SortedMap) map) : new mn6(hp6Var, map);
            }
            mn6Var = rn6Var;
            xn6Var.w = mn6Var;
        }
        return mn6Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* synthetic */ Object remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.y.remove(obj);
        if (collection == null) {
            return null;
        }
        xn6 xn6Var = this.z;
        ?? Zza = ((hp6) xn6Var).B.zza();
        Zza.addAll(collection);
        xn6Var.A -= collection.size();
        collection.clear();
        return Zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.y.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.y.toString();
    }
}
