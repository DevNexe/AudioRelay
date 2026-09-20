package defpackage;

import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class u52 {
    public static volatile int a;
    public static final sw4 b = new sw4();
    public static final m57 c = new m57();
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSetB;
        try {
            try {
                try {
                    try {
                        if (e()) {
                            linkedHashSetB = null;
                        } else {
                            linkedHashSetB = b();
                            h(linkedHashSetB);
                        }
                        StaticLoggerBinder.getSingleton();
                        a = 3;
                        g(linkedHashSetB);
                    } catch (NoSuchMethodError e2) {
                        String message = e2.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            a = 2;
                            pf5.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            pf5.a("Your binding is version 1.5.5 or earlier.");
                            pf5.a("Upgrade your binding to version 1.6.x.");
                        }
                        throw e2;
                    }
                } catch (Exception e3) {
                    a = 2;
                    pf5.b("Failed to instantiate SLF4J LoggerFactory", e3);
                    throw new IllegalStateException("Unexpected initialization failure", e3);
                }
            } catch (NoClassDefFoundError e4) {
                String message2 = e4.getMessage();
                if (!(message2 != null && (message2.contains("org/slf4j/impl/StaticLoggerBinder") || message2.contains("org.slf4j.impl.StaticLoggerBinder")))) {
                    a = 2;
                    pf5.b("Failed to instantiate SLF4J LoggerFactory", e4);
                    throw e4;
                }
                a = 4;
                pf5.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                pf5.a("Defaulting to no-operation (NOP) logger implementation");
                pf5.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = u52.class.getClassLoader();
            String str = f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            pf5.b("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static ILoggerFactory c() {
        if (a == 0) {
            synchronized (u52.class) {
                if (a == 0) {
                    a = 1;
                    a();
                    if (a == 3) {
                        i();
                    }
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static t52 d(String str) {
        return c().b(str);
    }

    public static boolean e() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
    }

    public static void f() {
        sw4 sw4Var = b;
        synchronized (sw4Var) {
            sw4Var.w = true;
            for (rw4 rw4Var : new ArrayList(sw4Var.x.values())) {
                rw4Var.x = d(rw4Var.w);
            }
        }
        LinkedBlockingQueue<tw4> linkedBlockingQueue = b.y;
        int size = linkedBlockingQueue.size();
        ArrayList<tw4> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (tw4 tw4Var : arrayList) {
                if (tw4Var != null) {
                    rw4 rw4Var2 = tw4Var.a;
                    String str = rw4Var2.w;
                    if (rw4Var2.x == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(rw4Var2.x instanceof dj2)) {
                        if (!rw4Var2.b()) {
                            pf5.a(str);
                        } else if (rw4Var2.b()) {
                            try {
                                rw4Var2.z.invoke(rw4Var2.x, tw4Var);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (tw4Var.a.b()) {
                        pf5.a("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        pf5.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        pf5.a("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(tw4Var.a.x instanceof dj2)) {
                        pf5.a("The following set of substitute loggers may have been accessed");
                        pf5.a("during the initialization phase. Logging calls during this");
                        pf5.a("phase were not honored. However, subsequent logging calls to these");
                        pf5.a("loggers will work as normally expected.");
                        pf5.a("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        sw4 sw4Var2 = b;
        sw4Var2.x.clear();
        sw4Var2.y.clear();
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null) {
            if (linkedHashSet.size() > 1) {
                pf5.a("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
            }
        }
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            pf5.a("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                pf5.a("Found binding in [" + ((URL) it.next()) + "]");
            }
            pf5.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void i() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            pf5.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
            pf5.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            pf5.b("Unexpected problem occured during version sanity check", th);
        }
    }
}
