package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class NWnB {
    public final View a;
    public e85 d;
    public e85 e;
    public e85 f;
    public int c = -1;
    public final Mt0 b = Mt0.a();

    public NWnB(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.d != null) {
                if (this.f == null) {
                    this.f = new e85();
                }
                e85 e85Var = this.f;
                e85Var.a = null;
                e85Var.d = false;
                e85Var.b = null;
                e85Var.c = false;
                Field field = bi5.a;
                ColorStateList colorStateListG = bi5.byN.g(view);
                if (colorStateListG != null) {
                    e85Var.d = true;
                    e85Var.a = colorStateListG;
                }
                PorterDuff.Mode modeH = bi5.byN.h(view);
                if (modeH != null) {
                    e85Var.c = true;
                    e85Var.b = modeH;
                }
                if (e85Var.d || e85Var.c) {
                    Mt0.e(background, e85Var, view.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            e85 e85Var2 = this.e;
            if (e85Var2 != null) {
                Mt0.e(background, e85Var2, view.getDrawableState());
                return;
            }
            e85 e85Var3 = this.d;
            if (e85Var3 != null) {
                Mt0.e(background, e85Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        e85 e85Var = this.e;
        if (e85Var != null) {
            return e85Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        e85 e85Var = this.e;
        if (e85Var != null) {
            return e85Var.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = xApe.S;
        g85 g85VarL = g85.l(context, attributeSet, iArr, i);
        View view2 = this.a;
        bi5.l(view2, view2.getContext(), iArr, attributeSet, g85VarL.b, i);
        try {
            if (g85VarL.k(0)) {
                this.c = g85VarL.h(0, -1);
                Mt0 mt0 = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (mt0) {
                    colorStateListI = mt0.a.i(context2, i2);
                }
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (g85VarL.k(1)) {
                ColorStateList colorStateListB = g85VarL.b(1);
                int i3 = Build.VERSION.SDK_INT;
                bi5.byN.q(view, colorStateListB);
                if (i3 == 21) {
                    Drawable background = view.getBackground();
                    boolean z = (bi5.byN.g(view) == null && bi5.byN.h(view) == null) ? false : true;
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        bi5.LPt8Fixed.q(view, background);
                    }
                }
            }
            if (g85VarL.k(2)) {
                PorterDuff.Mode modeC = bp0.c(g85VarL.g(2, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                bi5.byN.r(view, modeC);
                if (i4 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z2 = (bi5.byN.g(view) == null && bi5.byN.h(view) == null) ? false : true;
                    if (background2 != null && z2) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        bi5.LPt8Fixed.q(view, background2);
                    }
                }
            }
            g85VarL.m();
        } catch (Throwable th) {
            g85VarL.m();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListI;
        this.c = i;
        Mt0 mt0 = this.b;
        if (mt0 != null) {
            Context context = this.a.getContext();
            synchronized (mt0) {
                colorStateListI = mt0.a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        g(colorStateListI);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new e85();
            }
            e85 e85Var = this.d;
            e85Var.a = colorStateList;
            e85Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new e85();
        }
        e85 e85Var = this.e;
        e85Var.a = colorStateList;
        e85Var.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new e85();
        }
        e85 e85Var = this.e;
        e85Var.b = mode;
        e85Var.c = true;
        a();
    }
}
