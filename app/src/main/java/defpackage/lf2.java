package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lf2 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<ev3, sd5> w;
    public final /* synthetic */ qe2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lf2(j81<? super ev3, sd5> j81Var, qe2 qe2Var) {
        super(0);
        this.w = j81Var;
        this.x = qe2Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.invoke(new ev3.NUlFixed(this.x.a));
        return sd5.a;
    }
}
