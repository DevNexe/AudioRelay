package j$.util.stream;

import j$.util.function.C1475d0;
import j$.util.function.C1489k0;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1493m0;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1593q0 extends AbstractC1600s0 implements InterfaceC1553g2 {
    final /* synthetic */ EnumC1604t0 c;
    final /* synthetic */ InterfaceC1493m0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1593q0(InterfaceC1493m0 interfaceC1493m0, EnumC1604t0 enumC1604t0) {
        super(enumC1604t0);
        this.c = enumC1604t0;
        this.d = interfaceC1493m0;
    }

    @Override // j$.util.stream.AbstractC1600s0, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        boolean zE = ((C1489k0) this.d).e(j);
        EnumC1604t0 enumC1604t0 = this.c;
        if (zE == enumC1604t0.a) {
            this.a = true;
            this.b = enumC1604t0.b;
        }
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        l((Long) obj);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.stream.InterfaceC1553g2
    public final /* synthetic */ void l(Long l) {
        AbstractC1616w0.u0(this, l);
    }
}
