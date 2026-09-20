package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om3 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ j81 x;

    public /* synthetic */ om3(int i, j81 j81Var) {
        this.w = i;
        this.x = j81Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        j81 j81Var = this.x;
        switch (i) {
            case 0:
                return j81Var.invoke((iy0) obj);
            default:
                return (rl4) j81Var.invoke((ss) obj);
        }
    }
}
