package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lpT1Fixed<I> {
    public B8C a;

    public final void a(Object obj) {
        sd5 sd5Var;
        B8C b8c = this.a;
        if (b8c != null) {
            b8c.H0(obj);
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
