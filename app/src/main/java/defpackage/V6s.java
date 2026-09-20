package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class V6s {
    public final ImageView a;
    public e85 b;
    public e85 c;
    public int d = 0;

    public V6s(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            bp0.a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.c == null) {
                    this.c = new e85();
                }
                e85 e85Var = this.c;
                e85Var.a = null;
                e85Var.d = false;
                e85Var.b = null;
                e85Var.c = false;
                ColorStateList colorStateListA = gj1.a(imageView);
                if (colorStateListA != null) {
                    e85Var.d = true;
                    e85Var.a = colorStateListA;
                }
                PorterDuff.Mode modeB = gj1.b(imageView);
                if (modeB != null) {
                    e85Var.c = true;
                    e85Var.b = modeB;
                }
                if (e85Var.d || e85Var.c) {
                    Mt0.e(drawable, e85Var, imageView.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            e85 e85Var2 = this.b;
            if (e85Var2 != null) {
                Mt0.e(drawable, e85Var2, imageView.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int iH;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = xApe.B;
        g85 g85VarL = g85.l(context, attributeSet, iArr, i);
        bi5.l(imageView, imageView.getContext(), iArr, attributeSet, g85VarL.b, i);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (iH = g85VarL.h(1, -1)) != -1 && (drawable3 = XTd3.l(imageView.getContext(), iH)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                bp0.a(drawable3);
            }
            if (g85VarL.k(2)) {
                ColorStateList colorStateListB = g85VarL.b(2);
                int i2 = Build.VERSION.SDK_INT;
                gj1.c(imageView, colorStateListB);
                if (i2 == 21 && (drawable2 = imageView.getDrawable()) != null && gj1.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (g85VarL.k(3)) {
                PorterDuff.Mode modeC = bp0.c(g85VarL.g(3, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                gj1.d(imageView, modeC);
                if (i3 == 21 && (drawable = imageView.getDrawable()) != null && gj1.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            g85VarL.m();
        }
    }

    public final void c(int i) {
        ImageView imageView = this.a;
        if (i != 0) {
            Drawable drawableL = XTd3.l(imageView.getContext(), i);
            if (drawableL != null) {
                bp0.a(drawableL);
            }
            imageView.setImageDrawable(drawableL);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
