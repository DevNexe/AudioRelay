package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.azefsw.audioconnect.R;
import defpackage.JUCk;
import defpackage.b70;
import defpackage.bi5;
import defpackage.cj5;
import defpackage.cl0;
import defpackage.gu2;
import defpackage.jm5;
import defpackage.ok4;
import defpackage.r80;
import defpackage.tm2;
import defpackage.um2;
import defpackage.uo0;
import defpackage.uq2;
import defpackage.va1;
import defpackage.vm2;
import defpackage.y93;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements tm2, um2 {
    public static final String P;
    public static final Class<?>[] Q;
    public static final ThreadLocal<Map<String, Constructor<F1>>> R;
    public static final byN S;
    public static final y93 T;
    public final int[] A;
    public final int[] B;
    public boolean C;
    public boolean D;
    public final int[] E;
    public View F;
    public View G;
    public auxFixed H;
    public boolean I;
    public jm5 J;
    public boolean K;
    public Drawable L;
    public ViewGroup.OnHierarchyChangeListener M;
    public QnHx N;
    public final vm2 O;
    public final ArrayList w;
    public final cl0 x;
    public final ArrayList y;
    public final ArrayList z;

    public interface CQf {
        F1 getBehavior();
    }

    public static abstract class F1<V extends View> {
        public F1() {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(YKK ykk) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            iArr[0] = iArr[0] + i2;
            iArr[1] = iArr[1] + i3;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public F1(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface LPt8Fixed {
        Class<? extends F1> value();
    }

    public class NUlFixed implements ViewGroup.OnHierarchyChangeListener {
        public NUlFixed() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.M;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.M;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class QnHx implements gu2 {
        public QnHx() {
        }

        @Override // defpackage.gu2
        public final jm5 a(View view, jm5 jm5Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!uq2.a(coordinatorLayout.J, jm5Var)) {
                coordinatorLayout.J = jm5Var;
                boolean z = jm5Var.d() > 0;
                coordinatorLayout.K = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                jm5.FJCM fjcm = jm5Var.a;
                if (!fjcm.j()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        Field field = bi5.a;
                        if (bi5.LPt8Fixed.b(childAt) && ((YKK) childAt.getLayoutParams()).a != null && fjcm.j()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return jm5Var;
        }
    }

    public class auxFixed implements ViewTreeObserver.OnPreDrawListener {
        public auxFixed() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.p(0);
            return true;
        }
    }

    public static class byN implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            Field field = bi5.a;
            float fM = bi5.byN.m(view);
            float fM2 = bi5.byN.m(view2);
            if (fM > fM2) {
                return -1;
            }
            return fM < fM2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        P = r0 != null ? r0.getName() : null;
        S = new byN();
        Q = new Class[]{Context.class, AttributeSet.class};
        R = new ThreadLocal<>();
        T = new y93();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.w = new ArrayList();
        this.x = new cl0();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new int[2];
        this.B = new int[2];
        this.O = new vm2();
        int[] iArr = JUCk.c;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.E = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.E;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.L = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new NUlFixed());
        Field field = bi5.a;
        if (bi5.LPt8Fixed.c(this) == 0) {
            bi5.LPt8Fixed.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) T.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, YKK ykk, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = ykk.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = ykk.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static YKK n(View view) {
        YKK ykk = (YKK) view.getLayoutParams();
        if (!ykk.b) {
            if (view instanceof CQf) {
                F1 behavior = ((CQf) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                F1 f1 = ykk.a;
                if (f1 != behavior) {
                    if (f1 != null) {
                        f1.f();
                    }
                    ykk.a = behavior;
                    ykk.b = true;
                    if (behavior != null) {
                        behavior.c(ykk);
                    }
                }
                ykk.b = true;
            } else {
                LPt8Fixed lPt8 = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    lPt8 = (LPt8Fixed) superclass.getAnnotation(LPt8Fixed.class);
                    if (lPt8 != null) {
                        break;
                    }
                }
                if (lPt8 != null) {
                    try {
                        F1 f1NewInstance = lPt8.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        F1 f2 = ykk.a;
                        if (f2 != f1NewInstance) {
                            if (f2 != null) {
                                f2.f();
                            }
                            ykk.a = f1NewInstance;
                            ykk.b = true;
                            if (f1NewInstance != null) {
                                f1NewInstance.c(ykk);
                            }
                        }
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + lPt8.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                ykk.b = true;
            }
        }
        return ykk;
    }

    public static void v(View view, int i) {
        YKK ykk = (YKK) view.getLayoutParams();
        int i2 = ykk.i;
        if (i2 != i) {
            bi5.g(view, i - i2);
            ykk.i = i;
        }
    }

    public static void w(View view, int i) {
        YKK ykk = (YKK) view.getLayoutParams();
        int i2 = ykk.j;
        if (i2 != i) {
            bi5.h(view, i - i2);
            ykk.j = i;
        }
    }

    @Override // defpackage.um2
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        F1 f1;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                YKK ykk = (YKK) childAt.getLayoutParams();
                if (ykk.a(i5) && (f1 = ykk.a) != null) {
                    int[] iArr2 = this.A;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f1.l(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // defpackage.tm2
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        b(view, i, i2, i3, i4, 0, this.B);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof YKK) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.tm2
    public final boolean d(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                YKK ykk = (YKK) childAt.getLayoutParams();
                F1 f1 = ykk.a;
                if (f1 != null) {
                    boolean zP = f1.p(this, childAt, view, view2, i, i2);
                    z |= zP;
                    if (i2 == 0) {
                        ykk.n = zP;
                    } else if (i2 == 1) {
                        ykk.o = zP;
                    }
                } else if (i2 == 0) {
                    ykk.n = false;
                } else if (i2 == 1) {
                    ykk.o = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        F1 f1 = ((YKK) view.getLayoutParams()).a;
        if (f1 != null) {
            f1.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.L;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // defpackage.tm2
    public final void e(View view, View view2, int i, int i2) {
        vm2 vm2Var = this.O;
        if (i2 == 1) {
            vm2Var.b = i;
        } else {
            vm2Var.a = i;
        }
        this.G = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((YKK) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.tm2
    public final void f(View view, int i) {
        vm2 vm2Var = this.O;
        if (i == 1) {
            vm2Var.b = 0;
        } else {
            vm2Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            YKK ykk = (YKK) childAt.getLayoutParams();
            if (ykk.a(i)) {
                F1 f1 = ykk.a;
                if (f1 != null) {
                    f1.q(this, childAt, view, i);
                }
                if (i == 0) {
                    ykk.n = false;
                } else if (i == 1) {
                    ykk.o = false;
                }
                ykk.p = false;
            }
        }
        this.G = null;
    }

    @Override // defpackage.tm2
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        F1 f1;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                YKK ykk = (YKK) childAt.getLayoutParams();
                if (ykk.a(i3) && (f1 = ykk.a) != null) {
                    int[] iArr2 = this.A;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f1.k(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.A;
                    iMax = i > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr3[1]) : Math.min(iMax2, iArr3[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new YKK();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new YKK(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.w);
    }

    public final jm5 getLastWindowInsets() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vm2 vm2Var = this.O;
        return vm2Var.b | vm2Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.L;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(YKK ykk, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ykk).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) ykk).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ykk).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) ykk).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        cl0 cl0Var = this.x;
        int i = ((ok4) cl0Var.b).y;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((ok4) cl0Var.b).k(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((ok4) cl0Var.b).i(i2));
            }
        }
        ArrayList arrayList3 = this.z;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = cj5.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = cj5.a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        cj5.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = cj5.b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.E;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        y93 y93Var = T;
        Rect rectA = a();
        k(view, rectA);
        try {
            return rectA.contains(i, i2);
        } finally {
            rectA.setEmpty();
            y93Var.f(rectA);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.I) {
            if (this.H == null) {
                this.H = new auxFixed();
            }
            getViewTreeObserver().addOnPreDrawListener(this.H);
        }
        if (this.J == null) {
            Field field = bi5.a;
            if (bi5.LPt8Fixed.b(this)) {
                bi5.T23.c(this);
            }
        }
        this.D = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.I && this.H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.H);
        }
        View view = this.G;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.D = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.K || this.L == null) {
            return;
        }
        jm5 jm5Var = this.J;
        int iD = jm5Var != null ? jm5Var.d() : 0;
        if (iD > 0) {
            this.L.setBounds(0, 0, getWidth(), iD);
            this.L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean zS = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        F1 f1;
        Field field = bi5.a;
        int iD = bi5.NUlFixed.d(this);
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((f1 = ((YKK) view.getLayoutParams()).a) == null || !f1.h(this, view, iD))) {
                q(view, iD);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x019a  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        F1 f1;
        int i5;
        ArrayList arrayList;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        t();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i13);
            cl0 cl0Var = this.x;
            int i14 = ((ok4) cl0Var.b).y;
            int i15 = 0;
            while (true) {
                if (i15 < i14) {
                    ArrayList arrayList2 = (ArrayList) ((ok4) cl0Var.b).k(i15);
                    if (arrayList2 != null && arrayList2.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i15++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i13++;
        }
        if (z != this.I) {
            if (z) {
                if (this.D) {
                    if (this.H == null) {
                        this.H = new auxFixed();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.H);
                }
                this.I = true;
            } else {
                if (this.D && this.H != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.H);
                }
                this.I = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Field field = bi5.a;
        int iD = bi5.NUlFixed.d(this);
        boolean z3 = iD == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.J != null && bi5.LPt8Fixed.b(this);
        ArrayList arrayList3 = this.w;
        int size3 = arrayList3.size();
        int i18 = suggestedMinimumWidth;
        int i19 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i20 = 0;
        while (i20 < size3) {
            View view = (View) arrayList3.get(i20);
            int i21 = iCombineMeasuredStates;
            if (view.getVisibility() == 8) {
                i5 = size3;
                arrayList = arrayList3;
                i8 = paddingLeft;
                i11 = paddingRight;
                i6 = iD;
                iCombineMeasuredStates = i21;
                i10 = i20;
            } else {
                YKK ykk = (YKK) view.getLayoutParams();
                int i22 = ykk.e;
                if (i22 < 0 || mode == 0) {
                    i3 = i20;
                    i4 = i19;
                } else {
                    int iM = m(i22);
                    i3 = i20;
                    int i23 = ykk.c;
                    if (i23 == 0) {
                        i23 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, iD) & 7;
                    i4 = i19;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    } else if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                        iMax = Math.max(0, iM - paddingLeft);
                    }
                    if (z4 || bi5.LPt8Fixed.b(view)) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        int iC = this.J.c() + this.J.b();
                        int iA = this.J.a() + this.J.d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                    }
                    f1 = ykk.a;
                    if (f1 != null) {
                        i10 = i3;
                        i8 = paddingLeft;
                        i9 = i21;
                        int i24 = i4;
                        i11 = paddingRight;
                        i12 = i24;
                        i6 = iD;
                        i7 = i18;
                        i5 = size3;
                        arrayList = arrayList3;
                        if (!f1.i(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                        }
                        int iMax2 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) ykk).leftMargin + ((ViewGroup.MarginLayoutParams) ykk).rightMargin);
                        int iMax3 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) ykk).topMargin + ((ViewGroup.MarginLayoutParams) ykk).bottomMargin);
                        i18 = iMax2;
                        iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                        i19 = iMax3;
                    } else {
                        i5 = size3;
                        arrayList = arrayList3;
                        i6 = iD;
                        i7 = i18;
                        int i25 = i3;
                        i8 = paddingLeft;
                        i9 = i21;
                        i10 = i25;
                        int i26 = i4;
                        i11 = paddingRight;
                        i12 = i26;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    int iMax4 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) ykk).leftMargin + ((ViewGroup.MarginLayoutParams) ykk).rightMargin);
                    int iMax5 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) ykk).topMargin + ((ViewGroup.MarginLayoutParams) ykk).bottomMargin);
                    i18 = iMax4;
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i19 = iMax5;
                }
                iMax = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                f1 = ykk.a;
                if (f1 != null) {
                    i10 = i3;
                    i8 = paddingLeft;
                    i9 = i21;
                    int i27 = i4;
                    i11 = paddingRight;
                    i12 = i27;
                    i6 = iD;
                    i7 = i18;
                    i5 = size3;
                    arrayList = arrayList3;
                    if (!f1.i(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2)) {
                    }
                    int iMax6 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) ykk).leftMargin + ((ViewGroup.MarginLayoutParams) ykk).rightMargin);
                    int iMax7 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) ykk).topMargin + ((ViewGroup.MarginLayoutParams) ykk).bottomMargin);
                    i18 = iMax6;
                    iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                    i19 = iMax7;
                } else {
                    i5 = size3;
                    arrayList = arrayList3;
                    i6 = iD;
                    i7 = i18;
                    int i28 = i3;
                    i8 = paddingLeft;
                    i9 = i21;
                    i10 = i28;
                    int i29 = i4;
                    i11 = paddingRight;
                    i12 = i29;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                int iMax8 = Math.max(i7, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) ykk).leftMargin + ((ViewGroup.MarginLayoutParams) ykk).rightMargin);
                int iMax9 = Math.max(i12, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) ykk).topMargin + ((ViewGroup.MarginLayoutParams) ykk).bottomMargin);
                i18 = iMax8;
                iCombineMeasuredStates = View.combineMeasuredStates(i9, view.getMeasuredState());
                i19 = iMax9;
            }
            i20 = i10 + 1;
            paddingLeft = i8;
            paddingRight = i11;
            iD = i6;
            size3 = i5;
            arrayList3 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i18, i, (-16777216) & i30), View.resolveSizeAndState(i19, i2, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                YKK ykk = (YKK) childAt.getLayoutParams();
                if (ykk.a(0)) {
                    F1 f1 = ykk.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        F1 f1;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                YKK ykk = (YKK) childAt.getLayoutParams();
                if (ykk.a(0) && (f1 = ykk.a) != null) {
                    zJ |= f1.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        g(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        c(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof T23)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T23 t23 = (T23) parcelable;
        super.onRestoreInstanceState(t23.w);
        SparseArray<Parcelable> sparseArray = t23.y;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            F1 f1 = n(childAt).a;
            if (id != -1 && f1 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f1.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableO;
        T23 t23 = new T23(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            F1 f1 = ((YKK) childAt.getLayoutParams()).a;
            if (id != -1 && f1 != null && (parcelableO = f1.o(childAt)) != null) {
                sparseArray.append(id, parcelableO);
            }
        }
        t23.y = sparseArray;
        return t23;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        f(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[PHI: r3
  0x0029: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:9:0x0020, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zS;
        boolean zR;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.F == null) {
            zS = s(motionEvent, 1);
            if (!zS) {
                zR = false;
            }
            motionEventObtain = null;
            if (this.F == null) {
                zR |= super.onTouchEvent(motionEvent);
            } else if (zS) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                u(false);
            }
            return zR;
        }
        zS = false;
        F1 f1 = ((YKK) this.F.getLayoutParams()).a;
        if (f1 != null) {
            zR = f1.r(this, this.F, motionEvent);
        } else {
            zR = false;
        }
        motionEventObtain = null;
        if (this.F == null) {
            zR |= super.onTouchEvent(motionEvent);
        } else if (zS) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            u(false);
        } else {
            u(false);
        }
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zD;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        View view;
        y93 y93Var;
        F1 f1;
        Field field = bi5.a;
        int iD = bi5.NUlFixed.d(this);
        ArrayList arrayList2 = this.w;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i10 = i;
        int i11 = 0;
        while (true) {
            y93 y93Var2 = T;
            if (i11 >= size) {
                Rect rect2 = rectA3;
                rectA.setEmpty();
                y93Var2.f(rectA);
                rectA2.setEmpty();
                y93Var2.f(rectA2);
                rect2.setEmpty();
                y93Var2.f(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            YKK ykk = (YKK) view2.getLayoutParams();
            if (i10 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectA3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (ykk.l == ((View) arrayList2.get(i12))) {
                        YKK ykk2 = (YKK) view2.getLayoutParams();
                        if (ykk2.k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            Rect rectA6 = a();
                            k(ykk2.k, rectA4);
                            i(view2, rectA5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            int measuredHeight = view2.getMeasuredHeight();
                            view = view2;
                            y93Var = y93Var2;
                            l(iD, rectA4, rectA6, ykk2, measuredWidth, measuredHeight);
                            boolean z4 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            h(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b0: INVOKE 
                                  (r25v0 'this' androidx.coordinatorlayout.widget.CoordinatorLayout A[IMMUTABLE_TYPE, THIS])
                                  (r16v0 androidx.coordinatorlayout.widget.CoordinatorLayout$YKK)
                                  (r9v15 'rectA6' android.graphics.Rect)
                                  (r5v27 'measuredWidth' int)
                                  (r10v13 'measuredHeight' int)
                                 VIRTUAL call: androidx.coordinatorlayout.widget.CoordinatorLayout.h(androidx.coordinatorlayout.widget.CoordinatorLayout$YKK, android.graphics.Rect, int, int):void A[MD:(androidx.coordinatorlayout.widget.CoordinatorLayout$YKK, android.graphics.Rect, int, int):void (m)] (LINE:177) in method: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 androidx.coordinatorlayout.widget.CoordinatorLayout$YKK
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 775
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
                        }

                        public final void q(View view, int i) {
                            YKK ykk = (YKK) view.getLayoutParams();
                            View view2 = ykk.k;
                            int i2 = 0;
                            if (view2 == null && ykk.f != -1) {
                                throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
                            }
                            y93 y93Var = T;
                            if (view2 != null) {
                                Rect rectA = a();
                                Rect rectA2 = a();
                                try {
                                    k(view2, rectA);
                                    YKK ykk2 = (YKK) view.getLayoutParams();
                                    int measuredWidth = view.getMeasuredWidth();
                                    int measuredHeight = view.getMeasuredHeight();
                                    l(i, rectA, rectA2, ykk2, measuredWidth, measuredHeight);
                                    h(ykk2, rectA2, measuredWidth, measuredHeight);
                                    view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                                    return;
                                } finally {
                                    rectA.setEmpty();
                                    y93Var.f(rectA);
                                    rectA2.setEmpty();
                                    y93Var.f(rectA2);
                                }
                            }
                            int i3 = ykk.e;
                            if (i3 < 0) {
                                YKK ykk3 = (YKK) view.getLayoutParams();
                                Rect rectA3 = a();
                                rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ykk3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) ykk3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) ykk3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) ykk3).bottomMargin);
                                if (this.J != null) {
                                    Field field = bi5.a;
                                    if (bi5.LPt8Fixed.b(this) && !bi5.LPt8Fixed.b(view)) {
                                        rectA3.left = this.J.b() + rectA3.left;
                                        rectA3.top = this.J.d() + rectA3.top;
                                        rectA3.right -= this.J.c();
                                        rectA3.bottom -= this.J.a();
                                    }
                                }
                                Rect rectA4 = a();
                                int i4 = ykk3.c;
                                if ((i4 & 7) == 0) {
                                    i4 |= 8388611;
                                }
                                if ((i4 & 112) == 0) {
                                    i4 |= 48;
                                }
                                va1.b(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i);
                                view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
                                rectA3.setEmpty();
                                y93Var.f(rectA3);
                                rectA4.setEmpty();
                                y93Var.f(rectA4);
                                return;
                            }
                            YKK ykk4 = (YKK) view.getLayoutParams();
                            int i5 = ykk4.c;
                            if (i5 == 0) {
                                i5 = 8388661;
                            }
                            int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
                            int i6 = absoluteGravity & 7;
                            int i7 = absoluteGravity & 112;
                            int width = getWidth();
                            int height = getHeight();
                            int measuredWidth2 = view.getMeasuredWidth();
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (i == 1) {
                                i3 = width - i3;
                            }
                            int iM = m(i3) - measuredWidth2;
                            if (i6 == 1) {
                                iM += measuredWidth2 / 2;
                            } else if (i6 == 5) {
                                iM += measuredWidth2;
                            }
                            if (i7 == 16) {
                                i2 = 0 + (measuredHeight2 / 2);
                            } else if (i7 == 80) {
                                i2 = measuredHeight2 + 0;
                            }
                            int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ykk4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) ykk4).rightMargin));
                            int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ykk4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) ykk4).bottomMargin));
                            view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
                        }

                        public final void r(View view, int i, int i2, int i3) {
                            measureChildWithMargins(view, i, i2, i3, 0);
                        }

                        @Override // android.view.ViewGroup, android.view.ViewParent
                        public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                            F1 f1 = ((YKK) view.getLayoutParams()).a;
                            if (f1 == null || !f1.m(this, view, rect, z)) {
                                return super.requestChildRectangleOnScreen(view, rect, z);
                            }
                            return true;
                        }

                        @Override // android.view.ViewGroup, android.view.ViewParent
                        public final void requestDisallowInterceptTouchEvent(boolean z) {
                            super.requestDisallowInterceptTouchEvent(z);
                            if (!z || this.C) {
                                return;
                            }
                            u(false);
                            this.C = true;
                        }

                        public final boolean s(MotionEvent motionEvent, int i) {
                            boolean z;
                            int actionMasked = motionEvent.getActionMasked();
                            ArrayList arrayList = this.y;
                            arrayList.clear();
                            boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
                            int childCount = getChildCount();
                            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                                arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
                            }
                            byN byn = S;
                            if (byn != null) {
                                Collections.sort(arrayList, byn);
                            }
                            int size = arrayList.size();
                            MotionEvent motionEventObtain = null;
                            boolean zG = false;
                            boolean z2 = false;
                            for (int i3 = 0; i3 < size; i3++) {
                                View view = (View) arrayList.get(i3);
                                YKK ykk = (YKK) view.getLayoutParams();
                                F1 f1 = ykk.a;
                                if (!(zG || z2) || actionMasked == 0) {
                                    if (!zG && f1 != null) {
                                        if (i == 0) {
                                            zG = f1.g(this, view, motionEvent);
                                        } else if (i == 1) {
                                            zG = f1.r(this, view, motionEvent);
                                        }
                                        if (zG) {
                                            this.F = view;
                                        }
                                    }
                                    if (ykk.a == null) {
                                        ykk.m = false;
                                    }
                                    boolean z3 = ykk.m;
                                    if (z3) {
                                        z = true;
                                    } else {
                                        z = z3 | false;
                                        ykk.m = z;
                                    }
                                    z2 = z && !z3;
                                    if (z && !z2) {
                                        break;
                                    }
                                } else if (f1 != null) {
                                    if (motionEventObtain == null) {
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                                    }
                                    if (i == 0) {
                                        f1.g(this, view, motionEventObtain);
                                    } else if (i == 1) {
                                        f1.r(this, view, motionEventObtain);
                                    }
                                }
                            }
                            arrayList.clear();
                            return zG;
                        }

                        @Override // android.view.View
                        public void setFitsSystemWindows(boolean z) {
                            super.setFitsSystemWindows(z);
                            x();
                        }

                        @Override // android.view.ViewGroup
                        public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
                            this.M = onHierarchyChangeListener;
                        }

                        public void setStatusBarBackground(Drawable drawable) {
                            Drawable drawable2 = this.L;
                            if (drawable2 != drawable) {
                                if (drawable2 != null) {
                                    drawable2.setCallback(null);
                                }
                                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                                this.L = drawableMutate;
                                if (drawableMutate != null) {
                                    if (drawableMutate.isStateful()) {
                                        this.L.setState(getDrawableState());
                                    }
                                    Drawable drawable3 = this.L;
                                    Field field = bi5.a;
                                    uo0.c(drawable3, bi5.NUlFixed.d(this));
                                    this.L.setVisible(getVisibility() == 0, false);
                                    this.L.setCallback(this);
                                }
                                Field field2 = bi5.a;
                                bi5.LPt8Fixed.k(this);
                            }
                        }

                        public void setStatusBarBackgroundColor(int i) {
                            setStatusBarBackground(new ColorDrawable(i));
                        }

                        public void setStatusBarBackgroundResource(int i) {
                            Drawable drawableB;
                            if (i != 0) {
                                Context context = getContext();
                                Object obj = r80.a;
                                drawableB = r80.CQf.b(context, i);
                            } else {
                                drawableB = null;
                            }
                            setStatusBarBackground(drawableB);
                        }

                        @Override // android.view.View
                        public void setVisibility(int i) {
                            super.setVisibility(i);
                            boolean z = i == 0;
                            Drawable drawable = this.L;
                            if (drawable == null || drawable.isVisible() == z) {
                                return;
                            }
                            this.L.setVisible(z, false);
                        }

                        /* JADX WARN: Code duplicated, block: B:112:0x0091 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:32:0x007c  */
                        /* JADX WARN: Code duplicated, block: B:34:0x0084 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:35:0x0086  */
                        /* JADX WARN: Code duplicated, block: B:37:0x008c  */
                        /* JADX WARN: Code duplicated, block: B:40:0x0099  */
                        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:41:0x009d
                            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
                            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
                            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
                            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
                            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                            */
                        public final void t() {
                            /*
                                Method dump skipped, instruction units count: 482
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
                        }

                        public final void u(boolean z) {
                            int childCount = getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt = getChildAt(i);
                                F1 f1 = ((YKK) childAt.getLayoutParams()).a;
                                if (f1 != null) {
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                                    if (z) {
                                        f1.g(this, childAt, motionEventObtain);
                                    } else {
                                        f1.r(this, childAt, motionEventObtain);
                                    }
                                    motionEventObtain.recycle();
                                }
                            }
                            for (int i2 = 0; i2 < childCount; i2++) {
                                ((YKK) getChildAt(i2).getLayoutParams()).m = false;
                            }
                            this.F = null;
                            this.C = false;
                        }

                        @Override // android.view.View
                        public final boolean verifyDrawable(Drawable drawable) {
                            return super.verifyDrawable(drawable) || drawable == this.L;
                        }

                        public final void x() {
                            Field field = bi5.a;
                            if (!bi5.LPt8Fixed.b(this)) {
                                bi5.byN.u(this, null);
                                return;
                            }
                            if (this.N == null) {
                                this.N = new QnHx();
                            }
                            bi5.byN.u(this, this.N);
                            setSystemUiVisibility(1280);
                        }

                        @Override // android.view.ViewGroup
                        public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
                            if (layoutParams instanceof YKK) {
                                return new YKK((YKK) layoutParams);
                            }
                            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new YKK((ViewGroup.MarginLayoutParams) layoutParams) : new YKK(layoutParams);
                        }

                        public static class T23 extends defpackage.CQf {
                            public static final Parcelable.Creator<T23> CREATOR = new QnHx();
                            public SparseArray<Parcelable> y;

                            public static class QnHx implements Parcelable.ClassLoaderCreator<T23> {
                                @Override // android.os.Parcelable.ClassLoaderCreator
                                public final T23 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                                    return new T23(parcel, classLoader);
                                }

                                @Override // android.os.Parcelable.Creator
                                public final Object[] newArray(int i) {
                                    return new T23[i];
                                }

                                @Override // android.os.Parcelable.Creator
                                public final Object createFromParcel(Parcel parcel) {
                                    return new T23(parcel, null);
                                }
                            }

                            public T23(Parcel parcel, ClassLoader classLoader) {
                                super(parcel, classLoader);
                                int i = parcel.readInt();
                                int[] iArr = new int[i];
                                parcel.readIntArray(iArr);
                                Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
                                this.y = new SparseArray<>(i);
                                for (int i2 = 0; i2 < i; i2++) {
                                    this.y.append(iArr[i2], parcelableArray[i2]);
                                }
                            }

                            @Override // defpackage.CQf, android.os.Parcelable
                            public final void writeToParcel(Parcel parcel, int i) {
                                parcel.writeParcelable(this.w, i);
                                SparseArray<Parcelable> sparseArray = this.y;
                                int size = sparseArray != null ? sparseArray.size() : 0;
                                parcel.writeInt(size);
                                int[] iArr = new int[size];
                                Parcelable[] parcelableArr = new Parcelable[size];
                                for (int i2 = 0; i2 < size; i2++) {
                                    iArr[i2] = this.y.keyAt(i2);
                                    parcelableArr[i2] = this.y.valueAt(i2);
                                }
                                parcel.writeIntArray(iArr);
                                parcel.writeParcelableArray(parcelableArr, i);
                            }

                            public T23(Parcelable parcelable) {
                                super(parcelable);
                            }
                        }

                        public static class YKK extends ViewGroup.MarginLayoutParams {
                            public F1 a;
                            public boolean b;
                            public final int c;
                            public int d;
                            public final int e;
                            public final int f;
                            public final int g;
                            public int h;
                            public int i;
                            public int j;
                            public View k;
                            public View l;
                            public boolean m;
                            public boolean n;
                            public boolean o;
                            public boolean p;
                            public final Rect q;

                            public YKK() {
                                super(-2, -2);
                                this.b = false;
                                this.c = 0;
                                this.d = 0;
                                this.e = -1;
                                this.f = -1;
                                this.g = 0;
                                this.h = 0;
                                this.q = new Rect();
                            }

                            public final boolean a(int i) {
                                if (i == 0) {
                                    return this.n;
                                }
                                if (i != 1) {
                                    return false;
                                }
                                return this.o;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public YKK(Context context, AttributeSet attributeSet) {
                                F1 f1NewInstance;
                                super(context, attributeSet);
                                this.b = false;
                                this.c = 0;
                                this.d = 0;
                                this.e = -1;
                                this.f = -1;
                                this.g = 0;
                                this.h = 0;
                                this.q = new Rect();
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JUCk.d);
                                this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
                                this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
                                this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
                                this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
                                this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
                                this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
                                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
                                this.b = zHasValue;
                                if (zHasValue) {
                                    String string = typedArrayObtainStyledAttributes.getString(3);
                                    String str = CoordinatorLayout.P;
                                    if (TextUtils.isEmpty(string)) {
                                        f1NewInstance = null;
                                    } else {
                                        if (string.startsWith(".")) {
                                            string = context.getPackageName() + string;
                                        } else if (string.indexOf(46) < 0) {
                                            String str2 = CoordinatorLayout.P;
                                            if (!TextUtils.isEmpty(str2)) {
                                                string = str2 + '.' + string;
                                            }
                                        }
                                        try {
                                            ThreadLocal<Map<String, Constructor<F1>>> threadLocal = CoordinatorLayout.R;
                                            Map<String, Constructor<F1>> map = threadLocal.get();
                                            if (map == null) {
                                                map = new HashMap<>();
                                                threadLocal.set(map);
                                            }
                                            Constructor<F1> constructor = map.get(string);
                                            if (constructor == null) {
                                                constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.Q);
                                                constructor.setAccessible(true);
                                                map.put(string, constructor);
                                            }
                                            f1NewInstance = constructor.newInstance(context, attributeSet);
                                        } catch (Exception e) {
                                            throw new RuntimeException(b70.a("Could not inflate Behavior subclass ", string), e);
                                        }
                                    }
                                    this.a = f1NewInstance;
                                }
                                typedArrayObtainStyledAttributes.recycle();
                                F1 f1 = this.a;
                                if (f1 != null) {
                                    f1.c(this);
                                }
                            }

                            public YKK(YKK ykk) {
                                super((ViewGroup.MarginLayoutParams) ykk);
                                this.b = false;
                                this.c = 0;
                                this.d = 0;
                                this.e = -1;
                                this.f = -1;
                                this.g = 0;
                                this.h = 0;
                                this.q = new Rect();
                            }

                            public YKK(ViewGroup.MarginLayoutParams marginLayoutParams) {
                                super(marginLayoutParams);
                                this.b = false;
                                this.c = 0;
                                this.d = 0;
                                this.e = -1;
                                this.f = -1;
                                this.g = 0;
                                this.h = 0;
                                this.q = new Rect();
                            }

                            public YKK(ViewGroup.LayoutParams layoutParams) {
                                super(layoutParams);
                                this.b = false;
                                this.c = 0;
                                this.d = 0;
                                this.e = -1;
                                this.f = -1;
                                this.g = 0;
                                this.h = 0;
                                this.q = new Rect();
                            }
                        }
                    }
