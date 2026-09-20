package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a13<K, V> extends AbstractMap<Object, Object> implements mv1, Map {
    public int A;
    public int B;
    public y03<K, V> w;
    public su4 x = new su4();
    public db5<K, V> y;
    public V z;

    public a13(y03<K, V> y03Var) {
        this.w = y03Var;
        this.y = y03Var.w;
        this.B = y03Var.x;
    }

    public final y03<K, V> a() {
        db5<K, V> db5Var = this.y;
        y03<K, V> y03Var = this.w;
        if (db5Var != y03Var.w) {
            this.x = new su4();
            y03Var = new y03<>(this.y, this.B);
        }
        this.w = y03Var;
        return y03Var;
    }

    public final void b(int i) {
        this.B = i;
        this.A++;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void clear() {
        this.y = db5.e;
        b(0);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return this.y.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<java.util.Map.Entry<Object, Object>> entrySet() {
        return new c13(this);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V get(Object obj) {
        return (V) this.y.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<Object> keySet() {
        return new e13(this);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V put(K k, V v) {
        this.z = null;
        this.y = this.y.l(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        y03<K, V> y03VarA = null;
        y03<K, V> y03Var = map instanceof y03 ? (y03) map : null;
        if (y03Var == null) {
            a13 a13Var = map instanceof a13 ? (a13) map : null;
            if (a13Var != null) {
                y03VarA = a13Var.a();
            }
        } else {
            y03VarA = y03Var;
        }
        if (y03VarA == null) {
            super.putAll(map);
            return;
        }
        gj0 gj0Var = new gj0(0);
        int i = this.B;
        this.y = this.y.m(y03VarA.w, 0, gj0Var, this);
        int i2 = (y03VarA.x + i) - gj0Var.a;
        if (i != i2) {
            b(i2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.B;
        db5<K, V> db5VarO = this.y.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (db5VarO == null) {
            db5VarO = db5.e;
        }
        this.y = db5VarO;
        return i != this.B;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int size() {
        return this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Collection<Object> values() {
        return new g13(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V remove(Object obj) {
        this.z = null;
        db5<K, V> db5VarN = this.y.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (db5VarN == null) {
            db5VarN = db5.e;
        }
        this.y = db5VarN;
        return this.z;
    }
}
