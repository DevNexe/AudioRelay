package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w01 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ mz0 x;
    public final /* synthetic */ y81 y;

    public w01(mz0 mz0Var, mz0 mz0Var2, y81 y81Var) {
        this.w = mz0Var;
        this.x = mz0Var2;
        this.y = y81Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) throws Throwable {
        Object objE = qLd.e(z80Var, y01.w, new x01(this.y, null), nz0Var, new mz0[]{this.w, this.x});
        return objE == va0.COROUTINE_SUSPENDED ? objE : sd5.a;
    }
}
