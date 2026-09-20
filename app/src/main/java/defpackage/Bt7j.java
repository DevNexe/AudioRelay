package defpackage;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Bt7j<K, V> extends ok4<K, V> implements Map<K, V>, j$.util.Map {
    public xUY0 D;

    public Bt7j() {
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
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.D == null) {
            this.D = new xUY0(this);
        }
        xUY0 xuy0 = this.D;
        if (xuy0.a == null) {
            xuy0.a = new g92.CQf();
        }
        return xuy0.a;
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
    public final Set<K> keySet() {
        if (this.D == null) {
            this.D = new xUY0(this);
        }
        xUY0 xuy0 = this.D;
        if (xuy0.b == null) {
            xuy0.b = new g92.F1();
        }
        return xuy0.b;
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
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.y);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection<V> values() {
        if (this.D == null) {
            this.D = new xUY0(this);
        }
        xUY0 xuy0 = this.D;
        if (xuy0.c == null) {
            xuy0.c = new g92.NUlFixed();
        }
        return xuy0.c;
    }

    public Bt7j(int i) {
        super(i);
    }

    public Bt7j(Bt7j bt7j) {
        super(bt7j);
    }
}
