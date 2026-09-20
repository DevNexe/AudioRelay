package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uo<T> extends so<T, T> {
    public uo(mz0 mz0Var, oa0 oa0Var, int i, lg lgVar, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? xr0.w : oa0Var, (i2 & 8) != 0 ? lg.SUSPEND : lgVar, mz0Var);
    }

    @Override // defpackage.oo
    public final oo<T> i(la0 la0Var, int i, lg lgVar) {
        return new uo(i, la0Var, lgVar, this.z);
    }

    @Override // defpackage.oo
    public final mz0<T> j() {
        return (mz0<T>) this.z;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.so
    public final Object l(nz0<? super T> nz0Var, z80<? super sd5> z80Var) {
        Object objA = this.z.a((nz0<? super S>) nz0Var, z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    public uo(int i, la0 la0Var, lg lgVar, mz0 mz0Var) {
        super(i, la0Var, lgVar, mz0Var);
    }
}
