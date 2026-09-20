package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jm5 {
    public static final jm5 b;
    public final FJCM a;

    public static class EQ extends byN {
        public static final jm5 m = jm5.g(WindowInsets.CONSUMED, null);

        public EQ(jm5 jm5Var, WindowInsets windowInsets) {
            super(jm5Var, windowInsets);
        }

        @Override // jm5.YKK, jm5.FJCM
        public final void d(View view) {
        }
    }

    public static class FJCM {
        public static final jm5 b;
        public final jm5 a;

        static {
            NUlFixed f1;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                f1 = new LPt8Fixed();
            } else {
                f1 = i >= 29 ? new F1() : new CQf();
            }
            b = f1.b().a.a().a.b().a.c();
        }

        public FJCM(jm5 jm5Var) {
            this.a = jm5Var;
        }

        public jm5 a() {
            return this.a;
        }

        public jm5 b() {
            return this.a;
        }

        public jm5 c() {
            return this.a;
        }

        public void d(View view) {
        }

        public ul0 e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FJCM)) {
                return false;
            }
            FJCM fjcm = (FJCM) obj;
            return k() == fjcm.k() && j() == fjcm.j() && uq2.a(h(), fjcm.h()) && uq2.a(g(), fjcm.g()) && uq2.a(e(), fjcm.e());
        }

        public uo1 f() {
            return h();
        }

        public uo1 g() {
            return uo1.e;
        }

        public uo1 h() {
            return uo1.e;
        }

        public int hashCode() {
            return uq2.b(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), g(), e());
        }

        public jm5 i(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean j() {
            return false;
        }

        public boolean k() {
            return false;
        }

        public void l(uo1[] uo1VarArr) {
        }

        public void m(jm5 jm5Var) {
        }

        public void n(uo1 uo1Var) {
        }
    }

    public static class LPt8Fixed extends F1 {
        public LPt8Fixed() {
        }

        public LPt8Fixed(jm5 jm5Var) {
            super(jm5Var);
        }
    }

    public static class NUlFixed {
        public NUlFixed() {
            this(new jm5());
        }

        public final void a() {
        }

        public jm5 b() {
            throw null;
        }

        public void c(uo1 uo1Var) {
            throw null;
        }

        public void d(uo1 uo1Var) {
            throw null;
        }

        public NUlFixed(jm5 jm5Var) {
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class QnHx {
        public static final Field a;
        public static final Field b;
        public static final Field c;
        public static final boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    public static class T23 extends auxFixed {
        public T23(jm5 jm5Var, WindowInsets windowInsets) {
            super(jm5Var, windowInsets);
        }

        @Override // jm5.FJCM
        public jm5 a() {
            return jm5.g(this.c.consumeDisplayCutout(), null);
        }

        @Override // jm5.FJCM
        public ul0 e() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new ul0(displayCutout);
        }

        @Override // jm5.YKK, jm5.FJCM
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof T23)) {
                return false;
            }
            T23 t23 = (T23) obj;
            return Objects.equals(this.c, t23.c) && Objects.equals(this.e, t23.e);
        }

        @Override // jm5.FJCM
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    public static class YKK extends FJCM {
        public static boolean f = false;
        public static Method g;
        public static Class<?> h;
        public static Field i;
        public static Field j;
        public final WindowInsets c;
        public uo1 d;
        public uo1 e;

        public YKK(jm5 jm5Var, WindowInsets windowInsets) {
            super(jm5Var);
            this.d = null;
            this.c = windowInsets;
        }

        private uo1 o(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f) {
                p();
            }
            Method method = g;
            if (method != null && h != null && i != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) i.get(j.get(objInvoke));
                    if (rect != null) {
                        return uo1.a(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void p() {
            try {
                g = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                h = cls;
                i = cls.getDeclaredField("mVisibleInsets");
                j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                i.setAccessible(true);
                j.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f = true;
        }

        @Override // jm5.FJCM
        public void d(View view) {
            uo1 uo1VarO = o(view);
            if (uo1VarO == null) {
                uo1VarO = uo1.e;
            }
            q(uo1VarO);
        }

        @Override // jm5.FJCM
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.e, ((YKK) obj).e);
            }
            return false;
        }

        @Override // jm5.FJCM
        public final uo1 h() {
            if (this.d == null) {
                WindowInsets windowInsets = this.c;
                this.d = uo1.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.d;
        }

        @Override // jm5.FJCM
        public jm5 i(int i2, int i3, int i4, int i5) {
            NUlFixed f1;
            jm5 jm5VarG = jm5.g(this.c, null);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                f1 = new LPt8Fixed(jm5VarG);
            } else {
                f1 = i6 >= 29 ? new F1(jm5VarG) : new CQf(jm5VarG);
            }
            f1.d(jm5.e(h(), i2, i3, i4, i5));
            f1.c(jm5.e(g(), i2, i3, i4, i5));
            return f1.b();
        }

        @Override // jm5.FJCM
        public boolean k() {
            return this.c.isRound();
        }

        @Override // jm5.FJCM
        public void l(uo1[] uo1VarArr) {
        }

        @Override // jm5.FJCM
        public void m(jm5 jm5Var) {
        }

        public void q(uo1 uo1Var) {
            this.e = uo1Var;
        }
    }

    public static class auxFixed extends YKK {
        public uo1 k;

        public auxFixed(jm5 jm5Var, WindowInsets windowInsets) {
            super(jm5Var, windowInsets);
            this.k = null;
        }

        @Override // jm5.FJCM
        public jm5 b() {
            return jm5.g(this.c.consumeStableInsets(), null);
        }

        @Override // jm5.FJCM
        public jm5 c() {
            return jm5.g(this.c.consumeSystemWindowInsets(), null);
        }

        @Override // jm5.FJCM
        public final uo1 g() {
            if (this.k == null) {
                WindowInsets windowInsets = this.c;
                this.k = uo1.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.k;
        }

        @Override // jm5.FJCM
        public boolean j() {
            return this.c.isConsumed();
        }

        @Override // jm5.FJCM
        public void n(uo1 uo1Var) {
            this.k = uo1Var;
        }
    }

    public static class byN extends T23 {
        public uo1 l;

        public byN(jm5 jm5Var, WindowInsets windowInsets) {
            super(jm5Var, windowInsets);
            this.l = null;
        }

        @Override // jm5.FJCM
        public uo1 f() {
            if (this.l == null) {
                this.l = uo1.b(this.c.getMandatorySystemGestureInsets());
            }
            return this.l;
        }

        @Override // jm5.YKK, jm5.FJCM
        public jm5 i(int i, int i2, int i3, int i4) {
            return jm5.g(this.c.inset(i, i2, i3, i4), null);
        }

        @Override // jm5.auxFixed, jm5.FJCM
        public void n(uo1 uo1Var) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = EQ.m;
        } else {
            b = FJCM.b;
        }
    }

    public jm5(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new EQ(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new byN(this, windowInsets);
        } else if (i >= 28) {
            this.a = new T23(this, windowInsets);
        } else {
            this.a = new auxFixed(this, windowInsets);
        }
    }

    public static uo1 e(uo1 uo1Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, uo1Var.a - i);
        int iMax2 = Math.max(0, uo1Var.b - i2);
        int iMax3 = Math.max(0, uo1Var.c - i3);
        int iMax4 = Math.max(0, uo1Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? uo1Var : uo1.a(iMax, iMax2, iMax3, iMax4);
    }

    public static jm5 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        jm5 jm5Var = new jm5(windowInsets);
        if (view != null) {
            Field field = bi5.a;
            if (bi5.auxFixed.b(view)) {
                jm5 jm5VarA = Build.VERSION.SDK_INT >= 23 ? bi5.EQ.a(view) : bi5.byN.j(view);
                FJCM fjcm = jm5Var.a;
                fjcm.m(jm5VarA);
                fjcm.d(view.getRootView());
            }
        }
        return jm5Var;
    }

    @Deprecated
    public final int a() {
        return this.a.h().d;
    }

    @Deprecated
    public final int b() {
        return this.a.h().a;
    }

    @Deprecated
    public final int c() {
        return this.a.h().c;
    }

    @Deprecated
    public final int d() {
        return this.a.h().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm5)) {
            return false;
        }
        return uq2.a(this.a, ((jm5) obj).a);
    }

    public final WindowInsets f() {
        FJCM fjcm = this.a;
        if (fjcm instanceof YKK) {
            return ((YKK) fjcm).c;
        }
        return null;
    }

    public final int hashCode() {
        FJCM fjcm = this.a;
        if (fjcm == null) {
            return 0;
        }
        return fjcm.hashCode();
    }

    public static class CQf extends NUlFixed {
        public static Field c = null;
        public static boolean d = false;
        public static Constructor<WindowInsets> e = null;
        public static boolean f = false;
        public WindowInsets a;
        public uo1 b;

        public CQf() {
            this.a = e();
        }

        private static WindowInsets e() {
            if (!d) {
                try {
                    c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                d = true;
            }
            Field field = c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f) {
                try {
                    e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f = true;
            }
            Constructor<WindowInsets> constructor = e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // jm5.NUlFixed
        public jm5 b() {
            a();
            jm5 jm5VarG = jm5.g(this.a, null);
            FJCM fjcm = jm5VarG.a;
            fjcm.l(null);
            fjcm.n(this.b);
            return jm5VarG;
        }

        @Override // jm5.NUlFixed
        public void c(uo1 uo1Var) {
            this.b = uo1Var;
        }

        @Override // jm5.NUlFixed
        public void d(uo1 uo1Var) {
            WindowInsets windowInsets = this.a;
            if (windowInsets != null) {
                this.a = windowInsets.replaceSystemWindowInsets(uo1Var.a, uo1Var.b, uo1Var.c, uo1Var.d);
            }
        }

        public CQf(jm5 jm5Var) {
            super(jm5Var);
            this.a = jm5Var.f();
        }
    }

    public static class F1 extends NUlFixed {
        public final WindowInsets$Builder a;

        public F1() {
            this.a = new WindowInsets$Builder();
        }

        @Override // jm5.NUlFixed
        public jm5 b() {
            a();
            jm5 jm5VarG = jm5.g(this.a.build(), null);
            jm5VarG.a.l(null);
            return jm5VarG;
        }

        @Override // jm5.NUlFixed
        public void c(uo1 uo1Var) {
            this.a.setStableInsets(uo1Var.c());
        }

        @Override // jm5.NUlFixed
        public void d(uo1 uo1Var) {
            this.a.setSystemWindowInsets(uo1Var.c());
        }

        public F1(jm5 jm5Var) {
            WindowInsets$Builder windowInsets$Builder;
            super(jm5Var);
            WindowInsets windowInsetsF = jm5Var.f();
            if (windowInsetsF != null) {
                windowInsets$Builder = new WindowInsets$Builder(windowInsetsF);
            } else {
                windowInsets$Builder = new WindowInsets$Builder();
            }
            this.a = windowInsets$Builder;
        }
    }

    public jm5() {
        this.a = new FJCM(this);
    }
}
