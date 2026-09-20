package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pg4<V> extends Xn1<V> {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean i(V v) {
        if (v == null) {
            v = (V) Xn1.C;
        }
        if (!Xn1.B.b(this, null, v)) {
            return false;
        }
        Xn1.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (!Xn1.B.b(this, null, new Xn1.F1(th))) {
            return false;
        }
        Xn1.c(this);
        return true;
    }

    public final boolean k(j42<? extends V> j42Var) {
        Xn1.F1 f1;
        j42Var.getClass();
        Object obj = this.w;
        if (obj == null) {
            if (((Xn1) j42Var).isDone()) {
                if (!Xn1.B.b(this, null, Xn1.f(j42Var))) {
                    return false;
                }
                Xn1.c(this);
            } else {
                Xn1.YKK ykk = new Xn1.YKK(this, j42Var);
                if (Xn1.B.b(this, null, ykk)) {
                    try {
                        ((Xn1) j42Var).b(ykk, bl0.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            f1 = new Xn1.F1(th);
                        } catch (Throwable unused) {
                            f1 = Xn1.F1.b;
                        }
                        Xn1.B.b(this, ykk, f1);
                    }
                } else {
                    obj = this.w;
                }
            }
            return true;
        }
        if (!(obj instanceof Xn1.CQf)) {
            return false;
        }
        ((Xn1) j42Var).cancel(((Xn1.CQf) obj).a);
        return false;
    }
}
