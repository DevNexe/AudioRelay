package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a63 implements fd2 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public a63(op2 op2Var) {
        this.b = op2Var;
    }

    @Override // defpackage.fd2
    public final Object a(ad2 ad2Var, md2.QnHx qnHx) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (ad2Var.u0()) {
                    yf3 yf3VarS = ad2Var.h0().S();
                    ((c63) obj).a(new b63.CQf(new Sb1(yf3VarS.z, yf3VarS.A, yf3VarS.B)));
                }
                break;
            default:
                if (ad2Var.o0()) {
                    np2 np2VarA0 = ad2Var.a0();
                    if (((op2) obj).a(new mp2(np2VarA0.U(), np2VarA0.V(), np2VarA0.S(), np2VarA0.T(), np2VarA0.D))) {
                        a62.a.h("notice", "received_notice", np2VarA0.U());
                    }
                } else if (ad2Var.m0()) {
                    hl0 hl0VarW = ad2Var.W();
                    if (((op2) obj).b(hl0VarW.S())) {
                        a62.a.h("notice", "received_notice_dismiss", hl0VarW.S());
                    }
                }
                break;
        }
        return sd5.a;
    }

    public a63(c63 c63Var) {
        this.b = c63Var;
    }
}
