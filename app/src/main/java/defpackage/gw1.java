package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gw1<K, V, R> implements rv1<R> {
    public final rv1<K> a;
    public final rv1<V> b;

    public gw1(rv1 rv1Var, rv1 rv1Var2) {
        this.a = rv1Var;
        this.b = rv1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zj0
    public final R c(pf0 pf0Var) {
        g40 g40VarB = pf0Var.b(a());
        g40VarB.b0();
        Object objJ = mb5.a;
        Object objJ2 = objJ;
        while (true) {
            int iP = g40VarB.p(a());
            if (iP == -1) {
                g40VarB.G(a());
                Object obj = mb5.a;
                if (objJ == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objJ2 != obj) {
                    return (R) h(objJ, objJ2);
                }
                throw new SerializationException("Element 'value' is missing");
            }
            if (iP == 0) {
                objJ = g40VarB.J(a(), 0, this.a, null);
            } else {
                if (iP != 1) {
                    throw new SerializationException(GM.a("Invalid index: ", iP));
                }
                objJ2 = g40VarB.J(a(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, R r) {
        eu1 eu1VarB = ls0Var.b(a());
        eu1VarB.k0(a(), 0, this.a, f(r));
        eu1VarB.k0(a(), 1, this.b, g(r));
        a();
        eu1VarB.k();
    }

    public abstract K f(R r);

    public abstract V g(R r);

    public abstract R h(K k, V v);
}
