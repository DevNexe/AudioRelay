package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j72 extends oa0 {
    public abstract j72 I();

    @Override // defpackage.oa0
    public String toString() {
        j72 j72VarI;
        String str;
        qh0 qh0Var = rl0.a;
        j72 j72Var = n72.a;
        if (this == j72Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                j72VarI = j72Var.I();
            } catch (UnsupportedOperationException unused) {
                j72VarI = null;
            }
            str = this == j72VarI ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + lf0.a(this);
    }
}
