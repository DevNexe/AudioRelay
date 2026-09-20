package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.F1;
import defpackage.eh2;
import defpackage.ej4;
import defpackage.fj4;
import defpackage.j25;
import defpackage.jo5;
import defpackage.la2;
import defpackage.lv;
import defpackage.s15;
import defpackage.uo0;
import defpackage.ys3;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx extends la2 implements Drawable.Callback, j25.CQf {
    public static final int[] c1 = {R.attr.state_enabled};
    public static final ShapeDrawable d1 = new ShapeDrawable(new OvalShape());
    public final Context A0;
    public final Paint B0;
    public final Paint.FontMetrics C0;
    public final RectF D0;
    public final PointF E0;
    public final Path F0;
    public final j25 G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public boolean N0;
    public int O0;
    public int P0;
    public ColorFilter Q0;
    public PorterDuffColorFilter R0;
    public ColorStateList S0;
    public ColorStateList T;
    public PorterDuff.Mode T0;
    public ColorStateList U;
    public int[] U0;
    public float V;
    public boolean V0;
    public float W;
    public ColorStateList W0;
    public ColorStateList X;
    public WeakReference<InterfaceC0078QnHx> X0;
    public float Y;
    public TextUtils.TruncateAt Y0;
    public ColorStateList Z;
    public boolean Z0;
    public CharSequence a0;
    public int a1;
    public boolean b0;
    public boolean b1;
    public Drawable c0;
    public ColorStateList d0;
    public float e0;
    public boolean f0;
    public boolean g0;
    public Drawable h0;
    public RippleDrawable i0;
    public ColorStateList j0;
    public float k0;
    public SpannableStringBuilder l0;
    public boolean m0;
    public boolean n0;
    public Drawable o0;
    public ColorStateList p0;
    public eh2 q0;
    public eh2 r0;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.QnHx$QnHx, reason: collision with other inner class name */
    public interface InterfaceC0078QnHx {
        void a();
    }

    public QnHx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.azefsw.audioconnect.R.attr.chipStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Chip_Action);
        this.W = -1.0f;
        this.B0 = new Paint(1);
        this.C0 = new Paint.FontMetrics();
        this.D0 = new RectF();
        this.E0 = new PointF();
        this.F0 = new Path();
        this.P0 = 255;
        this.T0 = PorterDuff.Mode.SRC_IN;
        this.X0 = new WeakReference<>(null);
        h(context);
        this.A0 = context;
        j25 j25Var = new j25(this);
        this.G0 = j25Var;
        this.a0 = "";
        j25Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = c1;
        setState(iArr);
        if (!Arrays.equals(this.U0, iArr)) {
            this.U0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.Z0 = true;
        int[] iArr2 = ys3.a;
        d1.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Deprecated
    public final void A(float f) {
        if (this.W != f) {
            this.W = f;
            ej4 ej4Var = this.w.a;
            ej4Var.getClass();
            ej4.QnHx qnHx = new ej4.QnHx(ej4Var);
            qnHx.e = new F1(f);
            qnHx.f = new F1(f);
            qnHx.g = new F1(f);
            qnHx.h = new F1(f);
            setShapeAppearanceModel(new ej4(qnHx));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void B(Drawable drawable) {
        ?? A;
        Object obj = this.c0;
        if (obj == null) {
            A = 0;
        } else if (obj instanceof jo5) {
            A = obj;
            A = ((jo5) obj).a();
        }
        if (A != drawable) {
            float fP = p();
            this.c0 = drawable != null ? uo0.g(drawable).mutate() : null;
            float fP2 = p();
            U(A);
            if (S()) {
                n(this.c0);
            }
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void C(float f) {
        if (this.e0 != f) {
            float fP = p();
            this.e0 = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f0 = true;
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            if (S()) {
                uo0.CQf.h(this.c0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z) {
        if (this.b0 != z) {
            boolean zS = S();
            this.b0 = z;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    n(this.c0);
                } else {
                    U(this.c0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.b1) {
                la2.CQf cQf = this.w;
                if (cQf.d != colorStateList) {
                    cQf.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.Y != f) {
            this.Y = f;
            this.B0.setStrokeWidth(f);
            if (this.b1) {
                this.w.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void H(Drawable drawable) {
        ?? A;
        Object obj = this.h0;
        if (obj == null) {
            A = 0;
        } else if (obj instanceof jo5) {
            A = obj;
            A = ((jo5) obj).a();
        }
        if (A != drawable) {
            float fQ = q();
            this.h0 = drawable != null ? uo0.g(drawable).mutate() : null;
            int[] iArr = ys3.a;
            this.i0 = new RippleDrawable(ys3.a(this.Z), this.h0, d1);
            float fQ2 = q();
            U(A);
            if (T()) {
                n(this.h0);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public final void I(float f) {
        if (this.y0 != f) {
            this.y0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f) {
        if (this.k0 != f) {
            this.k0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f) {
        if (this.x0 != f) {
            this.x0 = f;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            if (T()) {
                uo0.CQf.h(this.h0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z) {
        if (this.g0 != z) {
            boolean zT = T();
            this.g0 = z;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    n(this.h0);
                } else {
                    U(this.h0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f) {
        if (this.u0 != f) {
            float fP = p();
            this.u0 = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void O(float f) {
        if (this.t0 != f) {
            float fP = p();
            this.t0 = f;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            this.W0 = this.V0 ? ys3.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void Q(s15 s15Var) {
        j25 j25Var = this.G0;
        if (j25Var.f != s15Var) {
            j25Var.f = s15Var;
            if (s15Var != null) {
                TextPaint textPaint = j25Var.a;
                Context context = this.A0;
                j25.QnHx qnHx = j25Var.b;
                s15Var.f(context, textPaint, qnHx);
                j25.CQf cQf = j25Var.e.get();
                if (cQf != null) {
                    textPaint.drawableState = cQf.getState();
                }
                s15Var.e(context, textPaint, qnHx);
                j25Var.d = true;
            }
            j25.CQf cQf2 = j25Var.e.get();
            if (cQf2 != null) {
                cQf2.a();
                cQf2.onStateChange(cQf2.getState());
            }
        }
    }

    public final boolean R() {
        return this.n0 && this.o0 != null && this.N0;
    }

    public final boolean S() {
        return this.b0 && this.c0 != null;
    }

    public final boolean T() {
        return this.g0 && this.h0 != null;
    }

    @Override // j25.CQf
    public final void a() {
        u();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int iSaveLayerAlpha;
        ?? r10;
        RectF rectF;
        int i2;
        int i3;
        float f;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.P0) == 0) {
            return;
        }
        if (i < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        boolean z = this.b1;
        Paint paint = this.B0;
        RectF rectF2 = this.D0;
        if (!z) {
            paint.setColor(this.H0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, r(), r(), paint);
        }
        if (!this.b1) {
            paint.setColor(this.I0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.Q0;
            if (colorFilter == null) {
                colorFilter = this.R0;
            }
            paint.setColorFilter(colorFilter);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, r(), r(), paint);
        }
        if (this.b1) {
            super.draw(canvas);
        }
        if (this.Y > 0.0f && !this.b1) {
            paint.setColor(this.K0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.b1) {
                ColorFilter colorFilter2 = this.Q0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.R0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f6 = bounds.left;
            float f7 = this.Y / 2.0f;
            rectF2.set(f6 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
            float f8 = this.W - (this.Y / 2.0f);
            canvas.drawRoundRect(rectF2, f8, f8, paint);
        }
        paint.setColor(this.L0);
        paint.setStyle(Paint.Style.FILL);
        rectF2.set(bounds);
        if (this.b1) {
            RectF rectF3 = new RectF(bounds);
            Path path = this.F0;
            fj4 fj4Var = this.N;
            la2.CQf cQf = this.w;
            fj4Var.a(cQf.a, cQf.j, rectF3, this.M, path);
            r10 = 0;
            f(canvas, paint, path, this.w.a, g());
        } else {
            canvas.drawRoundRect(rectF2, r(), r(), paint);
            r10 = 0;
        }
        if (S()) {
            o(bounds, rectF2);
            float f9 = rectF2.left;
            float f10 = rectF2.top;
            canvas.translate(f9, f10);
            this.c0.setBounds(r10, r10, (int) rectF2.width(), (int) rectF2.height());
            this.c0.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (R()) {
            o(bounds, rectF2);
            float f11 = rectF2.left;
            float f12 = rectF2.top;
            canvas.translate(f11, f12);
            this.o0.setBounds(r10, r10, (int) rectF2.width(), (int) rectF2.height());
            this.o0.draw(canvas);
            canvas.translate(-f11, -f12);
        }
        if (!this.Z0 || this.a0 == null) {
            rectF = rectF2;
            i2 = iSaveLayerAlpha;
            i3 = 255;
        } else {
            PointF pointF = this.E0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.a0;
            j25 j25Var = this.G0;
            if (charSequence != null) {
                float fP = p() + this.s0 + this.v0;
                if (uo0.b(this) == 0) {
                    pointF.x = bounds.left + fP;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fP;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = j25Var.a;
                Paint.FontMetrics fontMetrics = this.C0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF2.setEmpty();
            if (this.a0 != null) {
                float fP2 = p() + this.s0 + this.v0;
                float fQ = q() + this.z0 + this.w0;
                if (uo0.b(this) == 0) {
                    rectF2.left = bounds.left + fP2;
                    rectF2.right = bounds.right - fQ;
                } else {
                    rectF2.left = bounds.left + fQ;
                    rectF2.right = bounds.right - fP2;
                }
                rectF2.top = bounds.top;
                rectF2.bottom = bounds.bottom;
            }
            s15 s15Var = j25Var.f;
            TextPaint textPaint2 = j25Var.a;
            if (s15Var != null) {
                textPaint2.drawableState = getState();
                j25Var.f.e(this.A0, textPaint2, j25Var.b);
            }
            textPaint2.setTextAlign(align);
            String string = this.a0.toString();
            if (j25Var.d) {
                float fMeasureText = string != null ? textPaint2.measureText((CharSequence) string, (int) r10, string.length()) : 0.0f;
                j25Var.c = fMeasureText;
                j25Var.d = r10;
                f = fMeasureText;
            } else {
                f = j25Var.c;
            }
            boolean z2 = Math.round(f) > Math.round(rectF2.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF2);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.a0;
            if (z2 && this.Y0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF2.width(), this.Y0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f13 = pointF.x;
            float f14 = pointF.y;
            i3 = 255;
            rectF = rectF2;
            i2 = iSaveLayerAlpha;
            canvas.drawText(charSequence2, 0, length, f13, f14, textPaint2);
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f15 = this.z0 + this.y0;
                if (uo0.b(this) == 0) {
                    float f16 = bounds.right - f15;
                    rectF.right = f16;
                    rectF.left = f16 - this.k0;
                } else {
                    float f17 = bounds.left + f15;
                    rectF.left = f17;
                    rectF.right = f17 + this.k0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f18 = this.k0;
                float f19 = fExactCenterY - (f18 / 2.0f);
                rectF.top = f19;
                rectF.bottom = f19 + f18;
            }
            float f20 = rectF.left;
            float f21 = rectF.top;
            canvas.translate(f20, f21);
            this.h0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = ys3.a;
            this.i0.setBounds(this.h0.getBounds());
            this.i0.jumpToCurrentState();
            this.i0.draw(canvas);
            canvas.translate(-f20, -f21);
        }
        if (this.P0 < i3) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.P0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.Q0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.V;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fMeasureText;
        float fP = p() + this.s0 + this.v0;
        String string = this.a0.toString();
        j25 j25Var = this.G0;
        if (j25Var.d) {
            fMeasureText = string == null ? 0.0f : j25Var.a.measureText((CharSequence) string, 0, string.length());
            j25Var.c = fMeasureText;
            j25Var.d = false;
        } else {
            fMeasureText = j25Var.c;
        }
        return Math.min(Math.round(q() + fMeasureText + fP + this.w0 + this.z0), this.a1);
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.b1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.V, this.W);
        } else {
            outline.setRoundRect(bounds, this.W);
        }
        outline.setAlpha(this.P0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.T) || s(this.U) || s(this.X)) {
            return true;
        }
        if (this.V0 && s(this.W0)) {
            return true;
        }
        s15 s15Var = this.G0.f;
        if ((s15Var == null || (colorStateList = s15Var.a) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.n0 && this.o0 != null && this.m0) || t(this.c0) || t(this.o0) || s(this.S0);
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        uo0.c(drawable, uo0.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.h0) {
            if (drawable.isStateful()) {
                drawable.setState(this.U0);
            }
            uo0.CQf.h(drawable, this.j0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.c0;
        if (drawable == drawable2 && this.f0) {
            uo0.CQf.h(drawable2, this.d0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c A[PHI: r1
  0x007c: PHI (r1v10 float) = (r1v9 float), (r1v9 float), (r1v19 float) binds: [B:23:0x0051, B:24:0x0053, B:26:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    public final void o(Rect rect, RectF rectF) {
        float intrinsicHeight;
        rectF.setEmpty();
        if (S() || R()) {
            float f = this.s0 + this.t0;
            Drawable drawable = this.N0 ? this.o0 : this.c0;
            float intrinsicWidth = this.e0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (uo0.b(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.N0 ? this.o0 : this.c0;
            float fCeil = this.e0;
            if (fCeil > 0.0f || drawable2 == null) {
                intrinsicHeight = fCeil;
            } else {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.A0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    intrinsicHeight = drawable2.getIntrinsicHeight();
                } else {
                    intrinsicHeight = fCeil;
                }
            }
            float fExactCenterY = rect.exactCenterY() - (intrinsicHeight / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + intrinsicHeight;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            zOnLayoutDirectionChanged |= uo0.c(this.c0, i);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= uo0.c(this.o0, i);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= uo0.c(this.h0, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (S()) {
            zOnLevelChange |= this.c0.setLevel(i);
        }
        if (R()) {
            zOnLevelChange |= this.o0.setLevel(i);
        }
        if (T()) {
            zOnLevelChange |= this.h0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable, j25.CQf
    public final boolean onStateChange(int[] iArr) {
        if (this.b1) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.U0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f = this.t0;
        Drawable drawable = this.N0 ? this.o0 : this.c0;
        float intrinsicWidth = this.e0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.u0;
    }

    public final float q() {
        if (T()) {
            return this.x0 + this.k0 + this.y0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.b1 ? this.w.a.e.a(g()) : this.W;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.Q0 != colorFilter) {
            this.Q0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.S0 != colorStateList) {
            this.S0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.la2, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.T0 != mode) {
            this.T0 = mode;
            ColorStateList colorStateList = this.S0;
            this.R0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (S()) {
            visible |= this.c0.setVisible(z, z2);
        }
        if (R()) {
            visible |= this.o0.setVisible(z, z2);
        }
        if (T()) {
            visible |= this.h0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        InterfaceC0078QnHx interfaceC0078QnHx = this.X0.get();
        if (interfaceC0078QnHx != null) {
            interfaceC0078QnHx.a();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.T;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.H0) : 0);
        boolean state = true;
        if (this.H0 != iD) {
            this.H0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.U;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.I0) : 0);
        if (this.I0 != iD2) {
            this.I0 = iD2;
            zOnStateChange = true;
        }
        int iB = lv.b(iD2, iD);
        if ((this.J0 != iB) | (this.w.c == null)) {
            this.J0 = iB;
            j(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.X;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.K0) : 0;
        if (this.K0 != colorForState) {
            this.K0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.W0 == null || !ys3.b(iArr)) ? 0 : this.W0.getColorForState(iArr, this.L0);
        if (this.L0 != colorForState2) {
            this.L0 = colorForState2;
            if (this.V0) {
                zOnStateChange = true;
            }
        }
        s15 s15Var = this.G0.f;
        int colorForState3 = (s15Var == null || (colorStateList = s15Var.a) == null) ? 0 : colorStateList.getColorForState(iArr, this.M0);
        if (this.M0 != colorForState3) {
            this.M0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (state2[i] == 16842912) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z3 = z && this.m0;
        if (this.N0 == z3 || this.o0 == null) {
            z2 = false;
        } else {
            float fP = p();
            this.N0 = z3;
            if (fP != p()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList5 = this.S0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.O0) : 0;
        if (this.O0 != colorForState4) {
            this.O0 = colorForState4;
            ColorStateList colorStateList6 = this.S0;
            PorterDuff.Mode mode = this.T0;
            this.R0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (t(this.c0)) {
            state |= this.c0.setState(iArr);
        }
        if (t(this.o0)) {
            state |= this.o0.setState(iArr);
        }
        if (t(this.h0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.h0.setState(iArr3);
        }
        int[] iArr4 = ys3.a;
        if (t(this.i0)) {
            state |= this.i0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            u();
        }
        return state;
    }

    public final void w(boolean z) {
        if (this.m0 != z) {
            this.m0 = z;
            float fP = p();
            if (!z && this.N0) {
                this.N0 = false;
            }
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.o0 != drawable) {
            float fP = p();
            this.o0 = drawable;
            float fP2 = p();
            U(this.o0);
            n(this.o0);
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            if (this.n0 && this.o0 != null && this.m0) {
                uo0.CQf.h(this.o0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z) {
        if (this.n0 != z) {
            boolean zR = R();
            this.n0 = z;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    n(this.o0);
                } else {
                    U(this.o0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
