package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zl3 extends cx1 implements x81<g34, ri2<Object>, ri2<Object>> {
    public final /* synthetic */ d34<Object, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl3(f34 f34Var) {
        super(2);
        this.w = f34Var;
    }

    @Override // defpackage.x81
    public final ri2<Object> invoke(g34 g34Var, ri2<Object> ri2Var) {
        g34 g34Var2 = g34Var;
        ri2<Object> ri2Var2 = ri2Var;
        if (!(ri2Var2 instanceof pp4)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
        }
        return ps0.Q(this.w.b(g34Var2, ri2Var2.getValue()), ((pp4) ri2Var2).j());
    }
}
