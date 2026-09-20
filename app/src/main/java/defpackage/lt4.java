package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lt4<T> implements is4<T> {
    public final T w;

    public lt4(T t) {
        this.w = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lt4) {
            return ur1.a(this.w, ((lt4) obj).w);
        }
        return false;
    }

    @Override // defpackage.is4
    public final T getValue() {
        return this.w;
    }

    public final int hashCode() {
        T t = this.w;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return o5.d(new StringBuilder("StaticValueHolder(value="), this.w, ')');
    }
}
