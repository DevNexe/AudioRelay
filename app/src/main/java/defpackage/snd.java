package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class snd implements yl0 {
    public final /* synthetic */ yk0 a;

    public snd(yk0 yk0Var) {
        this.a = yk0Var;
    }

    @Override // defpackage.yl0
    public final void a() {
        yk0 yk0Var = this.a;
        yk0Var.dismiss();
        uk0 uk0Var = yk0Var.z;
        k40 k40Var = uk0Var.y;
        if (k40Var != null) {
            k40Var.a();
        }
        uk0Var.y = null;
        uk0Var.requestLayout();
    }
}
