package defpackage;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class ur1 {

    public static class QnHx {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static void c(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String d(Object obj, String str) {
        return str + obj;
    }

    public static void e(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(fc2.a("lateinit property ", str, " has not been initialized"));
        c(ur1.class.getName(), uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }
}
