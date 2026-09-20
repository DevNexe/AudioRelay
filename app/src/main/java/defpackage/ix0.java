package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ix0 implements ut0 {
    public final ut0 w;
    public final j81<Throwable, Boolean> x;

    public ix0(xb0 xb0Var, kp.QnHx qnHx) {
        this.w = xb0Var;
        this.x = qnHx;
    }

    @Override // defpackage.ut0
    public final void a(Throwable th) {
        if (this.x.invoke(th).booleanValue()) {
            this.w.a(th);
        }
    }
}
