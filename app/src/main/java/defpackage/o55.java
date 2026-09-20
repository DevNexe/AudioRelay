package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o55 {
    public final m55 a;
    public final kh2 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public o55(m55 m55Var, kh2 kh2Var, long j) {
        this.a = m55Var;
        this.b = kh2Var;
        this.c = j;
        ArrayList arrayList = kh2Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((yy2) arrayList.get(0)).a.h();
        ArrayList arrayList2 = kh2Var.h;
        if (!arrayList2.isEmpty()) {
            yy2 yy2Var = (yy2) wu.N0(arrayList2);
            fD = yy2Var.f + yy2Var.a.d();
        }
        this.e = fD;
        this.f = kh2Var.g;
    }

    public final np3 a(int i) {
        kh2 kh2Var = this.b;
        kh2Var.b(i);
        int length = kh2Var.a.a.length();
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(i == length ? ps0.J(arrayList) : Cz.n(arrayList, i));
        return yy2Var.a.i(yy2Var.a(i));
    }

    public final dl3 b(int i) {
        kh2 kh2Var = this.b;
        lh2 lh2Var = kh2Var.a;
        if (i >= 0 && i < lh2Var.a.w.length()) {
            ArrayList arrayList = kh2Var.h;
            yy2 yy2Var = (yy2) arrayList.get(Cz.n(arrayList, i));
            return yy2Var.a.a(yy2Var.a(i)).e(X.a(0.0f, yy2Var.f));
        }
        StringBuilder sbC = iZUl.c("offset(", i, ") is out of bounds [0, ");
        sbC.append(lh2Var.a.length());
        sbC.append(')');
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    public final dl3 c(int i) {
        kh2 kh2Var = this.b;
        kh2Var.b(i);
        int length = kh2Var.a.a.length();
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(i == length ? ps0.J(arrayList) : Cz.n(arrayList, i));
        return yy2Var.a.e(yy2Var.a(i)).e(X.a(0.0f, yy2Var.f));
    }

    public final float d(int i) {
        kh2 kh2Var = this.b;
        kh2Var.c(i);
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(Cz.o(arrayList, i));
        return yy2Var.a.j(i - yy2Var.d) + yy2Var.f;
    }

    public final int e(int i, boolean z) {
        kh2 kh2Var = this.b;
        kh2Var.c(i);
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(Cz.o(arrayList, i));
        return yy2Var.a.o(i - yy2Var.d, z) + yy2Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o55)) {
            return false;
        }
        o55 o55Var = (o55) obj;
        if (!ur1.a(this.a, o55Var.a) || !ur1.a(this.b, o55Var.b) || !sp1.a(this.c, o55Var.c)) {
            return false;
        }
        if (this.d == o55Var.d) {
            return ((this.e > o55Var.e ? 1 : (this.e == o55Var.e ? 0 : -1)) == 0) && ur1.a(this.f, o55Var.f);
        }
        return false;
    }

    public final int f(int i) {
        kh2 kh2Var = this.b;
        kh2Var.b(i);
        int length = kh2Var.a.a.length();
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(i == length ? ps0.J(arrayList) : Cz.n(arrayList, i));
        return yy2Var.a.g(yy2Var.a(i)) + yy2Var.d;
    }

    public final int g(float f) {
        int iJ;
        kh2 kh2Var = this.b;
        ArrayList arrayList = kh2Var.h;
        if (f <= 0.0f) {
            iJ = 0;
        } else {
            iJ = f >= kh2Var.e ? ps0.J(arrayList) : Cz.p(arrayList, f);
        }
        yy2 yy2Var = (yy2) arrayList.get(iJ);
        int i = yy2Var.c;
        int i2 = yy2Var.b;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        return yy2Var.a.q(f - yy2Var.f) + yy2Var.d;
    }

    public final float h(int i) {
        kh2 kh2Var = this.b;
        kh2Var.c(i);
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(Cz.o(arrayList, i));
        return yy2Var.a.t(i - yy2Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long j = this.c;
        return this.f.hashCode() + ry0.b(this.e, ry0.b(this.d, (((int) (j ^ (j >>> 32))) + iHashCode) * 31, 31), 31);
    }

    public final float i(int i) {
        kh2 kh2Var = this.b;
        kh2Var.c(i);
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(Cz.o(arrayList, i));
        return yy2Var.a.p(i - yy2Var.d);
    }

    public final int j(int i) {
        kh2 kh2Var = this.b;
        kh2Var.c(i);
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(Cz.o(arrayList, i));
        return yy2Var.a.n(i - yy2Var.d) + yy2Var.b;
    }

    public final float k(int i) {
        kh2 kh2Var = this.b;
        kh2Var.c(i);
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(Cz.o(arrayList, i));
        return yy2Var.a.c(i - yy2Var.d) + yy2Var.f;
    }

    public final int l(long j) {
        int iJ;
        kh2 kh2Var = this.b;
        kh2Var.getClass();
        float fD = kt2.d(j);
        ArrayList arrayList = kh2Var.h;
        if (fD <= 0.0f) {
            iJ = 0;
        } else {
            iJ = kt2.d(j) >= kh2Var.e ? ps0.J(arrayList) : Cz.p(arrayList, kt2.d(j));
        }
        yy2 yy2Var = (yy2) arrayList.get(iJ);
        int i = yy2Var.c;
        int i2 = yy2Var.b;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        return yy2Var.a.k(X.a(kt2.c(j), kt2.d(j) - yy2Var.f)) + i2;
    }

    public final np3 m(int i) {
        kh2 kh2Var = this.b;
        kh2Var.b(i);
        int length = kh2Var.a.a.length();
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(i == length ? ps0.J(arrayList) : Cz.n(arrayList, i));
        return yy2Var.a.b(yy2Var.a(i));
    }

    public final long n(int i) {
        kh2 kh2Var = this.b;
        kh2Var.b(i);
        int length = kh2Var.a.a.length();
        ArrayList arrayList = kh2Var.h;
        yy2 yy2Var = (yy2) arrayList.get(i == length ? ps0.J(arrayList) : Cz.n(arrayList, i));
        long jF = yy2Var.a.f(yy2Var.a(i));
        int i2 = s55.c;
        int i3 = yy2Var.b;
        return Cz.a(((int) (jF >> 32)) + i3, s55.c(jF) + i3);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) sp1.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
