package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class Cz implements qf6 {
    public static final qr0 A;
    public static final lf0 B;
    public static final /* synthetic */ Cz C;
    public static final py4 w = new py4("UNLOCK_FAIL");
    public static final py4 x;
    public static final py4 y;
    public static final qr0 z;

    static {
        py4 py4Var = new py4("LOCKED");
        x = py4Var;
        py4 py4Var2 = new py4("UNLOCKED");
        y = py4Var2;
        z = new qr0(py4Var);
        A = new qr0(py4Var2);
        B = new lf0();
        C = new Cz();
    }

    public static final long A(d93 d93Var, boolean z2) {
        long jF = kt2.f(d93Var.c, d93Var.f);
        if (z2 || !d93Var.b()) {
            return jF;
        }
        int i = kt2.e;
        return kt2.b;
    }

    public static final ww2 B(yy1 yy1Var) {
        ww2 ww2Var = yy1Var.C;
        if (ww2Var != null) {
            return ww2Var;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    public static final long a(int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
        }
        if (i2 >= 0) {
            long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
            int i3 = s55.c;
            return j;
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
    }

    public static final long b(float f, boolean z2) {
        return ((z2 ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f)) << 32);
    }

    public static final boolean c(f94 f94Var) {
        return y84.a(f94Var.f(), i94.i) == null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static final boolean d(f94 f94Var) {
        yy1 yy1VarM;
        z84 z84VarZ;
        boolean zA;
        x84 x84VarC;
        if (!x(f94Var)) {
            yy1VarM = m(f94Var.g, SJ.w);
            if (yy1VarM != null) {
                return false;
            }
            z84VarZ = fp1.Z(yy1VarM);
            if (z84VarZ != null) {
                zA = false;
            } else {
                zA = false;
            }
            if (!zA) {
                return false;
            }
        } else if (ur1.a(y84.a(f94Var.e, i94.k), Boolean.TRUE)) {
            yy1VarM = m(f94Var.g, SJ.w);
            if (yy1VarM != null) {
                return false;
            }
            z84VarZ = fp1.Z(yy1VarM);
            if (z84VarZ != null || (x84VarC = z84VarZ.c()) == null) {
                zA = false;
            } else {
                zA = ur1.a(y84.a(x84VarC, i94.k), Boolean.TRUE);
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    public static final float e(float f) {
        return Math.signum(f) * ((float) Math.sqrt(Math.abs(f) * 2));
    }

    public static final void f(oh5 oh5Var, d93 d93Var) {
        List list = d93Var.j;
        if (list == null) {
            list = cs0.w;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bd1 bd1Var = (bd1) list.get(i);
            long j = bd1Var.a;
            int i2 = (oh5Var.b + 1) % 20;
            oh5Var.b = i2;
            oh5Var.a[i2] = new v83(bd1Var.b, j);
        }
        int i3 = (oh5Var.b + 1) % 20;
        oh5Var.b = i3;
        oh5Var.a[i3] = new v83(d93Var.c, d93Var.b);
    }

    public static final boolean g(d93 d93Var) {
        return d93Var.g && !d93Var.d;
    }

    public static final long h(int i, long j) {
        int i2 = s55.c;
        int i3 = (int) (j >> 32);
        int iO = AY.o(i3, 0, i);
        int iO2 = AY.o(s55.c(j), 0, i);
        return (iO == i3 && iO2 == s55.c(j)) ? j : a(iO, iO2);
    }

    public static void i(ro0 ro0Var, ew2 ew2Var, cg cgVar, float f) {
        TQ2_ tq2_;
        gx0 gx0Var = gx0.w;
        if (ew2Var instanceof ew2.CQf) {
            dl3 dl3Var = ((ew2.CQf) ew2Var).a;
            ro0Var.M(cgVar, X.a(dl3Var.a, dl3Var.b), ps0.e(dl3Var.c - dl3Var.a, dl3Var.d - dl3Var.b), f, gx0Var, null, 3);
            return;
        }
        if (ew2Var instanceof ew2.F1) {
            ew2.F1 f1 = (ew2.F1) ew2Var;
            TQ2_ tq2_2 = f1.b;
            if (tq2_2 == null) {
                ku3 ku3Var = f1.a;
                float fB = ha0.b(ku3Var.h);
                float f2 = ku3Var.a;
                float f3 = ku3Var.b;
                ro0Var.S(cgVar, X.a(f2, f3), ps0.e(ku3Var.c - f2, ku3Var.d - f3), hH.f(fB, fB), f, gx0Var, null, 3);
                return;
            }
            tq2_ = tq2_2;
        } else {
            if (!(ew2Var instanceof ew2.QnHx)) {
                throw new NoWhenBranchMatchedException();
            }
            tq2_ = null;
        }
        ro0Var.H(tq2_, cgVar, f, gx0Var, null, 3);
    }

    public static void j(ro0 ro0Var, ew2 ew2Var, long j) {
        TQ2_ tq2_;
        gx0 gx0Var = gx0.w;
        if (ew2Var instanceof ew2.CQf) {
            dl3 dl3Var = ((ew2.CQf) ew2Var).a;
            ro0Var.c0(j, X.a(dl3Var.a, dl3Var.b), ps0.e(dl3Var.c - dl3Var.a, dl3Var.d - dl3Var.b), 1.0f, gx0Var, null, 3);
            return;
        }
        if (ew2Var instanceof ew2.F1) {
            ew2.F1 f1 = (ew2.F1) ew2Var;
            tq2_ = f1.b;
            if (tq2_ == null) {
                ku3 ku3Var = f1.a;
                float fB = ha0.b(ku3Var.h);
                float f = ku3Var.a;
                float f2 = ku3Var.b;
                ro0Var.a0(j, X.a(f, f2), ps0.e(ku3Var.c - f, ku3Var.d - f2), hH.f(fB, fB), gx0Var, 1.0f, null, 3);
                return;
            }
        } else {
            if (!(ew2Var instanceof ew2.QnHx)) {
                throw new NoWhenBranchMatchedException();
            }
            tq2_ = null;
        }
        ro0Var.n(tq2_, j, 1.0f, gx0Var, null, 3);
    }

    public static wg0 k(float f, float f2, g30 g30Var, int i) {
        g30Var.e(380403812);
        if ((i & 1) != 0) {
            f = 6;
        }
        if ((i & 2) != 0) {
            f2 = 12;
        }
        float f3 = (i & 4) != 0 ? 8 : 0.0f;
        float f4 = (i & 8) != 0 ? 8 : 0.0f;
        Object[] objArr = {new wm0(f), new wm0(f2), new wm0(f3), new wm0(f4)};
        g30Var.e(-568225417);
        boolean zI = false;
        for (int i2 = 0; i2 < 4; i2++) {
            zI |= g30Var.I(objArr[i2]);
        }
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new wg0(f, f2, f3, f4);
            g30Var.B(objF);
        }
        g30Var.G();
        wg0 wg0Var = (wg0) objF;
        g30Var.G();
        return wg0Var;
    }

    public static final k64 l(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((k64) arrayList.get(i2)).w == i) {
                return (k64) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final yy1 m(yy1 yy1Var, j81 j81Var) {
        for (yy1 yy1VarS = yy1Var.s(); yy1VarS != null; yy1VarS = yy1VarS.s()) {
            if (((Boolean) j81Var.invoke(yy1VarS)).booleanValue()) {
                return yy1VarS;
            }
        }
        return null;
    }

    public static final int n(ArrayList arrayList, int i) {
        byte b;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            yy2 yy2Var = (yy2) arrayList.get(i3);
            if (yy2Var.b > i) {
                b = 1;
            } else {
                b = yy2Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int o(ArrayList arrayList, int i) {
        byte b;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            yy2 yy2Var = (yy2) arrayList.get(i3);
            if (yy2Var.d > i) {
                b = 1;
            } else {
                b = yy2Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int p(ArrayList arrayList, float f) {
        byte b;
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            yy2 yy2Var = (yy2) arrayList.get(i2);
            if (yy2Var.f > f) {
                b = 1;
            } else {
                b = yy2Var.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void q(Region region, f94 f94Var, LinkedHashMap linkedHashMap, f94 f94Var2) {
        z84 z84VarY;
        yy1 yy1Var;
        yy1 yy1Var2 = f94Var2.g;
        boolean z2 = false;
        boolean z3 = (yy1Var2.Q && yy1Var2.E()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i = f94Var.f;
        int i2 = f94Var2.f;
        if (!zIsEmpty || i2 == i) {
            if (!z3 || f94Var2.c) {
                if (!f94Var2.e.x || (z84VarY = fp1.Y(f94Var2.g)) == null) {
                    z84VarY = f94Var2.a;
                }
                boolean z4 = z84VarY.z;
                dl3 dl3Var = dl3.e;
                if (z4) {
                    boolean z5 = y84.a(((a94) z84VarY.x).z0(), w84.b) != null;
                    kz1 kz1Var = z84VarY.w;
                    if (!z5) {
                        dl3Var = ps0.o(kz1Var);
                    } else if (kz1Var.q()) {
                        iy1 iy1VarF = ps0.F(kz1Var);
                        oi2 oi2Var = kz1Var.N;
                        if (oi2Var == null) {
                            oi2Var = new oi2();
                            kz1Var.N = oi2Var;
                        }
                        long jD0 = kz1Var.D0(kz1Var.L0());
                        oi2Var.a = -cm4.e(jD0);
                        oi2Var.b = -cm4.c(jD0);
                        oi2Var.c = cm4.e(jD0) + kz1Var.k0();
                        oi2Var.d = cm4.c(jD0) + kz1Var.h0();
                        while (true) {
                            if (kz1Var == iy1VarF) {
                                dl3Var = new dl3(oi2Var.a, oi2Var.b, oi2Var.c, oi2Var.d);
                                break;
                            }
                            kz1Var.Y0(oi2Var, false, true);
                            if (oi2Var.b()) {
                                break;
                            } else {
                                kz1Var = kz1Var.B;
                            }
                        }
                    }
                }
                Rect rectZ = hH.z(dl3Var);
                Region region2 = new Region();
                region2.set(rectZ);
                if (i2 == i) {
                    i2 = -1;
                }
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    linkedHashMap.put(Integer.valueOf(i2), new g94(f94Var2, region2.getBounds()));
                    List listE = f94Var2.e(false);
                    for (int size = listE.size() - 1; -1 < size; size--) {
                        q(region, f94Var, linkedHashMap, (f94) listE.get(size));
                    }
                    region.op(rectZ, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (!f94Var2.c) {
                    if (i2 == -1) {
                        linkedHashMap.put(Integer.valueOf(i2), new g94(f94Var2, region2.getBounds()));
                    }
                } else {
                    f94 f94VarG = f94Var2.g();
                    if (f94VarG != null && (yy1Var = f94VarG.g) != null && yy1Var.Q) {
                        z2 = true;
                    }
                    linkedHashMap.put(Integer.valueOf(i2), new g94(f94Var2, hH.z(z2 ? f94VarG.d() : new dl3(0.0f, 0.0f, 10.0f, 10.0f))));
                }
            }
        }
    }

    public static final int r(x41 x41Var, int i) {
        boolean z2 = ur1.b(x41Var.w, x41.x.w) >= 0;
        boolean z3 = i == 1;
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final Rect s(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 + (-1), i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        oy2.a(textPaint2, charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            oy2.a(textPaint, charSequence, i3, i2, rect3);
        } else {
            textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        }
        return rect3;
    }

    public static final boolean t(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return false;
        }
        float f30 = 1.0f / f29;
        fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
        fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
        fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
        fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
        fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
        float f32 = -f13;
        fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
        fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
        fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
        fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
        fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
        fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
        fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
        fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
        fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
        fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        return true;
    }

    public static final boolean u(qz2 qz2Var, float f, float f2) {
        dl3 dl3Var = new dl3(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        TQ2_ tq2_G = hH.g();
        tq2_G.m(dl3Var);
        TQ2_ tq2_G2 = hH.g();
        tq2_G2.f(qz2Var, tq2_G, 1);
        boolean zN = tq2_G2.n();
        tq2_G2.reset();
        tq2_G.reset();
        return !zN;
    }

    public static final boolean v(d93 d93Var, long j) {
        long j2 = d93Var.c;
        float fC = kt2.c(j2);
        float fD = kt2.d(j2);
        return fC < 0.0f || fC > ((float) ((int) (j >> 32))) || fD < 0.0f || fD > ((float) sp1.b(j));
    }

    public static final boolean w(d93 d93Var, long j, long j2) {
        if (!(d93Var.h == 1)) {
            return v(d93Var, j);
        }
        long j3 = d93Var.c;
        float fC = kt2.c(j3);
        float fD = kt2.d(j3);
        return fC < (-cm4.e(j2)) || fC > cm4.e(j2) + ((float) ((int) (j >> 32))) || fD < (-cm4.c(j2)) || fD > cm4.c(j2) + ((float) sp1.b(j));
    }

    public static final boolean x(f94 f94Var) {
        x84 x84Var = f94Var.e;
        n94<FA4<j81<List<o55>, Boolean>>> n94Var = w84.a;
        return x84Var.b(w84.h);
    }

    public static final boolean y(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fB = ha0.b(j);
        float fC = ha0.c(j);
        return ((f6 * f6) / (fC * fC)) + ((f5 * f5) / (fB * fB)) <= 1.0f;
    }

    public static final u93 z(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = 2 >= arrayList.size() ? arrayList.size() - 1 : 2;
        ArrayList arrayList3 = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList3.add(Float.valueOf(0.0f));
        }
        int size2 = arrayList.size();
        int i2 = size + 1;
        ta2 ta2Var = new ta2(i2, size2);
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            ta2Var.i(1.0f, 0, i3);
            for (int i4 = 1; i4 < i2; i4++) {
                ta2Var.i(((Number) arrayList.get(i3)).floatValue() * ta2Var.f(i4 - 1, i3), i4, i3);
            }
            i3++;
        }
        ta2 ta2Var2 = new ta2(i2, size2);
        ta2 ta2Var3 = new ta2(i2, i2);
        int i5 = 0;
        while (i5 < i2) {
            for (int i6 = 0; i6 < size2; i6++) {
                ta2Var2.i(ta2Var.f(i5, i6), i5, i6);
            }
            for (int i7 = 0; i7 < i5; i7++) {
                float fG = ta2Var2.g(i5).g(ta2Var2.g(i7));
                for (int i8 = 0; i8 < size2; i8++) {
                    ta2Var2.i(ta2Var2.f(i5, i8) - (ta2Var2.f(i7, i8) * fG), i5, i8);
                }
            }
            tp1 tp1VarG = ta2Var2.g(i5);
            float fSqrt = (float) Math.sqrt(tp1VarG.g(tp1VarG));
            if (fSqrt < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f = 1.0f / fSqrt;
            for (int i9 = 0; i9 < size2; i9++) {
                ta2Var2.i(ta2Var2.f(i5, i9) * f, i5, i9);
            }
            int i10 = 0;
            while (i10 < i2) {
                ta2Var3.i(i10 < i5 ? 0.0f : ta2Var2.g(i5).g(ta2Var.g(i10)), i5, i10);
                i10++;
            }
            i5++;
        }
        tp1 tp1Var = new tp1(size2, 1);
        for (int i11 = 0; i11 < size2; i11++) {
            ((Float[]) tp1Var.b)[i11] = Float.valueOf(((Number) arrayList2.get(i11)).floatValue() * 1.0f);
        }
        int i12 = i2 - 1;
        for (int i13 = i12; -1 < i13; i13--) {
            arrayList3.set(i13, Float.valueOf(ta2Var2.g(i13).g(tp1Var)));
            int i14 = i13 + 1;
            if (i14 <= i12) {
                int i15 = i12;
                while (true) {
                    arrayList3.set(i13, Float.valueOf(((Number) arrayList3.get(i13)).floatValue() - (((Number) arrayList3.get(i15)).floatValue() * ta2Var3.f(i13, i15))));
                    if (i15 != i14) {
                        i15--;
                    }
                }
            }
            arrayList3.set(i13, Float.valueOf(((Number) arrayList3.get(i13)).floatValue() / ta2Var3.f(i13, i13)));
        }
        float fFloatValue = 0.0f;
        for (int i16 = 0; i16 < size2; i16++) {
            fFloatValue += ((Number) arrayList2.get(i16)).floatValue();
        }
        float f2 = fFloatValue / size2;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i17 = 0; i17 < size2; i17++) {
            float fFloatValue2 = ((Number) arrayList2.get(i17)).floatValue() - ((Number) arrayList3.get(0)).floatValue();
            float fFloatValue3 = 1.0f;
            for (int i18 = 1; i18 < i2; i18++) {
                fFloatValue3 *= ((Number) arrayList.get(i17)).floatValue();
                fFloatValue2 -= ((Number) arrayList3.get(i18)).floatValue() * fFloatValue3;
            }
            f3 += fFloatValue2 * 1.0f * fFloatValue2;
            float fFloatValue4 = ((Number) arrayList2.get(i17)).floatValue() - f2;
            f4 = (fFloatValue4 * 1.0f * fFloatValue4) + f4;
        }
        return new u93(arrayList3, f4 > 1.0E-6f ? 1.0f - (f3 / f4) : 1.0f);
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzk());
    }
}
