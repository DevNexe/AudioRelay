package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fb4<T> extends n11<T> {
    public volatile boolean A;
    public final n11<T> x;
    public boolean y;
    public tK0W<Object> z;

    public fb4(rd5 rd5Var) {
        this.x = rd5Var;
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
            this.A = true;
            if (!this.y) {
                this.y = true;
                this.x.b();
                return;
            }
            tK0W<Object> tk0w = this.z;
            if (tk0w == null) {
                tk0w = new tK0W<>();
                this.z = tk0w;
            }
            tk0w.b(gq2.COMPLETE);
        }
    }

    @Override // defpackage.gw4
    public final void d(mw4 mw4Var) {
        boolean z = true;
        if (!this.A) {
            synchronized (this) {
                if (!this.A) {
                    if (this.y) {
                        tK0W<Object> tk0w = this.z;
                        if (tk0w == null) {
                            tk0w = new tK0W<>();
                            this.z = tk0w;
                        }
                        tk0w.b(new gq2.F1(mw4Var));
                        return;
                    }
                    this.y = true;
                    z = false;
                }
            }
        }
        if (z) {
            mw4Var.cancel();
        } else {
            this.x.d(mw4Var);
            i();
        }
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        this.x.a(gw4Var);
    }

    @Override // defpackage.gw4
    public final void g(T t) {
        if (this.A) {
            return;
        }
        synchronized (this) {
            if (this.A) {
                return;
            }
            if (!this.y) {
                this.y = true;
                this.x.g(t);
                i();
            } else {
                tK0W<Object> tk0w = this.z;
                if (tk0w == null) {
                    tk0w = new tK0W<>();
                    this.z = tk0w;
                }
                tk0w.b(t);
            }
        }
    }

    public final void i() {
        tK0W<Object> tk0w;
        while (true) {
            synchronized (this) {
                tk0w = this.z;
                if (tk0w == null) {
                    this.y = false;
                    return;
                }
                this.z = null;
            }
            tk0w.a(this.x);
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
                    this.A = true;
                    if (this.y) {
                        tK0W<Object> tk0w = this.z;
                        if (tk0w == null) {
                            tk0w = new tK0W<>();
                            this.z = tk0w;
                        }
                        tk0w.a[0] = new gq2.CQf(th);
                        return;
                    }
                    this.y = true;
                    z = false;
                }
                if (z) {
                    m14.b(th);
                } else {
                    this.x.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
