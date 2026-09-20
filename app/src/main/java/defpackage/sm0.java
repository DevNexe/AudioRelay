package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sm0<T> implements og3<T>, pz1<T> {
    public static final Object c = new Object();
    public volatile og3<T> a;
    public volatile Object b = c;

    public sm0(og3<T> og3Var) {
        this.a = og3Var;
    }

    public static og3 a(iw0 iw0Var) {
        return iw0Var instanceof sm0 ? iw0Var : new sm0(iw0Var);
    }

    @Override // defpackage.og3
    public final T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.b;
                if (t == obj) {
                    t = this.a.get();
                    Object obj2 = this.b;
                    if ((obj2 != obj) && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
