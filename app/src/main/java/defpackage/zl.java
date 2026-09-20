package defpackage;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zl extends AtomicReference<vl0> implements nx, vl0, m70<Throwable> {
    public final m70<? super Throwable> w;
    public final InterfaceC1443fH x;

    public zl(InterfaceC1443fH interfaceC1443fH) {
        this.w = this;
        this.x = interfaceC1443fH;
    }

    @Override // defpackage.vl0
    public final void a() {
        bm0.c(this);
    }

    @Override // defpackage.m70
    public final void accept(Throwable th) {
        m14.b(new OnErrorNotImplementedException(th));
    }

    @Override // defpackage.nx
    public final void b() {
        try {
            this.x.run();
        } catch (Throwable th) {
            XTd3.w(th);
            m14.b(th);
        }
        lazySet(bm0.DISPOSED);
    }

    @Override // defpackage.nx
    public final void c(vl0 vl0Var) {
        bm0.n(this, vl0Var);
    }

    @Override // defpackage.vl0
    public final boolean e() {
        return get() == bm0.DISPOSED;
    }

    @Override // defpackage.nx
    public final void onError(Throwable th) {
        try {
            this.w.accept(th);
        } catch (Throwable th2) {
            XTd3.w(th2);
            m14.b(th2);
        }
        lazySet(bm0.DISPOSED);
    }

    public zl(InterfaceC1443fH interfaceC1443fH, m70 m70Var) {
        this.w = m70Var;
        this.x = interfaceC1443fH;
    }
}
