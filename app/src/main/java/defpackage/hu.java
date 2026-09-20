package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hu<Element, Collection, Builder> extends T23<Element, Collection, Builder> {
    public final rv1<Element> a;

    public hu(rv1 rv1Var) {
        this.a = rv1Var;
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public abstract pa4 a();

    @Override // defpackage.db4
    public void e(ls0 ls0Var, Collection collection) {
        int i = i(collection);
        eu1 eu1VarW = ls0Var.w(a());
        Iterator<Element> itH = h(collection);
        for (int i2 = 0; i2 < i; i2++) {
            eu1VarW.k0(a(), i2, this.a, itH.next());
        }
        eu1VarW.k();
    }

    @Override // defpackage.T23
    public void k(g40 g40Var, int i, Builder builder, boolean z) {
        n(i, builder, g40Var.J(a(), i, this.a, null));
    }

    public abstract void n(int i, Object obj, Object obj2);
}
