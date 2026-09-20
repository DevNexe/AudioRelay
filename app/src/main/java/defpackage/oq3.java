package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oq3 implements vc4 {
    public final ad4 a;
    public final c2 b;

    public oq3(ad4 ad4Var) {
        this.a = ad4Var;
        gq0.QnHx qnHx = gq0.x;
        this.b = new c2(ps0.o0(5, kq0.MINUTES));
    }

    @Override // defpackage.vc4
    public final qw a(xe4 xe4Var) {
        return !xe4Var.b.r0() ? cx.w : new fx(new ec2(2, xe4Var, this));
    }
}
