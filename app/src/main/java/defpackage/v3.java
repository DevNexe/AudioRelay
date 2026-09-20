package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v3 extends o52 {
    public final long a;
    public final long b;
    public final gs c;
    public final Integer d;
    public final String e;
    public final List<k52> f;
    public final dh3 g;

    public v3() {
        throw null;
    }

    public v3(long j, long j2, gs gsVar, Integer num, String str, List list, dh3 dh3Var) {
        this.a = j;
        this.b = j2;
        this.c = gsVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = dh3Var;
    }

    @Override // defpackage.o52
    public final gs a() {
        return this.c;
    }

    @Override // defpackage.o52
    public final List<k52> b() {
        return this.f;
    }

    @Override // defpackage.o52
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.o52
    public final String d() {
        return this.e;
    }

    @Override // defpackage.o52
    public final dh3 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        gs gsVar;
        Integer num;
        String str;
        List<k52> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o52)) {
            return false;
        }
        o52 o52Var = (o52) obj;
        if (this.a == o52Var.f() && this.b == o52Var.g() && ((gsVar = this.c) != null ? gsVar.equals(o52Var.a()) : o52Var.a() == null) && ((num = this.d) != null ? num.equals(o52Var.c()) : o52Var.c() == null) && ((str = this.e) != null ? str.equals(o52Var.d()) : o52Var.d() == null) && ((list = this.f) != null ? list.equals(o52Var.b()) : o52Var.b() == null)) {
            dh3 dh3Var = this.g;
            if (dh3Var == null) {
                if (o52Var.e() == null) {
                    return true;
                }
            } else if (dh3Var.equals(o52Var.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.o52
    public final long f() {
        return this.a;
    }

    @Override // defpackage.o52
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        gs gsVar = this.c;
        int iHashCode = (i ^ (gsVar == null ? 0 : gsVar.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<k52> list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        dh3 dh3Var = this.g;
        return iHashCode4 ^ (dh3Var != null ? dh3Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
