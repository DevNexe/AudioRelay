package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bz2 {
    public final q15 a;
    public final d25 b;
    public final long c;
    public final b55 d;
    public final n53 e;
    public final l32 f;

    public bz2(q15 q15Var, d25 d25Var, long j, b55 b55Var, n53 n53Var, l32 l32Var) {
        this.a = q15Var;
        this.b = d25Var;
        this.c = j;
        this.d = b55Var;
        this.e = n53Var;
        this.f = l32Var;
        if (z55.a(j, z55.c)) {
            return;
        }
        if (z55.c(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + z55.c(j) + ')').toString());
    }

    public final bz2 a(bz2 bz2Var) {
        if (bz2Var == null) {
            return this;
        }
        long j = bz2Var.c;
        if (FWT.D(j)) {
            j = this.c;
        }
        long j2 = j;
        b55 b55Var = bz2Var.d;
        if (b55Var == null) {
            b55Var = this.d;
        }
        b55 b55Var2 = b55Var;
        q15 q15Var = bz2Var.a;
        if (q15Var == null) {
            q15Var = this.a;
        }
        q15 q15Var2 = q15Var;
        d25 d25Var = bz2Var.b;
        if (d25Var == null) {
            d25Var = this.b;
        }
        d25 d25Var2 = d25Var;
        n53 n53Var = bz2Var.e;
        n53 n53Var2 = this.e;
        n53 n53Var3 = (n53Var2 != null && n53Var == null) ? n53Var2 : n53Var;
        l32 l32Var = bz2Var.f;
        if (l32Var == null) {
            l32Var = this.f;
        }
        return new bz2(q15Var2, d25Var2, j2, b55Var2, n53Var3, l32Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz2)) {
            return false;
        }
        bz2 bz2Var = (bz2) obj;
        return ur1.a(this.a, bz2Var.a) && ur1.a(this.b, bz2Var.b) && z55.a(this.c, bz2Var.c) && ur1.a(this.d, bz2Var.d) && ur1.a(this.e, bz2Var.e) && ur1.a(this.f, bz2Var.f);
    }

    public final int hashCode() {
        q15 q15Var = this.a;
        int i = (q15Var != null ? q15Var.a : 0) * 31;
        d25 d25Var = this.b;
        int iD = (z55.d(this.c) + ((i + (d25Var != null ? d25Var.a : 0)) * 31)) * 31;
        b55 b55Var = this.d;
        int iHashCode = (iD + (b55Var != null ? b55Var.hashCode() : 0)) * 31;
        n53 n53Var = this.e;
        int iHashCode2 = (iHashCode + (n53Var != null ? n53Var.hashCode() : 0)) * 31;
        l32 l32Var = this.f;
        return iHashCode2 + (l32Var != null ? l32Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + this.a + ", textDirection=" + this.b + ", lineHeight=" + ((Object) z55.e(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ')';
    }
}
