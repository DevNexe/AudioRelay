package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s01 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ y81 x;

    public s01(mz0 mz0Var, foo fooVar) {
        this.w = mz0Var;
        this.x = fooVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, py4] */
    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) {
        jl3 jl3Var = new jl3();
        jl3Var.w = v3A.x;
        Object objA = this.w.a(new t01(jl3Var, this.x, nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
