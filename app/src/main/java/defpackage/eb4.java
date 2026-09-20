package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eb4<T> implements ht2<T>, vl0 {
    public volatile boolean A;
    public final ht2<? super T> w;
    public vl0 x;
    public boolean y;
    public tK0W<Object> z;

    public eb4(ht2<? super T> ht2Var) {
        this.w = ht2Var;
    }

    @Override // defpackage.vl0
    public final void a() {
        this.x.a();
    }

    @Override // defpackage.ht2
    public final void b() {
        if (this.A) {
            return;
        }
        synchronized (this) {
            if (this.A) {
                return;
            }
            if (!this.y) {
                this.A = true;
                this.y = true;
                this.w.b();
            } else {
                tK0W<Object> tk0w = this.z;
                if (tk0w == null) {
                    tk0w = new tK0W<>();
                    this.z = tk0w;
                }
                tk0w.b(gq2.COMPLETE);
            }
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        if (bm0.p(this.x, vl0Var)) {
            this.x = vl0Var;
            this.w.c(this);
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.x.e();
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        boolean z;
        Object[] objArr;
        if (this.A) {
            return;
        }
        if (t == null) {
            this.x.a();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.A) {
                return;
            }
            if (this.y) {
                tK0W<Object> tk0w = this.z;
                if (tk0w == null) {
                    tk0w = new tK0W<>();
                    this.z = tk0w;
                }
                tk0w.b(t);
                return;
            }
            this.y = true;
            this.w.g(t);
            do {
                synchronized (this) {
                    tK0W<Object> tk0w2 = this.z;
                    z = false;
                    if (tk0w2 == null) {
                        this.y = false;
                        return;
                    }
                    this.z = null;
                    ht2<? super T> ht2Var = this.w;
                    for (Object[] objArr2 = tk0w2.a; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (gq2.c(ht2Var, objArr)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            } while (!z);
        }
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        if (this.A) {
            m14.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.A) {
                    if (this.y) {
                        this.A = true;
                        tK0W<Object> tk0w = this.z;
                        if (tk0w == null) {
                            tk0w = new tK0W<>();
                            this.z = tk0w;
                        }
                        tk0w.a[0] = new gq2.CQf(th);
                        return;
                    }
                    this.A = true;
                    this.y = true;
                    z = false;
                }
                if (z) {
                    m14.b(th);
                } else {
                    this.w.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
