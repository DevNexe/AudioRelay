package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class Aa extends RBi {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    public class QnHx implements PrivilegedExceptionAction<Unsafe> {
        public static final Unsafe a() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new QnHx());
            }
            try {
                c = unsafe.objectFieldOffset(zzfxf.class.getDeclaredField("y"));
                b = unsafe.objectFieldOffset(zzfxf.class.getDeclaredField("x"));
                d = unsafe.objectFieldOffset(zzfxf.class.getDeclaredField("w"));
                e = unsafe.objectFieldOffset(WE.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(WE.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (PrivilegedActionException e4) {
            throw new RuntimeException("Could not initialize intrinsics", e4.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final Xn1 a(zzfxf zzfxfVar, Xn1 xn1) {
        Xn1 xn2;
        do {
            xn2 = zzfxfVar.x;
            if (xn1 == xn2) {
                return xn2;
            }
        } while (!e(zzfxfVar, xn2, xn1));
        return xn2;
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final WE b(zzfxf zzfxfVar) {
        WE we;
        WE we2 = WE.c;
        do {
            we = zzfxfVar.y;
            if (we2 == we) {
                return we;
            }
        } while (!g(zzfxfVar, we, we2));
        return we;
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final void c(WE we, @CheckForNull WE we2) {
        a.putObject(we, f, we2);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final void d(WE we, Thread thread) {
        a.putObject(we, e, thread);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean e(zzfxf zzfxfVar, @CheckForNull Xn1 xn1, Xn1 xn2) {
        return zzfxh.zza(a, zzfxfVar, b, xn1, xn2);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean f(zzfxf zzfxfVar, @CheckForNull Object obj, Object obj2) {
        return zzfxh.zza(a, zzfxfVar, d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean g(zzfxf zzfxfVar, @CheckForNull WE we, @CheckForNull WE we2) {
        return zzfxh.zza(a, zzfxfVar, c, we, we2);
    }
}
