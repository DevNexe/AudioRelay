package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l60 implements m70 {
    public final /* synthetic */ int w;
    public final /* synthetic */ n60 x;

    public /* synthetic */ l60(n60 n60Var, int i) {
        this.w = i;
        this.x = n60Var;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) {
        switch (this.w) {
            case 0:
                this.x.h = true;
                break;
            default:
                this.x.m.a(new o60((Throwable) obj));
                break;
        }
    }
}
