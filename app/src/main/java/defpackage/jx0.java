package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class jx0<T> implements x94<T> {
    public final x94<T> a;
    public final boolean b;
    public final j81<T, Boolean> c;

    public static final class QnHx implements Iterator<T>, jv1, j$.util.Iterator {
        public final Iterator<T> w;
        public int x = -1;
        public T y;
        public final /* synthetic */ jx0<T> z;

        public QnHx(jx0<T> jx0Var) {
            this.z = jx0Var;
            this.w = jx0Var.a.iterator();
        }

        public final void a() {
            T next;
            jx0<T> jx0Var;
            do {
                Iterator<T> it = this.w;
                if (!it.hasNext()) {
                    this.x = 0;
                    return;
                } else {
                    next = it.next();
                    jx0Var = this.z;
                }
            } while (jx0Var.c.invoke(next).booleanValue() != jx0Var.b);
            this.y = next;
            this.x = 1;
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
            if (this.x == -1) {
                a();
            }
            return this.x == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            if (this.x == -1) {
                a();
            }
            if (this.x == 0) {
                throw new NoSuchElementException();
            }
            T t = this.y;
            this.y = null;
            this.x = -1;
            return t;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jx0(x94<? extends T> x94Var, boolean z, j81<? super T, Boolean> j81Var) {
        this.a = x94Var;
        this.b = z;
        this.c = j81Var;
    }

    @Override // defpackage.x94
    public final Iterator<T> iterator() {
        return new QnHx(this);
    }
}
