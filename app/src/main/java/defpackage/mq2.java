package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mq2 {
    public static final QnHx a = new QnHx();

    public static final class QnHx implements ca<Object, Object> {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(int i, String str) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
