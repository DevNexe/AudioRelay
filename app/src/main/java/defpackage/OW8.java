package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.protobuf.QnHx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public class OW8 implements kd2, qf6 {
    public static ej1 w;
    public static final int[] x = {R.attr.summaryOn, R.attr.summaryOff, R.attr.disableDependentsState, com.azefsw.audioconnect.R.attr.disableDependentsState, com.azefsw.audioconnect.R.attr.summaryOff, com.azefsw.audioconnect.R.attr.summaryOn};
    public static final int[] y = {R.attr.dialogTitle, R.attr.dialogMessage, R.attr.dialogIcon, R.attr.positiveButtonText, R.attr.negativeButtonText, R.attr.dialogLayout, com.azefsw.audioconnect.R.attr.dialogIcon, com.azefsw.audioconnect.R.attr.dialogLayout, com.azefsw.audioconnect.R.attr.dialogMessage, com.azefsw.audioconnect.R.attr.dialogTitle, com.azefsw.audioconnect.R.attr.negativeButtonText, com.azefsw.audioconnect.R.attr.positiveButtonText};
    public static final int[] z = {com.azefsw.audioconnect.R.attr.useSimpleSummaryProvider};
    public static final int[] A = {R.attr.entries, R.attr.entryValues, com.azefsw.audioconnect.R.attr.entries, com.azefsw.audioconnect.R.attr.entryValues, com.azefsw.audioconnect.R.attr.useSimpleSummaryProvider};
    public static final int[] B = {R.attr.entries, R.attr.entryValues, com.azefsw.audioconnect.R.attr.entries, com.azefsw.audioconnect.R.attr.entryValues};
    public static final int[] C = {R.attr.icon, R.attr.persistent, R.attr.enabled, R.attr.layout, R.attr.title, R.attr.selectable, R.attr.key, R.attr.summary, R.attr.order, R.attr.widgetLayout, R.attr.dependency, R.attr.defaultValue, R.attr.shouldDisableView, R.attr.fragment, R.attr.singleLineTitle, R.attr.iconSpaceReserved, com.azefsw.audioconnect.R.attr.allowDividerAbove, com.azefsw.audioconnect.R.attr.allowDividerBelow, com.azefsw.audioconnect.R.attr.defaultValue, com.azefsw.audioconnect.R.attr.dependency, com.azefsw.audioconnect.R.attr.enableCopying, com.azefsw.audioconnect.R.attr.enabled, com.azefsw.audioconnect.R.attr.fragment, com.azefsw.audioconnect.R.attr.icon, com.azefsw.audioconnect.R.attr.iconSpaceReserved, com.azefsw.audioconnect.R.attr.isPreferenceVisible, com.azefsw.audioconnect.R.attr.key, com.azefsw.audioconnect.R.attr.layout, com.azefsw.audioconnect.R.attr.order, com.azefsw.audioconnect.R.attr.persistent, com.azefsw.audioconnect.R.attr.selectable, com.azefsw.audioconnect.R.attr.shouldDisableView, com.azefsw.audioconnect.R.attr.singleLineTitle, com.azefsw.audioconnect.R.attr.summary, com.azefsw.audioconnect.R.attr.title, com.azefsw.audioconnect.R.attr.widgetLayout};
    public static final int[] D = {R.attr.orderingFromXml, com.azefsw.audioconnect.R.attr.initialExpandedChildrenCount, com.azefsw.audioconnect.R.attr.orderingFromXml};
    public static final int[] E = {R.attr.maxWidth, R.attr.maxHeight, com.azefsw.audioconnect.R.attr.maxHeight, com.azefsw.audioconnect.R.attr.maxWidth};
    public static final int[] F = {R.attr.layout, R.attr.max, com.azefsw.audioconnect.R.attr.adjustable, com.azefsw.audioconnect.R.attr.min, com.azefsw.audioconnect.R.attr.seekBarIncrement, com.azefsw.audioconnect.R.attr.showSeekBarValue, com.azefsw.audioconnect.R.attr.updatesContinuously};
    public static final int[] G = {R.attr.summaryOn, R.attr.summaryOff, R.attr.disableDependentsState, R.attr.switchTextOn, R.attr.switchTextOff, com.azefsw.audioconnect.R.attr.disableDependentsState, com.azefsw.audioconnect.R.attr.summaryOff, com.azefsw.audioconnect.R.attr.summaryOn, com.azefsw.audioconnect.R.attr.switchTextOff, com.azefsw.audioconnect.R.attr.switchTextOn};
    public static final int[] H = {R.attr.summaryOn, R.attr.summaryOff, R.attr.disableDependentsState, R.attr.switchTextOn, R.attr.switchTextOff, com.azefsw.audioconnect.R.attr.disableDependentsState, com.azefsw.audioconnect.R.attr.summaryOff, com.azefsw.audioconnect.R.attr.summaryOn, com.azefsw.audioconnect.R.attr.switchTextOff, com.azefsw.audioconnect.R.attr.switchTextOn};
    public static final py4 I = new py4("NO_VALUE");
    public static final /* synthetic */ OW8 J = new OW8();

    public static nj4 c(int i, int i2, lg lgVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 4;
        lg lgVar2 = lg.SUSPEND;
        if (i4 != 0) {
            lgVar = lgVar2;
        }
        if (!(i >= 0)) {
            throw new IllegalArgumentException(GM.a("replay cannot be negative, but was ", i).toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(GM.a("extraBufferCapacity cannot be negative, but was ", i2).toString());
        }
        if (!(i > 0 || i2 > 0 || lgVar == lgVar2)) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + lgVar).toString());
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new nj4(i, i5, lgVar);
    }

    public static final void f(ArrayList arrayList, uj2 uj2Var) {
        boolean z2;
        String str = uj2Var.a;
        if (iv4.s(str)) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else if (ur1.a(((uj2) it.next()).a, str)) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z2) {
            return;
        }
        arrayList.add(uj2Var);
    }

    public static final long h(Sb1 sb1, long j) {
        return (long) ((j / (((sb1.b / 8) * sb1.c) * sb1.a)) * AdError.NETWORK_ERROR_CODE);
    }

    public static final int i(Sb1 sb1, int i) {
        return (int) ((i / 1000.0f) * (sb1.b / 8) * sb1.c * sb1.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[ORIG_RETURN, RETURN] */
    public static int j(Context context, String str) {
        int iA;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        String strD = i >= 23 ? GA.d(str) : null;
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iC = 1;
            if (Process.myUid() == iMyUid && uq2.a(context.getPackageName(), packageName)) {
                if (i >= 29) {
                    AppOpsManager appOpsManagerC = YVv.c(context);
                    iA = YVv.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iA == 0) {
                        iA = YVv.a(appOpsManagerC, strD, iMyUid, YVv.b(context));
                    }
                } else if (i >= 23) {
                    iC = GA.c((AppOpsManager) GA.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iA == 0) {
                    return -2;
                }
            } else if (i >= 23) {
                iC = GA.c((AppOpsManager) GA.a(context, AppOpsManager.class), strD, packageName);
            }
            iA = iC;
            if (iA == 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final boolean k(r21 r21Var) {
        r21 r21Var2 = r21Var.A;
        if (r21Var2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (!l(r21Var2, false)) {
            return false;
        }
        r21Var.A = null;
        return true;
    }

    public static final boolean l(r21 r21Var, boolean z2) {
        int iOrdinal = r21Var.z.ordinal();
        g31 g31Var = g31.Inactive;
        if (iOrdinal == 0) {
            r21Var.b(g31Var);
        } else {
            if (iOrdinal == 1) {
                if (k(r21Var)) {
                    r21Var.b(g31Var);
                }
                return false;
            }
            if (iOrdinal == 2) {
                if (!z2) {
                    return z2;
                }
                r21Var.b(g31Var);
                return z2;
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    if (k(r21Var)) {
                        r21Var.b(g31.Deactivated);
                    }
                    return false;
                }
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return true;
    }

    public static final int m(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void n(r21 r21Var) {
        yy1 yy1Var;
        ww2 ww2Var;
        p21 focusManager;
        int iOrdinal = r21Var.z.ordinal();
        g31 g31Var = g31.Deactivated;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                r21Var.b(g31.DeactivatedParent);
                return;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 5) {
                    return;
                }
                r21Var.b(g31Var);
                return;
            }
        }
        kz1 kz1Var = r21Var.H;
        if (kz1Var != null && (yy1Var = kz1Var.A) != null && (ww2Var = yy1Var.C) != null && (focusManager = ww2Var.getFocusManager()) != null) {
            focusManager.b(true);
        }
        r21Var.b(g31Var);
    }

    public static final String o(vu4 vu4Var) {
        qu4.QnHx qnHx = qu4.a;
        Context context = kd.w;
        if (context == null) {
            ur1.e("context");
            throw null;
        }
        qu4.a.getClass();
        qu4.QnHx.b.getClass();
        return context.getResources().getString(vu4Var.w);
    }

    public static final void p(r21 r21Var) {
        g31 g31Var;
        int iOrdinal = r21Var.z.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            g31Var = g31.Active;
        } else if (iOrdinal == 2) {
            g31Var = g31.Captured;
        } else {
            if (iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            }
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            g31Var = g31.Active;
        }
        r21Var.b(g31Var);
    }

    public static final bv3 q(bv3 bv3Var) {
        if (bv3Var instanceof bv3.QnHx) {
            return bv3.QnHx.a((bv3.QnHx) bv3Var, false);
        }
        if (ur1.a(bv3Var, bv3.CQf.a) || ur1.a(bv3Var, bv3.F1.a)) {
            return bv3Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean r(df4 df4Var) {
        return (df4Var instanceof df4.CQf) || (df4Var instanceof df4.F1);
    }

    public static final void s(bk2 bk2Var) {
        a62 a62Var = a62.a;
        StringBuilder sb = new StringBuilder("An error occurred in native code: ");
        String str = bk2Var.a;
        sb.append(str);
        sb.append(" (");
        String str2 = bk2Var.b;
        sb.append(str2);
        sb.append(")");
        a62Var.a(sb.toString());
        a62Var.h("native", str, str2);
    }

    public static final void t(r21 r21Var) {
        yy1 yy1Var;
        kz1 kz1Var = r21Var.H;
        if (((kz1Var == null || (yy1Var = kz1Var.A) == null) ? null : yy1Var.C) == null) {
            r21Var.I = true;
            return;
        }
        int iOrdinal = r21Var.z.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (k(r21Var)) {
                    p(r21Var);
                    return;
                }
                return;
            } else if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                if (iOrdinal != 5) {
                    return;
                }
                r21 r21Var2 = r21Var.x;
                if (r21Var2 != null) {
                    u(r21Var2, r21Var);
                    return;
                } else {
                    if (v(r21Var)) {
                        p(r21Var);
                        return;
                    }
                    return;
                }
            }
        }
        i21 i21Var = r21Var.B;
        if (i21Var != null) {
            i21Var.d();
        }
    }

    public static final boolean u(r21 r21Var, r21 r21Var2) {
        if (!r21Var.y.f(r21Var2)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int iOrdinal = r21Var.z.ordinal();
        g31 g31Var = g31.ActiveParent;
        if (iOrdinal == 0) {
            r21Var.b(g31Var);
            r21Var.A = r21Var2;
            p(r21Var2);
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    int iOrdinal2 = r21Var.z.ordinal();
                    if (iOrdinal2 == 3) {
                        r21Var.b(g31.Inactive);
                    } else if (iOrdinal2 == 4) {
                        r21Var.b(g31Var);
                    }
                    boolean zU = u(r21Var, r21Var2);
                    n(r21Var);
                    return zU;
                }
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r21 r21Var3 = r21Var.x;
                    if (r21Var3 == null && v(r21Var)) {
                        r21Var.b(g31.Active);
                        return u(r21Var, r21Var2);
                    }
                    if (r21Var3 != null && u(r21Var3, r21Var)) {
                        return u(r21Var, r21Var2);
                    }
                } else {
                    if (r21Var.A == null) {
                        r21Var.A = r21Var2;
                        p(r21Var2);
                        return true;
                    }
                    if (k(r21Var)) {
                        r21Var.A = r21Var2;
                        p(r21Var2);
                        return true;
                    }
                }
            }
        } else if (k(r21Var)) {
            r21Var.A = r21Var2;
            p(r21Var2);
            return true;
        }
        return false;
    }

    public static final boolean v(r21 r21Var) {
        yy1 yy1Var;
        ww2 ww2Var;
        kz1 kz1Var = r21Var.H;
        if (kz1Var == null || (yy1Var = kz1Var.A) == null || (ww2Var = yy1Var.C) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return ww2Var.requestFocus();
    }

    public static final yb4 w(cg3 cg3Var) {
        h04 h04Var;
        String strV = cg3Var.V();
        vf3 vf3VarA = vf3.a(cg3Var.B);
        if (vf3VarA == null) {
            vf3VarA = vf3.UNRECOGNIZED;
        }
        mv2 mv2VarH = g7.h(vf3VarA, new ov2(cg3Var.V()));
        String strU = cg3Var.U();
        if (cg3Var.W()) {
            wf3 wf3VarS = cg3Var.S();
            h04Var = new h04(wf3VarS.S(), wf3VarS.A);
        } else {
            h04Var = new h04(cg3Var.T(), false);
        }
        return new yb4(strV, mv2VarH, strU, h04Var);
    }

    public static final cg3 x(yb4 yb4Var) {
        cg3.CQf cQfX = cg3.F.c();
        String strY0 = yb4Var.y0();
        strY0.getClass();
        cQfX.A = strY0;
        cQfX.M();
        String str = yb4Var.w;
        str.getClass();
        cQfX.B = str;
        cQfX.M();
        cQfX.C = g7.i(yb4Var.x).b();
        cQfX.M();
        String str2 = yb4Var.y;
        str2.getClass();
        cQfX.D = str2;
        cQfX.M();
        cQfX.E = FWT.H(yb4Var.z);
        cQfX.M();
        cg3 cg3VarQ = cQfX.f();
        if (cg3VarQ.isInitialized()) {
            return cg3VarQ;
        }
        throw QnHx.AbstractC0099QnHx.C(cg3VarQ);
    }

    public static qk y(byte[] bArr, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = bArr.length;
        }
        return new qk(bArr, 0, i, true);
    }

    @Override // defpackage.kd2
    public void a(String str) {
        Log.e("AR", str);
    }

    @Override // defpackage.kd2
    public void b(String str) {
        Log.v("AR", str);
    }

    @Override // defpackage.kd2
    public void d(String str, Throwable th) {
        Log.e("AR", str, th);
    }

    @Override // defpackage.kd2
    public void e(String str) {
        Log.i("AR", str);
    }

    @Override // defpackage.kd2
    public void g(String str) {
        Log.w("AR", str);
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzB());
    }
}
