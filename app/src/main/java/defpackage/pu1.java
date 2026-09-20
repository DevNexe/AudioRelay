package defpackage;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@za4(with = qu1.class)
public final class pu1 extends vt1 implements Map<String, vt1>, jv1, j$.util.Map {
    public static final QnHx Companion = new QnHx();
    public final Map<String, vt1> w;

    public static final class CQf extends cx1 implements j81<Map.Entry<? extends String, ? extends vt1>, CharSequence> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final CharSequence invoke(Map.Entry<? extends String, ? extends vt1> entry) {
            Map.Entry<? extends String, ? extends vt1> entry2 = entry;
            String key = entry2.getKey();
            vt1 value = entry2.getValue();
            StringBuilder sb = new StringBuilder();
            uu4.a(key, sb);
            sb.append(':');
            sb.append(value);
            return sb.toString();
        }
    }

    public static final class QnHx {
        public final rv1<pu1> serializer() {
            return qu1.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pu1(Map<String, ? extends vt1> map) {
        this.w = map;
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ vt1 compute(String str, java.util.function.BiFunction<? super String, ? super vt1, ? extends vt1> biFunction) {
        compute(str, BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ vt1 computeIfAbsent(String str, java.util.function.Function<? super String, ? extends vt1> function) {
        computeIfAbsent(str, Function.VivifiedWrapper.convert(function));
        throw null;
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ vt1 computeIfPresent(String str, java.util.function.BiFunction<? super String, ? super vt1, ? extends vt1> biFunction) {
        computeIfPresent(str, BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.w.containsKey((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof vt1)) {
            return false;
        }
        return this.w.containsValue((vt1) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<Map.Entry<String, vt1>> entrySet() {
        return this.w.entrySet();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        return ur1.a(this.w, obj);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer<? super String, ? super vt1> biConsumer) {
        j$.util.Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.w.get((String) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return j$.util.Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return this.w.isEmpty();
    }

    @Override // java.util.Map, j$.util.Map
    public final Set<String> keySet() {
        return this.w.keySet();
    }

    @Override // j$.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ vt1 merge(String str, vt1 vt1Var, java.util.function.BiFunction<? super vt1, ? super vt1, ? extends vt1> biFunction) {
        merge(str, vt1Var, BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(Map<? extends String, ? extends vt1> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction<? super String, ? super vt1, ? extends vt1> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction<? super String, ? super vt1, ? extends vt1> biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
        throw null;
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.w.size();
    }

    public final String toString() {
        return wu.M0(this.w.entrySet(), ",", "{", "}", CQf.w, 24);
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection<vt1> values() {
        return this.w.values();
    }
}
