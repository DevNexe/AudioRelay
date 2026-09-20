package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1587o2 extends AbstractC1523a2 {
    long b;
    long c;
    final /* synthetic */ C1591p2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1587o2(C1591p2 c1591p2, InterfaceC1558h2 interfaceC1558h2) {
        super(interfaceC1558h2);
        this.d = c1591p2;
        this.b = c1591p2.s;
        long j = c1591p2.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(d);
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        this.a.f(AbstractC1616w0.L0(j, this.d.s, this.c));
    }

    @Override // j$.util.stream.AbstractC1523a2, j$.util.stream.InterfaceC1558h2
    public final boolean h() {
        return this.c == 0 || this.a.h();
    }
}
