package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 extends cx1 implements j81<b43.QnHx, sd5> {
    public final /* synthetic */ b43 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr1(b43 b43Var) {
        super(1);
        this.w = b43Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(b43.QnHx qnHx) {
        b43.QnHx qnHx2 = qnHx;
        long j = mp1.b;
        b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
        jy1 jy1VarA = qnHx2.a();
        jy1 jy1Var = jy1.Ltr;
        b43 b43Var = this.w;
        if (jy1VarA == jy1Var || qnHx2.b() == 0) {
            long jG0 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (j >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(j)), 0.0f, null);
        } else {
            long jD = C0239D.d((qnHx2.b() - ((int) (b43Var.y >> 32))) - ((int) (j >> 32)), mp1.a(j));
            long jG1 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (jD >> 32)) + ((int) (jG1 >> 32)), mp1.a(jG1) + mp1.a(jD)), 0.0f, null);
        }
        return sd5.a;
    }
}
