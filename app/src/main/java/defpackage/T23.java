package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T23<Element, Collection, Builder> implements rv1<Collection> {
    @Override // defpackage.zj0
    public Collection c(pf0 pf0Var) {
        return (Collection) j(pf0Var);
    }

    public abstract Builder f();

    public abstract int g(Builder builder);

    public abstract Iterator<Element> h(Collection collection);

    public abstract int i(Collection collection);

    public final Object j(pf0 pf0Var) {
        Builder builderF = f();
        int iG = g(builderF);
        g40 g40VarB = pf0Var.b(a());
        g40VarB.b0();
        while (true) {
            int iP = g40VarB.p(a());
            if (iP == -1) {
                g40VarB.G(a());
                return m(builderF);
            }
            k(g40VarB, iP + iG, builderF, true);
        }
    }

    public abstract void k(g40 g40Var, int i, Builder builder, boolean z);

    public abstract Builder l(Collection collection);

    public abstract Collection m(Builder builder);
}
