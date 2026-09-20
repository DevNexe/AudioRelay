package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lf0 implements u86 {
    public static lf0 w;

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String b(z80 z80Var) {
        Object qnHx;
        if (z80Var instanceof il0) {
            return z80Var.toString();
        }
        try {
            qnHx = z80Var + '@' + a(z80Var);
        } catch (Throwable th) {
            qnHx = new fq3.QnHx(th);
        }
        if (fq3.a(qnHx) != null) {
            qnHx = z80Var.getClass().getName() + '@' + a(z80Var);
        }
        return (String) qnHx;
    }

    @Override // defpackage.y96
    public final /* bridge */ /* synthetic */ Object zzb() {
        t76 t76Var = w76.b;
        C0239D.L(t76Var);
        return t76Var;
    }
}
