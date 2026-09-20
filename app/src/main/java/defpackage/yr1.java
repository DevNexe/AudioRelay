package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr1 {
    public final yy1 a;
    public ri2<rb2> b;
    public rb2 c;

    public yr1(yy1 yy1Var) {
        this.a = yy1Var;
    }

    public final rb2 a() {
        ri2<rb2> ri2VarR = this.b;
        if (ri2VarR == null) {
            rb2 rb2Var = this.c;
            if (rb2Var == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
            ri2VarR = ps0.R(rb2Var);
        }
        this.b = ri2VarR;
        return ri2VarR.getValue();
    }
}
