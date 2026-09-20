package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class t05<T, V extends z_Mm> implements HZD4<T, V> {
    public final bh5<V> a;
    public final pb5<T, V> b;
    public final T c;
    public final T d;
    public final V e;
    public final V f;
    public final V g;
    public final long h;
    public final V i;

    public t05() {
        throw null;
    }

    public /* synthetic */ t05(Ah ah, pb5 pb5Var, Object obj, Object obj2) {
        this(ah, pb5Var, obj, obj2, null);
    }

    @Override // defpackage.HZD4
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.HZD4
    public final long b() {
        return this.h;
    }

    @Override // defpackage.HZD4
    public final pb5<T, V> c() {
        return this.b;
    }

    @Override // defpackage.HZD4
    public final V d(long j) {
        return !iZUl.a(this, j) ? (V) this.a.b(j, this.e, this.f, this.g) : this.i;
    }

    @Override // defpackage.HZD4
    public final /* synthetic */ boolean e(long j) {
        return iZUl.a(this, j);
    }

    @Override // defpackage.HZD4
    public final T f(long j) {
        return !iZUl.a(this, j) ? (T) this.b.b().invoke(this.a.e(j, this.e, this.f, this.g)) : this.d;
    }

    @Override // defpackage.HZD4
    public final T g() {
        return this.d;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.c + " -> " + this.d + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms";
    }

    public t05(Ah<T> ah, pb5<T, V> pb5Var, T t, T t2, V v) {
        bh5<V> bh5VarA = ah.a(pb5Var);
        this.a = bh5VarA;
        this.b = pb5Var;
        this.c = t;
        this.d = t2;
        V vInvoke = pb5Var.a().invoke(t);
        this.e = vInvoke;
        V vInvoke2 = pb5Var.a().invoke(t2);
        this.f = vInvoke2;
        V v2 = v != null ? (V) X.o(v) : (V) pb5Var.a().invoke(t).c();
        this.g = v2;
        this.h = bh5VarA.g(vInvoke, vInvoke2, v2);
        this.i = (V) bh5VarA.f(vInvoke, vInvoke2, v2);
    }
}
