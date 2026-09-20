package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hr4<T> implements lx0<T> {
    public final float a;
    public final float b;
    public final T c;

    public hr4() {
        this(null, 7);
    }

    public hr4(float f, float f2, T t) {
        this.a = f;
        this.b = f2;
        this.c = t;
    }

    @Override // defpackage.Ah
    public final bh5 a(pb5 pb5Var) {
        T t = this.c;
        return new kh5(this.a, this.b, t == null ? null : (z_Mm) pb5Var.a().invoke(t));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hr4)) {
            return false;
        }
        hr4 hr4Var = (hr4) obj;
        if (hr4Var.a == this.a) {
            return ((hr4Var.b > this.b ? 1 : (hr4Var.b == this.b ? 0 : -1)) == 0) && ur1.a(hr4Var.c, this.c);
        }
        return false;
    }

    public final int hashCode() {
        T t = this.c;
        return Float.floatToIntBits(this.b) + ry0.b(this.a, (t != null ? t.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ hr4(Object obj, int i) {
        this((i & 1) != 0 ? 1.0f : 0.0f, (i & 2) != 0 ? 1500.0f : 0.0f, (i & 4) != 0 ? null : obj);
    }
}
