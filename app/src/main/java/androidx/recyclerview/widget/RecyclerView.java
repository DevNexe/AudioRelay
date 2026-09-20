package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import defpackage.AY;
import defpackage.F;
import defpackage.UT;
import defpackage.a42;
import defpackage.bi5;
import defpackage.d_OZ;
import defpackage.dj;
import defpackage.i95;
import defpackage.iE;
import defpackage.iZUl;
import defpackage.ok4;
import defpackage.oq0;
import defpackage.rm2;
import defpackage.sm2;
import defpackage.wi5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements rm2 {
    public static final int[] O0 = {R.attr.nestedScrollingEnabled};
    public static final boolean P0;
    public static final boolean Q0;
    public static final Class<?>[] R0;
    public static final CQf S0;
    public androidx.recyclerview.widget.CQf A;
    public ArrayList A0;
    public final o_K B;
    public boolean B0;
    public boolean C;
    public boolean C0;
    public final Rect D;
    public final EQ D0;
    public final Rect E;
    public boolean E0;
    public final RectF F;
    public androidx.recyclerview.widget.WE F0;
    public LPt8Fixed G;
    public final int[] G0;
    public PRnFixed H;
    public sm2 H0;
    public final ArrayList<FJCM> I;
    public final int[] I0;
    public final ArrayList<MZ> J;
    public final int[] J0;
    public MZ K;
    public final int[] K0;
    public boolean L;
    public final ArrayList L0;
    public boolean M;
    public final QnHx M0;
    public boolean N;
    public final F1 N0;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public final AccessibilityManager T;
    public boolean U;
    public boolean V;
    public int W;
    public int a0;
    public T23 b0;
    public EdgeEffect c0;
    public EdgeEffect d0;
    public EdgeEffect e0;
    public EdgeEffect f0;
    public byN g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public RBi p0;
    public final int q0;
    public final int r0;
    public final float s0;
    public final float t0;
    public boolean u0;
    public final ct v0;
    public final lPt3Fixed w;
    public androidx.recyclerview.widget.y w0;
    public final ta x;
    public final androidx.recyclerview.widget.y.CQf x0;
    public ck32 y;
    public final Aa y0;
    public androidx.recyclerview.widget.QnHx z;
    public LPt6Fixed z0;

    public static class Aa {
        public int a = -1;
        public int b = 0;
        public int c = 0;
        public int d = 1;
        public int e = 0;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return dj.c(sb, this.k, '}');
        }
    }

    public static class CQf implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class EQ implements byN.CQf {
        public EQ() {
        }
    }

    public class F1 {
        public F1() {
        }

        public final void a(qc qcVar, byN.F1 f1, byN.F1 f2) {
            boolean zG;
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getClass();
            qcVar.n(false);
            androidx.recyclerview.widget.qc qcVar2 = (androidx.recyclerview.widget.qc) recyclerView.g0;
            qcVar2.getClass();
            if (f1 == null || ((i = f1.a) == (i2 = f2.a) && f1.b == f2.b)) {
                androidx.recyclerview.widget.FJCM fjcm = (androidx.recyclerview.widget.FJCM) qcVar2;
                fjcm.l(qcVar);
                qcVar.a.setAlpha(0.0f);
                fjcm.i.add(qcVar);
                zG = true;
            } else {
                zG = qcVar2.g(qcVar, i, f1.b, i2, f2.b);
            }
            if (zG) {
                recyclerView.Q();
            }
        }

        public final void b(qc qcVar, byN.F1 f1, byN.F1 f2) {
            boolean zG;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.x.j(qcVar);
            recyclerView.e(qcVar);
            qcVar.n(false);
            androidx.recyclerview.widget.qc qcVar2 = (androidx.recyclerview.widget.qc) recyclerView.g0;
            qcVar2.getClass();
            int i = f1.a;
            int i2 = f1.b;
            View view = qcVar.a;
            int left = f2 == null ? view.getLeft() : f2.a;
            int top = f2 == null ? view.getTop() : f2.b;
            if (qcVar.i() || (i == left && i2 == top)) {
                androidx.recyclerview.widget.FJCM fjcm = (androidx.recyclerview.widget.FJCM) qcVar2;
                fjcm.l(qcVar);
                fjcm.h.add(qcVar);
                zG = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                zG = qcVar2.g(qcVar, i, i2, left, top);
            }
            if (zG) {
                recyclerView.Q();
            }
        }
    }

    public static abstract class FJCM {
        public void c(Canvas canvas, RecyclerView recyclerView) {
        }

        public void d(Canvas canvas) {
        }
    }

    public static abstract class LPt6Fixed {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static abstract class LPt8Fixed<VH extends qc> {
        public final NUlFixed a = new NUlFixed();
        public boolean b = false;

        public abstract int a();

        public long b(int i) {
            return -1L;
        }

        public abstract void c(VH vh, int i);

        public abstract qc d(RecyclerView recyclerView);
    }

    public interface LPt9Fixed {
    }

    public interface MZ {
        void a();

        boolean b(MotionEvent motionEvent);

        void onTouchEvent(MotionEvent motionEvent);
    }

    public static class NUlFixed extends Observable<YKK> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((YKK) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    public static abstract class PRnFixed {
        public androidx.recyclerview.widget.CQf a;
        public RecyclerView b;
        public final Com1Fixed c;
        public final Com1Fixed d;
        public SjP e;
        public boolean f;
        public boolean g;
        public final boolean h;
        public final boolean i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;

        public class CQf implements Com1Fixed.CQf {
            public CQf() {
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int a(View view) {
                y yVar = (y) view.getLayoutParams();
                PRnFixed.this.getClass();
                return (view.getTop() - ((y) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) yVar).topMargin;
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int b() {
                return PRnFixed.this.C();
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int c() {
                PRnFixed pRn = PRnFixed.this;
                return pRn.o - pRn.z();
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final View d(int i) {
                return PRnFixed.this.u(i);
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int e(View view) {
                y yVar = (y) view.getLayoutParams();
                PRnFixed.this.getClass();
                return view.getBottom() + ((y) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin;
            }
        }

        public interface F1 {
        }

        public static class LPt8Fixed {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public class QnHx implements Com1Fixed.CQf {
            public QnHx() {
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int a(View view) {
                y yVar = (y) view.getLayoutParams();
                PRnFixed.this.getClass();
                return (view.getLeft() - ((y) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin;
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int b() {
                return PRnFixed.this.A();
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int c() {
                PRnFixed pRn = PRnFixed.this;
                return pRn.n - pRn.B();
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final View d(int i) {
                return PRnFixed.this.u(i);
            }

            @Override // androidx.recyclerview.widget.Com1Fixed.CQf
            public final int e(View view) {
                y yVar = (y) view.getLayoutParams();
                PRnFixed.this.getClass();
                return view.getRight() + ((y) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin;
            }
        }

        public PRnFixed() {
            QnHx qnHx = new QnHx();
            CQf cQf = new CQf();
            this.c = new Com1Fixed(qnHx);
            this.d = new Com1Fixed(cQf);
            this.f = false;
            this.g = false;
            this.h = true;
            this.i = true;
        }

        public static int D(View view) {
            return ((y) view.getLayoutParams()).a();
        }

        public static LPt8Fixed E(Context context, AttributeSet attributeSet, int i, int i2) {
            LPt8Fixed lPt8 = new LPt8Fixed();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iE.w, i, i2);
            lPt8.a = typedArrayObtainStyledAttributes.getInt(0, 1);
            lPt8.b = typedArrayObtainStyledAttributes.getInt(10, 1);
            lPt8.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            lPt8.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return lPt8;
        }

        public static boolean I(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static void J(View view, int i, int i2, int i3, int i4) {
            y yVar = (y) view.getLayoutParams();
            Rect rect = yVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) yVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) yVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) yVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) yVar).bottomMargin);
        }

        public static int g(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:14:0x0021  */
        /* JADX WARN: Code duplicated, block: B:21:0x0031  */
        public static int w(boolean z, int i, int i2, int i3, int i4) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static void y(View view, Rect rect) {
            int[] iArr = RecyclerView.O0;
            y yVar = (y) view.getLayoutParams();
            Rect rect2 = yVar.b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) yVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) yVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) yVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) yVar).bottomMargin);
        }

        public final int A() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int B() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int C() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int F(ta taVar, Aa aa) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.G == null || !e()) {
                return 1;
            }
            return this.b.G.a();
        }

        public final void G(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((y) view.getLayoutParams()).b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.F;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean H() {
            return false;
        }

        public void K(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.A.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.A.d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void L(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int iE = recyclerView.A.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    recyclerView.A.d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void M(RecyclerView recyclerView) {
        }

        public View N(View view, int i, ta taVar, Aa aa) {
            return null;
        }

        public void O(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            ta taVar = recyclerView.x;
            Aa aa = recyclerView.y0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            LPt8Fixed lPt8 = this.b.G;
            if (lPt8 != null) {
                accessibilityEvent.setItemCount(lPt8.a());
            }
        }

        public final void P(View view, UT ut) {
            qc qcVarH = RecyclerView.H(view);
            if (qcVarH == null || qcVarH.i() || this.a.j(qcVarH.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            Q(recyclerView.x, recyclerView.y0, view, ut);
        }

        public void Q(ta taVar, Aa aa, View view, UT ut) {
            ut.k(UT.F1.a(e() ? D(view) : 0, 1, d() ? D(view) : 0, 1, false));
        }

        public void R(int i, int i2) {
        }

        public void S() {
        }

        public void T(int i, int i2) {
        }

        public void U(int i, int i2) {
        }

        public void V(int i, int i2) {
        }

        public void W(ta taVar, Aa aa) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void X(Aa aa) {
        }

        public void Y(Parcelable parcelable) {
        }

        public Parcelable Z() {
            return null;
        }

        public void a0(int i) {
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0066  */
        public final void b(View view, int i, boolean z) {
            int iB;
            qc qcVarH = RecyclerView.H(view);
            if (z || qcVarH.i()) {
                ok4<qc, o_K.QnHx> ok4Var = this.b.B.a;
                o_K.QnHx orDefault = ok4Var.getOrDefault(qcVarH, null);
                if (orDefault == null) {
                    orDefault = o_K.QnHx.a();
                    ok4Var.put(qcVarH, orDefault);
                }
                orDefault.a |= 1;
            } else {
                this.b.B.c(qcVarH);
            }
            y yVar = (y) view.getLayoutParams();
            if (qcVarH.p() || qcVarH.j()) {
                if (qcVarH.j()) {
                    qcVarH.n.j(qcVarH);
                } else {
                    qcVarH.j &= -33;
                }
                this.a.b(view, i, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.b) {
                    androidx.recyclerview.widget.CQf cQf = this.a;
                    int iIndexOfChild = ((androidx.recyclerview.widget.SjP) cQf.a).a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        iB = -1;
                    } else {
                        androidx.recyclerview.widget.CQf.QnHx qnHx = cQf.b;
                        if (qnHx.d(iIndexOfChild)) {
                            iB = -1;
                        } else {
                            iB = iIndexOfChild - qnHx.b(iIndexOfChild);
                        }
                    }
                    if (i == -1) {
                        i = this.a.e();
                    }
                    if (iB == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.x());
                    }
                    if (iB != i) {
                        PRnFixed pRn = this.b.H;
                        View viewU = pRn.u(iB);
                        if (viewU == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + pRn.b.toString());
                        }
                        pRn.u(iB);
                        pRn.a.c(iB);
                        y yVar2 = (y) viewU.getLayoutParams();
                        qc qcVarH2 = RecyclerView.H(viewU);
                        if (qcVarH2.i()) {
                            ok4<qc, o_K.QnHx> ok4Var2 = pRn.b.B.a;
                            o_K.QnHx orDefault2 = ok4Var2.getOrDefault(qcVarH2, null);
                            if (orDefault2 == null) {
                                orDefault2 = o_K.QnHx.a();
                                ok4Var2.put(qcVarH2, orDefault2);
                            }
                            orDefault2.a = 1 | orDefault2.a;
                        } else {
                            pRn.b.B.c(qcVarH2);
                        }
                        pRn.a.b(viewU, i, yVar2, qcVarH2.i());
                    }
                } else {
                    this.a.a(view, i, false);
                    yVar.c = true;
                    SjP sjP = this.e;
                    if (sjP != null && sjP.e) {
                        sjP.b.getClass();
                        qc qcVarH3 = RecyclerView.H(view);
                        if ((qcVarH3 != null ? qcVarH3.c() : -1) == sjP.a) {
                            sjP.f = view;
                        }
                    }
                }
            }
            if (yVar.d) {
                qcVarH.a.invalidate();
                yVar.d = false;
            }
        }

        public final void b0(ta taVar) {
            int iV = v();
            while (true) {
                iV--;
                if (iV < 0) {
                    return;
                }
                if (!RecyclerView.H(u(iV)).o()) {
                    View viewU = u(iV);
                    e0(iV);
                    taVar.f(viewU);
                }
            }
        }

        public void c(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.h(str);
            }
        }

        public final void c0(ta taVar) {
            ArrayList<qc> arrayList;
            int size = taVar.a.size();
            int i = size - 1;
            while (true) {
                arrayList = taVar.a;
                if (i < 0) {
                    break;
                }
                View view = arrayList.get(i).a;
                qc qcVarH = RecyclerView.H(view);
                if (!qcVarH.o()) {
                    qcVarH.n(false);
                    if (qcVarH.k()) {
                        this.b.removeDetachedView(view, false);
                    }
                    byN byn = this.b.g0;
                    if (byn != null) {
                        byn.d(qcVarH);
                    }
                    qcVarH.n(true);
                    qc qcVarH2 = RecyclerView.H(view);
                    qcVarH2.n = null;
                    qcVarH2.o = false;
                    qcVarH2.j &= -33;
                    taVar.g(qcVarH2);
                }
                i--;
            }
            arrayList.clear();
            ArrayList<qc> arrayList2 = taVar.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public boolean d() {
            return false;
        }

        public final void d0(View view, ta taVar) {
            androidx.recyclerview.widget.CQf cQf = this.a;
            androidx.recyclerview.widget.SjP sjP = (androidx.recyclerview.widget.SjP) cQf.a;
            int iIndexOfChild = sjP.a.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (cQf.b.f(iIndexOfChild)) {
                    cQf.k(view);
                }
                sjP.b(iIndexOfChild);
            }
            taVar.f(view);
        }

        public boolean e() {
            return false;
        }

        public final void e0(int i) {
            if (u(i) != null) {
                androidx.recyclerview.widget.CQf cQf = this.a;
                int iF = cQf.f(i);
                androidx.recyclerview.widget.SjP sjP = (androidx.recyclerview.widget.SjP) cQf.a;
                View childAt = sjP.a.getChildAt(iF);
                if (childAt == null) {
                    return;
                }
                if (cQf.b.f(iF)) {
                    cQf.k(childAt);
                }
                sjP.b(iF);
            }
        }

        public boolean f(y yVar) {
            return yVar != null;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:30:0x00af  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
        public final boolean f0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            boolean z3;
            int iA = A();
            int iC = C();
            int iB = this.n - B();
            int iZ = this.o - z();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iA;
            int iMin = Math.min(0, i);
            int i2 = top - iC;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iB;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iZ);
            RecyclerView recyclerView2 = this.b;
            Field field = bi5.a;
            if (bi5.NUlFixed.d(recyclerView2) != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            if (z2) {
                View focusedChild = recyclerView.getFocusedChild();
                if (focusedChild == null) {
                    z3 = false;
                } else {
                    int iA2 = A();
                    int iC2 = C();
                    int iB2 = this.n - B();
                    int iZ2 = this.o - z();
                    Rect rect2 = this.b.D;
                    y(focusedChild, rect2);
                    if (rect2.left - iMax >= iB2 || rect2.right - iMax <= iA2 || rect2.top - iMin2 >= iZ2 || rect2.bottom - iMin2 <= iC2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                if (z3) {
                    if (iMax == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(iMax, iMin2);
                    } else {
                        recyclerView.Z(iMax, iMin2, false);
                    }
                    return true;
                }
            } else if (iMax == 0 || iMin2 != 0) {
                if (z) {
                    recyclerView.scrollBy(iMax, iMin2);
                } else {
                    recyclerView.Z(iMax, iMin2, false);
                }
                return true;
            }
            return false;
        }

        public final void g0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void h(int i, int i2, Aa aa, F1 f1) {
        }

        public int h0(int i, ta taVar, Aa aa) {
            return 0;
        }

        public void i(int i, F1 f1) {
        }

        public void i0(int i) {
        }

        public int j(Aa aa) {
            return 0;
        }

        public int j0(int i, ta taVar, Aa aa) {
            return 0;
        }

        public int k(Aa aa) {
            return 0;
        }

        public final void k0(RecyclerView recyclerView) {
            l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int l(Aa aa) {
            return 0;
        }

        public final void l0(int i, int i2) {
            this.n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.l = mode;
            if (mode == 0 && !RecyclerView.P0) {
                this.n = 0;
            }
            this.o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.m = mode2;
            if (mode2 != 0 || RecyclerView.P0) {
                return;
            }
            this.o = 0;
        }

        public int m(Aa aa) {
            return 0;
        }

        public void m0(Rect rect, int i, int i2) {
            int iB = B() + A() + rect.width();
            int iZ = z() + C() + rect.height();
            RecyclerView recyclerView = this.b;
            Field field = bi5.a;
            this.b.setMeasuredDimension(g(i, iB, bi5.LPt8Fixed.e(recyclerView)), g(i2, iZ, bi5.LPt8Fixed.d(this.b)));
        }

        public int n(Aa aa) {
            return 0;
        }

        public final void n0(int i, int i2) {
            int iV = v();
            if (iV == 0) {
                this.b.m(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < iV; i7++) {
                View viewU = u(i7);
                Rect rect = this.b.D;
                y(viewU, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.b.D.set(i3, i4, i5, i6);
            m0(this.b.D, i, i2);
        }

        public int o(Aa aa) {
            return 0;
        }

        public final void o0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.n = 0;
                this.o = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.A;
                this.n = recyclerView.getWidth();
                this.o = recyclerView.getHeight();
            }
            this.l = 1073741824;
            this.m = 1073741824;
        }

        public final void p(ta taVar) {
            int iV = v();
            while (true) {
                iV--;
                if (iV < 0) {
                    return;
                }
                View viewU = u(iV);
                qc qcVarH = RecyclerView.H(viewU);
                if (!qcVarH.o()) {
                    if (!qcVarH.g() || qcVarH.i() || this.b.G.b) {
                        u(iV);
                        this.a.c(iV);
                        taVar.h(viewU);
                        this.b.B.c(qcVarH);
                    } else {
                        e0(iV);
                        taVar.g(qcVarH);
                    }
                }
            }
        }

        public final boolean p0(View view, int i, int i2, y yVar) {
            return (!view.isLayoutRequested() && this.h && I(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) yVar).width) && I(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) yVar).height)) ? false : true;
        }

        public View q(int i) {
            int iV = v();
            for (int i2 = 0; i2 < iV; i2++) {
                View viewU = u(i2);
                qc qcVarH = RecyclerView.H(viewU);
                if (qcVarH != null && qcVarH.c() == i && !qcVarH.o() && (this.b.y0.g || !qcVarH.i())) {
                    return viewU;
                }
            }
            return null;
        }

        public boolean q0() {
            return false;
        }

        public abstract y r();

        public final boolean r0(View view, int i, int i2, y yVar) {
            return (this.h && I(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) yVar).width) && I(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) yVar).height)) ? false : true;
        }

        public y s(Context context, AttributeSet attributeSet) {
            return new y(context, attributeSet);
        }

        public void s0(RecyclerView recyclerView, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public y t(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof y) {
                return new y((y) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y((ViewGroup.MarginLayoutParams) layoutParams) : new y(layoutParams);
        }

        public final void t0(androidx.recyclerview.widget.MZ mz) {
            SjP sjP = this.e;
            if (sjP != null && mz != sjP && sjP.e) {
                sjP.d();
            }
            this.e = mz;
            RecyclerView recyclerView = this.b;
            ct ctVar = recyclerView.v0;
            RecyclerView.this.removeCallbacks(ctVar);
            ctVar.y.abortAnimation();
            if (mz.h) {
                Log.w("RecyclerView", "An instance of " + mz.getClass().getSimpleName() + " was started more than once. Each instance of" + mz.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            mz.b = recyclerView;
            mz.c = this;
            int i = mz.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.y0.a = i;
            mz.e = true;
            mz.d = true;
            mz.f = recyclerView.H.q(i);
            mz.b.v0.a();
            mz.h = true;
        }

        public final View u(int i) {
            androidx.recyclerview.widget.CQf cQf = this.a;
            if (cQf != null) {
                return cQf.d(i);
            }
            return null;
        }

        public boolean u0() {
            return false;
        }

        public final int v() {
            androidx.recyclerview.widget.CQf cQf = this.a;
            if (cQf != null) {
                return cQf.e();
            }
            return 0;
        }

        public int x(ta taVar, Aa aa) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.G == null || !d()) {
                return 1;
            }
            return this.b.G.a();
        }

        public final int z() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j;
            RecyclerView recyclerView = RecyclerView.this;
            byN byn = recyclerView.g0;
            if (byn != null) {
                androidx.recyclerview.widget.FJCM fjcm = (androidx.recyclerview.widget.FJCM) byn;
                ArrayList<qc> arrayList = fjcm.h;
                boolean z = !arrayList.isEmpty();
                ArrayList<androidx.recyclerview.widget.FJCM.CQf> arrayList2 = fjcm.j;
                boolean z2 = !arrayList2.isEmpty();
                ArrayList<androidx.recyclerview.widget.FJCM.QnHx> arrayList3 = fjcm.k;
                boolean z3 = !arrayList3.isEmpty();
                ArrayList<qc> arrayList4 = fjcm.i;
                boolean z4 = !arrayList4.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<qc> it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        j = fjcm.d;
                        if (!zHasNext) {
                            break;
                        }
                        qc next = it.next();
                        View view = next.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        fjcm.q.add(next);
                        viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new androidx.recyclerview.widget.YKK(view, viewPropertyAnimatorAnimate, fjcm, next)).start();
                        it = it;
                    }
                    arrayList.clear();
                    if (z2) {
                        ArrayList<androidx.recyclerview.widget.FJCM.CQf> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        fjcm.m.add(arrayList5);
                        arrayList2.clear();
                        androidx.recyclerview.widget.F1 f1 = new androidx.recyclerview.widget.F1(fjcm, arrayList5);
                        if (z) {
                            View view2 = arrayList5.get(0).a.a;
                            Field field = bi5.a;
                            bi5.LPt8Fixed.n(view2, f1, j);
                        } else {
                            f1.run();
                        }
                    }
                    if (z3) {
                        ArrayList<androidx.recyclerview.widget.FJCM.QnHx> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        fjcm.n.add(arrayList6);
                        arrayList3.clear();
                        androidx.recyclerview.widget.LPt8Fixed lPt8 = new androidx.recyclerview.widget.LPt8Fixed(fjcm, arrayList6);
                        if (z) {
                            View view3 = arrayList6.get(0).a.a;
                            Field field2 = bi5.a;
                            bi5.LPt8Fixed.n(view3, lPt8, j);
                        } else {
                            lPt8.run();
                        }
                    }
                    if (z4) {
                        ArrayList<qc> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        fjcm.l.add(arrayList7);
                        arrayList4.clear();
                        androidx.recyclerview.widget.NUlFixed nUl = new androidx.recyclerview.widget.NUlFixed(fjcm, arrayList7);
                        if (z || z2 || z3) {
                            if (!z) {
                                j = 0;
                            }
                            long jMax = Math.max(z2 ? fjcm.e : 0L, z3 ? fjcm.f : 0L) + j;
                            View view4 = arrayList7.get(0).a;
                            Field field3 = bi5.a;
                            bi5.LPt8Fixed.n(view4, nUl, jMax);
                        } else {
                            nUl.run();
                        }
                    }
                }
            }
            recyclerView.E0 = false;
        }
    }

    public static abstract class RBi {
    }

    public static abstract class SjP {
        public RecyclerView b;
        public PRnFixed c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final QnHx g = new QnHx();

        public interface CQf {
            PointF a(int i);
        }

        public static class QnHx {
            public int d = -1;
            public boolean f = false;
            public int g = 0;
            public int a = 0;
            public int b = 0;
            public int c = Integer.MIN_VALUE;
            public Interpolator e = null;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.K(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.e;
                if (interpolator != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.v0.b(this.a, this.b, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }
        }

        public final PointF a(int i) {
            Object obj = this.c;
            if (obj instanceof CQf) {
                return ((CQf) obj).a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + CQf.class.getCanonicalName());
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x0104  */
        public final void b(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null) {
                float f = pointFA.x;
                if (f != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.X((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            QnHx qnHx = this.g;
            if (view != null) {
                this.b.getClass();
                qc qcVarH = RecyclerView.H(view);
                if ((qcVarH != null ? qcVarH.c() : -1) == this.a) {
                    View view2 = this.f;
                    Aa aa = recyclerView.y0;
                    c(view2, qnHx);
                    qnHx.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                Aa aa2 = recyclerView.y0;
                androidx.recyclerview.widget.MZ mz = (androidx.recyclerview.widget.MZ) this;
                if (mz.b.H.v() == 0) {
                    mz.d();
                } else {
                    int i3 = mz.o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    mz.o = i4;
                    int i5 = mz.p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    mz.p = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF pointFA2 = mz.a(mz.a);
                        if (pointFA2 != null) {
                            float f2 = pointFA2.x;
                            if (f2 == 0.0f && pointFA2.y == 0.0f) {
                                qnHx.d = mz.a;
                                mz.d();
                            } else {
                                float f3 = pointFA2.y;
                                float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                                float f4 = pointFA2.x / fSqrt;
                                pointFA2.x = f4;
                                float f5 = pointFA2.y / fSqrt;
                                pointFA2.y = f5;
                                mz.k = pointFA2;
                                mz.o = (int) (f4 * 10000.0f);
                                mz.p = (int) (f5 * 10000.0f);
                                int iG = mz.g(10000);
                                int i7 = (int) (mz.o * 1.2f);
                                int i8 = (int) (mz.p * 1.2f);
                                LinearInterpolator linearInterpolator = mz.i;
                                qnHx.a = i7;
                                qnHx.b = i8;
                                qnHx.c = (int) (iG * 1.2f);
                                qnHx.e = linearInterpolator;
                                qnHx.f = true;
                            }
                        } else {
                            qnHx.d = mz.a;
                            mz.d();
                        }
                    }
                }
                boolean z = qnHx.d >= 0;
                qnHx.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.v0.a();
                }
            }
        }

        public abstract void c(View view, QnHx qnHx);

        public final void d() {
            if (this.e) {
                this.e = false;
                androidx.recyclerview.widget.MZ mz = (androidx.recyclerview.widget.MZ) this;
                mz.p = 0;
                mz.o = 0;
                mz.k = null;
                this.b.y0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                PRnFixed pRn = this.c;
                if (pRn.e == this) {
                    pRn.e = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class T23 {
    }

    public static abstract class WE {
    }

    public static class Xn1 {
        public final SparseArray<QnHx> a = new SparseArray<>();
        public int b = 0;

        public static class QnHx {
            public final ArrayList<qc> a = new ArrayList<>();
            public final int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public final QnHx a(int i) {
            SparseArray<QnHx> sparseArray = this.a;
            QnHx qnHx = sparseArray.get(i);
            if (qnHx != null) {
                return qnHx;
            }
            QnHx qnHx2 = new QnHx();
            sparseArray.put(i, qnHx2);
            return qnHx2;
        }
    }

    public static abstract class YKK {
        public void a() {
        }
    }

    public interface auxFixed {
    }

    public static abstract class byN {
        public CQf a = null;
        public final ArrayList<QnHx> b = new ArrayList<>();
        public final long c = 120;
        public final long d = 120;
        public final long e = 250;
        public final long f = 250;

        public interface CQf {
        }

        public static class F1 {
            public int a;
            public int b;

            public final void a(qc qcVar) {
                View view = qcVar.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public interface QnHx {
            void a();
        }

        public static void b(qc qcVar) {
            RecyclerView recyclerView;
            int i = qcVar.j & 14;
            if (qcVar.g() || (i & 4) != 0 || (recyclerView = qcVar.r) == null) {
                return;
            }
            recyclerView.E(qcVar);
        }

        public abstract boolean a(qc qcVar, qc qcVar2, F1 f1, F1 f2);

        public final void c(qc qcVar) {
            CQf cQf = this.a;
            if (cQf != null) {
                EQ eq = (EQ) cQf;
                boolean z = true;
                qcVar.n(true);
                if (qcVar.h != null && qcVar.i == null) {
                    qcVar.h = null;
                }
                qcVar.i = null;
                if ((qcVar.j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.a0();
                androidx.recyclerview.widget.CQf cQf2 = recyclerView.A;
                androidx.recyclerview.widget.SjP sjP = (androidx.recyclerview.widget.SjP) cQf2.a;
                RecyclerView recyclerView2 = sjP.a;
                View view = qcVar.a;
                int iIndexOfChild = recyclerView2.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    cQf2.k(view);
                } else {
                    androidx.recyclerview.widget.CQf.QnHx qnHx = cQf2.b;
                    if (qnHx.d(iIndexOfChild)) {
                        qnHx.f(iIndexOfChild);
                        cQf2.k(view);
                        sjP.b(iIndexOfChild);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    qc qcVarH = RecyclerView.H(view);
                    ta taVar = recyclerView.x;
                    taVar.j(qcVarH);
                    taVar.g(qcVarH);
                }
                recyclerView.b0(!z);
                if (z || !qcVar.k()) {
                    return;
                }
                recyclerView.removeDetachedView(view, false);
            }
        }

        public abstract void d(qc qcVar);

        public abstract void e();

        public abstract boolean f();
    }

    public class ct implements Runnable {
        public boolean A;
        public boolean B;
        public int w;
        public int x;
        public OverScroller y;
        public Interpolator z;

        public ct() {
            CQf cQf = RecyclerView.S0;
            this.z = cQf;
            this.A = false;
            this.B = false;
            this.y = new OverScroller(RecyclerView.this.getContext(), cQf);
        }

        public final void a() {
            if (this.A) {
                this.B = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            Field field = bi5.a;
            bi5.LPt8Fixed.m(recyclerView, this);
        }

        public final void b(int i, int i2, int i3, Interpolator interpolator) {
            int iRound;
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i);
                int iAbs2 = Math.abs(i2);
                boolean z = iAbs > iAbs2;
                int iSqrt = (int) Math.sqrt(0);
                int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i4 = width / 2;
                float f = width;
                float f2 = i4;
                float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                if (iSqrt > 0) {
                    iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        iAbs = iAbs2;
                    }
                    iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
                }
                i3 = Math.min(iRound, AdError.SERVER_ERROR_CODE);
            }
            int i5 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.S0;
            }
            if (this.z != interpolator) {
                this.z = interpolator;
                this.y = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.x = 0;
            this.w = 0;
            recyclerView.setScrollState(2);
            this.y.startScroll(0, 0, i, i2, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.y.computeScrollOffset();
            }
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.H == null) {
                recyclerView.removeCallbacks(this);
                this.y.abortAnimation();
                return;
            }
            this.B = false;
            this.A = true;
            recyclerView.l();
            OverScroller overScroller = this.y;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.w;
                int i7 = currY - this.x;
                this.w = currX;
                this.x = currY;
                int[] iArr = recyclerView.K0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean zQ = recyclerView.q(i6, i7, 1, iArr, null);
                int[] iArr2 = recyclerView.K0;
                if (zQ) {
                    i6 -= iArr2[0];
                    i7 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.k(i6, i7);
                }
                if (recyclerView.G != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.X(i6, i7, iArr2);
                    int i8 = iArr2[0];
                    int i9 = iArr2[1];
                    int i10 = i6 - i8;
                    int i11 = i7 - i9;
                    SjP sjP = recyclerView.H.e;
                    if (sjP != null && !sjP.d && sjP.e) {
                        int iB = recyclerView.y0.b();
                        if (iB == 0) {
                            sjP.d();
                        } else if (sjP.a >= iB) {
                            sjP.a = iB - 1;
                            sjP.b(i8, i9);
                        } else {
                            sjP.b(i8, i9);
                        }
                    }
                    i4 = i8;
                    i = i10;
                    i2 = i11;
                    i3 = i9;
                } else {
                    i = i6;
                    i2 = i7;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.I.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.K0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i12 = i3;
                recyclerView.r(i4, i3, i, i2, null, 1, iArr3);
                int i13 = i - iArr2[0];
                int i14 = i2 - iArr2[1];
                if (i4 != 0 || i12 != 0) {
                    recyclerView.s(i4, i12);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
                SjP sjP2 = recyclerView.H.e;
                if ((sjP2 != null && sjP2.d) || !z) {
                    a();
                    androidx.recyclerview.widget.y yVar = recyclerView.w0;
                    if (yVar != null) {
                        yVar.a(recyclerView, i4, i12);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i13 < 0) {
                            i5 = -currVelocity;
                        } else {
                            i5 = i13 > 0 ? currVelocity : 0;
                        }
                        if (i14 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i14 <= 0) {
                            currVelocity = 0;
                        }
                        if (i5 < 0) {
                            recyclerView.u();
                            if (recyclerView.c0.isFinished()) {
                                recyclerView.c0.onAbsorb(-i5);
                            }
                        } else if (i5 > 0) {
                            recyclerView.v();
                            if (recyclerView.e0.isFinished()) {
                                recyclerView.e0.onAbsorb(i5);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.w();
                            if (recyclerView.d0.isFinished()) {
                                recyclerView.d0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.t();
                            if (recyclerView.f0.isFinished()) {
                                recyclerView.f0.onAbsorb(currVelocity);
                            }
                        }
                        if (i5 != 0 || currVelocity != 0) {
                            Field field = bi5.a;
                            bi5.LPt8Fixed.k(recyclerView);
                        }
                    }
                    if (RecyclerView.Q0) {
                        androidx.recyclerview.widget.y.CQf cQf = recyclerView.x0;
                        int[] iArr4 = cQf.c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        cQf.d = 0;
                    }
                }
            }
            SjP sjP3 = recyclerView.H.e;
            if (sjP3 != null && sjP3.d) {
                sjP3.b(0, 0);
            }
            this.A = false;
            if (!this.B) {
                recyclerView.setScrollState(0);
                recyclerView.c0(1);
            } else {
                recyclerView.removeCallbacks(this);
                Field field2 = bi5.a;
                bi5.LPt8Fixed.m(recyclerView, this);
            }
        }
    }

    public class lPt3Fixed extends YKK {
        public lPt3Fixed() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.YKK
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.h(null);
            recyclerView.y0.f = true;
            recyclerView.S(true);
            if (recyclerView.z.g()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    public static abstract class qc {
        public static final List<Object> s = Collections.emptyList();
        public final View a;
        public WeakReference<RecyclerView> b;
        public int j;
        public RecyclerView r;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public qc h = null;
        public qc i = null;
        public ArrayList k = null;
        public List<Object> l = null;
        public int m = 0;
        public ta n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public qc(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
                return;
            }
            if ((1024 & this.j) == 0) {
                if (this.k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.k = arrayList;
                    this.l = Collections.unmodifiableList(arrayList);
                }
                this.k.add(obj);
            }
        }

        public final void b(int i) {
            this.j = i | this.j;
        }

        public final int c() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final List<Object> d() {
            ArrayList arrayList;
            return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? s : this.l;
        }

        public final boolean e() {
            View view = this.a;
            return (view.getParent() == null || view.getParent() == this.r) ? false : true;
        }

        public final boolean f() {
            return (this.j & 1) != 0;
        }

        public final boolean g() {
            return (this.j & 4) != 0;
        }

        public final boolean h() {
            if ((this.j & 16) == 0) {
                Field field = bi5.a;
                if (!bi5.LPt8Fixed.i(this.a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean i() {
            return (this.j & 8) != 0;
        }

        public final boolean j() {
            return this.n != null;
        }

        public final boolean k() {
            return (this.j & 256) != 0;
        }

        public final void l(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            View view = this.a;
            if (view.getLayoutParams() != null) {
                ((y) view.getLayoutParams()).c = true;
            }
        }

        public final void m() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            ArrayList arrayList = this.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.j &= -1025;
            this.p = 0;
            this.q = -1;
            RecyclerView.i(this);
        }

        public final void n(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
        }

        public final boolean o() {
            return (this.j & 128) != 0;
        }

        public final boolean p() {
            return (this.j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (j()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (g()) {
                sb.append(" invalid");
            }
            if (!f()) {
                sb.append(" unbound");
            }
            boolean z = true;
            if ((this.j & 2) != 0) {
                sb.append(" update");
            }
            if (i()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (k()) {
                sb.append(" tmpDetached");
            }
            if (!h()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if ((this.j & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && !g()) {
                z = false;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public final class ta {
        public final ArrayList<qc> a;
        public ArrayList<qc> b;
        public final ArrayList<qc> c;
        public final List<qc> d;
        public int e;
        public int f;
        public Xn1 g;

        public ta() {
            ArrayList<qc> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public final void a(qc qcVar, boolean z) {
            RecyclerView.i(qcVar);
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.WE we = recyclerView.F0;
            if (we != null) {
                androidx.recyclerview.widget.WE.QnHx qnHx = we.e;
                boolean z2 = qnHx instanceof androidx.recyclerview.widget.WE.QnHx;
                View view = qcVar.a;
                bi5.m(view, z2 ? (d_OZ) qnHx.e.remove(view) : null);
            }
            if (z && recyclerView.y0 != null) {
                recyclerView.B.d(qcVar);
            }
            qcVar.r = null;
            Xn1 xn1C = c();
            xn1C.getClass();
            int i = qcVar.f;
            ArrayList<qc> arrayList = xn1C.a(i).a;
            if (xn1C.a.get(i).b <= arrayList.size()) {
                return;
            }
            qcVar.m();
            arrayList.add(qcVar);
        }

        public final int b(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.y0.b()) {
                return !recyclerView.y0.g ? i : recyclerView.z.f(i, 0);
            }
            StringBuilder sbC = iZUl.c("invalid position ", i, ". State item count is ");
            sbC.append(recyclerView.y0.b());
            sbC.append(recyclerView.x());
            throw new IndexOutOfBoundsException(sbC.toString());
        }

        public final Xn1 c() {
            if (this.g == null) {
                this.g = new Xn1();
            }
            return this.g;
        }

        public final void d() {
            ArrayList<qc> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e(size);
            }
            arrayList.clear();
            if (RecyclerView.Q0) {
                androidx.recyclerview.widget.y.CQf cQf = RecyclerView.this.x0;
                int[] iArr = cQf.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                cQf.d = 0;
            }
        }

        public final void e(int i) {
            ArrayList<qc> arrayList = this.c;
            a(arrayList.get(i), true);
            arrayList.remove(i);
        }

        public final void f(View view) {
            qc qcVarH = RecyclerView.H(view);
            boolean zK = qcVarH.k();
            RecyclerView recyclerView = RecyclerView.this;
            if (zK) {
                recyclerView.removeDetachedView(view, false);
            }
            if (qcVarH.j()) {
                qcVarH.n.j(qcVarH);
            } else if (qcVarH.p()) {
                qcVarH.j &= -33;
            }
            g(qcVarH);
            if (recyclerView.g0 == null || qcVarH.h()) {
                return;
            }
            recyclerView.g0.d(qcVarH);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0030  */
        /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
        public final void g(qc qcVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean zJ = qcVar.j();
            boolean z5 = false;
            RecyclerView recyclerView = RecyclerView.this;
            View view = qcVar.a;
            if (zJ || view.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(qcVar.j());
                sb.append(" isAttached:");
                sb.append(view.getParent() != null);
                sb.append(recyclerView.x());
                throw new IllegalArgumentException(sb.toString());
            }
            if (qcVar.k()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + qcVar + recyclerView.x());
            }
            if (qcVar.o()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.x());
            }
            if ((qcVar.j & 16) == 0) {
                Field field = bi5.a;
                if (bi5.LPt8Fixed.i(view)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            LPt8Fixed lPt8 = recyclerView.G;
            if (qcVar.h()) {
                if (this.f <= 0) {
                    z2 = false;
                } else {
                    if ((qcVar.j & 526) != 0) {
                        z2 = false;
                    } else {
                        ArrayList<qc> arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.f && size > 0) {
                            e(0);
                            size--;
                        }
                        if (RecyclerView.Q0 && size > 0) {
                            int i = qcVar.c;
                            androidx.recyclerview.widget.y.CQf cQf = recyclerView.x0;
                            if (cQf.c == null) {
                                z3 = false;
                                break;
                            }
                            int i2 = cQf.d * 2;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= i2) {
                                    z3 = false;
                                    break;
                                } else {
                                    if (cQf.c[i3] == i) {
                                        z3 = true;
                                        break;
                                    }
                                    i3 += 2;
                                }
                            }
                            if (!z3) {
                                do {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                    int i4 = arrayList.get(size).c;
                                    if (cQf.c == null) {
                                        z4 = false;
                                        break;
                                        break;
                                    }
                                    int i5 = cQf.d * 2;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= i5) {
                                            z4 = false;
                                            break;
                                        } else {
                                            if (cQf.c[i6] == i4) {
                                                z4 = true;
                                                break;
                                            }
                                            i6 += 2;
                                        }
                                    }
                                } while (z4);
                                size++;
                            }
                        }
                        arrayList.add(size, qcVar);
                        z2 = true;
                    }
                }
                if (!z2) {
                    a(qcVar, true);
                    z5 = true;
                }
            } else {
                z2 = false;
            }
            recyclerView.B.d(qcVar);
            if (z2 || z5 || !z) {
                return;
            }
            qcVar.r = null;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x003f  */
        /* JADX WARN: Code duplicated, block: B:31:0x0045  */
        public final void h(View view) {
            boolean z;
            boolean z2;
            qc qcVarH = RecyclerView.H(view);
            int i = qcVarH.j;
            boolean z3 = (i & 12) != 0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z3) {
                if ((i & 2) != 0) {
                    byN byn = recyclerView.g0;
                    if (byn != null) {
                        androidx.recyclerview.widget.FJCM fjcm = (androidx.recyclerview.widget.FJCM) byn;
                        if (qcVarH.d().isEmpty()) {
                            if (!fjcm.g || qcVarH.g()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                    if (!z) {
                        if (this.b == null) {
                            this.b = new ArrayList<>();
                        }
                        qcVarH.n = this;
                        qcVarH.o = true;
                        this.b.add(qcVarH);
                        return;
                    }
                }
            }
            if (qcVarH.g() && !qcVarH.i() && !recyclerView.G.b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.x());
            }
            qcVarH.n = this;
            qcVarH.o = false;
            this.a.add(qcVarH);
        }

        /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:117:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:179:0x030e A[EDGE_INSN: B:179:0x030e->B:180:0x030f BREAK  A[LOOP:6: B:174:0x02f6->B:178:0x030b]] */
        /* JADX WARN: Code duplicated, block: B:217:0x03c6 A[PHI: r4 r8
  0x03c6: PHI (r4v7 boolean) = (r4v6 boolean), (r4v10 boolean) binds: [B:131:0x0232, B:183:0x0317] A[DONT_GENERATE, DONT_INLINE]
  0x03c6: PHI (r8v3 androidx.recyclerview.widget.RecyclerView$qc) = (r8v2 androidx.recyclerview.widget.RecyclerView$qc), (r8v22 androidx.recyclerview.widget.RecyclerView$qc) binds: [B:131:0x0232, B:183:0x0317] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:243:0x041c  */
        /* JADX WARN: Code duplicated, block: B:245:0x0434  */
        /* JADX WARN: Code duplicated, block: B:251:0x044a  */
        /* JADX WARN: Code duplicated, block: B:256:0x045c  */
        /* JADX WARN: Code duplicated, block: B:259:0x047b  */
        /* JADX WARN: Code duplicated, block: B:262:0x048e  */
        /* JADX WARN: Code duplicated, block: B:266:0x04ac  */
        /* JADX WARN: Code duplicated, block: B:272:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:274:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:276:0x04ce  */
        /* JADX WARN: Code duplicated, block: B:277:0x04d3  */
        /* JADX WARN: Code duplicated, block: B:281:0x04d9  */
        /* JADX WARN: Code duplicated, block: B:283:0x04df  */
        /* JADX WARN: Code duplicated, block: B:286:0x04e9  */
        /* JADX WARN: Code duplicated, block: B:288:0x04ed  */
        /* JADX WARN: Code duplicated, block: B:289:0x04f2  */
        /* JADX WARN: Code duplicated, block: B:295:0x0505  */
        /* JADX WARN: Code duplicated, block: B:298:0x050a  */
        /* JADX WARN: Code duplicated, block: B:302:0x0518  */
        /* JADX WARN: Code duplicated, block: B:303:0x0522  */
        /* JADX WARN: Code duplicated, block: B:305:0x0528  */
        /* JADX WARN: Code duplicated, block: B:306:0x0532  */
        /* JADX WARN: Code duplicated, block: B:311:0x053c  */
        /* JADX WARN: Code duplicated, block: B:35:0x007d A[EDGE_INSN: B:35:0x007d->B:36:0x007e BREAK  A[LOOP:0: B:14:0x0025->B:20:0x003f]] */
        /* JADX WARN: Code duplicated, block: B:77:0x012d  */
        public final qc i(int i, long j) {
            boolean z;
            qc qcVar;
            d_OZ d_oz;
            qc qcVarD;
            int iF;
            int i2;
            LPt8Fixed lPt8;
            ArrayList arrayList;
            View view;
            ViewGroup.LayoutParams layoutParams;
            long nanoTime;
            long j2;
            AccessibilityManager accessibilityManager;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            androidx.recyclerview.widget.WE we;
            androidx.recyclerview.widget.WE.QnHx qnHx;
            View.AccessibilityDelegate accessibilityDelegateB;
            long j3;
            boolean z7;
            ViewGroup.LayoutParams layoutParams2;
            View view2;
            y yVar;
            RecyclerView recyclerViewC;
            qc qcVarRemove;
            View view3;
            qc qcVarH;
            int iB;
            LPt8Fixed lPt9;
            boolean z8;
            int size;
            int iF2;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.y0.b()) {
                StringBuilder sbA = a42.a("Invalid item position ", i, "(", i, "). Item count:");
                sbA.append(recyclerView.y0.b());
                sbA.append(recyclerView.x());
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            Aa aa = recyclerView.y0;
            if (aa.g) {
                ArrayList<qc> arrayList2 = this.b;
                if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            if (recyclerView.G.b && (iF2 = recyclerView.z.f(i, 0)) > 0 && iF2 < recyclerView.G.a()) {
                                long jB = recyclerView.G.b(iF2);
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size) {
                                        qcVar = null;
                                        break;
                                    }
                                    qc qcVar2 = this.b.get(i4);
                                    if (!qcVar2.p() && qcVar2.e == jB) {
                                        qcVar2.b(32);
                                        qcVar = qcVar2;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                qcVar = null;
                                break;
                            }
                        } else {
                            qcVar = this.b.get(i3);
                            if (!qcVar.p() && qcVar.c() == i) {
                                qcVar.b(32);
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    qcVar = null;
                    break;
                }
                z = qcVar != null;
            } else {
                z = false;
                qcVar = null;
            }
            ArrayList<qc> arrayList3 = this.c;
            ArrayList<qc> arrayList4 = this.a;
            if (qcVar == null) {
                int size2 = arrayList4.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        androidx.recyclerview.widget.CQf cQf = recyclerView.A;
                        ArrayList arrayList5 = cQf.c;
                        int size3 = arrayList5.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList5.get(i6);
                            ((androidx.recyclerview.widget.SjP) cQf.a).getClass();
                            qc qcVarH2 = RecyclerView.H(view3);
                            if (qcVarH2.c() == i && !qcVarH2.g() && !qcVarH2.i()) {
                                break;
                            }
                            i6++;
                        }
                        if (view3 != null) {
                            qcVarH = RecyclerView.H(view3);
                            androidx.recyclerview.widget.CQf cQf2 = recyclerView.A;
                            int iIndexOfChild = ((androidx.recyclerview.widget.SjP) cQf2.a).a.indexOfChild(view3);
                            if (iIndexOfChild < 0) {
                                throw new IllegalArgumentException("view is not a child, cannot hide " + view3);
                            }
                            androidx.recyclerview.widget.CQf.QnHx qnHx2 = cQf2.b;
                            if (!qnHx2.d(iIndexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view3);
                            }
                            qnHx2.a(iIndexOfChild);
                            cQf2.k(view3);
                            androidx.recyclerview.widget.CQf cQf3 = recyclerView.A;
                            int iIndexOfChild2 = ((androidx.recyclerview.widget.SjP) cQf3.a).a.indexOfChild(view3);
                            if (iIndexOfChild2 == -1) {
                                iB = -1;
                            } else {
                                androidx.recyclerview.widget.CQf.QnHx qnHx3 = cQf3.b;
                                if (qnHx3.d(iIndexOfChild2)) {
                                    iB = -1;
                                } else {
                                    iB = iIndexOfChild2 - qnHx3.b(iIndexOfChild2);
                                }
                            }
                            if (iB == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + qcVarH + recyclerView.x());
                            }
                            recyclerView.A.c(iB);
                            h(view3);
                            qcVarH.b(8224);
                        } else {
                            int size4 = arrayList3.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 < size4) {
                                    qc qcVar3 = arrayList3.get(i7);
                                    if (!qcVar3.g() && qcVar3.c() == i && !qcVar3.e()) {
                                        arrayList3.remove(i7);
                                        qcVar = qcVar3;
                                        break;
                                    }
                                    i7++;
                                } else {
                                    qcVarH = null;
                                }
                            }
                        }
                        qcVar = qcVarH;
                        break;
                    }
                    qc qcVar4 = arrayList4.get(i5);
                    if (!qcVar4.p() && qcVar4.c() == i && !qcVar4.g() && (aa.g || !qcVar4.i())) {
                        qcVar4.b(32);
                        qcVar = qcVar4;
                        break;
                    }
                    i5++;
                }
                if (qcVar != null) {
                    if (qcVar.i()) {
                        z8 = aa.g;
                    } else {
                        int i8 = qcVar.c;
                        if (i8 < 0 || i8 >= recyclerView.G.a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + qcVar + recyclerView.x());
                        }
                        if (aa.g) {
                            lPt9 = recyclerView.G;
                            if (lPt9.b) {
                            }
                            z8 = true;
                        } else {
                            recyclerView.G.getClass();
                            if (qcVar.f != 0) {
                                z8 = false;
                            } else {
                                lPt9 = recyclerView.G;
                                if (lPt9.b || qcVar.e == lPt9.b(qcVar.c)) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                            }
                        }
                    }
                    if (z8) {
                        z = true;
                    } else {
                        qcVar.b(4);
                        if (qcVar.j()) {
                            recyclerView.removeDetachedView(qcVar.a, false);
                            qcVar.n.j(qcVar);
                        } else if (qcVar.p()) {
                            qcVar.j &= -33;
                        }
                        g(qcVar);
                        qcVar = null;
                    }
                }
            }
            if (qcVar != null) {
                d_oz = null;
                qcVarD = qcVar;
            } else {
                int iF3 = recyclerView.z.f(i, 0);
                if (iF3 < 0 || iF3 >= recyclerView.G.a()) {
                    StringBuilder sbA2 = a42.a("Inconsistency detected. Invalid item position ", i, "(offset:", iF3, ").state:");
                    sbA2.append(aa.b());
                    sbA2.append(recyclerView.x());
                    throw new IndexOutOfBoundsException(sbA2.toString());
                }
                recyclerView.G.getClass();
                LPt8Fixed lPt10 = recyclerView.G;
                if (lPt10.b) {
                    long jB2 = lPt10.b(iF3);
                    int size5 = arrayList4.size() - 1;
                    while (true) {
                        if (size5 < 0) {
                            int size6 = arrayList3.size() - 1;
                            while (true) {
                                if (size6 >= 0) {
                                    qc qcVar5 = arrayList3.get(size6);
                                    if (qcVar5.e != jB2 || qcVar5.e()) {
                                        size6--;
                                    } else {
                                        if (qcVar5.f == 0) {
                                            arrayList3.remove(size6);
                                            qcVar = qcVar5;
                                            break;
                                        }
                                        e(size6);
                                    }
                                }
                                qcVar = null;
                                break;
                            }
                        }
                        qc qcVar6 = arrayList4.get(size5);
                        if (qcVar6.e == jB2 && !qcVar6.p()) {
                            if (qcVar6.f == 0) {
                                qcVar6.b(32);
                                if (qcVar6.i() && !aa.g) {
                                    qcVar6.j = (qcVar6.j & (-15)) | 2;
                                }
                                qcVar = qcVar6;
                                break;
                            }
                            arrayList4.remove(size5);
                            View view4 = qcVar6.a;
                            recyclerView.removeDetachedView(view4, false);
                            qc qcVarH3 = RecyclerView.H(view4);
                            qcVarH3.n = null;
                            qcVarH3.o = false;
                            qcVarH3.j &= -33;
                            g(qcVarH3);
                        }
                        size5--;
                    }
                    if (qcVar != null) {
                        qcVar.c = iF3;
                        z = true;
                    }
                }
                if (qcVar == null) {
                    Xn1.QnHx qnHx4 = c().a.get(0);
                    if (qnHx4 == null) {
                        qcVarRemove = null;
                        break;
                    }
                    ArrayList<qc> arrayList6 = qnHx4.a;
                    if (!arrayList6.isEmpty()) {
                        int size7 = arrayList6.size() - 1;
                        while (true) {
                            if (size7 < 0) {
                                qcVarRemove = null;
                                break;
                            }
                            if (!arrayList6.get(size7).e()) {
                                qcVarRemove = arrayList6.remove(size7);
                                break;
                            }
                            size7--;
                        }
                    } else {
                        qcVarRemove = null;
                        break;
                    }
                    if (qcVarRemove != null) {
                        qcVarRemove.m();
                        int[] iArr = RecyclerView.O0;
                    }
                    qcVar = qcVarRemove;
                }
                if (qcVar == null) {
                    long nanoTime2 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        long j4 = this.g.a(0).c;
                        if (!(j4 == 0 || j4 + nanoTime2 < j)) {
                            return null;
                        }
                    }
                    d_oz = null;
                    LPt8Fixed lPt11 = recyclerView.G;
                    lPt11.getClass();
                    try {
                        int i9 = i95.a;
                        i95.QnHx.a("RV CreateView");
                        qcVarD = lPt11.d(recyclerView);
                        if (qcVarD.a.getParent() != null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        qcVarD.f = 0;
                        i95.QnHx.b();
                        if (RecyclerView.Q0 && (recyclerViewC = RecyclerView.C(qcVarD.a)) != null) {
                            qcVarD.b = new WeakReference<>(recyclerViewC);
                        }
                        long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        Xn1.QnHx qnHxA = this.g.a(0);
                        long j5 = qnHxA.c;
                        if (j5 != 0) {
                            nanoTime3 = (nanoTime3 / 4) + ((j5 / 4) * 3);
                        }
                        qnHxA.c = nanoTime3;
                    } catch (Throwable th) {
                        int i10 = i95.a;
                        i95.QnHx.b();
                        throw th;
                    }
                } else {
                    d_oz = null;
                    qcVarD = qcVar;
                }
            }
            if (z && !aa.g) {
                int i11 = qcVarD.j;
                if ((i11 & 8192) != 0) {
                    qcVarD.j = (i11 & (-8193)) | 0;
                    if (aa.j) {
                        byN.b(qcVarD);
                        byN byn = recyclerView.g0;
                        qcVarD.d();
                        byn.getClass();
                        byN.F1 f1 = new byN.F1();
                        f1.a(qcVarD);
                        recyclerView.T(qcVarD, f1);
                    }
                }
            }
            if (!aa.g || !qcVarD.f()) {
                if (qcVarD.f()) {
                    if (((2 & qcVarD.j) != 0) || qcVarD.g()) {
                        iF = recyclerView.z.f(i, 0);
                        qcVarD.r = recyclerView;
                        i2 = qcVarD.f;
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j3 = this.g.a(i2).d;
                            if (j3 != 0) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            if (!z7) {
                            }
                        }
                        lPt8 = recyclerView.G;
                        lPt8.getClass();
                        qcVarD.c = iF;
                        if (lPt8.b) {
                            qcVarD.e = lPt8.b(iF);
                        }
                        qcVarD.j = (qcVarD.j & (-520)) | 1;
                        int i12 = i95.a;
                        i95.QnHx.a("RV OnBindView");
                        qcVarD.d();
                        lPt8.c(qcVarD, iF);
                        arrayList = qcVarD.k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        qcVarD.j &= -1025;
                        view = qcVarD.a;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof y) {
                            ((y) layoutParams).c = true;
                        }
                        i95.QnHx.b();
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        Xn1.QnHx qnHxA2 = this.g.a(qcVarD.f);
                        j2 = qnHxA2.d;
                        if (j2 != 0) {
                            nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                        }
                        qnHxA2.d = nanoTime;
                        accessibilityManager = recyclerView.T;
                        if (accessibilityManager == null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Field field = bi5.a;
                            if (bi5.LPt8Fixed.c(view) == 0) {
                                z6 = true;
                                bi5.LPt8Fixed.s(view, 1);
                            } else {
                                z6 = true;
                            }
                            we = recyclerView.F0;
                            if (we != null) {
                                qnHx = we.e;
                                if (qnHx instanceof androidx.recyclerview.widget.WE.QnHx) {
                                    qnHx.getClass();
                                    accessibilityDelegateB = bi5.b(view);
                                    if (accessibilityDelegateB != null) {
                                        if (accessibilityDelegateB instanceof d_OZ.QnHx) {
                                            d_oz = ((d_OZ.QnHx) accessibilityDelegateB).a;
                                        } else {
                                            d_oz = new d_OZ(accessibilityDelegateB);
                                        }
                                    }
                                    if (d_oz != null) {
                                        qnHx.e.put(view, d_oz);
                                    }
                                }
                                bi5.m(view, qnHx);
                            }
                            z3 = z6;
                        } else {
                            z3 = true;
                        }
                        if (aa.g) {
                            qcVarD.g = i;
                        }
                        z4 = true;
                        z5 = z3;
                    }
                } else {
                    iF = recyclerView.z.f(i, 0);
                    qcVarD.r = recyclerView;
                    i2 = qcVarD.f;
                    long nanoTime5 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j3 = this.g.a(i2).d;
                        if (j3 != 0 || j3 + nanoTime5 < j) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (!z7) {
                        }
                    }
                    lPt8 = recyclerView.G;
                    lPt8.getClass();
                    qcVarD.c = iF;
                    if (lPt8.b) {
                        qcVarD.e = lPt8.b(iF);
                    }
                    qcVarD.j = (qcVarD.j & (-520)) | 1;
                    int i13 = i95.a;
                    i95.QnHx.a("RV OnBindView");
                    qcVarD.d();
                    lPt8.c(qcVarD, iF);
                    arrayList = qcVarD.k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    qcVarD.j &= -1025;
                    view = qcVarD.a;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof y) {
                        ((y) layoutParams).c = true;
                    }
                    i95.QnHx.b();
                    nanoTime = recyclerView.getNanoTime() - nanoTime5;
                    Xn1.QnHx qnHxA3 = this.g.a(qcVarD.f);
                    j2 = qnHxA3.d;
                    if (j2 != 0) {
                        nanoTime = (nanoTime / 4) + ((j2 / 4) * 3);
                    }
                    qnHxA3.d = nanoTime;
                    accessibilityManager = recyclerView.T;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        Field field2 = bi5.a;
                        if (bi5.LPt8Fixed.c(view) == 0) {
                            z6 = true;
                            bi5.LPt8Fixed.s(view, 1);
                        } else {
                            z6 = true;
                        }
                        we = recyclerView.F0;
                        if (we != null) {
                            qnHx = we.e;
                            if (qnHx instanceof androidx.recyclerview.widget.WE.QnHx) {
                                qnHx.getClass();
                                accessibilityDelegateB = bi5.b(view);
                                if (accessibilityDelegateB != null) {
                                    if (accessibilityDelegateB instanceof d_OZ.QnHx) {
                                        d_oz = ((d_OZ.QnHx) accessibilityDelegateB).a;
                                    } else {
                                        d_oz = new d_OZ(accessibilityDelegateB);
                                    }
                                }
                                if (d_oz != null && d_oz != qnHx) {
                                    qnHx.e.put(view, d_oz);
                                }
                            }
                            bi5.m(view, qnHx);
                        }
                        z3 = z6;
                    } else {
                        z3 = true;
                    }
                    if (aa.g) {
                        qcVarD.g = i;
                    }
                    z4 = true;
                    z5 = z3;
                }
                layoutParams2 = qcVarD.a.getLayoutParams();
                view2 = qcVarD.a;
                if (layoutParams2 == null) {
                    yVar = (y) recyclerView.generateDefaultLayoutParams();
                    view2.setLayoutParams(yVar);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    yVar = (y) layoutParams2;
                } else {
                    yVar = (y) recyclerView.generateLayoutParams(layoutParams2);
                    view2.setLayoutParams(yVar);
                }
                yVar.a = qcVarD;
                if (z || !z4) {
                    z5 = false;
                }
                yVar.d = z5;
                return qcVarD;
            }
            qcVarD.g = i;
            z4 = false;
            z5 = true;
            layoutParams2 = qcVarD.a.getLayoutParams();
            view2 = qcVarD.a;
            if (layoutParams2 == null) {
                yVar = (y) recyclerView.generateDefaultLayoutParams();
                view2.setLayoutParams(yVar);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                yVar = (y) recyclerView.generateLayoutParams(layoutParams2);
                view2.setLayoutParams(yVar);
            } else {
                yVar = (y) layoutParams2;
            }
            yVar.a = qcVarD;
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            yVar.d = z5;
            return qcVarD;
        }

        public final void j(qc qcVar) {
            if (qcVar.o) {
                this.b.remove(qcVar);
            } else {
                this.a.remove(qcVar);
            }
            qcVar.n = null;
            qcVar.o = false;
            qcVar.j &= -33;
        }

        public final void k() {
            PRnFixed pRn = RecyclerView.this.H;
            this.f = this.e + (pRn != null ? pRn.j : 0);
            ArrayList<qc> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                e(size);
            }
        }
    }

    static {
        P0 = Build.VERSION.SDK_INT >= 23;
        Q0 = true;
        Class<?> cls = Integer.TYPE;
        R0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        S0 = new CQf();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.azefsw.audioconnect.R.attr.recyclerViewStyle);
    }

    public static RecyclerView C(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewC = C(viewGroup.getChildAt(i));
            if (recyclerViewC != null) {
                return recyclerViewC;
            }
        }
        return null;
    }

    public static qc H(View view) {
        if (view == null) {
            return null;
        }
        return ((y) view.getLayoutParams()).a;
    }

    private sm2 getScrollingChildHelper() {
        if (this.H0 == null) {
            this.H0 = new sm2(this);
        }
        return this.H0;
    }

    public static void i(qc qcVar) {
        WeakReference<RecyclerView> weakReference = qcVar.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == qcVar.a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            qcVar.b = null;
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<MZ> arrayList = this.J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            MZ mz = arrayList.get(i);
            if (mz.b(motionEvent) && action != 3) {
                this.K = mz;
                return true;
            }
        }
        return false;
    }

    public final void B(int[] iArr) {
        int iE = this.A.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iE; i3++) {
            qc qcVarH = H(this.A.d(i3));
            if (!qcVarH.o()) {
                int iC = qcVarH.c();
                if (iC < i) {
                    i = iC;
                }
                if (iC > i2) {
                    i2 = iC;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final qc D(int i) {
        qc qcVar = null;
        if (this.U) {
            return null;
        }
        int iH = this.A.h();
        for (int i2 = 0; i2 < iH; i2++) {
            qc qcVarH = H(this.A.g(i2));
            if (qcVarH != null && !qcVarH.i() && E(qcVarH) == i) {
                if (!this.A.j(qcVarH.a)) {
                    return qcVarH;
                }
                qcVar = qcVarH;
            }
        }
        return qcVar;
    }

    public final int E(qc qcVar) {
        if (!((qcVar.j & 524) != 0) && qcVar.f()) {
            androidx.recyclerview.widget.QnHx qnHx = this.z;
            int i = qcVar.c;
            ArrayList<androidx.recyclerview.widget.QnHx.CQf> arrayList = qnHx.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.recyclerview.widget.QnHx.CQf cQf = arrayList.get(i2);
                int i3 = cQf.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = cQf.b;
                        if (i4 <= i) {
                            int i5 = cQf.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = cQf.b;
                        if (i6 == i) {
                            i = cQf.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (cQf.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (cQf.b <= i) {
                    i += cQf.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long F(qc qcVar) {
        return this.G.b ? qcVar.e : qcVar.c;
    }

    public final qc G(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return H(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect I(View view) {
        y yVar = (y) view.getLayoutParams();
        boolean z = yVar.c;
        Rect rect = yVar.b;
        if (!z) {
            return rect;
        }
        if (this.y0.g && (yVar.b() || yVar.a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<FJCM> arrayList = this.I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.D;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i).getClass();
            ((y) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        yVar.c = false;
        return rect;
    }

    public final boolean J() {
        return this.W > 0;
    }

    public final void K(int i) {
        if (this.H == null) {
            return;
        }
        setScrollState(2);
        this.H.i0(i);
        awakenScrollBars();
    }

    public final void L() {
        int iH = this.A.h();
        for (int i = 0; i < iH; i++) {
            ((y) this.A.g(i).getLayoutParams()).c = true;
        }
        ArrayList<qc> arrayList = this.x.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            y yVar = (y) arrayList.get(i2).a.getLayoutParams();
            if (yVar != null) {
                yVar.c = true;
            }
        }
    }

    public final void M(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iH = this.A.h();
        for (int i4 = 0; i4 < iH; i4++) {
            qc qcVarH = H(this.A.g(i4));
            if (qcVarH != null && !qcVarH.o()) {
                int i5 = qcVarH.c;
                Aa aa = this.y0;
                if (i5 >= i3) {
                    qcVarH.l(-i2, z);
                    aa.f = true;
                } else if (i5 >= i) {
                    qcVarH.b(8);
                    qcVarH.l(-i2, z);
                    qcVarH.c = i - 1;
                    aa.f = true;
                }
            }
        }
        ta taVar = this.x;
        ArrayList<qc> arrayList = taVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            qc qcVar = arrayList.get(size);
            if (qcVar != null) {
                int i6 = qcVar.c;
                if (i6 >= i3) {
                    qcVar.l(-i2, z);
                } else if (i6 >= i) {
                    qcVar.b(8);
                    taVar.e(size);
                }
            }
        }
    }

    public final void N() {
        this.W++;
    }

    public final void O(boolean z) {
        int i;
        int i2 = this.W - 1;
        this.W = i2;
        if (i2 < 1) {
            this.W = 0;
            if (z) {
                int i3 = this.S;
                this.S = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.T;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                        accessibilityEventObtain.setEventType(2048);
                        F.b(accessibilityEventObtain, i3);
                        sendAccessibilityEventUnchecked(accessibilityEventObtain);
                    }
                }
                ArrayList arrayList = this.L0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    qc qcVar = (qc) arrayList.get(size);
                    if (qcVar.a.getParent() == this && !qcVar.o() && (i = qcVar.q) != -1) {
                        Field field = bi5.a;
                        bi5.LPt8Fixed.s(qcVar.a, i);
                        qcVar.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.i0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.i0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.m0 = x;
            this.k0 = x;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.n0 = y2;
            this.l0 = y2;
        }
    }

    public final void Q() {
        if (this.E0 || !this.L) {
            return;
        }
        Field field = bi5.a;
        bi5.LPt8Fixed.m(this, this.M0);
        this.E0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    public final void R() {
        boolean z;
        boolean z2;
        if (this.U) {
            androidx.recyclerview.widget.QnHx qnHx = this.z;
            qnHx.l(qnHx.b);
            qnHx.l(qnHx.c);
            if (this.V) {
                this.H.S();
            }
        }
        if (this.g0 != null && this.H.u0()) {
            this.z.j();
        } else {
            this.z.c();
        }
        boolean z3 = this.B0 || this.C0;
        boolean z4 = this.N && this.g0 != null && ((z2 = this.U) || z3 || this.H.f) && (!z2 || this.G.b);
        Aa aa = this.y0;
        aa.j = z4;
        if (z4 && z3 && !this.U) {
            z = this.g0 != null && this.H.u0();
        }
        aa.k = z;
    }

    public final void S(boolean z) {
        this.V = z | this.V;
        this.U = true;
        int iH = this.A.h();
        for (int i = 0; i < iH; i++) {
            qc qcVarH = H(this.A.g(i));
            if (qcVarH != null && !qcVarH.o()) {
                qcVarH.b(6);
            }
        }
        L();
        ta taVar = this.x;
        ArrayList<qc> arrayList = taVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qc qcVar = arrayList.get(i2);
            if (qcVar != null) {
                qcVar.b(6);
                qcVar.a(null);
            }
        }
        LPt8Fixed lPt8 = RecyclerView.this.G;
        if (lPt8 == null || !lPt8.b) {
            taVar.d();
        }
    }

    public final void T(qc qcVar, byN.F1 f1) {
        int i = (qcVar.j & (-8193)) | 0;
        qcVar.j = i;
        boolean z = this.y0.h;
        o_K o_k = this.B;
        if (z) {
            if (((i & 2) != 0) && !qcVar.i() && !qcVar.o()) {
                o_k.b.j(F(qcVar), qcVar);
            }
        }
        ok4<qc, o_K.QnHx> ok4Var = o_k.a;
        o_K.QnHx orDefault = ok4Var.getOrDefault(qcVar, null);
        if (orDefault == null) {
            orDefault = o_K.QnHx.a();
            ok4Var.put(qcVar, orDefault);
        }
        orDefault.b = f1;
        orDefault.a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof y) {
            y yVar = (y) layoutParams;
            if (!yVar.c) {
                int i = rect.left;
                Rect rect2 = yVar.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.H.f0(this, view, this.D, !this.N, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        c0(0);
        EdgeEffect edgeEffect = this.c0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.c0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.d0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.e0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f0.isFinished();
        }
        if (zIsFinished) {
            Field field = bi5.a;
            bi5.LPt8Fixed.k(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:35:0x010e A[DONT_INVERT, PHI: r4
  0x010e: PHI (r4v9 boolean) = (r4v7 boolean), (r4v10 boolean) binds: [B:32:0x00f5, B:34:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    public final boolean W(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        l();
        LPt8Fixed lPt8 = this.G;
        int[] iArr = this.K0;
        if (lPt8 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            X(i, i2, iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i4 = i7;
            i3 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.I.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.K0;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int i9 = i3;
        r(i4, i3, i5, i6, this.I0, 0, iArr2);
        int i10 = iArr[0];
        int i11 = i5 - i10;
        int i12 = iArr[1];
        int i13 = i6 - i12;
        boolean z2 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.m0;
        int[] iArr3 = this.I0;
        int i15 = iArr3[0];
        this.m0 = i14 - i15;
        int i16 = this.n0;
        int i17 = iArr3[1];
        this.n0 = i16 - i17;
        int[] iArr4 = this.J0;
        iArr4[0] = iArr4[0] + i15;
        iArr4[1] = iArr4[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AY.G(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f = i11;
                float y2 = motionEvent.getY();
                float f2 = i13;
                if (f < 0.0f) {
                    u();
                    oq0.QnHx.a(this.c0, (-f) / getWidth(), 1.0f - (y2 / getHeight()));
                } else {
                    if (f > 0.0f) {
                        v();
                        oq0.QnHx.a(this.e0, f / getWidth(), y2 / getHeight());
                    } else {
                        z = false;
                    }
                    if (f2 < 0.0f) {
                        w();
                        oq0.QnHx.a(this.d0, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        t();
                        oq0.QnHx.a(this.f0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z || f != 0.0f || f2 != 0.0f) {
                        Field field = bi5.a;
                        bi5.LPt8Fixed.k(this);
                    }
                    z = true;
                    if (z) {
                        Field field2 = bi5.a;
                        bi5.LPt8Fixed.k(this);
                    } else {
                        Field field3 = bi5.a;
                        bi5.LPt8Fixed.k(this);
                    }
                }
                z = true;
                if (f2 < 0.0f) {
                    w();
                    oq0.QnHx.a(this.d0, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    t();
                    oq0.QnHx.a(this.f0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z) {
                    Field field4 = bi5.a;
                    bi5.LPt8Fixed.k(this);
                } else {
                    Field field5 = bi5.a;
                    bi5.LPt8Fixed.k(this);
                }
                z = true;
                if (z) {
                    Field field6 = bi5.a;
                    bi5.LPt8Fixed.k(this);
                } else {
                    Field field7 = bi5.a;
                    bi5.LPt8Fixed.k(this);
                }
            }
            k(i, i2);
        }
        if (i4 != 0 || i9 != 0) {
            s(i4, i9);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i4 == 0 && i9 == 0) ? false : true;
    }

    public final void X(int i, int i2, int[] iArr) {
        qc qcVar;
        a0();
        N();
        int i3 = i95.a;
        i95.QnHx.a("RV Scroll");
        Aa aa = this.y0;
        y(aa);
        ta taVar = this.x;
        int iH0 = i != 0 ? this.H.h0(i, taVar, aa) : 0;
        int iJ0 = i2 != 0 ? this.H.j0(i2, taVar, aa) : 0;
        i95.QnHx.b();
        int iE = this.A.e();
        for (int i4 = 0; i4 < iE; i4++) {
            View viewD = this.A.d(i4);
            qc qcVarG = G(viewD);
            if (qcVarG != null && (qcVar = qcVarG.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = qcVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        O(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = iH0;
            iArr[1] = iJ0;
        }
    }

    public final void Y(int i) {
        SjP sjP;
        if (this.Q) {
            return;
        }
        setScrollState(0);
        ct ctVar = this.v0;
        RecyclerView.this.removeCallbacks(ctVar);
        ctVar.y.abortAnimation();
        PRnFixed pRn = this.H;
        if (pRn != null && (sjP = pRn.e) != null) {
            sjP.d();
        }
        PRnFixed pRn2 = this.H;
        if (pRn2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pRn2.i0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z) {
        PRnFixed pRn = this.H;
        if (pRn == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.Q) {
            return;
        }
        if (!pRn.d()) {
            i = 0;
        }
        if (!this.H.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.v0.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.O + 1;
        this.O = i;
        if (i != 1 || this.Q) {
            return;
        }
        this.P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        PRnFixed pRn = this.H;
        if (pRn != null) {
            pRn.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z) {
        if (this.O < 1) {
            this.O = 1;
        }
        if (!z && !this.Q) {
            this.P = false;
        }
        if (this.O == 1) {
            if (z && this.P && !this.Q && this.H != null && this.G != null) {
                n();
            }
            if (!this.Q) {
                this.P = false;
            }
        }
        this.O--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof y) && this.H.f((y) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        PRnFixed pRn = this.H;
        if (pRn != null && pRn.d()) {
            return this.H.j(this.y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        PRnFixed pRn = this.H;
        if (pRn != null && pRn.d()) {
            return this.H.k(this.y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        PRnFixed pRn = this.H;
        if (pRn != null && pRn.d()) {
            return this.H.l(this.y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        PRnFixed pRn = this.H;
        if (pRn != null && pRn.e()) {
            return this.H.m(this.y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        PRnFixed pRn = this.H;
        if (pRn != null && pRn.e()) {
            return this.H.n(this.y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        PRnFixed pRn = this.H;
        if (pRn != null && pRn.e()) {
            return this.H.o(this.y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList<FJCM> arrayList = this.I;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            arrayList.get(i).d(canvas);
        }
        EdgeEffect edgeEffect = this.c0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.C ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.c0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.d0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.C) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.d0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.e0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.C ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.e0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.C) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.g0 == null || arrayList.size() <= 0 || !this.g0.f()) ? z : true) {
            Field field = bi5.a;
            bi5.LPt8Fixed.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(qc qcVar) {
        View view = qcVar.a;
        boolean z = view.getParent() == this;
        this.x.j(G(view));
        if (qcVar.k()) {
            this.A.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.A.a(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.CQf cQf = this.A;
        int iIndexOfChild = ((androidx.recyclerview.widget.SjP) cQf.a).a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            cQf.b.h(iIndexOfChild);
            cQf.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f(FJCM fjcm) {
        PRnFixed pRn = this.H;
        if (pRn != null) {
            pRn.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<FJCM> arrayList = this.I;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(fjcm);
        L();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:135:0x019b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewN;
        int i2;
        byte b;
        boolean z;
        this.H.getClass();
        boolean z2 = false;
        boolean z3 = (this.G == null || this.H == null || J() || this.Q) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        Aa aa = this.y0;
        ta taVar = this.x;
        if (z3 && (i == 2 || i == 1)) {
            if (this.H.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.H.d()) {
                RecyclerView recyclerView = this.H.b;
                Field field = bi5.a;
                z = focusFinder.findNextFocus(this, view, (bi5.NUlFixed.d(recyclerView) == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                l();
                if (z(view) == null) {
                    return null;
                }
                a0();
                this.H.N(view, i, taVar, aa);
                b0(false);
            }
            viewN = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z3) {
                l();
                if (z(view) == null) {
                    return null;
                }
                a0();
                viewN = this.H.N(view, i, taVar, aa);
                b0(false);
            } else {
                viewN = viewFindNextFocus;
            }
        }
        if (viewN != null && !viewN.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            U(viewN, null);
            return view;
        }
        if (viewN == null || viewN == this) {
            z2 = false;
        } else if (z(viewN) != null) {
            if (view != null && z(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.D;
                rect.set(0, 0, width, height);
                int width2 = viewN.getWidth();
                int height2 = viewN.getHeight();
                Rect rect2 = this.E;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(viewN, rect2);
                RecyclerView recyclerView2 = this.H.b;
                Field field2 = bi5.a;
                int i3 = bi5.NUlFixed.d(recyclerView2) == 1 ? -1 : 1;
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    b = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        throw new IllegalArgumentException("Invalid direction: " + i + x());
                                    }
                                    if (b <= 0) {
                                        z2 = false;
                                    }
                                } else if (i2 <= 0) {
                                    z2 = false;
                                }
                            } else if (b >= 0) {
                                z2 = false;
                            }
                        } else if (i2 >= 0) {
                            z2 = false;
                        }
                    } else if (b <= 0 && (b != 0 || i2 * i3 < 0)) {
                        z2 = false;
                    }
                } else if (b >= 0 && (b != 0 || i2 * i3 > 0)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2 ? viewN : super.focusSearch(view, i);
    }

    public final void g(LPt6Fixed lPt6) {
        if (this.A0 == null) {
            this.A0 = new ArrayList();
        }
        this.A0.add(lPt6);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        PRnFixed pRn = this.H;
        if (pRn != null) {
            return pRn.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + x());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        PRnFixed pRn = this.H;
        if (pRn != null) {
            return pRn.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + x());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public LPt8Fixed getAdapter() {
        return this.G;
    }

    @Override // android.view.View
    public int getBaseline() {
        PRnFixed pRn = this.H;
        if (pRn == null) {
            return super.getBaseline();
        }
        pRn.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.C;
    }

    public androidx.recyclerview.widget.WE getCompatAccessibilityDelegate() {
        return this.F0;
    }

    public T23 getEdgeEffectFactory() {
        return this.b0;
    }

    public byN getItemAnimator() {
        return this.g0;
    }

    public int getItemDecorationCount() {
        return this.I.size();
    }

    public PRnFixed getLayoutManager() {
        return this.H;
    }

    public int getMaxFlingVelocity() {
        return this.r0;
    }

    public int getMinFlingVelocity() {
        return this.q0;
    }

    public long getNanoTime() {
        if (Q0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public RBi getOnFlingListener() {
        return this.p0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.u0;
    }

    public Xn1 getRecycledViewPool() {
        return this.x.c();
    }

    public int getScrollState() {
        return this.h0;
    }

    public final void h(String str) {
        if (J()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + x());
        }
        if (this.a0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + x()));
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.L;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.Q;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j() {
        int iH = this.A.h();
        for (int i = 0; i < iH; i++) {
            qc qcVarH = H(this.A.g(i));
            if (!qcVarH.o()) {
                qcVarH.d = -1;
                qcVarH.g = -1;
            }
        }
        ta taVar = this.x;
        ArrayList<qc> arrayList = taVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qc qcVar = arrayList.get(i2);
            qcVar.d = -1;
            qcVar.g = -1;
        }
        ArrayList<qc> arrayList2 = taVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            qc qcVar2 = arrayList2.get(i3);
            qcVar2.d = -1;
            qcVar2.g = -1;
        }
        ArrayList<qc> arrayList3 = taVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                qc qcVar3 = taVar.b.get(i4);
                qcVar3.d = -1;
                qcVar3.g = -1;
            }
        }
    }

    public final void k(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.c0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.c0.onRelease();
            zIsFinished = this.c0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.e0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.e0.onRelease();
            zIsFinished |= this.e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.d0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.d0.onRelease();
            zIsFinished |= this.d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f0.onRelease();
            zIsFinished |= this.f0.isFinished();
        }
        if (zIsFinished) {
            Field field = bi5.a;
            bi5.LPt8Fixed.k(this);
        }
    }

    public final void l() {
        if (!this.N || this.U) {
            int i = i95.a;
            i95.QnHx.a("RV FullInvalidate");
            n();
            i95.QnHx.b();
            return;
        }
        if (this.z.g()) {
            this.z.getClass();
            if (this.z.g()) {
                int i2 = i95.a;
                i95.QnHx.a("RV FullInvalidate");
                n();
                i95.QnHx.b();
            }
        }
    }

    public final void m(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = bi5.a;
        setMeasuredDimension(PRnFixed.g(i, paddingRight, bi5.LPt8Fixed.e(this)), PRnFixed.g(i2, getPaddingBottom() + getPaddingTop(), bi5.LPt8Fixed.d(this)));
    }

    /* JADX WARN: Code duplicated, block: B:155:0x030d  */
    /* JADX WARN: Code duplicated, block: B:174:0x034f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0352  */
    /* JADX WARN: Code duplicated, block: B:182:0x0365  */
    /* JADX WARN: Code duplicated, block: B:184:0x036d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0373  */
    /* JADX WARN: Code duplicated, block: B:190:0x037b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0382  */
    /* JADX WARN: Code duplicated, block: B:196:0x038c A[LOOP:4: B:189:0x0379->B:196:0x038c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x0397  */
    /* JADX WARN: Code duplicated, block: B:207:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:246:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03a7 A[ADDED_TO_REGION, EDGE_INSN: B:249:0x03a7->B:206:0x03a7 BREAK  A[LOOP:5: B:198:0x0393->B:252:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.recyclerview.widget.RecyclerView$qc] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void n() {
        long j;
        ?? r9;
        int i;
        int iB;
        int i2;
        int iMin;
        qc qcVarD;
        View view;
        qc qcVarD2;
        View view2;
        int i3;
        View viewFindViewById;
        androidx.recyclerview.widget.CQf cQf;
        boolean z;
        boolean zG;
        if (this.G == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.H == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        Aa aa = this.y0;
        aa.i = false;
        int i4 = 1;
        if (aa.d == 1) {
            o();
            this.H.k0(this);
            p();
        } else {
            androidx.recyclerview.widget.QnHx qnHx = this.z;
            if (!((qnHx.c.isEmpty() || qnHx.b.isEmpty()) ? false : true) && this.H.n == getWidth() && this.H.o == getHeight()) {
                this.H.k0(this);
            } else {
                this.H.k0(this);
                p();
            }
        }
        aa.a(4);
        a0();
        N();
        aa.d = 1;
        boolean z2 = aa.j;
        View view3 = null;
        ta taVar = this.x;
        o_K o_k = this.B;
        if (z2) {
            int iE = this.A.e() - 1;
            while (iE >= 0) {
                qc qcVarH = H(this.A.d(iE));
                if (!qcVarH.o()) {
                    long jF = F(qcVarH);
                    this.g0.getClass();
                    byN.F1 f1 = new byN.F1();
                    f1.a(qcVarH);
                    qc qcVar = (qc) o_k.b.i(jF, null);
                    if (qcVar == null || qcVar.o()) {
                        o_k.a(qcVarH, f1);
                    } else {
                        ok4<qc, o_K.QnHx> ok4Var = o_k.a;
                        o_K.QnHx orDefault = ok4Var.getOrDefault(qcVar, null);
                        boolean z3 = (orDefault == null || (orDefault.a & i4) == 0) ? false : true;
                        o_K.QnHx orDefault2 = ok4Var.getOrDefault(qcVarH, null);
                        boolean z4 = (orDefault2 == null || (i4 & orDefault2.a) == 0) ? false : true;
                        if (z3 && qcVar == qcVarH) {
                            o_k.a(qcVarH, f1);
                        } else {
                            byN.F1 f1B = o_k.b(qcVar, 4);
                            o_k.a(qcVarH, f1);
                            byN.F1 f1B2 = o_k.b(qcVarH, 8);
                            if (f1B == null) {
                                int iE2 = this.A.e();
                                for (int i5 = 0; i5 < iE2; i5++) {
                                    qc qcVarH2 = H(this.A.d(i5));
                                    if (qcVarH2 != qcVarH && F(qcVarH2) == jF) {
                                        LPt8Fixed lPt8 = this.G;
                                        if (lPt8 == null || !lPt8.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + qcVarH2 + " \n View Holder 2:" + qcVarH + x());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + qcVarH2 + " \n View Holder 2:" + qcVarH + x());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + qcVar + " cannot be found but it is necessary for " + qcVarH + x());
                            } else {
                                qcVar.n(false);
                                if (z3) {
                                    e(qcVar);
                                }
                                if (qcVar != qcVarH) {
                                    if (z4) {
                                        e(qcVarH);
                                    }
                                    qcVar.h = qcVarH;
                                    e(qcVar);
                                    taVar.j(qcVar);
                                    qcVarH.n(false);
                                    qcVarH.i = qcVar;
                                }
                                if (this.g0.a(qcVar, qcVarH, f1B, f1B2)) {
                                    Q();
                                }
                            }
                        }
                    }
                }
                iE--;
                i4 = 1;
            }
            ok4<qc, o_K.QnHx> ok4Var2 = o_k.a;
            int i6 = ok4Var2.y;
            while (true) {
                i6--;
                if (i6 < 0) {
                    break;
                }
                qc qcVarI = ok4Var2.i(i6);
                o_K.QnHx qnHxJ = ok4Var2.j(i6);
                int i7 = qnHxJ.a;
                int i8 = i7 & 3;
                F1 f2 = this.N0;
                if (i8 == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.H.d0(qcVarI.a, recyclerView.x);
                } else if ((i7 & 1) != 0) {
                    byN.F1 f3 = qnHxJ.b;
                    if (f3 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.H.d0(qcVarI.a, recyclerView2.x);
                    } else {
                        f2.b(qcVarI, f3, qnHxJ.c);
                    }
                } else if ((i7 & 14) == 14) {
                    f2.a(qcVarI, qnHxJ.b, qnHxJ.c);
                } else if ((i7 & 12) == 12) {
                    byN.F1 f4 = qnHxJ.b;
                    byN.F1 f5 = qnHxJ.c;
                    f2.getClass();
                    qcVarI.n(false);
                    RecyclerView recyclerView3 = RecyclerView.this;
                    if (!recyclerView3.U) {
                        androidx.recyclerview.widget.qc qcVar2 = (androidx.recyclerview.widget.qc) recyclerView3.g0;
                        qcVar2.getClass();
                        int i9 = f4.a;
                        int i10 = f5.a;
                        if (i9 == i10 && f4.b == f5.b) {
                            qcVar2.c(qcVarI);
                            zG = false;
                        } else {
                            zG = qcVar2.g(qcVarI, i9, f4.b, i10, f5.b);
                        }
                        if (zG) {
                            recyclerView3.Q();
                        }
                    } else if (recyclerView3.g0.a(qcVarI, qcVarI, f4, f5)) {
                        recyclerView3.Q();
                    }
                } else if ((i7 & 4) != 0) {
                    f2.b(qcVarI, qnHxJ.b, null);
                } else if ((i7 & 8) != 0) {
                    f2.a(qcVarI, qnHxJ.b, qnHxJ.c);
                }
                qnHxJ.a = 0;
                view3 = null;
                qnHxJ.b = null;
                qnHxJ.c = null;
                o_K.QnHx.d.f(qnHxJ);
            }
        }
        this.H.c0(taVar);
        aa.b = aa.e;
        this.U = false;
        this.V = false;
        aa.j = false;
        aa.k = false;
        this.H.f = false;
        ArrayList<qc> arrayList = taVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        PRnFixed pRn = this.H;
        if (pRn.k) {
            pRn.j = 0;
            pRn.k = false;
            taVar.k();
        }
        this.H.X(aa);
        O(true);
        b0(false);
        o_k.a.clear();
        o_k.b.c();
        int[] iArr = this.G0;
        int i11 = iArr[0];
        int i12 = iArr[1];
        B(iArr);
        if ((iArr[0] == i11 && iArr[1] == i12) ? false : true) {
            s(0, 0);
        }
        if (this.u0 && this.G != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = aa.m;
                if (j == -1) {
                    r9 = view3;
                } else {
                    r9 = view3;
                }
                if (r9 != 0) {
                    cQf = this.A;
                    view = r9.a;
                    if (!cQf.j(view)) {
                        if (this.A.e() > 0) {
                            i = aa.l;
                            if (i == -1) {
                                i = 0;
                            }
                            iB = aa.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    qcVarD2 = D(i2);
                                    if (qcVarD2 != null) {
                                        view2 = qcVarD2.a;
                                        if (view2.hasFocusable()) {
                                            view3 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                iMin = Math.min(iB, i);
                                while (true) {
                                    iMin--;
                                    if (iMin < 0) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.A.e() > 0) {
                        i = aa.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = aa.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                qcVarD2 = D(i2);
                                if (qcVarD2 != null) {
                                    view2 = qcVarD2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i);
                            while (true) {
                                iMin--;
                                if (iMin < 0) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.A.e() > 0) {
                    i = aa.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = aa.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            qcVarD2 = D(i2);
                            if (qcVarD2 != null) {
                                view2 = qcVarD2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i);
                        while (true) {
                            iMin--;
                            if (iMin < 0) {
                                break;
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i3 = aa.n;
                    if (i3 != -1) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            } else if (this.A.j(getFocusedChild())) {
                j = aa.m;
                if (j == -1 && (z = this.G.b) && z) {
                    int iH = this.A.h();
                    int i13 = 0;
                    r9 = view3;
                    while (i13 < iH) {
                        qc qcVarH3 = H(this.A.g(i13));
                        if (qcVarH3 != null && !qcVarH3.i() && qcVarH3.e == j) {
                            if (!this.A.j(qcVarH3.a)) {
                                r9 = qcVarH3;
                                break;
                            }
                            r9 = qcVarH3;
                        }
                        i13++;
                        r9 = r9;
                    }
                } else {
                    r9 = view3;
                }
                if (r9 != 0) {
                    cQf = this.A;
                    view = r9.a;
                    if (!cQf.j(view) && view.hasFocusable()) {
                        view3 = view;
                        break;
                    }
                    if (this.A.e() > 0) {
                        i = aa.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = aa.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                qcVarD2 = D(i2);
                                if (qcVarD2 != null) {
                                    view2 = qcVarD2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            iMin = Math.min(iB, i);
                            while (true) {
                                iMin--;
                                if (iMin < 0 || (qcVarD = D(iMin)) == null) {
                                    break;
                                }
                                view = qcVarD.a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.A.e() > 0) {
                    i = aa.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = aa.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            qcVarD2 = D(i2);
                            if (qcVarD2 != null) {
                                view2 = qcVarD2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        iMin = Math.min(iB, i);
                        while (true) {
                            iMin--;
                            if (iMin < 0) {
                                break;
                            }
                            break;
                            break;
                        }
                    }
                }
                if (view3 != null) {
                    i3 = aa.n;
                    if (i3 != -1 && (viewFindViewById = view3.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            }
        }
        aa.m = -1L;
        aa.l = -1;
        aa.n = -1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void o() {
        int iE;
        View viewZ;
        Aa aa = this.y0;
        aa.a(1);
        y(aa);
        aa.i = false;
        a0();
        o_K o_k = this.B;
        o_k.a.clear();
        o_k.b.c();
        N();
        R();
        View focusedChild = (this.u0 && hasFocus() && this.G != null) ? getFocusedChild() : null;
        qc qcVarG = (focusedChild == null || (viewZ = z(focusedChild)) == null) ? null : G(viewZ);
        if (qcVarG == null) {
            aa.m = -1L;
            aa.l = -1;
            aa.n = -1;
        } else {
            aa.m = this.G.b ? qcVarG.e : -1L;
            if (this.U) {
                iE = -1;
            } else if (qcVarG.i()) {
                iE = qcVarG.d;
            } else {
                RecyclerView recyclerView = qcVarG.r;
                if (recyclerView == null) {
                    iE = -1;
                } else {
                    iE = recyclerView.E(qcVarG);
                }
            }
            aa.l = iE;
            View focusedChild2 = qcVarG.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            aa.n = id;
        }
        aa.h = aa.j && this.C0;
        this.C0 = false;
        this.B0 = false;
        aa.g = aa.k;
        aa.e = this.G.a();
        B(this.G0);
        boolean z = aa.j;
        ok4<qc, o_K.QnHx> ok4Var = o_k.a;
        if (z) {
            int iE2 = this.A.e();
            for (int i = 0; i < iE2; i++) {
                qc qcVarH = H(this.A.d(i));
                if (!qcVarH.o() && (!qcVarH.g() || this.G.b)) {
                    byN byn = this.g0;
                    byN.b(qcVarH);
                    qcVarH.d();
                    byn.getClass();
                    byN.F1 f1 = new byN.F1();
                    f1.a(qcVarH);
                    o_K.QnHx orDefault = ok4Var.getOrDefault(qcVarH, null);
                    if (orDefault == null) {
                        orDefault = o_K.QnHx.a();
                        ok4Var.put(qcVarH, orDefault);
                    }
                    orDefault.b = f1;
                    orDefault.a |= 4;
                    if (aa.h) {
                        if (((qcVarH.j & 2) != 0) && !qcVarH.i() && !qcVarH.o() && !qcVarH.g()) {
                            o_k.b.j(F(qcVarH), qcVarH);
                        }
                    }
                }
            }
        }
        if (aa.k) {
            int iH = this.A.h();
            for (int i2 = 0; i2 < iH; i2++) {
                qc qcVarH2 = H(this.A.g(i2));
                if (!qcVarH2.o() && qcVarH2.d == -1) {
                    qcVarH2.d = qcVarH2.c;
                }
            }
            boolean z2 = aa.f;
            aa.f = false;
            this.H.W(this.x, aa);
            aa.f = z2;
            for (int i3 = 0; i3 < this.A.e(); i3++) {
                qc qcVarH3 = H(this.A.d(i3));
                if (!qcVarH3.o()) {
                    o_K.QnHx orDefault2 = ok4Var.getOrDefault(qcVarH3, null);
                    if (!((orDefault2 == null || (orDefault2.a & 4) == 0) ? false : true)) {
                        byN.b(qcVarH3);
                        boolean z3 = (qcVarH3.j & 8192) != 0;
                        byN byn2 = this.g0;
                        qcVarH3.d();
                        byn2.getClass();
                        byN.F1 f2 = new byN.F1();
                        f2.a(qcVarH3);
                        if (z3) {
                            T(qcVarH3, f2);
                        } else {
                            o_K.QnHx orDefault3 = ok4Var.getOrDefault(qcVarH3, null);
                            if (orDefault3 == null) {
                                orDefault3 = o_K.QnHx.a();
                                ok4Var.put(qcVarH3, orDefault3);
                            }
                            orDefault3.a |= 2;
                            orDefault3.b = f2;
                        }
                    }
                }
            }
            j();
        } else {
            j();
        }
        O(true);
        b0(false);
        aa.d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.W = 0;
        this.L = true;
        this.N = this.N && !isLayoutRequested();
        PRnFixed pRn = this.H;
        if (pRn != null) {
            pRn.g = true;
        }
        this.E0 = false;
        if (Q0) {
            ThreadLocal<androidx.recyclerview.widget.y> threadLocal = androidx.recyclerview.widget.y.A;
            androidx.recyclerview.widget.y yVar = threadLocal.get();
            this.w0 = yVar;
            if (yVar == null) {
                this.w0 = new androidx.recyclerview.widget.y();
                Field field = bi5.a;
                Display displayB = bi5.NUlFixed.b(this);
                if (isInEditMode() || displayB == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayB.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.y yVar2 = this.w0;
                yVar2.y = (long) (1.0E9f / refreshRate);
                threadLocal.set(yVar2);
            }
            this.w0.w.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.recyclerview.widget.y yVar;
        SjP sjP;
        super.onDetachedFromWindow();
        byN byn = this.g0;
        if (byn != null) {
            byn.e();
        }
        setScrollState(0);
        ct ctVar = this.v0;
        RecyclerView.this.removeCallbacks(ctVar);
        ctVar.y.abortAnimation();
        PRnFixed pRn = this.H;
        if (pRn != null && (sjP = pRn.e) != null) {
            sjP.d();
        }
        this.L = false;
        PRnFixed pRn2 = this.H;
        if (pRn2 != null) {
            pRn2.g = false;
            pRn2.M(this);
        }
        this.L0.clear();
        removeCallbacks(this.M0);
        this.B.getClass();
        while (o_K.QnHx.d.a() != null) {
        }
        if (!Q0 || (yVar = this.w0) == null) {
            return;
        }
        yVar.w.remove(this);
        this.w0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<FJCM> arrayList = this.I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).c(canvas, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.H != null && !this.Q && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.H.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.H.d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.H.e()) {
                    f = -axisValue2;
                } else if (this.H.d()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                W((int) (axisValue * this.s0), (int) (f * this.t0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.Q) {
            return false;
        }
        this.K = null;
        if (A(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        PRnFixed pRn = this.H;
        if (pRn == null) {
            return false;
        }
        boolean zD = pRn.d();
        boolean zE = this.H.e();
        if (this.j0 == null) {
            this.j0 = VelocityTracker.obtain();
        }
        this.j0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.R) {
                this.R = false;
            }
            this.i0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.m0 = x;
            this.k0 = x;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.n0 = y2;
            this.l0 = y2;
            if (this.h0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.J0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zD;
            if (zE) {
                i = (zD ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.j0.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.i0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.i0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.h0 != 1) {
                int i2 = x2 - this.k0;
                int i3 = y3 - this.l0;
                if (!zD || Math.abs(i2) <= this.o0) {
                    z = false;
                } else {
                    this.m0 = x2;
                    z = true;
                }
                if (zE && Math.abs(i3) > this.o0) {
                    this.n0 = y3;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            V();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.i0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.m0 = x3;
            this.k0 = x3;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.n0 = y4;
            this.l0 = y4;
        } else if (actionMasked == 6) {
            P(motionEvent);
        }
        return this.h0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i95.a;
        i95.QnHx.a("RV OnLayout");
        n();
        i95.QnHx.b();
        this.N = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        PRnFixed pRn = this.H;
        if (pRn == null) {
            m(i, i2);
            return;
        }
        boolean zH = pRn.H();
        boolean z = false;
        Aa aa = this.y0;
        if (!zH) {
            if (this.M) {
                this.H.b.m(i, i2);
                return;
            }
            if (aa.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            LPt8Fixed lPt8 = this.G;
            if (lPt8 != null) {
                aa.e = lPt8.a();
            } else {
                aa.e = 0;
            }
            a0();
            this.H.b.m(i, i2);
            b0(false);
            aa.g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.H.b.m(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        if (z || this.G == null) {
            return;
        }
        if (aa.d == 1) {
            o();
        }
        this.H.l0(i, i2);
        aa.i = true;
        p();
        this.H.n0(i, i2);
        if (this.H.q0()) {
            this.H.l0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            aa.i = true;
            p();
            this.H.n0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (J()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof ck32)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ck32 ck32Var = (ck32) parcelable;
        this.y = ck32Var;
        super.onRestoreInstanceState(ck32Var.w);
        PRnFixed pRn = this.H;
        if (pRn == null || (parcelable2 = this.y.y) == null) {
            return;
        }
        pRn.Y(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ck32 ck32Var = new ck32(super.onSaveInstanceState());
        ck32 ck32Var2 = this.y;
        if (ck32Var2 != null) {
            ck32Var.y = ck32Var2.y;
        } else {
            PRnFixed pRn = this.H;
            if (pRn != null) {
                ck32Var.y = pRn.Z();
            } else {
                ck32Var.y = null;
            }
        }
        return ck32Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f0 = null;
        this.d0 = null;
        this.e0 = null;
        this.c0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0263  */
    /* JADX WARN: Code duplicated, block: B:172:0x0295  */
    /* JADX WARN: Code duplicated, block: B:234:0x034c  */
    /* JADX WARN: Code duplicated, block: B:256:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:257:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc A[PHI: r0
  0x00fc: PHI (r0v69 int) = (r0v56 int), (r0v73 int) binds: [B:50:0x00e5, B:54:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zA;
        RecyclerView recyclerView;
        int i;
        boolean z;
        MotionEvent motionEvent2;
        boolean z2;
        int minFlingVelocity;
        boolean z3;
        int iD;
        androidx.recyclerview.widget.LPt9Fixed lPt9E;
        PointF pointFA;
        boolean z4;
        boolean z5 = false;
        if (this.Q || this.R) {
            return false;
        }
        MZ mz = this.K;
        if (mz == null) {
            zA = motionEvent.getAction() == 0 ? false : A(motionEvent);
        } else {
            mz.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.K = null;
            }
            zA = true;
        }
        if (zA) {
            V();
            setScrollState(0);
            return true;
        }
        PRnFixed pRn = this.H;
        if (pRn == null) {
            return false;
        }
        boolean zD = pRn.d();
        boolean zE = this.H.e();
        if (this.j0 == null) {
            this.j0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr = this.J0;
        if (actionMasked == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr[0], iArr[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.i0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.i0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax = this.m0 - x;
                    int iMax2 = this.n0 - y2;
                    if (this.h0 != 1) {
                        if (zD) {
                            iMax = iMax > 0 ? Math.max(0, iMax - this.o0) : Math.min(0, iMax + this.o0);
                            if (iMax != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else {
                            z4 = false;
                        }
                        if (zE) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.o0) : Math.min(0, iMax2 + this.o0);
                            if (iMax2 != 0) {
                                z4 = true;
                            }
                        }
                        if (z4) {
                            setScrollState(1);
                        }
                    }
                    int i2 = iMax;
                    int i3 = iMax2;
                    if (this.h0 == 1) {
                        int[] iArr2 = this.K0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        boolean zQ = q(zD ? i2 : 0, zE ? i3 : 0, 0, iArr2, this.I0);
                        int[] iArr3 = this.I0;
                        if (zQ) {
                            i2 -= iArr2[0];
                            i3 -= iArr2[1];
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i4 = i2;
                        int i5 = i3;
                        this.m0 = x - iArr3[0];
                        this.n0 = y2 - iArr3[1];
                        if (W(zD ? i4 : 0, zE ? i5 : 0, motionEvent)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        androidx.recyclerview.widget.y yVar = this.w0;
                        if (yVar != null && (i4 != 0 || i5 != 0)) {
                            yVar.a(this, i4, i5);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.i0 = motionEvent.getPointerId(actionIndex);
                    int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.m0 = x2;
                    this.k0 = x2;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.n0 = y3;
                    this.l0 = y3;
                } else if (actionMasked == 6) {
                    P(motionEvent);
                }
                recyclerView = this;
            } else {
                this.j0.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.j0;
                int i6 = this.r0;
                velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, i6);
                float f = zD ? -this.j0.getXVelocity(this.i0) : 0.0f;
                float f2 = zE ? -this.j0.getYVelocity(this.i0) : 0.0f;
                if (f == 0.0f && f2 == 0.0f) {
                    recyclerView = this;
                    motionEventObtain = motionEventObtain;
                } else {
                    int i7 = (int) f;
                    int i8 = (int) f2;
                    PRnFixed pRn2 = this.H;
                    if (pRn2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
                        if (!this.Q) {
                            int iD2 = pRn2.d();
                            boolean zE2 = this.H.e();
                            int i9 = this.q0;
                            if (iD2 == 0 || Math.abs(i7) < i9) {
                                i7 = 0;
                            }
                            if (!zE2 || Math.abs(i8) < i9) {
                                i8 = 0;
                            }
                            if (i7 != 0 || i8 != 0) {
                                float f3 = i7;
                                float f4 = i8;
                                if (dispatchNestedPreFling(f3, f4)) {
                                    recyclerView = this;
                                    motionEventObtain = motionEventObtain;
                                } else {
                                    boolean z6 = iD2 != 0 || zE2;
                                    dispatchNestedFling(f3, f4, z6);
                                    RBi rBi = this.p0;
                                    if (rBi != null) {
                                        Z z7 = (Z) rBi;
                                        PRnFixed layoutManager = z7.a.getLayoutManager();
                                        if (layoutManager == 0 || z7.a.getAdapter() == null || (Math.abs(i8) <= (minFlingVelocity = z7.a.getMinFlingVelocity()) && Math.abs(i7) <= minFlingVelocity)) {
                                            motionEventObtain = motionEventObtain;
                                        } else {
                                            boolean z8 = layoutManager instanceof SjP.CQf;
                                            if (z8) {
                                                androidx.recyclerview.widget.ck32 ck32Var = (androidx.recyclerview.widget.ck32) z7;
                                                androidx.recyclerview.widget.lPt3Fixed lpt3 = !z8 ? null : new androidx.recyclerview.widget.lPt3Fixed(ck32Var, ck32Var.a.getContext());
                                                if (lpt3 == null) {
                                                    motionEventObtain = motionEventObtain;
                                                } else {
                                                    RecyclerView recyclerView2 = layoutManager.b;
                                                    LPt8Fixed adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
                                                    int iA = adapter != null ? adapter.a() : 0;
                                                    if (iA != 0) {
                                                        if (layoutManager.e()) {
                                                            lPt9E = ck32Var.f(layoutManager);
                                                        } else {
                                                            lPt9E = layoutManager.d() ? ck32Var.e(layoutManager) : null;
                                                        }
                                                        if (lPt9E == null) {
                                                            motionEventObtain = motionEventObtain;
                                                        } else {
                                                            int iV = layoutManager.v();
                                                            motionEventObtain = motionEventObtain;
                                                            int i10 = 0;
                                                            int i11 = Integer.MIN_VALUE;
                                                            int i12 = Integer.MAX_VALUE;
                                                            View view = null;
                                                            View view2 = null;
                                                            while (i10 < iV) {
                                                                int i13 = iV;
                                                                View viewU = layoutManager.u(i10);
                                                                if (viewU != null) {
                                                                    int iC = androidx.recyclerview.widget.ck32.c(viewU, lPt9E);
                                                                    if (iC <= 0 && iC > i11) {
                                                                        view2 = viewU;
                                                                        i11 = iC;
                                                                    }
                                                                    if (iC >= 0 && iC < i12) {
                                                                        view = viewU;
                                                                        i12 = iC;
                                                                    }
                                                                }
                                                                i10++;
                                                                iV = i13;
                                                            }
                                                            boolean z9 = !layoutManager.d() ? i8 <= 0 : i7 <= 0;
                                                            if (z9 && view != null) {
                                                                iD = PRnFixed.D(view);
                                                            } else if (z9 || view2 == null) {
                                                                if (z9) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    int iD3 = PRnFixed.D(view);
                                                                    RecyclerView recyclerView3 = layoutManager.b;
                                                                    LPt8Fixed adapter2 = recyclerView3 != null ? recyclerView3.getAdapter() : null;
                                                                    iD = ((z8 && (pointFA = ((SjP.CQf) layoutManager).a((adapter2 != null ? adapter2.a() : 0) - 1)) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == z9 ? -1 : 1) + iD3;
                                                                    if (iD < 0 || iD >= iA) {
                                                                    }
                                                                }
                                                            } else {
                                                                iD = PRnFixed.D(view2);
                                                            }
                                                        }
                                                        iD = -1;
                                                    } else {
                                                        motionEventObtain = motionEventObtain;
                                                        iD = -1;
                                                    }
                                                    if (iD != -1) {
                                                        lpt3.a = iD;
                                                        layoutManager.t0(lpt3);
                                                        z3 = true;
                                                    }
                                                }
                                                z3 = false;
                                            } else {
                                                motionEventObtain = motionEventObtain;
                                                z3 = false;
                                            }
                                            z2 = z3;
                                            if (z2) {
                                                z5 = true;
                                                recyclerView = this;
                                            }
                                        }
                                        if (z2) {
                                            z5 = true;
                                            recyclerView = this;
                                        }
                                    } else {
                                        motionEventObtain = motionEventObtain;
                                    }
                                    if (z6) {
                                        if (zE2) {
                                            iD2 = (iD2 == true ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(iD2, 1);
                                        int i14 = -i6;
                                        int iMax3 = Math.max(i14, Math.min(i7, i6));
                                        int iMax4 = Math.max(i14, Math.min(i8, i6));
                                        recyclerView = this;
                                        ct ctVar = recyclerView.v0;
                                        RecyclerView recyclerView4 = RecyclerView.this;
                                        recyclerView4.setScrollState(2);
                                        ctVar.x = 0;
                                        ctVar.w = 0;
                                        Interpolator interpolator = ctVar.z;
                                        CQf cQf = S0;
                                        if (interpolator != cQf) {
                                            ctVar.z = cQf;
                                            ctVar.y = new OverScroller(recyclerView4.getContext(), cQf);
                                        }
                                        ctVar.y.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        ctVar.a();
                                        z5 = true;
                                    } else {
                                        recyclerView = this;
                                    }
                                }
                                z5 = false;
                            }
                        }
                        if (!z5) {
                        }
                        V();
                        z = true;
                    }
                    recyclerView = this;
                    motionEventObtain = motionEventObtain;
                    if (!z5) {
                    }
                    V();
                    z = true;
                }
                recyclerView.setScrollState(0);
                V();
                z = true;
            }
            if (z) {
                motionEvent2 = motionEventObtain;
            } else {
                motionEvent2 = motionEventObtain;
                recyclerView.j0.addMovement(motionEvent2);
            }
            motionEvent2.recycle();
            return true;
        }
        recyclerView = this;
        recyclerView.i0 = motionEvent.getPointerId(0);
        int x3 = (int) (motionEvent.getX() + 0.5f);
        recyclerView.m0 = x3;
        recyclerView.k0 = x3;
        int y4 = (int) (motionEvent.getY() + 0.5f);
        recyclerView.n0 = y4;
        recyclerView.l0 = y4;
        if (zE) {
            i = zD;
            i = (zD ? 1 : 0) | 2;
        }
        i = zD;
        getScrollingChildHelper().g(i, 0);
        z = false;
        if (z) {
            motionEvent2 = motionEventObtain;
            recyclerView.j0.addMovement(motionEvent2);
        } else {
            motionEvent2 = motionEventObtain;
        }
        motionEvent2.recycle();
        return true;
    }

    public final void p() {
        a0();
        N();
        Aa aa = this.y0;
        aa.a(6);
        this.z.c();
        aa.e = this.G.a();
        aa.c = 0;
        aa.g = false;
        this.H.W(this.x, aa);
        aa.f = false;
        this.y = null;
        aa.j = aa.j && this.g0 != null;
        aa.d = 4;
        O(true);
        b0(false);
    }

    public final boolean q(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void r(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        qc qcVarH = H(view);
        if (qcVarH != null) {
            if (qcVarH.k()) {
                qcVarH.j &= -257;
            } else if (!qcVarH.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + qcVarH + x());
            }
        }
        view.clearAnimation();
        H(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        SjP sjP = this.H.e;
        boolean z = true;
        if (!(sjP != null && sjP.e) && !J()) {
            z = false;
        }
        if (!z && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.H.f0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList<MZ> arrayList = this.J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O != 0 || this.Q) {
            this.P = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2) {
        this.a0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        LPt6Fixed lPt6 = this.z0;
        if (lPt6 != null) {
            lPt6.b(this, i, i2);
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((LPt6Fixed) this.A0.get(size)).b(this, i, i2);
                }
            }
        }
        this.a0--;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        PRnFixed pRn = this.H;
        if (pRn == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.Q) {
            return;
        }
        boolean zD = pRn.d();
        boolean zE = this.H.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i2 = 0;
            }
            W(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (J()) {
            int iA = accessibilityEvent != null ? F.a(accessibilityEvent) : 0;
            this.S |= iA != 0 ? iA : 0;
            i = 1;
        }
        if (i != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.WE we) {
        this.F0 = we;
        bi5.m(this, we);
    }

    public void setAdapter(LPt8Fixed lPt8) {
        setLayoutFrozen(false);
        LPt8Fixed lPt9 = this.G;
        lPt3Fixed lpt3 = this.w;
        if (lPt9 != null) {
            lPt9.a.unregisterObserver(lpt3);
            this.G.getClass();
        }
        byN byn = this.g0;
        if (byn != null) {
            byn.e();
        }
        PRnFixed pRn = this.H;
        ta taVar = this.x;
        if (pRn != null) {
            pRn.b0(taVar);
            this.H.c0(taVar);
        }
        taVar.a.clear();
        taVar.d();
        androidx.recyclerview.widget.QnHx qnHx = this.z;
        qnHx.l(qnHx.b);
        qnHx.l(qnHx.c);
        LPt8Fixed lPt10 = this.G;
        this.G = lPt8;
        if (lPt8 != null) {
            lPt8.a.registerObserver(lpt3);
        }
        LPt8Fixed lPt11 = this.G;
        taVar.a.clear();
        taVar.d();
        Xn1 xn1C = taVar.c();
        if (lPt10 != null) {
            xn1C.b--;
        }
        if (xn1C.b == 0) {
            int i = 0;
            while (true) {
                SparseArray<Xn1.QnHx> sparseArray = xn1C.a;
                if (i >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i).a.clear();
                i++;
            }
        }
        if (lPt11 != null) {
            xn1C.b++;
        }
        this.y0.f = true;
        S(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(auxFixed auxVar) {
        if (auxVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.C) {
            this.f0 = null;
            this.d0 = null;
            this.e0 = null;
            this.c0 = null;
        }
        this.C = z;
        super.setClipToPadding(z);
        if (this.N) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(T23 t23) {
        t23.getClass();
        this.b0 = t23;
        this.f0 = null;
        this.d0 = null;
        this.e0 = null;
        this.c0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.M = z;
    }

    public void setItemAnimator(byN byn) {
        byN byn2 = this.g0;
        if (byn2 != null) {
            byn2.e();
            this.g0.a = null;
        }
        this.g0 = byn;
        if (byn != null) {
            byn.a = this.D0;
        }
    }

    public void setItemViewCacheSize(int i) {
        ta taVar = this.x;
        taVar.e = i;
        taVar.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(PRnFixed pRn) {
        androidx.recyclerview.widget.CQf.InterfaceC0028CQf interfaceC0028CQf;
        RecyclerView recyclerView;
        SjP sjP;
        if (pRn == this.H) {
            return;
        }
        int i = 0;
        setScrollState(0);
        ct ctVar = this.v0;
        RecyclerView.this.removeCallbacks(ctVar);
        ctVar.y.abortAnimation();
        PRnFixed pRn2 = this.H;
        if (pRn2 != null && (sjP = pRn2.e) != null) {
            sjP.d();
        }
        PRnFixed pRn3 = this.H;
        ta taVar = this.x;
        if (pRn3 != null) {
            byN byn = this.g0;
            if (byn != null) {
                byn.e();
            }
            this.H.b0(taVar);
            this.H.c0(taVar);
            taVar.a.clear();
            taVar.d();
            if (this.L) {
                PRnFixed pRn4 = this.H;
                pRn4.g = false;
                pRn4.M(this);
            }
            this.H.o0(null);
            this.H = null;
        } else {
            taVar.a.clear();
            taVar.d();
        }
        androidx.recyclerview.widget.CQf cQf = this.A;
        cQf.b.g();
        ArrayList arrayList = cQf.c;
        int size = arrayList.size();
        while (true) {
            size--;
            interfaceC0028CQf = cQf.a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            androidx.recyclerview.widget.SjP sjP2 = (androidx.recyclerview.widget.SjP) interfaceC0028CQf;
            sjP2.getClass();
            qc qcVarH = H(view);
            if (qcVarH != null) {
                int i2 = qcVarH.p;
                RecyclerView recyclerView2 = sjP2.a;
                if (recyclerView2.J()) {
                    qcVarH.q = i2;
                    recyclerView2.L0.add(qcVarH);
                } else {
                    Field field = bi5.a;
                    bi5.LPt8Fixed.s(qcVarH.a, i2);
                }
                qcVarH.p = 0;
            }
            arrayList.remove(size);
        }
        androidx.recyclerview.widget.SjP sjP3 = (androidx.recyclerview.widget.SjP) interfaceC0028CQf;
        int iA = sjP3.a();
        while (true) {
            recyclerView = sjP3.a;
            if (i >= iA) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getClass();
            H(childAt);
            LPt8Fixed lPt8 = recyclerView.G;
            childAt.clearAnimation();
            i++;
        }
        recyclerView.removeAllViews();
        this.H = pRn;
        if (pRn != null) {
            if (pRn.b != null) {
                throw new IllegalArgumentException("LayoutManager " + pRn + " is already attached to a RecyclerView:" + pRn.b.x());
            }
            pRn.o0(this);
            if (this.L) {
                this.H.g = true;
            }
        }
        taVar.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        sm2 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            Field field = bi5.a;
            bi5.byN.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(RBi rBi) {
        this.p0 = rBi;
    }

    @Deprecated
    public void setOnScrollListener(LPt6Fixed lPt6) {
        this.z0 = lPt6;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.u0 = z;
    }

    public void setRecycledViewPool(Xn1 xn1) {
        ta taVar = this.x;
        Xn1 xn2 = taVar.g;
        if (xn2 != null) {
            xn2.b--;
        }
        taVar.g = xn1;
        if (xn1 == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        taVar.g.b++;
    }

    public void setRecyclerListener(LPt9Fixed lPt9) {
    }

    public void setScrollState(int i) {
        SjP sjP;
        if (i == this.h0) {
            return;
        }
        this.h0 = i;
        if (i != 2) {
            ct ctVar = this.v0;
            RecyclerView.this.removeCallbacks(ctVar);
            ctVar.y.abortAnimation();
            PRnFixed pRn = this.H;
            if (pRn != null && (sjP = pRn.e) != null) {
                sjP.d();
            }
        }
        PRnFixed pRn2 = this.H;
        if (pRn2 != null) {
            pRn2.a0(i);
        }
        LPt6Fixed lPt6 = this.z0;
        if (lPt6 != null) {
            lPt6.a(this, i);
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((LPt6Fixed) this.A0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.o0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.o0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(WE we) {
        this.x.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        SjP sjP;
        if (z != this.Q) {
            h("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.Q = false;
                if (this.P && this.H != null && this.G != null) {
                    requestLayout();
                }
                this.P = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.Q = true;
            this.R = true;
            setScrollState(0);
            ct ctVar = this.v0;
            RecyclerView.this.removeCallbacks(ctVar);
            ctVar.y.abortAnimation();
            PRnFixed pRn = this.H;
            if (pRn == null || (sjP = pRn.e) == null) {
                return;
            }
            sjP.d();
        }
    }

    public final void t() {
        if (this.f0 != null) {
            return;
        }
        this.b0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f0 = edgeEffect;
        if (this.C) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void u() {
        if (this.c0 != null) {
            return;
        }
        this.b0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.c0 = edgeEffect;
        if (this.C) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.e0 != null) {
            return;
        }
        this.b0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.e0 = edgeEffect;
        if (this.C) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.d0 != null) {
            return;
        }
        this.b0.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.d0 = edgeEffect;
        if (this.C) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String x() {
        return " " + super.toString() + ", adapter:" + this.G + ", layout:" + this.H + ", context:" + getContext();
    }

    public final void y(Aa aa) {
        if (getScrollState() != 2) {
            aa.getClass();
            return;
        }
        OverScroller overScroller = this.v0.y;
        overScroller.getFinalX();
        overScroller.getCurrX();
        aa.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View z(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        int i2;
        char c;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.w = new lPt3Fixed();
        this.x = new ta();
        this.B = new o_K();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new RectF();
        this.I = new ArrayList<>();
        this.J = new ArrayList<>();
        this.O = 0;
        this.U = false;
        this.V = false;
        this.W = 0;
        this.a0 = 0;
        this.b0 = new T23();
        this.g0 = new androidx.recyclerview.widget.FJCM();
        this.h0 = 0;
        this.i0 = -1;
        this.s0 = Float.MIN_VALUE;
        this.t0 = Float.MIN_VALUE;
        this.u0 = true;
        this.v0 = new ct();
        this.x0 = Q0 ? new androidx.recyclerview.widget.y.CQf() : null;
        this.y0 = new Aa();
        this.B0 = false;
        this.C0 = false;
        EQ eq = new EQ();
        this.D0 = eq;
        this.E0 = false;
        this.G0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new ArrayList();
        this.M0 = new QnHx();
        this.N0 = new F1();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o0 = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = wi5.a;
            fA = wi5.QnHx.a(viewConfiguration);
        } else {
            fA = wi5.a(viewConfiguration, context);
        }
        this.s0 = fA;
        this.t0 = i3 >= 26 ? wi5.QnHx.b(viewConfiguration) : wi5.a(viewConfiguration, context);
        this.q0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.g0.a = eq;
        this.z = new androidx.recyclerview.widget.QnHx(new androidx.recyclerview.widget.Aa(this));
        this.A = new androidx.recyclerview.widget.CQf(new androidx.recyclerview.widget.SjP(this));
        Field field = bi5.a;
        if ((i3 >= 26 ? bi5.FJCM.b(this) : 0) == 0 && i3 >= 26) {
            bi5.FJCM.l(this, 8);
        }
        if (bi5.LPt8Fixed.c(this) == 0) {
            bi5.LPt8Fixed.s(this, 1);
        }
        this.T = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.WE(this));
        int[] iArr = iE.w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i3 >= 29) {
            i2 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        } else {
            i2 = 8;
        }
        String string = typedArrayObtainStyledAttributes.getString(i2);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.C = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + x());
            }
            Resources resources = getContext().getResources();
            c = 2;
            new androidx.recyclerview.widget.PRnFixed(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.azefsw.audioconnect.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.azefsw.audioconnect.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.azefsw.audioconnect.R.dimen.fastscroll_margin));
        } else {
            c = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(PRnFixed.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(R0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c] = Integer.valueOf(i);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((PRnFixed) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        int[] iArr2 = O0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        if (i4 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        }
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    public static class ck32 extends defpackage.CQf {
        public static final Parcelable.Creator<ck32> CREATOR = new QnHx();
        public Parcelable y;

        public static class QnHx implements Parcelable.ClassLoaderCreator<ck32> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final ck32 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ck32(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ck32[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new ck32(parcel, null);
            }
        }

        public ck32(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.y = parcel.readParcelable(classLoader == null ? PRnFixed.class.getClassLoader() : classLoader);
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            parcel.writeParcelable(this.y, 0);
        }

        public ck32(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class y extends ViewGroup.MarginLayoutParams {
        public qc a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public y(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public final int a() {
            return this.a.c();
        }

        public final boolean b() {
            return (this.a.j & 2) != 0;
        }

        public final boolean c() {
            return this.a.i();
        }

        public y(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public y(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public y(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public y(y yVar) {
            super((ViewGroup.LayoutParams) yVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        PRnFixed pRn = this.H;
        if (pRn != null) {
            return pRn.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + x());
    }
}
