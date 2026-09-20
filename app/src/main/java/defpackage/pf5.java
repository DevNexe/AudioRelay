package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pf5 {
    public static QnHx a = null;
    public static boolean b = false;

    public static final class QnHx extends SecurityManager {
        @Override // java.lang.SecurityManager
        public final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static final void a(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void b(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
