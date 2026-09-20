package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cp5 {
    public static final gg.QnHx a = new gg.QnHx();
    public static final int b = -1234567890;

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbB = qc0.b("size=", j, " offset=");
            sbB.append(j2);
            sbB.append(" byteCount=");
            sbB.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbB.toString());
        }
    }
}
