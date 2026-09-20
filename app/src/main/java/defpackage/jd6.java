package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class jd6<TResult, TContinuationResult> implements q97<TResult> {
    public final Executor w;
    public final a90<TResult, TContinuationResult> x;
    public final kc7<TContinuationResult> y;

    public jd6(Executor executor, a90<TResult, TContinuationResult> a90Var, kc7<TContinuationResult> kc7Var) {
        this.w = executor;
        this.x = a90Var;
        this.y = kc7Var;
    }

    @Override // defpackage.q97
    public final void a(w05<TResult> w05Var) {
        this.w.execute(new tb7(this, w05Var, 15));
    }
}
