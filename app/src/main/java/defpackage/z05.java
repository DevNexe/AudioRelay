package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z05<TResult> {
    public final kc7<TResult> a = new kc7<>();

    public final void a(TResult tresult) {
        this.a.s(tresult);
    }

    public final void b(Exception exc) {
        kc7<TResult> kc7Var = this.a;
        kc7Var.getClass();
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (kc7Var.a) {
            if (kc7Var.c) {
                return;
            }
            kc7Var.c = true;
            kc7Var.f = exc;
            kc7Var.b.b(kc7Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Object obj) {
        kc7<TResult> kc7Var = this.a;
        synchronized (kc7Var.a) {
            if (kc7Var.c) {
                return;
            }
            kc7Var.c = true;
            kc7Var.e = obj;
            kc7Var.b.b(kc7Var);
        }
    }
}
