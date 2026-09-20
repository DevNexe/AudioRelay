package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq0 {
    public final pz2 a;
    public int b;
    public int c;
    public int d = -1;
    public int e = -1;

    public rq0(Z7jl z7jl, long j) {
        this.a = new pz2(z7jl.w);
        this.b = s55.e(j);
        this.c = s55.d(j);
        int iE = s55.e(j);
        int iD = s55.d(j);
        if (iE < 0 || iE > z7jl.length()) {
            StringBuilder sbC = iZUl.c("start (", iE, ") offset is outside of text region ");
            sbC.append(z7jl.length());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (iD < 0 || iD > z7jl.length()) {
            StringBuilder sbC2 = iZUl.c("end (", iD, ") offset is outside of text region ");
            sbC2.append(z7jl.length());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(Md5A.e("Do not set reversed range: ", iE, " > ", iD));
        }
    }

    public final void a(int i, int i2) {
        long jA = Cz.a(i, i2);
        this.a.b(i, i2, "");
        long jC0 = fp1.C0(Cz.a(this.b, this.c), jA);
        this.b = s55.e(jC0);
        this.c = s55.d(jC0);
        int i3 = this.d;
        if (i3 != -1) {
            long jC1 = fp1.C0(Cz.a(i3, this.e), jA);
            if (s55.b(jC1)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = s55.e(jC1);
                this.e = s55.d(jC1);
            }
        }
    }

    public final char b(int i) {
        pz2 pz2Var = this.a;
        w91 w91Var = pz2Var.b;
        if (w91Var == null) {
            return pz2Var.a.charAt(i);
        }
        int i2 = pz2Var.c;
        if (i < i2) {
            return pz2Var.a.charAt(i);
        }
        int i3 = w91Var.a;
        int i4 = w91Var.d;
        int i5 = w91Var.c;
        int i6 = i3 - (i4 - i5);
        if (i >= i6 + i2) {
            return pz2Var.a.charAt(i - ((i6 - pz2Var.d) + i2));
        }
        int i7 = i - i2;
        return i7 < i5 ? w91Var.b[i7] : w91Var.b[(i7 - i5) + i4];
    }

    public final int c() {
        return this.a.a();
    }

    public final void d(int i, int i2, String str) {
        pz2 pz2Var = this.a;
        if (i < 0 || i > pz2Var.a()) {
            StringBuilder sbC = iZUl.c("start (", i, ") offset is outside of text region ");
            sbC.append(pz2Var.a());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i2 < 0 || i2 > pz2Var.a()) {
            StringBuilder sbC2 = iZUl.c("end (", i2, ") offset is outside of text region ");
            sbC2.append(pz2Var.a());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(Md5A.e("Do not set reversed range: ", i, " > ", i2));
        }
        pz2Var.b(i, i2, str);
        this.b = str.length() + i;
        this.c = str.length() + i;
        this.d = -1;
        this.e = -1;
    }

    public final void e(int i, int i2) {
        pz2 pz2Var = this.a;
        if (i < 0 || i > pz2Var.a()) {
            StringBuilder sbC = iZUl.c("start (", i, ") offset is outside of text region ");
            sbC.append(pz2Var.a());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i2 < 0 || i2 > pz2Var.a()) {
            StringBuilder sbC2 = iZUl.c("end (", i2, ") offset is outside of text region ");
            sbC2.append(pz2Var.a());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(Md5A.e("Do not set reversed or empty range: ", i, " > ", i2));
        }
        this.d = i;
        this.e = i2;
    }

    public final void f(int i, int i2) {
        pz2 pz2Var = this.a;
        if (i < 0 || i > pz2Var.a()) {
            StringBuilder sbC = iZUl.c("start (", i, ") offset is outside of text region ");
            sbC.append(pz2Var.a());
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i2 < 0 || i2 > pz2Var.a()) {
            StringBuilder sbC2 = iZUl.c("end (", i2, ") offset is outside of text region ");
            sbC2.append(pz2Var.a());
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(Md5A.e("Do not set reversed range: ", i, " > ", i2));
        }
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        return this.a.toString();
    }
}
