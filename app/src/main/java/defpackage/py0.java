package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class py0<T, R, E> implements x94<E> {
    public final x94<T> a;
    public final j81<T, R> b;
    public final j81<R, Iterator<E>> c;

    public static final class QnHx implements Iterator<E>, jv1, j$.util.Iterator {
        public final Iterator<T> w;
        public Iterator<? extends E> x;
        public final /* synthetic */ py0<T, R, E> y;

        public QnHx(py0<T, R, E> py0Var) {
            this.y = py0Var;
            this.w = py0Var.a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.x;
            if ((it == null || it.hasNext()) ? false : true) {
                this.x = null;
            }
            while (this.x == null) {
                Iterator<T> it2 = this.w;
                if (!it2.hasNext()) {
                    return false;
                }
                T next = it2.next();
                py0<T, R, E> py0Var = this.y;
                Iterator<? extends E> it3 = (Iterator) py0Var.c.invoke(py0Var.b.invoke(next));
                if (it3.hasNext()) {
                    this.x = it3;
                    break;
                }
            }
            return true;
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
            return a();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final E next() {
            if (a()) {
                return this.x.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public py0(x94<? extends T> x94Var, j81<? super T, ? extends R> j81Var, j81<? super R, ? extends Iterator<? extends E>> j81Var2) {
        this.a = x94Var;
        this.b = j81Var;
        this.c = j81Var2;
    }

    @Override // defpackage.x94
    public final Iterator<E> iterator() {
        return new QnHx(this);
    }
}
