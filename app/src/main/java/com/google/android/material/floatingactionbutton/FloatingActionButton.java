package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.azefsw.audioconnect.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.Mt0;
import defpackage.Th;
import defpackage.bi5;
import defpackage.cj4;
import defpackage.eh2;
import defpackage.ej4;
import defpackage.fz0;
import defpackage.gz0;
import defpackage.ij4;
import defpackage.jk5;
import defpackage.ok4;
import defpackage.qv0;
import defpackage.rd;
import defpackage.tv0;
import defpackage.ud;
import defpackage.uo0;
import defpackage.wj0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class FloatingActionButton extends jk5 implements qv0, ij4, CoordinatorLayout.CQf {
    public PorterDuff.Mode A;
    public ColorStateList B;
    public int C;
    public int D;
    public boolean E;
    public gz0 F;
    public ColorStateList x;
    public PorterDuff.Mode y;
    public ColorStateList z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class CQf implements cj4 {
        public CQf() {
        }
    }

    public class F1<T extends FloatingActionButton> implements LPt8Fixed.NUlFixed {
        public F1(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.LPt8Fixed.NUlFixed
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.LPt8Fixed.NUlFixed
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof F1)) {
                return false;
            }
            ((F1) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static abstract class QnHx {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    private LPt8Fixed getImpl() {
        if (this.F == null) {
            this.F = new gz0(this, new CQf());
        }
        return this.F;
    }

    @Override // defpackage.qv0
    public final boolean a() {
        throw null;
    }

    public final void c() {
        LPt8Fixed impl = getImpl();
        if (impl.p == null) {
            impl.p = new ArrayList<>();
        }
        impl.p.add(null);
    }

    public final void d(ud udVar) {
        LPt8Fixed impl = getImpl();
        if (impl.o == null) {
            impl.o = new ArrayList<>();
        }
        impl.o.add(udVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().g(getDrawableState());
    }

    public final void e() {
        LPt8Fixed impl = getImpl();
        F1 f1 = new F1(this);
        if (impl.q == null) {
            impl.q = new ArrayList<>();
        }
        impl.q.add(f1);
    }

    public final int f(int i) {
        int i2 = this.D;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    public final void g(rd rdVar, boolean z) {
        LPt8Fixed impl = getImpl();
        com.google.android.material.floatingactionbutton.QnHx qnHx = rdVar == null ? null : new com.google.android.material.floatingactionbutton.QnHx(this, rdVar);
        boolean z2 = false;
        if (impl.r.getVisibility() != 0 ? impl.n != 2 : impl.n == 1) {
            return;
        }
        Animator animator = impl.i;
        if (animator != null) {
            animator.cancel();
        }
        Field field = bi5.a;
        FloatingActionButton floatingActionButton = impl.r;
        if (bi5.auxFixed.c(floatingActionButton) && !floatingActionButton.isInEditMode()) {
            z2 = true;
        }
        if (!z2) {
            floatingActionButton.b(z ? 8 : 4, z);
            if (qnHx != null) {
                qnHx.a.a(qnHx.b);
                return;
            }
            return;
        }
        eh2 eh2Var = impl.k;
        if (eh2Var == null) {
            if (impl.h == null) {
                impl.h = eh2.a(floatingActionButton.getContext(), R.animator.design_fab_hide_motion_spec);
            }
            eh2Var = impl.h;
            eh2Var.getClass();
        }
        AnimatorSet animatorSetA = impl.a(eh2Var, 0.0f, 0.0f, 0.0f);
        animatorSetA.addListener(new com.google.android.material.floatingactionbutton.CQf(impl, z, qnHx));
        ArrayList<Animator.AnimatorListener> arrayList = impl.p;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetA.addListener(it.next());
            }
        }
        animatorSetA.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.x;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.y;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.CQf
    public CoordinatorLayout.F1<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.D;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public eh2 getHideMotionSpec() {
        return getImpl().k;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.B;
    }

    public ej4 getShapeAppearanceModel() {
        ej4 ej4Var = getImpl().a;
        ej4Var.getClass();
        return ej4Var;
    }

    public eh2 getShowMotionSpec() {
        return getImpl().j;
    }

    public int getSize() {
        return this.C;
    }

    public int getSizeDimension() {
        return f(this.C);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.z;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.A;
    }

    public boolean getUseCompatPadding() {
        return this.E;
    }

    public final boolean h() {
        LPt8Fixed impl = getImpl();
        if (impl.r.getVisibility() == 0) {
            if (impl.n == 1) {
                return true;
            }
        } else if (impl.n != 2) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        LPt8Fixed impl = getImpl();
        if (impl.r.getVisibility() != 0) {
            if (impl.n == 2) {
                return true;
            }
        } else if (impl.n != 1) {
            return true;
        }
        return false;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.z;
        if (colorStateList == null) {
            uo0.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.A;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(Mt0.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().e();
    }

    public final void k(rd.QnHx qnHx, boolean z) {
        LPt8Fixed impl = getImpl();
        com.google.android.material.floatingactionbutton.QnHx qnHx2 = qnHx == null ? null : new com.google.android.material.floatingactionbutton.QnHx(this, qnHx);
        if (impl.r.getVisibility() == 0 ? impl.n != 1 : impl.n == 2) {
            return;
        }
        Animator animator = impl.i;
        if (animator != null) {
            animator.cancel();
        }
        Field field = bi5.a;
        FloatingActionButton floatingActionButton = impl.r;
        boolean z2 = bi5.auxFixed.c(floatingActionButton) && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.u;
        if (!z2) {
            floatingActionButton.b(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.m = 1.0f;
            matrix.reset();
            floatingActionButton.getDrawable();
            floatingActionButton.setImageMatrix(matrix);
            if (qnHx2 != null) {
                qnHx2.a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(0.0f);
            floatingActionButton.setScaleX(0.0f);
            impl.m = 0.0f;
            matrix.reset();
            floatingActionButton.getDrawable();
            floatingActionButton.setImageMatrix(matrix);
        }
        eh2 eh2Var = impl.j;
        if (eh2Var == null) {
            if (impl.g == null) {
                impl.g = eh2.a(floatingActionButton.getContext(), R.animator.design_fab_show_motion_spec);
            }
            eh2Var = impl.g;
            eh2Var.getClass();
        }
        AnimatorSet animatorSetA = impl.a(eh2Var, 1.0f, 1.0f, 1.0f);
        animatorSetA.addListener(new com.google.android.material.floatingactionbutton.F1(impl, z, qnHx2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.o;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetA.addListener(it.next());
            }
        }
        animatorSetA.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LPt8Fixed impl = getImpl();
        impl.getClass();
        if (!(impl instanceof gz0)) {
            ViewTreeObserver viewTreeObserver = impl.r.getViewTreeObserver();
            if (impl.v == null) {
                impl.v = new fz0(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.v);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LPt8Fixed impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.r.getViewTreeObserver();
        fz0 fz0Var = impl.v;
        if (fz0Var != null) {
            viewTreeObserver.removeOnPreDrawListener(fz0Var);
            impl.v = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = (getSizeDimension() + 0) / 2;
        getImpl().l();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof tv0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tv0 tv0Var = (tv0) parcelable;
        super.onRestoreInstanceState(tv0Var.w);
        tv0Var.y.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        new ok4();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Field field = bi5.a;
            if (bi5.auxFixed.c(this)) {
                getWidth();
                getHeight();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.y != mode) {
            this.y = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        LPt8Fixed impl = getImpl();
        if (impl.d != f) {
            impl.d = f;
            impl.h(f, impl.e, impl.f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        LPt8Fixed impl = getImpl();
        if (impl.e != f) {
            impl.e = f;
            impl.h(impl.d, f, impl.f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        LPt8Fixed impl = getImpl();
        if (impl.f != f) {
            impl.f = f;
            impl.h(impl.d, impl.e, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.D) {
            this.D = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().b) {
            getImpl().b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(eh2 eh2Var) {
        getImpl().k = eh2Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(eh2.a(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            LPt8Fixed impl = getImpl();
            impl.m = impl.m;
            Matrix matrix = impl.u;
            matrix.reset();
            FloatingActionButton floatingActionButton = impl.r;
            floatingActionButton.getDrawable();
            floatingActionButton.setImageMatrix(matrix);
            if (this.z != null) {
                j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<LPt8Fixed.NUlFixed> arrayList = getImpl().q;
        if (arrayList != null) {
            Iterator<LPt8Fixed.NUlFixed> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<LPt8Fixed.NUlFixed> arrayList = getImpl().q;
        if (arrayList != null) {
            Iterator<LPt8Fixed.NUlFixed> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        LPt8Fixed impl = getImpl();
        impl.c = z;
        impl.l();
        throw null;
    }

    @Override // defpackage.ij4
    public void setShapeAppearanceModel(ej4 ej4Var) {
        getImpl().a = ej4Var;
    }

    public void setShowMotionSpec(eh2 eh2Var) {
        getImpl().j = eh2Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(eh2.a(getContext(), i));
    }

    public void setSize(int i) {
        this.D = 0;
        if (i != this.C) {
            this.C = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.A != mode) {
            this.A = mode;
            j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().i();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().i();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().i();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.E != z) {
            this.E = z;
            getImpl().f();
        }
    }

    @Override // defpackage.jk5, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.F1<T> {
        public Rect a;
        public final boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final void c(CoordinatorLayout.YKK ykk) {
            if (ykk.h == 0) {
                ykk.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.YKK ? ((CoordinatorLayout.YKK) layoutParams).a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListJ = coordinatorLayout.j(floatingActionButton);
            int size = arrayListJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListJ.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.YKK ? ((CoordinatorLayout.YKK) layoutParams).a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((CoordinatorLayout.YKK) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            wj0.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.k(null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.YKK) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.g(null, false);
                return true;
            }
            floatingActionButton.k(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.E);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            getImpl().j();
        }
    }
}
