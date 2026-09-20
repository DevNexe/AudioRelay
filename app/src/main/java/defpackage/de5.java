package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class de5 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final NUlFixed c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    public static final class CQf extends NUlFixed {
        public CQf(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // de5.NUlFixed
        public final boolean c(long j, Object obj) {
            if (de5.g) {
                return de5.i(j, obj) != 0;
            }
            return de5.j(j, obj) != 0;
        }

        @Override // de5.NUlFixed
        public final byte d(long j, Object obj) {
            return de5.g ? de5.i(j, obj) : de5.j(j, obj);
        }

        @Override // de5.NUlFixed
        public final double e(long j, Object obj) {
            return Double.longBitsToDouble(h(j, obj));
        }

        @Override // de5.NUlFixed
        public final float f(long j, Object obj) {
            return Float.intBitsToFloat(g(j, obj));
        }

        @Override // de5.NUlFixed
        public final Object j(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // de5.NUlFixed
        public final void l(Object obj, long j, byte b) {
            if (de5.g) {
                de5.s(obj, j, b);
            } else {
                de5.t(obj, j, b);
            }
        }

        @Override // de5.NUlFixed
        public final boolean p() {
            return false;
        }
    }

    public static final class F1 extends NUlFixed {
        public F1(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // de5.NUlFixed
        public final boolean c(long j, Object obj) {
            if (de5.g) {
                return de5.i(j, obj) != 0;
            }
            return de5.j(j, obj) != 0;
        }

        @Override // de5.NUlFixed
        public final byte d(long j, Object obj) {
            return de5.g ? de5.i(j, obj) : de5.j(j, obj);
        }

        @Override // de5.NUlFixed
        public final double e(long j, Object obj) {
            return Double.longBitsToDouble(h(j, obj));
        }

        @Override // de5.NUlFixed
        public final float f(long j, Object obj) {
            return Float.intBitsToFloat(g(j, obj));
        }

        @Override // de5.NUlFixed
        public final Object j(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // de5.NUlFixed
        public final void l(Object obj, long j, byte b) {
            if (de5.g) {
                de5.s(obj, j, b);
            } else {
                de5.t(obj, j, b);
            }
        }

        @Override // de5.NUlFixed
        public final boolean p() {
            return false;
        }
    }

    public static final class LPt8Fixed extends NUlFixed {
        public LPt8Fixed(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // de5.NUlFixed
        public final boolean c(long j, Object obj) {
            return this.a.getBoolean(obj, j);
        }

        @Override // de5.NUlFixed
        public final byte d(long j, Object obj) {
            return this.a.getByte(obj, j);
        }

        @Override // de5.NUlFixed
        public final double e(long j, Object obj) {
            return this.a.getDouble(obj, j);
        }

        @Override // de5.NUlFixed
        public final float f(long j, Object obj) {
            return this.a.getFloat(obj, j);
        }

        @Override // de5.NUlFixed
        public final Object j(Field field) {
            Unsafe unsafe = this.a;
            return i(unsafe.staticFieldOffset(field), unsafe.staticFieldBase(field));
        }

        @Override // de5.NUlFixed
        public final void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // de5.NUlFixed
        public final boolean o() {
            if (!super.o()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                de5.a(th);
                return false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x000d  */
        @Override // de5.NUlFixed
        public final boolean p() {
            boolean z;
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                z = false;
            } else {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    cls.getMethod("getLong", Object.class, Long.TYPE);
                    if (de5.e() == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    de5.a(th);
                }
            }
            if (!z) {
                return false;
            }
            try {
                Class<?> cls2 = unsafe.getClass();
                Class<?> cls3 = Long.TYPE;
                cls2.getMethod("getByte", cls3);
                cls2.getMethod("putByte", cls3, Byte.TYPE);
                cls2.getMethod("getInt", cls3);
                cls2.getMethod("putInt", cls3, Integer.TYPE);
                cls2.getMethod("getLong", cls3);
                cls2.getMethod("putLong", cls3, cls3);
                cls2.getMethod("copyMemory", cls3, cls3, cls3);
                cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                return true;
            } catch (Throwable th2) {
                de5.a(th2);
                return false;
            }
        }
    }

    public static abstract class NUlFixed {
        public final Unsafe a;

        public NUlFixed(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(long j, Object obj);

        public abstract byte d(long j, Object obj);

        public abstract double e(long j, Object obj);

        public abstract float f(long j, Object obj);

        public final int g(long j, Object obj) {
            return this.a.getInt(obj, j);
        }

        public final long h(long j, Object obj) {
            return this.a.getLong(obj, j);
        }

        public final Object i(long j, Object obj) {
            return this.a.getObject(obj, j);
        }

        public abstract Object j(Field field);

        public final long k(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void l(Object obj, long j, byte b);

        public final void m(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void n(long j, Object obj, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean o() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                de5.a(th);
                return false;
            }
        }

        public abstract boolean p();
    }

    public static class QnHx implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    static {
        NUlFixed lPt8;
        Unsafe unsafeP = p();
        a = unsafeP;
        b = DY.a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        if (unsafeP == null) {
            lPt8 = null;
        } else if (!DY.a()) {
            lPt8 = new LPt8Fixed(unsafeP);
        } else if (zF) {
            lPt8 = new F1(unsafeP);
        } else if (zF2) {
            lPt8 = new CQf(unsafeP);
        } else {
            lPt8 = null;
        }
        c = lPt8;
        d = lPt8 == null ? false : lPt8.p();
        e = lPt8 == null ? false : lPt8.o();
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && lPt8 != null) {
            lPt8.k(fieldE);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(de5.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int c(Class<?> cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (DY.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class<?> cls) {
        if (!DY.a()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static boolean g(long j, Object obj) {
        return c.c(j, obj);
    }

    public static byte h(byte[] bArr, long j) {
        return c.d(f + j, bArr);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((m((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte j(long j, Object obj) {
        return (byte) ((m((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static double k(long j, Object obj) {
        return c.e(j, obj);
    }

    public static float l(long j, Object obj) {
        return c.f(j, obj);
    }

    public static int m(long j, Object obj) {
        return c.g(j, obj);
    }

    public static long n(long j, Object obj) {
        return c.h(j, obj);
    }

    public static Object o(long j, Object obj) {
        return c.i(j, obj);
    }

    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new QnHx());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long q(Field field) {
        return c.k(field);
    }

    public static void r(byte[] bArr, long j, byte b2) {
        c.l(bArr, f + j, b2);
    }

    public static void s(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iM = m(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        u(obj, j2, ((255 & b2) << i) | (iM & (~(255 << i))));
    }

    public static void t(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        u(obj, j2, ((255 & b2) << i) | (m(j2, obj) & (~(255 << i))));
    }

    public static void u(Object obj, long j, int i) {
        c.m(obj, j, i);
    }

    public static void v(long j, Object obj, Object obj2) {
        c.n(j, obj, obj2);
    }
}
