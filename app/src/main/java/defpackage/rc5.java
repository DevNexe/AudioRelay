package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rc5 {
    public final w55 a;
    public final w55 b;
    public final w55 c;
    public final w55 d;
    public final w55 e;
    public final w55 f;
    public final w55 g;
    public final w55 h;
    public final w55 i;
    public final w55 j;
    public final w55 k;
    public final w55 l;
    public final w55 m;

    public rc5() {
        xg0 xg0Var = e41.w;
        x41 x41Var = x41.y;
        w55 w55Var = new w55(0L, FWT.B(96), x41Var, null, null, FWT.A(-1.5d), null, null, 0L, 262009);
        w55 w55Var2 = new w55(0L, FWT.B(60), x41Var, null, null, FWT.A(-0.5d), null, null, 0L, 262009);
        x41 x41Var2 = x41.z;
        w55 w55Var3 = new w55(0L, FWT.B(48), x41Var2, null, null, FWT.B(0), null, null, 0L, 262009);
        w55 w55Var4 = new w55(0L, FWT.B(34), x41Var2, null, null, FWT.A(0.25d), null, null, 0L, 262009);
        w55 w55Var5 = new w55(0L, FWT.B(24), x41Var2, null, null, FWT.B(0), null, null, 0L, 262009);
        x41 x41Var3 = x41.A;
        w55 w55Var6 = new w55(0L, FWT.B(20), x41Var3, null, null, FWT.A(0.15d), null, null, 0L, 262009);
        w55 w55Var7 = new w55(0L, FWT.B(16), x41Var2, null, null, FWT.A(0.15d), null, null, 0L, 262009);
        w55 w55Var8 = new w55(0L, FWT.B(14), x41Var3, null, null, FWT.A(0.1d), null, null, 0L, 262009);
        w55 w55Var9 = new w55(0L, FWT.B(16), x41Var2, null, null, FWT.A(0.5d), null, null, 0L, 262009);
        w55 w55Var10 = new w55(0L, FWT.B(14), x41Var2, null, null, FWT.A(0.25d), null, null, 0L, 262009);
        w55 w55Var11 = new w55(0L, FWT.B(14), x41Var3, null, null, FWT.A(1.25d), null, null, 0L, 262009);
        w55 w55Var12 = new w55(0L, FWT.B(12), x41Var2, null, null, FWT.A(0.4d), null, null, 0L, 262009);
        w55 w55Var13 = new w55(0L, FWT.B(10), x41Var2, null, null, FWT.A(1.5d), null, null, 0L, 262009);
        w55 w55VarA = sc5.a(w55Var, xg0Var);
        w55 w55VarA2 = sc5.a(w55Var2, xg0Var);
        w55 w55VarA3 = sc5.a(w55Var3, xg0Var);
        w55 w55VarA4 = sc5.a(w55Var4, xg0Var);
        w55 w55VarA5 = sc5.a(w55Var5, xg0Var);
        w55 w55VarA6 = sc5.a(w55Var6, xg0Var);
        w55 w55VarA7 = sc5.a(w55Var7, xg0Var);
        w55 w55VarA8 = sc5.a(w55Var8, xg0Var);
        w55 w55VarA9 = sc5.a(w55Var9, xg0Var);
        w55 w55VarA10 = sc5.a(w55Var10, xg0Var);
        w55 w55VarA11 = sc5.a(w55Var11, xg0Var);
        w55 w55VarA12 = sc5.a(w55Var12, xg0Var);
        w55 w55VarA13 = sc5.a(w55Var13, xg0Var);
        this.a = w55VarA;
        this.b = w55VarA2;
        this.c = w55VarA3;
        this.d = w55VarA4;
        this.e = w55VarA5;
        this.f = w55VarA6;
        this.g = w55VarA7;
        this.h = w55VarA8;
        this.i = w55VarA9;
        this.j = w55VarA10;
        this.k = w55VarA11;
        this.l = w55VarA12;
        this.m = w55VarA13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc5)) {
            return false;
        }
        rc5 rc5Var = (rc5) obj;
        return ur1.a(this.a, rc5Var.a) && ur1.a(this.b, rc5Var.b) && ur1.a(this.c, rc5Var.c) && ur1.a(this.d, rc5Var.d) && ur1.a(this.e, rc5Var.e) && ur1.a(this.f, rc5Var.f) && ur1.a(this.g, rc5Var.g) && ur1.a(this.h, rc5Var.h) && ur1.a(this.i, rc5Var.i) && ur1.a(this.j, rc5Var.j) && ur1.a(this.k, rc5Var.k) && ur1.a(this.l, rc5Var.l) && ur1.a(this.m, rc5Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", subtitle1=" + this.g + ", subtitle2=" + this.h + ", body1=" + this.i + ", body2=" + this.j + ", button=" + this.k + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}
