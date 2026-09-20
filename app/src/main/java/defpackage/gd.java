package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gd {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public gd(String str, String str2, String str3, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        return ur1.a(this.a, gdVar.a) && ur1.a(this.b, gdVar.b) && ur1.a(this.c, gdVar.c) && this.d == gdVar.d && this.e == gdVar.e;
    }

    public final int hashCode() {
        int iA = bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31);
        long j = this.d;
        return ((iA + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppInfo(name=");
        sb.append(this.a);
        sb.append(", packageName=");
        sb.append(this.b);
        sb.append(", versionName=");
        sb.append(this.c);
        sb.append(", versionCode=");
        sb.append(this.d);
        sb.append(", icon=");
        return ex0.c(sb, this.e, ")");
    }
}
