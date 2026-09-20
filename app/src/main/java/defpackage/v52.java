package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v52 {
    public volatile kd2 a;
    public volatile ku0 b;
    public volatile ut0 c;

    public v52(fp1 fp1Var, FWT fwt, XTd3 xTd3) {
        this.a = fp1Var;
        this.b = fwt;
        this.c = xTd3;
    }

    public final void a(Throwable th, boolean z) {
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (z) {
            this.a.d(message, th);
        }
        this.c.a(th);
    }

    public final void b(String str, n52 n52Var) {
        this.b.g(str, n52Var);
    }
}
