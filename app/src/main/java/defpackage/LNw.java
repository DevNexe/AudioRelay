package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public class LNw<E> extends lo<E> implements tST<E> {
    public LNw(la0 la0Var, NUlFixed nUl, boolean z) {
        super(la0Var, nUl, false, z);
        E0((ms1) la0Var.j(ms1.CQf.w));
    }

    @Override // defpackage.ss1
    public final boolean C0(Throwable th) {
        ps0.K(this.x, th);
        return true;
    }

    @Override // defpackage.ss1
    public final void L0(Throwable th) {
        CancellationException cancellationExceptionB = null;
        if (th != null) {
            cancellationExceptionB = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionB == null) {
                cancellationExceptionB = ps0.b(getClass().getSimpleName().concat(" was cancelled"), th);
            }
        }
        this.y.m(cancellationExceptionB);
    }
}
