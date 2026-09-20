package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lt2<N> implements jE<N> {
    public final jE<N> a;
    public final int b;
    public int c;

    public lt2(jE<N> jEVar, int i) {
        this.a = jEVar;
        this.b = i;
    }

    @Override // defpackage.jE
    public final N a() {
        return this.a.a();
    }

    @Override // defpackage.jE
    public final void b(int i, N n) {
        this.a.b(i + (this.c == 0 ? this.b : 0), n);
    }

    @Override // defpackage.jE
    public final void c(N n) {
        this.c++;
        this.a.c(n);
    }

    @Override // defpackage.jE
    public final void clear() {
        e40.c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // defpackage.jE
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.jE
    public final void e(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.e(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.jE
    public final void f(int i, int i2) {
        this.a.f(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.jE
    public final void g() {
        int i = this.c;
        if (!(i > 0)) {
            e40.c("OffsetApplier up called with no corresponding down".toString());
            throw null;
        }
        this.c = i - 1;
        this.a.g();
    }

    @Override // defpackage.jE
    public final void h(int i, N n) {
        this.a.h(i + (this.c == 0 ? this.b : 0), n);
    }

    @Override // defpackage.jE
    public final /* synthetic */ void i() {
    }
}
