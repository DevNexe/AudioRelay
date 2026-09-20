package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.azefsw.audioconnect.R;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class x92 {
    public final MaterialButton a;
    public ej4 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public la2 m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public RippleDrawable r;
    public int s;

    public x92(MaterialButton materialButton, ej4 ej4Var) {
        this.a = materialButton;
        this.b = ej4Var;
    }

    public final ij4 a() {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.r.getNumberOfLayers() > 2 ? (ij4) this.r.getDrawable(2) : (ij4) this.r.getDrawable(1);
    }

    public final la2 b(boolean z) {
        RippleDrawable rippleDrawable = this.r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (la2) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(ej4 ej4Var) {
        this.b = ej4Var;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(ej4Var);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(ej4Var);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(ej4Var);
        }
    }

    public final void d(int i, int i2) {
        Field field = bi5.a;
        MaterialButton materialButton = this.a;
        int iF = bi5.NUlFixed.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iE = bi5.NUlFixed.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        bi5.NUlFixed.k(materialButton, iF, (paddingTop + i) - i3, iE, (paddingBottom + i2) - i4);
    }

    public final void e() {
        la2 la2Var = new la2(this.b);
        MaterialButton materialButton = this.a;
        la2Var.h(materialButton.getContext());
        uo0.CQf.h(la2Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            uo0.CQf.i(la2Var, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        la2Var.w.k = f;
        la2Var.invalidateSelf();
        la2.CQf cQf = la2Var.w;
        if (cQf.d != colorStateList) {
            cQf.d = colorStateList;
            la2Var.onStateChange(la2Var.getState());
        }
        la2 la2Var2 = new la2(this.b);
        la2Var2.setTint(0);
        float f2 = this.h;
        int iT = this.n ? X.t(materialButton, R.attr.colorSurface) : 0;
        la2Var2.w.k = f2;
        la2Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT);
        la2.CQf cQf2 = la2Var2.w;
        if (cQf2.d != colorStateListValueOf) {
            cQf2.d = colorStateListValueOf;
            la2Var2.onStateChange(la2Var2.getState());
        }
        la2 la2Var3 = new la2(this.b);
        this.m = la2Var3;
        uo0.CQf.g(la2Var3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(ys3.a(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{la2Var2, la2Var}), this.c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        la2 la2VarB = b(false);
        if (la2VarB != null) {
            la2VarB.i(this.s);
        }
    }

    public final void f() {
        la2 la2VarB = b(false);
        la2 la2VarB2 = b(true);
        if (la2VarB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            la2VarB.w.k = f;
            la2VarB.invalidateSelf();
            la2.CQf cQf = la2VarB.w;
            if (cQf.d != colorStateList) {
                cQf.d = colorStateList;
                la2VarB.onStateChange(la2VarB.getState());
            }
            if (la2VarB2 != null) {
                float f2 = this.h;
                int iT = this.n ? X.t(this.a, R.attr.colorSurface) : 0;
                la2VarB2.w.k = f2;
                la2VarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT);
                la2.CQf cQf2 = la2VarB2.w;
                if (cQf2.d != colorStateListValueOf) {
                    cQf2.d = colorStateListValueOf;
                    la2VarB2.onStateChange(la2VarB2.getState());
                }
            }
        }
    }
}
