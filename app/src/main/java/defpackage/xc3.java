package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc3 implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ yc3 x;

    public /* synthetic */ xc3(yc3 yc3Var, int i) {
        this.w = i;
        this.x = yc3Var;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) {
        int i = this.w;
        yc3 yc3Var = this.x;
        switch (i) {
            case 0:
                if (((qa) obj) instanceof qa.F1) {
                    yc3Var.b();
                }
                break;
            default:
                yc3Var.b();
                break;
        }
    }
}
