package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class qi0<T> extends e9<T> {
    public final gw4<? super T> w;
    public T x;

    public qi0(gw4<? super T> gw4Var) {
        this.w = gw4Var;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
        T t;
        if (qw4.l(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.x) == null) {
                        return;
                    }
                    this.x = null;
                    gw4<? super T> gw4Var = this.w;
                    gw4Var.g(t);
                    if (get() != 4) {
                        gw4Var.b();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // defpackage.uk4
    public final void clear() {
        lazySet(32);
        this.x = null;
    }

    public final void e(T t) {
        int i = get();
        do {
            gw4<? super T> gw4Var = this.w;
            if (i == 8) {
                this.x = t;
                lazySet(16);
                gw4Var.g(t);
                if (get() != 4) {
                    gw4Var.b();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                gw4Var.g(t);
                if (get() != 4) {
                    gw4Var.b();
                    return;
                }
                return;
            }
            this.x = t;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.x = null;
    }

    @Override // defpackage.uk4
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.nh3
    public final int l(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // defpackage.uk4
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.x;
        this.x = null;
        return t;
    }
}
