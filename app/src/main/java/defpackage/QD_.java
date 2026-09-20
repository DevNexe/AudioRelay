package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class QD_ implements rf0 {
    public final /* synthetic */ k1 a;

    public QD_(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // defpackage.rf0
    public final void a(qk qkVar) {
        k1 k1Var = this.a;
        ny1 ny1Var = k1Var.D;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                p0 p0Var = k1Var.y;
                qk qkVarA = qkVar.a();
                p0Var.a(new ck4(qkVarA, qkVarA.c));
                sd5 sd5Var = sd5.a;
            } else {
                sd5 sd5Var2 = sd5.a;
            }
        } finally {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
        }
    }
}
