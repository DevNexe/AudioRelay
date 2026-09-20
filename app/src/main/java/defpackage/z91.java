package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class z91<T> implements x94<T> {
    public final h81<T> a;
    public final j81<T, T> b;

    public static final class QnHx implements Iterator<T>, jv1, j$.util.Iterator {
        public T w;
        public int x = -2;
        public final /* synthetic */ z91<T> y;

        public QnHx(z91<T> z91Var) {
            this.y = z91Var;
        }

        public final void a() {
            int i = this.x;
            z91<T> z91Var = this.y;
            T tInvoke = i == -2 ? z91Var.a.invoke() : z91Var.b.invoke(this.w);
            this.w = tInvoke;
            this.x = tInvoke == null ? 0 : 1;
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
            if (this.x < 0) {
                a();
            }
            return this.x == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.x < 0) {
                a();
            }
            if (this.x == 0) {
                throw new NoSuchElementException();
            }
            T t = this.w;
            this.x = -1;
            return t;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z91(ba4.CQf cQf, j81 j81Var) {
        this.a = cQf;
        this.b = j81Var;
    }

    @Override // defpackage.x94
    public final Iterator<T> iterator() {
        return new QnHx(this);
    }
}
