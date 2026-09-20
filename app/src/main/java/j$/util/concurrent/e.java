package j$.util.concurrent;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class e extends AbstractC1464b implements Iterator, j$.util.Iterator {
    e(m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, concurrentHashMap);
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
        m mVar = this.b;
        if (mVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = mVar.b;
        Object obj2 = mVar.c;
        this.j = mVar;
        f();
        return new l(obj, obj2, this.i);
    }
}
