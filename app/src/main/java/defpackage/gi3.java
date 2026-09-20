package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gi3<T> implements mj4<T>, mz0, q91<T> {
    public final /* synthetic */ mj4<T> w;

    public gi3(nj4 nj4Var) {
        this.w = nj4Var;
    }

    @Override // defpackage.mj4, defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<?> z80Var) {
        return this.w.a(nz0Var, z80Var);
    }

    @Override // defpackage.q91
    public final mz0<T> c(la0 la0Var, int i, lg lgVar) {
        return ((i == 0 || i == -3) && lgVar == lg.SUSPEND) ? this : new uo(i, la0Var, lgVar, this);
    }
}
