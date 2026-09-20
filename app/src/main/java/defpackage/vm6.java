package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vm6 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ ro6 b;

    public vm6(ro6 ro6Var, String str) {
        this.b = ro6Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        bi6 bi6Var = this.b.a.i;
        dq6.h(bi6Var);
        bi6Var.f.c(th, this.a);
    }
}
