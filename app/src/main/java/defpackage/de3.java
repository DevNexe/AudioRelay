package defpackage;

import defpackage.be3;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class de3<Element, Array, Builder extends be3<Array>> extends hu<Element, Array, Builder> {
    public final ce3 b;

    public de3(rv1<Element> rv1Var) {
        super(rv1Var);
        this.b = new ce3(rv1Var.a());
    }

    @Override // defpackage.hu, defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.b;
    }

    @Override // defpackage.T23, defpackage.zj0
    public final Array c(pf0 pf0Var) {
        return (Array) j(pf0Var);
    }

    @Override // defpackage.hu, defpackage.db4
    public final void e(ls0 ls0Var, Array array) {
        int i = i(array);
        eu1 eu1VarW = ls0Var.w(this.b);
        p(eu1VarW, array, i);
        eu1VarW.k();
    }

    @Override // defpackage.T23
    public final Object f() {
        return l(o());
    }

    @Override // defpackage.T23
    public final int g(Object obj) {
        return ((be3) obj).d();
    }

    @Override // defpackage.T23
    public final Iterator<Element> h(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // defpackage.T23
    public final Object m(Object obj) {
        return ((be3) obj).a();
    }

    @Override // defpackage.hu
    public final void n(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Array o();

    public abstract void p(i40 i40Var, Array array, int i);
}
