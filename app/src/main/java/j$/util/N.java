package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class N implements java.util.Iterator, Consumer {
    boolean a = false;
    Object b;
    final /* synthetic */ Spliterator c;

    N(Spliterator spliterator) {
        this.c = spliterator;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.a = true;
        this.b = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.a(this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
