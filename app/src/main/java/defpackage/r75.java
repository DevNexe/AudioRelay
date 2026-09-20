package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r75 implements hc4 {
    public final xb1 a;
    public final ld4 b;

    public r75(xb1 xb1Var, ld4 ld4Var) {
        this.a = xb1Var;
        this.b = ld4Var;
    }

    @Override // defpackage.hc4
    public final cs2 a(c54 c54Var) {
        cs2 cs2VarB = this.b.b(c54Var);
        KnU knU = new KnU(21);
        cs2VarB.getClass();
        return new cs2(cs2VarB, knU);
    }

    @Override // defpackage.hc4
    public final vq2<List<jg4>> b(vq2<List<je4>> vq2Var) {
        return vq2.k(this.a.a().j(), vq2Var, new la(2)).B(new k71(24));
    }
}
