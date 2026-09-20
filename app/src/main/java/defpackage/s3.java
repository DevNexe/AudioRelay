package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 extends cp1 {
    public final String a;
    public final long b;
    public final long c;

    public s3(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.cp1
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cp1
    public final long b() {
        return this.c;
    }

    @Override // defpackage.cp1
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cp1)) {
            return false;
        }
        cp1 cp1Var = (cp1) obj;
        return this.a.equals(cp1Var.a()) && this.b == cp1Var.c() && this.c == cp1Var.b();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return hc2.a(sb, this.c, "}");
    }
}
