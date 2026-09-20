package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vy6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ dz6 x;

    public /* synthetic */ vy6(dz6 dz6Var, int i) {
        this.w = i;
        this.x = dz6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        dz6 dz6Var = this.x;
        switch (i) {
            case 0:
                dz6Var.e = dz6Var.j;
                break;
            default:
                dz6Var.j = null;
                break;
        }
    }
}
