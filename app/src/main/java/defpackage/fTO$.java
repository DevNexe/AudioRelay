package defpackage;

import android.R;
import android.os.Build;
import bk1.QnHx;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class fTO$ implements e53, gk0, zs, b03, i91, qf6 {
    public static ej1 B;
    public static final fTO$ w = new fTO$();
    public static final int[] x = {R.attr.dither, R.attr.visible, R.attr.variablePadding, R.attr.constantSize, R.attr.enterFadeDuration, R.attr.exitFadeDuration};
    public static final int[] y = {R.attr.id, R.attr.drawable};
    public static final int[] z = {R.attr.drawable, R.attr.toId, R.attr.fromId, R.attr.reversible};
    public static final g75 A = new g75(0, new long[0], new Object[0]);
    public static final /* synthetic */ fTO$ C = new fTO$();

    public static final bk1.QnHx f(bk1 bk1Var, float f, ak1 ak1Var, g30 g30Var) {
        g30Var.e(469472752);
        bk1.QnHx qnHxG = g(bk1Var, Float.valueOf(0.0f), Float.valueOf(f), mg5.a, ak1Var, g30Var);
        g30Var.G();
        return qnHxG;
    }

    public static final bk1.QnHx g(bk1 bk1Var, Number number, Number number2, qb5 qb5Var, ak1 ak1Var, g30 g30Var) {
        g30Var.e(-1695411770);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = bk1Var.new QnHx(number, number2, qb5Var, ak1Var);
            g30Var.B(objF);
        }
        g30Var.G();
        bk1.QnHx qnHx = (bk1.QnHx) objF;
        wq0.h(new ck1(number, qnHx, number2, ak1Var), g30Var);
        wq0.a(qnHx, new ek1(bk1Var, qnHx), g30Var);
        g30Var.G();
        return qnHx;
    }

    public static final pg2 h(pg2 pg2Var, g30 g30Var) {
        g30Var.e(-1537818762);
        g30Var.e(-1242377783);
        e40.CQf cQf = e40.a;
        long jB = yu.b(((rv) g30Var.E(sv.a)).g(), 0.6f);
        g30Var.G();
        pg2 pg2VarA = f30.a(pg2Var, wo1.a, new o21(jB));
        g30Var.G();
        return pg2VarA;
    }

    public static final bk1 i(g30 g30Var) {
        g30Var.e(-840193660);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = new bk1();
            g30Var.B(objF);
        }
        g30Var.G();
        bk1 bk1Var = (bk1) objF;
        bk1Var.a(g30Var, 8);
        g30Var.G();
        return bk1Var;
    }

    @Override // defpackage.e53
    public List a() {
        return Collections.singletonList(new XX(Locale.getDefault()));
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        gu1 gu1Var = ((hu1) obj).a;
        int i = gu1Var == null ? -1 : BJoY.b[gu1Var.ordinal()];
        y61 y61Var = y61.TryInterstitialThenAdsFragment;
        if (i != -1 && i != 1) {
            if (i == 2) {
                y61Var = y61.TryInterstitialOnly;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                y61Var = y61.AdsFragmentOnly;
            }
        }
        return new z61(y61Var);
    }

    @Override // defpackage.gk0
    public String b() {
        String str = Build.MANUFACTURER;
        String strA = Build.MODEL;
        if (!iv4.x(strA, str, false)) {
            strA = LPt6Fixed.a(str, " ", strA);
        }
        if (!(strA.length() > 0)) {
            return strA;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = strA.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? Th.x(cCharAt, Locale.getDefault()) : String.valueOf(cCharAt)));
        sb.append(strA.substring(1));
        return sb.toString();
    }

    @Override // defpackage.zs
    public long c() {
        throw new IllegalStateException("Please provide a clock implementation to Clock.CURRENT".toString());
    }

    @Override // defpackage.e53
    public XX d(String str) {
        return new XX(Locale.forLanguageTag(str));
    }

    @Override // defpackage.b03
    public a03 e(s50 s50Var) {
        return s50Var.a.b.b ? new rh2() : new fXUx();
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(((g97) f97.x.w.zza()).zza());
    }
}
