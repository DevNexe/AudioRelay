package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.azefsw.audioconnect.R;
import defpackage.C0239D;
import defpackage.Th;
import defpackage.UT;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.dc1;
import defpackage.hc1;
import defpackage.la2;
import defpackage.oj5;
import defpackage.ok4;
import defpackage.rm2;
import defpackage.uo0;
import defpackage.ur;
import defpackage.xG;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.CQf {
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public WeakReference<View> G;
    public ValueAnimator H;
    public int[] I;
    public Drawable J;
    public int w;
    public int x;
    public int y;
    public int z;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends hc1 {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iM;
            CoordinatorLayout.F1 f1 = ((CoordinatorLayout.YKK) view2.getLayoutParams()).a;
            if (f1 instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) f1).j + this.e;
                if (this.f == 0) {
                    iM = 0;
                } else {
                    float fV = v(view2);
                    int i = this.f;
                    iM = C0239D.m((int) (fV * i), 0, i);
                }
                bi5.h(view, bottom - iM);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.E) {
                    appBarLayout.b(appBarLayout.c(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                bi5.j(coordinatorLayout, UT.QnHx.h.a());
                bi5.f(coordinatorLayout, 0);
                bi5.j(coordinatorLayout, UT.QnHx.i.a());
                bi5.f(coordinatorLayout, 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListJ.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.B = 2 | (z ^ true ? 4 : 0) | 8;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.hc1
        public final AppBarLayout u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.hc1
        public final float v(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.F1 f1 = ((CoordinatorLayout.YKK) appBarLayout.getLayoutParams()).a;
                int iX = f1 instanceof BaseBehavior ? ((BaseBehavior) f1).x() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iX > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iX / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.hc1
        public final int w(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.Q);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static QnHx a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new QnHx((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new QnHx((ViewGroup.MarginLayoutParams) layoutParams) : new QnHx(layoutParams);
    }

    public final boolean b(boolean z) {
        if (this.D == z) {
            return false;
        }
        this.D = z;
        refreshDrawableState();
        if (this.E && (getBackground() instanceof la2)) {
            la2 la2Var = (la2) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.H = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.H.setInterpolator(ur.a);
            this.H.addUpdateListener(new xG(la2Var));
            this.H.start();
        }
        return true;
    }

    public final boolean c(View view) {
        int i;
        if (this.G == null && (i = this.F) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.F);
            }
            if (viewFindViewById != null) {
                this.G = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.G;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof QnHx;
    }

    public final boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        Field field = bi5.a;
        return !bi5.LPt8Fixed.b(childAt);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.J != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.w);
            this.J.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.J;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new QnHx();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.CQf
    public CoordinatorLayout.F1<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int iD;
        int i = this.y;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            QnHx qnHx = (QnHx) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = qnHx.a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) qnHx).topMargin + ((LinearLayout.LayoutParams) qnHx).bottomMargin;
                if ((i3 & 8) != 0) {
                    Field field = bi5.a;
                    iD = bi5.LPt8Fixed.d(childAt);
                } else {
                    if ((i3 & 2) != 0) {
                        Field field2 = bi5.a;
                        iD = measuredHeight - bi5.LPt8Fixed.d(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                    }
                    if (childCount == 0) {
                        Field field3 = bi5.a;
                        if (bi5.LPt8Fixed.b(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
                iMin = iD + i4;
                if (childCount == 0) {
                    Field field4 = bi5.a;
                    if (bi5.LPt8Fixed.b(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.y = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.z;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iD = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            QnHx qnHx = (QnHx) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) qnHx).topMargin + ((LinearLayout.LayoutParams) qnHx).bottomMargin + childAt.getMeasuredHeight();
            int i3 = qnHx.a;
            if ((i3 & 1) == 0) {
                break;
            }
            iD += measuredHeight;
            if ((i3 & 2) != 0) {
                Field field = bi5.a;
                iD -= bi5.LPt8Fixed.d(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iD);
        this.z = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.F;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        Field field = bi5.a;
        int iD = bi5.LPt8Fixed.d(this);
        if (iD == 0) {
            int childCount = getChildCount();
            iD = childCount >= 1 ? bi5.LPt8Fixed.d(getChildAt(childCount - 1)) : 0;
            if (iD == 0) {
                return getHeight() / 3;
            }
        }
        return (iD * 2) + topInset;
    }

    public int getPendingAction() {
        return this.B;
    }

    public Drawable getStatusBarForeground() {
        return this.J;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iD = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            QnHx qnHx = (QnHx) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = qnHx.a;
            if ((i3 & 1) == 0) {
                break;
            }
            int topInset = measuredHeight + ((LinearLayout.LayoutParams) qnHx).topMargin + ((LinearLayout.LayoutParams) qnHx).bottomMargin + iD;
            if (i2 == 0) {
                Field field = bi5.a;
                if (bi5.LPt8Fixed.b(childAt)) {
                    topInset -= getTopInset();
                }
            }
            iD = topInset;
            if ((i3 & 2) != 0) {
                Field field2 = bi5.a;
                iD -= bi5.LPt8Fixed.d(childAt);
                break;
            }
        }
        int iMax = Math.max(0, iD);
        this.x = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof la2) {
            C0239D.G(this, (la2) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.I == null) {
            this.I = new int[4];
        }
        int[] iArr = this.I;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.C;
        iArr[0] = z ? R.attr.state_liftable : -2130903871;
        iArr[1] = (z && this.D) ? R.attr.state_lifted : -2130903872;
        iArr[2] = z ? R.attr.state_collapsible : -2130903869;
        iArr[3] = (z && this.D) ? R.attr.state_collapsed : -2130903868;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.G;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.G = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        Field field = bi5.a;
        boolean z3 = true;
        if (bi5.LPt8Fixed.b(this) && d()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                bi5.h(getChildAt(childCount), topInset);
            }
        }
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((QnHx) getChildAt(i5).getLayoutParams()).b != null) {
                this.A = true;
                break;
            }
        }
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.E) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((QnHx) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.C != z3) {
            this.C = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            Field field = bi5.a;
            if (bi5.LPt8Fixed.b(this) && d()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = C0239D.m(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.x = -1;
        this.y = -1;
        this.z = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof la2) {
            ((la2) background).i(f);
        }
    }

    public void setExpanded(boolean z) {
        Field field = bi5.a;
        this.B = (z ? 1 : 2) | (bi5.auxFixed.c(this) ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z) {
        this.E = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.F = i;
        WeakReference<View> weakReference = this.G;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.G = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.J;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.J = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.J.setState(getDrawableState());
                }
                Drawable drawable3 = this.J;
                Field field = bi5.a;
                uo0.c(drawable3, bi5.NUlFixed.d(this));
                this.J.setVisible(getVisibility() == 0, false);
                this.J.setCallback(this);
            }
            if (this.J != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            Field field2 = bi5.a;
            bi5.LPt8Fixed.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(XTd3.l(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{android.R.attr.enabled, R.attr.state_liftable, -2130903872}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{android.R.attr.enabled}, ObjectAnimator.ofFloat(this, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.J;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.J;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends dc1<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public int m;
        public boolean n;
        public float o;
        public WeakReference<View> p;

        public BaseBehavior() {
            this.m = -1;
        }

        public static View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof rm2) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005e  */
        public static void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zC;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((QnHx) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    Field field = bi5.a;
                    int iD = bi5.LPt8Fixed.d(childAt);
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - iD) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - iD) - appBarLayout.getTopInset()) {
                        zC = false;
                    } else {
                        zC = true;
                    }
                } else {
                    zC = false;
                }
                if (appBarLayout.E) {
                    zC = appBarLayout.c(C(coordinatorLayout));
                }
                boolean zB = appBarLayout.b(zC);
                if (!z) {
                    if (!zB) {
                        return;
                    }
                    List list = (List) ((ok4) coordinatorLayout.x.b).getOrDefault(appBarLayout, null);
                    ArrayList arrayList = coordinatorLayout.z;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.F1 f1 = ((CoordinatorLayout.YKK) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (f1 instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) f1).f == 0) {
                                break;
                            }
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                }
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(x() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iX = x();
            if (iX == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(ur.e);
                this.l.addUpdateListener(new com.google.android.material.appbar.QnHx(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(iRound, 600));
            this.l.setIntValues(iX, i);
            this.l.start();
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int downNestedPreScrollRange;
            if (i != 0) {
                if (i < 0) {
                    int i3 = -appBarLayout.getTotalScrollRange();
                    i2 = i3;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i2 != downNestedPreScrollRange) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i, i2, downNestedPreScrollRange);
                }
            }
            if (appBarLayout.E) {
                appBarLayout.b(appBarLayout.c(view));
            }
        }

        public final void E(CoordinatorLayout coordinatorLayout, T t) {
            int iX = x();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                QnHx qnHx = (QnHx) childAt.getLayoutParams();
                if ((qnHx.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) qnHx).topMargin;
                    bottom += ((LinearLayout.LayoutParams) qnHx).bottomMargin;
                }
                int i2 = -iX;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                QnHx qnHx2 = (QnHx) childAt2.getLayoutParams();
                int i3 = qnHx2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int iD = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        iD += t.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        Field field = bi5.a;
                        iD += bi5.LPt8Fixed.d(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            Field field2 = bi5.a;
                            int iD2 = bi5.LPt8Fixed.d(childAt2) + iD;
                            if (iX < iD2) {
                                i4 = iD2;
                            } else {
                                iD = iD2;
                            }
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) qnHx2).topMargin;
                        iD -= ((LinearLayout.LayoutParams) qnHx2).bottomMargin;
                    }
                    if (iX < (iD + i4) / 2) {
                        i4 = iD;
                    }
                    B(coordinatorLayout, t, C0239D.m(i4, -t.getTotalScrollRange(), 0));
                }
            }
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t) {
            UT.QnHx qnHx = UT.QnHx.h;
            bi5.j(coordinatorLayout, qnHx.a());
            bi5.f(coordinatorLayout, 0);
            UT.QnHx qnHx2 = UT.QnHx.i;
            bi5.j(coordinatorLayout, qnHx2.a());
            bi5.f(coordinatorLayout, 0);
            View viewC = C(coordinatorLayout);
            if (viewC == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.YKK) viewC.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (x() != (-t.getTotalScrollRange()) && viewC.canScrollVertically(1)) {
                bi5.k(coordinatorLayout, qnHx, new F1(t, false));
            }
            if (x() != 0) {
                if (!viewC.canScrollVertically(-1)) {
                    bi5.k(coordinatorLayout, qnHx2, new F1(t, true));
                    return;
                }
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    bi5.k(coordinatorLayout, qnHx2, new CQf(this, coordinatorLayout, t, viewC, i));
                }
            }
        }

        @Override // defpackage.nj5, androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.n) {
                    iRound = appBarLayout.getTopInset() + bi5.LPt8Fixed.d(childAt) + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.o) + i3;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        B(coordinatorLayout, appBarLayout, i4);
                    } else {
                        A(coordinatorLayout, appBarLayout, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        B(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.B = 0;
            this.m = -1;
            int iM = C0239D.m(s(), -appBarLayout.getTotalScrollRange(), 0);
            oj5 oj5Var = this.a;
            if (oj5Var == null) {
                this.b = iM;
            } else if (oj5Var.d != iM) {
                oj5Var.d = iM;
                oj5Var.a();
            }
            G(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.w = s();
            if (!appBarLayout.willNotDraw()) {
                Field field = bi5.a;
                bi5.LPt8Fixed.k(appBarLayout);
            }
            F(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.YKK) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = z(coordinatorLayout, appBarLayout, x() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i3 == 0) {
                F(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final void n(View view, Parcelable parcelable) {
            if (!(parcelable instanceof QnHx)) {
                this.m = -1;
                return;
            }
            QnHx qnHx = (QnHx) parcelable;
            this.m = qnHx.y;
            this.o = qnHx.z;
            this.n = qnHx.A;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final Parcelable o(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    QnHx qnHx = new QnHx(absSavedState);
                    qnHx.y = i;
                    Field field = bi5.a;
                    qnHx.A = bottom == appBarLayout.getTopInset() + bi5.LPt8Fixed.d(childAt);
                    qnHx.z = bottom / childAt.getHeight();
                    return qnHx;
                }
            }
            return absSavedState;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x002b  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0) {
                if (appBarLayout.E) {
                    z = true;
                } else {
                    if ((appBarLayout.getTotalScrollRange() != 0) && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                        z = true;
                    }
                }
            }
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.p = null;
            this.k = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.E) {
                    appBarLayout.b(appBarLayout.c(view2));
                }
            }
            this.p = new WeakReference<>(view2);
        }

        @Override // defpackage.dc1
        public final boolean u(View view) {
            View view2;
            WeakReference<View> weakReference = this.p;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // defpackage.dc1
        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // defpackage.dc1
        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // defpackage.dc1
        public final int x() {
            return s() + this.j;
        }

        @Override // defpackage.dc1
        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            E(coordinatorLayout, appBarLayout);
            if (appBarLayout.E) {
                appBarLayout.b(appBarLayout.c(C(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:67:0x00db A[SYNTHETIC] */
        @Override // defpackage.dc1
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean z;
            List list;
            int i4;
            View view2;
            CoordinatorLayout.F1 f1;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iX = x();
            int i5 = 0;
            if (i2 == 0 || iX < i2 || iX > i3) {
                this.j = 0;
            } else {
                int iM = C0239D.m(i, i2, i3);
                if (iX != iM) {
                    if (!appBarLayout.A) {
                        top = iM;
                        break;
                    }
                    int iAbs = Math.abs(iM);
                    int childCount = appBarLayout.getChildCount();
                    int i6 = 0;
                    while (true) {
                        if (i6 < childCount) {
                            View childAt = appBarLayout.getChildAt(i6);
                            QnHx qnHx = (QnHx) childAt.getLayoutParams();
                            Interpolator interpolator = qnHx.b;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i6++;
                            } else if (interpolator != null) {
                                int i7 = qnHx.a;
                                if ((i7 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) qnHx).topMargin + ((LinearLayout.LayoutParams) qnHx).bottomMargin + 0;
                                    if ((i7 & 2) != 0) {
                                        Field field = bi5.a;
                                        topInset -= bi5.LPt8Fixed.d(childAt);
                                    }
                                } else {
                                    topInset = 0;
                                }
                                Field field2 = bi5.a;
                                if (bi5.LPt8Fixed.b(childAt)) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iM);
                                    break;
                                }
                            }
                        }
                        top = iM;
                        break;
                    }
                    oj5 oj5Var = this.a;
                    if (oj5Var != null) {
                        if (oj5Var.d != top) {
                            oj5Var.d = top;
                            oj5Var.a();
                            z = true;
                        }
                        int i8 = iX - iM;
                        this.j = iM - top;
                        if (!z && appBarLayout.A && (list = (List) ((ok4) coordinatorLayout.x.b).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                            for (i4 = 0; i4 < list.size(); i4++) {
                                view2 = (View) list.get(i4);
                                f1 = ((CoordinatorLayout.YKK) view2.getLayoutParams()).a;
                                if (f1 != null) {
                                    f1.d(coordinatorLayout, view2, appBarLayout);
                                }
                            }
                        }
                        appBarLayout.w = s();
                        if (!appBarLayout.willNotDraw()) {
                            Field field3 = bi5.a;
                            bi5.LPt8Fixed.k(appBarLayout);
                        }
                        G(coordinatorLayout, appBarLayout, iM, iM < iX ? -1 : 1, false);
                        i5 = i8;
                    } else {
                        this.b = top;
                    }
                    z = false;
                    int i9 = iX - iM;
                    this.j = iM - top;
                    if (!z) {
                        while (i4 < list.size()) {
                            view2 = (View) list.get(i4);
                            f1 = ((CoordinatorLayout.YKK) view2.getLayoutParams()).a;
                            if (f1 != null) {
                                f1.d(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.w = s();
                    if (!appBarLayout.willNotDraw()) {
                        Field field4 = bi5.a;
                        bi5.LPt8Fixed.k(appBarLayout);
                    }
                    G(coordinatorLayout, appBarLayout, iM, iM < iX ? -1 : 1, false);
                    i5 = i9;
                }
            }
            F(coordinatorLayout, appBarLayout);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = -1;
        }

        public static class QnHx extends defpackage.CQf {
            public static final Parcelable.Creator<QnHx> CREATOR = new C0077QnHx();
            public boolean A;
            public int y;
            public float z;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$QnHx$QnHx, reason: collision with other inner class name */
            public static class C0077QnHx implements Parcelable.ClassLoaderCreator<QnHx> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final QnHx createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new QnHx(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QnHx[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new QnHx(parcel, null);
                }
            }

            public QnHx(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.y = parcel.readInt();
                this.z = parcel.readFloat();
                this.A = parcel.readByte() != 0;
            }

            @Override // defpackage.CQf, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.w, i);
                parcel.writeInt(this.y);
                parcel.writeFloat(this.z);
                parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
            }

            public QnHx(AbsSavedState absSavedState) {
                super(absSavedState);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new QnHx();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new QnHx(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new QnHx(getContext(), attributeSet);
    }

    public static class QnHx extends LinearLayout.LayoutParams {
        public final int a;
        public final Interpolator b;

        public QnHx(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.x);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public QnHx() {
            super(-1, -2);
            this.a = 1;
        }

        public QnHx(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public QnHx(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public QnHx(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}
