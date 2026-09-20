package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.azefsw.audioconnect.R;
import defpackage.C0239D;
import defpackage.Th;
import defpackage.bi5;
import defpackage.la2;
import defpackage.m65;
import defpackage.qa2;
import defpackage.uo0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    public Integer m0;
    public boolean n0;
    public boolean o0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(qa2.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayD = m65.d(context2, attributeSet, Th.O, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayD.hasValue(0)) {
            setNavigationIconTint(typedArrayD.getColor(0, -1));
        }
        this.n0 = typedArrayD.getBoolean(2, false);
        this.o0 = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            la2 la2Var = new la2();
            la2Var.j(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            la2Var.h(context2);
            Field field = bi5.a;
            la2Var.i(bi5.byN.i(this));
            bi5.LPt8Fixed.q(this, la2Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof la2) {
            C0239D.G(this, (la2) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.n0 || this.o0) {
            TextView textViewL = Th.l(this, getTitle());
            TextView textViewL2 = Th.l(this, getSubtitle());
            if (textViewL == null && textViewL2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i5 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && childAt != textViewL && childAt != textViewL2) {
                    if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.n0 && textViewL != null) {
                s(textViewL, pair);
            }
            if (!this.o0 || textViewL2 == null) {
                return;
            }
            s(textViewL2, pair);
        }
    }

    public final void s(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof la2) {
            ((la2) background).i(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.m0 != null) {
            drawable = uo0.g(drawable);
            uo0.CQf.g(drawable, this.m0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.m0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.o0 != z) {
            this.o0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            requestLayout();
        }
    }
}
