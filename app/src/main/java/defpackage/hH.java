package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.inputmethod.ExtractedText;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzzg;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hH implements dl5 {
    public static ej1 w;
    public static ej1 x;
    public static final int[] y = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public /* synthetic */ hH() {
        for (int i = 0; i < 65535; i++) {
            double d = i - 32768;
            double dSignum = Math.signum(d);
            ps0.w[i] = (short) ((1.240769E-22d - ((((double) 1) - Math.exp((d * (-1.408133E-4d)) * dSignum)) * (-33095.02724529572d))) * dSignum);
        }
    }

    public static final int A(long j) {
        fv fvVarF = yu.f(j);
        if (fvVarF.d()) {
            return (int) (j >>> 32);
        }
        float[] fArrN = n(j);
        fp1.O(fvVarF, null, 3).a(fArrN);
        return ((int) ((fArrN[2] * 255.0f) + 0.5f)) | (((int) ((fArrN[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArrN[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrN[1] * 255.0f) + 0.5f)) << 8);
    }

    public static final ExtractedText B(x45 x45Var) {
        ExtractedText extractedText = new ExtractedText();
        Z7jl z7jl = x45Var.a;
        String str = z7jl.w;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = x45Var.b;
        extractedText.selectionStart = s55.e(j);
        extractedText.selectionEnd = s55.d(j);
        extractedText.flags = !mv4.z(z7jl.w, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void C(y83 y83Var, long j, j81 j81Var, boolean z) {
        zp1 zp1Var = y83Var.b;
        MotionEvent motionEvent = zp1Var != null ? zp1Var.b.b : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-kt2.c(j), -kt2.d(j));
        j81Var.invoke(motionEvent);
        motionEvent.offsetLocation(kt2.c(j), kt2.d(j));
        motionEvent.setAction(action);
    }

    public static String D(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        return i == 3 ? "Sentences" : "Invalid";
    }

    public static nb5 E(int i, int i2, mq0 mq0Var, int i3) {
        if ((i3 & 1) != 0) {
            i = RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            mq0Var = nq0.a;
        }
        return new nb5(i, i2, mq0Var);
    }

    public static final void F(ig1 ig1Var, String str, String str2, Integer num, String str3, j81 j81Var) {
        zc5 zc5Var = ig1Var.a;
        if (str != null) {
            cd5 cd5Var = cd5.c;
            zc5Var.a = cd5.QnHx.a(str);
        }
        if (str2 != null) {
            zc5Var.b = str2;
        }
        if (num != null) {
            zc5Var.c = num.intValue();
        }
        if (str3 != null) {
            C0239D.F(zc5Var, str3);
        }
        j81Var.invoke(zc5Var);
    }

    public static boolean G(zzzg zzzgVar, boolean z) {
        boolean z2;
        long jZzr;
        int i;
        long jZzd = zzzgVar.zzd();
        long j = 4096;
        long j2 = -1;
        if (jZzd != -1 && jZzd <= 4096) {
            j = jZzd;
        }
        int i2 = (int) j;
        zzed zzedVar = new zzed(64);
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            if (i3 < i2) {
                zzedVar.zzC(8);
                if (zzzgVar.zzm(zzedVar.zzH(), z3 ? 1 : 0, 8, true)) {
                    long jZzs = zzedVar.zzs();
                    int iZze = zzedVar.zze();
                    if (jZzs == 1) {
                        zzzgVar.zzh(zzedVar.zzH(), 8, 8);
                        i = 16;
                        zzedVar.zzE(16);
                        jZzr = zzedVar.zzr();
                    } else {
                        if (jZzs == 0) {
                            long jZzd2 = zzzgVar.zzd();
                            if (jZzd2 != j2) {
                                jZzs = (jZzd2 - zzzgVar.zze()) + 8;
                            }
                        }
                        jZzr = jZzs;
                        i = 8;
                    }
                    long j3 = i;
                    if (jZzr < j3) {
                        return z3;
                    }
                    i3 += i;
                    if (iZze == 1836019574) {
                        i2 += (int) jZzr;
                        if (jZzd != -1 && i2 > jZzd) {
                            i2 = (int) jZzd;
                        }
                        j2 = -1;
                    } else {
                        if (iZze == 1836019558 || iZze == 1836475768) {
                            z2 = true;
                            return z4 && z == z2;
                        }
                        if ((((long) i3) + jZzr) - j3 < i2) {
                            int i4 = (int) (jZzr - j3);
                            i3 += i4;
                            if (iZze == 1718909296) {
                                if (i4 < 8) {
                                    return false;
                                }
                                zzedVar.zzC(i4);
                                zzzgVar.zzh(zzedVar.zzH(), 0, i4);
                                int i5 = i4 >> 2;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if (i6 != 1) {
                                        int iZze2 = zzedVar.zze();
                                        if ((iZze2 >>> 8) != 3368816) {
                                            if (iZze2 == 1751476579) {
                                                iZze2 = 1751476579;
                                            }
                                            int[] iArr = y;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 >= 29) {
                                                    continue;
                                                } else if (iArr[i7] != iZze2) {
                                                    i7++;
                                                }
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    }
                                    zzedVar.zzG(4);
                                }
                                if (!z4) {
                                    return false;
                                }
                            } else if (i4 != 0) {
                                zzzgVar.zzg(i4);
                            }
                            j2 = -1;
                            z3 = false;
                        }
                    }
                }
            }
            z2 = false;
            if (z4) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    public static final long b(float f, float f2, float f3, float f4, fv fvVar) {
        boolean z;
        if (f <= fvVar.b(0) && fvVar.c(0) <= f) {
            if (f2 <= fvVar.b(1) && fvVar.c(1) <= f2) {
                if (f3 <= fvVar.b(2) && fvVar.c(2) <= f3) {
                    if (0.0f <= f4 && f4 <= 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + fvVar).toString());
        }
        if (fvVar.d()) {
            long j = (((long) ((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f)))) & 4294967295L) << 32;
            int i = yu.i;
            return j;
        }
        int i2 = dv.e;
        if (!(((int) (fvVar.b >> 32)) == 3)) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
        }
        int i3 = fvVar.c;
        if (!(i3 != -1)) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
        }
        long jA = ((((long) uy0.a(f2)) & 65535) << 32) | ((((long) uy0.a(f)) & 65535) << 48) | ((((long) uy0.a(f3)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i3) & 63);
        int i4 = yu.i;
        return jA;
    }

    public static final long c(int i) {
        long j = ((long) i) << 32;
        int i2 = yu.i;
        return j;
    }

    public static final long d(long j) {
        long j2 = (j & 4294967295L) << 32;
        int i = yu.i;
        return j2;
    }

    public static long e(int i, int i2, int i3) {
        return c(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long f(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = ha0.b;
        return jFloatToIntBits;
    }

    public static final TQ2_ g() {
        return new TQ2_(0);
    }

    public static final dl3 h(long j, long j2) {
        return new dl3(kt2.c(j), kt2.d(j), cm4.e(j2) + kt2.c(j), cm4.c(j2) + kt2.d(j));
    }

    public static final void i(pg2 pg2Var, g30 g30Var, int i) {
        g30Var.e(-72882467);
        oq4 oq4Var = oq4.a;
        g30Var.e(-1323940314);
        ij0 ij0Var = (ij0) g30Var.E(r40.e);
        jy1 jy1Var = (jy1) g30Var.E(r40.k);
        ti5 ti5Var = (ti5) g30Var.E(r40.o);
        a30.e.getClass();
        yy1.QnHx qnHx = a30.QnHx.b;
        sz szVarJ = S12N.j(pg2Var);
        int i2 = (((((i << 3) & 112) | 384) << 9) & 7168) | 6;
        if (!(g30Var.v() instanceof jE)) {
            fp1.c0();
            throw null;
        }
        g30Var.s();
        if (g30Var.m()) {
            g30Var.l(qnHx);
        } else {
            g30Var.A();
        }
        g30Var.u();
        u(g30Var, oq4Var, a30.QnHx.e);
        u(g30Var, ij0Var, a30.QnHx.d);
        u(g30Var, jy1Var, a30.QnHx.f);
        szVarJ.invoke(bl2.b(g30Var, ti5Var, a30.QnHx.g, g30Var), g30Var, Integer.valueOf((i2 >> 3) & 112));
        g30Var.e(2058660585);
        g30Var.e(1142320198);
        if (((i2 >> 9) & 14 & 11) == 2 && g30Var.t()) {
            g30Var.x();
        }
        ex0.d(g30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ri2 j(boolean z, boolean z2, wp1 wp1Var, k25 k25Var, float f, float f2, g30 g30Var, int i) {
        is4 is4VarF0;
        g30Var.e(1097899920);
        ri2 ri2VarA = m21.a(wp1Var, g30Var, (i >> 6) & 14);
        is4<yu> is4VarA = k25Var.a(z, z2, wp1Var, g30Var, (i & 14) | (i & 112) | (i & 896) | (i & 7168));
        if (!((Boolean) ri2VarA.getValue()).booleanValue()) {
            f = f2;
        }
        if (z) {
            g30Var.e(1685712037);
            is4VarF0 = WDjj.a(f, E(150, 0, null, 6), g30Var, 48, 4);
            g30Var.G();
        } else {
            g30Var.e(1685712135);
            is4VarF0 = ps0.f0(new wm0(f2), g30Var);
            g30Var.G();
        }
        ri2 ri2VarF0 = ps0.f0(new nd(((wm0) is4VarF0.getValue()).w, new jq4(is4VarA.getValue().a)), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    public static final pg2 k(pg2 pg2Var, float f) {
        return !((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ? fp1.b0(pg2Var, 0.0f, 0.0f, f, null, true, 61435) : pg2Var;
    }

    public static final long l(long j, long j2) {
        float f;
        float f2;
        long jA = yu.a(j, yu.f(j2));
        float fD = yu.d(j2);
        float fD2 = yu.d(jA);
        float f3 = 1.0f - fD2;
        float f4 = (fD * f3) + fD2;
        float fH = yu.h(jA);
        float fH2 = yu.h(j2);
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fH2 * fD) * f3) + (fH * fD2)) / f4;
        }
        float fG = yu.g(jA);
        float fG2 = yu.g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fD) * f3) + (fG * fD2)) / f4;
        }
        return b(f, f2, f4 == 0.0f ? 0.0f : (((yu.e(j2) * fD) * f3) + (yu.e(jA) * fD2)) / f4, f4, yu.f(j2));
    }

    public static final n74 m(long j, boolean z, long j2, o55 o55Var) {
        int i = s55.c;
        int i2 = (int) (j >> 32);
        return new n74(new n74.QnHx(o55Var.a(i2), i2, j2), new n74.QnHx(o55Var.a(Math.max(s55.c(j) - 1, 0)), s55.c(j), j2), z);
    }

    public static final float[] n(long j) {
        return new float[]{yu.h(j), yu.g(j), yu.e(j), yu.d(j)};
    }

    public static final int o(o55 o55Var, dl3 dl3Var, long j) {
        int length = o55Var.a.a.length();
        if (dl3Var.a(j)) {
            return AY.o(o55Var.l(j), 0, length);
        }
        if (p84.w.a(j, dl3Var) < 0) {
            return 0;
        }
        return length;
    }

    public static final ej1 p() {
        ej1 ej1Var = x;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.OpenInNew");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(19.0f, 19.0f);
        le3Var.e(5.0f);
        le3Var.m(5.0f);
        le3Var.f(7.0f);
        le3Var.m(3.0f);
        le3Var.e(5.0f);
        le3Var.d(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        le3Var.n(14.0f);
        le3Var.d(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        le3Var.f(14.0f);
        le3Var.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        le3Var.n(-7.0f);
        le3Var.f(-2.0f);
        le3Var.n(7.0f);
        le3Var.b();
        le3Var.i(14.0f, 3.0f);
        le3Var.n(2.0f);
        le3Var.f(3.59f);
        le3Var.h(-9.83f, 9.83f);
        le3Var.h(1.41f, 1.41f);
        le3Var.g(19.0f, 6.41f);
        le3Var.m(10.0f);
        le3Var.f(2.0f);
        le3Var.m(3.0f);
        le3Var.f(-7.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        x = ej1VarD;
        return ej1VarD;
    }

    public static ak1 q(hq0 hq0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return new ak1(hq0Var, i, (i2 & 4) != 0 ? 0 : 0L);
    }

    public static final long r(long j, long j2, float f) {
        fu2 fu2Var = hv.t;
        long jA = yu.a(j, fu2Var);
        long jA2 = yu.a(j2, fu2Var);
        float fD = yu.d(jA);
        float fH = yu.h(jA);
        float fG = yu.g(jA);
        float fE = yu.e(jA);
        float fD2 = yu.d(jA2);
        float fH2 = yu.h(jA2);
        float fG2 = yu.g(jA2);
        float fE2 = yu.e(jA2);
        return yu.a(b(C0239D.y(fH, fH2, f), C0239D.y(fG, fG2, f), C0239D.y(fE, fE2, f), C0239D.y(fD, fD2, f), fu2Var), yu.f(j2));
    }

    public static final float s(long j) {
        fv fvVarF = yu.f(j);
        if (!dv.a(fvVarF.b, dv.a)) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) dv.b(fvVarF.b))).toString());
        }
        Double dValueOf = Double.valueOf(yu.h(j));
        js3.byN byn = ((js3) fvVarF).n;
        double dDoubleValue = ((Number) byn.invoke(dValueOf)).doubleValue();
        float fDoubleValue = (float) ((((Number) byn.invoke(Double.valueOf(yu.e(j)))).doubleValue() * 0.0722d) + (((Number) byn.invoke(Double.valueOf(yu.g(j)))).doubleValue() * 0.7152d) + (dDoubleValue * 0.2126d));
        if (fDoubleValue <= 0.0f) {
            return 0.0f;
        }
        if (fDoubleValue >= 1.0f) {
            return 1.0f;
        }
        return fDoubleValue;
    }

    public static pg2 t(pg2 pg2Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new nt2(f, f2));
    }

    public static final void u(g30 g30Var, Object obj, x81 x81Var) {
        if (g30Var.m() || !ur1.a(g30Var.f(), obj)) {
            g30Var.B(obj);
            g30Var.n(obj, x81Var);
        }
    }

    public static final String v(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static hr4 w(float f, Object obj, int i) {
        float f2 = (i & 1) != 0 ? 1.0f : 0.0f;
        if ((i & 2) != 0) {
            f = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new hr4(f2, f, obj);
    }

    public static final String x(int i, g30 g30Var) {
        g30Var.E(Ll.a);
        return ((Context) g30Var.E(Ll.b)).getResources().getString(i);
    }

    public static final String y(int i, Object[] objArr, g30 g30Var) {
        g30Var.E(Ll.a);
        return ((Context) g30Var.E(Ll.b)).getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final Rect z(dl3 dl3Var) {
        return new Rect((int) dl3Var.a, (int) dl3Var.b, (int) dl3Var.c, (int) dl3Var.d);
    }

    @Override // defpackage.dl5
    public void a(qk qkVar) {
        int i = qkVar.b;
        for (int i2 = i; i2 < qkVar.c + i; i2 += 2) {
            int i3 = i2 + 1;
            byte[] bArr = qkVar.a;
            short s = ps0.w[Math.min(((short) (((short) (((short) (bArr[i3] & 255)) << 8)) | ((short) (bArr[i2] & 255)))) + Short.MIN_VALUE, 65534)];
            bArr[i2] = (byte) s;
            bArr[i3] = (byte) (s >> 8);
        }
    }
}
