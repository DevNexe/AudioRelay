package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq4<T> extends rv2<T> {
    public final T a;

    static {
        new mq4(sd5.a);
    }

    public mq4(T t) {
        this.a = t;
    }

    @Override // defpackage.rv2
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq4) && ur1.a(this.a, ((mq4) obj).a);
    }

    public final int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @Override // defpackage.rv2
    public final String toString() {
        return o5.d(new StringBuilder("Option.Some("), this.a, ')');
    }
}
