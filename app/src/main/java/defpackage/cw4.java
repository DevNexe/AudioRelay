package defpackage;

import j$.lang.Iterable$CC;
import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.AbstractC1616w0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface cw4 {

    public static final class QnHx implements Collection<Object>, jv1, j$.util.Collection {
        public final Set<Object> w = new LinkedHashSet();

        public QnHx(int i) {
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean add(Object obj) {
            return this.w.add(obj);
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final void clear() {
            this.w.clear();
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean contains(Object obj) {
            return this.w.contains(obj);
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean containsAll(Collection<? extends Object> collection) {
            return this.w.containsAll(collection);
        }

        @Override // j$.util.Collection
        public final /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        @Override // java.lang.Iterable
        public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean isEmpty() {
            return this.w.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
        public final Iterator<Object> iterator() {
            return this.w.iterator();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return AbstractC1616w0.v1(AbstractC1514m.s(this), true);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream<Object> parallelStream() {
            return Stream.Wrapper.convert(AbstractC1616w0.v1(AbstractC1514m.s(this), true));
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean remove(Object obj) {
            return this.w.remove(obj);
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.w.remove(collection);
        }

        @Override // j$.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final /* synthetic */ boolean removeIf(java.util.function.Predicate<? super Object> predicate) {
            removeIf(Predicate.VivifiedWrapper.convert(predicate));
            throw null;
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.w.retainAll(collection);
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final int size() {
            return this.w.size();
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
        public final /* synthetic */ Spliterator spliterator() {
            return j$.util.Collection.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final /* synthetic */ java.util.Spliterator spliterator() {
            return Spliterator.Wrapper.convert(j$.util.Collection.CC.$default$spliterator(this));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return AbstractC1616w0.v1(AbstractC1514m.s(this), false);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream<Object> stream() {
            return Stream.Wrapper.convert(AbstractC1616w0.v1(AbstractC1514m.s(this), false));
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final Object[] toArray() {
            return AY.Q(this);
        }

        @Override // j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }

        @Override // java.util.Collection
        public final /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
            return toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).apply(0));
        }

        @Override // java.util.Collection, j$.util.Collection, j$.util.List
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AY.R(this, tArr);
        }
    }

    void a(QnHx qnHx);

    boolean b(Object obj, Object obj2);
}
