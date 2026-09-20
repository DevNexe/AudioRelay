package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class hs1 extends b53 {

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
    public final void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Integer num = QnHx.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
