package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qg0 {
    public static final ti0 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        ti0 ti0Var;
        int i = qz4.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            qh0 qh0Var = rl0.a;
            j72 j72Var = n72.a;
            j72Var.I();
            ti0Var = !(j72Var instanceof ti0) ? pg0.E : (ti0) j72Var;
        } else {
            ti0Var = pg0.E;
        }
        a = ti0Var;
    }
}
