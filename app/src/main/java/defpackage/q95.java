package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class q95<T, R> implements x94<R> {
    public final x94<T> a;
    public final j81<T, R> b;

    public static final class QnHx implements Iterator<R>, jv1, j$.util.Iterator {
        public final Iterator<T> w;
        public final /* synthetic */ q95<T, R> x;

        public QnHx(q95<T, R> q95Var) {
            this.x = q95Var;
            this.w = q95Var.a.iterator();
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
            return this.w.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final R next() {
            return (R) this.x.b.invoke(this.w.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q95(x94<? extends T> x94Var, j81<? super T, ? extends R> j81Var) {
        this.a = x94Var;
        this.b = j81Var;
    }

    @Override // defpackage.x94
    public final Iterator<R> iterator() {
        return new QnHx(this);
    }
}
