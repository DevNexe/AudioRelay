package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1579m2 extends AbstractC1533c2 {
    long b;
    long c;
    final /* synthetic */ C1583n2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1579m2(C1583n2 c1583n2, InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
        this.d = c1583n2;
        this.b = c1583n2.s;
        long j = c1583n2.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC1553g2, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        this.a.f(AbstractC1616w0.L0(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.AbstractC1533c2, j$.util.stream.InterfaceC1558h2
    public final boolean h() {
        return this.c == 0 || this.a.h();
    }
}
