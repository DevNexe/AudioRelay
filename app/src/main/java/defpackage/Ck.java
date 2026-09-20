package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class Ck extends wnED {
    public static Ck e;
    public o55 c;
    public f94 d;

    public Ck() {
        new Rect();
    }

    @Override // defpackage.bm88
    public final int[] a(int i) {
        int iG;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        try {
            f94 f94Var = this.d;
            if (f94Var == null) {
                ur1.e("node");
                throw null;
            }
            dl3 dl3VarD = f94Var.d();
            int iC = sy4.c(dl3VarD.d - dl3VarD.b);
            if (i <= 0) {
                i = 0;
            }
            o55 o55Var = this.c;
            if (o55Var == null) {
                ur1.e("layoutResult");
                throw null;
            }
            int iF = o55Var.f(i);
            o55 o55Var2 = this.c;
            if (o55Var2 == null) {
                ur1.e("layoutResult");
                throw null;
            }
            float fK = o55Var2.k(iF) + iC;
            o55 o55Var3 = this.c;
            if (o55Var3 == null) {
                ur1.e("layoutResult");
                throw null;
            }
            if (fK < o55Var3.k(o55Var3.b.f - 1)) {
                o55 o55Var4 = this.c;
                if (o55Var4 == null) {
                    ur1.e("layoutResult");
                    throw null;
                }
                iG = o55Var4.g(fK);
            } else {
                o55 o55Var5 = this.c;
                if (o55Var5 == null) {
                    ur1.e("layoutResult");
                    throw null;
                }
                iG = o55Var5.b.f;
            }
            return c(i, e(iG - 1, np3.Ltr) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.bm88
    public final int[] b(int i) {
        int iG;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            f94 f94Var = this.d;
            if (f94Var == null) {
                ur1.e("node");
                throw null;
            }
            dl3 dl3VarD = f94Var.d();
            int iC = sy4.c(dl3VarD.d - dl3VarD.b);
            int length = d().length();
            if (length <= i) {
                i = length;
            }
            o55 o55Var = this.c;
            if (o55Var == null) {
                ur1.e("layoutResult");
                throw null;
            }
            int iF = o55Var.f(i);
            o55 o55Var2 = this.c;
            if (o55Var2 == null) {
                ur1.e("layoutResult");
                throw null;
            }
            float fK = o55Var2.k(iF) - iC;
            if (fK > 0.0f) {
                o55 o55Var3 = this.c;
                if (o55Var3 == null) {
                    ur1.e("layoutResult");
                    throw null;
                }
                iG = o55Var3.g(fK);
            } else {
                iG = 0;
            }
            if (i == d().length() && iG < iF) {
                iG++;
            }
            return c(e(iG, np3.Rtl), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i, np3 np3Var) {
        o55 o55Var = this.c;
        if (o55Var == null) {
            ur1.e("layoutResult");
            throw null;
        }
        int iJ = o55Var.j(i);
        o55 o55Var2 = this.c;
        if (o55Var2 == null) {
            ur1.e("layoutResult");
            throw null;
        }
        if (np3Var != o55Var2.m(iJ)) {
            o55 o55Var3 = this.c;
            if (o55Var3 != null) {
                return o55Var3.j(i);
            }
            ur1.e("layoutResult");
            throw null;
        }
        o55 o55Var4 = this.c;
        if (o55Var4 != null) {
            return o55Var4.e(i, false) - 1;
        }
        ur1.e("layoutResult");
        throw null;
    }
}
