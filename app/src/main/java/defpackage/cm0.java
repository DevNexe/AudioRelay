package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cm0<T> implements ht2<T>, vl0 {
    public final ht2<? super T> w;
    public final m70<? super vl0> x;
    public final InterfaceC1443fH y;
    public vl0 z;

    public cm0(ht2<? super T> ht2Var, m70<? super vl0> m70Var, InterfaceC1443fH interfaceC1443fH) {
        this.w = ht2Var;
        this.x = m70Var;
        this.y = interfaceC1443fH;
    }

    @Override // defpackage.vl0
    public final void a() {
        vl0 vl0Var = this.z;
        bm0 bm0Var = bm0.DISPOSED;
        if (vl0Var != bm0Var) {
            this.z = bm0Var;
            try {
                this.y.run();
            } catch (Throwable th) {
                XTd3.w(th);
                m14.b(th);
            }
            vl0Var.a();
        }
    }

    @Override // defpackage.ht2
    public final void b() {
        vl0 vl0Var = this.z;
        bm0 bm0Var = bm0.DISPOSED;
        if (vl0Var != bm0Var) {
            this.z = bm0Var;
            this.w.b();
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        ht2<? super T> ht2Var = this.w;
        try {
            this.x.accept(vl0Var);
            if (bm0.p(this.z, vl0Var)) {
                this.z = vl0Var;
                ht2Var.c(this);
            }
        } catch (Throwable th) {
            XTd3.w(th);
            vl0Var.a();
            this.z = bm0.DISPOSED;
            ht2Var.c(yr0.INSTANCE);
            ht2Var.onError(th);
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return this.z.e();
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        this.w.g(t);
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        vl0 vl0Var = this.z;
        bm0 bm0Var = bm0.DISPOSED;
        if (vl0Var == bm0Var) {
            m14.b(th);
        } else {
            this.z = bm0Var;
            this.w.onError(th);
        }
    }
}
