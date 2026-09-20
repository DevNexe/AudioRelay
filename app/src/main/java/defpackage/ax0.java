package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ax0<T> implements nz0 {
    public final /* synthetic */ qo1<Object, Object, Object> w;

    public ax0(ro1 ro1Var) {
        this.w = ro1Var;
    }

    @Override // defpackage.nz0
    public final Object f(Object obj, z80 z80Var) {
        Object objA = this.w.a((ph3) obj, new yg0(), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
