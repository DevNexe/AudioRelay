package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k13<K, V> extends vDR<K> implements mj1<K> {
    public final y03<K, V> w;

    public k13(y03<K, V> y03Var) {
        this.w = y03Var;
    }

    @Override // defpackage.auxFixed
    public final int a() {
        y03<K, V> y03Var = this.w;
        y03Var.getClass();
        return y03Var.x;
    }

    @Override // defpackage.auxFixed, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.w.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new l13(this.w.w);
    }
}
