package defpackage;

import android.util.Log;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public class kK implements qf6 {
    public static final z80[] w = new z80[0];
    public static final kK x = new kK();
    public static final su4 y = new su4();
    public static final /* synthetic */ kK z = new kK();

    public static final int a(List list, x81 x81Var, x81 x81Var2, int i, int i2, int i3, int i4) {
        if (i3 == i4) {
            int size = list.size();
            int iMax = 0;
            float f = 0.0f;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                zq1 zq1Var = (zq1) list.get(i6);
                float fE = e(d(zq1Var));
                int iIntValue = ((Number) x81Var.invoke(zq1Var, Integer.valueOf(i))).intValue();
                if (fE == 0.0f) {
                    i5 += iIntValue;
                } else if (fE > 0.0f) {
                    f += fE;
                    iMax = Math.max(iMax, sy4.c(iIntValue / fE));
                }
            }
            return ((list.size() - 1) * i2) + sy4.c(iMax * f) + i5;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        float f2 = 0.0f;
        int iMax2 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            zq1 zq1Var2 = (zq1) list.get(i7);
            float fE2 = e(d(zq1Var2));
            if (fE2 == 0.0f) {
                int iMin2 = Math.min(((Number) x81Var2.invoke(zq1Var2, Integer.MAX_VALUE)).intValue(), i - iMin);
                iMin += iMin2;
                iMax2 = Math.max(iMax2, ((Number) x81Var.invoke(zq1Var2, Integer.valueOf(iMin2))).intValue());
            } else if (fE2 > 0.0f) {
                f2 += fE2;
            }
        }
        int iC = f2 == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : sy4.c(Math.max(i - iMin, 0) / f2);
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            zq1 zq1Var3 = (zq1) list.get(i8);
            float fE3 = e(d(zq1Var3));
            if (fE3 > 0.0f) {
                iMax2 = Math.max(iMax2, ((Number) x81Var.invoke(zq1Var3, Integer.valueOf(iC != Integer.MAX_VALUE ? sy4.c(iC * fE3) : Integer.MAX_VALUE))).intValue());
            }
        }
        return iMax2;
    }

    public static final tu3 d(zq1 zq1Var) {
        Object objB = zq1Var.B();
        if (objB instanceof tu3) {
            return (tu3) objB;
        }
        return null;
    }

    public static final float e(tu3 tu3Var) {
        if (tu3Var != null) {
            return tu3Var.a;
        }
        return 0.0f;
    }

    public static final w20 f(g30 g30Var) {
        g30Var.e(627015320);
        e40.CQf cQf = e40.a;
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = new w20();
            g30Var.B(objF);
        }
        g30Var.G();
        w20 w20Var = (w20) objF;
        wq0.a(w20Var, new y20(w20Var), g30Var);
        g30Var.G();
        return w20Var;
    }

    public static final mg g(ht1 ht1Var) {
        int iOrdinal = ht1Var.ordinal();
        if (iOrdinal == 0) {
            return mg.Low;
        }
        if (iOrdinal == 1) {
            return mg.Medium;
        }
        if (iOrdinal == 2) {
            return mg.High;
        }
        if (iOrdinal == 3) {
            return mg.Custom;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean b(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void h(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void i(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(c87.x.zza().zzc());
    }
}
