package defpackage;

import la0.CQf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PRnFixed<B extends la0.CQf, E extends B> implements la0.F1<E> {
    public final j81<la0.CQf, E> w;
    public final la0.F1<?> x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [la0$F1<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [j81<? super la0$CQf, ? extends E extends B>, j81<la0$CQf, E extends B>] */
    public PRnFixed(la0.F1<B> f1, j81<? super la0.CQf, ? extends E> j81Var) {
        this.w = j81Var;
        this.x = f1 instanceof PRnFixed ? (la0.F1<B>) ((PRnFixed) f1).x : f1;
    }
}
