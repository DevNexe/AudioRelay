package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rv {
    public final kz2 a;
    public final kz2 b;
    public final kz2 c;
    public final kz2 d;
    public final kz2 e;
    public final kz2 f;
    public final kz2 g;
    public final kz2 h;
    public final kz2 i;
    public final kz2 j;
    public final kz2 k;
    public final kz2 l;
    public final kz2 m;

    public rv(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        yu yuVar = new yu(j);
        tv4 tv4Var = tv4.a;
        this.a = ps0.Q(yuVar, tv4Var);
        this.b = ps0.Q(new yu(j2), tv4Var);
        this.c = ps0.Q(new yu(j3), tv4Var);
        this.d = ps0.Q(new yu(j4), tv4Var);
        this.e = ps0.Q(new yu(j5), tv4Var);
        this.f = ps0.Q(new yu(j6), tv4Var);
        this.g = ps0.Q(new yu(j7), tv4Var);
        this.h = ps0.Q(new yu(j8), tv4Var);
        this.i = ps0.Q(new yu(j9), tv4Var);
        this.j = ps0.Q(new yu(j10), tv4Var);
        this.k = ps0.Q(new yu(j11), tv4Var);
        this.l = ps0.Q(new yu(j12), tv4Var);
        this.m = ps0.Q(Boolean.valueOf(z), tv4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((yu) this.e.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((yu) this.g.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((yu) this.j.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((yu) this.h.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((yu) this.i.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long f() {
        return ((yu) this.k.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long g() {
        return ((yu) this.a.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long h() {
        return ((yu) this.b.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i() {
        return ((yu) this.c.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long j() {
        return ((yu) this.d.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long k() {
        return ((yu) this.f.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        return "Colors(primary=" + ((Object) yu.i(g())) + ", primaryVariant=" + ((Object) yu.i(h())) + ", secondary=" + ((Object) yu.i(i())) + ", secondaryVariant=" + ((Object) yu.i(j())) + ", background=" + ((Object) yu.i(a())) + ", surface=" + ((Object) yu.i(k())) + ", error=" + ((Object) yu.i(b())) + ", onPrimary=" + ((Object) yu.i(d())) + ", onSecondary=" + ((Object) yu.i(e())) + ", onBackground=" + ((Object) yu.i(c())) + ", onSurface=" + ((Object) yu.i(f())) + ", onError=" + ((Object) yu.i(((yu) this.l.getValue()).a)) + ", isLight=" + l() + ')';
    }
}
