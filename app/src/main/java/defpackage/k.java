package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k extends wnED {
    public static k d;
    public o55 c;

    @Override // defpackage.bm88
    public final int[] a(int i) {
        int iF;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        np3 np3Var = np3.Rtl;
        if (i < 0) {
            o55 o55Var = this.c;
            if (o55Var == null) {
                ur1.e("layoutResult");
                throw null;
            }
            iF = o55Var.f(0);
        } else {
            o55 o55Var2 = this.c;
            if (o55Var2 == null) {
                ur1.e("layoutResult");
                throw null;
            }
            int iF2 = o55Var2.f(i);
            iF = e(iF2, np3Var) == i ? iF2 : iF2 + 1;
        }
        o55 o55Var3 = this.c;
        if (o55Var3 == null) {
            ur1.e("layoutResult");
            throw null;
        }
        if (iF >= o55Var3.b.f) {
            return null;
        }
        return c(e(iF, np3Var), e(iF, np3.Ltr) + 1);
    }

    @Override // defpackage.bm88
    public final int[] b(int i) {
        int iF;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        int length = d().length();
        np3 np3Var = np3.Ltr;
        if (i > length) {
            o55 o55Var = this.c;
            if (o55Var == null) {
                ur1.e("layoutResult");
                throw null;
            }
            iF = o55Var.f(d().length());
        } else {
            o55 o55Var2 = this.c;
            if (o55Var2 == null) {
                ur1.e("layoutResult");
                throw null;
            }
            int iF2 = o55Var2.f(i);
            iF = e(iF2, np3Var) + 1 == i ? iF2 : iF2 - 1;
        }
        if (iF < 0) {
            return null;
        }
        return c(e(iF, np3.Rtl), e(iF, np3Var) + 1);
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
