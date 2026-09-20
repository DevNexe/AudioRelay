package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u3 extends k52 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final gn2 g;

    public static final class QnHx extends k52.QnHx {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public gn2 g;
    }

    public u3(long j, Integer num, long j2, byte[] bArr, String str, long j3, gn2 gn2Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = gn2Var;
    }

    @Override // defpackage.k52
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.k52
    public final long b() {
        return this.a;
    }

    @Override // defpackage.k52
    public final long c() {
        return this.c;
    }

    @Override // defpackage.k52
    public final gn2 d() {
        return this.g;
    }

    @Override // defpackage.k52
    public final byte[] e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k52)) {
            return false;
        }
        k52 k52Var = (k52) obj;
        if (this.a == k52Var.b() && ((num = this.b) != null ? num.equals(k52Var.a()) : k52Var.a() == null) && this.c == k52Var.c()) {
            if (Arrays.equals(this.d, k52Var instanceof u3 ? ((u3) k52Var).d : k52Var.e()) && ((str = this.e) != null ? str.equals(k52Var.f()) : k52Var.f() == null) && this.f == k52Var.g()) {
                gn2 gn2Var = this.g;
                if (gn2Var == null) {
                    if (k52Var.d() == null) {
                        return true;
                    }
                } else if (gn2Var.equals(k52Var.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k52
    public final String f() {
        return this.e;
    }

    @Override // defpackage.k52
    public final long g() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        gn2 gn2Var = this.g;
        return i2 ^ (gn2Var != null ? gn2Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
