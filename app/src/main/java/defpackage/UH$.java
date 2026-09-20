package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class UH$ extends cx1 implements j81<MW, MW> {
    public final /* synthetic */ x8W.LPt8Fixed w;
    public final /* synthetic */ rv2<V> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UH$(x8W.LPt8Fixed lPt8, rv2<V> rv2Var) {
        super(1);
        this.w = lPt8;
        this.x = rv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final MW invoke(MW mw) {
        MW mw2 = mw;
        int iOrdinal = this.w.b.ordinal();
        rv2<V> rv2Var = this.x;
        if (iOrdinal == 0) {
            return MW.a(mw2, 0L, (V) ((mq4) rv2Var).a, 2, mw2.c == 5, 9);
        }
        if (iOrdinal == 1) {
            return MW.a(mw2, 0L, (V) ((mq4) rv2Var).a, 5, false, 9);
        }
        throw new NoWhenBranchMatchedException();
    }
}
