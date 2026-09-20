package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ gz1.QnHx w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jz1(gz1.QnHx qnHx, x81<? super g30, ? super Integer, sd5> x81Var) {
        super(2);
        this.w = qnHx;
        this.x = x81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            boolean zBooleanValue = ((Boolean) this.w.e.getValue()).booleanValue();
            g30Var2.o(Boolean.valueOf(zBooleanValue));
            boolean zC = g30Var2.c(zBooleanValue);
            if (zBooleanValue) {
                this.x.invoke(g30Var2, 0);
            } else {
                g30Var2.p(zC);
            }
            g30Var2.d();
        }
        return sd5.a;
    }
}
