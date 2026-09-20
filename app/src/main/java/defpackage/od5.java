package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class od5<T> extends u54<T> {
    public final ThreadLocal<uy2<la0, Object>> z;

    /* JADX WARN: Illegal instructions before constructor call */
    public od5(z80 z80Var, la0 la0Var) {
        pd5 pd5Var = pd5.w;
        super(z80Var, la0Var.j(pd5Var) == null ? la0Var.g0(pd5Var) : la0Var);
        ThreadLocal<uy2<la0, Object>> threadLocal = new ThreadLocal<>();
        this.z = threadLocal;
        if (z80Var.getContext().j(c90.QnHx.w) instanceof oa0) {
            return;
        }
        Object objB = e75.b(la0Var, null);
        e75.a(la0Var, objB);
        threadLocal.set(new uy2<>(la0Var, objB));
    }

    @Override // defpackage.u54, defpackage.EQ
    public final void T0(Object obj) {
        ThreadLocal<uy2<la0, Object>> threadLocal = this.z;
        uy2<la0, Object> uy2Var = threadLocal.get();
        if (uy2Var != null) {
            e75.a(uy2Var.w, uy2Var.x);
            threadLocal.set(null);
        }
        Object objU = kd.u(obj);
        z80<T> z80Var = this.y;
        la0 context = z80Var.getContext();
        Object objB = e75.b(context, null);
        od5<?> od5VarC = objB != e75.a ? ma0.c(z80Var, context, objB) : null;
        try {
            z80Var.x(objU);
            sd5 sd5Var = sd5.a;
        } finally {
            if (od5VarC == null || od5VarC.X0()) {
                e75.a(context, objB);
            }
        }
    }

    public final boolean X0() {
        ThreadLocal<uy2<la0, Object>> threadLocal = this.z;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set(null);
        return true;
    }
}
