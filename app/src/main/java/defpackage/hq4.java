package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class hq4 {
    public final j81<Throwable, sd5> a;
    public volatile boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public hq4(j81<? super Throwable, sd5> j81Var) {
        this.a = j81Var;
    }

    public static final void a(hq4 hq4Var, Throwable th) throws oo5 {
        boolean z = hq4Var.b;
        hq4Var.a.invoke(th);
        if (!z) {
            throw new RuntimeException(th);
        }
        throw new oo5(th);
    }
}
