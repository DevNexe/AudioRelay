package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nz1<T> implements pg3<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile pg3<T> b;

    public nz1(pg3<T> pg3Var) {
        this.b = pg3Var;
    }

    @Override // defpackage.pg3
    public final T get() {
        T t = (T) this.a;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
