package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.ScaleXSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h implements az2 {
    public final String a;
    public final w55 b;
    public final List<Z7jl.CQf<rq4>> c;
    public final List<Z7jl.CQf<e43>> d;
    public final e41.QnHx e;
    public final ij0 f;
    public final UH8 g;
    public final CharSequence h;
    public final ry1 i;
    public final ArrayList j;
    public final int k;

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
    public h(w55 w55Var, e41.QnHx qnHx, ij0 ij0Var, String str, List list, List list2) {
        List<Z7jl.CQf<e43>> list3;
        C1640oT c1640oT;
        ArrayList arrayList;
        rq4 rq4Var;
        int i;
        int i2;
        long j;
        float fC;
        n53 n53Var;
        this.a = str;
        this.b = w55Var;
        this.c = list;
        this.d = list2;
        this.e = qnHx;
        this.f = ij0Var;
        UH8 uh8 = new UH8(ij0Var.getDensity());
        this.g = uh8;
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        d25 d25Var = w55Var.b.b;
        rq4 rq4Var2 = w55Var.a;
        z42 z42Var = rq4Var2.k;
        int i3 = 3;
        int i4 = d25Var != null ? d25Var.a : 3;
        if (i4 == 4) {
            i3 = 2;
        } else if (!(i4 == 5)) {
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 == 2) {
                i3 = 1;
            } else {
                if (!(i4 == 3)) {
                    throw new IllegalStateException("Invalid TextDirection.".toString());
                }
                Locale locale = (z42Var == null || (locale = ((XX) z42Var.w.get(0).a).a) == null) ? Locale.getDefault() : locale;
                int i5 = b65.a;
                int iA = b65.QnHx.a(locale);
                if (iA == 0 || iA != 1) {
                    i3 = 2;
                }
            }
        }
        this.k = i3;
        C1640oT c1640oT2 = new C1640oT(this);
        long j2 = rq4Var2.b;
        long jB = z55.b(j2);
        if (a65.a(jB, 4294967296L)) {
            uh8.setTextSize(ij0Var.x0(j2));
        } else if (a65.a(jB, 8589934592L)) {
            uh8.setTextSize(z55.c(j2) * uh8.getTextSize());
        }
        if (C0239D.w(rq4Var2)) {
            x41 x41Var = rq4Var2.c;
            x41Var = x41Var == null ? x41.z : x41Var;
            v41 v41Var = rq4Var2.d;
            int i6 = v41Var != null ? v41Var.a : 0;
            w41 w41Var = rq4Var2.e;
            jc5 jc5Var = new jc5(qnHx.a(rq4Var2.f, x41Var, i6, w41Var != null ? w41Var.a : 1));
            arrayList2.add(jc5Var);
            uh8.setTypeface((Typeface) jc5Var.b);
        }
        z42 z42Var2 = rq4Var2.k;
        if (z42Var2 != null) {
            List<d53> listA = f53.a.a();
            ArrayList arrayList3 = new ArrayList(listA.size());
            int size = listA.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList3.add(new y42(listA.get(i7)));
            }
            if (!ur1.a(z42Var2, new z42(arrayList3))) {
                if (Build.VERSION.SDK_INT >= 24) {
                    c52.a.b(uh8, z42Var2);
                } else {
                    uh8.setTextLocale(((XX) (z42Var2.isEmpty() ? new y42(f53.a.a().get(0)) : z42Var2.w.get(0)).a).a);
                }
            }
        }
        long j3 = rq4Var2.h;
        if (a65.a(z55.b(j3), 8589934592L)) {
            uh8.setLetterSpacing(z55.c(j3));
        }
        String str2 = rq4Var2.g;
        if (str2 != null && !ur1.a(str2, "")) {
            uh8.setFontFeatureSettings(str2);
        }
        a55 a55Var = rq4Var2.j;
        if (a55Var != null && !ur1.a(a55Var, a55.c)) {
            uh8.setTextScaleX(uh8.getTextScaleX() * a55Var.a);
            uh8.setTextSkewX(uh8.getTextSkewX() + a55Var.b);
        }
        uh8.b(rq4Var2.a());
        rq4Var2.a.d();
        uh8.a(null, cm4.c);
        uh8.c(rq4Var2.n);
        uh8.d(rq4Var2.m);
        if (a65.a(z55.b(j3), 4294967296L)) {
            j3 = (z55.c(j3) > 0.0f ? 1 : (z55.c(j3) == 0.0f ? 0 : -1)) == 0 ? z55.c : j3;
        }
        long j4 = j3;
        long j5 = yu.g;
        long j6 = rq4Var2.l;
        long j7 = yu.c(j6, j5) ? yu.h : j6;
        x8 x8Var = rq4Var2.i;
        rq4 rq4Var3 = new rq4(0L, 0L, (x41) null, (v41) null, (w41) null, (e41) null, (String) null, j4, x8Var == null ? false : ur1.a(Float.valueOf(x8Var.a), Float.valueOf(0.0f)) ? null : x8Var, (a55) null, (z42) null, j7, (a25) null, (yi4) null, 13951);
        CharSequence charSequence = this.a;
        float textSize = this.g.getTextSize();
        w55 w55Var2 = this.b;
        ArrayList arrayListU0 = wu.U0(this.c, Collections.singletonList(new Z7jl.CQf(0, this.a.length(), rq4Var3)));
        List<Z7jl.CQf<e43>> list4 = this.d;
        ij0 ij0Var2 = this.f;
        boolean zIsEmpty = arrayListU0.isEmpty();
        bz2 bz2Var = w55Var2.b;
        if (zIsEmpty && list4.isEmpty() && ur1.a(bz2Var.d, b55.c)) {
            if (!FWT.D(bz2Var.c)) {
            }
            this.h = charSequence;
            this.i = new ry1(this.k, this.g, charSequence);
            return;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        s53 s53Var = w55Var2.c;
        if (((s53Var == null || (n53Var = s53Var.b) == null) ? true : n53Var.a) && bz2Var.f == null) {
            float fV = kd.v(bz2Var.c, textSize, ij0Var2);
            if (!Float.isNaN(fV)) {
                kd.C(spannableString, new k32(fV), 0, spannableString.length());
            }
        } else {
            l32 l32Var = bz2Var.f;
            l32Var = l32Var == null ? l32.c : l32Var;
            float fV2 = kd.v(bz2Var.c, textSize, ij0Var2);
            if (!Float.isNaN(fV2)) {
                int length = spannableString.length();
                int i8 = l32Var.b;
                kd.C(spannableString, new m32(fV2, length, (i8 & 1) > 0, (i8 & 16) > 0, l32Var.a), 0, spannableString.length());
            }
        }
        b55 b55Var = bz2Var.d;
        if (b55Var != null) {
            long jB2 = FWT.B(0);
            long j8 = b55Var.a;
            boolean zA = z55.a(j8, jB2);
            long j9 = b55Var.b;
            list3 = list4;
            c1640oT = c1640oT2;
            if ((!zA || !z55.a(j9, FWT.B(0))) && !FWT.D(j8) && !FWT.D(j9)) {
                long jB3 = z55.b(j8);
                if (a65.a(jB3, 4294967296L)) {
                    fC = ij0Var2.x0(j8);
                    j = 8589934592L;
                } else {
                    j = 8589934592L;
                    fC = a65.a(jB3, 8589934592L) ? z55.c(j8) * textSize : 0.0f;
                }
                long jB4 = z55.b(j9);
                kd.C(spannableString, new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(a65.a(jB4, 4294967296L) ? ij0Var2.x0(j9) : a65.a(jB4, j) ? textSize * z55.c(j9) : 0.0f)), 0, spannableString.length());
            }
        } else {
            list3 = list4;
            c1640oT = c1640oT2;
        }
        ArrayList arrayList4 = new ArrayList(arrayListU0.size());
        int size2 = arrayListU0.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Object obj = arrayListU0.get(i9);
            Z7jl.CQf cQf = (Z7jl.CQf) obj;
            if (C0239D.w((rq4) cQf.a) || ((rq4) cQf.a).e != null) {
                arrayList4.add(obj);
            }
        }
        rq4 rq4Var4 = w55Var2.a;
        rq4 rq4Var5 = C0239D.w(rq4Var4) || rq4Var4.e != null ? new rq4(0L, 0L, rq4Var4.c, rq4Var4.d, rq4Var4.e, rq4Var4.f, (String) null, 0L, (x8) null, (a55) null, (z42) null, 0L, (a25) null, (yi4) null, 16323) : null;
        vq4 vq4Var = new vq4(spannableString, c1640oT);
        if (arrayList4.size() > 1) {
            int size3 = arrayList4.size();
            int i10 = size3 * 2;
            Integer[] numArr = new Integer[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                numArr[i11] = 0;
            }
            int size4 = arrayList4.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Z7jl.CQf cQf2 = (Z7jl.CQf) arrayList4.get(i12);
                numArr[i12] = Integer.valueOf(cQf2.b);
                numArr[i12 + size3] = Integer.valueOf(cQf2.c);
            }
            Integer[] numArr2 = numArr;
            if (numArr2.length > 1) {
                Arrays.sort(numArr2);
            }
            int iIntValue = ((Number) oV9.f0(numArr)).intValue();
            int i13 = 0;
            while (i13 < i10) {
                int iIntValue2 = numArr[i13].intValue();
                if (iIntValue2 == iIntValue) {
                    arrayList = arrayList4;
                    rq4Var = rq4Var5;
                } else {
                    int size5 = arrayList4.size();
                    rq4 rq4VarC = rq4Var5;
                    int i14 = 0;
                    while (i14 < size5) {
                        Z7jl.CQf cQf3 = (Z7jl.CQf) arrayList4.get(i14);
                        ArrayList arrayList5 = arrayList4;
                        int i15 = cQf3.b;
                        rq4 rq4Var6 = rq4Var5;
                        int i16 = cQf3.c;
                        if (i15 != i16 && oOd.b(iIntValue, iIntValue2, i15, i16)) {
                            rq4 rq4Var7 = (rq4) cQf3.a;
                            rq4VarC = rq4VarC != null ? rq4VarC.c(rq4Var7) : rq4Var7;
                        }
                        i14++;
                        arrayList4 = arrayList5;
                        rq4Var5 = rq4Var6;
                    }
                    arrayList = arrayList4;
                    rq4Var = rq4Var5;
                    if (rq4VarC != null) {
                        vq4Var.invoke(rq4VarC, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                    }
                    iIntValue = iIntValue2;
                }
                i13++;
                arrayList4 = arrayList;
                rq4Var5 = rq4Var;
            }
        } else if (!arrayList4.isEmpty()) {
            rq4 rq4Var8 = (rq4) ((Z7jl.CQf) arrayList4.get(0)).a;
            vq4Var.invoke(rq4Var5 != null ? rq4Var5.c(rq4Var8) : rq4Var8, Integer.valueOf(((Z7jl.CQf) arrayList4.get(0)).b), Integer.valueOf(((Z7jl.CQf) arrayList4.get(0)).c));
        }
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayListU0.size();
        int i17 = 0;
        while (i17 < size6) {
            Z7jl.CQf cQf4 = (Z7jl.CQf) arrayListU0.get(i17);
            int i18 = cQf4.b;
            if (i18 < 0 || i18 >= spannableString.length() || (i2 = cQf4.c) <= i18 || i2 > spannableString.length()) {
                i = size6;
            } else {
                int i19 = cQf4.b;
                int i20 = cQf4.c;
                rq4 rq4Var9 = (rq4) cQf4.a;
                x8 x8Var2 = rq4Var9.i;
                if (x8Var2 != null) {
                    kd.C(spannableString, new y8(x8Var2.a), i19, i20);
                }
                kd.y(spannableString, rq4Var9.a(), i19, i20);
                rq4Var9.a.d();
                a25 a25Var = rq4Var9.m;
                if (a25Var != null) {
                    int i21 = a25Var.a;
                    kd.C(spannableString, new b25((i21 | 1) == i21, (i21 | 2) == i21), i19, i20);
                }
                kd.z(spannableString, rq4Var9.b, ij0Var2, i19, i20);
                String str3 = rq4Var9.g;
                if (str3 != null) {
                    kd.C(spannableString, new j41(str3), i19, i20);
                }
                a55 a55Var2 = rq4Var9.j;
                if (a55Var2 != null) {
                    kd.C(spannableString, new ScaleXSpan(a55Var2.a), i19, i20);
                    kd.C(spannableString, new l22(a55Var2.b, 1), i19, i20);
                }
                kd.B(spannableString, rq4Var9.k, i19, i20);
                long j10 = yu.h;
                long j11 = rq4Var9.l;
                if (j11 != j10) {
                    kd.C(spannableString, new BackgroundColorSpan(hH.A(j11)), i19, i20);
                }
                yi4 yi4Var = rq4Var9.n;
                if (yi4Var != null) {
                    int iA2 = hH.A(yi4Var.a);
                    long j12 = yi4Var.b;
                    kd.C(spannableString, new bj4(kt2.c(j12), kt2.d(j12), yi4Var.c, iA2), i19, i20);
                }
                long j13 = rq4Var9.h;
                long jB5 = z55.b(j13);
                i = size6;
                MetricAffectingSpan m22Var = a65.a(jB5, 4294967296L) ? new m22(ij0Var2.x0(j13)) : a65.a(jB5, 8589934592L) ? new l22(z55.c(j13), 0) : null;
                if (m22Var != null) {
                    arrayList6.add(new qq4(i19, i20, m22Var));
                }
            }
            i17++;
            size6 = i;
        }
        int size7 = arrayList6.size();
        for (int i22 = 0; i22 < size7; i22++) {
            qq4 qq4Var = (qq4) arrayList6.get(i22);
            kd.C(spannableString, qq4Var.a, qq4Var.b, qq4Var.c);
        }
        if (list3.size() <= 0) {
            charSequence = spannableString;
            this.h = charSequence;
            this.i = new ry1(this.k, this.g, charSequence);
            return;
        }
        list3.get(0).a.getClass();
        z55.c(0L);
        fp1.a0();
        z55.c(0L);
        fp1.a0();
        ij0Var2.U();
        ij0Var2.getDensity();
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    @Override // defpackage.az2
    public final boolean a() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jc5 jc5Var = (jc5) arrayList.get(i);
            if (jc5Var.a.getValue() != jc5Var.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.az2
    public final float b() {
        return ((Number) this.i.b.getValue()).floatValue();
    }

    @Override // defpackage.az2
    public final float c() {
        return ((Number) this.i.c.getValue()).floatValue();
    }
}
