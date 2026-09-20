package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes3.dex */
public final class oz0<T> extends u54<T> {
    public oz0(z80 z80Var, la0 la0Var) {
        super(z80Var, la0Var);
    }

    @Override // defpackage.ss1
    public final boolean c0(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return V(th);
    }
}
