package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class YUjp {
    public final TextView a;
    public e85 b;
    public e85 c;
    public e85 d;
    public e85 e;
    public e85 f;
    public e85 g;
    public e85 h;
    public final Jv i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public static class CQf {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class F1 {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class LPt8Fixed {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class NUlFixed {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public class QnHx extends sp3.NUlFixed {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public QnHx(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // sp3.NUlFixed
        public final void c(int i) {
        }

        @Override // sp3.NUlFixed
        public final void d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = YKK.a(typeface, i, (this.b & 2) != 0);
            }
            YUjp yUjp = YUjp.this;
            if (yUjp.m) {
                yUjp.l = typeface;
                TextView textView = (TextView) this.c.get();
                if (textView != null) {
                    Field field = bi5.a;
                    if (bi5.auxFixed.b(textView)) {
                        textView.post(new PKCr(textView, typeface, yUjp.j));
                    } else {
                        textView.setTypeface(typeface, yUjp.j);
                    }
                }
            }
        }
    }

    public static class YKK {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public YUjp(TextView textView) {
        this.a = textView;
        this.i = new Jv(textView);
    }

    public static e85 c(Context context, Mt0 mt0, int i) {
        ColorStateList colorStateListI;
        synchronized (mt0) {
            colorStateListI = mt0.a.i(context, i);
        }
        if (colorStateListI == null) {
            return null;
        }
        e85 e85Var = new e85();
        e85Var.d = true;
        e85Var.a = colorStateListI;
        return e85Var;
    }

    public final void a(Drawable drawable, e85 e85Var) {
        if (drawable == null || e85Var == null) {
            return;
        }
        Mt0.e(drawable, e85Var, this.a.getDrawableState());
    }

    public final void b() {
        e85 e85Var = this.b;
        TextView textView = this.a;
        if (e85Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] drawableArrA = CQf.a(textView);
        a(drawableArrA[0], this.f);
        a(drawableArrA[2], this.g);
    }

    public final ColorStateList d() {
        e85 e85Var = this.h;
        if (e85Var != null) {
            return e85Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        e85 e85Var = this.h;
        if (e85Var != null) {
            return e85Var.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i) {
        boolean zA;
        boolean z;
        ColorStateList colorStateListB;
        ColorStateList colorStateListB2;
        ColorStateList colorStateListB3;
        String strI;
        String strI2;
        int i2;
        float fApplyDimension;
        Mt0 mt0;
        Drawable drawableB;
        Paint.FontMetricsInt fontMetricsInt;
        int i3;
        int resourceId;
        int i4;
        int i5;
        int i6;
        TextView textView = this.a;
        Context context = textView.getContext();
        Mt0 mt0A = Mt0.a();
        int[] iArr = xApe.C;
        g85 g85VarL = g85.l(context, attributeSet, iArr, i);
        bi5.l(textView, textView.getContext(), iArr, attributeSet, g85VarL.b, i);
        int iH = g85VarL.h(0, -1);
        if (g85VarL.k(3)) {
            this.b = c(context, mt0A, g85VarL.h(3, 0));
        }
        if (g85VarL.k(1)) {
            this.c = c(context, mt0A, g85VarL.h(1, 0));
        }
        if (g85VarL.k(4)) {
            this.d = c(context, mt0A, g85VarL.h(4, 0));
        }
        if (g85VarL.k(2)) {
            this.e = c(context, mt0A, g85VarL.h(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (g85VarL.k(5)) {
            this.f = c(context, mt0A, g85VarL.h(5, 0));
        }
        if (g85VarL.k(6)) {
            this.g = c(context, mt0A, g85VarL.h(6, 0));
        }
        g85VarL.m();
        boolean z2 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = xApe.Q;
        if (iH != -1) {
            g85 g85Var = new g85(context, context.obtainStyledAttributes(iH, iArr2));
            if (z2 || !g85Var.k(14)) {
                zA = false;
                z = false;
            } else {
                zA = g85Var.a(14, false);
                z = true;
            }
            m(context, g85Var);
            if (i7 < 23) {
                colorStateListB = g85Var.k(3) ? g85Var.b(3) : null;
                if (g85Var.k(4)) {
                    colorStateListB2 = g85Var.b(4);
                    i6 = 5;
                } else {
                    i6 = 5;
                    colorStateListB2 = null;
                }
                if (g85Var.k(i6)) {
                    colorStateListB3 = g85Var.b(i6);
                    i4 = 15;
                }
                if (g85Var.k(i4)) {
                    strI = g85Var.i(i4);
                    i5 = 26;
                } else {
                    i5 = 26;
                    strI = null;
                }
                if (i7 >= i5 || !g85Var.k(13)) {
                    strI2 = null;
                } else {
                    strI2 = g85Var.i(13);
                }
                g85Var.m();
            } else {
                colorStateListB = null;
                colorStateListB2 = null;
            }
            i4 = 15;
            colorStateListB3 = null;
            if (g85Var.k(i4)) {
                strI = g85Var.i(i4);
                i5 = 26;
            } else {
                i5 = 26;
                strI = null;
            }
            if (i7 >= i5) {
                strI2 = null;
            } else {
                strI2 = null;
            }
            g85Var.m();
        } else {
            zA = false;
            z = false;
            colorStateListB = null;
            colorStateListB2 = null;
            colorStateListB3 = null;
            strI = null;
            strI2 = null;
        }
        g85 g85Var2 = new g85(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z2 && g85Var2.k(14)) {
            zA = g85Var2.a(14, false);
            z = true;
        }
        if (i7 < 23) {
            if (g85Var2.k(3)) {
                colorStateListB = g85Var2.b(3);
            }
            if (g85Var2.k(4)) {
                colorStateListB2 = g85Var2.b(4);
            }
            if (g85Var2.k(5)) {
                colorStateListB3 = g85Var2.b(5);
            }
        }
        ColorStateList colorStateList = colorStateListB;
        ColorStateList colorStateList2 = colorStateListB2;
        ColorStateList colorStateList3 = colorStateListB3;
        if (g85Var2.k(15)) {
            strI = g85Var2.i(15);
        }
        String str = strI;
        if (i7 >= 26 && g85Var2.k(13)) {
            strI2 = g85Var2.i(13);
        }
        String str2 = strI2;
        if (i7 >= 28 && g85Var2.k(0) && g85Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, g85Var2);
        g85Var2.m();
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView.setHintTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setLinkTextColor(colorStateList3);
        }
        if (!z2 && z) {
            textView.setAllCaps(zA);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            NUlFixed.d(textView, str2);
        }
        if (str != null) {
            if (i7 >= 24) {
                LPt8Fixed.b(textView, LPt8Fixed.a(str));
            } else {
                CQf.c(textView, F1.a(str.split(",")[0]));
            }
        }
        int[] iArr3 = xApe.D;
        Jv jv = this.i;
        Context context2 = jv.j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = jv.i;
        bi5.l(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            jv.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            fApplyDimension = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
            i2 = 1;
        } else {
            i2 = 1;
            fApplyDimension = -1.0f;
        }
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i2) ? typedArrayObtainStyledAttributes.getDimension(i2, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = typedArrayObtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                jv.f = Jv.b(iArr4);
                jv.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!jv.i()) {
            jv.a = 0;
        } else if (jv.a == 1) {
            if (!jv.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (fApplyDimension == -1.0f) {
                    i3 = 2;
                    fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                jv.j(fApplyDimension, dimension2, dimension);
            }
            jv.g();
        }
        if (h2.b && jv.a != 0) {
            int[] iArr5 = jv.f;
            if (iArr5.length > 0) {
                if (NUlFixed.a(textView) != -1.0f) {
                    NUlFixed.b(textView, Math.round(jv.d), Math.round(jv.e), Math.round(jv.c), 0);
                } else {
                    NUlFixed.c(textView, iArr5, 0);
                }
            }
        }
        g85 g85Var3 = new g85(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int iH2 = g85Var3.h(8, -1);
        if (iH2 != -1) {
            mt0 = mt0A;
            drawableB = mt0.b(context, iH2);
        } else {
            mt0 = mt0A;
            drawableB = null;
        }
        int iH3 = g85Var3.h(13, -1);
        Drawable drawableB2 = iH3 != -1 ? mt0.b(context, iH3) : null;
        int iH4 = g85Var3.h(9, -1);
        Drawable drawableB3 = iH4 != -1 ? mt0.b(context, iH4) : null;
        int iH5 = g85Var3.h(6, -1);
        Drawable drawableB4 = iH5 != -1 ? mt0.b(context, iH5) : null;
        int iH6 = g85Var3.h(10, -1);
        Drawable drawableB5 = iH6 != -1 ? mt0.b(context, iH6) : null;
        int iH7 = g85Var3.h(7, -1);
        Drawable drawableB6 = iH7 != -1 ? mt0.b(context, iH7) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = CQf.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            CQf.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = CQf.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                CQf.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (g85Var3.k(11)) {
            ColorStateList colorStateListB4 = g85Var3.b(11);
            if (Build.VERSION.SDK_INT >= 24) {
                c65.F1.f(textView, colorStateListB4);
            } else if (textView instanceof h85) {
                ((h85) textView).setSupportCompoundDrawablesTintList(colorStateListB4);
            }
        }
        if (g85Var3.k(12)) {
            fontMetricsInt = null;
            PorterDuff.Mode modeC = bp0.c(g85Var3.g(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                c65.F1.g(textView, modeC);
            } else if (textView instanceof h85) {
                ((h85) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        } else {
            fontMetricsInt = null;
        }
        int iD = g85Var3.d(15, -1);
        int iD2 = g85Var3.d(18, -1);
        int iD3 = g85Var3.d(19, -1);
        g85Var3.m();
        if (iD != -1) {
            c65.b(textView, iD);
        }
        if (iD2 != -1) {
            c65.c(textView, iD2);
        }
        if (iD3 != -1) {
            C0239D.k(iD3);
            int fontMetricsInt2 = textView.getPaint().getFontMetricsInt(fontMetricsInt);
            if (iD3 != fontMetricsInt2) {
                textView.setLineSpacing(iD3 - fontMetricsInt2, 1.0f);
            }
        }
    }

    public final void g(Context context, int i) {
        String strI;
        ColorStateList colorStateListB;
        ColorStateList colorStateListB2;
        ColorStateList colorStateListB3;
        g85 g85Var = new g85(context, context.obtainStyledAttributes(i, xApe.Q));
        boolean zK = g85Var.k(14);
        TextView textView = this.a;
        if (zK) {
            textView.setAllCaps(g85Var.a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (g85Var.k(3) && (colorStateListB3 = g85Var.b(3)) != null) {
                textView.setTextColor(colorStateListB3);
            }
            if (g85Var.k(5) && (colorStateListB2 = g85Var.b(5)) != null) {
                textView.setLinkTextColor(colorStateListB2);
            }
            if (g85Var.k(4) && (colorStateListB = g85Var.b(4)) != null) {
                textView.setHintTextColor(colorStateListB);
            }
        }
        if (g85Var.k(0) && g85Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, g85Var);
        if (i2 >= 26 && g85Var.k(13) && (strI = g85Var.i(13)) != null) {
            NUlFixed.d(textView, strI);
        }
        g85Var.m();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        Jv jv = this.i;
        if (jv.i()) {
            DisplayMetrics displayMetrics = jv.j.getResources().getDisplayMetrics();
            jv.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (jv.g()) {
                jv.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        Jv jv = this.i;
        if (jv.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = jv.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                jv.f = Jv.b(iArrCopyOf);
                if (!jv.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                jv.g = false;
            }
            if (jv.g()) {
                jv.a();
            }
        }
    }

    public final void j(int i) {
        Jv jv = this.i;
        if (jv.i()) {
            if (i == 0) {
                jv.a = 0;
                jv.d = -1.0f;
                jv.e = -1.0f;
                jv.c = -1.0f;
                jv.f = new int[0];
                jv.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(GM.a("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = jv.j.getResources().getDisplayMetrics();
            jv.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (jv.g()) {
                jv.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new e85();
        }
        e85 e85Var = this.h;
        e85Var.a = colorStateList;
        e85Var.d = colorStateList != null;
        this.b = e85Var;
        this.c = e85Var;
        this.d = e85Var;
        this.e = e85Var;
        this.f = e85Var;
        this.g = e85Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new e85();
        }
        e85 e85Var = this.h;
        e85Var.b = mode;
        e85Var.c = mode != null;
        this.b = e85Var;
        this.c = e85Var;
        this.d = e85Var;
        this.e = e85Var;
        this.f = e85Var;
        this.g = e85Var;
    }

    public final void m(Context context, g85 g85Var) {
        String strI;
        this.j = g85Var.g(2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iG = g85Var.g(11, -1);
            this.k = iG;
            if (iG != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!g85Var.k(10) && !g85Var.k(12)) {
            if (g85Var.k(1)) {
                this.m = false;
                int iG2 = g85Var.g(1, 1);
                if (iG2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (iG2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (iG2 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i2 = g85Var.k(12) ? 12 : 10;
        int i3 = this.k;
        int i4 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceF = g85Var.f(i2, this.j, new QnHx(i3, i4, new WeakReference(this.a)));
                if (typefaceF != null) {
                    if (i < 28 || this.k == -1) {
                        this.l = typefaceF;
                    } else {
                        this.l = YKK.a(Typeface.create(typefaceF, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strI = g85Var.i(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(strI, this.j);
        } else {
            this.l = YKK.a(Typeface.create(strI, 0), this.k, (this.j & 2) != 0);
        }
    }
}
