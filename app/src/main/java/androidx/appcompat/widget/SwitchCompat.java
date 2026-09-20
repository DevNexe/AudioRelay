package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.facebook.ads.AdError;
import defpackage.EH;
import defpackage.XTd3;
import defpackage.YUjp;
import defpackage.Zz;
import defpackage.bi5;
import defpackage.bp0;
import defpackage.c65;
import defpackage.c75;
import defpackage.g85;
import defpackage.uo0;
import defpackage.xApe;
import defpackage.yj5;
import defpackage.zh5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final QnHx q0 = new QnHx();
    public static final int[] r0 = {R.attr.state_checked};
    public boolean A;
    public Drawable B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public CharSequence K;
    public CharSequence L;
    public CharSequence M;
    public CharSequence N;
    public boolean O;
    public int P;
    public final int Q;
    public float R;
    public float S;
    public final VelocityTracker T;
    public final int U;
    public float V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public final TextPaint h0;
    public ColorStateList i0;
    public StaticLayout j0;
    public StaticLayout k0;
    public EH l0;
    public ObjectAnimator m0;
    public Zz n0;
    public F1 o0;
    public final Rect p0;
    public Drawable w;
    public ColorStateList x;
    public PorterDuff.Mode y;
    public boolean z;

    public static class CQf {
        public static void a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public static class F1 extends androidx.emoji2.text.LPt8Fixed.NUlFixed {
        public final WeakReference a;

        public F1(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.LPt8Fixed.NUlFixed
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }

        @Override // androidx.emoji2.text.LPt8Fixed.NUlFixed
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }
    }

    public class QnHx extends Property<SwitchCompat, Float> {
        public QnHx() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.V);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.azefsw.audioconnect.R.attr.switchStyle);
        this.x = null;
        this.y = null;
        this.z = false;
        this.A = false;
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.T = VelocityTracker.obtain();
        this.g0 = true;
        this.p0 = new Rect();
        c75.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.h0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = xApe.P;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.azefsw.audioconnect.R.attr.switchStyle, 0);
        g85 g85Var = new g85(context, typedArrayObtainStyledAttributes);
        bi5.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.azefsw.audioconnect.R.attr.switchStyle);
        Drawable drawableE = g85Var.e(2);
        this.w = drawableE;
        if (drawableE != null) {
            drawableE.setCallback(this);
        }
        Drawable drawableE2 = g85Var.e(11);
        this.B = drawableE2;
        if (drawableE2 != null) {
            drawableE2.setCallback(this);
        }
        setTextOnInternal(g85Var.j(0));
        setTextOffInternal(g85Var.j(1));
        this.O = g85Var.a(3, true);
        this.G = g85Var.d(8, 0);
        this.H = g85Var.d(5, 0);
        this.I = g85Var.d(6, 0);
        this.J = g85Var.a(4, false);
        ColorStateList colorStateListB = g85Var.b(9);
        if (colorStateListB != null) {
            this.x = colorStateListB;
            this.z = true;
        }
        PorterDuff.Mode modeC = bp0.c(g85Var.g(10, -1), null);
        if (this.y != modeC) {
            this.y = modeC;
            this.A = true;
        }
        if (this.z || this.A) {
            a();
        }
        ColorStateList colorStateListB2 = g85Var.b(12);
        if (colorStateListB2 != null) {
            this.C = colorStateListB2;
            this.E = true;
        }
        PorterDuff.Mode modeC2 = bp0.c(g85Var.g(13, -1), null);
        if (this.D != modeC2) {
            this.D = modeC2;
            this.F = true;
        }
        if (this.E || this.F) {
            b();
        }
        int iH = g85Var.h(7, 0);
        if (iH != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iH, xApe.Q);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = XTd3.k(context, resourceId)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.i0 = colorStateList;
            } else {
                this.i0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes2.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes2.getInt(2, -1);
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i != 2) {
                typeface = i != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(14, false)) {
                this.l0 = new EH(getContext());
            } else {
                this.l0 = null;
            }
            setTextOnInternal(this.K);
            setTextOffInternal(this.M);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new YUjp(this).f(attributeSet, com.azefsw.audioconnect.R.attr.switchStyle);
        g85Var.m();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Q = viewConfiguration.getScaledTouchSlop();
        this.U = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.azefsw.audioconnect.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private Zz getEmojiTextViewHelper() {
        if (this.n0 == null) {
            this.n0 = new Zz(this);
        }
        return this.n0;
    }

    private boolean getTargetCheckedState() {
        return this.V > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((yj5.a(this) ? 1.0f - this.V : this.V) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.B;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.p0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.w;
        Rect rectB = drawable2 != null ? bp0.b(drawable2) : bp0.c;
        return ((((this.W - this.b0) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.M = charSequence;
        Zz emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.b.a.e(this.l0);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.N = charSequence;
        this.k0 = null;
        if (this.O) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.K = charSequence;
        Zz emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = emojiTextViewHelper.b.a.e(this.l0);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.L = charSequence;
        this.j0 = null;
        if (this.O) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.w;
        if (drawable != null) {
            if (this.z || this.A) {
                Drawable drawableMutate = uo0.g(drawable).mutate();
                this.w = drawableMutate;
                if (this.z) {
                    uo0.CQf.h(drawableMutate, this.x);
                }
                if (this.A) {
                    uo0.CQf.i(this.w, this.y);
                }
                if (this.w.isStateful()) {
                    this.w.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.B;
        if (drawable != null) {
            if (this.E || this.F) {
                Drawable drawableMutate = uo0.g(drawable).mutate();
                this.B = drawableMutate;
                if (this.E) {
                    uo0.CQf.h(drawableMutate, this.C);
                }
                if (this.F) {
                    uo0.CQf.i(this.B, this.D);
                }
                if (this.B.isStateful()) {
                    this.B.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        TextPaint textPaint = this.h0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        setTextOnInternal(this.K);
        setTextOffInternal(this.M);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.c0;
        int i4 = this.d0;
        int i5 = this.e0;
        int i6 = this.f0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.w;
        Rect rectB = drawable != null ? bp0.b(drawable) : bp0.c;
        Drawable drawable2 = this.B;
        Rect rect = this.p0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.B.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.B.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.b0 + rect.right;
            this.w.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                uo0.CQf.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.w;
        if (drawable != null) {
            uo0.CQf.e(drawable, f, f2);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            uo0.CQf.e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e() {
        if (this.o0 == null && this.n0.b.a.b()) {
            if (androidx.emoji2.text.LPt8Fixed.j != null) {
                androidx.emoji2.text.LPt8Fixed lPt8A = androidx.emoji2.text.LPt8Fixed.a();
                int iB = lPt8A.b();
                if (iB == 3 || iB == 0) {
                    F1 f1 = new F1(this);
                    this.o0 = f1;
                    lPt8A.g(f1);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!yj5.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.W;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.I : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (yj5.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.W;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.I : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c65.f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.O;
    }

    public boolean getSplitTrack() {
        return this.J;
    }

    public int getSwitchMinWidth() {
        return this.H;
    }

    public int getSwitchPadding() {
        return this.I;
    }

    public CharSequence getTextOff() {
        return this.M;
    }

    public CharSequence getTextOn() {
        return this.K;
    }

    public Drawable getThumbDrawable() {
        return this.w;
    }

    public final float getThumbPosition() {
        return this.V;
    }

    public int getThumbTextPadding() {
        return this.G;
    }

    public ColorStateList getThumbTintList() {
        return this.x;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.y;
    }

    public Drawable getTrackDrawable() {
        return this.B;
    }

    public ColorStateList getTrackTintList() {
        return this.C;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.D;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.m0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.m0.end();
        this.m0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.B;
        Rect rect = this.p0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.d0;
        int i2 = this.f0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.w;
        if (drawable != null) {
            if (!this.J || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = bp0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.j0 : this.k0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.i0;
            TextPaint textPaint = this.h0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.K : this.M;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.w != null) {
            Drawable drawable = this.B;
            Rect rect = this.p0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = bp0.b(this.w);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (yj5.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.W + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.W) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.a0;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.a0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.a0;
        }
        this.c0 = paddingLeft;
        this.d0 = paddingTop;
        this.f0 = height;
        this.e0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.O) {
            if (this.j0 == null) {
                this.j0 = c(this.L);
            }
            if (this.k0 == null) {
                this.k0 = c(this.N);
            }
        }
        Drawable drawable = this.w;
        int intrinsicHeight2 = 0;
        Rect rect = this.p0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.w.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.w.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.O) {
            iMax = (this.G * 2) + Math.max(this.j0.getWidth(), this.k0.getWidth());
        } else {
            iMax = 0;
        }
        this.b0 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.B.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            Rect rectB = bp0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.g0 ? Math.max(this.H, (this.b0 * 2) + iMax2 + iMax3) : this.H;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.W = iMax4;
        this.a0 = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.K : this.M;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.T;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.Q;
        boolean z2 = false;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.P == 2) {
                    this.P = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.U) {
                            targetCheckedState = yj5.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.P = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.P;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.R) > i || Math.abs(y - this.S) > i) {
                        this.P = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.R = x;
                        this.S = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f3 = x2 - this.R;
                    if (thumbScrollRange != 0) {
                        f = f3 / thumbScrollRange;
                    } else {
                        f = f3 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (yj5.a(this)) {
                        f = -f;
                    }
                    float f4 = this.V;
                    float f5 = f + f4;
                    if (f5 >= 0.0f) {
                        f2 = f5 > 1.0f ? 1.0f : f5;
                    }
                    if (f2 != f4) {
                        this.R = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.P == 2) {
                    this.P = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.U) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (yj5.a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.P = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                if (this.w != null) {
                    int thumbOffset = getThumbOffset();
                    Drawable drawable = this.w;
                    Rect rect = this.p0;
                    drawable.getPadding(rect);
                    int i3 = this.d0 - i;
                    int i4 = (this.c0 + thumbOffset) - i;
                    int i5 = this.b0 + i4 + rect.left + rect.right + i;
                    int i6 = this.f0 + i;
                    if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.P = 1;
                    this.R = x3;
                    this.S = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.K;
                if (string == null) {
                    string = getResources().getString(com.azefsw.audioconnect.R.string.abc_capital_on);
                }
                Field field = bi5.a;
                new zh5().e(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.M;
            if (string2 == null) {
                string2 = getResources().getString(com.azefsw.audioconnect.R.string.abc_capital_off);
            }
            Field field2 = bi5.a;
            new zh5().e(this, string2);
        }
        if (getWindowToken() != null) {
            Field field3 = bi5.a;
            if (bi5.auxFixed.c(this)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, q0, zIsChecked ? 1.0f : 0.0f);
                this.m0 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                CQf.a(this.m0, true);
                this.m0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.m0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c65.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.K);
        setTextOffInternal(this.M);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.g0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.O != z) {
            this.O = z;
            requestLayout();
            if (z) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.J = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.H = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.I = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.h0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.M;
        if (string == null) {
            string = getResources().getString(com.azefsw.audioconnect.R.string.abc_capital_off);
        }
        Field field = bi5.a;
        new zh5().e(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.K;
        if (string == null) {
            string = getResources().getString(com.azefsw.audioconnect.R.string.abc_capital_on);
        }
        Field field = bi5.a;
        new zh5().e(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.V = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(XTd3.l(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.G = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.x = colorStateList;
        this.z = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.y = mode;
        this.A = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(XTd3.l(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.E = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.D = mode;
        this.F = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w || drawable == this.B;
    }
}
