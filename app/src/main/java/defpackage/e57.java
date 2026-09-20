package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class e57 {
    public static final Unsafe a;
    public static final Class b;
    public static final mv6 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    static {
        mv6 t47Var;
        boolean z;
        boolean z2;
        mv6 mv6Var;
        Unsafe unsafeK = k();
        a = unsafeK;
        b = xy6.a();
        Class<?> cls = Long.TYPE;
        boolean zR = r(cls);
        boolean zR2 = r(Integer.TYPE);
        if (unsafeK == null) {
            t47Var = null;
        } else if (zR) {
            t47Var = new d57(unsafeK);
        } else if (zR2) {
            t47Var = new t47(unsafeK);
        } else {
            t47Var = null;
        }
        c = t47Var;
        if (t47Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = t47Var.a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                l(th);
            }
        }
        d = z;
        mv6 mv6Var2 = c;
        if (mv6Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = mv6Var2.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                l(th2);
                z2 = false;
            }
        }
        e = z2;
        f = t(byte[].class);
        t(boolean[].class);
        a(boolean[].class);
        t(int[].class);
        a(int[].class);
        t(long[].class);
        a(long[].class);
        t(float[].class);
        a(float[].class);
        t(double[].class);
        a(double[].class);
        t(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (mv6Var = c) != null) {
            mv6Var.x(fieldB);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            c.q(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i = xy6.a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void c(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        mv6 mv6Var = c;
        int iS = mv6Var.s(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        mv6Var.B(obj, j2, ((255 & b2) << i) | (iS & (~(255 << i))));
    }

    public static void d(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        mv6 mv6Var = c;
        int i = (((int) j) & 3) << 3;
        mv6Var.B(obj, j2, ((255 & b2) << i) | (mv6Var.s(j2, obj) & (~(255 << i))));
    }

    public static double e(long j, Object obj) {
        return c.b(j, obj);
    }

    public static float f(long j, Object obj) {
        return c.d(j, obj);
    }

    public static int g(long j, Object obj) {
        return c.s(j, obj);
    }

    public static long h(long j, Object obj) {
        return c.v(j, obj);
    }

    public static Object i(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object j(long j, Object obj) {
        return c.z(j, obj);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s47());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void l(Throwable th) {
        Logger.getLogger(e57.class.getName()).logp(Level.WARNING, "de5", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void m(Object obj, long j, boolean z) {
        c.f(obj, j, z);
    }

    public static void n(Object obj, long j, double d2) {
        c.i(obj, j, d2);
    }

    public static void o(Object obj, long j, float f2) {
        c.l(obj, j, f2);
    }

    public static void p(Object obj, long j, int i) {
        c.B(obj, j, i);
    }

    public static void q(long j, Object obj, Object obj2) {
        c.E(j, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean r(Class cls) {
        int i = xy6.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean s(long j, Object obj) {
        return c.n(j, obj);
    }

    public static int t(Class cls) {
        if (e) {
            return c.o(cls);
        }
        return -1;
    }
}
