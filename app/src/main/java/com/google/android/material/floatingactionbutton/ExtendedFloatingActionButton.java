package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.Th;
import defpackage.bi5;
import defpackage.eh2;
import defpackage.wj0;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.CQf {
    public static final /* synthetic */ int O = 0;

    public static class CQf extends Property<View, Float> {
        public CQf() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    public static class F1 extends Property<View, Float> {
        public F1() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            Field field = bi5.a;
            return Float.valueOf(bi5.NUlFixed.f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            Field field = bi5.a;
            bi5.NUlFixed.k(view2, iIntValue, paddingTop, bi5.NUlFixed.e(view2), view2.getPaddingBottom());
        }
    }

    public static class LPt8Fixed extends Property<View, Float> {
        public LPt8Fixed() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            Field field = bi5.a;
            return Float.valueOf(bi5.NUlFixed.e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            Field field = bi5.a;
            bi5.NUlFixed.k(view2, bi5.NUlFixed.f(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    public static class QnHx extends Property<View, Float> {
        public QnHx() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    static {
        new QnHx();
        new CQf();
        new F1();
        new LPt8Fixed();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.CQf
    public CoordinatorLayout.F1<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public eh2 getExtendMotionSpec() {
        throw null;
    }

    public eh2 getHideMotionSpec() {
        throw null;
    }

    public eh2 getShowMotionSpec() {
        throw null;
    }

    public eh2 getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(eh2 eh2Var) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(eh2.a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(eh2 eh2Var) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(eh2.a(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setShowMotionSpec(eh2 eh2Var) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(eh2.a(getContext(), i));
    }

    public void setShrinkMotionSpec(eh2 eh2Var) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(eh2.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.F1<T> {
        public Rect a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final /* bridge */ /* synthetic */ boolean a(View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final void c(CoordinatorLayout.YKK ykk) {
            if (ykk.h == 0) {
                ykk.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.YKK ? ((CoordinatorLayout.YKK) layoutParams).a instanceof BottomSheetBehavior : false) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListJ = coordinatorLayout.j(extendedFloatingActionButton);
            int size = arrayListJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListJ.get(i2);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.YKK ? ((CoordinatorLayout.YKK) layoutParams).a instanceof BottomSheetBehavior : false) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.YKK ykk = (CoordinatorLayout.YKK) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if (!((z || z2) && ykk.f == appBarLayout.getId())) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            wj0.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (z2) {
                    int i = ExtendedFloatingActionButton.O;
                    throw null;
                }
                int i2 = ExtendedFloatingActionButton.O;
                throw null;
            }
            if (z2) {
                int i3 = ExtendedFloatingActionButton.O;
                throw null;
            }
            int i4 = ExtendedFloatingActionButton.O;
            throw null;
        }

        public final boolean t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.YKK ykk = (CoordinatorLayout.YKK) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if (!((z || z2) && ykk.f == view.getId())) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.YKK) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (z2) {
                    int i = ExtendedFloatingActionButton.O;
                    throw null;
                }
                int i2 = ExtendedFloatingActionButton.O;
                throw null;
            }
            if (z2) {
                int i3 = ExtendedFloatingActionButton.O;
                throw null;
            }
            int i4 = ExtendedFloatingActionButton.O;
            throw null;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.D);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
