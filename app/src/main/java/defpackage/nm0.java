package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class nm0<T, K> implements x94<T> {
    public final x94<T> a;
    public final j81<T, K> b;

    public nm0(jx0 jx0Var, ha4 ha4Var) {
        this.a = jx0Var;
        this.b = ha4Var;
    }

    @Override // defpackage.x94
    public final Iterator<T> iterator() {
        return new mm0(this.a.iterator(), this.b);
    }
}
