package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bc1<E> extends ku<E, Set<? extends E>, HashSet<E>> {
    public final ac1 b;

    public bc1(rv1<E> rv1Var) {
        super(rv1Var);
        this.b = new ac1(rv1Var.a());
    }

    @Override // defpackage.hu, defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.b;
    }

    @Override // defpackage.T23
    public final Object f() {
        return new HashSet();
    }

    @Override // defpackage.T23
    public final int g(Object obj) {
        return ((HashSet) obj).size();
    }

    @Override // defpackage.T23
    public final Object l(Object obj) {
        return new HashSet((Collection) null);
    }

    @Override // defpackage.T23
    public final Object m(Object obj) {
        return (HashSet) obj;
    }

    @Override // defpackage.hu
    public final void n(int i, Object obj, Object obj2) {
        ((HashSet) obj).add(obj2);
    }
}
