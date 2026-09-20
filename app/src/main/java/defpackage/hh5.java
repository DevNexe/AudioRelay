package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class hh5<V extends z_Mm> implements eh5<V> {
    public final zy0 a;
    public V b;
    public V c;
    public V d;
    public final float e;

    public hh5(zy0 zy0Var) {
        this.a = zy0Var;
        zy0Var.a();
        this.e = 0.0f;
    }

    @Override // defpackage.eh5
    public final float a() {
        return this.e;
    }

    @Override // defpackage.eh5
    public final V b(long j, V v, V v2) {
        if (this.c == null) {
            this.c = (V) v.c();
        }
        V v3 = this.c;
        if (v3 == null) {
            ur1.e("velocityVector");
            throw null;
        }
        int iB = v3.b();
        for (int i = 0; i < iB; i++) {
            V v4 = this.c;
            if (v4 == null) {
                ur1.e("velocityVector");
                throw null;
            }
            v.a(i);
            v4.e(this.a.b(v2.a(i), j), i);
        }
        V v5 = this.c;
        if (v5 != null) {
            return v5;
        }
        ur1.e("velocityVector");
        throw null;
    }

    @Override // defpackage.eh5
    public final V c(long j, V v, V v2) {
        if (this.b == null) {
            this.b = (V) v.c();
        }
        V v3 = this.b;
        if (v3 == null) {
            ur1.e("valueVector");
            throw null;
        }
        int iB = v3.b();
        for (int i = 0; i < iB; i++) {
            V v4 = this.b;
            if (v4 == null) {
                ur1.e("valueVector");
                throw null;
            }
            v4.e(this.a.c(v.a(i), v2.a(i), j), i);
        }
        V v5 = this.b;
        if (v5 != null) {
            return v5;
        }
        ur1.e("valueVector");
        throw null;
    }

    public final long d(V v, V v2) {
        if (this.c == null) {
            this.c = (V) v.c();
        }
        V v3 = this.c;
        if (v3 == null) {
            ur1.e("velocityVector");
            throw null;
        }
        int iB = v3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            v.a(i);
            jMax = Math.max(jMax, this.a.d(v2.a(i)));
        }
        return jMax;
    }

    public final V e(V v, V v2) {
        if (this.d == null) {
            this.d = (V) v.c();
        }
        V v3 = this.d;
        if (v3 == null) {
            ur1.e("targetVector");
            throw null;
        }
        int iB = v3.b();
        for (int i = 0; i < iB; i++) {
            V v4 = this.d;
            if (v4 == null) {
                ur1.e("targetVector");
                throw null;
            }
            v4.e(this.a.e(v.a(i), v2.a(i)), i);
        }
        V v5 = this.d;
        if (v5 != null) {
            return v5;
        }
        ur1.e("targetVector");
        throw null;
    }
}
