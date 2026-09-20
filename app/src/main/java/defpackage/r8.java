package defpackage;

import defpackage.r8;
import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class r8<T extends r8<T>> {
    public final Z7jl a;
    public final long b;
    public final o55 c;
    public final mt2 d;
    public final r55 e;
    public long f;
    public final Z7jl g;

    public r8(Z7jl z7jl, long j, o55 o55Var, mt2 mt2Var, r55 r55Var) {
        this.a = z7jl;
        this.b = j;
        this.c = o55Var;
        this.d = mt2Var;
        this.e = r55Var;
        this.f = j;
        this.g = z7jl;
    }

    public final Integer a() {
        o55 o55Var = this.c;
        if (o55Var == null) {
            return null;
        }
        int iD = s55.d(this.f);
        mt2 mt2Var = this.d;
        return Integer.valueOf(mt2Var.a(o55Var.e(o55Var.f(mt2Var.b(iD)), true)));
    }

    public final Integer b() {
        o55 o55Var = this.c;
        if (o55Var == null) {
            return null;
        }
        int iE = s55.e(this.f);
        mt2 mt2Var = this.d;
        return Integer.valueOf(mt2Var.a(o55Var.j(o55Var.f(mt2Var.b(iE)))));
    }

    public final int c(o55 o55Var, int i) {
        Z7jl z7jl = this.a;
        if (i >= z7jl.length()) {
            return z7jl.length();
        }
        int length = this.g.w.length() - 1;
        if (i <= length) {
            length = i;
        }
        long jN = o55Var.n(length);
        return s55.c(jN) <= i ? c(o55Var, i + 1) : this.d.a(s55.c(jN));
    }

    public final int d(o55 o55Var, int i) {
        if (i < 0) {
            return 0;
        }
        int length = this.g.w.length() - 1;
        if (i <= length) {
            length = i;
        }
        int iN = (int) (o55Var.n(length) >> 32);
        return iN >= i ? d(o55Var, i - 1) : this.d.a(iN);
    }

    public final boolean e() {
        o55 o55Var = this.c;
        return (o55Var != null ? o55Var.m(s55.c(this.f)) : null) != np3.Rtl;
    }

    public final int f(o55 o55Var, int i) {
        int iC = s55.c(this.f);
        mt2 mt2Var = this.d;
        int iB = mt2Var.b(iC);
        r55 r55Var = this.e;
        if (r55Var.a == null) {
            r55Var.a = Float.valueOf(o55Var.c(iB).a);
        }
        int iF = o55Var.f(iB) + i;
        if (iF < 0) {
            return 0;
        }
        if (iF >= o55Var.b.f) {
            return this.g.w.length();
        }
        float fD = o55Var.d(iF) - 1;
        Float f = r55Var.a;
        float fFloatValue = f.floatValue();
        return ((!e() || fFloatValue < o55Var.i(iF)) && (e() || fFloatValue > o55Var.h(iF))) ? mt2Var.a(o55Var.l(X.a(f.floatValue(), fD))) : o55Var.e(iF, true);
    }

    public final void g() {
        this.e.a = null;
        if (this.g.w.length() > 0) {
            if (e()) {
                l();
            } else {
                i();
            }
        }
    }

    public final void h() {
        this.e.a = null;
        if (this.g.w.length() > 0) {
            if (e()) {
                n();
            } else {
                k();
            }
        }
    }

    public final void i() {
        this.e.a = null;
        Z7jl z7jl = this.g;
        if (z7jl.w.length() > 0) {
            String str = z7jl.w;
            int iC = s55.c(this.f);
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iFollowing = characterInstance.following(iC);
            if (iFollowing != -1) {
                w(iFollowing, iFollowing);
            }
        }
    }

    public final void j() {
        this.e.a = null;
        Z7jl z7jl = this.g;
        if (z7jl.w.length() > 0) {
            int iD = s55.d(this.f) + 1;
            String str = z7jl.w;
            int length = str.length();
            while (iD < length) {
                if (str.charAt(iD) == '\n') {
                    w(iD, iD);
                }
                iD++;
            }
            iD = str.length();
            w(iD, iD);
        }
    }

    public final void k() {
        Integer numValueOf = null;
        this.e.a = null;
        if (this.g.w.length() > 0) {
            o55 o55Var = this.c;
            if (o55Var != null) {
                numValueOf = Integer.valueOf(c(o55Var, this.d.b(s55.c(this.f))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                w(iIntValue, iIntValue);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        Z7jl z7jl = this.g;
        if (z7jl.w.length() > 0) {
            String str = z7jl.w;
            int iC = s55.c(this.f);
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iPreceding = characterInstance.preceding(iC);
            if (iPreceding != -1) {
                w(iPreceding, iPreceding);
            }
        }
    }

    public final void m() {
        this.e.a = null;
        Z7jl z7jl = this.g;
        int i = 0;
        if (z7jl.w.length() > 0) {
            int iE = s55.e(this.f) - 1;
            while (iE > 0) {
                int i2 = iE - 1;
                if (z7jl.w.charAt(i2) == '\n') {
                    i = iE;
                    break;
                }
                iE = i2;
            }
            w(i, i);
        }
    }

    public final void n() {
        Integer numValueOf = null;
        this.e.a = null;
        if (this.g.w.length() > 0) {
            o55 o55Var = this.c;
            if (o55Var != null) {
                numValueOf = Integer.valueOf(d(o55Var, this.d.b(s55.c(this.f))));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                w(iIntValue, iIntValue);
            }
        }
    }

    public final void o() {
        this.e.a = null;
        if (this.g.w.length() > 0) {
            if (e()) {
                i();
            } else {
                l();
            }
        }
    }

    public final void p() {
        this.e.a = null;
        if (this.g.w.length() > 0) {
            if (e()) {
                k();
            } else {
                n();
            }
        }
    }

    public final void q() {
        this.e.a = null;
        Z7jl z7jl = this.g;
        if (z7jl.w.length() > 0) {
            int length = z7jl.w.length();
            w(length, length);
        }
    }

    public final void r() {
        Integer numA;
        this.e.a = null;
        if (!(this.g.w.length() > 0) || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        w(iIntValue, iIntValue);
    }

    public final void s() {
        this.e.a = null;
        if (this.g.w.length() > 0) {
            if (e()) {
                u();
            } else {
                r();
            }
        }
    }

    public final void t() {
        this.e.a = null;
        if (this.g.w.length() > 0) {
            if (e()) {
                r();
            } else {
                u();
            }
        }
    }

    public final void u() {
        Integer numB;
        this.e.a = null;
        if (!(this.g.w.length() > 0) || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        w(iIntValue, iIntValue);
    }

    public final void v() {
        if (this.g.w.length() > 0) {
            int i = s55.c;
            this.f = Cz.a((int) (this.b >> 32), s55.c(this.f));
        }
    }

    public final void w(int i, int i2) {
        this.f = Cz.a(i, i2);
    }
}
