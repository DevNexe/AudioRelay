package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public class lo<E> extends EQ<sd5> implements jo<E> {
    public final jo<E> y;

    public lo(la0 la0Var, NUlFixed nUl, boolean z, boolean z2) {
        super(la0Var, z, z2);
        this.y = nUl;
    }

    @Override // defpackage.nk3
    public final Object E(z80<? super E> z80Var) {
        return this.y.E(z80Var);
    }

    @Override // defpackage.q94
    public Object H(E e) {
        return this.y.H(e);
    }

    @Override // defpackage.q94
    public final boolean Q() {
        return this.y.Q();
    }

    @Override // defpackage.ss1
    public final void W(CancellationException cancellationException) {
        this.y.m(cancellationException);
        V(cancellationException);
    }

    @Override // defpackage.q94
    public boolean a(Throwable th) {
        return this.y.a(th);
    }

    @Override // defpackage.nk3
    public final Object d(z80<? super ap<? extends E>> z80Var) {
        return this.y.d(z80Var);
    }

    public final lo f() {
        return this;
    }

    @Override // defpackage.nk3
    public final wo<E> iterator() {
        return this.y.iterator();
    }

    @Override // defpackage.ss1, defpackage.ms1
    public final void m(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Y(), null, this);
        }
        W(cancellationException);
    }

    @Override // defpackage.q94
    public Object p(E e, z80<? super sd5> z80Var) {
        return this.y.p(e, z80Var);
    }

    @Override // defpackage.nk3
    public final Object r() {
        return this.y.r();
    }

    @Override // defpackage.q94
    public final void t(pe3.CQf cQf) {
        this.y.t(cQf);
    }
}
