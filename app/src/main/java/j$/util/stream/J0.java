package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class J0 implements F0 {
    private final Collection a;

    J0(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.F0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.F0
    public final void e(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.F0
    public final void forEach(Consumer consumer) {
        AbstractC1514m.q(this.a, consumer);
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // j$.util.stream.F0
    public final Object[] o(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 q(long j, long j2, IntFunction intFunction) {
        return AbstractC1616w0.I0(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.F0
    public final Spliterator spliterator() {
        Collection collection = this.a;
        return (collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).stream() : AbstractC1616w0.v1(AbstractC1514m.s(collection), false)).spliterator();
    }

    public final String toString() {
        Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
