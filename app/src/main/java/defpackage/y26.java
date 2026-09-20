package defpackage;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class y26 {
    public static volatile ClassLoader a;
    public static volatile Thread b;

    public static synchronized ClassLoader a() {
        if (a == null) {
            a = b();
        }
        return a;
    }

    public static synchronized ClassLoader b() {
        ClassLoader contextClassLoader = null;
        if (b == null) {
            b = c();
            if (b == null) {
                return null;
            }
        }
        synchronized (b) {
            try {
                contextClassLoader = b.getContextClassLoader();
            } catch (SecurityException e) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e.getMessage());
            }
        }
        return contextClassLoader;
    }

    public static synchronized Thread c() {
        SecurityException e;
        Thread xr5Var;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                int iActiveGroupCount = threadGroup2.activeGroupCount();
                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                threadGroup2.enumerate(threadGroupArr);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= iActiveGroupCount) {
                        threadGroup = null;
                        break;
                    }
                    threadGroup = threadGroupArr[i2];
                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                        break;
                    }
                    i2++;
                }
                if (threadGroup == null) {
                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                }
                int iActiveCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[iActiveCount];
                threadGroup.enumerate(threadArr);
                while (true) {
                    if (i >= iActiveCount) {
                        thread = null;
                        break;
                    }
                    thread = threadArr[i];
                    if ("GmsDynamite".equals(thread.getName())) {
                        break;
                    }
                    i++;
                }
                if (thread == null) {
                    try {
                        xr5Var = new xr5(threadGroup);
                        try {
                            xr5Var.setContextClassLoader(null);
                            xr5Var.start();
                        } catch (SecurityException e2) {
                            e = e2;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        xr5Var = thread;
                    }
                    thread = xr5Var;
                }
            } catch (SecurityException e4) {
                e = e4;
                xr5Var = null;
            }
        }
        return thread;
    }
}
