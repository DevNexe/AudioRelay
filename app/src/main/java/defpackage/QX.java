package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QX<T> implements rv1<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zj0
    public final T c(pf0 pf0Var) {
        pa4 pa4VarA = a();
        g40 g40VarB = pf0Var.b(pa4VarA);
        jl3 jl3Var = new jl3();
        g40VarB.b0();
        T t = null;
        while (true) {
            int iP = g40VarB.p(a());
            if (iP == -1) {
                if (t != null) {
                    g40VarB.G(pa4VarA);
                    return t;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) jl3Var.w)).toString());
            }
            if (iP == 0) {
                jl3Var.w = (T) g40VarB.A(a(), iP);
            } else {
                if (iP != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) jl3Var.w;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iP);
                    throw new SerializationException(sb.toString());
                }
                T t2 = jl3Var.w;
                if (t2 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                }
                jl3Var.w = t2;
                String str2 = (String) t2;
                zj0<? extends T> zj0VarF = f(g40VarB, str2);
                if (zj0VarF == null) {
                    ddf.k(str2, h());
                    throw null;
                }
                t = (T) g40VarB.J(a(), iP, zj0VarF, null);
            }
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, T t) {
        db4<? super T> db4VarK = kd.k(this, ls0Var, t);
        eu1 eu1VarB = ls0Var.b(a());
        eu1VarB.c0(a(), 0, db4VarK.a().a());
        eu1VarB.k0(a(), 1, db4VarK, t);
        eu1VarB.k();
    }

    public zj0<? extends T> f(g40 g40Var, String str) {
        return g40Var.a().c(str, h());
    }

    public db4<T> g(ls0 ls0Var, T t) {
        return ls0Var.a().d(t, h());
    }

    public abstract fv1<T> h();
}
