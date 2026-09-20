package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ss4<K, V> extends ts4<K, V> implements Iterator<Map.Entry<K, V>>, jv1, j$.util.Iterator {
    public ss4(yp4<K, V> yp4Var, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
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
    public final Object next() {
        a();
        if (this.z != null) {
            return new rs4(this);
        }
        throw new IllegalStateException();
    }
}
