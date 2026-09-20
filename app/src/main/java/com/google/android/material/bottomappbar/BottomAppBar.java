package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.C0239D;
import defpackage.bi5;
import defpackage.ok4;
import defpackage.pd;
import defpackage.rd;
import defpackage.sd;
import defpackage.td;
import defpackage.ud;
import defpackage.uo0;
import defpackage.wd;
import defpackage.xj5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.CQf {
    public static final /* synthetic */ int u0 = 0;
    public Animator m0;
    public Animator n0;
    public int o0;
    public int p0;
    public boolean q0;
    public int r0;
    public boolean s0;
    public Behavior t0;

    public static class CQf extends defpackage.CQf {
        public static final Parcelable.Creator<CQf> CREATOR = new QnHx();
        public int y;
        public boolean z;

        public static class QnHx implements Parcelable.ClassLoaderCreator<CQf> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final CQf createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new CQf(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CQf[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new CQf(parcel, null);
            }
        }

        public CQf(Toolbar.auxFixed auxVar) {
            super(auxVar);
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            parcel.writeInt(this.y);
            parcel.writeInt(this.z ? 1 : 0);
        }

        public CQf(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.y = parcel.readInt();
            this.z = parcel.readInt() != 0;
        }
    }

    public class QnHx implements Runnable {
        public final /* synthetic */ ActionMenuView w;
        public final /* synthetic */ int x;
        public final /* synthetic */ boolean y;

        public QnHx(ActionMenuView actionMenuView, int i, boolean z) {
            this.w = actionMenuView;
            this.x = i;
            this.y = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.x;
            boolean z = this.y;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.w;
            actionMenuView.setTranslationX(bottomAppBar.t(actionMenuView, i, z));
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return u(this.o0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().y;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private wd getTopEdgeTreatment() {
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().y;
    }

    public int getFabAlignmentMode() {
        return this.o0;
    }

    public int getFabAnimationMode() {
        return this.p0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().x;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().w;
    }

    public boolean getHideOnScroll() {
        return this.q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0239D.G(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.n0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.m0;
            if (animator2 != null) {
                animator2.cancel();
            }
            v();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.n0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        View viewS = s();
        FloatingActionButton floatingActionButton = viewS instanceof FloatingActionButton ? (FloatingActionButton) viewS : null;
        if (floatingActionButton != null && floatingActionButton.i()) {
            w(actionMenuView, this.o0, this.s0, false);
        } else {
            w(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CQf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CQf cQf = (CQf) parcelable;
        super.onRestoreInstanceState(cQf.w);
        this.o0 = cQf.y;
        this.s0 = cQf.z;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        CQf cQf = new CQf((Toolbar.auxFixed) super.onSaveInstanceState());
        cQf.y = this.o0;
        cQf.z = this.s0;
        return cQf;
    }

    public final View s() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((ok4) coordinatorLayout.x.b).getOrDefault(this, null);
        ArrayList<View> arrayList = coordinatorLayout.z;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        for (View view : arrayList) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        uo0.CQf.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            wd topEdgeTreatment = getTopEdgeTreatment();
            if (f >= 0.0f) {
                topEdgeTreatment.y = f;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        this.r0 = 0;
        boolean z = this.s0;
        Field field = bi5.a;
        if (bi5.auxFixed.c(this)) {
            Animator animator = this.n0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            View viewS = s();
            FloatingActionButton floatingActionButton = viewS instanceof FloatingActionButton ? (FloatingActionButton) viewS : null;
            if (floatingActionButton != null && floatingActionButton.i()) {
                i2 = i;
            } else {
                z = false;
                i2 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - t(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.addListener(new td(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.n0 = animatorSet2;
            animatorSet2.addListener(new sd(this));
            this.n0.start();
        } else {
            int i3 = this.r0;
            if (i3 != 0) {
                this.r0 = 0;
                getMenu().clear();
                k(i3);
            }
        }
        if (this.o0 != i && bi5.auxFixed.c(this)) {
            Animator animator2 = this.m0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.p0 == 1) {
                View viewS2 = s();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewS2 instanceof FloatingActionButton ? (FloatingActionButton) viewS2 : null, "translationX", u(i));
                objectAnimatorOfFloat3.setDuration(300L);
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewS3 = s();
                FloatingActionButton floatingActionButton2 = viewS3 instanceof FloatingActionButton ? (FloatingActionButton) viewS3 : null;
                if (floatingActionButton2 != null && !floatingActionButton2.h()) {
                    floatingActionButton2.g(new rd(this, i), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.m0 = animatorSet3;
            animatorSet3.addListener(new pd(this));
            this.m0.start();
        }
        this.o0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.p0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().z) {
            return;
        }
        getTopEdgeTreatment().z = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().x = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().w = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.q0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final int t(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean zA = xj5.a(this);
        int measuredWidth = zA ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.NUlFixed) && (((Toolbar.NUlFixed) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = zA ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zA ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float u(int i) {
        boolean zA = xj5.a(this);
        if (i == 1) {
            return ((getMeasuredWidth() / 2) + 0) * (zA ? -1 : 1);
        }
        return 0.0f;
    }

    public final void v() {
        wd topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        s();
        if (!this.s0) {
            throw null;
        }
        View viewS = s();
        FloatingActionButton floatingActionButton = viewS instanceof FloatingActionButton ? (FloatingActionButton) viewS : null;
        if (floatingActionButton == null) {
            throw null;
        }
        floatingActionButton.i();
        throw null;
    }

    public final void w(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        QnHx qnHx = new QnHx(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(qnHx);
        } else {
            qnHx.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.CQf
    public Behavior getBehavior() {
        if (this.t0 == null) {
            this.t0 = new Behavior();
        }
        return this.t0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public final QnHx g;

        public class QnHx implements View.OnLayoutChangeListener {
            public QnHx() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                if (behavior.f.get() == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                } else {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
            }
        }

        public Behavior() {
            this.g = new QnHx();
            this.e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.u0;
            View viewS = bottomAppBar.s();
            if (viewS != null) {
                Field field = bi5.a;
                if (!bi5.auxFixed.c(viewS)) {
                    ((CoordinatorLayout.YKK) viewS.getLayoutParams()).d = 49;
                    if (viewS instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewS;
                        floatingActionButton.addOnLayoutChangeListener(this.g);
                        floatingActionButton.c();
                        floatingActionButton.d(new ud(bottomAppBar));
                        floatingActionButton.e();
                    }
                    bottomAppBar.v();
                    throw null;
                }
            }
            coordinatorLayout.q(bottomAppBar, i);
            super.h(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g = new QnHx();
            this.e = new Rect();
        }
    }
}
