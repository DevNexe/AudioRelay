package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lr4<T> implements z80<T>, wa0 {
    public final z80<T> w;
    public final la0 x;

    /* JADX WARN: Multi-variable type inference failed */
    public lr4(z80<? super T> z80Var, la0 la0Var) {
        this.w = z80Var;
        this.x = la0Var;
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        return this.x;
    }

    @Override // defpackage.wa0
    public final wa0 k() {
        z80<T> z80Var = this.w;
        if (z80Var instanceof wa0) {
            return (wa0) z80Var;
        }
        return null;
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        this.w.x(obj);
    }
}
