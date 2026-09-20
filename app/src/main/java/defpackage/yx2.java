package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx2 implements fd2 {
    public final uq3 a;
    public final qx2 b;

    public yx2(uq3 uq3Var, qx2 qx2Var) {
        this.a = uq3Var;
        this.b = qx2Var;
    }

    @Override // defpackage.fd2
    public final Object a(ad2 ad2Var, md2.QnHx qnHx) {
        if (ad2Var.s0()) {
            this.a.a(ad2Var.e0().S());
        }
        if (ad2Var.n0()) {
            long j = ad2Var.Z().z;
            a62.a.l("Packet not found, stop waiting for retransmission " + j);
            qx2 qx2Var = this.b;
            synchronized (qx2Var) {
                qx2Var.c = qx2Var.c.b();
                sd5 sd5Var = sd5.a;
            }
        }
        return sd5.a;
    }
}
