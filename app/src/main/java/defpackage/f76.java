package defpackage;

import dalvik.system.PathClassLoader;

/* JADX INFO: loaded from: classes.dex */
public final class f76 extends PathClassLoader {
    public f76(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
