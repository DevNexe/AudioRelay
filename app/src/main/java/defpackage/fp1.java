package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.gms.ads.AdRequest;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;
import kotlin.jvm.JvmClassMappingKt;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes.dex */
public class fp1 implements z43, kd2, u53, qf6 {
    public static Context w;
    public static Boolean x;
    public static final /* synthetic */ fp1 y = new fp1();
    public static final zu6 z = new zu6();
    public static final av6 A = new av6();

    public /* synthetic */ fp1() {
    }

    public static final void A(int i, int i2, int[] iArr) {
        if (!(i2 >= 0 && i2 < 67108863)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final String A0(float f) {
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static fv B(fv fvVar) {
        am5 am5Var = CXJ.f;
        KWBB.QnHx qnHx = KWBB.b;
        if (!dv.a(fvVar.b, dv.a)) {
            return fvVar;
        }
        js3 js3Var = (js3) fvVar;
        if (M(js3Var.d, am5Var)) {
            return fvVar;
        }
        float[] fArrA = am5Var.a();
        return new js3(js3Var.a, js3Var.h, am5Var, m0(J(qnHx.a, js3Var.d.a(), fArrA), js3Var.i), js3Var.k, js3Var.m, js3Var.e, js3Var.f, js3Var.g, -1);
    }

    public static final void B0(q94 q94Var, Object obj) {
        Object objH = q94Var.H(obj);
        if (objH instanceof ap.CQf) {
            Object obj2 = ((ap) s0(xr0.w, new cp(q94Var, obj, null))).a;
        } else {
            sd5 sd5Var = sd5.a;
        }
    }

    public static final Bitmap C(bj1 bj1Var) {
        if (bj1Var instanceof ge) {
            return ((ge) bj1Var).a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long C0(long j, long j2) {
        int iD;
        int iE;
        int iD2;
        int iE2 = s55.e(j);
        int iD3 = s55.d(j);
        boolean z2 = false;
        if (s55.e(j2) < s55.d(j) && s55.e(j) < s55.d(j2)) {
            if (s55.e(j2) <= s55.e(j) && s55.d(j) <= s55.d(j2)) {
                iE2 = s55.e(j2);
                iD3 = iE2;
            } else {
                if (s55.e(j) <= s55.e(j2) && s55.d(j2) <= s55.d(j)) {
                    iD = s55.d(j2);
                    iE = s55.e(j2);
                    iD2 = iD - iE;
                    iD3 -= iD2;
                } else {
                    int iE3 = s55.e(j2);
                    if (iE2 < s55.d(j2) && iE3 <= iE2) {
                        z2 = true;
                    }
                    if (z2) {
                        iE2 = s55.e(j2);
                        iD2 = s55.d(j2) - s55.e(j2);
                        iD3 -= iD2;
                    } else {
                        iD3 = s55.e(j2);
                    }
                }
            }
        } else if (iD3 > s55.e(j2)) {
            iE2 -= s55.d(j2) - s55.e(j2);
            iD = s55.d(j2);
            iE = s55.e(j2);
            iD2 = iD - iE;
            iD3 -= iD2;
        }
        return Cz.a(iE2, iD3);
    }

    public static oi0 D(ua0 ua0Var, la0 la0Var, x81 x81Var, int i) {
        if ((i & 1) != 0) {
            la0Var = xr0.w;
        }
        int i2 = (i & 2) != 0 ? 1 : 0;
        la0 la0VarB = ma0.b(ua0Var, la0Var);
        oi0 qz1Var = i2 == 2 ? new qz1(la0VarB, x81Var) : new oi0(la0VarB, true);
        qz1Var.W0(i2, qz1Var, x81Var);
        return qz1Var;
    }

    public static final Object D0(la0 la0Var, x81 x81Var, z80 z80Var) {
        la0 context = z80Var.getContext();
        la0 la0VarG0 = !((Boolean) la0Var.i(Boolean.FALSE, na0.w)).booleanValue() ? context.g0(la0Var) : ma0.a(context, la0Var, false);
        AY.v(la0VarG0);
        if (la0VarG0 == context) {
            u54 u54Var = new u54(z80Var, la0VarG0);
            return kd.E(u54Var, u54Var, x81Var);
        }
        c90.QnHx qnHx = c90.QnHx.w;
        if (ur1.a(la0VarG0.j(qnHx), context.j(qnHx))) {
            od5 od5Var = new od5(z80Var, la0VarG0);
            Object objB = e75.b(la0VarG0, null);
            try {
                return kd.E(od5Var, od5Var, x81Var);
            } finally {
                e75.a(la0VarG0, objB);
            }
        }
        jl0 jl0Var = new jl0(z80Var, la0VarG0);
        try {
            kd.w(ps0.L(ps0.v(jl0Var, jl0Var, x81Var)), sd5.a, null);
            return jl0Var.X0();
        } catch (Throwable th) {
            jl0Var.x(new fq3.QnHx(th));
            throw th;
        }
    }

    public static final int E(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else {
                if (i >= i4) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final Object E0(j81 j81Var, z80 z80Var) {
        yg2 yg2Var = (yg2) z80Var.getContext().j(yg2.QnHx.w);
        if (yg2Var != null) {
            return yg2Var.z(j81Var, z80Var);
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final float F(long j, float f, long j2, long j3) {
        long jL = hH.l(yu.b(j, f), j3);
        float fS = hH.s(hH.l(j2, jL)) + 0.05f;
        float fS2 = hH.s(jL) + 0.05f;
        return Math.max(fS, fS2) / Math.min(fS, fS2);
    }

    public static final UndeliveredElementException G(j81 j81Var, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            j81Var.invoke(obj);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
            }
            Th.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static final void H(ua0 ua0Var, CancellationException cancellationException) {
        la0 la0VarG = ua0Var.g();
        int i = ms1.j;
        ms1 ms1Var = (ms1) la0VarG.j(ms1.CQf.w);
        if (ms1Var != null) {
            ms1Var.m(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + ua0Var).toString());
        }
    }

    public static final void I(nk3 nk3Var, Throwable th) {
        CancellationException cancellationExceptionB = null;
        if (th != null) {
            cancellationExceptionB = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionB == null) {
                cancellationExceptionB = ps0.b("Channel was consumed, consumer had failed", th);
            }
        }
        nk3Var.m(cancellationExceptionB);
    }

    public static final float[] J(float[] fArr, float[] fArr2, float[] fArr3) {
        o0(fArr, fArr2);
        o0(fArr, fArr3);
        return m0(d0(fArr), n0(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final pg2 K(pg2 pg2Var, dj4 dj4Var) {
        return b0(pg2Var, 0.0f, 0.0f, 0.0f, dj4Var, true, 59391);
    }

    public static final pg2 L(pg2 pg2Var) {
        return b0(pg2Var, 0.0f, 0.0f, 0.0f, null, true, 61439);
    }

    public static final boolean M(am5 am5Var, am5 am5Var2) {
        if (am5Var == am5Var2) {
            return true;
        }
        return Math.abs(am5Var.a - am5Var2.a) < 0.001f && Math.abs(am5Var.b - am5Var2.b) < 0.001f;
    }

    public static final int N(long j, long j2) {
        boolean zG0 = g0(j);
        if (zG0 != g0(j2)) {
            return zG0 ? -1 : 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static h60 O(fv fvVar, fv fvVar2, int i) {
        if ((i & 1) != 0) {
            fvVar2 = hv.c;
        }
        if (fvVar == fvVar2) {
            return new g60(fvVar);
        }
        long j = dv.a;
        return (dv.a(fvVar.b, j) && dv.a(fvVar2.b, j)) ? new h60.QnHx((js3) fvVar, (js3) fvVar2, 0) : new h60(fvVar, fvVar2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0166  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    public static final rv1 P(Class cls, rv1... rv1VarArr) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Class[] clsArr;
        rv1 rv1Var;
        rv1 rv1Var2;
        boolean z2;
        rv1 rv1Var3;
        rv1 rv1Var4;
        Object obj2;
        Field field;
        int i = 0;
        if (cls.isEnum()) {
            if (cls.getAnnotation(za4.class) == null && cls.getAnnotation(p93.class) == null) {
                return new qt0(cls.getCanonicalName(), (Enum[]) cls.getEnumConstants());
            }
        }
        if (cls.isInterface()) {
            za4 za4Var = (za4) cls.getAnnotation(za4.class);
            s93 s93Var = (za4Var == null || ur1.a(nl3.a(za4Var.with()), nl3.a(s93.class))) ? new s93(JvmClassMappingKt.getKotlinClass(cls)) : null;
            if (s93Var != null) {
                return s93Var;
            }
        }
        rv1[] rv1VarArr2 = (rv1[]) Arrays.copyOf(rv1VarArr, rv1VarArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            rv1Var = null;
        } else {
            try {
                if (rv1VarArr2.length == 0) {
                    clsArr = new Class[0];
                } else {
                    int length = rv1VarArr2.length;
                    Class[] clsArr2 = new Class[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        clsArr2[i2] = rv1.class;
                    }
                    clsArr = clsArr2;
                }
                Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(rv1VarArr2, rv1VarArr2.length));
                if (objInvoke instanceof rv1) {
                    rv1Var = (rv1) objInvoke;
                } else {
                    rv1Var = null;
                }
            } catch (NoSuchMethodException unused2) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
        }
        if (rv1Var != null) {
            return rv1Var;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        int length2 = declaredFields.length;
        Field field2 = null;
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            if (i3 >= length2) {
                if (!z3) {
                    break;
                }
                break;
            }
            Field field3 = declaredFields[i3];
            if (ur1.a(field3.getName(), "INSTANCE") && ur1.a(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                if (!z3) {
                    field2 = field3;
                    z3 = true;
                }
            }
            i3++;
            field2 = null;
            break;
        }
        if (field2 == null) {
            rv1Var2 = null;
        } else {
            Object obj3 = field2.get(null);
            Method[] methods = cls.getMethods();
            int length3 = methods.length;
            Method method = null;
            int i4 = 0;
            boolean z4 = false;
            while (true) {
                if (i4 >= length3) {
                    if (!z4) {
                        break;
                    }
                    break;
                }
                Method method2 = methods[i4];
                if (!ur1.a(method2.getName(), "serializer")) {
                    z2 = false;
                } else if ((method2.getParameterTypes().length == 0) && ur1.a(method2.getReturnType(), rv1.class)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (!z4) {
                        method = method2;
                        z4 = true;
                    }
                }
                i4++;
                method = null;
                break;
            }
            if (method == null) {
                rv1Var2 = null;
            } else {
                Object objInvoke2 = method.invoke(obj3, new Object[0]);
                if (objInvoke2 instanceof rv1) {
                    rv1Var2 = (rv1) objInvoke2;
                } else {
                    rv1Var2 = null;
                }
            }
        }
        if (rv1Var2 != null) {
            return rv1Var2;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            int length4 = declaredClasses.length;
            boolean z5 = false;
            Class<?> cls2 = null;
            while (true) {
                if (i >= length4) {
                    if (!z5) {
                        break;
                    }
                    break;
                }
                try {
                    Class<?> cls3 = declaredClasses[i];
                    if (ur1.a(cls3.getSimpleName(), "$serializer")) {
                        if (!z5) {
                            cls2 = cls3;
                            z5 = true;
                        }
                    }
                    i++;
                } catch (NoSuchFieldException unused3) {
                    rv1Var3 = null;
                }
                cls2 = null;
                break;
            }
            if (cls2 == null || (field = cls2.getField("INSTANCE")) == null) {
                rv1Var3 = null;
                obj2 = null;
            } else {
                rv1Var3 = null;
                try {
                    obj2 = field.get(null);
                } catch (NoSuchFieldException unused4) {
                }
            }
            rv1Var4 = obj2 instanceof rv1 ? (rv1) obj2 : rv1Var3;
        } catch (NoSuchFieldException unused5) {
            rv1Var3 = null;
        }
        if (rv1Var4 != null) {
            return rv1Var4;
        }
        if (cls.getAnnotation(p93.class) != null) {
            return new s93(JvmClassMappingKt.getKotlinClass(cls));
        }
        za4 za4Var2 = (za4) cls.getAnnotation(za4.class);
        return (za4Var2 == null || !ur1.a(nl3.a(za4Var2.with()), nl3.a(s93.class))) ? rv1Var3 : new s93(JvmClassMappingKt.getKotlinClass(cls));
    }

    public static AOdm Q(AOdm aOdm) {
        float f = ((JW) aOdm.y).a;
        return new AOdm(aOdm.w, Float.valueOf(0.0f), new JW(f), aOdm.z, aOdm.A, aOdm.B);
    }

    public static final Object R(x81 x81Var, z80 z80Var) {
        u54 u54Var = new u54(z80Var, z80Var.getContext());
        return kd.E(u54Var, u54Var, x81Var);
    }

    public static final int S(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static Typeface T(String str, x41 x41Var, int i) {
        if ((i == 0) && ur1.a(x41Var, x41.z)) {
            if (str == null || str.length() == 0) {
                return Typeface.DEFAULT;
            }
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), x41Var.w, i == 1);
    }

    public static final h41 U(Context context) {
        return new h41(new fp1(context), new audiorelay_net(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0));
    }

    public static final pg2 V(pg2 pg2Var, j81 j81Var) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new fo0(j81Var));
    }

    public static final void W(yy1 yy1Var, List list) {
        ui2<yy1> ui2VarT = yy1Var.t();
        int i = ui2VarT.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarT.w;
            int i2 = 0;
            do {
                yy1 yy1Var2 = yy1VarArr[i2];
                z84 z84VarZ = Z(yy1Var2);
                if (z84VarZ != null) {
                    list.add(z84VarZ);
                } else {
                    W(yy1Var2, list);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final Object X(ob2 ob2Var) {
        Object objB = ob2Var.B();
        my1 my1Var = objB instanceof my1 ? (my1) objB : null;
        if (my1Var != null) {
            return my1Var.a();
        }
        return null;
    }

    public static final z84 Y(yy1 yy1Var) {
        z84 z84Var;
        kz1 kz1VarN0 = yy1Var.Z.B;
        while (kz1VarN0 != null && !ym.d(kz1VarN0.O, 2)) {
            kz1VarN0 = kz1VarN0.N0();
        }
        if (kz1VarN0 == null || (z84Var = (z84) kz1VarN0.O[2]) == null) {
            return null;
        }
        kz1 kz1VarN1 = z84Var.w;
        while (kz1VarN1 != null) {
            while (z84Var != null) {
                if (((a94) z84Var.x).z0().x) {
                    return z84Var;
                }
                z84Var = (z84) z84Var.y;
            }
            kz1VarN1 = kz1VarN1.N0();
            z84Var = kz1VarN1 != null ? (z84) kz1VarN1.O[2] : null;
        }
        return null;
    }

    public static final z84 Z(yy1 yy1Var) {
        z84 z84Var;
        kz1 kz1VarN0 = yy1Var.Z.B;
        while (kz1VarN0 != null && !ym.d(kz1VarN0.O, 2)) {
            kz1VarN0 = kz1VarN0.N0();
        }
        if (kz1VarN0 == null || (z84Var = (z84) kz1VarN0.O[2]) == null) {
            return null;
        }
        kz1 kz1VarN1 = z84Var.w;
        while (kz1VarN1 != null) {
            if (z84Var != null) {
                return z84Var;
            }
            kz1VarN1 = kz1VarN1.N0();
            z84Var = kz1VarN1 != null ? (z84) kz1VarN1.O[2] : null;
        }
        return null;
    }

    public static final void a0() {
        z55.b(0L);
    }

    public static pg2 b0(pg2 pg2Var, float f, float f2, float f3, dj4 dj4Var, boolean z2, int i) {
        float f4 = (i & 1) != 0 ? 1.0f : f;
        float f5 = (i & 2) != 0 ? 1.0f : f2;
        float f6 = (i & 4) != 0 ? 1.0f : f3;
        float f7 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 8.0f : 0.0f;
        long j = (i & 1024) != 0 ? m95.b : 0L;
        dj4 dj4Var2 = (i & 2048) != 0 ? el3.a : dj4Var;
        boolean z3 = (i & 4096) != 0 ? false : z2;
        long j2 = (i & 16384) != 0 ? ua1.a : 0L;
        long j3 = (i & 32768) != 0 ? ua1.a : 0L;
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new rk4(f4, f5, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7, j, dj4Var2, z3, j2, j3));
    }

    public static final void c0() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final float[] d0(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final boolean e0(ua0 ua0Var) {
        la0 la0VarG = ua0Var.g();
        int i = ms1.j;
        ms1 ms1Var = (ms1) la0VarG.j(ms1.CQf.w);
        if (ms1Var != null) {
            return ms1Var.c();
        }
        return true;
    }

    public static final boolean f0(AssertionError assertionError) {
        Logger logger = eu2.a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message == null ? false : mv4.y(message, "getsockname failed", false);
    }

    public static final boolean g0(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    public static synchronized boolean h0(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = w;
        if (context2 != null && (bool = x) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        x = null;
        if (x53.a()) {
            x = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                x = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                x = Boolean.FALSE;
            }
        }
        w = applicationContext;
        return x.booleanValue();
    }

    public static AOdm i(float f, float f2, int i) {
        return new AOdm(mg5.a, Float.valueOf(f), new JW((i & 2) != 0 ? 0.0f : f2), (i & 4) != 0 ? Long.MIN_VALUE : 0L, (i & 8) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public static final boolean i0(ku3 ku3Var) {
        long j = ku3Var.e;
        if (ha0.b(j) == ha0.c(j)) {
            float fB = ha0.b(j);
            long j2 = ku3Var.f;
            if (fB == ha0.b(j2)) {
                if (ha0.b(j) == ha0.c(j2)) {
                    float fB2 = ha0.b(j);
                    long j3 = ku3Var.g;
                    if (fB2 == ha0.b(j3)) {
                        if (ha0.b(j) == ha0.c(j3)) {
                            float fB3 = ha0.b(j);
                            long j4 = ku3Var.h;
                            if (fB3 == ha0.b(j4)) {
                                if (ha0.b(j) == ha0.c(j4)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final w80 j(la0 la0Var) {
        if (la0Var.j(ms1.CQf.w) == null) {
            la0Var = la0Var.g0(AY.e());
        }
        return new w80(la0Var);
    }

    public static final qr4 j0(ua0 ua0Var, la0 la0Var, int i, x81 x81Var) {
        la0 la0VarB = ma0.b(ua0Var, la0Var);
        qr4 g22Var = i == 2 ? new g22(la0VarB, x81Var) : new qr4(la0VarB, true);
        g22Var.W0(i, g22Var, x81Var);
        return g22Var;
    }

    public static final long k(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = ym0.c;
        return jFloatToIntBits;
    }

    public static /* synthetic */ qr4 k0(ua0 ua0Var, la0 la0Var, int i, x81 x81Var, int i2) {
        if ((i2 & 1) != 0) {
            la0Var = xr0.w;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return j0(ua0Var, la0Var, i, x81Var);
    }

    public static final long l(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = zm0.d;
        return jFloatToIntBits;
    }

    public static final pg2 l0(String str) {
        wo1.QnHx qnHx = wo1.a;
        return new ly1(str);
    }

    public static final long m(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        int i2 = wv1.r;
        return j;
    }

    public static final float[] m0(float[] fArr, float[] fArr2) {
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        float f6 = f4 * f5;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = f3 * f9;
        float f11 = fArr[7];
        float f12 = f11 * f5;
        float f13 = fArr[2] * f8;
        float f14 = fArr[5];
        float f15 = (fArr2[1] * f14) + f13;
        float f16 = fArr[8];
        float f17 = fArr[0];
        float f18 = fArr2[3] * f17;
        float f19 = fArr2[4];
        float f20 = (f2 * f19) + f18;
        float f21 = fArr2[5];
        float f22 = fArr[1];
        float f23 = fArr2[3];
        float f24 = f9 * f19;
        float f25 = fArr[2];
        float f26 = f14 * fArr2[4];
        float f27 = f17 * fArr2[6];
        float f28 = fArr[3];
        float f29 = fArr2[7];
        float f30 = (f28 * f29) + f27;
        float f31 = fArr2[8];
        float f32 = fArr2[6];
        return new float[]{f6 + (f2 * f3) + f, f12 + f10 + (f7 * f8), (f5 * f16) + f15, (f4 * f21) + f20, (f11 * f21) + f24 + (f22 * f23), (f21 * f16) + f26 + (f23 * f25), (f4 * f31) + f30, (f11 * f31) + (fArr[4] * f29) + (f22 * f32), (f16 * f31) + (fArr[5] * fArr2[7]) + (f25 * f32)};
    }

    public static final ku3 n(float f, float f2, float f3, float f4, long j) {
        long jF = hH.f(ha0.b(j), ha0.c(j));
        return new ku3(f, f2, f3, f4, jF, jF, jF, jF);
    }

    public static final float[] n0(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    public static final void o(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(bj0.a("Index ", i, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void o0(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
    }

    public static final void p(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException(bj0.a("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", i2, ")."));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(ex0.b("fromIndex (", i, ") is less than 0."));
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }

    public static final pg2 p0(pg2 pg2Var, j81 j81Var) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new pu2(j81Var));
    }

    public static final boolean q(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    public static final w80 q0(ua0 ua0Var, la0 la0Var) {
        return new w80(ua0Var.g().g0(la0Var));
    }

    public static final yy1 r(yy1 yy1Var, j81 j81Var) {
        for (yy1 yy1VarS = yy1Var.s(); yy1VarS != null; yy1VarS = yy1VarS.s()) {
            if (((Boolean) j81Var.invoke(yy1VarS)).booleanValue()) {
                return yy1VarS;
            }
        }
        return null;
    }

    public static final l40 r0(g30 g30Var) {
        g30Var.e(-1165786124);
        j30.CQf cQfD = g30Var.D();
        g30Var.G();
        return cQfD;
    }

    public static final int s(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:23:0x0061, B:26:0x0069, B:28:0x0073, B:30:0x007c, B:42:0x009e, B:43:0x00a6), top: B:49:0x0061, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c A[Catch: all -> 0x00a7, LOOP:0: B:49:0x0061->B:30:0x007c, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:23:0x0061, B:26:0x0069, B:28:0x0073, B:30:0x007c, B:42:0x009e, B:43:0x00a6), top: B:49:0x0061, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:19:0x0059, B:33:0x0082, B:46:0x00aa, B:47:0x00af, B:23:0x0061, B:26:0x0069, B:28:0x0073, B:30:0x007c, B:42:0x009e, B:43:0x00a6), top: B:51:0x0059, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0080 A[SYNTHETIC] */
    public static final Object s0(la0 la0Var, x81 x81Var) throws Throwable {
        gu0 gu0VarA;
        la0 la0VarA;
        long jI0;
        Object objG;
        iy iyVar;
        Thread threadCurrentThread = Thread.currentThread();
        c90.QnHx qnHx = c90.QnHx.w;
        c90 c90Var = (c90) la0Var.j(qnHx);
        xr0 xr0Var = xr0.w;
        if (c90Var == null) {
            gu0VarA = f75.a();
            la0VarA = ma0.a(xr0Var, la0Var.g0(gu0VarA), true);
            qh0 qh0Var = rl0.a;
            if (la0VarA != qh0Var && la0VarA.j(qnHx) == null) {
                la0VarA = la0VarA.g0(qh0Var);
            }
        } else {
            if (c90Var instanceof gu0) {
            }
            gu0VarA = f75.a.get();
            la0VarA = ma0.a(xr0Var, la0Var, true);
            qh0 qh0Var2 = rl0.a;
            if (la0VarA != qh0Var2 && la0VarA.j(qnHx) == null) {
                la0VarA = la0VarA.g0(qh0Var2);
            }
        }
        fb fbVar = new fb(la0VarA, threadCurrentThread, gu0VarA);
        fbVar.W0(1, fbVar, x81Var);
        gu0 gu0Var = fbVar.z;
        if (gu0Var == null) {
            while (!Thread.interrupted()) {
                if (gu0Var != null) {
                    jI0 = gu0Var.i0();
                } else {
                    jI0 = Long.MAX_VALUE;
                }
                if (!(!(fbVar.B0() instanceof pj1))) {
                    if (gu0Var != null) {
                        int i = gu0.B;
                        gu0Var.I(false);
                    }
                    objG = ym.g(fbVar.B0());
                    if (objG instanceof iy) {
                        iyVar = (iy) objG;
                    } else {
                        iyVar = null;
                    }
                    if (iyVar == null) {
                        return objG;
                    }
                    throw iyVar.a;
                }
                LockSupport.parkNanos(fbVar, jI0);
            }
            InterruptedException interruptedException = new InterruptedException();
            fbVar.V(interruptedException);
            throw interruptedException;
        }
        int i2 = gu0.B;
        gu0Var.Z(false);
        while (!Thread.interrupted()) {
            try {
                if (gu0Var != null) {
                    jI0 = gu0Var.i0();
                } else {
                    jI0 = Long.MAX_VALUE;
                }
                if (!(!(fbVar.B0() instanceof pj1))) {
                    if (gu0Var != null) {
                        int i3 = gu0.B;
                        gu0Var.I(false);
                    }
                    objG = ym.g(fbVar.B0());
                    if (objG instanceof iy) {
                        iyVar = (iy) objG;
                    } else {
                        iyVar = null;
                    }
                    if (iyVar == null) {
                        return objG;
                    }
                    throw iyVar.a;
                }
                LockSupport.parkNanos(fbVar, jI0);
            } catch (Throwable th) {
                if (gu0Var != null) {
                    int i4 = gu0.B;
                    gu0Var.I(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException2 = new InterruptedException();
        fbVar.V(interruptedException2);
        throw interruptedException2;
        throw th;
    }

    public static final boolean t(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    public static final int t0(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((Z1) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iB = ur1.b(i5, i);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final boolean u(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final Object u0(r21 r21Var, int i, j81 j81Var) {
        x9 x9Var = r21Var.D;
        if (x9Var == null) {
            return null;
        }
        int i2 = 1;
        if (i == 5) {
            i2 = 5;
        } else {
            if (i == 6) {
                i2 = 6;
            } else {
                if (i == 3) {
                    i2 = 3;
                } else {
                    if (i == 4) {
                        i2 = 4;
                    } else {
                        if (i == 1) {
                            i2 = 2;
                        } else {
                            if (!(i == 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                            }
                        }
                    }
                }
            }
        }
        return x9Var.a(i2, j81Var);
    }

    public static final int v(ArrayList arrayList, int i, int i2) {
        int iT0 = t0(arrayList, i, i2);
        return iT0 >= 0 ? iT0 : -(iT0 + 1);
    }

    public static final long v0(String str, long j, long j2, long j3) {
        String property;
        int i = qz4.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lP = hv4.p(property);
        if (lP == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lP.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final int w(long j) {
        int i;
        if ((4294967295L & j) == 0) {
            i = 32;
            j >>= 32;
        } else {
            i = 0;
        }
        if ((65535 & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i;
        }
        if ((2 & j) != 0) {
            return i + 1;
        }
        if ((4 & j) != 0) {
            return i + 2;
        }
        if ((j & 8) != 0) {
            return i + 3;
        }
        return -1;
    }

    public static int w0(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) v0(str, i, i2, i3);
    }

    public static final int x(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final BlendMode x0(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int y(int[] iArr, int i) {
        int i2 = i * 5;
        return S(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final Bitmap.Config y0(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            if (i == 3) {
                return Bitmap.Config.RGBA_F16;
            }
        }
        if (i2 >= 26) {
            if (i == 4) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final void z(int i, int i2, int[] iArr) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        iArr[(i * 5) + 3] = i2;
    }

    public static final PorterDuff.Mode z0(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    @Override // defpackage.kd2
    public void a(String str) {
    }

    @Override // defpackage.kd2
    public void b(String str) {
    }

    @Override // defpackage.u53
    public Typeface c(x41 x41Var, int i) {
        return T(null, x41Var, i);
    }

    @Override // defpackage.kd2
    public void d(String str, Throwable th) {
    }

    @Override // defpackage.kd2
    public void e(String str) {
    }

    @Override // defpackage.u53
    public Typeface f(ba1 ba1Var, x41 x41Var, int i) {
        return T(ba1Var.x, x41Var, i);
    }

    @Override // defpackage.kd2
    public void g(String str) {
    }

    @Override // defpackage.z43
    public void h() {
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(((j77) h77.x.w.zza()).zzb());
    }

    public /* synthetic */ fp1(Context context) {
        context.getApplicationContext();
    }
}
