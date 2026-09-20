package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s45 extends cx1 implements y81<vb2, ob2, g70, sb2> {
    public final /* synthetic */ q45 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s45(q45 q45Var) {
        super(3);
        this.w = q45Var;
    }

    @Override // defpackage.y81
    public final sb2 invoke(vb2 vb2Var, ob2 ob2Var, g70 g70Var) {
        long j = g70Var.a;
        wo1.QnHx qnHx = wo1.a;
        long j2 = this.w.f;
        b43 b43VarY = ob2Var.y(g70.a(j, AY.o((int) (j2 >> 32), g70.j(j), g70.h(j)), 0, AY.o(sp1.b(j2), g70.i(j), g70.g(j)), 0, 10));
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new r45(b43VarY));
    }
}
