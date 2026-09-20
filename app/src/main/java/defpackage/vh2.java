package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vh2 implements hc4 {
    public final ld4 a;

    public vh2(ld4 ld4Var) {
        this.a = ld4Var;
    }

    @Override // defpackage.hc4
    public final cs2 a(c54 c54Var) {
        cs2 cs2VarA = this.a.a(c54Var);
        KnU knU = new KnU(20);
        cs2VarA.getClass();
        return new cs2(cs2VarA, knU);
    }

    @Override // defpackage.hc4
    public final vq2<List<jg4>> b(vq2<List<je4>> vq2Var) {
        Acr acr = new Acr(19);
        vq2Var.getClass();
        return new hr2(new cs2(vq2Var, acr)).B(new Ot0r(vq2Var, 16));
    }
}
