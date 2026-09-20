package j$.util.concurrent;

import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class i extends AbstractC1464b implements Iterator, Enumeration, j$.util.Iterator {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m[] mVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(mVarArr, i, i2, concurrentHashMap);
        this.k = i3;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.k) {
            case 0:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
            default:
                j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
                break;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                break;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                break;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                m mVar = this.b;
                if (mVar == null) {
                    throw new NoSuchElementException();
                }
                this.j = mVar;
                f();
                return mVar.b;
            default:
                m mVar2 = this.b;
                if (mVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = mVar2.c;
                this.j = mVar2;
                f();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
            case 0:
                break;
            default:
                break;
        }
        return next();
    }
}
