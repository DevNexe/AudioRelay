package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh extends cx1 implements h81<sd5> {
    public final /* synthetic */ ng2 w;
    public final /* synthetic */ j81<sg, sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gh(ng2 ng2Var, j81<? super sg, sd5> j81Var) {
        super(0);
        this.w = ng2Var;
        this.x = j81Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62 a62Var = a62.a;
        ng2 ng2Var = this.w;
        a62Var.e("changed_mode_to_" + ng2Var.a.w);
        mg mgVar = ng2Var.a;
        a62Var.j("buffer_size_mode", mgVar.w);
        this.x.invoke(new sg.QnHx(mgVar));
        return sd5.a;
    }
}
