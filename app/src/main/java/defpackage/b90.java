package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b90 extends m8 {
    public final la0 x;
    public transient z80<Object> y;

    public b90(z80<Object> z80Var, la0 la0Var) {
        super(z80Var);
        this.x = la0Var;
    }

    @Override // defpackage.z80
    public la0 getContext() {
        return this.x;
    }

    @Override // defpackage.m8
    public void j() {
        z80<?> z80Var = this.y;
        if (z80Var != null && z80Var != this) {
            la0 context = getContext();
            int i = c90.f;
            ((c90) context.j(c90.QnHx.w)).A(z80Var);
        }
        this.y = gy.w;
    }

    public b90(z80<Object> z80Var) {
        this(z80Var, z80Var != null ? z80Var.getContext() : null);
    }
}
