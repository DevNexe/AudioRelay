package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vs4<K, V> extends ts4<K, V> implements Iterator<V>, jv1, j$.util.Iterator {
    public vs4(yp4<K, V> yp4Var, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(yp4Var, it);
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
    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.A;
        if (entry == null) {
            throw new IllegalStateException();
        }
        a();
        return entry.getValue();
    }
}
