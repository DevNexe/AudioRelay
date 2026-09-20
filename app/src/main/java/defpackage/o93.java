package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o93 {
    public static final ThreadLocal<nz2<Thread>> a = new ThreadLocal<>();

    public static final nz2<Thread> a() {
        nz2<Thread> nz2Var = a.get();
        return nz2Var == null ? hh0.a : nz2Var;
    }
}
