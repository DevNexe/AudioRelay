package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f75 {
    public static final ThreadLocal<gu0> a = new ThreadLocal<>();

    public static gu0 a() {
        ThreadLocal<gu0> threadLocal = a;
        gu0 gu0Var = threadLocal.get();
        if (gu0Var != null) {
            return gu0Var;
        }
        gb gbVar = new gb(Thread.currentThread());
        threadLocal.set(gbVar);
        return gbVar;
    }
}
