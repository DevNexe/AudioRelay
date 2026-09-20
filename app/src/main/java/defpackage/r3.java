package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 extends bp1 {
    public final String a;
    public final String b;
    public final String c;
    public final r85 d;
    public final int e;

    public r3(String str, String str2, String str3, r85 r85Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r85Var;
        this.e = i;
    }

    @Override // defpackage.bp1
    public final r85 a() {
        return this.d;
    }

    @Override // defpackage.bp1
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bp1
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bp1
    public final int d() {
        return this.e;
    }

    @Override // defpackage.bp1
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bp1)) {
            return false;
        }
        bp1 bp1Var = (bp1) obj;
        String str = this.a;
        if (str != null ? str.equals(bp1Var.e()) : bp1Var.e() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(bp1Var.b()) : bp1Var.b() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(bp1Var.c()) : bp1Var.c() == null) {
                    r85 r85Var = this.d;
                    if (r85Var != null ? r85Var.equals(bp1Var.a()) : bp1Var.a() == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (bp1Var.d() == 0) {
                                return true;
                            }
                        } else if (O.c(i, bp1Var.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        r85 r85Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (r85Var == null ? 0 : r85Var.hashCode())) * 1000003;
        int i = this.e;
        return (i != 0 ? O.h(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + fj0.c(this.e) + "}";
    }
}
