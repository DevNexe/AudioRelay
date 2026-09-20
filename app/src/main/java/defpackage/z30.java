package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z30 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ gh2<Object> w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z30(gh2<Object> gh2Var, Object obj) {
        super(2);
        this.w = gh2Var;
        this.x = obj;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
            return sd5.a;
        }
        this.w.getClass();
        throw null;
    }
}
