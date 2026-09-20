package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zi1 implements x83, w83 {
    public final eo0 a;
    public qn0 b;

    public zi1(eo0 eo0Var) {
        this.a = eo0Var;
    }

    @Override // defpackage.w83
    public final void a(long j, float f) {
        qn0 qn0Var = this.b;
        if (qn0Var != null) {
            qn0Var.a(f);
        }
    }

    @Override // defpackage.x83
    public final Object b(bo0.QnHx qnHx, bo0 bo0Var) {
        Object objA = this.a.a(vi2.UserInput, new yi1(this, qnHx, null), bo0Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
