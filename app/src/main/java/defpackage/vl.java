package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<za3, sd5> w;
    public final /* synthetic */ xa3.LPt8Fixed x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vl(j81<? super za3, sd5> j81Var, xa3.LPt8Fixed lPt8) {
        super(0);
        this.w = j81Var;
        this.x = lPt8;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.invoke(new za3.YKK(new eb3.CQf(this.x.a)));
        return sd5.a;
    }
}
