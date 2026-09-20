package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends cx1 implements h81<sd5> {
    public final /* synthetic */ wv2 w;
    public final /* synthetic */ QsF6 x;
    public final /* synthetic */ j81<wXc, sd5> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(wv2 wv2Var, QsF6 qsF6, j81<? super wXc, sd5> j81Var) {
        super(0);
        this.w = wv2Var;
        this.x = qsF6;
        this.y = j81Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        wv2 wv2Var = this.w;
        boolean z = wv2Var.b;
        j81<wXc, sd5> j81Var = this.y;
        if (!z || ur1.a(this.x.d, Boolean.TRUE)) {
            j81Var.invoke(new wXc.QnHx(wv2Var));
        } else {
            j81Var.invoke(new wXc.NUlFixed("bitrate_" + wv2Var.a));
        }
        return sd5.a;
    }
}
