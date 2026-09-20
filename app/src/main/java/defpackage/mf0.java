package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class mf0<T, V extends z_Mm> implements HZD4<T, V> {
    public final eh5<V> a;
    public final pb5<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;

    public mf0(nf0<T> nf0Var, pb5<T, V> pb5Var, T t, V v) {
        hh5 hh5VarA = nf0Var.a();
        this.a = hh5VarA;
        this.b = pb5Var;
        this.c = t;
        V vInvoke = pb5Var.a().invoke(t);
        this.d = vInvoke;
        this.e = (V) X.o(v);
        this.g = (T) pb5Var.b().invoke(hh5VarA.e(vInvoke, v));
        long jD = hh5VarA.d(vInvoke, v);
        this.h = jD;
        V v2 = (V) X.o(hh5VarA.b(jD, vInvoke, v));
        this.f = v2;
        int iB = v2.b();
        for (int i = 0; i < iB; i++) {
            V v3 = this.f;
            v3.e(AY.n(v3.a(i), -this.a.a(), this.a.a()), i);
        }
    }

    @Override // defpackage.HZD4
    public final boolean a() {
        return false;
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
        if (iZUl.a(this, j)) {
            return this.f;
        }
        return (V) this.a.b(j, this.d, this.e);
    }

    @Override // defpackage.HZD4
    public final /* synthetic */ boolean e(long j) {
        return iZUl.a(this, j);
    }

    @Override // defpackage.HZD4
    public final T f(long j) {
        if (iZUl.a(this, j)) {
            return this.g;
        }
        return (T) this.b.b().invoke(this.a.c(j, this.d, this.e));
    }

    @Override // defpackage.HZD4
    public final T g() {
        return this.g;
    }
}
