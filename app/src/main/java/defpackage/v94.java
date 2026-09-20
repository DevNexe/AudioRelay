package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v94<T> implements nz0<T> {
    public final q94<T> w;

    /* JADX WARN: Multi-variable type inference failed */
    public v94(q94<? super T> q94Var) {
        this.w = q94Var;
    }

    @Override // defpackage.nz0
    public final Object f(T t, z80<? super sd5> z80Var) {
        Object objP = this.w.p(t, z80Var);
        return objP == va0.COROUTINE_SUSPENDED ? objP : sd5.a;
    }
}
