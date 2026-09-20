package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w05<TResult> {
    public void a(Executor executor, ju2 ju2Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void b(Executor executor, ku2 ku2Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract kc7 c(nu2 nu2Var);

    public abstract kc7 d(Executor executor, nu2 nu2Var);

    public abstract kc7 e(Executor executor, yu2 yu2Var);

    public <TContinuationResult> w05<TContinuationResult> f(Executor executor, a90<TResult, TContinuationResult> a90Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public void g(a90 a90Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public w05 h(ta2 ta2Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> w05<TContinuationResult> i(Executor executor, a90<TResult, w05<TContinuationResult>> a90Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract TResult k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public <TContinuationResult> w05<TContinuationResult> o(uw4<TResult, TContinuationResult> uw4Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> w05<TContinuationResult> p(Executor executor, uw4<TResult, TContinuationResult> uw4Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
