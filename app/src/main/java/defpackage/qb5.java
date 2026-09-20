package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class qb5<T, V extends z_Mm> implements pb5<T, V> {
    public final j81<T, V> a;
    public final j81<V, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public qb5(j81<? super T, ? extends V> j81Var, j81<? super V, ? extends T> j81Var2) {
        this.a = j81Var;
        this.b = j81Var2;
    }

    @Override // defpackage.pb5
    public final j81<T, V> a() {
        return this.a;
    }

    @Override // defpackage.pb5
    public final j81<V, T> b() {
        return this.b;
    }
}
