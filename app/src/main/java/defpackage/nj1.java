package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj1<T> {
    public final T a;

    public nj1(T t) {
        this.a = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj1) && ur1.a(this.a, ((nj1) obj).a);
    }

    public final int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return "ImmutableWrapper(value=" + this.a + ")";
    }
}
