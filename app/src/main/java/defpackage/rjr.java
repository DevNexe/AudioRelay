package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class rjr<T, V extends z_Mm> {
    public final pb5<T, V> a;
    public final T b;
    public final long c;
    public final h81<sd5> d;
    public final kz2 e;
    public V f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final kz2 i = ps0.R(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public rjr(Object obj, pb5 pb5Var, z_Mm z_mm, long j, Object obj2, long j2, h81 h81Var) {
        this.a = pb5Var;
        this.b = obj2;
        this.c = j2;
        this.d = h81Var;
        this.e = ps0.R(obj);
        this.f = (V) X.o(z_mm);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final T b() {
        return this.e.getValue();
    }

    public final T c() {
        return this.a.b().invoke(this.f);
    }

    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }
}
