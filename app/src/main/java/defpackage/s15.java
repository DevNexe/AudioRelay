package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes3.dex */
public final class s15 {
    public final ColorStateList a;
    public final ColorStateList b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public class QnHx extends sp3.NUlFixed {
        public final /* synthetic */ B8C a;

        public QnHx(B8C b8c) {
            this.a = b8c;
        }

        @Override // sp3.NUlFixed
        public final void c(int i) {
            s15.this.m = true;
            this.a.J0(i);
        }

        @Override // sp3.NUlFixed
        public final void d(Typeface typeface) {
            s15 s15Var = s15.this;
            s15Var.n = Typeface.create(typeface, s15Var.d);
            s15Var.m = true;
            this.a.K0(s15Var.n, false);
        }
    }

    public s15(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, Th.T);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.a = ja2.b(context, typedArrayObtainStyledAttributes, 3);
        ja2.b(context, typedArrayObtainStyledAttributes, 4);
        ja2.b(context, typedArrayObtainStyledAttributes, 5);
        this.d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.c = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.b = ja2.b(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, Th.M);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.d;
        if (typeface == null && (str = this.c) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.e;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                int i = this.l;
                ThreadLocal<TypedValue> threadLocal = sp3.a;
                Typeface typefaceA = context.isRestricted() ? null : sp3.a(context, i, new TypedValue(), 0, null, false, false);
                this.n = typefaceA;
                if (typefaceA != null) {
                    this.n = Typeface.create(typefaceA, this.d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.c, e);
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, B8C b8c) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            b8c.K0(this.n, true);
            return;
        }
        try {
            QnHx qnHx = new QnHx(b8c);
            ThreadLocal<TypedValue> threadLocal = sp3.a;
            if (context.isRestricted()) {
                qnHx.a(-4);
            } else {
                sp3.a(context, i, new TypedValue(), 0, qnHx, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            b8c.J0(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.c, e);
            this.m = true;
            b8c.J0(-3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final boolean d(Context context) {
        Typeface typefaceA;
        int i = this.l;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = sp3.a;
            if (context.isRestricted()) {
                typefaceA = null;
            } else {
                typefaceA = sp3.a(context, i, new TypedValue(), 0, null, false, true);
            }
        } else {
            typefaceA = null;
        }
        return typefaceA != null;
    }

    public final void e(Context context, TextPaint textPaint, B8C b8c) {
        f(context, textPaint, b8c);
        ColorStateList colorStateList = this.a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.b;
        textPaint.setShadowLayer(this.h, this.f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, B8C b8c) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.n);
        c(context, new t15(this, textPaint, b8c));
    }

    public final void g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
