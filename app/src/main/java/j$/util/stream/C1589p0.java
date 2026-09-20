package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1589p0 extends AbstractC1600s0 implements InterfaceC1548f2 {
    final /* synthetic */ EnumC1604t0 c;
    final /* synthetic */ j$.util.function.P d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1589p0(j$.util.function.P p, EnumC1604t0 enumC1604t0) {
        super(enumC1604t0);
        this.c = enumC1604t0;
        this.d = p;
    }

    @Override // j$.util.stream.AbstractC1600s0, j$.util.stream.InterfaceC1558h2
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        boolean zE = ((j$.util.function.N) this.d).e(i);
        EnumC1604t0 enumC1604t0 = this.c;
        if (zE == enumC1604t0.a) {
            this.a = true;
            this.b = enumC1604t0.b;
        }
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        g((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC1548f2
    public final /* synthetic */ void g(Integer num) {
        AbstractC1616w0.s0(this, num);
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }
}
