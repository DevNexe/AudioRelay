package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gt3 {
    public static gt3 b;
    public static final ht3 c = new ht3(0, 0, 0, false, false);
    public ht3 a;

    public static synchronized gt3 a() {
        if (b == null) {
            b = new gt3();
        }
        return b;
    }
}
