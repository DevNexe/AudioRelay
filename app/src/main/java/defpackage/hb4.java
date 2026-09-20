package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hb4<T> implements v11<T>, mw4 {
    public volatile boolean A;
    public final gw4<? super T> w;
    public mw4 x;
    public boolean y;
    public tK0W<Object> z;

    public hb4(gw4<? super T> gw4Var) {
        this.w = gw4Var;
    }

    @Override // defpackage.mw4
    public final void a(long j) {
        this.x.a(j);
    }

    @Override // defpackage.gw4
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

    @Override // defpackage.mw4
    public final void cancel() {
        this.x.cancel();
    }

    @Override // defpackage.v11, defpackage.gw4
    public final void d(mw4 mw4Var) {
        if (qw4.m(this.x, mw4Var)) {
            this.x = mw4Var;
            this.w.d(this);
        }
    }

    @Override // defpackage.gw4
    public final void g(T t) {
        tK0W<Object> tk0w;
        if (this.A) {
            return;
        }
        if (t == null) {
            this.x.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.A) {
                return;
            }
            if (this.y) {
                tK0W<Object> tk0w2 = this.z;
                if (tk0w2 == null) {
                    tk0w2 = new tK0W<>();
                    this.z = tk0w2;
                }
                tk0w2.b(t);
                return;
            }
            this.y = true;
            this.w.g(t);
            do {
                synchronized (this) {
                    tk0w = this.z;
                    if (tk0w == null) {
                        this.y = false;
                        return;
                    }
                    this.z = null;
                }
            } while (!tk0w.a(this.w));
        }
    }

    @Override // defpackage.gw4
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
