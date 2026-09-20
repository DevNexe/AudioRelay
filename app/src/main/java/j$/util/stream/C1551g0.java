package j$.util.stream;

import j$.util.function.C1489k0;
import j$.util.function.C1495n0;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1487j0;
import j$.util.function.InterfaceC1493m0;

/* JADX INFO: renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1551g0 extends AbstractC1533c2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC1530c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1551g0(AbstractC1530c abstractC1530c, InterfaceC1558h2 interfaceC1558h2, int i) {
        super(interfaceC1558h2);
        this.b = i;
        this.c = abstractC1530c;
    }

    @Override // j$.util.stream.InterfaceC1553g2, j$.util.stream.InterfaceC1558h2
    public final void accept(long j) {
        int i = this.b;
        AbstractC1530c abstractC1530c = this.c;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        switch (i) {
            case 0:
                interfaceC1558h2.accept(j);
                return;
            case 1:
                interfaceC1558h2.accept(((j$.util.function.w0) ((C1623y) abstractC1530c).t).applyAsLong(j));
                return;
            case 2:
                interfaceC1558h2.p(((InterfaceC1487j0) ((C1615w) abstractC1530c).t).apply(j));
                return;
            case 3:
                interfaceC1558h2.accept(((j$.util.function.q0) ((j$.util.function.s0) ((C1619x) abstractC1530c).t)).a(j));
                return;
            case 4:
                interfaceC1558h2.accept(((C1495n0) ((j$.util.function.p0) ((C1611v) abstractC1530c).t)).a(j));
                return;
            case 5:
                InterfaceC1581n0 interfaceC1581n0 = (InterfaceC1581n0) ((InterfaceC1487j0) ((C1623y) abstractC1530c).t).apply(j);
                if (interfaceC1581n0 != null) {
                    try {
                        interfaceC1581n0.sequential().G(new C1541e0(1, this));
                    } catch (Throwable th) {
                        try {
                            interfaceC1581n0.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC1581n0 != null) {
                    interfaceC1581n0.close();
                    return;
                }
                return;
            case 6:
                if (((C1489k0) ((InterfaceC1493m0) ((C1623y) abstractC1530c).t)).e(j)) {
                    interfaceC1558h2.accept(j);
                    return;
                }
                return;
            default:
                ((InterfaceC1481g0) ((C1623y) abstractC1530c).t).accept(j);
                interfaceC1558h2.accept(j);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        int i = this.b;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        switch (i) {
            case 5:
                interfaceC1558h2.f(-1L);
                break;
            case 6:
                interfaceC1558h2.f(-1L);
                break;
            default:
                interfaceC1558h2.f(j);
                break;
        }
    }
}
