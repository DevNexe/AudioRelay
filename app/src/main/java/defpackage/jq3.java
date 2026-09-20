package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class jq3<T> implements ml4<T> {
    public final AtomicReference<vl0> w;
    public final ml4<? super T> x;

    public jq3(AtomicReference<vl0> atomicReference, ml4<? super T> ml4Var) {
        this.w = atomicReference;
        this.x = ml4Var;
    }

    @Override // defpackage.ml4
    public final void c(vl0 vl0Var) {
        bm0.g(this.w, vl0Var);
    }

    @Override // defpackage.ml4
    public final void onError(Throwable th) {
        this.x.onError(th);
    }

    @Override // defpackage.ml4
    public final void onSuccess(T t) {
        this.x.onSuccess(t);
    }
}
