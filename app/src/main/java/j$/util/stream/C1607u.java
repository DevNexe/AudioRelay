package j$.util.stream;

import j$.util.function.C1502u;
import j$.util.function.InterfaceC1494n;
import j$.util.function.InterfaceC1499q;
import j$.util.function.InterfaceC1501t;
import j$.util.function.InterfaceC1504w;
import j$.util.function.InterfaceC1507z;

/* JADX INFO: renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1607u extends AbstractC1523a2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC1530c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1607u(AbstractC1530c abstractC1530c, InterfaceC1558h2 interfaceC1558h2, int i) {
        super(interfaceC1558h2);
        this.b = i;
        this.c = abstractC1530c;
    }

    @Override // j$.util.stream.InterfaceC1543e2, j$.util.function.InterfaceC1494n
    public final void accept(double d) {
        int i = this.b;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        AbstractC1530c abstractC1530c = this.c;
        switch (i) {
            case 0:
                interfaceC1558h2.accept(((j$.util.function.A) ((j$.util.function.C) ((C1611v) abstractC1530c).t)).b(d));
                return;
            case 1:
                interfaceC1558h2.p(((InterfaceC1499q) ((C1615w) abstractC1530c).t).apply(d));
                return;
            case 2:
                interfaceC1558h2.accept(((C1502u) ((InterfaceC1504w) ((C1619x) abstractC1530c).t)).a(d));
                return;
            case 3:
                interfaceC1558h2.accept(((InterfaceC1507z) ((C1623y) abstractC1530c).t).applyAsLong(d));
                return;
            case 4:
                G g = (G) ((InterfaceC1499q) ((C1611v) abstractC1530c).t).apply(d);
                if (g != null) {
                    try {
                        g.sequential().J(new C1603t(1, this));
                    } catch (Throwable th) {
                        try {
                            g.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (g != null) {
                    g.close();
                    return;
                }
                return;
            case 5:
                if (((j$.util.function.r) ((InterfaceC1501t) ((C1611v) abstractC1530c).t)).e(d)) {
                    interfaceC1558h2.accept(d);
                    return;
                }
                return;
            default:
                ((InterfaceC1494n) ((C1611v) abstractC1530c).t).accept(d);
                interfaceC1558h2.accept(d);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1558h2
    public final void f(long j) {
        int i = this.b;
        InterfaceC1558h2 interfaceC1558h2 = this.a;
        switch (i) {
            case 4:
                interfaceC1558h2.f(-1L);
                break;
            case 5:
                interfaceC1558h2.f(-1L);
                break;
            default:
                interfaceC1558h2.f(j);
                break;
        }
    }
}
