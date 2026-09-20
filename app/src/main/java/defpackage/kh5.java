package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class kh5<V extends z_Mm> implements bh5 {
    public final /* synthetic */ gh5<V> a;

    public kh5(float f, float f2, V v) {
        this.a = new gh5<>(v != null ? new ch5(f, f2, v) : new dh5(f, f2));
    }

    @Override // defpackage.bh5
    public final boolean a() {
        this.a.getClass();
        return false;
    }

    @Override // defpackage.bh5
    public final V b(long j, V v, V v2, V v3) {
        return (V) this.a.b(j, v, v2, v3);
    }

    @Override // defpackage.bh5
    public final V e(long j, V v, V v2, V v3) {
        return (V) this.a.e(j, v, v2, v3);
    }

    @Override // defpackage.bh5
    public final V f(V v, V v2, V v3) {
        return (V) this.a.f(v, v2, v3);
    }

    @Override // defpackage.bh5
    public final long g(V v, V v2, V v3) {
        return this.a.g(v, v2, v3);
    }
}
