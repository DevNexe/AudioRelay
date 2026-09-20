package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends e70 {
    public float e0 = -1.0f;
    public int f0 = -1;
    public int g0 = -1;
    public w60 h0 = this.z;
    public int i0 = 0;

    public bb1() {
        this.H.clear();
        this.H.add(this.h0);
        int length = this.G.length;
        for (int i = 0; i < length; i++) {
            this.G[i] = this.h0;
        }
    }

    @Override // defpackage.e70
    public final void a(o32 o32Var) {
        f70 f70Var = (f70) this.K;
        if (f70Var == null) {
            return;
        }
        w60 w60VarE = f70Var.e(w60.QnHx.LEFT);
        w60 w60VarE2 = f70Var.e(w60.QnHx.RIGHT);
        e70 e70Var = this.K;
        boolean z = e70Var != null && e70Var.J[0] == 2;
        if (this.i0 == 0) {
            w60VarE = f70Var.e(w60.QnHx.TOP);
            w60VarE2 = f70Var.e(w60.QnHx.BOTTOM);
            e70 e70Var2 = this.K;
            z = e70Var2 != null && e70Var2.J[1] == 2;
        }
        if (this.f0 != -1) {
            kq4 kq4VarJ = o32Var.j(this.h0);
            o32Var.e(kq4VarJ, o32Var.j(w60VarE), this.f0, 8);
            if (z) {
                o32Var.f(o32Var.j(w60VarE2), kq4VarJ, 0, 5);
                return;
            }
            return;
        }
        if (this.g0 != -1) {
            kq4 kq4VarJ2 = o32Var.j(this.h0);
            kq4 kq4VarJ3 = o32Var.j(w60VarE2);
            o32Var.e(kq4VarJ2, kq4VarJ3, -this.g0, 8);
            if (z) {
                o32Var.f(kq4VarJ2, o32Var.j(w60VarE), 0, 5);
                o32Var.f(kq4VarJ3, kq4VarJ2, 0, 5);
                return;
            }
            return;
        }
        if (this.e0 != -1.0f) {
            kq4 kq4VarJ4 = o32Var.j(this.h0);
            kq4 kq4VarJ5 = o32Var.j(w60VarE2);
            float f = this.e0;
            Cpj cpjK = o32Var.k();
            cpjK.d.k(kq4VarJ4, -1.0f);
            cpjK.d.k(kq4VarJ5, f);
            o32Var.c(cpjK);
        }
    }

    @Override // defpackage.e70
    public final boolean b() {
        return true;
    }

    @Override // defpackage.e70
    public final w60 e(w60.QnHx qnHx) {
        switch (qnHx) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
            case RIGHT:
                if (this.i0 == 1) {
                    return this.h0;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.i0 == 0) {
                    return this.h0;
                }
                break;
        }
        throw new AssertionError(qnHx.name());
    }

    @Override // defpackage.e70
    public final void x(o32 o32Var) {
        if (this.K == null) {
            return;
        }
        w60 w60Var = this.h0;
        o32Var.getClass();
        int iM = o32.m(w60Var);
        if (this.i0 == 1) {
            this.P = iM;
            this.Q = 0;
            s(this.K.g());
            v(0);
            return;
        }
        this.P = 0;
        this.Q = iM;
        v(this.K.j());
        s(0);
    }

    public final void y(int i) {
        if (this.i0 == i) {
            return;
        }
        this.i0 = i;
        ArrayList<w60> arrayList = this.H;
        arrayList.clear();
        if (this.i0 == 1) {
            this.h0 = this.y;
        } else {
            this.h0 = this.z;
        }
        arrayList.add(this.h0);
        w60[] w60VarArr = this.G;
        int length = w60VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            w60VarArr[i2] = this.h0;
        }
    }
}
