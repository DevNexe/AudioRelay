package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class fx1<T> extends AtomicReference<vl0> implements ht2<T>, vl0 {
    public final m70<? super T> w;
    public final m70<? super Throwable> x;
    public final InterfaceC1443fH y;
    public final m70<? super vl0> z;

    public fx1(m70 m70Var, m70 m70Var2, InterfaceC1443fH interfaceC1443fH) {
        m91.byN byn = m91.d;
        this.w = m70Var;
        this.x = m70Var2;
        this.y = interfaceC1443fH;
        this.z = byn;
    }

    @Override // defpackage.vl0
    public final void a() {
        bm0.c(this);
    }

    @Override // defpackage.ht2
    public final void b() {
        if (e()) {
            return;
        }
        lazySet(bm0.DISPOSED);
        try {
            this.y.run();
        } catch (Throwable th) {
            XTd3.w(th);
            m14.b(th);
        }
    }

    @Override // defpackage.ht2
    public final void c(vl0 vl0Var) {
        if (bm0.n(this, vl0Var)) {
            try {
                this.z.accept(this);
            } catch (Throwable th) {
                XTd3.w(th);
                vl0Var.a();
                onError(th);
            }
        }
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return get() == bm0.DISPOSED;
    }

    @Override // defpackage.ht2
    public final void g(T t) {
        if (e()) {
            return;
        }
        try {
            this.w.accept(t);
        } catch (Throwable th) {
            XTd3.w(th);
            get().a();
            onError(th);
        }
    }

    @Override // defpackage.ht2
    public final void onError(Throwable th) {
        if (e()) {
            m14.b(th);
            return;
        }
        lazySet(bm0.DISPOSED);
        try {
            this.x.accept(th);
        } catch (Throwable th2) {
            XTd3.w(th2);
            m14.b(new CompositeException(th, th2));
        }
    }
}
