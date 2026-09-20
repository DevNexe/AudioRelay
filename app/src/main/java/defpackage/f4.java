package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f4 extends kt4.CQf {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public f4(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.i = str3;
    }

    @Override // kt4.CQf
    public final int a() {
        return this.a;
    }

    @Override // kt4.CQf
    public final int b() {
        return this.c;
    }

    @Override // kt4.CQf
    public final long c() {
        return this.e;
    }

    @Override // kt4.CQf
    public final boolean d() {
        return this.f;
    }

    @Override // kt4.CQf
    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kt4.CQf)) {
            return false;
        }
        kt4.CQf cQf = (kt4.CQf) obj;
        return this.a == cQf.a() && this.b.equals(cQf.f()) && this.c == cQf.b() && this.d == cQf.i() && this.e == cQf.c() && this.f == cQf.d() && this.g == cQf.h() && this.h.equals(cQf.e()) && this.i.equals(cQf.g());
    }

    @Override // kt4.CQf
    public final String f() {
        return this.b;
    }

    @Override // kt4.CQf
    public final String g() {
        return this.i;
    }

    @Override // kt4.CQf
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // kt4.CQf
    public final long i() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", availableProcessors=");
        sb.append(this.c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return i5.b(sb, this.i, "}");
    }
}
