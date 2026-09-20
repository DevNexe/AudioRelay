package defpackage;

import android.R;
import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class iE implements zs, rc1 {
    public static final int[] w = {R.attr.orientation, R.attr.clipToPadding, R.attr.descendantFocusability, com.azefsw.audioconnect.R.attr.fastScrollEnabled, com.azefsw.audioconnect.R.attr.fastScrollHorizontalThumbDrawable, com.azefsw.audioconnect.R.attr.fastScrollHorizontalTrackDrawable, com.azefsw.audioconnect.R.attr.fastScrollVerticalThumbDrawable, com.azefsw.audioconnect.R.attr.fastScrollVerticalTrackDrawable, com.azefsw.audioconnect.R.attr.layoutManager, com.azefsw.audioconnect.R.attr.reverseLayout, com.azefsw.audioconnect.R.attr.spanCount, com.azefsw.audioconnect.R.attr.stackFromEnd};
    public static ej1 x;
    public static ej1 y;

    public static final ui2 a(r21 r21Var) {
        boolean z;
        ui2<r21> ui2Var = r21Var.y;
        int i = ui2Var.y;
        int i2 = 0;
        if (i <= 0) {
            z = false;
            break;
        }
        r21[] r21VarArr = ui2Var.w;
        int i3 = 0;
        while (true) {
            if (r21VarArr[i3].z.d()) {
                z = true;
                break;
            }
            i3++;
            if (i3 >= i) {
                z = false;
                break;
            }
        }
        if (!z) {
            return ui2Var;
        }
        ui2 ui2Var2 = new ui2(new r21[16]);
        int i4 = ui2Var.y;
        if (i4 > 0) {
            r21[] r21VarArr2 = ui2Var.w;
            do {
                r21 r21Var2 = r21VarArr2[i2];
                if (r21Var2.z.d()) {
                    ui2Var2.c(ui2Var2.y, a(r21Var2));
                } else {
                    ui2Var2.b(r21Var2);
                }
                i2++;
            } while (i2 < i4);
        }
        return ui2Var2;
    }

    public static final am b(vq2 vq2Var) {
        return new am(new y04(vq2Var, null), xr0.w, -2, lg.SUSPEND);
    }

    public static dr2 d(mz0 mz0Var) {
        return new dr2(new ke5(xr0.w, mz0Var));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0022  */
    public static final r21 e(r21 r21Var) {
        r21 r21Var2;
        int iOrdinal = r21Var.z.ordinal();
        if (iOrdinal == 0) {
            return r21Var;
        }
        if (iOrdinal == 1) {
            r21Var2 = r21Var.A;
            if (r21Var2 != null) {
                return e(r21Var2);
            }
        } else {
            if (iOrdinal == 2) {
                return r21Var;
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    r21Var2 = r21Var.A;
                    if (r21Var2 != null) {
                        return e(r21Var2);
                    }
                } else if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }

    public static final r21 f(r21 r21Var) {
        r21 r21Var2 = r21Var.x;
        if (r21Var2 == null) {
            return null;
        }
        int iOrdinal = r21Var.z.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return r21Var;
            }
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return f(r21Var2);
    }

    public static final dl3 g(r21 r21Var) {
        dl3 dl3VarN;
        kz1 kz1Var = r21Var.H;
        return (kz1Var == null || (dl3VarN = ps0.F(kz1Var).N(kz1Var, false)) == null) ? dl3.e : dl3VarN;
    }

    public static final ej1 h() {
        ej1 ej1Var = x;
        if (ej1Var != null) {
            return ej1Var;
        }
        ej1.QnHx qnHx = new ej1.QnHx("Outlined.TimerOff");
        int i = sg5.a;
        long j = yu.b;
        jq4 jq4Var = new jq4(j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new uz2.YKK(9.0f, 1.0f));
        arrayList.add(new uz2.PRnFixed(6.0f));
        arrayList.add(new uz2.ta(2.0f));
        arrayList.add(new uz2.PRnFixed(-6.0f));
        uz2.CQf cQf = uz2.CQf.c;
        arrayList.add(cQf);
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", arrayList);
        jq4 jq4Var2 = new jq4(j);
        le3 le3Var = new le3();
        le3Var.i(12.0f, 6.0f);
        le3Var.d(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        le3Var.d(0.0f, 0.94f, -0.19f, 1.83f, -0.52f, 2.65f);
        le3Var.h(1.5f, 1.5f);
        le3Var.c(20.63f, 15.91f, 21.0f, 14.5f, 21.0f, 13.0f);
        le3Var.d(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        le3Var.h(1.42f, -1.42f);
        le3Var.d(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        le3Var.h(-1.42f, 1.42f);
        le3Var.c(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        le3Var.d(-1.5f, 0.0f, -2.91f, 0.37f, -4.15f, 1.02f);
        le3Var.h(1.5f, 1.5f);
        le3Var.c(10.17f, 6.19f, 11.06f, 6.0f, 12.0f, 6.0f);
        le3Var.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var2, null, "", le3Var.a);
        jq4 jq4Var3 = new jq4(j);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new uz2.YKK(11.0f, 8.17f));
        arrayList2.add(new uz2.y(2.0f, 2.0f));
        arrayList2.add(new uz2.y(0.0f, -2.17f));
        arrayList2.add(new uz2.y(-2.0f, 0.0f));
        arrayList2.add(cQf);
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var3, null, "", arrayList2);
        jq4 jq4Var4 = new jq4(j);
        le3 le3Var2 = new le3();
        le3Var2.i(2.81f, 2.81f);
        le3Var2.g(1.39f, 4.22f);
        le3Var2.h(3.4f, 3.4f);
        le3Var2.c(3.67f, 9.12f, 3.0f, 10.98f, 3.0f, 13.0f);
        le3Var2.d(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        le3Var2.d(2.02f, 0.0f, 3.88f, -0.67f, 5.38f, -1.79f);
        le3Var2.h(2.4f, 2.4f);
        le3Var2.h(1.41f, -1.41f);
        le3Var2.g(2.81f, 2.81f);
        le3Var2.b();
        le3Var2.i(12.0f, 20.0f);
        le3Var2.d(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        le3Var2.d(0.0f, -1.47f, 0.45f, -2.83f, 1.22f, -3.95f);
        le3Var2.h(9.73f, 9.73f);
        le3Var2.c(14.83f, 19.55f, 13.47f, 20.0f, 12.0f, 20.0f);
        le3Var2.b();
        qnHx.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var4, null, "", le3Var2.a);
        ej1 ej1VarD = qnHx.d();
        x = ej1VarD;
        return ej1VarD;
    }

    public static final boolean i(r21 r21Var) {
        yy1 yy1Var;
        yy1 yy1Var2;
        kz1 kz1Var = r21Var.H;
        if ((kz1Var == null || (yy1Var2 = kz1Var.A) == null || !yy1Var2.Q) ? false : true) {
            if ((kz1Var == null || (yy1Var = kz1Var.A) == null || !yy1Var.E()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static pg2 j(ed1 ed1Var, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            f2 = Float.NaN;
        }
        wo1.QnHx qnHx = wo1.a;
        return new QT(ed1Var, f, f2);
    }

    @Override // defpackage.zs
    public long c() {
        return SystemClock.elapsedRealtime();
    }
}
