package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a extends cx1 implements j81<b43.QnHx, sd5> {
    public final /* synthetic */ b43 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, b43 b43Var) {
        super(1);
        this.w = b43Var;
        this.x = i;
    }

    @Override // defpackage.j81
    public final sd5 invoke(b43.QnHx qnHx) {
        int i = this.x / 2;
        b43.QnHx.c(qnHx, this.w, i, i);
        return sd5.a;
    }
}
