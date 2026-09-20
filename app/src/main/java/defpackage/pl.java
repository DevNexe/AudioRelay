package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pl extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<za3, sd5> w;
    public final /* synthetic */ xa3.QnHx x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pl(j81<? super za3, sd5> j81Var, xa3.QnHx qnHx) {
        super(0);
        this.w = j81Var;
        this.x = qnHx;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        xa3.QnHx qnHx = this.x;
        this.w.invoke(new za3.YKK(new eb3.QnHx(qnHx.a, qnHx.b)));
        return sd5.a;
    }
}
