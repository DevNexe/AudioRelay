package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.jm5;
import defpackage.tm2;
import defpackage.um2;
import defpackage.uo1;
import defpackage.vm2;
import defpackage.xf0;
import defpackage.yf0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements xf0, tm2, um2 {
    public static final int[] W = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public yf0 A;
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final Rect J;
    public final Rect K;
    public final Rect L;
    public jm5 M;
    public jm5 N;
    public jm5 O;
    public jm5 P;
    public OverScroller Q;
    public ViewPropertyAnimator R;
    public final QnHx S;
    public final CQf T;
    public final F1 U;
    public final vm2 V;
    public int w;
    public int x;
    public ContentFrameLayout y;
    public ActionBarContainer z;

    public class CQf implements Runnable {
        public CQf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.i();
            actionBarOverlayLayout.R = actionBarOverlayLayout.z.animate().translationY(0.0f).setListener(actionBarOverlayLayout.S);
        }
    }

    public class F1 implements Runnable {
        public F1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.i();
            actionBarOverlayLayout.R = actionBarOverlayLayout.z.animate().translationY(-actionBarOverlayLayout.z.getHeight()).setListener(actionBarOverlayLayout.S);
        }
    }

    public interface LPt8Fixed {
    }

    public static class NUlFixed extends ViewGroup.MarginLayoutParams {
        public NUlFixed(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public NUlFixed() {
            super(-1, -1);
        }

        public NUlFixed(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class QnHx extends AnimatorListenerAdapter {
        public QnHx() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.R = null;
            actionBarOverlayLayout.G = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.R = null;
            actionBarOverlayLayout.G = false;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = 0;
        this.J = new Rect();
        this.K = new Rect();
        this.L = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        jm5 jm5Var = jm5.b;
        this.M = jm5Var;
        this.N = jm5Var;
        this.O = jm5Var;
        this.P = jm5Var;
        this.S = new QnHx();
        this.T = new CQf();
        this.U = new F1();
        j(context);
        this.V = new vm2();
    }

    public static boolean h(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        NUlFixed nUl = (NUlFixed) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) nUl).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) nUl).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) nUl).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) nUl).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) nUl).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) nUl).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) nUl).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) nUl).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.xf0
    public final void a() {
        k();
        this.A.a();
    }

    @Override // defpackage.um2
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.tm2
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof NUlFixed;
    }

    @Override // defpackage.tm2
    public final boolean d(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.B == null || this.C) {
            return;
        }
        if (this.z.getVisibility() == 0) {
            translationY = (int) (this.z.getTranslationY() + this.z.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.B.setBounds(0, translationY, getWidth(), this.B.getIntrinsicHeight() + translationY);
        this.B.draw(canvas);
    }

    @Override // defpackage.tm2
    public final void e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.tm2
    public final void f(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.tm2
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new NUlFixed();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new NUlFixed(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.z;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vm2 vm2Var = this.V;
        return vm2Var.b | vm2Var.a;
    }

    public CharSequence getTitle() {
        k();
        return this.A.getTitle();
    }

    public final void i() {
        removeCallbacks(this.T);
        removeCallbacks(this.U);
        ViewPropertyAnimator viewPropertyAnimator = this.R;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void j(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(W);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.B = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.C = context.getApplicationInfo().targetSdkVersion < 19;
        this.Q = new OverScroller(context);
    }

    public final void k() {
        yf0 wrapper;
        if (this.y == null) {
            this.y = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.z = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof yf0) {
                wrapper = (yf0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.A = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        jm5 jm5VarG = jm5.g(windowInsets, this);
        boolean zH = h(this.z, new Rect(jm5VarG.b(), jm5VarG.d(), jm5VarG.c(), jm5VarG.a()), false);
        Field field = bi5.a;
        Rect rect = this.J;
        bi5.byN.b(this, jm5VarG, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        jm5.FJCM fjcm = jm5VarG.a;
        jm5 jm5VarI = fjcm.i(i, i2, i3, i4);
        this.M = jm5VarI;
        boolean z = true;
        if (!this.N.equals(jm5VarI)) {
            this.N = this.M;
            zH = true;
        }
        Rect rect2 = this.K;
        if (rect2.equals(rect)) {
            z = zH;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return fjcm.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j(getContext());
        Field field = bi5.a;
        bi5.T23.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                NUlFixed nUl = (NUlFixed) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) nUl).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) nUl).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        jm5.NUlFixed f1;
        k();
        measureChildWithMargins(this.z, i, 0, i2, 0);
        NUlFixed nUl = (NUlFixed) this.z.getLayoutParams();
        int iMax = Math.max(0, this.z.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) nUl).leftMargin + ((ViewGroup.MarginLayoutParams) nUl).rightMargin);
        int iMax2 = Math.max(0, this.z.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) nUl).topMargin + ((ViewGroup.MarginLayoutParams) nUl).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.z.getMeasuredState());
        Field field = bi5.a;
        boolean z = (bi5.LPt8Fixed.g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.w;
            if (this.E && this.z.getTabContainer() != null) {
                measuredHeight += this.w;
            }
        } else {
            measuredHeight = this.z.getVisibility() != 8 ? this.z.getMeasuredHeight() : 0;
        }
        Rect rect = this.J;
        Rect rect2 = this.L;
        rect2.set(rect);
        jm5 jm5Var = this.M;
        this.O = jm5Var;
        if (this.D || z) {
            uo1 uo1VarA = uo1.a(jm5Var.b(), this.O.d() + measuredHeight, this.O.c(), this.O.a() + 0);
            jm5 jm5Var2 = this.O;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                f1 = new jm5.LPt8Fixed(jm5Var2);
            } else {
                f1 = i3 >= 29 ? new jm5.F1(jm5Var2) : new jm5.CQf(jm5Var2);
            }
            f1.d(uo1VarA);
            this.O = f1.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.O = jm5Var.a.i(0, measuredHeight, 0, 0);
        }
        h(this.y, rect2, true);
        if (!this.P.equals(this.O)) {
            jm5 jm5Var3 = this.O;
            this.P = jm5Var3;
            ContentFrameLayout contentFrameLayout = this.y;
            WindowInsets windowInsetsF = jm5Var3.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsA = bi5.T23.a(contentFrameLayout, windowInsetsF);
                if (!windowInsetsA.equals(windowInsetsF)) {
                    jm5.g(windowInsetsA, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.y, i, 0, i2, 0);
        NUlFixed nUl2 = (NUlFixed) this.y.getLayoutParams();
        int iMax3 = Math.max(iMax, this.y.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) nUl2).leftMargin + ((ViewGroup.MarginLayoutParams) nUl2).rightMargin);
        int iMax4 = Math.max(iMax2, this.y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) nUl2).topMargin + ((ViewGroup.MarginLayoutParams) nUl2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.y.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.F || !z) {
            return false;
        }
        this.Q.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.Q.getFinalY() > this.z.getHeight()) {
            i();
            this.U.run();
        } else {
            i();
            this.T.run();
        }
        this.G = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.H + i2;
        this.H = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.V.a = i;
        this.H = getActionBarHideOffset();
        i();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.z.getVisibility() != 0) {
            return false;
        }
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.F || this.G) {
            return;
        }
        if (this.H <= this.z.getHeight()) {
            i();
            postDelayed(this.T, 600L);
        } else {
            i();
            postDelayed(this.U, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        this.I = i;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.x = i;
    }

    public void setActionBarHideOffset(int i) {
        i();
        this.z.setTranslationY(-Math.max(0, Math.min(i, this.z.getHeight())));
    }

    public void setActionBarVisibilityCallback(LPt8Fixed lPt8) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.E = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.F) {
            this.F = z;
            if (z) {
                return;
            }
            i();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        this.A.setIcon(i);
    }

    public void setLogo(int i) {
        k();
        this.A.c(i);
    }

    public void setOverlayMode(boolean z) {
        this.D = z;
        this.C = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        this.A.d(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        this.A.b(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new NUlFixed(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        this.A.setIcon(drawable);
    }
}
