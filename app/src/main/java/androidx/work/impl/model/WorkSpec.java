package androidx.work.impl.model;

import defpackage.O;
import defpackage.bl2;
import defpackage.h70;
import defpackage.i5;
import defpackage.kn5;
import defpackage.s52;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpec {
    public String a;
    public kn5 b;
    public String c;
    public String d;
    public androidx.work.CQf e;
    public androidx.work.CQf f;
    public long g;
    public long h;
    public long i;
    public h70 j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    public static class QnHx {
        public String a;
        public kn5 b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            if (this.b != qnHx.b) {
                return false;
            }
            return this.a.equals(qnHx.a);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    static {
        s52.e("WorkSpec");
    }

    public WorkSpec(String str, String str2) {
        this.b = kn5.ENQUEUED;
        androidx.work.CQf cQf = androidx.work.CQf.c;
        this.e = cQf;
        this.f = cQf;
        this.j = h70.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = str;
        this.c = str2;
    }

    public final long a() {
        long jCurrentTimeMillis;
        long j;
        if (this.b == kn5.ENQUEUED && this.k > 0) {
            long jScalb = this.l == 2 ? this.m * ((long) this.k) : (long) Math.scalb(this.m, this.k - 1);
            j = this.n;
            jCurrentTimeMillis = Math.min(18000000L, jScalb);
        } else {
            if (c()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j2 = this.n;
                if (j2 == 0) {
                    j2 = this.g + jCurrentTimeMillis2;
                }
                long j3 = this.i;
                long j4 = this.h;
                if (j3 != j4) {
                    return j2 + j4 + (j2 == 0 ? j3 * (-1) : 0L);
                }
                return j2 + (j2 != 0 ? j4 : 0L);
            }
            jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            j = this.g;
        }
        return jCurrentTimeMillis + j;
    }

    public final boolean b() {
        return !h70.i.equals(this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkSpec.class != obj.getClass()) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        if (this.g != workSpec.g || this.h != workSpec.h || this.i != workSpec.i || this.k != workSpec.k || this.m != workSpec.m || this.n != workSpec.n || this.o != workSpec.o || this.p != workSpec.p || this.q != workSpec.q || !this.a.equals(workSpec.a) || this.b != workSpec.b || !this.c.equals(workSpec.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? workSpec.d == null : str.equals(workSpec.d)) {
            return this.e.equals(workSpec.e) && this.f.equals(workSpec.f) && this.j.equals(workSpec.j) && this.l == workSpec.l && this.r == workSpec.r;
        }
        return false;
    }

    public final int hashCode() {
        int iA = bl2.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.g;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int iH = (O.h(this.l) + ((((this.j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i3 = (iH + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        return O.h(this.r) + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return i5.b(new StringBuilder("{WorkSpec: "), this.a, "}");
    }

    public WorkSpec(WorkSpec workSpec) {
        this.b = kn5.ENQUEUED;
        androidx.work.CQf cQf = androidx.work.CQf.c;
        this.e = cQf;
        this.f = cQf;
        this.j = h70.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = workSpec.a;
        this.c = workSpec.c;
        this.b = workSpec.b;
        this.d = workSpec.d;
        this.e = new androidx.work.CQf(workSpec.e);
        this.f = new androidx.work.CQf(workSpec.f);
        this.g = workSpec.g;
        this.h = workSpec.h;
        this.i = workSpec.i;
        this.j = new h70(workSpec.j);
        this.k = workSpec.k;
        this.l = workSpec.l;
        this.m = workSpec.m;
        this.n = workSpec.n;
        this.o = workSpec.o;
        this.p = workSpec.p;
        this.q = workSpec.q;
        this.r = workSpec.r;
    }
}
