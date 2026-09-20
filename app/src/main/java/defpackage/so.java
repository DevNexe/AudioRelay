package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class so<S, T> extends oo<T> {
    public final mz0<S> z;

    public so(int i, la0 la0Var, lg lgVar, mz0 mz0Var) {
        super(la0Var, i, lgVar);
        this.z = mz0Var;
    }

    @Override // defpackage.oo, defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<? super sd5> z80Var) {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (this.x == -3) {
            la0 context = z80Var.getContext();
            la0 la0VarG0 = context.g0(this.w);
            if (ur1.a(la0VarG0, context)) {
                Object objL = l(nz0Var, z80Var);
                return objL == va0Var ? objL : sd5.a;
            }
            c90.QnHx qnHx = c90.QnHx.w;
            if (ur1.a(la0VarG0.j(qnHx), context.j(qnHx))) {
                la0 context2 = z80Var.getContext();
                if (!(nz0Var instanceof v94 ? true : nz0Var instanceof hp2)) {
                    nz0Var = new nd5(nz0Var, context2);
                }
                ro roVar = new ro(this, null);
                Object objB = e75.b(la0VarG0, la0VarG0.i(0, e75.b));
                try {
                    lr4 lr4Var = new lr4(z80Var, la0VarG0);
                    sb5.d(2, roVar);
                    Object objInvoke = roVar.invoke(nz0Var, lr4Var);
                    e75.a(la0VarG0, objB);
                    if (objInvoke != va0Var) {
                        objInvoke = sd5.a;
                    }
                    return objInvoke == va0Var ? objInvoke : sd5.a;
                } catch (Throwable th) {
                    e75.a(la0VarG0, objB);
                    throw th;
                }
            }
        }
        Object objA = super.a(nz0Var, z80Var);
        return objA == va0Var ? objA : sd5.a;
    }

    @Override // defpackage.oo
    public final Object h(te3<? super T> te3Var, z80<? super sd5> z80Var) {
        Object objL = l(new v94(te3Var), z80Var);
        return objL == va0.COROUTINE_SUSPENDED ? objL : sd5.a;
    }

    public abstract Object l(nz0<? super T> nz0Var, z80<? super sd5> z80Var);

    @Override // defpackage.oo
    public final String toString() {
        return this.z + " -> " + super.toString();
    }
}
