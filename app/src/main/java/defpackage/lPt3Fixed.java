package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lPt3Fixed extends m05 implements tt1 {
    public final ws1 y;
    public final mt1 z;

    public lPt3Fixed(ws1 ws1Var) {
        this.y = ws1Var;
        this.z = ws1Var.a;
    }

    public static ku1 u(su1 su1Var, String str) {
        ku1 ku1Var = su1Var instanceof ku1 ? (ku1) su1Var : null;
        if (ku1Var != null) {
            return ku1Var;
        }
        throw AY.g(-1, "Unexpected 'null' when " + str + " was expected");
    }

    public abstract String B(pa4 pa4Var, int i);

    public final su1 E(String str) {
        vt1 vt1VarW = w(str);
        su1 su1Var = vt1VarW instanceof su1 ? (su1) vt1VarW : null;
        if (su1Var != null) {
            return su1Var;
        }
        throw AY.h("Expected JsonPrimitive at " + str + ", found " + vt1VarW, x().toString(), -1);
    }

    public abstract vt1 F();

    @Override // defpackage.g40
    public void G(pa4 pa4Var) {
    }

    public final void H(String str) {
        throw AY.h("Failed to parse '" + str + '\'', x().toString(), -1);
    }

    @Override // defpackage.m05, defpackage.pf0
    public final <T> T O(zj0<T> zj0Var) {
        return (T) kd.h(this, zj0Var);
    }

    @Override // defpackage.m05, defpackage.pf0
    public boolean X() {
        return !(x() instanceof nu1);
    }

    @Override // defpackage.g40
    public final lb4 a() {
        return this.y.b;
    }

    @Override // defpackage.pf0
    public g40 b(pa4 pa4Var) {
        g40 wu1Var;
        vt1 vt1VarX = x();
        xa4 xa4VarE = pa4Var.e();
        boolean z = ur1.a(xa4VarE, uv4.CQf.a) ? true : xa4VarE instanceof q93;
        ws1 ws1Var = this.y;
        if (z) {
            if (!(vt1VarX instanceof dt1)) {
                throw AY.g(-1, "Expected " + nl3.a(dt1.class) + " as the serialized body of " + pa4Var.a() + ", but had " + nl3.a(vt1VarX.getClass()));
            }
            wu1Var = new xu1(ws1Var, (dt1) vt1VarX);
        } else if (ur1.a(xa4VarE, uv4.F1.a)) {
            pa4 pa4VarK = AY.k(pa4Var.j(0), ws1Var.b);
            xa4 xa4VarE2 = pa4VarK.e();
            if ((xa4VarE2 instanceof ee3) || ur1.a(xa4VarE2, xa4.CQf.a)) {
                if (!(vt1VarX instanceof pu1)) {
                    throw AY.g(-1, "Expected " + nl3.a(pu1.class) + " as the serialized body of " + pa4Var.a() + ", but had " + nl3.a(vt1VarX.getClass()));
                }
                wu1Var = new yu1(ws1Var, (pu1) vt1VarX);
            } else {
                if (!ws1Var.a.d) {
                    throw AY.d(pa4VarK);
                }
                if (!(vt1VarX instanceof dt1)) {
                    throw AY.g(-1, "Expected " + nl3.a(dt1.class) + " as the serialized body of " + pa4Var.a() + ", but had " + nl3.a(vt1VarX.getClass()));
                }
                wu1Var = new xu1(ws1Var, (dt1) vt1VarX);
            }
        } else {
            if (!(vt1VarX instanceof pu1)) {
                throw AY.g(-1, "Expected " + nl3.a(pu1.class) + " as the serialized body of " + pa4Var.a() + ", but had " + nl3.a(vt1VarX.getClass()));
            }
            wu1Var = new wu1(ws1Var, (pu1) vt1VarX, null, null);
        }
        return wu1Var;
    }

    @Override // defpackage.m05
    public final boolean c(Object obj) {
        String str = (String) obj;
        su1 su1VarE = E(str);
        if (!this.y.a.c && u(su1VarE, "boolean").w) {
            throw AY.h(fc2.a("Boolean literal for key '", str, "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), x().toString(), -1);
        }
        try {
            Boolean boolH = ddf.h(su1VarE);
            if (boolH != null) {
                return boolH.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            H("boolean");
            throw null;
        }
    }

    @Override // defpackage.m05
    public final byte d(Object obj) {
        try {
            int i = Integer.parseInt(E((String) obj).a());
            Byte bValueOf = -128 <= i && i <= 127 ? Byte.valueOf((byte) i) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            H("byte");
            throw null;
        } catch (IllegalArgumentException unused) {
            H("byte");
            throw null;
        }
    }

    @Override // defpackage.m05
    public final char e(Object obj) {
        try {
            String strA = E((String) obj).a();
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            H("char");
            throw null;
        }
    }

    @Override // defpackage.tt1
    public final ws1 e0() {
        return this.y;
    }

    @Override // defpackage.m05
    public final double f(Object obj) {
        String str = (String) obj;
        try {
            double d = Double.parseDouble(E(str).a());
            if (!this.y.a.k) {
                if (!((Double.isInfinite(d) || Double.isNaN(d)) ? false : true)) {
                    throw AY.b(Double.valueOf(d), str, x().toString());
                }
            }
            return d;
        } catch (IllegalArgumentException unused) {
            H("double");
            throw null;
        }
    }

    @Override // defpackage.m05
    public final int g(Object obj, pa4 pa4Var) {
        return S12N.i(pa4Var, this.y, E((String) obj).a(), "");
    }

    @Override // defpackage.m05
    public final float h(Object obj) {
        String str = (String) obj;
        try {
            float f = Float.parseFloat(E(str).a());
            if (!this.y.a.k) {
                if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
                    throw AY.b(Float.valueOf(f), str, x().toString());
                }
            }
            return f;
        } catch (IllegalArgumentException unused) {
            H("float");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.m05
    public final pf0 k(Object obj, mn1 mn1Var) {
        String str = (String) obj;
        if (nu4.a(mn1Var)) {
            return new ut1(new tu4(E(str).a()), this.y);
        }
        this.w.add((Tag) str);
        return this;
    }

    @Override // defpackage.m05
    public final int l(Object obj) {
        try {
            return Integer.parseInt(E((String) obj).a());
        } catch (IllegalArgumentException unused) {
            H("int");
            throw null;
        }
    }

    @Override // defpackage.m05
    public final long m(Object obj) {
        try {
            return Long.parseLong(E((String) obj).a());
        } catch (IllegalArgumentException unused) {
            H("long");
            throw null;
        }
    }

    @Override // defpackage.m05
    public final short n(Object obj) {
        try {
            int i = Integer.parseInt(E((String) obj).a());
            Short shValueOf = -32768 <= i && i <= 32767 ? Short.valueOf((short) i) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            H("short");
            throw null;
        } catch (IllegalArgumentException unused) {
            H("short");
            throw null;
        }
    }

    @Override // defpackage.m05
    public final String o(Object obj) {
        String str = (String) obj;
        su1 su1VarE = E(str);
        if (!this.y.a.c && !u(su1VarE, "string").w) {
            throw AY.h(fc2.a("String literal for key '", str, "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON."), x().toString(), -1);
        }
        if (su1VarE instanceof nu1) {
            throw AY.h("Unexpected 'null' value instead of string literal", x().toString(), -1);
        }
        return su1VarE.a();
    }

    @Override // defpackage.m05
    public final String q(pa4 pa4Var, int i) {
        String strB = B(pa4Var, i);
        return strB;
    }

    public abstract vt1 w(String str);

    public final vt1 x() {
        vt1 vt1VarW;
        String str = (String) wu.O0(this.w);
        return (str == null || (vt1VarW = w(str)) == null) ? F() : vt1VarW;
    }

    @Override // defpackage.tt1
    public final vt1 y() {
        return x();
    }
}
