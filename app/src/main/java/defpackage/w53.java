package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w53 {
    public static final boolean a;
    public static final boolean b;

    static {
        String property = System.getProperty("os.name", "unknown");
        System.getProperty("os.version", "");
        y43 y43Var = new y43(property);
        ((Boolean) y43Var.b.getValue()).booleanValue();
        a = y43Var.c;
        b = y43Var.d;
    }
}
