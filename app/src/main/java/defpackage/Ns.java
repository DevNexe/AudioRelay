package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Ns extends SfnP {
    public final gR2r b;

    public Ns(EWe eWe, gR2r gr2r) {
        super(eWe);
        this.b = gr2r;
    }

    @Override // defpackage.SfnP
    public final fl4 a(Context context) {
        gR2r gr2r = this.b;
        vk4<w1L> vk4VarE = gr2r.e();
        vk4<LpT7Fixed> vk4VarD = gr2r.d();
        kl4 kl4Var = new kl4(gr2r.a.a(), new KnU(1));
        ddf ddfVar = new ddf();
        if (vk4VarE == null) {
            throw new NullPointerException("source1 is null");
        }
        if (vk4VarD != null) {
            return new fl4(new bl4(vk4.m(new m91.F1(ddfVar), vk4VarE, vk4VarD, kl4Var), new jG$(0)), new HqGb(0, this, context));
        }
        throw new NullPointerException("source2 is null");
    }
}
