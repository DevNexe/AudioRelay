package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class nv6 {
    public static final Unsafe a;
    public static final Class b;
    public static final mv6 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    static {
        mv6 kv6Var;
        boolean z;
        boolean z2;
        mv6 mv6Var;
        Unsafe unsafeM = m();
        a = unsafeM;
        b = zs6.a();
        Class<?> cls = Long.TYPE;
        boolean zV = v(cls);
        boolean zV2 = v(Integer.TYPE);
        if (unsafeM == null) {
            kv6Var = null;
        } else if (zV) {
            kv6Var = new lv6(unsafeM);
        } else if (zV2) {
            kv6Var = new kv6(unsafeM);
        } else {
            kv6Var = null;
        }
        c = kv6Var;
        if (kv6Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = kv6Var.a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (c() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                n(th);
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
                n(th2);
                z2 = false;
            }
        }
        e = z2;
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        g = (fieldC == null || (mv6Var = c) == null) ? -1L : mv6Var.A(fieldC);
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return c.t(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.u(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i = zs6.a;
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

    public static void d(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        mv6 mv6Var = c;
        int iW = mv6Var.w(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        mv6Var.F(obj, j2, ((255 & b2) << i) | (iW & (~(255 << i))));
    }

    public static void e(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        mv6 mv6Var = c;
        int i = (((int) j) & 3) << 3;
        mv6Var.F(obj, j2, ((255 & b2) << i) | (mv6Var.w(j2, obj) & (~(255 << i))));
    }

    public static byte f(long j) {
        return c.a(j);
    }

    public static double g(long j, Object obj) {
        return c.c(j, obj);
    }

    public static float h(long j, Object obj) {
        return c.e(j, obj);
    }

    public static int i(long j, Object obj) {
        return c.w(j, obj);
    }

    public static long j(long j, Object obj) {
        return c.y(j, obj);
    }

    public static Object k(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object l(long j, Object obj) {
        return c.C(j, obj);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new jv6());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void n(Throwable th) {
        Logger.getLogger(nv6.class.getName()).logp(Level.WARNING, "de5", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void o(Object obj, long j, boolean z) {
        c.j(obj, j, z);
    }

    public static void p(byte[] bArr, long j, byte b2) {
        c.k(bArr, f + j, b2);
    }

    public static void q(Object obj, long j, double d2) {
        c.m(obj, j, d2);
    }

    public static void r(Object obj, long j, float f2) {
        c.p(obj, j, f2);
    }

    public static void s(Object obj, long j, int i) {
        c.F(obj, j, i);
    }

    public static void t(Object obj, long j, long j2) {
        c.G(obj, j, j2);
    }

    public static void u(long j, Object obj, Object obj2) {
        c.H(j, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean v(Class cls) {
        int i = zs6.a;
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

    public static boolean w(long j, Object obj) {
        return c.r(j, obj);
    }
}
