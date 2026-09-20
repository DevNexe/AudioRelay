package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class de4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<qd4, sd5> w;
    public final /* synthetic */ jf4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public de4(j81<? super qd4, sd5> j81Var, jf4 jf4Var) {
        super(0);
        this.w = j81Var;
        this.x = jf4Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.invoke(new qd4.QnHx(this.x));
        return sd5.a;
    }
}
