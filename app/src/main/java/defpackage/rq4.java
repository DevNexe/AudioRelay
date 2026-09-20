package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class rq4 {
    public final h25 a;
    public final long b;
    public final x41 c;
    public final v41 d;
    public final w41 e;
    public final e41 f;
    public final String g;
    public final long h;
    public final x8 i;
    public final a55 j;
    public final z42 k;
    public final long l;
    public final a25 m;
    public final yi4 n;
    public final q53 o;

    public rq4(h25 h25Var, long j, x41 x41Var, v41 v41Var, w41 w41Var, e41 e41Var, String str, long j2, x8 x8Var, a55 a55Var, z42 z42Var, long j3, a25 a25Var, yi4 yi4Var, q53 q53Var) {
        this.a = h25Var;
        this.b = j;
        this.c = x41Var;
        this.d = v41Var;
        this.e = w41Var;
        this.f = e41Var;
        this.g = str;
        this.h = j2;
        this.i = x8Var;
        this.j = a55Var;
        this.k = z42Var;
        this.l = j3;
        this.m = a25Var;
        this.n = yi4Var;
        this.o = q53Var;
    }

    public final long a() {
        return this.a.a();
    }

    public final boolean b(rq4 rq4Var) {
        if (this == rq4Var) {
            return true;
        }
        return z55.a(this.b, rq4Var.b) && ur1.a(this.c, rq4Var.c) && ur1.a(this.d, rq4Var.d) && ur1.a(this.e, rq4Var.e) && ur1.a(this.f, rq4Var.f) && ur1.a(this.g, rq4Var.g) && z55.a(this.h, rq4Var.h) && ur1.a(this.i, rq4Var.i) && ur1.a(this.j, rq4Var.j) && ur1.a(this.k, rq4Var.k) && yu.c(this.l, rq4Var.l) && ur1.a(this.o, rq4Var.o);
    }

    public final rq4 c(rq4 rq4Var) {
        if (rq4Var == null) {
            return this;
        }
        h25 h25VarB = this.a.b(rq4Var.a);
        e41 e41Var = rq4Var.f;
        if (e41Var == null) {
            e41Var = this.f;
        }
        e41 e41Var2 = e41Var;
        long j = rq4Var.b;
        if (FWT.D(j)) {
            j = this.b;
        }
        long j2 = j;
        x41 x41Var = rq4Var.c;
        if (x41Var == null) {
            x41Var = this.c;
        }
        x41 x41Var2 = x41Var;
        v41 v41Var = rq4Var.d;
        if (v41Var == null) {
            v41Var = this.d;
        }
        v41 v41Var2 = v41Var;
        w41 w41Var = rq4Var.e;
        if (w41Var == null) {
            w41Var = this.e;
        }
        w41 w41Var2 = w41Var;
        String str = rq4Var.g;
        if (str == null) {
            str = this.g;
        }
        String str2 = str;
        long j3 = rq4Var.h;
        if (FWT.D(j3)) {
            j3 = this.h;
        }
        long j4 = j3;
        x8 x8Var = rq4Var.i;
        if (x8Var == null) {
            x8Var = this.i;
        }
        x8 x8Var2 = x8Var;
        a55 a55Var = rq4Var.j;
        if (a55Var == null) {
            a55Var = this.j;
        }
        a55 a55Var2 = a55Var;
        z42 z42Var = rq4Var.k;
        if (z42Var == null) {
            z42Var = this.k;
        }
        z42 z42Var2 = z42Var;
        long j5 = yu.h;
        long j6 = rq4Var.l;
        long j7 = (j6 > j5 ? 1 : (j6 == j5 ? 0 : -1)) != 0 ? j6 : this.l;
        a25 a25Var = rq4Var.m;
        if (a25Var == null) {
            a25Var = this.m;
        }
        a25 a25Var2 = a25Var;
        yi4 yi4Var = rq4Var.n;
        if (yi4Var == null) {
            yi4Var = this.n;
        }
        yi4 yi4Var2 = yi4Var;
        q53 q53Var = this.o;
        return new rq4(h25VarB, j2, x41Var2, v41Var2, w41Var2, e41Var2, str2, j4, x8Var2, a55Var2, z42Var2, j7, a25Var2, yi4Var2, q53Var == null ? rq4Var.o : q53Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq4)) {
            return false;
        }
        rq4 rq4Var = (rq4) obj;
        if (b(rq4Var)) {
            if (ur1.a(this.a, rq4Var.a) && ur1.a(this.m, rq4Var.m) && ur1.a(this.n, rq4Var.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jA = a();
        int i = yu.i;
        int iA = xc5.a(jA) * 31;
        this.a.d();
        int iD = (z55.d(this.b) + ((iA + 0) * 31)) * 31;
        x41 x41Var = this.c;
        int i2 = (iD + (x41Var != null ? x41Var.w : 0)) * 31;
        v41 v41Var = this.d;
        int i3 = (i2 + (v41Var != null ? v41Var.a : 0)) * 31;
        w41 w41Var = this.e;
        int i4 = (i3 + (w41Var != null ? w41Var.a : 0)) * 31;
        e41 e41Var = this.f;
        int iHashCode = (i4 + (e41Var != null ? e41Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iD2 = (z55.d(this.h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        x8 x8Var = this.i;
        int iFloatToIntBits = (iD2 + (x8Var != null ? Float.floatToIntBits(x8Var.a) : 0)) * 31;
        a55 a55Var = this.j;
        int iHashCode2 = (iFloatToIntBits + (a55Var != null ? a55Var.hashCode() : 0)) * 31;
        z42 z42Var = this.k;
        int iA2 = F65.a(this.l, (iHashCode2 + (z42Var != null ? z42Var.hashCode() : 0)) * 31, 31);
        a25 a25Var = this.m;
        int i5 = (iA2 + (a25Var != null ? a25Var.a : 0)) * 31;
        yi4 yi4Var = this.n;
        int iHashCode3 = (i5 + (yi4Var != null ? yi4Var.hashCode() : 0)) * 31;
        q53 q53Var = this.o;
        return iHashCode3 + (q53Var != null ? q53Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) yu.i(a()));
        sb.append(", brush=null, fontSize=");
        this.a.d();
        sb.append((Object) z55.e(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) z55.e(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append((Object) yu.i(this.l));
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(')');
        return sb.toString();
    }

    public rq4(long j, long j2, x41 x41Var, v41 v41Var, w41 w41Var, e41 e41Var, String str, long j3, x8 x8Var, a55 a55Var, z42 z42Var, long j4, a25 a25Var, yi4 yi4Var) {
        this((j > yu.h ? 1 : (j == yu.h ? 0 : -1)) != 0 ? new kv(j) : h25.QnHx.a, j2, x41Var, v41Var, w41Var, e41Var, str, j3, x8Var, a55Var, z42Var, j4, a25Var, yi4Var, (q53) null);
    }

    public rq4(long j, long j2, x41 x41Var, v41 v41Var, w41 w41Var, e41 e41Var, String str, long j3, x8 x8Var, a55 a55Var, z42 z42Var, long j4, a25 a25Var, yi4 yi4Var, int i) {
        this((i & 1) != 0 ? yu.h : j, (i & 2) != 0 ? z55.c : j2, (i & 4) != 0 ? null : x41Var, (i & 8) != 0 ? null : v41Var, (i & 16) != 0 ? null : w41Var, (i & 32) != 0 ? null : e41Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? z55.c : j3, (i & 256) != 0 ? null : x8Var, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : a55Var, (i & 1024) != 0 ? null : z42Var, (i & 2048) != 0 ? yu.h : j4, (i & 4096) != 0 ? null : a25Var, (i & 8192) != 0 ? null : yi4Var);
    }
}
