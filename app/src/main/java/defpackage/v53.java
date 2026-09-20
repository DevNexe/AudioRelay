package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v53 {
    public static final boolean a;

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    static {
        boolean z;
        String property = System.getProperty("io.ktor.development");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        }
        a = z;
    }
}
