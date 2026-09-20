package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m13<K, V> extends auxFixed<V> {
    public final y03<K, V> w;

    public m13(y03<K, V> y03Var) {
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
        return this.w.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new n13(this.w.w);
    }
}
