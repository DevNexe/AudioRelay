package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj2 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<ej2, sd5> w;
    public final /* synthetic */ uj2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nj2(j81<? super ej2, sd5> j81Var, uj2 uj2Var) {
        super(0);
        this.w = j81Var;
        this.x = uj2Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.invoke(new ej2.F1(this.x));
        return sd5.a;
    }
}
