package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class pi0<T> extends d9<T> {
    public final ht2<? super T> w;
    public T x;

    public pi0(ht2<? super T> ht2Var) {
        this.w = ht2Var;
    }

    public void a() {
        set(4);
        this.x = null;
    }

    @Override // defpackage.uk4
    public final void clear() {
        lazySet(32);
        this.x = null;
    }

    public final void d(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        ht2<? super T> ht2Var = this.w;
        if (i == 8) {
            this.x = t;
            lazySet(16);
            ht2Var.g(null);
        } else {
            lazySet(2);
            ht2Var.g(t);
        }
        if (get() != 4) {
            ht2Var.b();
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return get() == 4;
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
        T t = this.x;
        this.x = null;
        lazySet(32);
        return t;
    }
}
