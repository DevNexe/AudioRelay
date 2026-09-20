package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ys0 extends cx1 implements y81<t95.CQf<ts0>, g30, Integer, lx0<Float>> {
    public final /* synthetic */ kt0 w;
    public final /* synthetic */ lv0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(kt0 kt0Var, lv0 lv0Var) {
        super(3);
        this.w = kt0Var;
        this.x = lv0Var;
    }

    @Override // defpackage.y81
    public final lx0<Float> invoke(t95.CQf<ts0> cQf, g30 g30Var, Integer num) {
        lx0<Float> lx0Var;
        mw0 mw0Var;
        t95.CQf<ts0> cQf2 = cQf;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-57153604);
        ts0 ts0Var = ts0.PreEnter;
        ts0 ts0Var2 = ts0.Visible;
        if (cQf2.b(ts0Var, ts0Var2)) {
            mw0 mw0Var2 = this.w.a().a;
            if (mw0Var2 == null || (lx0Var = mw0Var2.b) == null) {
                lx0Var = us0.c;
            }
        } else if (!cQf2.b(ts0Var2, ts0.PostExit) || (mw0Var = this.x.a().a) == null || (lx0Var = mw0Var.b) == null) {
            lx0Var = us0.c;
        }
        g30Var2.G();
        return lx0Var;
    }
}
