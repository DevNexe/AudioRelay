package defpackage;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tc7 implements Map, Serializable, j$.util.Map {

    @CheckForNull
    public transient et5 w;

    @CheckForNull
    public transient tt5 x;

    @CheckForNull
    public transient iu5 y;

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        iu5 iu5Var = this.y;
        if (iu5Var == null) {
            bv5 bv5Var = (bv5) this;
            iu5 iu5Var2 = new iu5(1, bv5Var.B, bv5Var.A);
            this.y = iu5Var2;
            iu5Var = iu5Var2;
        }
        return iu5Var.contains(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        et5 et5Var = this.w;
        if (et5Var != null) {
            return et5Var;
        }
        bv5 bv5Var = (bv5) this;
        et5 et5Var2 = new et5(bv5Var, bv5Var.A, bv5Var.B);
        this.w = et5Var2;
        return et5Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((ed7) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        et5 et5Var = this.w;
        if (et5Var == null) {
            bv5 bv5Var = (bv5) this;
            et5 et5Var2 = new et5(bv5Var, bv5Var.A, bv5Var.B);
            this.w = et5Var2;
            et5Var = et5Var2;
        }
        Iterator it = et5Var.iterator();
        int iHashCode = 0;
        while (true) {
            ra7 ra7Var = (ra7) it;
            if (!ra7Var.hasNext()) {
                return iHashCode;
            }
            Object next = ra7Var.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return ((bv5) this).B == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        tt5 tt5Var = this.x;
        if (tt5Var != null) {
            return tt5Var;
        }
        bv5 bv5Var = (bv5) this;
        tt5 tt5Var2 = new tt5(bv5Var, new iu5(0, bv5Var.B, bv5Var.A));
        this.x = tt5Var2;
        return tt5Var2;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final String toString() {
        int i = ((bv5) this).B;
        if (i < 0) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("size cannot be negative but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry entry : (et5) entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        iu5 iu5Var = this.y;
        if (iu5Var != null) {
            return iu5Var;
        }
        bv5 bv5Var = (bv5) this;
        iu5 iu5Var2 = new iu5(1, bv5Var.B, bv5Var.A);
        this.y = iu5Var2;
        return iu5Var2;
    }
}
