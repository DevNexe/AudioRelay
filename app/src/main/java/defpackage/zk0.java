package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class zk0 extends qj0 {
    public int m;

    public zk0(cm5 cm5Var) {
        super(cm5Var);
        if (cm5Var instanceof gd1) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.qj0
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (lj0 lj0Var : this.k) {
            lj0Var.a(lj0Var);
        }
    }
}
