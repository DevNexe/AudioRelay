package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.azefsw.audioconnect.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class u8 extends FrameLayout {
    public static final QnHx B = new QnHx();
    public PorterDuff.Mode A;
    public int w;
    public final float x;
    public final float y;
    public ColorStateList z;

    public static class QnHx implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public u8(Context context, AttributeSet attributeSet) {
        Drawable drawableG;
        super(qa2.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Th.S);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            Field field = bi5.a;
            bi5.byN.s(this, dimensionPixelSize);
        }
        this.w = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.x = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(ja2.b(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(xj5.b(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.y = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(B);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(X.x(getBackgroundOverlayColorAlpha(), X.t(this, R.attr.colorSurface), X.t(this, R.attr.colorOnSurface)));
            if (this.z != null) {
                drawableG = uo0.g(gradientDrawable);
                uo0.CQf.h(drawableG, this.z);
            } else {
                drawableG = uo0.g(gradientDrawable);
            }
            Field field2 = bi5.a;
            bi5.LPt8Fixed.q(this, drawableG);
        }
    }

    public float getActionTextColorAlpha() {
        return this.y;
    }

    public int getAnimationMode() {
        return this.w;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field field = bi5.a;
        bi5.T23.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAnimationMode(int i) {
        this.w = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.z != null) {
            drawable = uo0.g(drawable.mutate());
            uo0.CQf.h(drawable, this.z);
            uo0.CQf.i(drawable, this.A);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.z = colorStateList;
        if (getBackground() != null) {
            Drawable drawableG = uo0.g(getBackground().mutate());
            uo0.CQf.h(drawableG, colorStateList);
            uo0.CQf.i(drawableG, this.A);
            if (drawableG != getBackground()) {
                super.setBackgroundDrawable(drawableG);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A = mode;
        if (getBackground() != null) {
            Drawable drawableG = uo0.g(getBackground().mutate());
            uo0.CQf.i(drawableG, mode);
            if (drawableG != getBackground()) {
                super.setBackgroundDrawable(drawableG);
            }
        }
    }

    public void setOnAttachStateChangeListener(s8 s8Var) {
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : B);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(t8 t8Var) {
    }
}
