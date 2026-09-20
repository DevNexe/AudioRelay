package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x93<T> {
    public final Object[] a = new Object[256];
    public int b;

    public final T a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return t;
    }

    public final void b(Cpj cpj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = cpj;
            this.b = i + 1;
        }
    }
}
