package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ej5 extends View implements uw2 {
    public static final CQf I = CQf.w;
    public static final QnHx J = new QnHx();
    public static Method K;
    public static Field L;
    public static boolean M;
    public static boolean N;
    public final fw2 A;
    public boolean B;
    public Rect C;
    public boolean D;
    public boolean E;
    public final pq2 F;
    public final hy1<View> G;
    public long H;
    public final AndroidComposeView w;
    public final io0 x;
    public j81<? super dn, sd5> y;
    public h81<sd5> z;

    public static final class CQf extends cx1 implements x81<View, Matrix, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
            return sd5.a;
        }
    }

    public static final class F1 {
        @SuppressLint({"BanUncheckedReflection"})
        public static void a(View view) {
            try {
                if (!ej5.M) {
                    ej5.M = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ej5.K = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ej5.L = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ej5.K = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ej5.L = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ej5.K;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ej5.L;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ej5.L;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ej5.K;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ej5.N = true;
            }
        }
    }

    public static final class LPt8Fixed {
        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public static final class QnHx extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.set(((ej5) view).A.b());
        }
    }

    public ej5(AndroidComposeView androidComposeView, io0 io0Var, j81 j81Var, kz1.T23 t23) {
        super(androidComposeView.getContext());
        this.w = androidComposeView;
        this.x = io0Var;
        this.y = j81Var;
        this.z = t23;
        this.A = new fw2(androidComposeView.getDensity());
        this.F = new pq2(1);
        this.G = new hy1<>(I);
        this.H = m95.b;
        setWillNotDraw(false);
        setId(View.generateViewId());
        io0Var.addView(this);
    }

    private final qz2 getManualClipPath() {
        if (getClipToOutline()) {
            fw2 fw2Var = this.A;
            if (!(!fw2Var.i)) {
                fw2Var.e();
                return fw2Var.g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.D) {
            this.D = z;
            this.w.B(this, z);
        }
    }

    @Override // defpackage.uw2
    public final void a(oi2 oi2Var, boolean z) {
        hy1<View> hy1Var = this.G;
        if (!z) {
            eu.f(hy1Var.b(this), oi2Var);
            return;
        }
        float[] fArrA = hy1Var.a(this);
        if (fArrA != null) {
            eu.f(fArrA, oi2Var);
            return;
        }
        oi2Var.a = 0.0f;
        oi2Var.b = 0.0f;
        oi2Var.c = 0.0f;
        oi2Var.d = 0.0f;
    }

    @Override // defpackage.uw2
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, dj4 dj4Var, boolean z, long j2, long j3, jy1 jy1Var, ij0 ij0Var) {
        h81<sd5> h81Var;
        this.H = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        long j4 = this.H;
        int i = m95.c;
        setPivotX(Float.intBitsToFloat((int) (j4 >> 32)) * getWidth());
        setPivotY(m95.a(this.H) * getHeight());
        setCameraDistancePx(f10);
        el3.QnHx qnHx = el3.a;
        this.B = z && dj4Var == qnHx;
        j();
        boolean z2 = getManualClipPath() != null;
        setClipToOutline(z && dj4Var != qnHx);
        boolean zD = this.A.d(dj4Var, getAlpha(), getClipToOutline(), getElevation(), jy1Var, ij0Var);
        setOutlineProvider(this.A.b() != null ? J : null);
        boolean z3 = getManualClipPath() != null;
        if (z2 != z3 || (z3 && zD)) {
            invalidate();
        }
        if (!this.E && getElevation() > 0.0f && (h81Var = this.z) != null) {
            h81Var.invoke();
        }
        this.G.c();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            hj5 hj5Var = hj5.a;
            hj5Var.a(this, hH.A(j2));
            hj5Var.b(this, hH.A(j3));
        }
        if (i2 >= 31) {
            ij5.a.a(this, null);
        }
    }

    @Override // defpackage.uw2
    public final boolean c(long j) {
        float fC = kt2.c(j);
        float fD = kt2.d(j);
        if (this.B) {
            return 0.0f <= fC && fC < ((float) getWidth()) && 0.0f <= fD && fD < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.A.c(j);
        }
        return true;
    }

    @Override // defpackage.uw2
    public final void d(dn dnVar) {
        boolean z = getElevation() > 0.0f;
        this.E = z;
        if (z) {
            dnVar.v();
        }
        this.x.a(dnVar, this, getDrawingTime());
        if (this.E) {
            dnVar.h();
        }
    }

    @Override // defpackage.uw2
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.w;
        androidComposeView.R = true;
        this.y = null;
        this.z = null;
        boolean zD = androidComposeView.D(this);
        if (Build.VERSION.SDK_INT >= 23 || N || !zD) {
            this.x.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = false;
        setInvalidated(false);
        pq2 pq2Var = this.F;
        Object obj = pq2Var.w;
        Canvas canvas2 = ((ZCR) obj).a;
        ((ZCR) obj).a = canvas;
        ZCR zcr = (ZCR) obj;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            zcr.e();
            this.A.a(zcr);
            z = true;
        }
        j81<? super dn, sd5> j81Var = this.y;
        if (j81Var != null) {
            j81Var.invoke(zcr);
        }
        if (z) {
            zcr.r();
        }
        ((ZCR) pq2Var.w).a = canvas2;
    }

    @Override // defpackage.uw2
    public final long e(long j, boolean z) {
        hy1<View> hy1Var = this.G;
        if (!z) {
            return eu.e(hy1Var.b(this), j);
        }
        float[] fArrA = hy1Var.a(this);
        if (fArrA != null) {
            return eu.e(fArrA, j);
        }
        int i = kt2.e;
        return kt2.c;
    }

    @Override // defpackage.uw2
    public final void f(long j) {
        int i = (int) (j >> 32);
        int iB = sp1.b(j);
        if (i == getWidth() && iB == getHeight()) {
            return;
        }
        long j2 = this.H;
        int i2 = m95.c;
        float f = i;
        setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
        float f2 = iB;
        setPivotY(m95.a(this.H) * f2);
        long jE = ps0.e(f, f2);
        fw2 fw2Var = this.A;
        if (!cm4.b(fw2Var.d, jE)) {
            fw2Var.d = jE;
            fw2Var.h = true;
        }
        setOutlineProvider(fw2Var.b() != null ? J : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + iB);
        j();
        this.G.c();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // defpackage.uw2
    public final void g(kz1.T23 t23, j81 j81Var) {
        if (Build.VERSION.SDK_INT >= 23 || N) {
            this.x.addView(this);
        } else {
            setVisibility(0);
        }
        this.B = false;
        this.E = false;
        this.H = m95.b;
        this.y = j81Var;
        this.z = t23;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final io0 getContainer() {
        return this.x;
    }

    public long getLayerId() {
        return getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.w;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return LPt8Fixed.a(this.w);
        }
        return -1L;
    }

    @Override // defpackage.uw2
    public final void h(long j) {
        int i = mp1.c;
        int i2 = (int) (j >> 32);
        int left = getLeft();
        hy1<View> hy1Var = this.G;
        if (i2 != left) {
            offsetLeftAndRight(i2 - getLeft());
            hy1Var.c();
        }
        int iA = mp1.a(j);
        if (iA != getTop()) {
            offsetTopAndBottom(iA - getTop());
            hy1Var.c();
        }
    }

    @Override // defpackage.uw2
    public final void i() {
        if (!this.D || N) {
            return;
        }
        setInvalidated(false);
        F1.a(this);
    }

    @Override // android.view.View, defpackage.uw2
    public final void invalidate() {
        if (this.D) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.w.invalidate();
    }

    public final void j() {
        Rect rect;
        if (this.B) {
            Rect rect2 = this.C;
            if (rect2 == null) {
                this.C = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.C;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }
}
