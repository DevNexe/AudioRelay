package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mu4 extends B8C implements eu1 {
    public final lb4 A;
    public final mt1 B;
    public boolean C;
    public String D;
    public final h30 w;
    public final ws1 x;
    public final int y;
    public final eu1[] z;

    public mu4(h30 h30Var, ws1 ws1Var, int i, eu1[] eu1VarArr) {
        this.w = h30Var;
        this.x = ws1Var;
        this.y = i;
        this.z = eu1VarArr;
        this.A = ws1Var.b;
        this.B = ws1Var.a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (eu1VarArr != null) {
            eu1 eu1Var = eu1VarArr[i2];
            if (eu1Var == null && eu1Var == this) {
                return;
            }
            eu1VarArr[i2] = this;
        }
    }

    @Override // defpackage.i40
    public final void B(u83 u83Var, int i, rv1 rv1Var, Object obj) {
        if (obj != null || this.B.f) {
            x0(u83Var, i);
            if (rv1Var.a().c()) {
                F(rv1Var, obj);
            } else if (obj == null) {
                h();
            } else {
                F(rv1Var, obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.B8C, defpackage.ls0
    public final <T> void F(db4<? super T> db4Var, T t) {
        if (db4Var instanceof QX) {
            ws1 ws1Var = this.x;
            if (!ws1Var.a.i) {
                QX qx = (QX) db4Var;
                String strD = kd.d(db4Var.a(), ws1Var);
                db4 db4VarK = kd.k(qx, this, t);
                if ((qx instanceof e74) && bx0.d(db4VarK.a()).contains(strD)) {
                    String strA = qx.a().a();
                    throw new IllegalStateException(("Sealed class '" + db4VarK.a().a() + "' cannot be serialized as base class '" + strA + "' because it has property name that conflicts with JSON class discriminator '" + strD + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
                }
                xa4 xa4VarE = db4VarK.a().e();
                if (xa4VarE instanceof xa4.CQf) {
                    throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
                }
                if (xa4VarE instanceof ee3) {
                    throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
                }
                if (xa4VarE instanceof q93) {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                }
                this.D = strD;
                db4VarK.e(this, t);
                return;
            }
        }
        db4Var.e(this, t);
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void K(char c) {
        r0(String.valueOf(c));
    }

    @Override // defpackage.ls0
    public final void T(pa4 pa4Var, int i) {
        r0(pa4Var.g(i));
    }

    @Override // defpackage.g40
    public final lb4 a() {
        return this.A;
    }

    @Override // defpackage.ls0
    public final eu1 b(pa4 pa4Var) {
        eu1 eu1Var;
        ws1 ws1Var = this.x;
        int iN = AY.N(pa4Var, ws1Var);
        char cB = o5.b(iN);
        h30 h30Var = this.w;
        if (cB != 0) {
            h30Var.d(cB);
            h30Var.a();
        }
        if (this.D != null) {
            h30Var.b();
            r0(this.D);
            h30Var.d(':');
            h30Var.i();
            r0(pa4Var.a());
            this.D = null;
        }
        if (this.y == iN) {
            return this;
        }
        eu1[] eu1VarArr = this.z;
        return (eu1VarArr == null || (eu1Var = eu1VarArr[O.h(iN)]) == null) ? new mu4(h30Var, ws1Var, iN, eu1VarArr) : eu1Var;
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void f0(int i) {
        if (this.C) {
            r0(String.valueOf(i));
        } else {
            this.w.e(i);
        }
    }

    @Override // defpackage.ls0
    public final void h() {
        this.w.g("null");
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void h0(long j) {
        if (this.C) {
            r0(String.valueOf(j));
        } else {
            this.w.f(j);
        }
    }

    @Override // defpackage.i40
    public final void k() {
        int i = this.y;
        if (o5.c(i) != 0) {
            h30 h30Var = this.w;
            h30Var.j();
            h30Var.b();
            h30Var.d(o5.c(i));
        }
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void l(double d) {
        boolean z = this.C;
        h30 h30Var = this.w;
        if (z) {
            r0(String.valueOf(d));
        } else {
            h30Var.a.c(String.valueOf(d));
        }
        if (this.B.k) {
            return;
        }
        if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
            throw AY.c(Double.valueOf(d), h30Var.a.toString());
        }
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void m(short s) {
        if (this.C) {
            r0(String.valueOf((int) s));
        } else {
            this.w.h(s);
        }
    }

    @Override // defpackage.i40
    public final boolean m0() {
        return this.B.a;
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void o(byte b) {
        if (this.C) {
            r0(String.valueOf((int) b));
        } else {
            this.w.c(b);
        }
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void q(boolean z) {
        if (this.C) {
            r0(String.valueOf(z));
        } else {
            this.w.a.c(String.valueOf(z));
        }
    }

    @Override // defpackage.ls0
    public final mu4 r(pa4 pa4Var) {
        if (!nu4.a(pa4Var)) {
            return this;
        }
        h30 i30Var = this.w;
        if (!(i30Var instanceof i30)) {
            i30Var = new i30(i30Var.a, this.C);
        }
        return new mu4(i30Var, this.x, this.y, null);
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void r0(String str) {
        this.w.a.b(str);
    }

    @Override // defpackage.B8C, defpackage.ls0
    public final void x(float f) {
        boolean z = this.C;
        h30 h30Var = this.w;
        if (z) {
            r0(String.valueOf(f));
        } else {
            h30Var.a.c(String.valueOf(f));
        }
        if (this.B.k) {
            return;
        }
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            throw AY.c(Float.valueOf(f), h30Var.a.toString());
        }
    }

    @Override // defpackage.B8C
    public final void x0(pa4 pa4Var, int i) {
        int iH = O.h(this.y);
        boolean z = true;
        h30 h30Var = this.w;
        if (iH == 1) {
            if (!h30Var.b) {
                h30Var.d(',');
            }
            h30Var.b();
            return;
        }
        if (iH == 2) {
            if (h30Var.b) {
                this.C = true;
                h30Var.b();
                return;
            }
            if (i % 2 == 0) {
                h30Var.d(',');
                h30Var.b();
            } else {
                h30Var.d(':');
                h30Var.i();
                z = false;
            }
            this.C = z;
            return;
        }
        if (iH != 3) {
            if (!h30Var.b) {
                h30Var.d(',');
            }
            h30Var.b();
            r0(pa4Var.g(i));
            h30Var.d(':');
            h30Var.i();
            return;
        }
        if (i == 0) {
            this.C = true;
        }
        if (i == 1) {
            h30Var.d(',');
            h30Var.i();
            this.C = false;
        }
    }
}
