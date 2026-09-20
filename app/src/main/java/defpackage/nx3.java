package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nx3 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ bv3.QnHx w;
    public final /* synthetic */ j81<ev3, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nx3(bv3.QnHx qnHx, j81<? super ev3, sd5> j81Var, int i) {
        super(2);
        this.w = qnHx;
        this.x = j81Var;
        this.y = i;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        num.intValue();
        int i = this.y | 1;
        ix3.l(this.w, this.x, g30Var, i);
        return sd5.a;
    }
}
