package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 extends kt4.F1 {
    public final String a;
    public final String b;
    public final boolean c;

    public h4(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // kt4.F1
    public final boolean a() {
        return this.c;
    }

    @Override // kt4.F1
    public final String b() {
        return this.b;
    }

    @Override // kt4.F1
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kt4.F1)) {
            return false;
        }
        kt4.F1 f1 = (kt4.F1) obj;
        return this.a.equals(f1.c()) && this.b.equals(f1.b()) && this.c == f1.a();
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return Md5A.f(sb, this.c, "}");
    }
}
