package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ye4 implements bf4 {
    public final ad4 a;
    public final pq2 b;

    public ye4(ad4 ad4Var, pq2 pq2Var) {
        this.a = ad4Var;
        this.b = pq2Var;
    }

    @Override // defpackage.bf4
    public final boolean a(se4 se4Var) {
        return se4Var.a.b();
    }

    @Override // defpackage.bf4
    public final qw b(se4 se4Var) {
        c54 c54Var = j54.b;
        pq2 pq2Var = this.b;
        us2 us2Var = ((id4) pq2Var.w).a;
        final je4 je4Var = se4Var.a;
        final int i = 0;
        pa3 pa3Var = new pa3() { // from class: jd4
            @Override // defpackage.pa3
            public final boolean test(Object obj) {
                int i2 = i;
                je4 je4Var2 = je4Var;
                switch (i2) {
                    case 0:
                        return ur1.a(je4Var2, ((d33) obj).a);
                    default:
                        return ur1.a(((d33) obj).a, je4Var2);
                }
            }
        };
        us2Var.getClass();
        vq2 vq2VarX = new pr2(us2Var, pa3Var).u(c54Var).B(new Ot0r(c54Var, 17)).x(1L);
        KnU knU = new KnU(23);
        vq2VarX.getClass();
        cs2 cs2Var = new cs2(new cs2(vq2VarX, knU), new D(this, 25));
        gc gcVar = new gc(2, this, se4Var);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        us2 us2Var2 = ((id4) pq2Var.w).a;
        final int i2 = 1;
        pa3 pa3Var2 = new pa3() { // from class: jd4
            @Override // defpackage.pa3
            public final boolean test(Object obj) {
                int i3 = i2;
                je4 je4Var2 = je4Var;
                switch (i3) {
                    case 0:
                        return ur1.a(je4Var2, ((d33) obj).a);
                    default:
                        return ur1.a(((d33) obj).a, je4Var2);
                }
            }
        };
        us2Var2.getClass();
        vq2<R> vq2VarB = new jr2(new cs2(new cs2(new pr2(us2Var2, pa3Var2).u(c54Var), new Ot0r(pq2Var, 18)), new NFo7(this, 27)), new rq1(se4Var, 15), byn, t23).B(new Ot0r(se4Var, 19));
        vq2VarB.getClass();
        return qw.e(ps0.M(new zr2(new jr2(cs2Var, gcVar, byn, t23)), new zr2(vq2VarB)));
    }
}
