package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di2 implements ci2 {
    public final nj4 a = OW8.c(0, 16, lg.DROP_OLDEST, 1);

    @Override // defpackage.wp1
    public final nj4 a() {
        return this.a;
    }

    @Override // defpackage.ci2
    public final boolean b(vp1 vp1Var) {
        return this.a.e(vp1Var);
    }

    @Override // defpackage.ci2
    public final Object c(vp1 vp1Var, z80<? super sd5> z80Var) {
        Object objF = this.a.f(vp1Var, z80Var);
        return objF == va0.COROUTINE_SUSPENDED ? objF : sd5.a;
    }
}
