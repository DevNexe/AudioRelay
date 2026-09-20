package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class b53 {

    public static final class QnHx {
        public static final Method a;

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        static {
            Method method;
            boolean z;
            Method[] methods = Throwable.class.getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (ur1.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    z = ur1.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class);
                }
                if (z) {
                    method = method2;
                    break;
                }
                i++;
            }
            a = method;
            int length2 = methods.length;
            for (int i2 = 0; i2 < length2 && !ur1.a(methods[i2].getName(), "getSuppressed"); i2++) {
            }
        }
    }

    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Method method = QnHx.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public yh3 b() {
        return new pw0();
    }
}
