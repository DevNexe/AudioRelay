package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends cx1 implements h81<sd5> {
    public final /* synthetic */ QsF6 w;
    public final /* synthetic */ j81<wXc, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(QsF6 qsF6, j81<? super wXc, sd5> j81Var) {
        super(0);
        this.w = qsF6;
        this.x = j81Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        boolean zA = ur1.a(this.w.d, Boolean.TRUE);
        j81<wXc, sd5> j81Var = this.x;
        if (zA) {
            j81Var.invoke(new wXc.CQf(bLBI.Uncompressed));
        } else {
            j81Var.invoke(new wXc.NUlFixed("uncompressed"));
        }
        return sd5.a;
    }
}
