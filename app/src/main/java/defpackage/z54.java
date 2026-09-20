package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z54 implements x83, w83 {
    public final is4<z64> a;
    public l64 b = o64.a;

    public z54(ri2 ri2Var) {
        this.a = ri2Var;
    }

    @Override // defpackage.w83
    public final void a(long j, float f) {
        z64 value = this.a.getValue();
        value.a(this.b, value.e(f), new kt2(j), 1);
    }

    @Override // defpackage.x83
    public final Object b(bo0.QnHx qnHx, bo0 bo0Var) {
        Object objB = this.a.getValue().d.b(vi2.UserInput, new y54(this, qnHx, null), bo0Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }
}
