package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ep {
    public static final ep a = new ep();
    public static final syh<char[]> b = new syh<>();
    public static int c;
    public static final int d;

    static {
        Object qnHx;
        try {
            qnHx = hv4.o(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            qnHx = new fq3.QnHx(th);
        }
        if (qnHx instanceof fq3.QnHx) {
            qnHx = null;
        }
        Integer num = (Integer) qnHx;
        d = num != null ? num.intValue() : 1048576;
    }
}
