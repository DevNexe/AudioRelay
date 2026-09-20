package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class UH8 extends TextPaint {
    public a25 a;
    public yi4 b;
    public cg c;
    public cm4 d;

    public UH8(float f) {
        super(1);
        ((TextPaint) this).density = f;
        this.a = a25.b;
        this.b = yi4.d;
    }

    public final void a(cg cgVar, long j) {
        if (cgVar == null) {
            setShader(null);
            return;
        }
        if (ur1.a(this.c, cgVar)) {
            cm4 cm4Var = this.d;
            if (cm4Var == null ? false : cm4.b(cm4Var.a, j)) {
                return;
            }
        }
        this.c = cgVar;
        this.d = new cm4(j);
        if (cgVar instanceof jq4) {
            setShader(null);
            b(((jq4) cgVar).a);
        } else if (cgVar instanceof wi4) {
            int i = cm4.d;
            if (j != cm4.c) {
                setShader(((wi4) cgVar).b(j));
            }
        }
    }

    public final void b(long j) {
        int iA;
        int i = yu.i;
        if (!(j != yu.h) || getColor() == (iA = hH.A(j))) {
            return;
        }
        setColor(iA);
    }

    public final void c(yi4 yi4Var) {
        if (yi4Var == null) {
            yi4 yi4Var2 = yi4.d;
            yi4Var = yi4.d;
        }
        if (ur1.a(this.b, yi4Var)) {
            return;
        }
        this.b = yi4Var;
        yi4 yi4Var3 = yi4.d;
        if (ur1.a(yi4Var, yi4.d)) {
            clearShadowLayer();
        } else {
            yi4 yi4Var4 = this.b;
            setShadowLayer(yi4Var4.c, kt2.c(yi4Var4.b), kt2.d(this.b.b), hH.A(this.b.a));
        }
    }

    public final void d(a25 a25Var) {
        if (a25Var == null) {
            a25Var = a25.b;
        }
        if (ur1.a(this.a, a25Var)) {
            return;
        }
        this.a = a25Var;
        int i = a25Var.a;
        setUnderlineText((1 | i) == i);
        a25 a25Var2 = this.a;
        a25Var2.getClass();
        int i2 = a25Var2.a;
        setStrikeThruText((2 | i2) == i2);
    }
}
