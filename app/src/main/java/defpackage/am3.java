package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class am3 extends cx1 implements j81<ri2<Object>, ri2<Object>> {
    public final /* synthetic */ d34<Object, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(f34 f34Var) {
        super(1);
        this.w = f34Var;
    }

    @Override // defpackage.j81
    public final ri2<Object> invoke(ri2<Object> ri2Var) {
        Object objA;
        ri2<Object> ri2Var2 = ri2Var;
        if (!(ri2Var2 instanceof pp4)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (ri2Var2.getValue() != null) {
            objA = this.w.a(ri2Var2.getValue());
        } else {
            objA = null;
        }
        return ps0.Q(objA, ((pp4) ri2Var2).j());
    }
}
