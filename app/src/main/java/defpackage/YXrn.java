package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class YXrn implements yl0 {
    public final /* synthetic */ lpT1Fixed a;

    public YXrn(lpT1Fixed lpt1) {
        this.a = lpt1;
    }

    @Override // defpackage.yl0
    public final void a() {
        sd5 sd5Var;
        B8C b8c = this.a.a;
        if (b8c != null) {
            b8c.Q0();
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
