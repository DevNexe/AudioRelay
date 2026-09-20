package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x04 extends EQ<sd5> {
    public final bx y;

    public x04(la0 la0Var, uw.QnHx qnHx) {
        super(la0Var, false, true);
        this.y = qnHx;
    }

    @Override // defpackage.EQ
    public final void U0(Throwable th, boolean z) {
        try {
            if (((uw.QnHx) this.y).c(th)) {
                return;
            }
        } catch (Throwable th2) {
            Th.a(th, th2);
        }
        ddf.j(this.x, th);
    }

    @Override // defpackage.EQ
    public final void V0(sd5 sd5Var) {
        try {
            ((uw.QnHx) this.y).b();
        } catch (Throwable th) {
            ddf.j(this.x, th);
        }
    }
}
