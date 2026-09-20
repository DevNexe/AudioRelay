package defpackage;

import androidx.lifecycle.LPt6Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class ik1 implements LPt6Fixed.CQf {
    public final kj5<?>[] a;

    public ik1(kj5<?>... kj5VarArr) {
        this.a = kj5VarArr;
    }

    @Override // androidx.lifecycle.LPt6Fixed.CQf
    public final jj5 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.lifecycle.LPt6Fixed.CQf
    public final jj5 b(Class cls, bi2 bi2Var) {
        jj5 jj5Var = null;
        for (kj5<?> kj5Var : this.a) {
            if (ur1.a(kj5Var.a, cls)) {
                Object objInvoke = kj5Var.b.invoke(bi2Var);
                jj5Var = objInvoke instanceof jj5 ? (jj5) objInvoke : null;
            }
        }
        if (jj5Var != null) {
            return jj5Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
