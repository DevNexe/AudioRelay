package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class is1 extends hs1 {

    public static final class QnHx {
        public static final Integer a;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            a = num2;
        }
    }

    @Override // defpackage.b53
    public final yh3 b() {
        Integer num = QnHx.a;
        return num == null || num.intValue() >= 24 ? new t53() : new pw0();
    }
}
