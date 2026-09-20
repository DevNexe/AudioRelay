package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rj1<T> {
    public final int a;
    public final T b;

    public rj1(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj1)) {
            return false;
        }
        rj1 rj1Var = (rj1) obj;
        return this.a == rj1Var.a && ur1.a(this.b, rj1Var.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        T t = this.b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        return o5.d(sb, this.b, ')');
    }
}
