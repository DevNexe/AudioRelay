package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class u54<T> extends EQ<T> implements wa0 {
    public final z80<T> y;

    public u54(z80 z80Var, la0 la0Var) {
        super(la0Var, true, true);
        this.y = z80Var;
    }

    @Override // defpackage.ss1
    public final boolean F0() {
        return true;
    }

    @Override // defpackage.ss1
    public void S(Object obj) {
        kd.w(ps0.L(this.y), kd.u(obj), null);
    }

    @Override // defpackage.EQ
    public void T0(Object obj) {
        this.y.x(kd.u(obj));
    }

    @Override // defpackage.wa0
    public final wa0 k() {
        z80<T> z80Var = this.y;
        if (z80Var instanceof wa0) {
            return (wa0) z80Var;
        }
        return null;
    }
}
