package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class w55 {
    public static final w55 d = new w55(0, 0, null, null, null, 0, null, null, 0, 262143);
    public final rq4 a;
    public final bz2 b;
    public final s53 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public w55(rq4 rq4Var, bz2 bz2Var) {
        q53 q53Var = rq4Var.o;
        n53 n53Var = bz2Var.e;
        this(rq4Var, bz2Var, (q53Var == null && n53Var == null) ? null : new s53(q53Var, n53Var));
    }

    public static w55 a(w55 w55Var, long j, x41 x41Var, e41 e41Var, int i) {
        h25 h25Var;
        h25 kvVar;
        long jA = (i & 1) != 0 ? w55Var.a.a() : j;
        long j2 = (i & 2) != 0 ? w55Var.a.b : 0L;
        x41 x41Var2 = (i & 4) != 0 ? w55Var.a.c : x41Var;
        v41 v41Var = (i & 8) != 0 ? w55Var.a.d : null;
        w41 w41Var = (i & 16) != 0 ? w55Var.a.e : null;
        e41 e41Var2 = (i & 32) != 0 ? w55Var.a.f : e41Var;
        String str = (i & 64) != 0 ? w55Var.a.g : null;
        long j3 = (i & 128) != 0 ? w55Var.a.h : 0L;
        x8 x8Var = (i & 256) != 0 ? w55Var.a.i : null;
        a55 a55Var = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? w55Var.a.j : null;
        z42 z42Var = (i & 1024) != 0 ? w55Var.a.k : null;
        long j4 = (i & 2048) != 0 ? w55Var.a.l : 0L;
        a25 a25Var = (i & 4096) != 0 ? w55Var.a.m : null;
        yi4 yi4Var = (i & 8192) != 0 ? w55Var.a.n : null;
        q15 q15Var = (i & 16384) != 0 ? w55Var.b.a : null;
        d25 d25Var = (32768 & i) != 0 ? w55Var.b.b : null;
        long j5 = (65536 & i) != 0 ? w55Var.b.c : 0L;
        b55 b55Var = (i & 131072) != 0 ? w55Var.b.d : null;
        rq4 rq4Var = w55Var.a;
        if (!yu.c(jA, rq4Var.a())) {
            if (jA != yu.h) {
                kvVar = new kv(jA);
            } else {
                h25Var = h25.QnHx.a;
            }
            rq4 rq4Var2 = new rq4(kvVar, j2, x41Var2, v41Var, w41Var, e41Var2, str, j3, x8Var, a55Var, z42Var, j4, a25Var, yi4Var, rq4Var.o);
            bz2 bz2Var = w55Var.b;
            return new w55(rq4Var2, new bz2(q15Var, d25Var, j5, b55Var, bz2Var.e, bz2Var.f), w55Var.c);
        }
        h25Var = rq4Var.a;
        kvVar = h25Var;
        rq4 rq4Var3 = new rq4(kvVar, j2, x41Var2, v41Var, w41Var, e41Var2, str, j3, x8Var, a55Var, z42Var, j4, a25Var, yi4Var, rq4Var.o);
        bz2 bz2Var2 = w55Var.b;
        return new w55(rq4Var3, new bz2(q15Var, d25Var, j5, b55Var, bz2Var2.e, bz2Var2.f), w55Var.c);
    }

    public final long b() {
        return this.a.a();
    }

    public final w55 c(w55 w55Var) {
        return (w55Var == null || ur1.a(w55Var, d)) ? this : new w55(this.a.c(w55Var.a), this.b.a(w55Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w55)) {
            return false;
        }
        w55 w55Var = (w55) obj;
        return ur1.a(this.a, w55Var.a) && ur1.a(this.b, w55Var.b) && ur1.a(this.c, w55Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        s53 s53Var = this.c;
        return iHashCode + (s53Var != null ? s53Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) yu.i(b()));
        sb.append(", brush=null, fontSize=");
        rq4 rq4Var = this.a;
        rq4Var.a.d();
        sb.append((Object) z55.e(rq4Var.b));
        sb.append(", fontWeight=");
        sb.append(rq4Var.c);
        sb.append(", fontStyle=");
        sb.append(rq4Var.d);
        sb.append(", fontSynthesis=");
        sb.append(rq4Var.e);
        sb.append(", fontFamily=");
        sb.append(rq4Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(rq4Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) z55.e(rq4Var.h));
        sb.append(", baselineShift=");
        sb.append(rq4Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(rq4Var.j);
        sb.append(", localeList=");
        sb.append(rq4Var.k);
        sb.append(", background=");
        sb.append((Object) yu.i(rq4Var.l));
        sb.append(", textDecoration=");
        sb.append(rq4Var.m);
        sb.append(", shadow=");
        sb.append(rq4Var.n);
        sb.append(", textAlign=");
        bz2 bz2Var = this.b;
        sb.append(bz2Var.a);
        sb.append(", textDirection=");
        sb.append(bz2Var.b);
        sb.append(", lineHeight=");
        sb.append((Object) z55.e(bz2Var.c));
        sb.append(", textIndent=");
        sb.append(bz2Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append("lineHeightStyle=");
        sb.append(bz2Var.f);
        sb.append(')');
        return sb.toString();
    }

    public w55(rq4 rq4Var, bz2 bz2Var, s53 s53Var) {
        this.a = rq4Var;
        this.b = bz2Var;
        this.c = s53Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w55(long j, long j2, x41 x41Var, v41 v41Var, e41 e41Var, long j3, a25 a25Var, q15 q15Var, long j4, int i) {
        long j5 = (i & 1) != 0 ? yu.h : j;
        this(new rq4((j5 > yu.h ? 1 : (j5 == yu.h ? 0 : -1)) != 0 ? new kv(j5) : h25.QnHx.a, (i & 2) != 0 ? z55.c : j2, (i & 4) != 0 ? null : x41Var, (i & 8) != 0 ? null : v41Var, (w41) null, (i & 32) != 0 ? null : e41Var, (String) null, (i & 128) != 0 ? z55.c : j3, (x8) null, (a55) null, (z42) null, (i & 2048) != 0 ? yu.h : 0L, (i & 4096) != 0 ? null : a25Var, (yi4) null, (q53) null), new bz2((i & 16384) != 0 ? null : q15Var, null, (i & 65536) != 0 ? z55.c : j4, null, null, null), null);
    }
}
