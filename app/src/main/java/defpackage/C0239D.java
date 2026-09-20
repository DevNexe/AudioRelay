package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.azefsw.audioconnect.R;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: D€, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0239D implements b91, f90, qf6 {
    public static ej1 A;
    public static final float[][] w = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] x = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] y = {95.047f, 100.0f, 108.883f};
    public static final float[][] z = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final /* synthetic */ C0239D B = new C0239D();

    public static final int A(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final sl2 B(j81 j81Var) {
        ul2 ul2Var = new ul2();
        j81Var.invoke(ul2Var);
        boolean z2 = ul2Var.b;
        sl2.QnHx qnHx = ul2Var.a;
        qnHx.getClass();
        qnHx.getClass();
        String str = ul2Var.d;
        if (str != null) {
            boolean z3 = ul2Var.e;
            boolean z4 = ul2Var.f;
            qnHx.b = str;
            qnHx.a = -1;
            qnHx.c = z3;
            qnHx.d = z4;
        } else {
            int i = ul2Var.c;
            boolean z5 = ul2Var.e;
            boolean z6 = ul2Var.f;
            qnHx.a = i;
            qnHx.b = null;
            qnHx.c = z5;
            qnHx.d = z6;
        }
        String str2 = qnHx.b;
        return str2 != null ? new sl2(z2, false, str2, qnHx.c, qnHx.d, qnHx.e, qnHx.f, qnHx.g, qnHx.h) : new sl2(z2, false, qnHx.a, qnHx.c, qnHx.d, qnHx.e, qnHx.f, qnHx.g, qnHx.h);
    }

    public static void C(ht2 ht2Var, AtomicInteger atomicInteger, s sVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            sVar.getClass();
            Throwable thB = uu0.b(sVar);
            if (thB != null) {
                ht2Var.onError(thB);
            } else {
                ht2Var.b();
            }
        }
    }

    public static void D(ht2 ht2Var, Throwable th, AtomicInteger atomicInteger, s sVar) {
        sVar.getClass();
        if (!uu0.a(sVar, th)) {
            m14.b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            ht2Var.onError(uu0.b(sVar));
        }
    }

    public static void E(ht2 ht2Var, Object obj, AtomicInteger atomicInteger, s sVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            ht2Var.g(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                sVar.getClass();
                Throwable thB = uu0.b(sVar);
                if (thB != null) {
                    ht2Var.onError(thB);
                } else {
                    ht2Var.b();
                }
            }
        }
    }

    public static final void F(zc5 zc5Var, String str) {
        List<String> arrayList;
        if (iv4.s(str)) {
            arrayList = cs0.w;
        } else {
            arrayList = ur1.a(str, "/") ? bd5.a : new ArrayList(mv4.P(str, new char[]{'/'}));
        }
        zc5Var.h = arrayList;
    }

    public static void G(View view, la2 la2Var) {
        cr0 cr0Var = la2Var.w.b;
        if (cr0Var != null && cr0Var.a) {
            float fI = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                Field field = bi5.a;
                fI += bi5.byN.i((View) parent);
            }
            la2.CQf cQf = la2Var.w;
            if (cQf.m != fI) {
                cQf.m = fI;
                la2Var.m();
            }
        }
    }

    public static final void H(Object obj) throws Throwable {
        if (obj instanceof fq3.QnHx) {
            throw ((fq3.QnHx) obj).w;
        }
    }

    public static String I(long j) {
        long j2 = j / ((long) 3600000);
        if (j2 >= 5) {
            return "gt_5H";
        }
        if (j2 >= 3) {
            return "gt_3H";
        }
        if (j2 >= 2) {
            return "gt_2H";
        }
        long j3 = j / ((long) 60000);
        if (j3 >= 90) {
            return "gt_90m";
        }
        if (j3 >= 60) {
            return "gt_60m";
        }
        if (j3 >= 45 || j3 >= 30) {
            return "gt_30m";
        }
        if (j3 >= 15) {
            return "gt_15m";
        }
        if (j3 >= 5) {
            return "gt_5m";
        }
        if (j3 >= 1) {
            return "gt_1m";
        }
        return j / ((long) AdError.NETWORK_ERROR_CODE) >= 30 ? "gt_30s" : "lt_30s";
    }

    public static final long J(long j) {
        return ps0.e((int) (j >> 32), sp1.b(j));
    }

    public static float K() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static void L(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static /* synthetic */ boolean M(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String N(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static String O(Context context, String str) {
        oa3.h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = hm6.a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static final long d(int i, int i2) {
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = mp1.c;
        return j;
    }

    public static final long e(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final void f(int i, int i2, g30 g30Var, pg2 pg2Var, j81 j81Var) {
        int i3;
        j30 j30VarQ = g30Var.q(-887139432);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(pg2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new e82(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ti.a(((i3 << 3) & 896) | 3072, 2, j30VarQ, pg2Var, (h81) objB0, y00.a, false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new f82(i, i2, pg2Var, j81Var);
    }

    public static final void g(X05 x05, yy1 yy1Var) {
        long jB0 = ps0.b0(yy1Var.Y);
        int iC = sy4.c(kt2.c(jB0));
        int iC2 = sy4.c(kt2.d(jB0));
        x05.layout(iC, iC2, x05.getMeasuredWidth() + iC, x05.getMeasuredHeight() + iC2);
    }

    public static final void h(Throwable th) throws Throwable {
        Throwable thB;
        try {
            thB = zu0.b(th, th);
        } catch (Throwable unused) {
            thB = null;
        }
        if (thB != null) {
            throw thB;
        }
    }

    public static void i(d32 d32Var, StringBuilder sb) {
        int iLastIndexOf;
        if (d32Var == null) {
            sb.append("null");
            return;
        }
        String simpleName = d32Var.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = d32Var.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(d32Var)));
    }

    public static void j(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int m(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static final void n(int i, int i2) throws EOFException {
        throw new EOFException(bj0.a("Unable to discard ", i, " bytes: only ", i2, " available for writing"));
    }

    public static zv1 o(int i) {
        if (i != 0) {
            return i != 1 ? new nu3() : new je0();
        }
        return new nu3();
    }

    public static final void p(int i, int i2) throws EOFException {
        throw new EOFException(bj0.a("Unable to discard ", i, " bytes: only ", i2, " available for reading"));
    }

    public static mj5 q(View view) {
        mj5 mj5Var = (mj5) view.getTag(R.id.view_tree_view_model_store_owner);
        if (mj5Var != null) {
            return mj5Var;
        }
        Object parent = view.getParent();
        while (mj5Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            mj5Var = (mj5) view2.getTag(R.id.view_tree_view_model_store_owner);
            parent = view2.getParent();
        }
        return mj5Var;
    }

    public static final String r(zc5 zc5Var) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = zc5Var.e;
        String str2 = zc5Var.f;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        sb.append(sb2.toString());
        sb.append(zc5Var.b);
        int i = zc5Var.c;
        if (i != 0 && i != zc5Var.a.b) {
            sb.append(":");
            sb.append(String.valueOf(zc5Var.c));
        }
        return sb.toString();
    }

    public static final String s(zc5 zc5Var) {
        List<String> list = zc5Var.h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) wu.H0(list)).length() == 0 ? "/" : (String) wu.H0(list);
        }
        return wu.M0(list, "/", null, null, null, 62);
    }

    public static final Z7jl t(x45 x45Var) {
        Z7jl z7jl = x45Var.a;
        z7jl.getClass();
        long j = x45Var.b;
        return z7jl.subSequence(s55.e(j), s55.d(j));
    }

    public static final Z7jl u(x45 x45Var, int i) {
        long j = x45Var.b;
        int iD = s55.d(j);
        int iD2 = s55.d(j) + i;
        Z7jl z7jl = x45Var.a;
        return z7jl.subSequence(iD, Math.min(iD2, z7jl.w.length()));
    }

    public static final Z7jl v(x45 x45Var, int i) {
        long j = x45Var.b;
        return x45Var.a.subSequence(Math.max(0, s55.e(j) - i), s55.e(j));
    }

    public static final boolean w(rq4 rq4Var) {
        return (rq4Var.f == null && rq4Var.d == null && rq4Var.c == null) ? false : true;
    }

    public static int x(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z2 = f4 > 0.008856452f;
        float f5 = z2 ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = y;
        return lv.a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static final float y(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static float z(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @Override // defpackage.b91
    public Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        TW tw = (TW) obj4;
        LpT7Fixed lpT7 = (LpT7Fixed) obj3;
        w1L w1l = (w1L) obj2;
        int[] iArr = gR2r.QnHx.a;
        int i = ((Bs6V) obj).a;
        if (iArr[O.h(i)] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (iArr[O.h(i)] == 1) {
            return new Vb5(w1l.a, i, lpT7.a, tw.b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.f90
    public void b() {
    }

    @Override // defpackage.f90
    public void c() {
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzn());
    }
}
