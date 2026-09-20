package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class au {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public float M;
    public StaticLayout N;
    public CharSequence O;
    public final View a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public tm v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public Bitmap z;
    public int g = 16;
    public int h = 16;
    public float i = 15.0f;
    public float j = 15.0f;
    public final int P = ys4.m;

    public au(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        this.F = new TextPaint(textPaint);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = ur.a;
        return ((f2 - f) * f3) + f;
    }

    public final float b() {
        if (this.w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.F;
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.M);
        CharSequence charSequence = this.w;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c(CharSequence charSequence) {
        Field field = bi5.a;
        return (bi5.NUlFixed.d(this.a) == 1 ? f25.d : f25.c).b(charSequence.length(), charSequence);
    }

    public final void d(float f) {
        boolean z;
        float f2;
        StaticLayout staticLayoutA;
        if (this.w == null) {
            return;
        }
        float fWidth = this.e.width();
        float fWidth2 = this.d.width();
        if (Math.abs(f - this.j) < 0.001f) {
            f2 = this.j;
            this.A = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                this.A = 1.0f;
            } else {
                this.A = f / this.i;
            }
            float f4 = this.j / this.i;
            fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
        }
        if (fWidth > 0.0f) {
            z = this.B != f2 || this.D || z;
            this.B = f2;
            this.D = false;
        }
        if (this.x == null || z) {
            TextPaint textPaint = this.E;
            textPaint.setTextSize(this.B);
            textPaint.setTypeface(this.u);
            textPaint.setLinearText(this.A != 1.0f);
            boolean zC = c(this.w);
            this.y = zC;
            try {
                ys4 ys4Var = new ys4((int) fWidth, textPaint, this.w);
                ys4Var.l = TextUtils.TruncateAt.END;
                ys4Var.k = zC;
                ys4Var.e = Layout.Alignment.ALIGN_NORMAL;
                ys4Var.j = false;
                ys4Var.f = 1;
                ys4Var.g = 0.0f;
                ys4Var.h = 1.0f;
                ys4Var.i = this.P;
                staticLayoutA = ys4Var.a();
            } catch (ys4.QnHx e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayoutA = null;
            }
            staticLayoutA.getClass();
            this.N = staticLayoutA;
            this.x = staticLayoutA.getText();
        }
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public final void g() {
        boolean z;
        Rect rect = this.e;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z = false;
        } else {
            Rect rect2 = this.d;
            if (rect2.width() <= 0 || rect2.height() <= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        this.b = z;
    }

    public final void h() {
        StaticLayout staticLayout;
        View view = this.a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            return;
        }
        float f = this.B;
        d(this.j);
        CharSequence charSequence = this.x;
        TextPaint textPaint = this.E;
        if (charSequence != null && (staticLayout = this.N) != null) {
            this.O = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.O;
        float fMeasureText = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.h, this.y ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.e;
        if (i == 48) {
            this.n = rect.top;
        } else if (i != 80) {
            this.n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.n = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.p = rect.centerX() - (fMeasureText / 2.0f);
        } else if (i2 != 5) {
            this.p = rect.left;
        } else {
            this.p = rect.right - fMeasureText;
        }
        d(this.i);
        StaticLayout staticLayout2 = this.N;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.x;
        float fMeasureText2 = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.N;
        if (staticLayout3 != null) {
            staticLayout3.getLineLeft(0);
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.g, this.y ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.d;
        if (i3 == 48) {
            this.m = rect2.top;
        } else if (i3 != 80) {
            this.m = rect2.centerY() - (height / 2.0f);
        } else {
            this.m = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.o = rect2.centerX() - (fMeasureText2 / 2.0f);
        } else if (i4 != 5) {
            this.o = rect2.left;
        } else {
            this.o = rect2.right - fMeasureText2;
        }
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            bitmap.recycle();
            this.z = null;
        }
        k(f);
        float f2 = this.c;
        RectF rectF = this.f;
        rectF.left = f(rect2.left, rect.left, f2, this.G);
        rectF.top = f(this.m, this.n, f2, this.G);
        rectF.right = f(rect2.right, rect.right, f2, this.G);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.G);
        this.q = f(this.o, this.p, f2, this.G);
        this.r = f(this.m, this.n, f2, this.G);
        k(f(this.i, this.j, f2, this.H));
        rw0 rw0Var = ur.b;
        f(0.0f, 1.0f, 1.0f - f2, rw0Var);
        Field field = bi5.a;
        bi5.LPt8Fixed.k(view);
        f(1.0f, 0.0f, f2, rw0Var);
        bi5.LPt8Fixed.k(view);
        ColorStateList colorStateList = this.l;
        ColorStateList colorStateList2 = this.k;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f2, e(colorStateList2), e(this.l)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f3 = this.M;
        if (f3 != 0.0f) {
            textPaint.setLetterSpacing(f(0.0f, f3, f2, rw0Var));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        textPaint.setShadowLayer(f(0.0f, this.I, f2, null), f(0.0f, this.J, f2, null), f(0.0f, this.K, f2, null), a(f2, e(null), e(this.L)));
        bi5.LPt8Fixed.k(view);
    }

    public final void i(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            h();
        }
    }

    public final void j(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.c) {
            this.c = f;
            RectF rectF = this.f;
            Rect rect = this.d;
            float f2 = rect.left;
            Rect rect2 = this.e;
            rectF.left = f(f2, rect2.left, f, this.G);
            rectF.top = f(this.m, this.n, f, this.G);
            rectF.right = f(rect.right, rect2.right, f, this.G);
            rectF.bottom = f(rect.bottom, rect2.bottom, f, this.G);
            this.q = f(this.o, this.p, f, this.G);
            this.r = f(this.m, this.n, f, this.G);
            k(f(this.i, this.j, f, this.H));
            rw0 rw0Var = ur.b;
            f(0.0f, 1.0f, 1.0f - f, rw0Var);
            Field field = bi5.a;
            View view = this.a;
            bi5.LPt8Fixed.k(view);
            f(1.0f, 0.0f, f, rw0Var);
            bi5.LPt8Fixed.k(view);
            ColorStateList colorStateList = this.l;
            ColorStateList colorStateList2 = this.k;
            TextPaint textPaint = this.E;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f, e(colorStateList2), e(this.l)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f3 = this.M;
            if (f3 != 0.0f) {
                textPaint.setLetterSpacing(f(0.0f, f3, f, rw0Var));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            textPaint.setShadowLayer(f(0.0f, this.I, f, null), f(0.0f, this.J, f, null), f(0.0f, this.K, f, null), a(f, e(null), e(this.L)));
            bi5.LPt8Fixed.k(view);
        }
    }

    public final void k(float f) {
        d(f);
        Field field = bi5.a;
        bi5.LPt8Fixed.k(this.a);
    }
}
