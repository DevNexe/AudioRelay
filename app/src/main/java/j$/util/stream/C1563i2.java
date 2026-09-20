package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1563i2 extends AbstractC1538d2 {
    long b;
    long c;
    final /* synthetic */ C1567j2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1563i2(C1567j2 c1567j2, InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
        this.d = c1567j2;
        this.b = c1567j2.s;
        long j = c1567j2.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.p(obj);
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        this.a.f(AbstractC1616w0.L0(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.AbstractC1538d2, j$.util.stream.InterfaceC1558h2
    public final boolean h() {
        return this.c == 0 || this.a.h();
    }
}
