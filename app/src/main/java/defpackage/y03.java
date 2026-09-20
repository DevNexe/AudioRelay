package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y03<K, V> extends Aa<K, V> implements p13<K, V> {
    public static final y03 y = new y03(db5.e, 0);
    public final db5<K, V> w;
    public final int x;

    public y03(db5<K, V> db5Var, int i) {
        this.w = db5Var;
        this.x = i;
    }

    public final y03 a(Object obj, x32 x32Var) {
        db5.QnHx qnHxU = this.w.u(obj != null ? obj.hashCode() : 0, 0, obj, x32Var);
        return qnHxU == null ? this : new y03(qnHxU.a, this.x + qnHxU.b);
    }

    @Override // defpackage.p13
    public final a13 builder() {
        return new a13(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.w.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.w.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
