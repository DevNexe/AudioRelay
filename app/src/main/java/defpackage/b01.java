package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b01 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ x81 x;

    public b01(wr4.CQf cQf, vo voVar) {
        this.w = voVar;
        this.x = cQf;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) {
        Object objA = this.w.a(new c01(new fl3(), nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
