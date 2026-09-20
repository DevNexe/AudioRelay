package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public mp2(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp2)) {
            return false;
        }
        mp2 mp2Var = (mp2) obj;
        return ur1.a(this.a, mp2Var.a) && ur1.a(this.b, mp2Var.b) && ur1.a(this.c, mp2Var.c) && ur1.a(this.d, mp2Var.d) && this.e == mp2Var.e;
    }

    public final int hashCode() {
        int iA = bl2.a(this.d, bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        long j = this.e;
        return iA + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notice(noticeId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", helpLink=");
        sb.append(this.d);
        sb.append(", dateInMs=");
        return hc2.a(sb, this.e, ")");
    }

    public mp2(String str, String str2, String str3, String str4, int i) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? zs.QnHx.a.c() : 0L);
    }
}
