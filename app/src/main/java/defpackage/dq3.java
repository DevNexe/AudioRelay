package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dq3 extends m8 {
    public dq3(z80<Object> z80Var) {
        super(z80Var);
        if (z80Var != null) {
            if (!(z80Var.getContext() == xr0.w)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return xr0.w;
    }
}
