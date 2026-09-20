package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.C0239D;
import defpackage.Cz;
import defpackage.FWT;
import defpackage.IrX;
import defpackage.OW8;
import defpackage.Qr;
import defpackage.T$;
import defpackage.X;
import defpackage.XTd3;
import defpackage.XoLQ;
import defpackage.Yx1;
import defpackage.Z5;
import defpackage.ZCR;
import defpackage.a21;
import defpackage.a53;
import defpackage.a93;
import defpackage.aq4;
import defpackage.b34;
import defpackage.b93;
import defpackage.b94;
import defpackage.bHr;
import defpackage.bi5;
import defpackage.bp4;
import defpackage.bw1;
import defpackage.c55;
import defpackage.ch2;
import defpackage.cl;
import defpackage.cl3;
import defpackage.cq4;
import defpackage.cx1;
import defpackage.cx2;
import defpackage.d21;
import defpackage.d32;
import defpackage.d41;
import defpackage.d55;
import defpackage.dl;
import defpackage.dl3;
import defpackage.e41;
import defpackage.eLUR;
import defpackage.ej5;
import defpackage.et3;
import defpackage.eu;
import defpackage.ez1;
import defpackage.f55;
import defpackage.fj5;
import defpackage.fl;
import defpackage.fp1;
import defpackage.ft3;
import defpackage.g31;
import defpackage.g7;
import defpackage.g70;
import defpackage.g93;
import defpackage.go;
import defpackage.h81;
import defpackage.h93;
import defpackage.h94;
import defpackage.hj0;
import defpackage.hm5;
import defpackage.hu3;
import defpackage.i93;
import defpackage.iE;
import defpackage.ij0;
import defpackage.ij1;
import defpackage.im5;
import defpackage.io0;
import defpackage.iu3;
import defpackage.j81;
import defpackage.ja3;
import defpackage.jj0;
import defpackage.ju3;
import defpackage.jy1;
import defpackage.k4;
import defpackage.kt2;
import defpackage.kz1;
import defpackage.kz2;
import defpackage.lo1;
import defpackage.lp2;
import defpackage.lzS;
import defpackage.m4;
import defpackage.mg3;
import defpackage.ml3;
import defpackage.mo1;
import defpackage.mp1;
import defpackage.no1;
import defpackage.o94;
import defpackage.oz;
import defpackage.p21;
import defpackage.pb2;
import defpackage.pg2;
import defpackage.pq2;
import defpackage.ps0;
import defpackage.q21;
import defpackage.r21;
import defpackage.s55;
import defpackage.sd5;
import defpackage.sy4;
import defpackage.t4;
import defpackage.tZ;
import defpackage.te;
import defpackage.ti5;
import defpackage.tj5;
import defpackage.ty;
import defpackage.u4;
import defpackage.ui2;
import defpackage.ur1;
import defpackage.uw2;
import defpackage.uy2;
import defpackage.v4;
import defpackage.vb1;
import defpackage.vo1;
import defpackage.vq0;
import defpackage.vw;
import defpackage.vw2;
import defpackage.w4;
import defpackage.w61;
import defpackage.wh1;
import defpackage.wi5;
import defpackage.wo1;
import defpackage.wo3;
import defpackage.wv1;
import defpackage.ww2;
import defpackage.x45;
import defpackage.x55;
import defpackage.xh1;
import defpackage.xo2;
import defpackage.xv1;
import defpackage.yE;
import defpackage.yw2;
import defpackage.yy1;
import defpackage.zv1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor", "VisibleForTests"})
public final class AndroidComposeView extends ViewGroup implements ww2, et3, ja3, w61 {
    public static Class<?> M0;
    public static Method N0;
    public final q21 A;
    public final go A0;
    public final im5 B;
    public MotionEvent B0;
    public final bw1 C;
    public long C0;
    public final pg2 D;
    public final cq4 D0;
    public final pq2 E;
    public final ui2<h81<sd5>> E0;
    public final yy1 F;
    public final T23 F0;
    public final AndroidComposeView G;
    public final ty G0;
    public final h94 H;
    public boolean H0;
    public final Z5 I;
    public final auxFixed I0;
    public final w4 J;
    public final cl J0;
    public final ArrayList K;
    public a93 K0;
    public ArrayList L;
    public final YKK L0;
    public boolean M;
    public final ch2 N;
    public final i93 O;
    public j81<? super Configuration, sd5> P;
    public final tZ Q;
    public boolean R;
    public final oz S;
    public final lzS T;
    public final cx2 U;
    public boolean V;
    public vw W;
    public io0 a0;
    public g70 b0;
    public boolean c0;
    public final pb2 d0;
    public final IrX e0;
    public long f0;
    public final int[] g0;
    public final float[] h0;
    public final float[] i0;
    public long j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final kz2 n0;
    public j81<? super CQf, sd5> o0;
    public final Yx1 p0;
    public final Qr q0;
    public final T$ r0;
    public final d55 s0;
    public final c55 t0;
    public final X u0;
    public final kz2 v0;
    public long w;
    public int w0;
    public final boolean x;
    public final kz2 x0;
    public final ez1 y;
    public final a53 y0;
    public jj0 z;
    public final no1 z0;

    public static final class CQf {
        public final d32 a;
        public final b34 b;

        public CQf(d32 d32Var, b34 b34Var) {
            this.a = d32Var;
            this.b = b34Var;
        }
    }

    public static final class EQ extends cx1 implements j81<o94, sd5> {
        public static final EQ w = new EQ();

        public EQ() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(o94 o94Var) {
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<lo1, Boolean> {
        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(lo1 lo1Var) {
            int i = lo1Var.a;
            boolean zRequestFocusFromTouch = false;
            boolean z = i == 1;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            if (z) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode();
            } else {
                if (i == 2) {
                    zRequestFocusFromTouch = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
                }
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    public static final class FJCM extends cx1 implements j81<h81<? extends sd5>, sd5> {
        public FJCM() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(h81<? extends sd5> h81Var) {
            h81<? extends sd5> h81Var2 = h81Var;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                h81Var2.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new eLUR(h81Var2, 0));
                }
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<Configuration, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Configuration configuration) {
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements j81<xv1, Boolean> {
        public NUlFixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(xv1 xv1Var) {
            d21 d21Var;
            KeyEvent keyEvent = xv1Var.a;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.getClass();
            long jB = zv1.b(keyEvent);
            if (wv1.a(jB, wv1.g)) {
                d21Var = new d21(keyEvent.isShiftPressed() ? 2 : 1);
            } else if (wv1.a(jB, wv1.e)) {
                d21Var = new d21(4);
            } else if (wv1.a(jB, wv1.d)) {
                d21Var = new d21(3);
            } else if (wv1.a(jB, wv1.b)) {
                d21Var = new d21(5);
            } else if (wv1.a(jB, wv1.c)) {
                d21Var = new d21(6);
            } else {
                if (wv1.a(jB, wv1.f) ? true : wv1.a(jB, wv1.i) ? true : wv1.a(jB, wv1.q)) {
                    d21Var = new d21(7);
                } else {
                    d21Var = wv1.a(jB, wv1.a) ? true : wv1.a(jB, wv1.l) ? new d21(8) : null;
                }
            }
            if (d21Var != null) {
                if (zv1.c(keyEvent) == 2) {
                    return Boolean.valueOf(androidComposeView.getFocusManager().a(d21Var.a));
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class QnHx {
        public static final boolean a() {
            Class<?> cls = AndroidComposeView.M0;
            try {
                if (AndroidComposeView.M0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.M0 = cls2;
                    AndroidComposeView.N0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.N0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class T23 implements Runnable {
        public T23() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.B0;
            if (motionEvent != null) {
                boolean z = false;
                boolean z2 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z = true;
                }
                if (z) {
                    int i = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    androidComposeView2.G(motionEvent, i, androidComposeView2.C0, false);
                }
            }
        }
    }

    public static final class YKK implements b93 {
        public YKK(AndroidComposeView androidComposeView) {
        }
    }

    public static final class auxFixed extends cx1 implements h81<sd5> {
        public auxFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.B0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.C0 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.F0);
            }
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements j81<ju3, Boolean> {
        public static final byN w = new byN();

        public byN() {
            super(1);
        }

        @Override // defpackage.j81
        public final Boolean invoke(ju3 ju3Var) {
            return Boolean.FALSE;
        }
    }

    static {
        new QnHx();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [Yx1] */
    /* JADX WARN: Type inference failed for: r6v3, types: [Qr] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T$] */
    public AndroidComposeView(Context context) {
        super(context);
        this.w = kt2.d;
        this.x = true;
        this.y = new ez1();
        this.z = new jj0(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
        b94 b94Var = new b94(b94.y.addAndGet(1), false, EQ.w);
        q21 q21Var = new q21();
        this.A = q21Var;
        this.B = new im5();
        bw1 bw1Var = new bw1(new NUlFixed(), null);
        this.C = bw1Var;
        mg3<a21<ju3>> mg3Var = hu3.a;
        wo1.QnHx qnHx = wo1.a;
        a21 a21Var = new a21(new iu3(byN.w));
        vo1 vo1Var = new vo1();
        pg2 pg2VarY = hj0.b(vo1Var, a21Var).y(vo1Var.x);
        this.D = pg2VarY;
        this.E = new pq2(1);
        yy1 yy1Var = new yy1(false);
        yy1Var.b(ft3.b);
        yy1Var.g(hj0.b(b94Var, pg2VarY).y(q21Var.b).y(bw1Var));
        yy1Var.e(getDensity());
        this.F = yy1Var;
        this.G = this;
        this.H = new h94(getRoot());
        Z5 z5 = new Z5(this);
        this.I = z5;
        this.J = new w4();
        this.K = new ArrayList();
        this.N = new ch2();
        this.O = new i93(getRoot());
        this.P = LPt8Fixed.w;
        int i = Build.VERSION.SDK_INT;
        this.Q = i >= 26 ? new tZ(this, getAutofillTree()) : null;
        this.S = new oz(context);
        this.T = new lzS(context);
        this.U = new cx2(new FJCM());
        this.d0 = new pb2(getRoot());
        this.e0 = new IrX(ViewConfiguration.get(context));
        this.f0 = mp1.b;
        this.g0 = new int[]{0, 0};
        this.h0 = eu.c();
        this.i0 = eu.c();
        this.j0 = -1L;
        this.l0 = kt2.c;
        this.m0 = true;
        this.n0 = ps0.R(null);
        this.p0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Yx1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class<?> cls = AndroidComposeView.M0;
                this.w.H();
            }
        };
        this.q0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: Qr
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class<?> cls = AndroidComposeView.M0;
                this.w.H();
            }
        };
        this.r0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: T$
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                Class<?> cls = AndroidComposeView.M0;
                int i2 = z ? 1 : 2;
                AndroidComposeView androidComposeView = this.w;
                androidComposeView.z0.b.setValue(new lo1(i2));
                g7.j(androidComposeView.A.a);
            }
        };
        d55 d55Var = new d55(this);
        this.s0 = d55Var;
        this.t0 = (c55) bHr.a.invoke(d55Var);
        this.u0 = new X();
        this.v0 = ps0.Q(fp1.U(context), ml3.a);
        this.w0 = i >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        jy1 jy1Var = jy1.Ltr;
        if (layoutDirection != 0 && layoutDirection == 1) {
            jy1Var = jy1.Rtl;
        }
        this.x0 = ps0.R(jy1Var);
        this.y0 = new a53(this);
        this.z0 = new no1(isInTouchMode() ? 1 : 2, new F1());
        this.A0 = new go(this);
        this.D0 = new cq4(1);
        this.E0 = new ui2<>(new h81[16]);
        this.F0 = new T23();
        this.G0 = new ty(this, 4);
        this.I0 = new auxFixed();
        this.J0 = i >= 29 ? new fl() : new dl();
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            te.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        bi5.m(this, z5);
        getRoot().k(this);
        if (i >= 29) {
            yE.a.a(this);
        }
        this.L0 = new YKK(this);
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static void s(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).m();
            } else if (childAt instanceof ViewGroup) {
                s((ViewGroup) childAt);
            }
        }
    }

    private void setFontFamilyResolver(e41.QnHx qnHx) {
        this.v0.setValue(qnHx);
    }

    private void setLayoutDirection(jy1 jy1Var) {
        this.x0.setValue(jy1Var);
    }

    private final void setViewTreeOwners(CQf cQf) {
        this.n0.setValue(cQf);
    }

    public static uy2 t(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return new uy2(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new uy2(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new uy2(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public static View u(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (ur1.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewU = u(viewGroup.getChildAt(i2), i);
            if (viewU != null) {
                return viewU;
            }
        }
        return null;
    }

    public static void w(yy1 yy1Var) {
        yy1Var.C();
        ui2<yy1> ui2VarV = yy1Var.v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                w(yy1VarArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public static boolean y(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if ((Float.isInfinite(x) || Float.isNaN(x)) ? false : true) {
            float y = motionEvent.getY();
            if ((Float.isInfinite(y) || Float.isNaN(y)) ? false : true) {
                float rawX = motionEvent.getRawX();
                if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
                    float rawY = motionEvent.getRawY();
                    if ((Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean A(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.B0) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
        }
        return true;
    }

    public final void B(uw2 uw2Var, boolean z) {
        ArrayList arrayList = this.K;
        if (!z) {
            if (!this.M && !arrayList.remove(uw2Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            if (!this.M) {
                arrayList.add(uw2Var);
                return;
            }
            ArrayList arrayList2 = this.L;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.L = arrayList2;
            }
            arrayList2.add(uw2Var);
        }
    }

    public final void C() {
        if (this.k0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.j0) {
            this.j0 = jCurrentAnimationTimeMillis;
            cl clVar = this.J0;
            float[] fArr = this.h0;
            clVar.a(this, fArr);
            Cz.t(fArr, this.i0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.g0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.l0 = X.a(f - iArr[0], f2 - iArr[1]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public final boolean D(uw2 uw2Var) {
        boolean z;
        io0 io0Var = this.a0;
        cq4 cq4Var = this.D0;
        if (io0Var == null || ej5.N || Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            cq4Var.e();
            if (((ui2) cq4Var.x).y < 10) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            cq4Var.e();
            ((ui2) cq4Var.x).b(new WeakReference(uw2Var, (ReferenceQueue) cq4Var.y));
        }
        return z;
    }

    public final void E(yy1 yy1Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.c0 && yy1Var != null) {
            while (yy1Var != null && yy1Var.U == 1) {
                yy1Var = yy1Var.s();
            }
            if (yy1Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final int F(MotionEvent motionEvent) {
        h93 h93VarPrevious;
        ch2 ch2Var = this.N;
        g93 g93VarA = ch2Var.a(motionEvent, this);
        i93 i93Var = this.O;
        if (g93VarA == null) {
            i93Var.c.a.clear();
            xo2 xo2Var = (xo2) i93Var.b.y;
            xo2Var.c();
            xo2Var.a.e();
            return 0;
        }
        List<h93> list = g93VarA.a;
        ListIterator<h93> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                h93VarPrevious = null;
                break;
            }
            h93VarPrevious = listIterator.previous();
        } while (!h93VarPrevious.e);
        h93 h93Var = h93VarPrevious;
        if (h93Var != null) {
            this.w = h93Var.d;
        }
        int iA = i93Var.a(g93VarA, this, z(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            if (!((iA & 1) != 0)) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                ch2Var.c.delete(pointerId);
                ch2Var.b.delete(pointerId);
            }
        }
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    public final void G(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                actionIndex = -1;
            } else {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i == 9 || i == 10) {
            actionIndex = -1;
        } else {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long jL = l(X.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = kt2.c(jL);
            pointerCoords.y = kt2.d(jL);
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.O.a(this.N.a(motionEventObtain, this), this, true);
        motionEventObtain.recycle();
    }

    public final void H() {
        int[] iArr = this.g0;
        getLocationOnScreen(iArr);
        long j = this.f0;
        int i = mp1.c;
        boolean z = false;
        if (((int) (j >> 32)) != iArr[0] || mp1.a(j) != iArr[1]) {
            this.f0 = C0239D.d(iArr[0], iArr[1]);
            z = true;
        }
        this.d0.a(z);
    }

    @Override // defpackage.ww2
    public final void a(boolean z) {
        auxFixed auxVar;
        pb2 pb2Var = this.d0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                auxVar = this.I0;
            } finally {
                Trace.endSection();
            }
        } else {
            auxVar = null;
        }
        if (pb2Var.d(auxVar)) {
            requestLayout();
        }
        pb2Var.a(false);
        sd5 sd5Var = sd5.a;
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        tZ tZVar;
        if (!(Build.VERSION.SDK_INT >= 26) || (tZVar = this.Q) == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            t4 t4Var = t4.a;
            if (t4Var.d(autofillValue)) {
                t4Var.i(autofillValue).toString();
            } else {
                if (t4Var.b(autofillValue)) {
                    throw new lp2("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (t4Var.c(autofillValue)) {
                    throw new lp2("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (t4Var.e(autofillValue)) {
                    throw new lp2("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // defpackage.ww2
    public final void b(yy1 yy1Var) {
        this.d0.c(yy1Var);
    }

    @Override // defpackage.ww2
    public final void c(yy1 yy1Var, long j) {
        pb2 pb2Var = this.d0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            pb2Var.e(yy1Var, j);
            pb2Var.a(false);
            sd5 sd5Var = sd5.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.I.k(i, this.w, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.I.k(i, this.w, true);
    }

    @Override // defpackage.ww2
    public final long d(long j) {
        C();
        return eu.e(this.h0, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            w(getRoot());
        }
        int i = vw2.a;
        a(true);
        this.M = true;
        pq2 pq2Var = this.E;
        ZCR zcr = (ZCR) pq2Var.w;
        Canvas canvas2 = zcr.a;
        zcr.a = canvas;
        getRoot().p(zcr);
        ((ZCR) pq2Var.w).a = canvas2;
        ArrayList arrayList = this.K;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((uw2) arrayList.get(i2)).i();
            }
        }
        if (ej5.N) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.M = false;
        ArrayList arrayList2 = this.L;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        float fA;
        a21<ju3> a21Var;
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f = -motionEvent.getAxisValue(26);
            Context context = getContext();
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                Method method = wi5.a;
                fA = wi5.QnHx.b(viewConfiguration);
            } else {
                fA = wi5.a(viewConfiguration, context);
            }
            ju3 ju3Var = new ju3(fA * f, (i >= 26 ? wi5.QnHx.a(viewConfiguration) : wi5.a(viewConfiguration, getContext())) * f, motionEvent.getEventTime());
            r21 r21VarB = g7.b(this.A.a);
            if (r21VarB != null && (a21Var = r21VarB.C) != null && (a21Var.b(ju3Var) || a21Var.a(ju3Var))) {
                return true;
            }
        } else {
            if (y(motionEvent) || !isAttachedToWindow()) {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            if ((v(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L27;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        r21 r21VarE;
        yy1 yy1Var;
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        r21 r21Var = this.C.y;
        if (r21Var != null && (r21VarE = iE.e(r21Var)) != null) {
            kz1 kz1Var = r21VarE.H;
            bw1 bw1Var = null;
            if (kz1Var != null && (yy1Var = kz1Var.A) != null) {
                ui2<bw1> ui2Var = r21VarE.K;
                int i = ui2Var.y;
                if (i > 0) {
                    bw1[] bw1VarArr = ui2Var.w;
                    int i2 = 0;
                    do {
                        bw1 bw1Var2 = bw1VarArr[i2];
                        if (ur1.a(bw1Var2.A, yy1Var)) {
                            if (bw1Var == null) {
                                bw1Var = bw1Var2;
                                break;
                            }
                            yy1 yy1Var2 = bw1Var2.A;
                            bw1 bw1Var3 = bw1Var;
                            while (!ur1.a(bw1Var3, bw1Var2)) {
                                bw1Var3 = bw1Var3.z;
                                if (bw1Var3 == null || !ur1.a(bw1Var3.A, yy1Var2)) {
                                    bw1Var = bw1Var2;
                                    break;
                                }
                            }
                        }
                        i2++;
                    } while (i2 < i);
                }
                if (bw1Var == null) {
                    bw1Var = r21VarE.J;
                }
            }
            if (bw1Var != null) {
                if (bw1Var.b(keyEvent)) {
                    return true;
                }
                return bw1Var.a(keyEvent);
            }
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.H0) {
            ty tyVar = this.G0;
            removeCallbacks(tyVar);
            MotionEvent motionEvent2 = this.B0;
            if (motionEvent.getActionMasked() != 0) {
                tyVar.run();
            } else {
                if ((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                    tyVar.run();
                } else {
                    this.H0 = false;
                }
            }
        }
        if (y(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !A(motionEvent)) {
            return false;
        }
        int iV = v(motionEvent);
        if ((iV & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iV & 1) != 0;
    }

    @Override // defpackage.ww2
    public final long e(long j) {
        C();
        return eu.e(this.i0, j);
    }

    @Override // defpackage.ww2
    public final void f() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View findViewByAccessibilityIdTraversal(int r7) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L31
            r1 = 29
            if (r0 < r1) goto L2c
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "findViewByAccessibilityIdTraversal"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L31
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L31
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NoSuchMethodException -> L31
            r1[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Object r7 = r0.invoke(r6, r1)     // Catch: java.lang.NoSuchMethodException -> L31
            boolean r0 = r7 instanceof android.view.View     // Catch: java.lang.NoSuchMethodException -> L31
            if (r0 == 0) goto L31
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.NoSuchMethodException -> L31
            goto L32
        L2c:
            android.view.View r7 = u(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L31
            goto L32
        L31:
            r7 = 0
        L32:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.findViewByAccessibilityIdTraversal(int):android.view.View");
    }

    @Override // defpackage.ww2
    public final uw2 g(kz1.T23 t23, j81 j81Var) {
        Object obj;
        cq4 cq4Var = this.D0;
        cq4Var.e();
        do {
            if (!((ui2) cq4Var.x).k()) {
                obj = null;
                break;
            }
            ui2 ui2Var = (ui2) cq4Var.x;
            obj = ((Reference) ui2Var.n(ui2Var.y - 1)).get();
        } while (obj == null);
        uw2 uw2Var = (uw2) obj;
        if (uw2Var != null) {
            uw2Var.g(t23, j81Var);
            return uw2Var;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.m0) {
            try {
                return new wo3(this, j81Var, t23);
            } catch (Throwable unused) {
                this.m0 = false;
            }
        }
        if (this.a0 == null) {
            if (!ej5.M) {
                ej5.F1.a(new View(getContext()));
            }
            io0 io0Var = ej5.N ? new io0(getContext()) : new fj5(getContext());
            this.a0 = io0Var;
            addView(io0Var);
        }
        return new ej5(this, this.a0, j81Var, t23);
    }

    public final vw getAndroidViewsHandler$ui_release() {
        if (this.W == null) {
            vw vwVar = new vw(getContext());
            this.W = vwVar;
            addView(vwVar);
        }
        return this.W;
    }

    @Override // defpackage.ww2
    public k4 getAutofill() {
        return this.Q;
    }

    @Override // defpackage.ww2
    public w4 getAutofillTree() {
        return this.J;
    }

    public final j81<Configuration, sd5> getConfigurationChangeObserver() {
        return this.P;
    }

    @Override // defpackage.ww2
    public ij0 getDensity() {
        return this.z;
    }

    @Override // defpackage.ww2
    public p21 getFocusManager() {
        return this.A;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        sd5 sd5Var;
        r21 r21VarB = g7.b(this.A.a);
        if (r21VarB != null) {
            dl3 dl3VarG = iE.g(r21VarB);
            rect.left = sy4.c(dl3VarG.a);
            rect.top = sy4.c(dl3VarG.b);
            rect.right = sy4.c(dl3VarG.c);
            rect.bottom = sy4.c(dl3VarG.d);
            sd5Var = sd5.a;
        } else {
            sd5Var = null;
        }
        if (sd5Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // defpackage.ww2
    public e41.QnHx getFontFamilyResolver() {
        return (e41.QnHx) this.v0.getValue();
    }

    @Override // defpackage.ww2
    public d41.QnHx getFontLoader() {
        return this.u0;
    }

    @Override // defpackage.ww2
    public vb1 getHapticFeedBack() {
        return this.y0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.d0.b.a.isEmpty();
    }

    @Override // defpackage.ww2
    public mo1 getInputModeManager() {
        return this.z0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.j0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, defpackage.ww2
    public jy1 getLayoutDirection() {
        return (jy1) this.x0.getValue();
    }

    public long getMeasureIteration() {
        pb2 pb2Var = this.d0;
        if (pb2Var.c) {
            return pb2Var.f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // defpackage.ww2
    public b93 getPointerIconService() {
        return this.L0;
    }

    public yy1 getRoot() {
        return this.F;
    }

    public et3 getRootForTest() {
        return this.G;
    }

    public h94 getSemanticsOwner() {
        return this.H;
    }

    @Override // defpackage.ww2
    public ez1 getSharedDrawScope() {
        return this.y;
    }

    @Override // defpackage.ww2
    public boolean getShowLayoutBounds() {
        return this.V;
    }

    @Override // defpackage.ww2
    public cx2 getSnapshotObserver() {
        return this.U;
    }

    @Override // defpackage.ww2
    public c55 getTextInputService() {
        return this.t0;
    }

    @Override // defpackage.ww2
    public x55 getTextToolbar() {
        return this.A0;
    }

    public View getView() {
        return this;
    }

    @Override // defpackage.ww2
    public ti5 getViewConfiguration() {
        return this.e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CQf getViewTreeOwners() {
        return (CQf) this.n0.getValue();
    }

    @Override // defpackage.ww2
    public hm5 getWindowInfo() {
        return this.B;
    }

    @Override // defpackage.ww2
    public final void i(h81<sd5> h81Var) {
        ui2<h81<sd5>> ui2Var = this.E0;
        if (ui2Var.f(h81Var)) {
            return;
        }
        ui2Var.b(h81Var);
    }

    @Override // defpackage.ww2
    public final void j(ww2.QnHx qnHx) {
        this.d0.e.b(qnHx);
        E(null);
    }

    @Override // defpackage.ww2
    public final void k(yy1 yy1Var, boolean z) {
        if (this.d0.h(yy1Var, z)) {
            E(yy1Var);
        }
    }

    @Override // defpackage.ja3
    public final long l(long j) {
        C();
        long jE = eu.e(this.h0, j);
        return X.a(kt2.c(this.l0) + kt2.c(jE), kt2.d(this.l0) + kt2.d(jE));
    }

    @Override // defpackage.ww2
    public final void m() {
        if (this.R) {
            aq4 aq4Var = getSnapshotObserver().a;
            yw2 yw2Var = yw2.w;
            synchronized (aq4Var.d) {
                ui2<aq4.QnHx<?>> ui2Var = aq4Var.d;
                int i = ui2Var.y;
                if (i > 0) {
                    aq4.QnHx<?>[] qnHxArr = ui2Var.w;
                    int i2 = 0;
                    while (true) {
                        xh1<?> xh1Var = qnHxArr[i2].b;
                        int i3 = xh1Var.d;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i3) {
                            int i6 = xh1Var.a[i4];
                            wh1<?> wh1Var = xh1Var.c[i6];
                            int i7 = wh1Var.w;
                            int i8 = 0;
                            int i9 = 0;
                            while (i9 < i7) {
                                Object obj = wh1Var.x[i9];
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                                if (((Boolean) yw2Var.invoke(obj)).booleanValue()) {
                                    qnHxArr = qnHxArr;
                                } else {
                                    if (i8 != i9) {
                                        wh1Var.x[i8] = obj;
                                    }
                                    i8++;
                                }
                                i9++;
                                qnHxArr = qnHxArr;
                            }
                            aq4.QnHx<?>[] qnHxArr2 = qnHxArr;
                            int i10 = wh1Var.w;
                            for (int i11 = i8; i11 < i10; i11++) {
                                wh1Var.x[i11] = null;
                            }
                            wh1Var.w = i8;
                            if (i8 > 0) {
                                if (i5 != i4) {
                                    int[] iArr = xh1Var.a;
                                    int i12 = iArr[i5];
                                    iArr[i5] = i6;
                                    iArr[i4] = i12;
                                }
                                i5++;
                            }
                            i4++;
                            qnHxArr = qnHxArr2;
                        }
                        aq4.QnHx<?>[] qnHxArr3 = qnHxArr;
                        int i13 = xh1Var.d;
                        for (int i14 = i5; i14 < i13; i14++) {
                            xh1Var.b[xh1Var.a[i14]] = null;
                        }
                        xh1Var.d = i5;
                        i2++;
                        if (i2 >= i) {
                            break;
                        } else {
                            qnHxArr = qnHxArr3;
                        }
                    }
                }
                sd5 sd5Var = sd5.a;
            }
            this.R = false;
        }
        vw vwVar = this.W;
        if (vwVar != null) {
            s(vwVar);
        }
        while (this.E0.k()) {
            int i15 = this.E0.y;
            for (int i16 = 0; i16 < i15; i16++) {
                h81<sd5>[] h81VarArr = this.E0.w;
                h81<sd5> h81Var = h81VarArr[i16];
                h81VarArr[i16] = null;
                if (h81Var != null) {
                    h81Var.invoke();
                }
            }
            ui2<h81<sd5>> ui2Var2 = this.E0;
            if (i15 > 0) {
                int i17 = ui2Var2.y;
                if (i15 < i17) {
                    h81<sd5>[] h81VarArr2 = ui2Var2.w;
                    System.arraycopy(h81VarArr2, i15, h81VarArr2, 0, i17 - i15);
                }
                int i18 = ui2Var2.y;
                int i19 = i18 - (i15 + 0);
                int i20 = i18 - 1;
                if (i19 <= i20) {
                    int i21 = i19;
                    while (true) {
                        ui2Var2.w[i21] = null;
                        if (i21 == i20) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                ui2Var2.y = i19;
            } else {
                ui2Var2.getClass();
            }
        }
    }

    @Override // defpackage.ww2
    public final void n() {
        Z5 z5 = this.I;
        z5.p = true;
        if (!z5.s() || z5.v) {
            return;
        }
        z5.v = true;
        z5.g.post(z5.w);
    }

    @Override // defpackage.ja3
    public final long o(long j) {
        C();
        return eu.e(this.i0, X.a(kt2.c(j) - kt2.c(this.l0), kt2.d(j) - kt2.d(this.l0)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        d32 d32Var;
        androidx.lifecycle.YKK ykkC;
        d32 d32Var2;
        tZ tZVar;
        super.onAttachedToWindow();
        x(getRoot());
        w(getRoot());
        getSnapshotObserver().a.c();
        boolean z = true;
        if ((Build.VERSION.SDK_INT >= 26) && (tZVar = this.Q) != null) {
            u4.a.a(tZVar);
        }
        d32 d32VarI = XTd3.i(this);
        b34 b34VarA = tj5.a(this);
        CQf viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (d32VarI == null || b34VarA == null || (d32VarI == (d32Var2 = viewTreeOwners.a) && b34VarA == d32Var2))) {
            z = false;
        }
        if (z) {
            if (d32VarI == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (b34VarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (d32Var = viewTreeOwners.a) != null && (ykkC = d32Var.c()) != null) {
                ykkC.c(this);
            }
            d32VarI.c().a(this);
            CQf cQf = new CQf(d32VarI, b34VarA);
            setViewTreeOwners(cQf);
            j81<? super CQf, sd5> j81Var = this.o0;
            if (j81Var != null) {
                j81Var.invoke(cQf);
            }
            this.o0 = null;
        }
        getViewTreeOwners().a.c().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.p0);
        getViewTreeObserver().addOnScrollChangedListener(this.q0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.r0);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return this.s0.c;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        this.z = new jj0(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.w0) {
            this.w0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(fp1.U(getContext()));
        }
        this.P.invoke(configuration);
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onCreate(d32 d32Var) {
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        d55 d55Var = this.s0;
        if (!d55Var.c) {
            return null;
        }
        ij1 ij1Var = d55Var.g;
        x45 x45Var = d55Var.f;
        int i2 = ij1Var.e;
        boolean z = i2 == 1;
        boolean z2 = ij1Var.a;
        if (z) {
            i = z2 ? 6 : 0;
        } else {
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 == 2) {
                    i = 2;
                } else {
                    if (i2 == 6) {
                        i = 5;
                    } else {
                        if (i2 == 5) {
                            i = 7;
                        } else {
                            if (i2 == 3) {
                                i = 3;
                            } else {
                                if (i2 == 4) {
                                    i = 4;
                                } else {
                                    if (!(i2 == 7)) {
                                        throw new IllegalStateException("invalid ImeAction".toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        editorInfo.imeOptions = i;
        int i3 = ij1Var.d;
        if (i3 == 1) {
            editorInfo.inputType = 1;
        } else {
            if (i3 == 2) {
                editorInfo.inputType = 1;
                editorInfo.imeOptions = Integer.MIN_VALUE | i;
            } else {
                if (i3 == 3) {
                    editorInfo.inputType = 2;
                } else {
                    if (i3 == 4) {
                        editorInfo.inputType = 3;
                    } else {
                        if (i3 == 5) {
                            editorInfo.inputType = 17;
                        } else {
                            if (i3 == 6) {
                                editorInfo.inputType = 33;
                            } else {
                                if (i3 == 7) {
                                    editorInfo.inputType = 129;
                                } else {
                                    if (i3 == 8) {
                                        editorInfo.inputType = 18;
                                    } else {
                                        if (!(i3 == 9)) {
                                            throw new IllegalStateException("Invalid Keyboard Type".toString());
                                        }
                                        editorInfo.inputType = 8194;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z2) {
            int i4 = editorInfo.inputType;
            if ((i4 & 1) == 1) {
                editorInfo.inputType = i4 | 131072;
                if (i2 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = ij1Var.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else {
                if (i6 == 2) {
                    editorInfo.inputType = i5 | 8192;
                } else {
                    if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                }
            }
            if (ij1Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = s55.c;
        long j = x45Var.b;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = s55.c(j);
        vq0.a(editorInfo, x45Var.a.w);
        editorInfo.imeOptions |= 33554432;
        cl3 cl3Var = new cl3(d55Var.f, new f55(d55Var), d55Var.g.c);
        d55Var.h = cl3Var;
        return cl3Var;
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onDestroy(d32 d32Var) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        tZ tZVar;
        d32 d32Var;
        androidx.lifecycle.YKK ykkC;
        super.onDetachedFromWindow();
        aq4 aq4Var = getSnapshotObserver().a;
        bp4 bp4Var = aq4Var.e;
        if (bp4Var != null) {
            bp4Var.a();
        }
        aq4Var.a();
        CQf viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (d32Var = viewTreeOwners.a) != null && (ykkC = d32Var.c()) != null) {
            ykkC.c(this);
        }
        if ((Build.VERSION.SDK_INT >= 26) && (tZVar = this.Q) != null) {
            u4.a.b(tZVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.p0);
        getViewTreeObserver().removeOnScrollChangedListener(this.q0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.r0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        q21 q21Var = this.A;
        if (!z) {
            OW8.l(q21Var.a, true);
            return;
        }
        r21 r21Var = q21Var.a;
        if (r21Var.z == g31.Inactive) {
            r21Var.b(g31.Active);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b0 = null;
        H();
        if (this.W != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        pb2 pb2Var = this.d0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                x(getRoot());
            }
            uy2 uy2VarT = t(i);
            int iIntValue = ((Number) uy2VarT.w).intValue();
            int iIntValue2 = ((Number) uy2VarT.x).intValue();
            uy2 uy2VarT2 = t(i2);
            long jM = FWT.m(iIntValue, iIntValue2, ((Number) uy2VarT2.w).intValue(), ((Number) uy2VarT2.x).intValue());
            g70 g70Var = this.b0;
            if (g70Var == null) {
                this.b0 = new g70(jM);
                this.c0 = false;
            } else if (!g70.b(g70Var.a, jM)) {
                this.c0 = true;
            }
            pb2Var.i(jM);
            pb2Var.d(this.I0);
            setMeasuredDimension(getRoot().Z.w, getRoot().Z.x);
            if (this.W != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().Z.w, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().Z.x, 1073741824));
            }
            sd5 sd5Var = sd5.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onPause(d32 d32Var) {
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        tZ tZVar;
        if (!(Build.VERSION.SDK_INT >= 26) || viewStructure == null || (tZVar = this.Q) == null) {
            return;
        }
        m4 m4Var = m4.a;
        w4 w4Var = tZVar.b;
        int iA = m4Var.a(viewStructure, w4Var.a.size());
        for (Map.Entry entry : w4Var.a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            v4 v4Var = (v4) entry.getValue();
            ViewStructure viewStructureB = m4Var.b(viewStructure, iA);
            if (viewStructureB != null) {
                t4 t4Var = t4.a;
                t4Var.g(viewStructureB, t4Var.a(viewStructure), iIntValue);
                m4Var.d(viewStructureB, iIntValue, tZVar.a.getContext().getPackageName(), null, null);
                t4Var.h(viewStructureB, 1);
                v4Var.getClass();
                throw null;
            }
            iA++;
        }
    }

    @Override // defpackage.w61
    public final void onResume(d32 d32Var) {
        setShowLayoutBounds(QnHx.a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.x) {
            bHr.QnHx qnHx = bHr.a;
            jy1 jy1Var = jy1.Ltr;
            if (i != 0 && i == 1) {
                jy1Var = jy1.Rtl;
            }
            setLayoutDirection(jy1Var);
            this.A.c = jy1Var;
        }
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onStart(d32 d32Var) {
    }

    @Override // defpackage.w61
    public final /* synthetic */ void onStop(d32 d32Var) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zA;
        this.B.a.setValue(Boolean.valueOf(z));
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (zA = QnHx.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        w(getRoot());
    }

    @Override // defpackage.ww2
    public final void p(yy1 yy1Var) {
        Z5 z5 = this.I;
        z5.p = true;
        if (z5.s()) {
            z5.t(yy1Var);
        }
    }

    @Override // defpackage.ww2
    public final void q(yy1 yy1Var) {
        this.d0.b.b(yy1Var);
        this.R = true;
    }

    @Override // defpackage.ww2
    public final void r(yy1 yy1Var, boolean z) {
        if (this.d0.g(yy1Var, z)) {
            E(null);
        }
    }

    public final void setConfigurationChangeObserver(j81<? super Configuration, sd5> j81Var) {
        this.P = j81Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.j0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(j81<? super CQf, sd5> j81Var) {
        CQf viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            j81Var.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.o0 = j81Var;
    }

    @Override // defpackage.ww2
    public void setShowLayoutBounds(boolean z) {
        this.V = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final int v(MotionEvent motionEvent) {
        int actionMasked;
        float[] fArr = this.h0;
        removeCallbacks(this.F0);
        try {
            this.j0 = AnimationUtils.currentAnimationTimeMillis();
            this.J0.a(this, fArr);
            Cz.t(fArr, this.i0);
            long jE = eu.e(fArr, X.a(motionEvent.getX(), motionEvent.getY()));
            this.l0 = X.a(motionEvent.getRawX() - kt2.c(jE), motionEvent.getRawY() - kt2.d(jE));
            boolean z = true;
            this.k0 = true;
            a(false);
            this.K0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.B0;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null) {
                    if ((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                        if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            i93 i93Var = this.O;
                            i93Var.c.a.clear();
                            xo2 xo2Var = (xo2) i93Var.b.y;
                            xo2Var.c();
                            xo2Var.a.e();
                        } else if (motionEvent2.getActionMasked() != 10 && z2) {
                            G(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked2 != 3 && actionMasked2 != 9 && z(motionEvent)) {
                    G(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.B0 = MotionEvent.obtainNoHistory(motionEvent);
                int iF = F(motionEvent);
                Trace.endSection();
                if (Build.VERSION.SDK_INT >= 24) {
                    XoLQ.a.a(this, this.K0);
                }
                this.k0 = false;
                return iF;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            this.k0 = false;
            throw th2;
        }
    }

    public final void x(yy1 yy1Var) {
        int i = 0;
        this.d0.h(yy1Var, false);
        ui2<yy1> ui2VarV = yy1Var.v();
        int i2 = ui2VarV.y;
        if (i2 > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            do {
                x(yy1VarArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public final boolean z(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= ((float) getWidth())) {
            if (0.0f <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ww2
    public lzS getAccessibilityManager() {
        return this.T;
    }

    @Override // defpackage.ww2
    public oz getClipboardManager() {
        return this.S;
    }
}
