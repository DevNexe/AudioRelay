package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vy3 {
    public static final vy3 g = new vy3("00:00", "00", "000 ms", "00 ms", "00 ms", new kj1(cs0.w));
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final kj1<gs4> f;

    public vy3(String str, String str2, String str3, String str4, String str5, kj1<gs4> kj1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = kj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy3)) {
            return false;
        }
        vy3 vy3Var = (vy3) obj;
        return ur1.a(this.a, vy3Var.a) && ur1.a(this.b, vy3Var.b) && ur1.a(this.c, vy3Var.c) && ur1.a(this.d, vy3Var.d) && ur1.a(this.e, vy3Var.e) && ur1.a(this.f, vy3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + bl2.a(this.e, bl2.a(this.d, bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "StatsUi(sessionLength=" + this.a + ", bufferedAmount=" + this.b + ", maxBufferedAmount=" + this.c + ", averageLatency=" + this.d + ", maxLatency=" + this.e + ", connectionOrAudioIssues=" + this.f + ")";
    }
}
