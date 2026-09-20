package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class aq0<T> implements x94<T>, bq0<T> {
    public final x94<T> a;
    public final int b;

    public static final class QnHx implements Iterator<T>, jv1, j$.util.Iterator {
        public final Iterator<T> w;
        public int x;

        public QnHx(aq0<T> aq0Var) {
            this.w = aq0Var.a.iterator();
            this.x = aq0Var.b;
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
            Iterator<T> it;
            while (true) {
                int i = this.x;
                it = this.w;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.x--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.x;
                it = this.w;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.x--;
            }
            return it.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aq0(x94<? extends T> x94Var, int i) {
        this.a = x94Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.bq0
    public final x94<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new aq0(this, i) : new aq0(this.a, i2);
    }

    @Override // defpackage.x94
    public final Iterator<T> iterator() {
        return new QnHx(this);
    }
}
