package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends cx1 implements j81<r7, r7> {
    public final /* synthetic */ b7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(b7 b7Var) {
        super(1);
        this.w = b7Var;
    }

    @Override // defpackage.j81
    public final r7 invoke(r7 r7Var) {
        r7 r7Var2 = r7Var;
        b7 b7Var = this.w;
        s42 s42VarA = b7Var.a();
        b7.WE we = (b7.WE) b7Var;
        return new r7(r7Var2.a, r7Var2.b, r7Var2.c, r7Var2.d, we.f, we.g, s42VarA);
    }
}
