package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xz5 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public xz5(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        oa3.e(str);
        oa3.e(str2);
        oa3.b(j >= 0);
        oa3.b(j2 >= 0);
        oa3.b(j3 >= 0);
        oa3.b(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final xz5 a(Long l, Long l2, Boolean bool) {
        return new xz5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final xz5 b(long j, long j2) {
        return new xz5(this.a, this.b, this.c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }
}
