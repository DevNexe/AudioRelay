package j$.util.concurrent;

import j$.util.AbstractC1514m;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.AbstractC1616w0;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends c implements Set, Collection {
    private static final long serialVersionUID = 7249069246763182397L;

    j(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.List
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.List
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.c, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.List
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        m[] mVarArr = this.a.a;
        if (mVarArr == null) {
            return;
        }
        q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
        while (true) {
            m mVarF = qVar.f();
            if (mVarF == null) {
                return;
            } else {
                consumer.p(mVarF.b);
            }
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.List
    public final int hashCode() {
        Object it = iterator();
        int iHashCode = 0;
        while (((AbstractC1464b) it).hasNext()) {
            iHashCode += ((i) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // j$.util.concurrent.c, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        m[] mVarArr = concurrentHashMap.a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new i(mVarArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return AbstractC1616w0.v1(AbstractC1514m.s(this), true);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(AbstractC1616w0.v1(AbstractC1514m.s(this), true));
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.List
    public final boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection.CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.util.List
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long jL = concurrentHashMap.l();
        m[] mVarArr = concurrentHashMap.a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new k(mVarArr, length, 0, length, jL >= 0 ? jL : 0L, 0);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return AbstractC1616w0.v1(AbstractC1514m.s(this), false);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(AbstractC1616w0.v1(AbstractC1514m.s(this), false));
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
    }
}
