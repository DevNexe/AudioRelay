package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 extends r85 {
    public final String a;
    public final long b;
    public final int c;

    public i4(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.r85
    public final int a() {
        return this.c;
    }

    @Override // defpackage.r85
    public final String b() {
        return this.a;
    }

    @Override // defpackage.r85
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r85)) {
            return false;
        }
        r85 r85Var = (r85) obj;
        String str = this.a;
        if (str != null ? str.equals(r85Var.b()) : r85Var.b() == null) {
            if (this.b == r85Var.c()) {
                int i = this.c;
                if (i == 0) {
                    if (r85Var.a() == 0) {
                        return true;
                    }
                } else if (O.c(i, r85Var.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.c;
        return (i2 != 0 ? O.h(i2) : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + yq4.b(this.c) + "}";
    }
}
