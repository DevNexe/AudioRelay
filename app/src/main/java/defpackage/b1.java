package defpackage;

import j$.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ h1 x;
    public final /* synthetic */ e61 y;
    public final /* synthetic */ c54 z;

    public /* synthetic */ b1(h1 h1Var, e61 e61Var, c54 c54Var, int i) {
        this.w = i;
        this.x = h1Var;
        this.y = e61Var;
        this.z = c54Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        Sb1 sb1;
        int i = this.w;
        c54 c54Var = this.z;
        h1 h1Var = this.x;
        e61 e61Var = this.y;
        switch (i) {
            case 0:
                u50 u50Var = (u50) obj;
                s50 s50Var = u50Var.a;
                if (s50Var == null || (sb1 = u50Var.b) == null) {
                    return cx.w;
                }
                vq2<VQko> vq2VarA = h1Var.c.a(((mn2) e61Var.a).c, s50Var.a.c, sb1);
                jG$ jg_ = new jG$(7);
                m91.byN byn = m91.d;
                m91.T23 t23 = m91.c;
                vq2VarA.getClass();
                us2 us2VarB = new hr2(new jr2(vq2VarA, jg_, byn, t23)).B(new D(h1Var, 14));
                dc dcVar = new dc(h1Var, 3);
                us2VarB.getClass();
                return new xs2(new jr2(us2VarB, dcVar, byn, t23), new b1(h1Var, e61Var, c54Var, 1));
            case 1:
                c54 c54Var2 = j54.b;
                ur2 ur2VarA = h1Var.b.a((VQko) obj);
                b1 b1Var = new b1(h1Var, e61Var, c54Var, 2);
                ur2VarA.getClass();
                rx rxVarC = new xs2(ur2VarA, b1Var).c(new rq1(h1Var, 6));
                gq0.QnHx qnHx = gq0.x;
                long jO0 = ps0.o0(100, kq0.MILLISECONDS);
                kq0 kq0Var = kq0.SECONDS;
                return Th.h(rxVarC, jO0, ps0.o0(10, kq0Var), ps0.o0(5, kq0Var), c54Var2);
            default:
                return new ww(new c1(e61Var, h1Var, c54Var, (Optional) obj));
        }
    }
}
