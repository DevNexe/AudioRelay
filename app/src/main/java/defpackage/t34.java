package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class t34<T> extends AtomicInteger implements oh3<T> {
    public final T w;
    public final gw4<? super T> x;

    /* JADX WARN: Multi-variable type inference failed */
    public t34(Object obj, gw4 gw4Var) {
        this.x = gw4Var;
        this.w = obj;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
        if (qw4.l(j) && compareAndSet(0, 1)) {
            T t = this.w;
            gw4<? super T> gw4Var = this.x;
            gw4Var.g(t);
            if (get() != 2) {
                gw4Var.b();
            }
        }
    }

    @Override // defpackage.mw4
    public final void cancel() {
        lazySet(2);
    }

    @Override // defpackage.uk4
    public final void clear() {
        lazySet(1);
    }

    @Override // defpackage.uk4
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // defpackage.nh3
    public final int l(int i) {
        return i & 1;
    }

    @Override // defpackage.uk4
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.uk4
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.w;
    }
}
