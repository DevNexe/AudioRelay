package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MZ<T, R> extends a11<R> {
    public final a11<T> x;

    public MZ(a11<T> a11Var) {
        if (a11Var == null) {
            throw new NullPointerException("source is null");
        }
        this.x = a11Var;
    }
}
