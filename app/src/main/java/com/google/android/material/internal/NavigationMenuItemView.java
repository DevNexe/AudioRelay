package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.YKK;
import androidx.appcompat.view.menu.byN;
import androidx.appcompat.widget.CQf;
import defpackage.UT;
import defpackage.bi5;
import defpackage.c65;
import defpackage.d_OZ;
import defpackage.h51;
import defpackage.sp3;
import defpackage.t85;
import defpackage.uo0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends h51 implements byN.QnHx {
    public static final int[] e0 = {R.attr.state_checked};
    public int R;
    public boolean S;
    public boolean T;
    public final CheckedTextView U;
    public FrameLayout V;
    public YKK W;
    public ColorStateList a0;
    public boolean b0;
    public Drawable c0;
    public final QnHx d0;

    public class QnHx extends d_OZ {
        public QnHx() {
        }

        @Override // defpackage.d_OZ
        public final void d(View view, UT ut) {
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.T);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.V == null) {
                this.V = (FrameLayout) ((ViewStub) findViewById(com.azefsw.audioconnect.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.V.removeAllViews();
            this.V.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.byN.QnHx
    public final void c(YKK ykk) {
        StateListDrawable stateListDrawable;
        this.W = ykk;
        int i = ykk.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(ykk.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.azefsw.audioconnect.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = bi5.a;
            bi5.LPt8Fixed.q(this, stateListDrawable);
        }
        setCheckable(ykk.isCheckable());
        setChecked(ykk.isChecked());
        setEnabled(ykk.isEnabled());
        setTitle(ykk.e);
        setIcon(ykk.getIcon());
        setActionView(ykk.getActionView());
        setContentDescription(ykk.q);
        t85.a(this, ykk.r);
        YKK ykk2 = this.W;
        boolean z = ykk2.e == null && ykk2.getIcon() == null && this.W.getActionView() != null;
        CheckedTextView checkedTextView = this.U;
        if (z) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.V;
            if (frameLayout != null) {
                CQf.QnHx qnHx = (CQf.QnHx) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) qnHx).width = -1;
                this.V.setLayoutParams(qnHx);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.V;
        if (frameLayout2 != null) {
            CQf.QnHx qnHx2 = (CQf.QnHx) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) qnHx2).width = -2;
            this.V.setLayoutParams(qnHx2);
        }
    }

    @Override // androidx.appcompat.view.menu.byN.QnHx
    public YKK getItemData() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        YKK ykk = this.W;
        if (ykk != null && ykk.isCheckable() && this.W.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, e0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.T != z) {
            this.T = z;
            this.d0.h(this.U, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.U.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.b0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = uo0.g(drawable).mutate();
                uo0.CQf.h(drawable, this.a0);
            }
            int i = this.R;
            drawable.setBounds(0, 0, i, i);
        } else if (this.S) {
            if (this.c0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = sp3.a;
                Drawable drawableA = sp3.QnHx.a(resources, com.azefsw.audioconnect.R.drawable.navigation_empty_icon, theme);
                this.c0 = drawableA;
                if (drawableA != null) {
                    int i2 = this.R;
                    drawableA.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.c0;
        }
        c65.CQf.e(this.U, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.U.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.R = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.a0 = colorStateList;
        this.b0 = colorStateList != null;
        YKK ykk = this.W;
        if (ykk != null) {
            setIcon(ykk.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.U.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.S = z;
    }

    public void setTextAppearance(int i) {
        c65.e(this.U, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.U.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.U.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        QnHx qnHx = new QnHx();
        this.d0 = qnHx;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.azefsw.audioconnect.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.azefsw.audioconnect.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.azefsw.audioconnect.R.id.design_menu_item_text);
        this.U = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        bi5.m(checkedTextView, qnHx);
    }
}
