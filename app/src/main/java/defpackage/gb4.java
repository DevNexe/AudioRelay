package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gb4<T> extends dw4<T> implements tK0W.QnHx<Object> {
    public final dw4<T> w;
    public boolean x;
    public tK0W<Object> y;
    public volatile boolean z;

    public gb4(dw4<T> dw4Var) {
        this.w = dw4Var;
    }

    @Override // defpackage.ht2
    public final void b() {
        if (this.z) {
            return;
        }
        synchronized (this) {
            if (this.z) {
                return;
            }
            this.z = true;
            if (!this.x) {
                this.x = true;
                this.w.b();
                return;
            }
            tK0W<Object> tk0w = this.y;
            if (tk0w == null) {
                tk0w = new tK0W<>();
                this.y = tk0w;
            }
            tk0w.b(gq2.COMPLETE);
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        tK0W<Object> tk0w;
        boolean z = true;
        if (!this.z) {
            synchronized (this) {
                if (!this.z) {
                    if (this.x) {
                        tK0W<Object> tk0w2 = this.y;
                        if (tk0w2 == null) {
                            tk0w2 = new tK0W<>();
                            this.y = tk0w2;
                        }
                        tk0w2.b(new gq2.QnHx(vl0Var));
                        return;
                    }
                    this.x = true;
                    z = false;
                }
            }
        }
        if (z) {
            vl0Var.a();
            return;
        }
        this.w.c(vl0Var);
        while (true) {
            synchronized (this) {
                tk0w = this.y;
                if (tk0w == null) {
                    this.x = false;
                    return;
                }
                this.y = null;
            }
            tk0w.c(this);
        }
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        tK0W<Object> tk0w;
        if (this.z) {
            return;
        }
        synchronized (this) {
            if (this.z) {
                return;
            }
            if (this.x) {
                tK0W<Object> tk0w2 = this.y;
                if (tk0w2 == null) {
                    tk0w2 = new tK0W<>();
                    this.y = tk0w2;
                }
                tk0w2.b(t);
                return;
            }
            this.x = true;
            this.w.g(t);
            while (true) {
                synchronized (this) {
                    tk0w = this.y;
                    if (tk0w == null) {
                        this.x = false;
                        return;
                    }
                    this.y = null;
                }
                tk0w.c(this);
            }
        }
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        if (this.z) {
            m14.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.z) {
                    this.z = true;
                    if (this.x) {
                        tK0W<Object> tk0w = this.y;
                        if (tk0w == null) {
                            tk0w = new tK0W<>();
                            this.y = tk0w;
                        }
                        tk0w.a[0] = new gq2.CQf(th);
                        return;
                    }
                    this.x = true;
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

    @Override // tK0W.QnHx, defpackage.pa3
    public final boolean test(Object obj) {
        return gq2.c(this.w, obj);
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(ht2Var);
    }
}
