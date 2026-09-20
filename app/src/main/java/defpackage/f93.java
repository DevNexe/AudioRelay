package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f93 extends fz1<f93, k93> {
    public f93(kz1 kz1Var, k93 k93Var) {
        super(kz1Var, k93Var);
    }

    @Override // defpackage.fz1
    public final void a() {
        this.z = true;
        Object obj = this.x;
        ((k93) obj).N().w = this.w;
        ((k93) obj).N().x = true;
    }

    @Override // defpackage.fz1
    public final void b() {
        this.z = false;
        ((k93) this.x).N().x = false;
    }

    public final boolean c() {
        j93 j93VarN = ((k93) this.x).N();
        j93VarN.getClass();
        if (!(j93VarN instanceof m93.QnHx)) {
            f93 f93Var = (f93) this.y;
            if (!(f93Var != null ? f93Var.c() : false)) {
                return false;
            }
        }
        return true;
    }
}
