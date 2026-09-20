package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y93<T> extends tp1 {
    public final Object c;

    public y93() {
        super(12, 2);
        this.c = new Object();
    }

    @Override // defpackage.tp1
    public final T a() {
        T t;
        synchronized (this.c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // defpackage.tp1
    public final boolean f(T t) {
        boolean zF;
        synchronized (this.c) {
            zF = super.f(t);
        }
        return zF;
    }
}
