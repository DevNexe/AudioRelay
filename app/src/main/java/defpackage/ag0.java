package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ag0<T, R> extends zf0<T, R> implements z80<R> {
    public final y81<? super zf0<?, ?>, Object, ? super z80<Object>, ? extends Object> w;
    public Object x;
    public z80<Object> y = this;
    public Object z = va0.COROUTINE_SUSPENDED;

    public ag0(sd5 sd5Var, y81 y81Var) {
        this.w = y81Var;
        this.x = sd5Var;
    }

    @Override // defpackage.zf0
    public final void a(sd5 sd5Var, av1 av1Var) {
        this.y = av1Var;
        this.x = sd5Var;
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return xr0.w;
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        this.y = null;
        this.z = obj;
    }
}
