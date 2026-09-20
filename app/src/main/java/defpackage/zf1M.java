package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zf1M extends cx1 implements j81<b43.QnHx, sd5> {
    public final /* synthetic */ b43 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1M(int i, b43 b43Var) {
        super(1);
        this.w = b43Var;
        this.x = i;
    }

    @Override // defpackage.j81
    public final sd5 invoke(b43.QnHx qnHx) {
        b43.QnHx qnHx2 = qnHx;
        int i = (-this.x) / 2;
        b43 b43Var = this.w;
        b43.QnHx.h(qnHx2, b43Var, i - ((b43Var.w - b43Var.k0()) / 2), i - ((b43Var.x - b43Var.h0()) / 2), null, 12);
        return sd5.a;
    }
}
