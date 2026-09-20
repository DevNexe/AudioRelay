package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hn implements i91 {
    public static Method w;
    public static Method x;
    public static boolean y;
    public static final hn z = new hn();
    public static final Class[] A = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final py4 B = new py4("REMOVED_TASK");
    public static final py4 C = new py4("CLOSED_EMPTY");

    public static final boolean a(Object obj) {
        if (obj instanceof pp4) {
            pp4 pp4Var = (pp4) obj;
            if (pp4Var.j() != eo2.a && pp4Var.j() != tv4.a && pp4Var.j() != ml3.a) {
                return false;
            }
            T value = pp4Var.getValue();
            if (value == 0) {
                return true;
            }
            return a(value);
        }
        if ((obj instanceof t81) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = A;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void b(Canvas canvas, boolean z2) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            in.a.a(canvas, z2);
            return;
        }
        if (!y) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    w = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    x = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    w = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    x = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = w;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = x;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            y = true;
        }
        if (z2) {
            try {
                Method method4 = w;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = x) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:26:0x003f  */
    public static void c(dn dnVar, o55 o55Var) {
        boolean z2;
        boolean z3;
        long j = o55Var.c;
        float f = (int) (j >> 32);
        kh2 kh2Var = o55Var.b;
        if (f < kh2Var.d) {
            z2 = true;
        } else if (kh2Var.c || ((float) sp1.b(j)) < kh2Var.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        m55 m55Var = o55Var.a;
        if (!z2) {
            z3 = false;
        } else if (m55Var.f == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            dl3 dl3VarH = hH.h(kt2.b, ps0.e(f, sp1.b(j)));
            dnVar.e();
            dnVar.i(dl3VarH, 1);
        }
        try {
            w55 w55Var = m55Var.b;
            w55 w55Var2 = m55Var.b;
            w55Var.a.a.d();
            long jB = w55Var2.b();
            rq4 rq4Var = w55Var2.a;
            yi4 yi4Var = rq4Var.n;
            a25 a25Var = rq4Var.m;
            dnVar.e();
            ArrayList arrayList = kh2Var.h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yy2 yy2Var = (yy2) arrayList.get(i);
                yy2Var.a.m(dnVar, jB, yi4Var, a25Var);
                dnVar.o(0.0f, yy2Var.a.getHeight());
            }
            dnVar.r();
        } finally {
            if (z3) {
                dnVar.r();
            }
        }
    }

    public static pg2 d(pg2 pg2Var, boolean z2, wj4 wj4Var) {
        return f30.a(pg2Var, wo1.a, new j43(yu.h, null, wj4Var, h43.w, i43.w, z2));
    }

    public static final q12 e(g30 g30Var) {
        g30Var.e(1470655220);
        q12 q12Var = (q12) g7.f(new Object[0], q12.s, null, new s12(0, 0), g30Var, 4);
        g30Var.G();
        return q12Var;
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        return qw.e((List) obj);
    }
}
