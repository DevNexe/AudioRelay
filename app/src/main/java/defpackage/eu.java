package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class eu implements dl5, i91, qf6 {
    public static ej1 A;
    public static volatile j81 y;
    public static final int[] w = new int[0];
    public static final Object[] x = new Object[0];
    public static final eu z = new eu();
    public static final /* synthetic */ eu B = new eu();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [cs0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    public static final boolean b(ArrayList arrayList) {
        ?? arrayList2;
        long j;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            arrayList2 = cs0.w;
        } else {
            arrayList2 = new ArrayList();
            Object obj = arrayList.get(0);
            int iJ = ps0.J(arrayList);
            int i = 0;
            while (i < iJ) {
                i++;
                Object obj2 = arrayList.get(i);
                f94 f94Var = (f94) obj2;
                f94 f94Var2 = (f94) obj;
                arrayList2.add(new kt2(X.a(Math.abs(kt2.c(f94Var2.d().b()) - kt2.c(f94Var.d().b())), Math.abs(kt2.d(f94Var2.d().b()) - kt2.d(f94Var.d().b())))));
                obj = obj2;
            }
        }
        if (((Collection) arrayList2).size() == 1) {
            j = ((kt2) wu.H0(arrayList2)).a;
        } else {
            if (arrayList2.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objH0 = wu.H0(arrayList2);
            int iJ2 = ps0.J(arrayList2);
            if (1 <= iJ2) {
                int i2 = 1;
                while (true) {
                    objH0 = new kt2(kt2.g(((kt2) objH0).a, ((kt2) arrayList2.get(i2)).a));
                    if (i2 == iJ2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((kt2) objH0).a;
        }
        return kt2.d(j) < kt2.c(j);
    }

    public static float[] c() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final boolean d(f94 f94Var) {
        return (y84.a(f94Var.f(), i94.f) == null && y84.a(f94Var.f(), i94.e) == null) ? false : true;
    }

    public static final long e(float[] fArr, long j) {
        float fC = kt2.c(j);
        float fD = kt2.d(j);
        float f = 1 / (((fArr[7] * fD) + (fArr[3] * fC)) + fArr[15]);
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            f = 0.0f;
        }
        return X.a(((fArr[4] * fD) + (fArr[0] * fC) + fArr[12]) * f, ((fArr[5] * fD) + (fArr[1] * fC) + fArr[13]) * f);
    }

    public static final void f(float[] fArr, oi2 oi2Var) {
        long jE = e(fArr, X.a(oi2Var.a, oi2Var.b));
        long jE2 = e(fArr, X.a(oi2Var.a, oi2Var.d));
        long jE3 = e(fArr, X.a(oi2Var.c, oi2Var.b));
        long jE4 = e(fArr, X.a(oi2Var.c, oi2Var.d));
        oi2Var.a = Math.min(Math.min(kt2.c(jE), kt2.c(jE2)), Math.min(kt2.c(jE3), kt2.c(jE4)));
        oi2Var.b = Math.min(Math.min(kt2.d(jE), kt2.d(jE2)), Math.min(kt2.d(jE3), kt2.d(jE4)));
        oi2Var.c = Math.max(Math.max(kt2.c(jE), kt2.c(jE2)), Math.max(kt2.c(jE3), kt2.c(jE4)));
        oi2Var.d = Math.max(Math.max(kt2.d(jE), kt2.d(jE2)), Math.max(kt2.d(jE3), kt2.d(jE4)));
    }

    public static final boolean g(String str) {
        return (ur1.a(str, "GET") || ur1.a(str, "HEAD")) ? false : true;
    }

    public static final ky2 h(int i, g30 g30Var, int i2) {
        g30Var.e(1352421093);
        if ((i2 & 1) != 0) {
            i = 0;
        }
        e40.CQf cQf = e40.a;
        Object[] objArr = new Object[0];
        f34 f34Var = ky2.h;
        Integer numValueOf = Integer.valueOf(i);
        g30Var.e(1157296644);
        boolean zI = g30Var.I(numValueOf);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new ny2(i);
            g30Var.B(objF);
        }
        g30Var.G();
        ky2 ky2Var = (ky2) g7.f(objArr, f34Var, null, (h81) objF, g30Var, 4);
        g30Var.G();
        return ky2Var;
    }

    public static final void i(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    public static final void j(UT ut, f94 f94Var) {
        if (((gu) y84.a(f94Var.f(), i94.g)) != null) {
            x84 x84VarF = f94Var.f();
            x84VarF.getClass();
            Object objInvoke = x84VarF.w.get(i94.w);
            if (objInvoke == null) {
                objInvoke = du.w.invoke();
            }
            ut.k(UT.F1.a(0, 0, 0, 0, ((Boolean) objInvoke).booleanValue()));
        }
        f94 f94VarG = f94Var.g();
        if (f94VarG == null || y84.a(f94VarG.f(), i94.e) == null) {
            return;
        }
        bu buVar = (bu) y84.a(f94VarG.f(), i94.f);
        if (buVar != null) {
            if (buVar.a < 0 || buVar.b < 0) {
                return;
            }
        }
        if (f94Var.f().b(i94.w)) {
            ArrayList arrayList = new ArrayList();
            List listE = f94VarG.e(false);
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                f94 f94Var2 = (f94) listE.get(i);
                if (f94Var2.f().b(i94.w)) {
                    arrayList.add(f94Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zB = b(arrayList);
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    f94 f94Var3 = (f94) arrayList.get(i2);
                    if (f94Var3.f == f94Var.f) {
                        int i3 = zB ? 0 : i2;
                        int i4 = zB ? i2 : 0;
                        x84 x84VarF2 = f94Var3.f();
                        n94<List<String>> n94Var = i94.a;
                        x84VarF2.getClass();
                        Object objInvoke2 = x84VarF2.w.get(i94.w);
                        if (objInvoke2 == null) {
                            objInvoke2 = cu.w.invoke();
                        }
                        ut.k(UT.F1.a(i3, 1, i4, 1, ((Boolean) objInvoke2).booleanValue()));
                    }
                }
            }
        }
    }

    public static void k(float[] fArr, float f, float f2) {
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    @Override // defpackage.dl5
    public void a(qk qkVar) {
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        int iOrdinal = ((gt1) obj).ordinal();
        if (iOrdinal == 0) {
            return A$Y4.OpenSL;
        }
        if (iOrdinal == 1) {
            return A$Y4.AudioTrack;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzm());
    }
}
