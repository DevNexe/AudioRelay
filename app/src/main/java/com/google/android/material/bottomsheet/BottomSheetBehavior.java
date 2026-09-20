package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.azefsw.audioconnect.R;
import com.facebook.ads.AdError;
import defpackage.C0239D;
import defpackage.GM;
import defpackage.Th;
import defpackage.UT;
import defpackage.ae;
import defpackage.be;
import defpackage.bi5;
import defpackage.d_OZ;
import defpackage.ej4;
import defpackage.ja2;
import defpackage.la2;
import defpackage.uj5;
import defpackage.vj5;
import defpackage.xj5;
import defpackage.yi5;
import defpackage.zd;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.F1<V> {
    public int A;
    public final float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public yi5 G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public WeakReference<V> N;
    public WeakReference<View> O;
    public final ArrayList<LPt8Fixed> P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public boolean T;
    public HashMap U;
    public int V;
    public final F1 W;
    public int a;
    public boolean b;
    public final float c;
    public int d;
    public boolean e;
    public int f;
    public final int g;
    public final boolean h;
    public la2 i;
    public int j;
    public int k;
    public boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public int q;
    public int r;
    public ej4 s;
    public boolean t;
    public BottomSheetBehavior<V>.YKK u;
    public ValueAnimator v;
    public int w;
    public int x;
    public int y;
    public float z;

    public class CQf implements Runnable {
        public final /* synthetic */ View w;
        public final /* synthetic */ int x;

        public CQf(View view, int i) {
            this.w = view;
            this.x = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.B(this.w, this.x);
        }
    }

    public class F1 extends yi5.F1 {
        public F1() {
        }

        @Override // yi5.F1
        public final int a(View view, int i) {
            return view.getLeft();
        }

        @Override // yi5.F1
        public final int b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0239D.m(i, bottomSheetBehavior.x(), bottomSheetBehavior.C ? bottomSheetBehavior.M : bottomSheetBehavior.A);
        }

        @Override // yi5.F1
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.C ? bottomSheetBehavior.M : bottomSheetBehavior.A;
        }

        @Override // yi5.F1
        public final void f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.E) {
                    bottomSheetBehavior.A(1);
                }
            }
        }

        @Override // yi5.F1
        public final void g(View view, int i, int i2) {
            BottomSheetBehavior.this.v(i2);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0051  */
        @Override // yi5.F1
        public final void h(View view, float f, float f2) {
            int i;
            int i2;
            int iX;
            int i3 = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (bottomSheetBehavior.b) {
                    iX = bottomSheetBehavior.x;
                } else {
                    int top = view.getTop();
                    i2 = bottomSheetBehavior.y;
                    if (top <= i2) {
                        iX = bottomSheetBehavior.x();
                    }
                }
                i3 = 3;
                i2 = iX;
            } else if (bottomSheetBehavior.C && bottomSheetBehavior.D(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    if (view.getTop() > (bottomSheetBehavior.x() + bottomSheetBehavior.M) / 2) {
                        i2 = bottomSheetBehavior.M;
                        i3 = 5;
                    } else {
                        if (bottomSheetBehavior.b) {
                            iX = bottomSheetBehavior.x;
                        } else if (Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.y)) {
                            iX = bottomSheetBehavior.x();
                        } else {
                            i2 = bottomSheetBehavior.y;
                        }
                        i3 = 3;
                        i2 = iX;
                    }
                } else {
                    i2 = bottomSheetBehavior.M;
                    i3 = 5;
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.b) {
                    int i4 = bottomSheetBehavior.y;
                    if (top2 < i4) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.A)) {
                            iX = bottomSheetBehavior.x();
                            i3 = 3;
                            i2 = iX;
                        } else {
                            i2 = bottomSheetBehavior.y;
                        }
                    } else if (Math.abs(top2 - i4) < Math.abs(top2 - bottomSheetBehavior.A)) {
                        i2 = bottomSheetBehavior.y;
                    } else {
                        i = bottomSheetBehavior.A;
                        i2 = i;
                        i3 = 4;
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.x) < Math.abs(top2 - bottomSheetBehavior.A)) {
                    iX = bottomSheetBehavior.x;
                    i3 = 3;
                    i2 = iX;
                } else {
                    i = bottomSheetBehavior.A;
                    i2 = i;
                    i3 = 4;
                }
            } else {
                if (bottomSheetBehavior.b) {
                    i = bottomSheetBehavior.A;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.y) < Math.abs(top3 - bottomSheetBehavior.A)) {
                        i2 = bottomSheetBehavior.y;
                    } else {
                        i = bottomSheetBehavior.A;
                    }
                }
                i2 = i;
                i3 = 4;
            }
            bottomSheetBehavior.E(view, i3, i2, true);
        }

        @Override // yi5.F1
        public final boolean i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.F;
            if (i2 == 1 || bottomSheetBehavior.T) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.R == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.O;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = bottomSheetBehavior.N;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class LPt8Fixed {
        public abstract void a();

        public abstract void b();
    }

    public class QnHx implements Runnable {
        public final /* synthetic */ View w;
        public final /* synthetic */ ViewGroup.LayoutParams x;

        public QnHx(View view, ViewGroup.LayoutParams layoutParams) {
            this.w = view;
            this.x = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.w.setLayoutParams(this.x);
        }
    }

    public class YKK implements Runnable {
        public final View w;
        public boolean x;
        public int y;

        public YKK(View view, int i) {
            this.w = view;
            this.y = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            yi5 yi5Var = bottomSheetBehavior.G;
            if (yi5Var == null || !yi5Var.g()) {
                bottomSheetBehavior.A(this.y);
            } else {
                Field field = bi5.a;
                bi5.LPt8Fixed.m(this.w, this);
            }
            this.x = false;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.u = null;
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.F = 4;
        this.P = new ArrayList<>();
        this.V = -1;
        this.W = new F1();
    }

    public static View w(View view) {
        Field field = bi5.a;
        if (bi5.byN.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewW = w(viewGroup.getChildAt(i));
            if (viewW != null) {
                return viewW;
            }
        }
        return null;
    }

    public final void A(int i) {
        if (this.F == i) {
            return;
        }
        this.F = i;
        WeakReference<V> weakReference = this.N;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i);
        while (true) {
            ArrayList<LPt8Fixed> arrayList = this.P;
            if (i2 >= arrayList.size()) {
                F();
                return;
            } else {
                arrayList.get(i2).b();
                i2++;
            }
        }
    }

    public final void B(View view, int i) {
        int iX;
        int i2;
        if (i == 4) {
            iX = this.A;
        } else if (i == 6) {
            iX = this.y;
            if (this.b && iX <= (i2 = this.x)) {
                i = 3;
                iX = i2;
            }
        } else if (i == 3) {
            iX = x();
        } else {
            if (!this.C || i != 5) {
                throw new IllegalArgumentException(GM.a("Illegal state argument: ", i));
            }
            iX = this.M;
        }
        E(view, i, iX, false);
    }

    public final void C(int i) {
        V v = this.N.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = bi5.a;
            if (bi5.auxFixed.b(v)) {
                v.post(new CQf(v, i));
                return;
            }
        }
        B(v, i);
    }

    public final boolean D(View view, float f) {
        if (this.D) {
            return true;
        }
        if (view.getTop() < this.A) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.A)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    public final void E(View view, int i, int i2, boolean z) {
        yi5 yi5Var = this.G;
        boolean z2 = false;
        if (yi5Var != null) {
            if (!z) {
                int left = view.getLeft();
                yi5Var.r = view;
                yi5Var.c = -1;
                boolean zI = yi5Var.i(left, i2, 0, 0);
                if (!zI && yi5Var.a == 0 && yi5Var.r != null) {
                    yi5Var.r = null;
                }
                if (zI) {
                    z2 = true;
                }
            } else if (yi5Var.q(view.getLeft(), i2)) {
                z2 = true;
            }
        }
        if (!z2) {
            A(i);
            return;
        }
        A(2);
        G(i);
        if (this.u == null) {
            this.u = new YKK(view, i);
        }
        BottomSheetBehavior<V>.YKK ykk = this.u;
        if (ykk.x) {
            ykk.y = i;
            return;
        }
        ykk.y = i;
        Field field = bi5.a;
        bi5.LPt8Fixed.m(view, ykk);
        this.u.x = true;
    }

    public final void F() {
        V v;
        int iA;
        WeakReference<V> weakReference = this.N;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        bi5.j(v, 524288);
        bi5.f(v, 0);
        bi5.j(v, 262144);
        bi5.f(v, 0);
        bi5.j(v, 1048576);
        bi5.f(v, 0);
        int i = this.V;
        if (i != -1) {
            bi5.j(v, i);
            bi5.f(v, 0);
        }
        if (!this.b && this.F != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            be beVar = new be(this, 6);
            ArrayList arrayListC = bi5.c(v);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListC.size()) {
                    int i3 = -1;
                    int i4 = 0;
                    while (true) {
                        int[] iArr = bi5.d;
                        if (i4 >= iArr.length || i3 != -1) {
                            break;
                        }
                        int i5 = iArr[i4];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListC.size(); i6++) {
                            z &= ((UT.QnHx) arrayListC.get(i6)).a() != i5;
                        }
                        if (z) {
                            i3 = i5;
                        }
                        i4++;
                    }
                    iA = i3;
                    break;
                }
                if (TextUtils.equals(string, ((UT.QnHx) arrayListC.get(i2)).b())) {
                    iA = ((UT.QnHx) arrayListC.get(i2)).a();
                    break;
                }
                i2++;
            }
            if (iA != -1) {
                UT.QnHx qnHx = new UT.QnHx(null, iA, string, beVar, null);
                View.AccessibilityDelegate accessibilityDelegateB = bi5.b(v);
                d_OZ d_oz = accessibilityDelegateB == null ? null : accessibilityDelegateB instanceof d_OZ.QnHx ? ((d_OZ.QnHx) accessibilityDelegateB).a : new d_OZ(accessibilityDelegateB);
                if (d_oz == null) {
                    d_oz = new d_OZ();
                }
                bi5.m(v, d_oz);
                bi5.j(v, qnHx.a());
                bi5.c(v).add(qnHx);
                bi5.f(v, 0);
            }
            this.V = iA;
        }
        if (this.C && this.F != 5) {
            bi5.k(v, UT.QnHx.l, new be(this, 5));
        }
        int i7 = this.F;
        if (i7 == 3) {
            bi5.k(v, UT.QnHx.k, new be(this, this.b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            bi5.k(v, UT.QnHx.j, new be(this, this.b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            bi5.k(v, UT.QnHx.k, new be(this, 4));
            bi5.k(v, UT.QnHx.j, new be(this, 3));
        }
    }

    public final void G(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.t != z) {
            this.t = z;
            if (this.i == null || (valueAnimator = this.v) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.v.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.v.setFloatValues(1.0f - f, f);
            this.v.start();
        }
    }

    public final void H(boolean z) {
        WeakReference<V> weakReference = this.N;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.U != null) {
                    return;
                } else {
                    this.U = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.N.get() && z) {
                    this.U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.U = null;
        }
    }

    public final void I() {
        V v;
        if (this.N != null) {
            s();
            if (this.F != 4 || (v = this.N.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final void c(CoordinatorLayout.YKK ykk) {
        this.N = null;
        this.G = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final void f() {
        this.N = null;
        this.G = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        yi5 yi5Var;
        if (!v.isShown() || !this.E) {
            this.H = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.R = -1;
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Q = null;
            }
        }
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.S = (int) motionEvent.getY();
            if (this.F != 2) {
                WeakReference<View> weakReference = this.O;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.o(view, x, this.S)) {
                    this.R = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.T = true;
                }
            }
            this.H = this.R == -1 && !coordinatorLayout.o(v, x, this.S);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.T = false;
            this.R = -1;
            if (this.H) {
                this.H = false;
                return false;
            }
        }
        if (!this.H && (yi5Var = this.G) != null && yi5Var.r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.O;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.H || this.F == 1 || coordinatorLayout.o(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.G == null || Math.abs(((float) this.S) - motionEvent.getY()) <= ((float) this.G.b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
        la2 la2Var;
        Field field = bi5.a;
        if (bi5.LPt8Fixed.b(coordinatorLayout) && !bi5.LPt8Fixed.b(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.N == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.l || this.e) ? false : true;
            if (this.m || this.n || this.o || z) {
                bi5.byN.u(v, new uj5(new ae(this, z), new xj5.CQf(bi5.NUlFixed.f(v), v.getPaddingTop(), bi5.NUlFixed.e(v), v.getPaddingBottom())));
                if (bi5.auxFixed.b(v)) {
                    bi5.T23.c(v);
                } else {
                    v.addOnAttachStateChangeListener(new vj5());
                }
            }
            this.N = new WeakReference<>(v);
            if (this.h && (la2Var = this.i) != null) {
                bi5.LPt8Fixed.q(v, la2Var);
            }
            la2 la2Var2 = this.i;
            if (la2Var2 != null) {
                float fI = this.B;
                if (fI == -1.0f) {
                    fI = bi5.byN.i(v);
                }
                la2Var2.i(fI);
                boolean z2 = this.F == 3;
                this.t = z2;
                la2 la2Var3 = this.i;
                float f = z2 ? 0.0f : 1.0f;
                la2.CQf cQf = la2Var3.w;
                if (cQf.j != f) {
                    cQf.j = f;
                    la2Var3.A = true;
                    la2Var3.invalidateSelf();
                }
            }
            F();
            if (bi5.LPt8Fixed.c(v) == 0) {
                bi5.LPt8Fixed.s(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i2 = this.j;
            if (measuredWidth > i2 && i2 != -1) {
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.j;
                v.post(new QnHx(v, layoutParams));
            }
        }
        if (this.G == null) {
            this.G = new yi5(coordinatorLayout.getContext(), coordinatorLayout, this.W);
        }
        int top = v.getTop();
        coordinatorLayout.q(v, i);
        this.L = coordinatorLayout.getWidth();
        this.M = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.K = height;
        int i3 = this.M;
        int i4 = i3 - height;
        int i5 = this.r;
        if (i4 < i5) {
            if (this.p) {
                this.K = i3;
            } else {
                this.K = i3 - i5;
            }
        }
        this.x = Math.max(0, i3 - this.K);
        this.y = (int) ((1.0f - this.z) * this.M);
        s();
        int i6 = this.F;
        if (i6 == 3) {
            bi5.h(v, x());
        } else if (i6 == 6) {
            bi5.h(v, this.y);
        } else if (this.C && i6 == 5) {
            bi5.h(v, this.M);
        } else if (i6 == 4) {
            bi5.h(v, this.A);
        } else if (i6 == 1 || i6 == 2) {
            bi5.h(v, top - v.getTop());
        }
        this.O = new WeakReference<>(w(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.O;
        return (weakReference == null || view != weakReference.get() || this.F == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final void k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.O;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                bi5.h(v, -iX);
                A(3);
            } else {
                if (!this.E) {
                    return;
                }
                iArr[1] = i2;
                bi5.h(v, -i2);
                A(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.A;
            if (i4 > i5 && !this.C) {
                int i6 = top - i5;
                iArr[1] = i6;
                bi5.h(v, -i6);
                A(4);
            } else {
                if (!this.E) {
                    return;
                }
                iArr[1] = i2;
                bi5.h(v, -i2);
                A(1);
            }
        }
        v(v.getTop());
        this.I = i2;
        this.J = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final void n(View view, Parcelable parcelable) {
        NUlFixed nUl = (NUlFixed) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = nUl.z;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = nUl.A;
            }
            if (i == -1 || (i & 4) == 4) {
                this.C = nUl.B;
            }
            if (i == -1 || (i & 8) == 8) {
                this.D = nUl.C;
            }
        }
        int i2 = nUl.y;
        if (i2 == 1 || i2 == 2) {
            this.F = 4;
        } else {
            this.F = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final Parcelable o(View view) {
        return new NUlFixed(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.I = 0;
        this.J = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final void q(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int top;
        int iX;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == x()) {
            A(3);
            return;
        }
        WeakReference<View> weakReference = this.O;
        if (weakReference != null && view == weakReference.get() && this.J) {
            if (this.I > 0) {
                if (this.b) {
                    iX = this.x;
                } else {
                    int top3 = v.getTop();
                    int i4 = this.y;
                    if (top3 > i4) {
                        iX = i4;
                        i3 = 6;
                    } else {
                        iX = x();
                    }
                }
            } else if (this.C) {
                VelocityTracker velocityTracker = this.Q;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.c);
                    yVelocity = this.Q.getYVelocity(this.R);
                }
                if (D(v, yVelocity)) {
                    iX = this.M;
                    i3 = 5;
                } else if (this.I == 0) {
                    top2 = v.getTop();
                    if (this.b) {
                        i2 = this.y;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - this.A)) {
                                iX = x();
                            } else {
                                iX = this.y;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.A)) {
                            iX = this.y;
                        } else {
                            iX = this.A;
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.x) < Math.abs(top2 - this.A)) {
                        iX = this.x;
                    } else {
                        iX = this.A;
                        i3 = 4;
                    }
                } else {
                    if (this.b) {
                        iX = this.A;
                    } else {
                        top = v.getTop();
                        if (Math.abs(top - this.y) < Math.abs(top - this.A)) {
                            iX = this.y;
                            i3 = 6;
                        } else {
                            iX = this.A;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.I == 0) {
                top2 = v.getTop();
                if (this.b) {
                    i2 = this.y;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - this.A)) {
                            iX = x();
                        } else {
                            iX = this.y;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.A)) {
                        iX = this.y;
                    } else {
                        iX = this.A;
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.x) < Math.abs(top2 - this.A)) {
                    iX = this.x;
                } else {
                    iX = this.A;
                    i3 = 4;
                }
            } else {
                if (this.b) {
                    iX = this.A;
                } else {
                    top = v.getTop();
                    if (Math.abs(top - this.y) < Math.abs(top - this.A)) {
                        iX = this.y;
                        i3 = 6;
                    } else {
                        iX = this.A;
                    }
                }
                i3 = 4;
            }
            E(v, i3, iX, false);
            this.J = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.F == 1 && actionMasked == 0) {
            return true;
        }
        yi5 yi5Var = this.G;
        if (yi5Var != null) {
            yi5Var.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.R = -1;
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Q = null;
            }
        }
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        if (this.G != null && actionMasked == 2 && !this.H) {
            float fAbs = Math.abs(this.S - motionEvent.getY());
            yi5 yi5Var2 = this.G;
            if (fAbs > yi5Var2.b) {
                yi5Var2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.H;
    }

    public final void s() {
        int iT = t();
        if (this.b) {
            this.A = Math.max(this.M - iT, this.x);
        } else {
            this.A = this.M - iT;
        }
    }

    public final int t() {
        int i;
        if (this.e) {
            return Math.min(Math.max(this.f, this.M - ((this.L * 9) / 16)), this.K) + this.q;
        }
        return (this.l || this.m || (i = this.k) <= 0) ? this.d + this.q : Math.max(this.d, i + this.g);
    }

    public final void u(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.h) {
            this.s = ej4.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
            la2 la2Var = new la2(this.s);
            this.i = la2Var;
            la2Var.h(context);
            if (z && colorStateList != null) {
                this.i.j(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.i.setTint(typedValue.data);
        }
    }

    public final void v(int i) {
        if (this.N.get() != null) {
            ArrayList<LPt8Fixed> arrayList = this.P;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.A;
            if (i <= i2 && i2 != x()) {
                x();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).a();
            }
        }
    }

    public final int x() {
        if (this.b) {
            return this.x;
        }
        return Math.max(this.w, this.p ? 0 : this.r);
    }

    public final void y(int i) {
        boolean z = false;
        if (i == -1) {
            if (!this.e) {
                this.e = true;
                z = true;
            }
        } else if (this.e || this.d != i) {
            this.e = false;
            this.d = Math.max(0, i);
            z = true;
        }
        if (z) {
            I();
        }
    }

    public final void z(int i) {
        if (i == this.F) {
            return;
        }
        if (this.N != null) {
            C(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.C && i == 5)) {
            this.F = i;
        }
    }

    public static class NUlFixed extends defpackage.CQf {
        public static final Parcelable.Creator<NUlFixed> CREATOR = new QnHx();
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final int y;
        public final int z;

        public static class QnHx implements Parcelable.ClassLoaderCreator<NUlFixed> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final NUlFixed createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new NUlFixed(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NUlFixed[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new NUlFixed(parcel, (ClassLoader) null);
            }
        }

        public NUlFixed(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.y = parcel.readInt();
            this.z = parcel.readInt();
            this.A = parcel.readInt() == 1;
            this.B = parcel.readInt() == 1;
            this.C = parcel.readInt() == 1;
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            parcel.writeInt(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
        }

        public NUlFixed(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.y = bottomSheetBehavior.F;
            this.z = bottomSheetBehavior.d;
            this.A = bottomSheetBehavior.b;
            this.B = bottomSheetBehavior.C;
            this.C = bottomSheetBehavior.D;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.u = null;
        this.z = 0.5f;
        this.B = -1.0f;
        this.E = true;
        this.F = 4;
        this.P = new ArrayList<>();
        this.V = -1;
        this.W = new F1();
        this.g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.y);
        this.h = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(2);
        if (zHasValue) {
            u(context, attributeSet, zHasValue, ja2.b(context, typedArrayObtainStyledAttributes, 2));
        } else {
            u(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.v.addUpdateListener(new zd(this));
        this.B = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(8);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            y(i);
        } else {
            y(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (this.C != z) {
            this.C = z;
            if (!z && this.F == 5) {
                z(4);
            }
            F();
        }
        this.l = typedArrayObtainStyledAttributes.getBoolean(11, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.N != null) {
                s();
            }
            A((this.b && this.F == 6) ? 3 : this.F);
            F();
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.a = typedArrayObtainStyledAttributes.getInt(9, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(6, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.z = f;
            if (this.N != null) {
                this.y = (int) ((1.0f - f) * this.M);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(4);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i2 = typedValuePeekValue2.data;
                if (i2 >= 0) {
                    this.w = i2;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
                if (dimensionPixelOffset >= 0) {
                    this.w = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.m = typedArrayObtainStyledAttributes.getBoolean(12, false);
            this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
            this.o = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(15, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
