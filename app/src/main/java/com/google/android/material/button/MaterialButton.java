package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.C0239D;
import defpackage.ExAS;
import defpackage.Th;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.c65;
import defpackage.ej4;
import defpackage.ij4;
import defpackage.ja2;
import defpackage.la2;
import defpackage.m65;
import defpackage.qa2;
import defpackage.uo0;
import defpackage.x92;
import defpackage.xj5;
import defpackage.ys3;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends ExAS implements Checkable, ij4 {
    public static final int[] M = {R.attr.state_checkable};
    public static final int[] N = {R.attr.state_checked};
    public final LinkedHashSet<QnHx> A;
    public CQf B;
    public PorterDuff.Mode C;
    public ColorStateList D;
    public Drawable E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public final x92 z;

    public interface CQf {
    }

    public static class F1 extends defpackage.CQf {
        public static final Parcelable.Creator<F1> CREATOR = new QnHx();
        public boolean y;

        public static class QnHx implements Parcelable.ClassLoaderCreator<F1> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final F1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new F1(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new F1[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new F1(parcel, null);
            }
        }

        public F1(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            parcel.writeInt(this.y ? 1 : 0);
        }

        public F1(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                F1.class.getClassLoader();
            }
            this.y = parcel.readInt() == 1;
        }
    }

    public interface QnHx {
        void a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(qa2.a(context, attributeSet, com.azefsw.audioconnect.R.attr.materialButtonStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Button), attributeSet, com.azefsw.audioconnect.R.attr.materialButtonStyle);
        this.A = new LinkedHashSet<>();
        this.J = false;
        this.K = false;
        Context context2 = getContext();
        TypedArray typedArrayD = m65.d(context2, attributeSet, Th.H, com.azefsw.audioconnect.R.attr.materialButtonStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.I = typedArrayD.getDimensionPixelSize(12, 0);
        this.C = xj5.b(typedArrayD.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.D = ja2.b(getContext(), typedArrayD, 14);
        this.E = ja2.c(getContext(), typedArrayD, 10);
        this.L = typedArrayD.getInteger(11, 1);
        this.F = typedArrayD.getDimensionPixelSize(13, 0);
        x92 x92Var = new x92(this, new ej4(ej4.b(context2, attributeSet, com.azefsw.audioconnect.R.attr.materialButtonStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Button)));
        this.z = x92Var;
        x92Var.c = typedArrayD.getDimensionPixelOffset(1, 0);
        x92Var.d = typedArrayD.getDimensionPixelOffset(2, 0);
        x92Var.e = typedArrayD.getDimensionPixelOffset(3, 0);
        x92Var.f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            x92Var.g = dimensionPixelSize;
            ej4 ej4Var = x92Var.b;
            float f = dimensionPixelSize;
            ej4Var.getClass();
            ej4.QnHx qnHx = new ej4.QnHx(ej4Var);
            qnHx.e = new defpackage.F1(f);
            qnHx.f = new defpackage.F1(f);
            qnHx.g = new defpackage.F1(f);
            qnHx.h = new defpackage.F1(f);
            x92Var.c(new ej4(qnHx));
            x92Var.p = true;
        }
        x92Var.h = typedArrayD.getDimensionPixelSize(20, 0);
        x92Var.i = xj5.b(typedArrayD.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        x92Var.j = ja2.b(getContext(), typedArrayD, 6);
        x92Var.k = ja2.b(getContext(), typedArrayD, 19);
        x92Var.l = ja2.b(getContext(), typedArrayD, 16);
        x92Var.q = typedArrayD.getBoolean(5, false);
        x92Var.s = typedArrayD.getDimensionPixelSize(9, 0);
        Field field = bi5.a;
        int iF = bi5.NUlFixed.f(this);
        int paddingTop = getPaddingTop();
        int iE = bi5.NUlFixed.e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            x92Var.o = true;
            setSupportBackgroundTintList(x92Var.j);
            setSupportBackgroundTintMode(x92Var.i);
        } else {
            x92Var.e();
        }
        bi5.NUlFixed.k(this, iF + x92Var.c, paddingTop + x92Var.e, iE + x92Var.d, paddingBottom + x92Var.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.I);
        c(this.E != null);
    }

    private String getA11yClassName() {
        x92 x92Var = this.z;
        return (x92Var != null && x92Var.q ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        x92 x92Var = this.z;
        return (x92Var == null || x92Var.o) ? false : true;
    }

    public final void b() {
        int i = this.L;
        if (i == 1 || i == 2) {
            c65.CQf.e(this, this.E, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            c65.CQf.e(this, null, null, this.E, null);
            return;
        }
        if (i == 16 || i == 32) {
            c65.CQf.e(this, null, this.E, null, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    public final void c(boolean z) {
        Drawable drawable = this.E;
        if (drawable != null) {
            Drawable drawableMutate = uo0.g(drawable).mutate();
            this.E = drawableMutate;
            uo0.CQf.h(drawableMutate, this.D);
            PorterDuff.Mode mode = this.C;
            if (mode != null) {
                uo0.CQf.i(this.E, mode);
            }
            int intrinsicWidth = this.F;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.E.getIntrinsicWidth();
            }
            int intrinsicHeight = this.F;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.E.getIntrinsicHeight();
            }
            Drawable drawable2 = this.E;
            int i = this.G;
            int i2 = this.H;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] drawableArrA = c65.CQf.a(this);
        boolean z2 = false;
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        int i3 = this.L;
        if (!(i3 == 1 || i3 == 2) || drawable3 == this.E) {
            if (!(i3 == 3 || i3 == 4) || drawable5 == this.E) {
                if ((i3 == 16 || i3 == 32) && drawable4 != this.E) {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z2) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.E == null || getLayout() == null) {
            return;
        }
        int i3 = this.L;
        boolean z = true;
        if (!(i3 == 1 || i3 == 2)) {
            if (!(i3 == 3 || i3 == 4)) {
                if (i3 != 16 && i3 != 32) {
                    z = false;
                }
                if (z) {
                    this.G = 0;
                    if (i3 == 16) {
                        this.H = 0;
                        c(false);
                        return;
                    }
                    int intrinsicHeight = this.F;
                    if (intrinsicHeight == 0) {
                        intrinsicHeight = this.E.getIntrinsicHeight();
                    }
                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.I) - getPaddingBottom()) / 2;
                    if (this.H != textHeight) {
                        this.H = textHeight;
                        c(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.H = 0;
        if (i3 == 1 || i3 == 3) {
            this.G = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.F;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.E.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        Field field = bi5.a;
        int iE = ((((textWidth - bi5.NUlFixed.e(this)) - intrinsicWidth) - this.I) - bi5.NUlFixed.f(this)) / 2;
        if ((bi5.NUlFixed.d(this) == 1) != (this.L == 4)) {
            iE = -iE;
        }
        if (this.G != iE) {
            this.G = iE;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.z.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.E;
    }

    public int getIconGravity() {
        return this.L;
    }

    public int getIconPadding() {
        return this.I;
    }

    public int getIconSize() {
        return this.F;
    }

    public ColorStateList getIconTint() {
        return this.D;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.C;
    }

    public int getInsetBottom() {
        return this.z.f;
    }

    public int getInsetTop() {
        return this.z.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.z.l;
        }
        return null;
    }

    public ej4 getShapeAppearanceModel() {
        if (a()) {
            return this.z.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.z.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.z.h;
        }
        return 0;
    }

    @Override // defpackage.ExAS
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.z.j : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.ExAS
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.z.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.J;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            C0239D.G(this, this.z.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        x92 x92Var = this.z;
        if (x92Var != null && x92Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, N);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.ExAS, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // defpackage.ExAS, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        x92 x92Var = this.z;
        accessibilityNodeInfo.setCheckable(x92Var != null && x92Var.q);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.ExAS, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        x92 x92Var;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (x92Var = this.z) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        la2 la2Var = x92Var.m;
        if (la2Var != null) {
            la2Var.setBounds(x92Var.c, x92Var.e, i6 - x92Var.d, i5 - x92Var.f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof F1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F1 f1 = (F1) parcelable;
        super.onRestoreInstanceState(f1.w);
        setChecked(f1.y);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        F1 f1 = new F1(super.onSaveInstanceState());
        f1.y = this.J;
        return f1;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // defpackage.ExAS, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        x92 x92Var = this.z;
        if (x92Var.b(false) != null) {
            x92Var.b(false).setTint(i);
        }
    }

    @Override // defpackage.ExAS, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        x92 x92Var = this.z;
        x92Var.o = true;
        ColorStateList colorStateList = x92Var.j;
        MaterialButton materialButton = x92Var.a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(x92Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.ExAS, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? XTd3.l(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.z.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        x92 x92Var = this.z;
        if ((x92Var != null && x92Var.q) && isEnabled() && this.J != z) {
            this.J = z;
            refreshDrawableState();
            if (this.K) {
                return;
            }
            this.K = true;
            Iterator<QnHx> it = this.A.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.J);
            }
            this.K = false;
        }
    }

    public void setCornerRadius(int i) {
        if (a()) {
            x92 x92Var = this.z;
            if (x92Var.p && x92Var.g == i) {
                return;
            }
            x92Var.g = i;
            x92Var.p = true;
            ej4 ej4Var = x92Var.b;
            float f = i;
            ej4Var.getClass();
            ej4.QnHx qnHx = new ej4.QnHx(ej4Var);
            qnHx.e = new defpackage.F1(f);
            qnHx.f = new defpackage.F1(f);
            qnHx.g = new defpackage.F1(f);
            qnHx.h = new defpackage.F1(f);
            x92Var.c(new ej4(qnHx));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.z.b(false).i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.E != drawable) {
            this.E = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.L != i) {
            this.L = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.I != i) {
            this.I = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? XTd3.l(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.F != i) {
            this.F = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.C != mode) {
            this.C = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(XTd3.k(getContext(), i));
    }

    public void setInsetBottom(int i) {
        x92 x92Var = this.z;
        x92Var.d(x92Var.e, i);
    }

    public void setInsetTop(int i) {
        x92 x92Var = this.z;
        x92Var.d(i, x92Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(CQf cQf) {
        this.B = cQf;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        CQf cQf = this.B;
        if (cQf != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            x92 x92Var = this.z;
            if (x92Var.l != colorStateList) {
                x92Var.l = colorStateList;
                MaterialButton materialButton = x92Var.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ys3.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(XTd3.k(getContext(), i));
        }
    }

    @Override // defpackage.ij4
    public void setShapeAppearanceModel(ej4 ej4Var) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.z.c(ej4Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            x92 x92Var = this.z;
            x92Var.n = z;
            x92Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            x92 x92Var = this.z;
            if (x92Var.k != colorStateList) {
                x92Var.k = colorStateList;
                x92Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(XTd3.k(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            x92 x92Var = this.z;
            if (x92Var.h != i) {
                x92Var.h = i;
                x92Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.ExAS
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        x92 x92Var = this.z;
        if (x92Var.j != colorStateList) {
            x92Var.j = colorStateList;
            if (x92Var.b(false) != null) {
                uo0.CQf.h(x92Var.b(false), x92Var.j);
            }
        }
    }

    @Override // defpackage.ExAS
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        x92 x92Var = this.z;
        if (x92Var.i != mode) {
            x92Var.i = mode;
            if (x92Var.b(false) == null || x92Var.i == null) {
                return;
            }
            uo0.CQf.i(x92Var.b(false), x92Var.i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.J);
    }
}
