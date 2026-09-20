package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.ads.AdError;
import defpackage.AY;
import defpackage.UT;
import defpackage.bi5;
import defpackage.d_OZ;
import defpackage.ex0;
import defpackage.oq0;
import defpackage.r;
import defpackage.rm2;
import defpackage.sm2;
import defpackage.um2;
import defpackage.vm2;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements um2, rm2 {
    public static final float W = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final QnHx a0 = new QnHx();
    public static final int[] b0 = {R.attr.fillViewport};
    public final EdgeEffect A;
    public final EdgeEffect B;
    public int C;
    public boolean D;
    public boolean E;
    public View F;
    public boolean G;
    public VelocityTracker H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final int[] O;
    public final int[] P;
    public int Q;
    public int R;
    public LPt8Fixed S;
    public final vm2 T;
    public final sm2 U;
    public float V;
    public final float w;
    public long x;
    public final Rect y;
    public OverScroller z;

    public static class CQf {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface F1 {
    }

    public static class LPt8Fixed extends View.BaseSavedState {
        public static final Parcelable.Creator<LPt8Fixed> CREATOR = new QnHx();
        public int w;

        public class QnHx implements Parcelable.Creator<LPt8Fixed> {
            @Override // android.os.Parcelable.Creator
            public final LPt8Fixed createFromParcel(Parcel parcel) {
                return new LPt8Fixed(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LPt8Fixed[] newArray(int i) {
                return new LPt8Fixed[i];
            }
        }

        public LPt8Fixed(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            return ex0.c(sb, this.w, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.w);
        }

        public LPt8Fixed(Parcel parcel) {
            super(parcel);
            this.w = parcel.readInt();
        }
    }

    public static class QnHx extends d_OZ {
        @Override // defpackage.d_OZ
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            r.c(accessibilityEvent, nestedScrollView.getScrollX());
            r.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // defpackage.d_OZ
        public final void d(View view, UT ut) {
            int scrollRange;
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            ut.i(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                ut.b(UT.QnHx.i);
                ut.b(UT.QnHx.m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                ut.b(UT.QnHx.h);
                ut.b(UT.QnHx.o);
            }
        }

        @Override // defpackage.d_OZ
        public final boolean g(View view, int i, Bundle bundle) {
            if (super.g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.t(true, 0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY());
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.t(true, 0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY());
            return true;
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.azefsw.audioconnect.R.attr.nestedScrollViewStyle);
        this.y = new Rect();
        this.D = true;
        this.E = false;
        this.F = null;
        this.G = false;
        this.J = true;
        this.N = -1;
        this.O = new int[2];
        this.P = new int[2];
        int i = Build.VERSION.SDK_INT;
        this.A = i >= 31 ? oq0.CQf.a(context, attributeSet) : new EdgeEffect(context);
        this.B = i >= 31 ? oq0.CQf.a(context, attributeSet) : new EdgeEffect(context);
        this.w = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.z = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.K = viewConfiguration.getScaledTouchSlop();
        this.L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0, com.azefsw.audioconnect.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.T = new vm2();
        this.U = new sm2(this);
        setNestedScrollingEnabled(true);
        bi5.m(this, a0);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.V == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.V = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.V;
    }

    public static boolean m(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, view2);
    }

    public final boolean a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            i(maxScrollAmount);
        } else {
            Rect rect = this.y;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            i(h(rect));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!n(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // defpackage.um2
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o(i4, i5, iArr);
    }

    @Override // defpackage.tm2
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        o(i4, i5, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        boolean z;
        int i;
        int scrollRange;
        int overScrollMode;
        if (this.z.isFinished()) {
            return;
        }
        this.z.computeScrollOffset();
        int currY = this.z.getCurrY();
        int i2 = currY - this.R;
        int height = getHeight();
        EdgeEffect edgeEffect = this.B;
        EdgeEffect edgeEffect2 = this.A;
        if (i2 <= 0 || oq0.a(edgeEffect2) == 0.0f) {
            if (i2 < 0 && oq0.a(edgeEffect) != 0.0f) {
                float f = height;
                iRound = Math.round(oq0.b(edgeEffect, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect.finish();
                }
            }
            this.R = currY;
            iArr = this.P;
            z = false;
            iArr[1] = 0;
            this.U.c(0, i2, 1, iArr, null);
            i = i2 - iArr[1];
            scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.U.e(0, scrollY2, 0, i3, this.O, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.z.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.z.getCurrVelocity());
                    }
                }
                this.z.abortAnimation();
                w(1);
            }
            if (!this.z.isFinished()) {
                w(1);
            } else {
                Field field = bi5.a;
                bi5.LPt8Fixed.k(this);
            }
        }
        iRound = Math.round(oq0.b(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect2.finish();
        }
        i2 -= iRound;
        this.R = currY;
        iArr = this.P;
        z = false;
        iArr[1] = 0;
        this.U.c(0, i2, 1, iArr, null);
        i = i2 - iArr[1];
        scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY3 = getScrollY();
            q(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i4 = i - scrollY4;
            iArr[1] = 0;
            this.U.e(0, scrollY4, 0, i4, this.O, 1, iArr);
            i = i4 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                if (i < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.z.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.z.getCurrVelocity());
                }
            }
            this.z.abortAnimation();
            w(1);
        }
        if (!this.z.isFinished()) {
            w(1);
        } else {
            Field field2 = bi5.a;
            bi5.LPt8Fixed.k(this);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // defpackage.tm2
    public final boolean d(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.U.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.U.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.U.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.U.e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (CQf.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (CQf.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                Field field = bi5.a;
                bi5.LPt8Fixed.k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (CQf.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (CQf.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            Field field2 = bi5.a;
            bi5.LPt8Fixed.k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // defpackage.tm2
    public final void e(View view, View view2, int i, int i2) {
        vm2 vm2Var = this.T;
        if (i2 == 1) {
            vm2Var.b = i;
        } else {
            vm2Var.a = i;
        }
        u(2, i2);
    }

    @Override // defpackage.tm2
    public final void f(View view, int i) {
        vm2 vm2Var = this.T;
        if (i == 1) {
            vm2Var.b = 0;
        } else {
            vm2Var.a = 0;
        }
        w(i);
    }

    @Override // defpackage.tm2
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        this.U.c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vm2 vm2Var = this.T;
        return vm2Var.b | vm2Var.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.U.f(0) != null;
    }

    public final void i(int i) {
        if (i != 0) {
            if (this.J) {
                t(false, 0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.U.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    public final boolean j(KeyEvent keyEvent) {
        boolean z;
        Rect rect = this.y;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? a(33) : l(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? a(130) : l(130);
        }
        if (keyCode != 62) {
            return false;
        }
        int i = keyEvent.isShiftPressed() ? 33 : 130;
        boolean z2 = i == 130;
        int height = getHeight();
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt2 = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        r(i, i2, i3);
        return false;
    }

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.z.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.R = getScrollY();
            Field field = bi5.a;
            bi5.LPt8Fixed.k(this);
        }
    }

    public final boolean l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.y;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i, int i2) {
        Rect rect = this.y;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.U.d(scrollY2, i - scrollY2, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        boolean z;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.G) {
            if (AY.G(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = AY.G(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    int overScrollMode = getOverScrollMode();
                    if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !AY.G(motionEvent, 8194)) {
                        float height = (-i2) / getHeight();
                        EdgeEffect edgeEffect = this.A;
                        oq0.b(edgeEffect, height, 0.5f);
                        edgeEffect.onRelease();
                        invalidate();
                        z = 1;
                    } else {
                        i2 = 0;
                        i = i2;
                        z = 0;
                    }
                } else if (i2 > scrollRange) {
                    int overScrollMode2 = getOverScrollMode();
                    if ((overScrollMode2 == 0 || (overScrollMode2 == 1 && getScrollRange() > 0)) && !AY.G(motionEvent, 8194)) {
                        float height2 = (i2 - scrollRange) / getHeight();
                        EdgeEffect edgeEffect2 = this.B;
                        oq0.b(edgeEffect2, height2, 0.5f);
                        edgeEffect2.onRelease();
                        invalidate();
                        i = 1;
                    }
                    z = i;
                    i = scrollRange;
                } else {
                    i = i2;
                    z = 0;
                }
                if (i == scrollY) {
                    return z;
                }
                super.scrollTo(getScrollX(), i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.G) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                this.C = y;
                this.N = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker2 = this.H;
                if (velocityTracker2 == null) {
                    this.H = VelocityTracker.obtain();
                } else {
                    velocityTracker2.clear();
                }
                this.H.addMovement(motionEvent);
                this.z.computeScrollOffset();
                if (!v(motionEvent) && this.z.isFinished()) {
                    z2 = false;
                }
                this.G = z2;
                u(2, 0);
            } else {
                if (!v(motionEvent) && this.z.isFinished()) {
                    z2 = false;
                }
                this.G = z2;
                VelocityTracker velocityTracker3 = this.H;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.H = null;
                }
            }
        } else if (i == 1) {
            this.G = false;
            this.N = -1;
            velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.H = null;
            }
            if (this.z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                Field field = bi5.a;
                bi5.LPt8Fixed.k(this);
            }
            w(0);
        } else if (i == 2) {
            int i2 = this.N;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.C) > this.K && (2 & getNestedScrollAxes()) == 0) {
                        this.G = true;
                        this.C = y2;
                        if (this.H == null) {
                            this.H = VelocityTracker.obtain();
                        }
                        this.H.addMovement(motionEvent);
                        this.Q = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.G = false;
            this.N = -1;
            velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.H = null;
            }
            if (this.z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                Field field2 = bi5.a;
                bi5.LPt8Fixed.k(this);
            }
            w(0);
        } else if (i == 6) {
            p(motionEvent);
        }
        return this.G;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.D = false;
        View view = this.F;
        if (view != null && m(view, this)) {
            View view2 = this.F;
            Rect rect = this.y;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.F = null;
        if (!this.E) {
            if (this.S != null) {
                scrollTo(getScrollX(), this.S.w);
                this.S = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.E = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.I && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        g(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ n(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof LPt8Fixed)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LPt8Fixed lPt8 = (LPt8Fixed) parcelable;
        super.onRestoreInstanceState(lPt8.getSuperState());
        this.S = lPt8;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        LPt8Fixed lPt8 = new LPt8Fixed(super.onSaveInstanceState());
        lPt8.w = getScrollY();
        return lPt8;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.y;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        i(h(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        f(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022a  */
    /* JADX WARN: Code duplicated, block: B:118:0x027c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0284  */
    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x0226  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        int i;
        float f;
        float fB;
        int iRound;
        int i2;
        boolean zC;
        int[] iArr;
        int[] iArr2;
        int scrollY;
        int scrollRange;
        int overScrollMode;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        ViewParent parent2;
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.Q);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.A;
            EdgeEffect edgeEffect2 = this.B;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.H;
                velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.M);
                int yVelocity = (int) velocityTracker.getYVelocity(this.N);
                if (Math.abs(yVelocity) >= this.L) {
                    if (oq0.a(edgeEffect) == 0.0f) {
                        if (oq0.a(edgeEffect2) != 0.0f) {
                            int i5 = -yVelocity;
                            if (s(edgeEffect2, i5)) {
                                edgeEffect2.onAbsorb(i5);
                            } else {
                                k(i5);
                            }
                        } else {
                            z = false;
                        }
                        if (!z) {
                            i = -yVelocity;
                            f = i;
                            if (!dispatchNestedPreFling(0.0f, f)) {
                                dispatchNestedFling(0.0f, f, true);
                                k(i);
                            }
                        }
                    } else if (s(edgeEffect, yVelocity)) {
                        edgeEffect.onAbsorb(yVelocity);
                    } else {
                        k(-yVelocity);
                    }
                    z = true;
                    if (!z) {
                        i = -yVelocity;
                        f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            k(i);
                        }
                    }
                } else if (this.z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    Field field = bi5.a;
                    bi5.LPt8Fixed.k(this);
                }
                this.N = -1;
                this.G = false;
                VelocityTracker velocityTracker2 = this.H;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.H = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.N);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.N + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i6 = this.C - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (oq0.a(edgeEffect) != 0.0f) {
                        fB = -oq0.b(edgeEffect, -height, x);
                        if (oq0.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (oq0.a(edgeEffect2) != 0.0f) {
                        fB = oq0.b(edgeEffect2, height, 1.0f - x);
                        if (oq0.a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f2 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i2 = i6 - iRound;
                        if (!this.G && Math.abs(i2) > this.K) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.G = true;
                            if (i2 > 0) {
                                i2 -= this.K;
                            } else {
                                i2 += this.K;
                            }
                        }
                        if (this.G) {
                            zC = this.U.c(0, i2, 0, this.P, this.O);
                            iArr = this.P;
                            iArr2 = this.O;
                            if (zC) {
                                i2 -= iArr[1];
                                this.Q += iArr2[1];
                            }
                            this.C = y - iArr2[1];
                            scrollY = getScrollY();
                            scrollRange = getScrollRange();
                            overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (q(i2, 0, getScrollY(), scrollRange)) {
                                if (this.U.f(0) != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else {
                                z3 = false;
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            iArr[1] = 0;
                            this.U.e(0, scrollY2, 0, i2 - scrollY2, this.O, 0, iArr);
                            int i7 = this.C;
                            int i8 = iArr2[1];
                            this.C = i7 - i8;
                            this.Q += i8;
                            if (z2) {
                                i3 = i2 - iArr[1];
                                i4 = scrollY + i3;
                                if (i4 < 0) {
                                    oq0.b(edgeEffect, (-i3) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                    if (!edgeEffect2.isFinished()) {
                                        edgeEffect2.onRelease();
                                    }
                                } else if (i4 > scrollRange) {
                                    oq0.b(edgeEffect2, i3 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                    if (!edgeEffect.isFinished()) {
                                        edgeEffect.onRelease();
                                    }
                                }
                                if (edgeEffect.isFinished() || !edgeEffect2.isFinished()) {
                                    Field field2 = bi5.a;
                                    bi5.LPt8Fixed.k(this);
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                            } else {
                                z4 = z3;
                            }
                            if (z4) {
                                this.H.clear();
                            }
                        }
                    }
                    f2 = fB;
                    iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i2 = i6 - iRound;
                    if (!this.G) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.G = true;
                        if (i2 > 0) {
                            i2 -= this.K;
                        } else {
                            i2 += this.K;
                        }
                    }
                    if (this.G) {
                        zC = this.U.c(0, i2, 0, this.P, this.O);
                        iArr = this.P;
                        iArr2 = this.O;
                        if (zC) {
                            i2 -= iArr[1];
                            this.Q += iArr2[1];
                        }
                        this.C = y - iArr2[1];
                        scrollY = getScrollY();
                        scrollRange = getScrollRange();
                        overScrollMode = getOverScrollMode();
                        if (overScrollMode != 0) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (q(i2, 0, getScrollY(), scrollRange)) {
                            z3 = false;
                        } else {
                            if (this.U.f(0) != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        int scrollY3 = getScrollY() - scrollY;
                        iArr[1] = 0;
                        this.U.e(0, scrollY3, 0, i2 - scrollY3, this.O, 0, iArr);
                        int i9 = this.C;
                        int i10 = iArr2[1];
                        this.C = i9 - i10;
                        this.Q += i10;
                        if (z2) {
                            z4 = z3;
                        } else {
                            i3 = i2 - iArr[1];
                            i4 = scrollY + i3;
                            if (i4 < 0) {
                                oq0.b(edgeEffect, (-i3) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!edgeEffect2.isFinished()) {
                                    edgeEffect2.onRelease();
                                }
                            } else if (i4 > scrollRange) {
                                oq0.b(edgeEffect2, i3 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!edgeEffect.isFinished()) {
                                    edgeEffect.onRelease();
                                }
                            }
                            if (edgeEffect.isFinished()) {
                            }
                            Field field3 = bi5.a;
                            bi5.LPt8Fixed.k(this);
                            z4 = false;
                        }
                        if (z4) {
                            this.H.clear();
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.G && getChildCount() > 0 && this.z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    Field field4 = bi5.a;
                    bi5.LPt8Fixed.k(this);
                }
                this.N = -1;
                this.G = false;
                VelocityTracker velocityTracker3 = this.H;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.H = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.C = (int) motionEvent.getY(actionIndex);
                this.N = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.C = (int) motionEvent.getY(motionEvent.findPointerIndex(this.N));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.G && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.z.isFinished()) {
                this.z.abortAnimation();
                w(1);
            }
            this.C = (int) motionEvent.getY();
            this.N = motionEvent.getPointerId(0);
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.H;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.C = (int) motionEvent.getY(i);
            this.N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    public final boolean q(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i3 + i;
        int i7 = i4 + 0;
        if (i5 <= 0 && i5 >= 0) {
            z = false;
        } else {
            z = true;
            i5 = 0;
        }
        if (i6 <= i7) {
            if (i6 < 0) {
                i6 = 0;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.U.f(1) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.z.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
            }
            onOverScrolled(i5, i6, z, z2);
            return z || z2;
        }
        i6 = i7;
        z2 = true;
        if (z2) {
            if (this.U.f(1) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                this.z.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
        }
        onOverScrolled(i5, i6, z, z2);
        if (z) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            i(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.D) {
            this.F = view2;
        } else {
            Rect rect = this.y;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z2 = iH != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iH);
            } else {
                t(false, 0, iH);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.H) != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.D = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fA = oq0.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.w * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = W;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fA;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.I) {
            this.I = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        sm2 sm2Var = this.U;
        if (sm2Var.d) {
            Field field = bi5.a;
            bi5.byN.z(sm2Var.c);
        }
        sm2Var.d = z;
    }

    public void setOnScrollChangeListener(F1 f1) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.J = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return u(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(boolean z, int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.x > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.z.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                u(2, 1);
            } else {
                w(1);
            }
            this.R = getScrollY();
            Field field = bi5.a;
            bi5.LPt8Fixed.k(this);
        } else {
            if (!this.z.isFinished()) {
                this.z.abortAnimation();
                w(1);
            }
            scrollBy(i, i2);
        }
        this.x = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(int i, int i2) {
        return this.U.g(i, i2);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A;
        if (oq0.a(edgeEffect) != 0.0f) {
            oq0.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (oq0.a(edgeEffect2) == 0.0f) {
            return z;
        }
        oq0.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.U.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
