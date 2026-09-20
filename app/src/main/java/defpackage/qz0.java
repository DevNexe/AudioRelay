package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qz0 implements mz0<Object> {
    public final /* synthetic */ Object w;

    public qz0(Object obj) {
        this.w = obj;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) {
        Object objF = nz0Var.f(this.w, z80Var);
        return objF == va0.COROUTINE_SUSPENDED ? objF : sd5.a;
    }
}
