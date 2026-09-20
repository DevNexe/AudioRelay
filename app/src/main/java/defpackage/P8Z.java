package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class P8Z {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public P8Z(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        Drawable drawableA;
        int i = Build.VERSION.SDK_INT;
        CompoundButton compoundButton = this.a;
        if (i >= 23) {
            drawableA = t40.CQf.a(compoundButton);
        } else {
            if (!t40.b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    t40.a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                t40.b = true;
            }
            Field field = t40.a;
            if (field != null) {
                try {
                    drawableA = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    t40.a = null;
                    drawableA = null;
                }
            } else {
                drawableA = null;
            }
        }
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = uo0.g(drawableA).mutate();
                if (this.d) {
                    uo0.CQf.h(drawableMutate, this.b);
                }
                if (this.e) {
                    uo0.CQf.i(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int iH;
        int iH2;
        CompoundButton compoundButton = this.a;
        Context context = compoundButton.getContext();
        int[] iArr = xApe.G;
        g85 g85VarL = g85.l(context, attributeSet, iArr, i);
        bi5.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, g85VarL.b, i);
        boolean z = true;
        try {
            if (!g85VarL.k(1) || (iH2 = g85VarL.h(1, 0)) == 0) {
                z = false;
            } else {
                try {
                    compoundButton.setButtonDrawable(XTd3.l(compoundButton.getContext(), iH2));
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z && g85VarL.k(0) && (iH = g85VarL.h(0, 0)) != 0) {
                compoundButton.setButtonDrawable(XTd3.l(compoundButton.getContext(), iH));
            }
            if (g85VarL.k(2)) {
                t40.QnHx.c(compoundButton, g85VarL.b(2));
            }
            if (g85VarL.k(3)) {
                t40.QnHx.d(compoundButton, bp0.c(g85VarL.g(3, -1), null));
            }
        } finally {
            g85VarL.m();
        }
    }
}
