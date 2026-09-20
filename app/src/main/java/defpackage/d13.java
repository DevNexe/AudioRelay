package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d13<K, V> implements Iterator<Map.Entry<K, V>>, jv1, j$.util.Iterator {
    public final b13<K, V, Map.Entry<K, V>> w;

    public d13(a13<K, V> a13Var) {
        eb5[] eb5VarArr = new eb5[8];
        for (int i = 0; i < 8; i++) {
            eb5VarArr[i] = new hb5(this);
        }
        this.w = new b13<>(a13Var, eb5VarArr);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.w.y;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return this.w.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.w.remove();
    }
}
