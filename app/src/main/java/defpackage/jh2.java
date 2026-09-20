package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class jh2<T> implements tk4<T> {
    public final AtomicReference<QnHx<T>> w;
    public final AtomicReference<QnHx<T>> x;

    public static final class QnHx<E> extends AtomicReference<QnHx<E>> {
        public E w;

        public QnHx() {
        }

        public QnHx(E e) {
            this.w = e;
        }
    }

    public jh2() {
        AtomicReference<QnHx<T>> atomicReference = new AtomicReference<>();
        this.w = atomicReference;
        AtomicReference<QnHx<T>> atomicReference2 = new AtomicReference<>();
        this.x = atomicReference2;
        QnHx<T> qnHx = new QnHx<>();
        atomicReference2.lazySet(qnHx);
        atomicReference.getAndSet(qnHx);
    }

    @Override // defpackage.uk4
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // defpackage.uk4
    public final boolean isEmpty() {
        return this.x.get() == this.w.get();
    }

    @Override // defpackage.uk4
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        QnHx<T> qnHx = new QnHx<>(t);
        this.w.getAndSet(qnHx).lazySet(qnHx);
        return true;
    }

    @Override // defpackage.tk4, defpackage.uk4
    public final T poll() {
        QnHx<T> qnHx;
        AtomicReference<QnHx<T>> atomicReference = this.x;
        QnHx<T> qnHx2 = atomicReference.get();
        QnHx<T> qnHx3 = (QnHx) qnHx2.get();
        if (qnHx3 != null) {
            T t = qnHx3.w;
            qnHx3.w = null;
            atomicReference.lazySet(qnHx3);
            return t;
        }
        if (qnHx2 == this.w.get()) {
            return null;
        }
        do {
            qnHx = (QnHx) qnHx2.get();
        } while (qnHx == null);
        T t2 = qnHx.w;
        qnHx.w = null;
        atomicReference.lazySet(qnHx);
        return t2;
    }
}
