package defpackage;

import android.R;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public class qLd implements ba, tHM, a90, qf6 {
    public static ej1 A;
    public static ej1 y;
    public static ej1 z;
    public static final py4 w = new py4("NO_DECISION");
    public static final qLd x = new qLd();
    public static final int[] B = {R.attr.color, R.attr.alpha, R.attr.lStar, com.azefsw.audioconnect.R.attr.alpha, com.azefsw.audioconnect.R.attr.lStar};
    public static final int[] C = {com.azefsw.audioconnect.R.attr.fontProviderAuthority, com.azefsw.audioconnect.R.attr.fontProviderCerts, com.azefsw.audioconnect.R.attr.fontProviderFetchStrategy, com.azefsw.audioconnect.R.attr.fontProviderFetchTimeout, com.azefsw.audioconnect.R.attr.fontProviderPackage, com.azefsw.audioconnect.R.attr.fontProviderQuery, com.azefsw.audioconnect.R.attr.fontProviderSystemFontFamily};
    public static final int[] D = {R.attr.font, R.attr.fontWeight, R.attr.fontStyle, R.attr.ttcIndex, R.attr.fontVariationSettings, com.azefsw.audioconnect.R.attr.font, com.azefsw.audioconnect.R.attr.fontStyle, com.azefsw.audioconnect.R.attr.fontVariationSettings, com.azefsw.audioconnect.R.attr.fontWeight, com.azefsw.audioconnect.R.attr.ttcIndex};
    public static final int[] E = {R.attr.startColor, R.attr.endColor, R.attr.type, R.attr.centerX, R.attr.centerY, R.attr.gradientRadius, R.attr.tileMode, R.attr.centerColor, R.attr.startX, R.attr.startY, R.attr.endX, R.attr.endY};
    public static final int[] F = {R.attr.color, R.attr.offset};
    public static final /* synthetic */ qLd G = new qLd();

    public static final boolean c(Set set, Set set2) {
        if (set.size() < set2.size()) {
            Set set3 = set;
            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        Set set4 = set2;
        if (!(set4 instanceof Collection) || !set4.isEmpty()) {
            Iterator it2 = set4.iterator();
            while (it2.hasNext()) {
                if (set.contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void d(long j, gg ggVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        if (!(i2 < i3)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i2 < i3) {
            int i9 = i2;
            while (true) {
                int i10 = i9 + 1;
                if (!(((mk) arrayList.get(i9)).c() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (i10 >= i3) {
                    break;
                } else {
                    i9 = i10;
                }
            }
        }
        mk mkVar = (mk) arrayList.get(i2);
        mk mkVar2 = (mk) arrayList.get(i3 - 1);
        if (i8 == mkVar.c()) {
            int iIntValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            mk mkVar3 = (mk) arrayList.get(i11);
            i4 = i11;
            i5 = iIntValue;
            mkVar = mkVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (mkVar.g(i8) == mkVar2.g(i8)) {
            int iMin = Math.min(mkVar.c(), mkVar2.c());
            if (i8 < iMin) {
                int i12 = i8;
                i6 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (mkVar.g(i12) != mkVar2.g(i12)) {
                        break;
                    }
                    i6++;
                    if (i13 >= iMin) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
            } else {
                i6 = 0;
            }
            long j2 = 4;
            long j3 = (ggVar.x / j2) + j + ((long) 2) + ((long) i6) + 1;
            ggVar.P(-i6);
            ggVar.P(i5);
            int i14 = i8 + i6;
            if (i8 < i14) {
                while (true) {
                    int i15 = i8 + 1;
                    ggVar.P(mkVar.g(i8) & 255);
                    if (i15 >= i14) {
                        break;
                    } else {
                        i8 = i15;
                    }
                }
            }
            if (i4 + 1 == i3) {
                if (!(i14 == ((mk) arrayList.get(i4)).c())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                ggVar.P(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                gg ggVar2 = new gg();
                ggVar.P(((int) ((ggVar2.x / j2) + j3)) * (-1));
                d(j3, ggVar2, i14, arrayList, i4, i3, arrayList2);
                ggVar.K(ggVar2);
                return;
            }
        }
        int i16 = i4 + 1;
        int i17 = 1;
        if (i16 < i3) {
            while (true) {
                int i18 = i16 + 1;
                if (((mk) arrayList.get(i16 - 1)).g(i8) != ((mk) arrayList.get(i16)).g(i8)) {
                    i17++;
                }
                if (i18 >= i3) {
                    break;
                } else {
                    i16 = i18;
                }
            }
        }
        long j4 = 4;
        long j5 = ((long) (i17 * 2)) + (ggVar.x / j4) + j + ((long) 2);
        ggVar.P(i17);
        ggVar.P(i5);
        if (i4 < i3) {
            int i19 = i4;
            while (true) {
                int i20 = i19 + 1;
                int iG = ((mk) arrayList.get(i19)).g(i8);
                if (i19 == i4 || iG != ((mk) arrayList.get(i19 - 1)).g(i8)) {
                    ggVar.P(iG & 255);
                }
                if (i20 >= i3) {
                    break;
                } else {
                    i19 = i20;
                }
            }
        }
        gg ggVar3 = new gg();
        while (i4 < i3) {
            byte bG = ((mk) arrayList.get(i4)).g(i8);
            int i21 = i4 + 1;
            if (i21 >= i3) {
                i7 = i3;
                break;
            }
            int i22 = i21;
            while (true) {
                int i23 = i22 + 1;
                if (bG != ((mk) arrayList.get(i22)).g(i8)) {
                    i7 = i22;
                    break;
                } else {
                    if (i23 >= i3) {
                        i7 = i3;
                        break;
                    }
                    i22 = i23;
                }
            }
            if (i21 == i7 && i8 + 1 == ((mk) arrayList.get(i4)).c()) {
                ggVar.P(((Number) arrayList2.get(i4)).intValue());
            } else {
                ggVar.P(((int) ((ggVar3.x / j4) + j5)) * (-1));
                d(j5, ggVar3, i8 + 1, arrayList, i4, i7, arrayList2);
            }
            i4 = i7;
            ggVar3 = ggVar3;
            j4 = j4;
            j5 = j5;
        }
        ggVar.K(ggVar3);
    }

    public static final Object e(z80 z80Var, h81 h81Var, y81 y81Var, nz0 nz0Var, mz0[] mz0VarArr) throws Throwable {
        aw awVar = new aw(null, h81Var, y81Var, nz0Var, mz0VarArr);
        oz0 oz0Var = new oz0(z80Var, z80Var.getContext());
        Object objE = kd.E(oz0Var, oz0Var, awVar);
        return objE == va0.COROUTINE_SUSPENDED ? objE : sd5.a;
    }

    public static final ej1 f() {
        ej1 ej1Var = y;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.Devices");
        int i = sg5.a;
        jq4 jq4Var = new jq4(yu.b);
        le3 le3Var = new le3();
        le3Var.i(4.0f, 6.0f);
        le3Var.f(18.0f);
        le3Var.g(22.0f, 4.0f);
        le3Var.g(4.0f, 4.0f);
        le3Var.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        le3Var.n(11.0f);
        le3Var.g(0.0f, 17.0f);
        le3Var.n(3.0f);
        le3Var.f(14.0f);
        le3Var.n(-3.0f);
        le3Var.g(4.0f, 17.0f);
        le3Var.g(4.0f, 6.0f);
        le3Var.b();
        le3Var.i(23.0f, 8.0f);
        le3Var.f(-6.0f);
        le3Var.d(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        le3Var.n(10.0f);
        le3Var.d(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        le3Var.f(6.0f);
        le3Var.d(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        le3Var.g(24.0f, 9.0f);
        le3Var.d(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        le3Var.b();
        le3Var.i(22.0f, 17.0f);
        le3Var.f(-4.0f);
        le3Var.n(-7.0f);
        le3Var.f(4.0f);
        le3Var.n(7.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        ej1 ej1VarD = qnHx.d();
        y = ej1VarD;
        return ej1VarD;
    }

    public static final ej1 g() {
        ej1 ej1Var = A;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.Mic");
        int i = sg5.a;
        long j = yu.b;
        jq4 jq4Var = new jq4(j);
        le3 le3Var = new le3();
        le3Var.i(12.0f, 14.0f);
        le3Var.d(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        le3Var.m(5.0f);
        le3Var.d(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        le3Var.j(9.0f, 3.34f, 9.0f, 5.0f);
        le3Var.n(6.0f);
        le3Var.c(9.0f, 12.66f, 10.34f, 14.0f, 12.0f, 14.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
        jq4 jq4Var2 = new jq4(j);
        le3 le3Var2 = new le3();
        le3Var2.i(17.0f, 11.0f);
        le3Var2.d(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        le3Var2.k(-5.0f, -2.24f, -5.0f, -5.0f);
        le3Var2.e(5.0f);
        le3Var2.d(0.0f, 3.53f, 2.61f, 6.43f, 6.0f, 6.92f);
        le3Var2.m(21.0f);
        le3Var2.f(2.0f);
        le3Var2.n(-3.08f);
        le3Var2.d(3.39f, -0.49f, 6.0f, -3.39f, 6.0f, -6.92f);
        le3Var2.e(17.0f);
        le3Var2.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var2, null, "", le3Var2.a);
        ej1 ej1VarD = qnHx.d();
        A = ej1VarD;
        return ej1VarD;
    }

    public static final oz1 h(int i, h81 h81Var) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return new ry4(h81Var);
        }
        if (i2 == 1) {
            return new h24(h81Var);
        }
        if (i2 == 2) {
            return new ce5(h81Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.tHM
    public void a() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ba
    public Object apply(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        yp ypVar = (yp) obj2;
        ArrayList arrayList = ((g83) obj).f;
        if (arrayList.size() < 2) {
            z2 = false;
        } else {
            if (arrayList.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                if (((Number) it.next()).longValue() > 0) {
                    z3 = true;
                    break;
                }
            }
            if (z3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z2) {
            return vp.d;
        }
        ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
        int i = 0;
        for (Object obj3 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                ps0.j0();
                throw null;
            }
            arrayList2.add(new xp(i, ((Number) obj3).longValue()));
            i = i2;
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((xp) it2.next()).b;
        while (it2.hasNext()) {
            fMax = Math.max(fMax, ((xp) it2.next()).b);
        }
        uy2 uy2Var = fMax < 30.0f ? new uy2(Float.valueOf(50.0f), Float.valueOf(10.0f)) : fMax < 200.0f ? new uy2(Float.valueOf(100.0f), Float.valueOf(25.0f)) : new uy2(Float.valueOf(fMax - (fMax % 10.0f)), Float.valueOf(100.0f));
        List listM = ps0.M(ypVar.a(((Number) uy2Var.w).floatValue()), ypVar.a(((Number) uy2Var.x).floatValue()));
        List list = listM;
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax2 = ((xp) it3.next()).b;
        while (it3.hasNext()) {
            fMax2 = Math.max(fMax2, ((xp) it3.next()).b);
        }
        Iterator it4 = list.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax3 = ((aq) it4.next()).b;
        while (it4.hasNext()) {
            fMax3 = Math.max(fMax3, ((aq) it4.next()).b);
        }
        float fMax4 = Math.max(fMax2, fMax3);
        return new vp(arrayList2, listM, new lk5((0.2f * fMax4) + fMax4));
    }

    @Override // defpackage.tHM
    public ByteBuffer b(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        ByteBuffer byteBuffer = oc2.a;
        return byteBufferAllocate;
    }

    @Override // defpackage.a90
    public Object then(w05 w05Var) {
        if (w05Var.n()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", w05Var.j());
        return null;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return b67.x.zza().zzI();
    }
}
