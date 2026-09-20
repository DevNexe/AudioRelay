package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.view.View;
import com.revenuecat.purchases.common.UtilsKt;
import io.ktor.utils.io.core.InsufficientSpaceException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public class ps0 implements qf6 {
    public static final short[] w = new short[65535];
    public static final /* synthetic */ ps0 x = new ps0();

    public static final long A(long j) {
        long j2 = j << 1;
        gq0.QnHx qnHx = gq0.x;
        int i = iq0.a;
        return j2;
    }

    public static final void B(CharsetEncoder charsetEncoder, pw2 pw2Var, CharSequence charSequence, int i, int i2) {
        int i3;
        if (i >= i2) {
            return;
        }
        oq oqVarI = YKK.i(pw2Var, 1, null);
        while (true) {
            try {
                int iB = sp.b(charsetEncoder, charSequence, i, i2, oqVarI);
                if (!(iB >= 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i += iB;
                if (i >= i2) {
                    i3 = 0;
                } else {
                    i3 = iB == 0 ? 8 : 1;
                }
                if (i3 > 0) {
                    oqVarI = YKK.i(pw2Var, i3, oqVarI);
                } else {
                    pw2Var.b();
                    oq oqVarI2 = YKK.i(pw2Var, 1, null);
                    int i4 = 1;
                    while (true) {
                        try {
                            i4 = sp.a(charsetEncoder, oqVarI2) ? 0 : i4 + 1;
                            if (!(i4 > 0)) {
                                pw2Var.b();
                                return;
                            }
                            oqVarI2 = YKK.i(pw2Var, 1, oqVarI2);
                        } catch (Throwable th) {
                            pw2Var.b();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                pw2Var.b();
                throw th2;
            }
        }
    }

    public static final int C(ByteBuffer byteBuffer, CharSequence charSequence, int i, int i2, int i3, int i4) {
        char c;
        short s;
        short s2;
        short s3;
        int i5;
        int i6;
        int i7;
        int i8;
        int iMin = Math.min(i2, i + 65535);
        int i9 = i4;
        if (i9 > 65535) {
            i9 = 65535;
        }
        int i10 = i;
        int i11 = i3;
        while (i11 < i9 && i10 < iMin) {
            int i12 = i10 + 1;
            int iCharAt = charSequence.charAt(i10) & 65535;
            if ((65408 & iCharAt) != 0) {
                int i13 = i12 - 1;
                int i14 = i9 - 3;
                while (true) {
                    c = 56320;
                    boolean z = false;
                    if (i14 - i11 <= 0 || i13 >= iMin) {
                        break;
                    }
                    int i15 = i13 + 1;
                    char cCharAt = charSequence.charAt(i13);
                    if (Character.isHighSurrogate(cCharAt)) {
                        if (i15 == iMin || !Character.isLowSurrogate(charSequence.charAt(i15))) {
                            i7 = 63;
                        } else {
                            int iCharAt2 = ((cCharAt - 55232) << 10) | (charSequence.charAt(i15) - 56320);
                            i15++;
                            i7 = iCharAt2;
                        }
                    }
                    if (i7 >= 0 && i7 < 128) {
                        byteBuffer.put(i11, (byte) i7);
                        i8 = 1;
                    } else {
                        if (128 <= i7 && i7 < 2048) {
                            byteBuffer.put(i11, (byte) (((i7 >> 6) & 31) | 192));
                            byteBuffer.put(i11 + 1, (byte) ((i7 & 63) | 128));
                            i8 = 2;
                        } else {
                            if (2048 <= i7 && i7 < 65536) {
                                byteBuffer.put(i11, (byte) (((i7 >> 12) & 15) | 224));
                                byteBuffer.put(i11 + 1, (byte) (((i7 >> 6) & 63) | 128));
                                byteBuffer.put(i11 + 2, (byte) ((i7 & 63) | 128));
                                i8 = 3;
                            } else {
                                if (65536 <= i7 && i7 < 1114112) {
                                    z = true;
                                }
                                if (!z) {
                                    N(i7);
                                    throw null;
                                }
                                byteBuffer.put(i11, (byte) (((i7 >> 18) & 7) | 240));
                                byteBuffer.put(i11 + 1, (byte) (((i7 >> 12) & 63) | 128));
                                byteBuffer.put(i11 + 2, (byte) (((i7 >> 6) & 63) | 128));
                                byteBuffer.put(i11 + 3, (byte) ((i7 & 63) | 128));
                                i8 = 4;
                            }
                        }
                    }
                    i11 += i8;
                    i13 = i15;
                }
                if (i11 == i14) {
                    while (true) {
                        int i16 = i9 - i11;
                        if (i16 <= 0 || i13 >= iMin) {
                            break;
                        }
                        int i17 = i13 + 1;
                        char cCharAt2 = charSequence.charAt(i13);
                        if (Character.isHighSurrogate(cCharAt2)) {
                            if (i17 == iMin || !Character.isLowSurrogate(charSequence.charAt(i17))) {
                                i5 = 63;
                            } else {
                                int iCharAt3 = ((cCharAt2 - 55232) << 10) | (charSequence.charAt(i17) - c);
                                i17++;
                                i5 = iCharAt3;
                            }
                        }
                        i5 = cCharAt2;
                        int i18 = 1;
                        if (!(1 <= i5 && i5 < 128)) {
                            if (128 <= i5 && i5 < 2048) {
                                i18 = 2;
                            } else {
                                if (2048 <= i5 && i5 < 65536) {
                                    i18 = 3;
                                } else {
                                    if (!(65536 <= i5 && i5 < 1114112)) {
                                        N(i5);
                                        throw null;
                                    }
                                    i18 = 4;
                                }
                            }
                        }
                        if (i18 > i16) {
                            i13 = i17 - 1;
                            break;
                        }
                        if (i5 >= 0 && i5 < 128) {
                            byteBuffer.put(i11, (byte) i5);
                            i6 = 1;
                        } else {
                            if (128 <= i5 && i5 < 2048) {
                                byteBuffer.put(i11, (byte) (((i5 >> 6) & 31) | 192));
                                byteBuffer.put(i11 + 1, (byte) ((i5 & 63) | 128));
                                i6 = 2;
                            } else {
                                if (2048 <= i5 && i5 < 65536) {
                                    byteBuffer.put(i11, (byte) (((i5 >> 12) & 15) | 224));
                                    byteBuffer.put(i11 + 1, (byte) (((i5 >> 6) & 63) | 128));
                                    byteBuffer.put(i11 + 2, (byte) ((i5 & 63) | 128));
                                    i6 = 3;
                                } else {
                                    if (!(65536 <= i5 && i5 < 1114112)) {
                                        N(i5);
                                        throw null;
                                    }
                                    byteBuffer.put(i11, (byte) (((i5 >> 18) & 7) | 240));
                                    byteBuffer.put(i11 + 1, (byte) (((i5 >> 12) & 63) | 128));
                                    byteBuffer.put(i11 + 2, (byte) (((i5 >> 6) & 63) | 128));
                                    byteBuffer.put(i11 + 3, (byte) ((i5 & 63) | 128));
                                    i6 = 4;
                                }
                            }
                        }
                        i11 += i6;
                        i13 = i17;
                        c = 56320;
                    }
                    s2 = (short) (i13 - i);
                    s3 = (short) (i11 - i3);
                    s = 65535;
                } else {
                    s = 65535;
                    s2 = (short) (i13 - i);
                    s3 = (short) (i11 - i3);
                }
                return ((s2 & s) << 16) | (s3 & s);
            }
            byteBuffer.put(i11, (byte) iCharAt);
            i10 = i12;
            i11++;
        }
        return ((((short) (i10 - i)) & 65535) << 16) | (((short) (i11 - i3)) & 65535);
    }

    public static final yy1 D(yy1 yy1Var, j81 j81Var) {
        if (((Boolean) j81Var.invoke(yy1Var)).booleanValue()) {
            return yy1Var;
        }
        ui2.QnHx qnHx = (ui2.QnHx) yy1Var.q();
        int i = qnHx.w.y;
        for (int i2 = 0; i2 < i; i2++) {
            yy1 yy1VarD = D((yy1) qnHx.get(i2), j81Var);
            if (yy1VarD != null) {
                return yy1VarD;
            }
        }
        return null;
    }

    public static final void E(yy1 yy1Var, List list) {
        ArrayList arrayList;
        if (yy1Var.E()) {
            ArrayList arrayList2 = new ArrayList();
            ui2.QnHx qnHx = (ui2.QnHx) yy1Var.q();
            int i = qnHx.w.y;
            for (int i2 = 0; i2 < i; i2++) {
                yy1 yy1Var2 = (yy1) qnHx.get(i2);
                if (yy1Var2.E()) {
                    arrayList2.add(new wo2(yy1Var, yy1Var2));
                }
            }
            try {
                wo2.A = 1;
                arrayList = new ArrayList(arrayList2);
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList);
                }
            } catch (IllegalArgumentException unused) {
                wo2.A = 2;
                arrayList = new ArrayList(arrayList2);
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(((wo2) arrayList.get(i3)).x);
            }
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                yy1 yy1Var3 = (yy1) arrayList3.get(i4);
                z84 z84VarZ = fp1.Z(yy1Var3);
                if (z84VarZ != null) {
                    list.add(z84VarZ);
                } else {
                    E(yy1Var3, list);
                }
            }
        }
    }

    public static final iy1 F(iy1 iy1Var) {
        iy1 iy1Var2;
        kz1 kz1VarG = iy1Var.G();
        while (true) {
            kz1 kz1Var = kz1VarG;
            iy1Var2 = iy1Var;
            iy1Var = kz1Var;
            if (iy1Var == null) {
                break;
            }
            kz1VarG = iy1Var.G();
        }
        kz1 kz1Var2 = iy1Var2 instanceof kz1 ? (kz1) iy1Var2 : null;
        if (kz1Var2 == null) {
            return iy1Var2;
        }
        kz1 kz1Var3 = kz1Var2.B;
        while (true) {
            kz1 kz1Var4 = kz1Var3;
            kz1 kz1Var5 = kz1Var2;
            kz1Var2 = kz1Var4;
            if (kz1Var2 == null) {
                return kz1Var5;
            }
            kz1Var3 = kz1Var2.B;
        }
    }

    public static final kz1 G(yy1 yy1Var) {
        kz1 kz1Var;
        z84 z84VarY = fp1.Y(yy1Var);
        if (z84VarY == null) {
            z84VarY = fp1.Z(yy1Var);
        }
        return (z84VarY == null || (kz1Var = z84VarY.w) == null) ? yy1Var.Y : kz1Var;
    }

    public static final long H(long j) {
        return X.a(cm4.e(j) / 2.0f, cm4.c(j) / 2.0f);
    }

    public static final int I(int i, String str) {
        String property;
        Integer numO;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat(str));
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (numO = hv4.o(property)) == null) ? i : numO.intValue();
    }

    public static final int J(List list) {
        return list.size() - 1;
    }

    public static final void K(la0 la0Var, Throwable th) {
        try {
            pa0 pa0Var = (pa0) la0Var.j(pa0.QnHx.w);
            if (pa0Var != null) {
                pa0Var.M(la0Var, th);
            } else {
                ra0.a(la0Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                Th.a(runtimeException, th);
                th = runtimeException;
            }
            ra0.a(la0Var, th);
        }
    }

    public static final z80 L(z80 z80Var) {
        b90 b90Var = z80Var instanceof b90 ? (b90) z80Var : null;
        if (b90Var != null && (z80Var = b90Var.y) == null) {
            c90 c90Var = (c90) b90Var.getContext().j(c90.QnHx.w);
            if (c90Var == null || (z80Var = c90Var.y(b90Var)) == null) {
                z80Var = b90Var;
            }
            b90Var.y = z80Var;
        }
        return z80Var;
    }

    public static final List M(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : cs0.w;
    }

    public static final void N(int i) {
        throw new IllegalArgumentException(ex0.b("Malformed code-point ", i, " found"));
    }

    public static final long O(long j) {
        return j * ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    public static final ArrayList P(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new hello(objArr, true));
    }

    public static final kz2 Q(Object obj, rp4 rp4Var) {
        int i = UZK.a;
        return new kz2(obj, rp4Var);
    }

    public static /* synthetic */ kz2 R(Object obj) {
        return Q(obj, tv4.a);
    }

    public static final List S(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : Collections.singletonList(list.get(0));
        }
        return cs0.w;
    }

    public static final pg2 T(pg2 pg2Var, float f) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new zx2(f, f, f, f));
    }

    public static final pg2 U(pg2 pg2Var, float f, float f2) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new zx2(f, f2, f, f2));
    }

    public static pg2 V(pg2 pg2Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return U(pg2Var, f, f2);
    }

    public static final pg2 W(pg2 pg2Var, float f, float f2, float f3, float f4) {
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new zx2(f, f2, f3, f4));
    }

    public static pg2 X(pg2 pg2Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return W(pg2Var, f, f2, f3, f4);
    }

    public static pg2 Y(pg2 pg2Var, sy2 sy2Var, One one, m80 m80Var, float f, av avVar, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            one = One.QnHx.e;
        }
        One one2 = one;
        if ((i & 8) != 0) {
            m80Var = m80.QnHx.b;
        }
        m80 m80Var2 = m80Var;
        float f2 = (i & 16) != 0 ? 1.0f : f;
        if ((i & 32) != 0) {
            avVar = null;
        }
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new ty2(sy2Var, z, one2, m80Var2, f2, avVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long Z(String str) {
        boolean z;
        int length = str.length();
        int i = (length <= 0 || !mv4.z("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            pp1 pp1Var = new pp1(i, mv4.B(str));
            if (!(pp1Var instanceof Collection) || !((Collection) pp1Var).isEmpty()) {
                op1 op1VarF = pp1Var.iterator();
                while (true) {
                    if (!op1VarF.y) {
                        z = true;
                        break;
                    }
                    if (!new op('0', '9').f(str.charAt(op1VarF.nextInt()))) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        if (iv4.x(str, "+", false)) {
            str = pv4.Y(1, str);
        }
        return Long.parseLong(str);
    }

    public static OVbg a(float f) {
        return new OVbg(Float.valueOf(f), mg5.a, Float.valueOf(0.01f));
    }

    public static final Object a0(Object obj, QnHx qnHx) {
        if (obj == null) {
            return qnHx;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(qnHx);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(qnHx);
        return arrayList;
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final long b0(iy1 iy1Var) {
        int i = kt2.e;
        return iy1Var.O(kt2.b);
    }

    public static ge c(int i, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        boolean z = (i4 & 8) != 0;
        js3 js3Var = (i4 & 16) != 0 ? hv.c : null;
        Bitmap.Config configY0 = fp1.y0(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Vn0_.c(i, i2, i3, z, js3Var);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configY0);
            bitmapCreateBitmap.setHasAlpha(z);
        }
        return new ge(bitmapCreateBitmap);
    }

    public static void c0(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                m14.b(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    public static final long d(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = v34.b;
        return jFloatToIntBits;
    }

    public static final long d0(oq oqVar) {
        long j = 0;
        do {
            j += (long) (oqVar.c - oqVar.b);
            oqVar = oqVar.g();
        } while (oqVar != null);
        return j;
    }

    public static final long e(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = cm4.d;
        return jFloatToIntBits;
    }

    public static final WFia e0(g30 g30Var) {
        g30Var.e(-1031410916);
        View view = (View) g30Var.E(Ll.f);
        g30Var.e(1157296644);
        boolean zI = g30Var.I(view);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new WFia(view);
            g30Var.B(objF);
        }
        g30Var.G();
        WFia wFia = (WFia) objF;
        g30Var.G();
        return wFia;
    }

    public static final long f(long j) {
        return new o62(-4611686018426999999L, 4611686018426999999L).f(j) ? A(j) : y(j / ((long) UtilsKt.MICROS_MULTIPLIER));
    }

    public static final ri2 f0(Object obj, g30 g30Var) {
        g30Var.e(-1058319986);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = R(obj);
            g30Var.B(objF);
        }
        g30Var.G();
        ri2 ri2Var = (ri2) objF;
        ri2Var.setValue(obj);
        g30Var.G();
        return ri2Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    public static final long g(String str) {
        boolean z;
        kq0 kq0Var;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        gq0.QnHx qnHx = gq0.x;
        char cCharAt = str.charAt(0);
        int i = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        if (i > 0) {
            if (str.length() > 0 && Th.g(str.charAt(0), '-', false)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (length <= i) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i) != 'P') {
            throw new IllegalArgumentException();
        }
        int i2 = i + 1;
        if (i2 == length) {
            throw new IllegalArgumentException();
        }
        kq0 kq0Var2 = null;
        long jO = 0;
        boolean z2 = false;
        while (i2 < length) {
            if (str.charAt(i2) != 'T') {
                int i3 = i2;
                while (i3 < str.length()) {
                    char cCharAt2 = str.charAt(i3);
                    if (!(new op('0', '9').f(cCharAt2) || mv4.z("+-.", cCharAt2))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = str.substring(i2, i3);
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i2;
                if (length2 < 0 || length2 > mv4.B(str)) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i4 = length2 + 1;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        kq0Var = kq0.HOURS;
                    } else if (cCharAt3 == 'M') {
                        kq0Var = kq0.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        kq0Var = kq0.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    kq0Var = kq0.DAYS;
                }
                if (kq0Var2 != null && kq0Var2.compareTo(kq0Var) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iE = mv4.E(strSubstring, '.', 0, false, 6);
                jO = (kq0Var != kq0.SECONDS || iE <= 0) ? gq0.o(jO, p0(Z(strSubstring), kq0Var)) : gq0.o(gq0.o(jO, p0(Z(strSubstring.substring(0, iE)), kq0Var)), n0(Double.parseDouble(strSubstring.substring(iE)), kq0Var));
                kq0Var2 = kq0Var;
                i2 = i4;
            } else {
                if (z2 || (i2 = i2 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        if (!z) {
            return jO;
        }
        long j = ((-(jO >> 1)) << 1) + ((long) (((int) jO) & 1));
        int i5 = iq0.a;
        return j;
    }

    public static final void g0(kl0 kl0Var, z80 z80Var, boolean z) {
        Object objG = kl0Var.g();
        Throwable thD = kl0Var.d(objG);
        Object qnHx = thD != null ? new fq3.QnHx(thD) : kl0Var.e(objG);
        if (!z) {
            z80Var.x(qnHx);
            return;
        }
        il0 il0Var = (il0) z80Var;
        z80<T> z80Var2 = il0Var.A;
        la0 context = z80Var2.getContext();
        Object objB = e75.b(context, il0Var.C);
        od5<?> od5VarC = objB != e75.a ? ma0.c(z80Var2, context, objB) : null;
        try {
            il0Var.A.x(qnHx);
            sd5 sd5Var = sd5.a;
        } finally {
            if (od5VarC == null || od5VarC.X0()) {
                e75.a(context, objB);
            }
        }
    }

    public static void h(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
        } while (!atomicLong.compareAndSet(j2, i(j2, j)));
    }

    public static final d24 h0(h81 h81Var) {
        return new d24(new vp4(h81Var, null));
    }

    public static long i(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static final void i0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final ArrayList j(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new hello(objArr, true));
    }

    public static final void j0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final pg2 k(pg2 pg2Var, long j, dj4 dj4Var) {
        yu yuVar = new yu(j);
        wo1.QnHx qnHx = wo1.a;
        return pg2Var.y(new k5(yuVar, dj4Var));
    }

    public static final long k0(long j, long j2) {
        float fE = cm4.e(j);
        long j3 = v34.a;
        if (!(j2 != j3)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * fE;
        float fC = cm4.c(j);
        if (j2 != j3) {
            return e(fIntBitsToFloat, Float.intBitsToFloat((int) (j2 & 4294967295L)) * fC);
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SpannableString l0(Z7jl z7jl, ij0 ij0Var) {
        SpannableString spannableString = new SpannableString(z7jl.w);
        List<Z7jl.CQf<rq4>> list = z7jl.x;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Z7jl.CQf<rq4> cQf = list.get(i);
            rq4 rq4Var = cQf.a;
            int i2 = cQf.b;
            int i3 = cQf.c;
            long jA = rq4Var.a();
            long j = rq4Var.b;
            int i4 = i;
            kd.y(spannableString, (yu.c(jA, rq4Var.a()) ? rq4Var.a : (jA > yu.h ? 1 : (jA == yu.h ? 0 : -1)) != 0 ? new kv(jA) : h25.QnHx.a).a(), i2, i3);
            kd.z(spannableString, j, ij0Var, i2, i3);
            x41 x41Var = rq4Var.c;
            v41 v41Var = rq4Var.d;
            if (x41Var != null || v41Var != null) {
                if (x41Var == null) {
                    x41Var = x41.z;
                }
                spannableString.setSpan(new StyleSpan(Cz.r(x41Var, v41Var != null ? v41Var.a : 0)), i2, i3, 33);
            }
            a25 a25Var = rq4Var.m;
            if (a25Var != null) {
                int i5 = a25Var.a;
                if ((i5 | 1) == i5) {
                    spannableString.setSpan(new UnderlineSpan(), i2, i3, 33);
                }
                if ((i5 | 2) == i5) {
                    spannableString.setSpan(new StrikethroughSpan(), i2, i3, 33);
                }
            }
            a55 a55Var = rq4Var.j;
            if (a55Var != null) {
                spannableString.setSpan(new ScaleXSpan(a55Var.a), i2, i3, 33);
            }
            kd.B(spannableString, rq4Var.k, i2, i3);
            long j2 = yu.h;
            long j3 = rq4Var.l;
            if (j3 != j2) {
                kd.C(spannableString, new BackgroundColorSpan(hH.A(j3)), i2, i3);
            }
            i = i4 + 1;
        }
        int length = z7jl.length();
        List<Z7jl.CQf<? extends Object>> list2 = z7jl.z;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Z7jl.CQf<? extends Object> cQf2 = list2.get(i6);
            Z7jl.CQf<? extends Object> cQf3 = cQf2;
            if ((cQf3.a instanceof lb5) && oOd.b(0, length, cQf3.b, cQf3.c)) {
                arrayList.add(cQf2);
            }
        }
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Z7jl.CQf cQf4 = (Z7jl.CQf) arrayList.get(i7);
            lb5 lb5Var = (lb5) cQf4.a;
            if (!(lb5Var instanceof ph5)) {
                throw new NoWhenBranchMatchedException();
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(((ph5) lb5Var).a).build(), cQf4.b, cQf4.c, 33);
        }
        return spannableString;
    }

    public static int m(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        int size2 = arrayList.size();
        int i = 0;
        if (size < 0) {
            throw new IllegalArgumentException(bj0.a("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(bj0.a("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int iM = OW8.m((Comparable) arrayList.get(i3), comparable);
            if (iM < 0) {
                i = i3 + 1;
            } else {
                if (iM <= 0) {
                    return i3;
                }
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void m0(String str, char[] cArr, int i, int i2, int i3) {
        for (int i4 = i2; i4 < i3; i4++) {
            cArr[(i + i4) - i2] = str.charAt(i4);
        }
    }

    public static final dl3 n(pn1 pn1Var) {
        kz1 kz1VarG = pn1Var.G();
        if (kz1VarG != null) {
            return kz1VarG.N(pn1Var, true);
        }
        long j = pn1Var.y;
        return new dl3(0.0f, 0.0f, (int) (j >> 32), sp1.b(j));
    }

    public static final long n0(double d, kq0 kq0Var) {
        TimeUnit timeUnit = kq0.NANOSECONDS.w;
        TimeUnit timeUnit2 = kq0Var.w;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        double dConvert = jConvert > 0 ? jConvert * d : d / timeUnit2.convert(1L, timeUnit);
        if (!(!Double.isNaN(dConvert))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        if (Double.isNaN(dConvert)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dConvert);
        if (new o62(-4611686018426999999L, 4611686018426999999L).f(jRound)) {
            return A(jRound);
        }
        TimeUnit timeUnit3 = kq0.MILLISECONDS.w;
        long jConvert2 = timeUnit3.convert(1L, timeUnit2);
        double dConvert2 = jConvert2 > 0 ? d * jConvert2 : d / timeUnit2.convert(1L, timeUnit3);
        if (Double.isNaN(dConvert2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return z(Math.round(dConvert2));
    }

    public static final dl3 o(iy1 iy1Var) {
        return F(iy1Var).N(iy1Var, true);
    }

    public static final long o0(int i, kq0 kq0Var) {
        if (kq0Var.compareTo(kq0.SECONDS) > 0) {
            return p0(i, kq0Var);
        }
        return A(kq0.NANOSECONDS.w.convert(i, kq0Var.w));
    }

    public static final float p(ay2 ay2Var, jy1 jy1Var) {
        return jy1Var == jy1.Ltr ? ay2Var.c(jy1Var) : ay2Var.b(jy1Var);
    }

    public static final long p0(long j, kq0 kq0Var) {
        kq0 kq0Var2 = kq0.NANOSECONDS;
        long jConvert = kq0Var.w.convert(4611686018426999999L, kq0Var2.w);
        boolean zF = new o62(-jConvert, jConvert).f(j);
        TimeUnit timeUnit = kq0Var.w;
        return zF ? A(kq0Var2.w.convert(j, timeUnit)) : y(AY.p(kq0.MILLISECONDS.w.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
    }

    public static final float q(ay2 ay2Var, jy1 jy1Var) {
        return jy1Var == jy1.Ltr ? ay2Var.b(jy1Var) : ay2Var.c(jy1Var);
    }

    public static final dl3 q0(long j) {
        int i = kt2.e;
        return hH.h(kt2.b, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean r0(vq2 vq2Var, i91 i91Var, nx nxVar) {
        tx txVar;
        yr0 yr0Var = yr0.INSTANCE;
        if (!(vq2Var instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) vq2Var).call();
            if (objCall != null) {
                Object objApply = i91Var.apply(objCall);
                mq2.b(objApply, "The mapper returned a null CompletableSource");
                txVar = (tx) objApply;
            } else {
                txVar = null;
            }
            if (txVar == null) {
                nxVar.c(yr0Var);
                nxVar.b();
            } else {
                txVar.b(nxVar);
            }
            return true;
        } catch (Throwable th) {
            XTd3.w(th);
            nxVar.c(yr0Var);
            nxVar.onError(th);
            return true;
        }
    }

    public static final ri2 s(mz0 mz0Var, Object obj, la0 la0Var, g30 g30Var, int i) {
        g30Var.e(-606625098);
        if ((i & 2) != 0) {
            la0Var = xr0.w;
        }
        up4 up4Var = new up4(la0Var, mz0Var, null);
        g30Var.e(-1703169085);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = R(obj);
            g30Var.B(objF);
        }
        g30Var.G();
        ri2 ri2Var = (ri2) objF;
        wq0.e(mz0Var, la0Var, new tp4(up4Var, ri2Var, null), g30Var);
        g30Var.G();
        g30Var.G();
        return ri2Var;
    }

    public static final void s0(fg fgVar, ByteBuffer byteBuffer) throws InsufficientSpaceException {
        int iRemaining = byteBuffer.remaining();
        int i = fgVar.c;
        int i2 = fgVar.e - i;
        if (i2 < iRemaining) {
            throw new InsufficientSpaceException("buffer content", iRemaining, i2);
        }
        boolean zHasArray = byteBuffer.hasArray();
        ByteBuffer byteBuffer2 = fgVar.a;
        if (!zHasArray || byteBuffer.isReadOnly()) {
            Th.v(byteBuffer2, i, byteBuffer.remaining()).put(byteBuffer);
        } else {
            byte[] bArrArray = byteBuffer.array();
            int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            int iRemaining2 = byteBuffer.remaining();
            oc2.a(ByteBuffer.wrap(bArrArray, iPosition, iRemaining2).slice().order(ByteOrder.BIG_ENDIAN), byteBuffer2, 0, iRemaining2, i);
            byteBuffer.position(byteBuffer.limit());
        }
        fgVar.a(iRemaining);
    }

    public static final ri2 t(ii3 ii3Var, g30 g30Var) {
        g30Var.e(-1439883919);
        ri2 ri2VarS = s(ii3Var, ii3Var.getValue(), xr0.w, g30Var, 0);
        g30Var.G();
        return ri2VarS;
    }

    public static final void t0(ek ekVar, short s) throws InsufficientSpaceException {
        boolean z;
        int i = ekVar.A;
        if (ekVar.B - i > 2) {
            ekVar.A = i + 2;
            ekVar.z.putShort(i, s);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        oq oqVarM = ekVar.m(2);
        int i2 = oqVarM.c;
        int i3 = oqVarM.e - i2;
        if (i3 < 2) {
            throw new InsufficientSpaceException("short integer", 2, i3);
        }
        oqVarM.a.putShort(i2, s);
        oqVarM.a(2);
        ekVar.b();
    }

    public static final int u(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object u0(b90 b90Var) {
        Object obj;
        la0 context = b90Var.getContext();
        AY.v(context);
        z80 z80VarL = L(b90Var);
        il0 il0Var = z80VarL instanceof il0 ? (il0) z80VarL : null;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (il0Var == null) {
            obj = sd5.a;
        } else {
            oa0 oa0Var = il0Var.z;
            boolean z = true;
            if (oa0Var.o()) {
                il0Var.B = sd5.a;
                il0Var.y = 1;
                oa0Var.n(context, il0Var);
            } else {
                zo5 zo5Var = new zo5();
                la0 la0VarG0 = context.g0(zo5Var);
                sd5 sd5Var = sd5.a;
                il0Var.B = sd5Var;
                il0Var.y = 1;
                oa0Var.n(la0VarG0, il0Var);
                if (zo5Var.x) {
                    gu0 gu0VarA = f75.a();
                    u0<kl0<?>> u0Var = gu0VarA.A;
                    if (u0Var == null || u0Var.b == u0Var.c) {
                        z = false;
                    } else if (gu0VarA.h0()) {
                        il0Var.B = sd5Var;
                        il0Var.y = 1;
                        gu0VarA.T(il0Var);
                    } else {
                        gu0VarA.Z(true);
                        try {
                            il0Var.run();
                            do {
                            } while (gu0VarA.l0());
                        } catch (Throwable th) {
                            try {
                                il0Var.f(th, null);
                            } catch (Throwable th2) {
                                gu0VarA.I(true);
                                throw th2;
                            }
                        }
                        gu0VarA.I(true);
                        z = false;
                    }
                    if (!z) {
                        obj = sd5.a;
                    }
                }
            }
            obj = va0Var;
        }
        return obj == va0Var ? obj : sd5.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z80 v(Object obj, z80 z80Var, x81 x81Var) {
        if (x81Var instanceof m8) {
            return ((m8) x81Var).a(obj, z80Var);
        }
        la0 context = z80Var.getContext();
        return context == xr0.w ? new vr1(obj, z80Var, x81Var) : new wr1(z80Var, context, x81Var, obj);
    }

    public static int v0(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static final String w(CharsetDecoder charsetDecoder, qn1 qn1Var, int i) throws Throwable {
        CoderResult coderResultDecode;
        oq oqVarH;
        StringBuilder sb = new StringBuilder((int) Math.min(i, qn1Var instanceof hk ? ((long) (qn1Var.A - qn1Var.z)) + qn1Var.B : Math.max(((long) (qn1Var.A - qn1Var.z)) + qn1Var.B, 16L)));
        CharBuffer charBuffer = sp.a;
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        boolean z = true;
        oq oqVarG = YKK.g(qn1Var, 1);
        int iRemaining = 0;
        if (oqVarG != null) {
            int i2 = 1;
            int iRemaining2 = 0;
            int i3 = 1;
            while (true) {
                try {
                    int i4 = oqVarG.c;
                    int i5 = oqVarG.b;
                    int i6 = i4 - i5;
                    if (i6 >= i2) {
                        int i7 = i - iRemaining2;
                        if (i7 == 0) {
                            i2 = 0;
                        } else {
                            ByteBuffer byteBuffer = oqVarG.a;
                            ByteBuffer byteBuffer2 = oc2.a;
                            ByteBuffer byteBufferV = Th.v(byteBuffer, i5, i6);
                            charBufferAllocate.clear();
                            if (i7 < 8192) {
                                charBufferAllocate.limit(i7);
                            }
                            CoderResult coderResultDecode2 = charsetDecoder.decode(byteBufferV, charBufferAllocate, false);
                            charBufferAllocate.flip();
                            iRemaining2 += charBufferAllocate.remaining();
                            sb.append((CharSequence) charBufferAllocate);
                            if (coderResultDecode2.isMalformed() || coderResultDecode2.isUnmappable()) {
                                sp.d(coderResultDecode2);
                            }
                            i3 = (coderResultDecode2.isUnderflow() && byteBufferV.hasRemaining()) ? i3 + 1 : 1;
                            if (!(byteBufferV.limit() == i6)) {
                                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                            }
                            oqVarG.c(byteBufferV.position());
                            i2 = i3;
                        }
                        i6 = oqVarG.c - oqVarG.b;
                    }
                    if (i6 == 0) {
                        try {
                            oqVarH = YKK.h(qn1Var, oqVarG);
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (z) {
                                YKK.b(qn1Var, oqVarG);
                            }
                            throw th;
                        }
                    } else if (i6 < i2 || oqVarG.f - oqVarG.e < 8) {
                        YKK.b(qn1Var, oqVarG);
                        oqVarH = YKK.g(qn1Var, i2);
                    } else {
                        oqVarH = oqVarG;
                    }
                    if (oqVarH == null) {
                        break;
                    }
                    oqVarG = oqVarH;
                    if (i2 <= 0) {
                        iRemaining = 1;
                        break;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (iRemaining != 0) {
                YKK.b(qn1Var, oqVarG);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i8 = i - iRemaining;
            if (i8 == 0) {
                break;
            }
            if (i8 < 8192) {
                charBufferAllocate.limit(i8);
            }
            coderResultDecode = charsetDecoder.decode(sp.b, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            sb.append((CharSequence) charBufferAllocate);
            if (coderResultDecode.isUnmappable() || coderResultDecode.isMalformed()) {
                sp.d(coderResultDecode);
            }
        } while (coderResultDecode.isOverflow());
        return sb.toString();
    }

    public static final uj0 x(h81 h81Var) {
        cq4 cq4Var = sp4.a;
        return new uj0(h81Var);
    }

    public static final long y(long j) {
        long j2 = (j << 1) + 1;
        gq0.QnHx qnHx = gq0.x;
        int i = iq0.a;
        return j2;
    }

    public static final long z(long j) {
        return new o62(-4611686018426L, 4611686018426L).f(j) ? A(O(j)) : y(AY.p(j, -4611686018427387903L, 4611686018427387903L));
    }

    public void r() {
        throw null;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Integer.valueOf((int) b67.x.zza().zzb());
    }
}
